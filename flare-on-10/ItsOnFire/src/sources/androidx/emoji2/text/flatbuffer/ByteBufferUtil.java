package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/ByteBufferUtil.class */
public class ByteBufferUtil {
    public static int getSizePrefix(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer removeSizePrefix(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}
