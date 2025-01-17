package com.mp4parser.tools.boxes;

import com.mp4parser.IsoFile;
import com.mp4parser.boxes.iso14496.part12.FreeBox;
import com.mp4parser.boxes.iso14496.part12.FreeSpaceBox;
import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

public class FreeBoxTest {
    @Test
    public void testInOutNoChange() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FreeBox fb = new FreeBox(1000);
        ByteBuffer data = fb.getData();
        data.rewind();
        data.put(new byte[]{1, 2, 3, 4, 5, 6});
        fb.getBox(Channels.newChannel(baos));
        Assert.assertEquals(baos.toByteArray()[8], 1);
        Assert.assertEquals(baos.toByteArray()[9], 2);
        Assert.assertEquals(baos.toByteArray()[10], 3);
        Assert.assertEquals(baos.toByteArray()[11], 4);
    }

    @Test
    public void tesAddAndReplace() throws IOException {

        FreeBox fb = new FreeBox(1000);
        long startSize = fb.getSize();
        ByteBuffer data = fb.getData();
        data.position(994);
        data.put(new byte[]{1, 2, 3, 4, 5, 6});
        FreeSpaceBox fsb = new FreeSpaceBox();
        fsb.setData(new byte[100]);
        fb.addAndReplace(fsb);
        File f = File.createTempFile(this.getClass().getSimpleName(), "");
        f.deleteOnExit();
        FileChannel fc = new FileOutputStream(f).getChannel();
        fb.getBox(fc);
        fc.close();

        IsoFile isoFile = new IsoFile(new FileInputStream(f).getChannel());
        Assert.assertEquals(2, isoFile.getBoxes().size());
        Assert.assertEquals(FreeSpaceBox.TYPE, isoFile.getBoxes().get(0).getType());
        Assert.assertEquals(FreeBox.TYPE, isoFile.getBoxes().get(1).getType());
        Assert.assertEquals(startSize, isoFile.getBoxes().get(0).getSize() + isoFile.getBoxes().get(1).getSize());
    }
}
