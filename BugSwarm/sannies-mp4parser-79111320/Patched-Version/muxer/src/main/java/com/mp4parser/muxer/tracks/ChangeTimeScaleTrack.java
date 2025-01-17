/*
 * Copyright 2012 Sebastian Annies, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mp4parser.muxer.tracks;

import com.mp4parser.boxes.iso14496.part12.CompositionTimeToSample;
import com.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox;
import com.mp4parser.boxes.iso14496.part12.SampleDescriptionBox;
import com.mp4parser.boxes.iso14496.part12.SubSampleInformationBox;
import com.mp4parser.muxer.Edit;
import com.mp4parser.muxer.Sample;
import com.mp4parser.muxer.Track;
import com.mp4parser.muxer.TrackMetaData;
import com.mp4parser.boxes.samplegrouping.GroupEntry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Changes the timescale of a track by wrapping the track.
 */
public class ChangeTimeScaleTrack implements Track {
    private static final Logger LOG = Logger.getLogger(ChangeTimeScaleTrack.class.getName());

    Track source;
    List<CompositionTimeToSample.Entry> ctts;
    long[] decodingTimes;
    long timeScale;

    /**
     * Changes the time scale of the source track to the target time scale and makes sure
     * that any rounding errors that may have summed are corrected exactly before the syncSamples.
     *
     * @param source          the source track
     * @param targetTimeScale the resulting time scale of this track.
     * @param syncSamples     at these sync points where rounding error are corrected.
     */
    public ChangeTimeScaleTrack(Track source, long targetTimeScale, long[] syncSamples) {
        this.source = source;
        this.timeScale = targetTimeScale;
        double timeScaleFactor = (double) targetTimeScale / source.getTrackMetaData().getTimescale();
        ctts = adjustCtts(source.getCompositionTimeEntries(), timeScaleFactor);
        decodingTimes = adjustTts(source.getSampleDurations(), timeScaleFactor, syncSamples, getTimes(source, syncSamples, targetTimeScale));
    }

    private static long[] getTimes(Track track, long[] syncSamples, long targetTimeScale) {
        long[] syncSampleTimes = new long[syncSamples.length];

        int currentSample = 1;  // first syncsample is 1
        long currentDuration = 0;
        int currentSyncSampleIndex = 0;


        while (currentSample <= syncSamples[syncSamples.length - 1]) {
            if (currentSample == syncSamples[currentSyncSampleIndex]) {
                syncSampleTimes[currentSyncSampleIndex++] = (currentDuration * targetTimeScale) / track.getTrackMetaData().getTimescale();
            }
            currentDuration += track.getSampleDurations()[currentSample - 1];
            currentSample++;
        }
        return syncSampleTimes;

    }

    /**
     * Adjusting the composition times is easy. Just scale it by the factor - that's it. There is no rounding
     * error summing up.
     *
     * @param source
     * @param timeScaleFactor
     * @return
     */
    static List<CompositionTimeToSample.Entry> adjustCtts(List<CompositionTimeToSample.Entry> source, double timeScaleFactor) {
        if (source != null) {
            List<CompositionTimeToSample.Entry> entries2 = new ArrayList<CompositionTimeToSample.Entry>(source.size());
            for (CompositionTimeToSample.Entry entry : source) {
                entries2.add(new CompositionTimeToSample.Entry(entry.getCount(), (int) Math.round(timeScaleFactor * entry.getOffset())));
            }
            return entries2;
        } else {
            return null;
        }
    }

    static long[] adjustTts(long[] sourceArray, double timeScaleFactor, long[] syncSample, long[] syncSampleTimes) {


        long summedDurations = 0;

        long[] scaledArray = new long[sourceArray.length];

        for (int i = 1; i <= sourceArray.length; i++) {
            long duration = sourceArray[i - 1];

            long x = Math.round(timeScaleFactor * duration);

            int ssIndex;
            if ((ssIndex = Arrays.binarySearch(syncSample, i + 1)) >= 0) {
                // we are at the sample before sync point
                if (syncSampleTimes[ssIndex] != summedDurations) {
                    long correction = syncSampleTimes[ssIndex] - (summedDurations + x);
                    LOG.finest(String.format("Sample %d %d / %d - correct by %d", i, summedDurations, syncSampleTimes[ssIndex], correction));
                    x += correction;
                }
            }
            summedDurations += x;
            scaledArray[i - 1] = x;
        }
        return scaledArray;
    }

    public void close() throws IOException {
        source.close();
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return source.getSampleDescriptionBox();
    }

    public long[] getSampleDurations() {
        return decodingTimes;
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return ctts;
    }

    public long[] getSyncSamples() {
        return source.getSyncSamples();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return source.getSampleDependencies();
    }

    public TrackMetaData getTrackMetaData() {
        TrackMetaData trackMetaData = (TrackMetaData) source.getTrackMetaData().clone();
        trackMetaData.setTimescale(timeScale);
        return trackMetaData;
    }

    public String getHandler() {
        return source.getHandler();
    }

    public List<Sample> getSamples() {
        return source.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return source.getSubsampleInformationBox();
    }

    public long getDuration() {
        long duration = 0;
        for (long delta : decodingTimes) {
            duration += delta;
        }
        return duration;
    }

    @Override
    public String toString() {
        return "ChangeTimeScaleTrack{" +
                "source=" + source +
                '}';
    }

    public String getName() {
        return "timeScale(" + source.getName() + ")";
    }

    public List<Edit> getEdits() {
        return source.getEdits();
    }

    public Map<GroupEntry, long[]> getSampleGroups() {
        return source.getSampleGroups();
    }
}
