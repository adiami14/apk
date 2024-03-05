package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/ByteStreams.class */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    /* loaded from: ItsOnFire.jar:com/google/firebase/messaging/ByteStreams$LimitedInputStream.class */
    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream inputStream, long j2) {
            super(inputStream);
            this.mark = -1L;
            this.left = j2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public void mark(int i2) {
            synchronized (this) {
                ((FilterInputStream) this).in.mark(i2);
                this.mark = this.left;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.left--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            long j2 = this.left;
            if (j2 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j2));
            if (read != -1) {
                this.left -= read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public void reset() throws IOException {
            synchronized (this) {
                if (!((FilterInputStream) this).in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.mark == -1) {
                    throw new IOException("Mark not set");
                }
                ((FilterInputStream) this).in.reset();
                this.left = this.mark;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j2, this.left));
            this.left -= skip;
            return skip;
        }
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i2) {
            return remove;
        }
        int length = i2 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i2);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream inputStream, long j2) {
        return new LimitedInputStream(inputStream, j2);
    }

    private static int saturatedCast(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i2) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i2) * 2));
        while (true) {
            int i3 = min;
            if (i2 >= MAX_ARRAY_LEN) {
                if (inputStream.read() == -1) {
                    return combineBuffers(queue, MAX_ARRAY_LEN);
                }
                throw new OutOfMemoryError("input is too large to fit in a byte array");
            }
            int min2 = Math.min(i3, MAX_ARRAY_LEN - i2);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i4 = 0;
            while (i4 < min2) {
                int read = inputStream.read(bArr, i4, min2 - i4);
                if (read == -1) {
                    return combineBuffers(queue, i2);
                }
                i4 += read;
                i2 += read;
            }
            min = saturatedCast(i3 * (i3 < 4096 ? 4 : 2));
        }
    }
}
