package com.mp4parser.muxer;

import java.io.IOException;
import java.nio.ByteBuffer;

import static com.mp4parser.tools.CastUtils.l2i;

/**
 * Typically used for tests.
 */
public class InMemRandomAccessSourceImpl implements RandomAccessSource {
    ByteBuffer buffer;

    public InMemRandomAccessSourceImpl(ByteBuffer buffer) {
        this.buffer = buffer.duplicate();
    }

    public InMemRandomAccessSourceImpl(byte[] b) {
        buffer = ByteBuffer.wrap(b);
    }

    public synchronized ByteBuffer get(long offset, long size) throws IOException {
        buffer.position(l2i(offset));
        return (ByteBuffer) buffer.slice().limit(l2i(size));
    }
}
