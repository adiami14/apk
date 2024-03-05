package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/Table.class */
public class Table {
    public ByteBuffer bb;
    public int bb_pos;
    public Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (str.charAt(i2) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i2))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public static int __indirect(int i2, ByteBuffer byteBuffer) {
        return i2 + byteBuffer.getInt(i2);
    }

    public static int __offset(int i2, int i3, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i3;
        return byteBuffer.getShort((i2 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    public static String __string(int i2, ByteBuffer byteBuffer, Utf8 utf8) {
        int i3 = i2 + byteBuffer.getInt(i2);
        return utf8.decodeUtf8(byteBuffer, i3 + 4, byteBuffer.getInt(i3));
    }

    public static Table __union(Table table, int i2, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i2, byteBuffer), byteBuffer);
        return table;
    }

    public static int compareStrings(int i2, int i3, ByteBuffer byteBuffer) {
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = i3 + byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = byteBuffer.getInt(i5);
        int min = Math.min(i6, i7);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = i8 + i4 + 4;
            byte b2 = byteBuffer.get(i9);
            int i10 = i8 + i5 + 4;
            if (b2 != byteBuffer.get(i10)) {
                return byteBuffer.get(i9) - byteBuffer.get(i10);
            }
        }
        return i6 - i7;
    }

    public static int compareStrings(int i2, byte[] bArr, ByteBuffer byteBuffer) {
        int i3 = i2 + byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i3);
        int length = bArr.length;
        int min = Math.min(i4, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i3 + 4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i4 - length;
    }

    public int __indirect(int i2) {
        return i2 + this.bb.getInt(i2);
    }

    public int __offset(int i2) {
        return i2 < this.vtable_size ? this.bb.getShort(this.vtable_start + i2) : (short) 0;
    }

    public void __reset() {
        __reset(0, null);
    }

    public void __reset(int i2, ByteBuffer byteBuffer) {
        short s2;
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.vtable_start = i3;
            s2 = this.bb.getShort(i3);
        } else {
            s2 = 0;
            this.bb_pos = 0;
            this.vtable_start = 0;
        }
        this.vtable_size = s2;
    }

    public String __string(int i2) {
        return __string(i2, this.bb, this.utf8);
    }

    public Table __union(Table table, int i2) {
        return __union(table, i2, this.bb);
    }

    public int __vector(int i2) {
        int i3 = i2 + this.bb_pos;
        return i3 + this.bb.getInt(i3) + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i2, int i3) {
        int __offset = __offset(i2);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit(__vector + (__vector_len(__offset) * i3));
        return order;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i2, int i3) {
        int __offset = __offset(i2);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i3) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    public int __vector_len(int i2) {
        int i3 = i2 + this.bb_pos;
        return this.bb.getInt(i3 + this.bb.getInt(i3));
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = numArr[i3].intValue();
        }
    }
}
