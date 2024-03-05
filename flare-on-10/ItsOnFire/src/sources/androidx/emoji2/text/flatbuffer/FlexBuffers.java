package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers.class */
public class FlexBuffers {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Blob.class */
    public static class Blob extends Sized {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.bb.data());
            wrap.position(this.end);
            wrap.limit(this.end + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i2) {
            return this.bb.get(this.end + i2);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i2 = 0; i2 < size; i2++) {
                bArr[i2] = this.bb.get(this.end + i2);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.bb.getString(this.end, size()));
            sb.append('\"');
            return sb;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$FlexBufferException.class */
    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Key.class */
    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b2;
            byte b3;
            int i2 = this.end;
            int i3 = 0;
            do {
                b2 = this.bb.get(i2);
                b3 = bArr[i3];
                if (b2 == 0) {
                    return b2 - b3;
                }
                i2++;
                i3++;
                if (i3 == bArr.length) {
                    return b2 - b3;
                }
            } while (b2 == b3);
            return b2 - b3;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                boolean z = false;
                if (key.end == this.end) {
                    z = false;
                    if (key.byteWidth == this.byteWidth) {
                        z = true;
                    }
                }
                return z;
            }
            return false;
        }

        public int hashCode() {
            return this.byteWidth ^ this.end;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i2 = this.end;
            while (this.bb.get(i2) != 0) {
                i2++;
            }
            int i3 = this.end;
            return this.bb.getString(i3, i2 - i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$KeyVector.class */
    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i2) {
            if (i2 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i3 = typedVector.end;
            int i4 = typedVector.byteWidth;
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i3 + (i2 * i4), typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i2 = 0; i2 < this.vec.size(); i2++) {
                this.vec.get(i2).toString(sb);
                if (i2 != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Map.class */
    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                int compareTo = keyVector.get(i3).compareTo(bArr);
                if (compareTo < 0) {
                    i2 = i3 + 1;
                } else if (compareTo <= 0) {
                    return i3;
                } else {
                    size = i3 - 1;
                }
            }
            return -(i2 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int binarySearch = binarySearch(keys, bArr);
            return (binarySearch < 0 || binarySearch >= size) ? Reference.NULL_REFERENCE : get(binarySearch);
        }

        public KeyVector keys() {
            int i2 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.bb;
            int indirect = FlexBuffers.indirect(readBuf, i2, this.byteWidth);
            ReadBuf readBuf2 = this.bb;
            int i3 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, indirect, FlexBuffers.readInt(readBuf2, i2 + i3, i3), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('\"');
                sb.append(keys.get(i2).toString());
                sb.append("\" : ");
                sb.append(values.get(i2).toString());
                if (i2 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.bb, this.end, this.byteWidth);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Object.class */
    public static abstract class Object {
        public ReadBuf bb;
        public int byteWidth;
        public int end;

        public Object(ReadBuf readBuf, int i2, int i3) {
            this.bb = readBuf;
            this.end = i2;
            this.byteWidth = i3;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Reference.class */
    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);
        private ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i2, int i3, int i4) {
            this(readBuf, i2, i3, 1 << (i4 & 3), i4 >> 2);
        }

        public Reference(ReadBuf readBuf, int i2, int i3, int i4, int i5) {
            this.bb = readBuf;
            this.end = i2;
            this.parentWidth = i3;
            this.byteWidth = i4;
            this.type = i5;
        }

        public Blob asBlob() {
            if (isBlob() || isString()) {
                ReadBuf readBuf = this.bb;
                return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Blob.empty();
        }

        public boolean asBoolean() {
            boolean z = true;
            if (!isBoolean()) {
                return asUInt() != 0;
            }
            if (this.bb.get(this.end) == 0) {
                z = false;
            }
            return z;
        }

        public double asFloat() {
            int i2 = this.type;
            if (i2 == 3) {
                return FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 5) {
                        return Double.parseDouble(asString());
                    }
                    if (i2 == 6) {
                        ReadBuf readBuf = this.bb;
                        return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                    } else if (i2 == 7) {
                        ReadBuf readBuf2 = this.bb;
                        return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                    } else if (i2 == 8) {
                        ReadBuf readBuf3 = this.bb;
                        return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    } else if (i2 == 10) {
                        return asVector().size();
                    } else {
                        if (i2 != 26) {
                            return 0.0d;
                        }
                    }
                }
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i2 = this.type;
            if (i2 == 1) {
                return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 == 6) {
                            ReadBuf readBuf = this.bb;
                            return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                        } else if (i2 == 7) {
                            ReadBuf readBuf2 = this.bb;
                            return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
                        } else if (i2 == 8) {
                            ReadBuf readBuf3 = this.bb;
                            return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                        } else if (i2 != 10) {
                            if (i2 != 26) {
                                return 0;
                            }
                            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                        } else {
                            return asVector().size();
                        }
                    }
                    return Integer.parseInt(asString());
                }
                return (int) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            return (int) FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (isKey()) {
                ReadBuf readBuf = this.bb;
                return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Key.empty();
        }

        public long asLong() {
            int i2 = this.type;
            if (i2 == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 5) {
                        try {
                            return Long.parseLong(asString());
                        } catch (NumberFormatException e2) {
                            return 0L;
                        }
                    } else if (i2 == 6) {
                        ReadBuf readBuf = this.bb;
                        return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                    } else if (i2 == 7) {
                        ReadBuf readBuf2 = this.bb;
                        return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
                    } else if (i2 == 8) {
                        ReadBuf readBuf3 = this.bb;
                        return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    } else if (i2 != 10) {
                        if (i2 != 26) {
                            return 0L;
                        }
                        return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                    } else {
                        return asVector().size();
                    }
                }
                return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (isMap()) {
                ReadBuf readBuf = this.bb;
                return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Map.empty();
        }

        public String asString() {
            ReadBuf readBuf;
            int i2;
            int i3;
            if (isString()) {
                i2 = FlexBuffers.indirect(this.bb, this.end, this.parentWidth);
                ReadBuf readBuf2 = this.bb;
                int i4 = this.byteWidth;
                i3 = (int) FlexBuffers.readUInt(readBuf2, i2 - i4, i4);
                readBuf = this.bb;
            } else if (!isKey()) {
                return "";
            } else {
                int indirect = FlexBuffers.indirect(this.bb, this.end, this.byteWidth);
                int i5 = indirect;
                while (this.bb.get(i5) != 0) {
                    i5++;
                }
                readBuf = this.bb;
                i2 = indirect;
                i3 = i5 - indirect;
            }
            return readBuf.getString(i2, i3);
        }

        public long asUInt() {
            int i2 = this.type;
            if (i2 == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 10) {
                        if (i2 != 26) {
                            if (i2 != 5) {
                                if (i2 == 6) {
                                    ReadBuf readBuf = this.bb;
                                    return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                                } else if (i2 == 7) {
                                    ReadBuf readBuf2 = this.bb;
                                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                                } else if (i2 != 8) {
                                    return 0L;
                                } else {
                                    ReadBuf readBuf3 = this.bb;
                                    return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
                                }
                            }
                            return Long.parseLong(asString());
                        }
                        return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                    }
                    return asVector().size();
                }
                return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i2 = this.type;
            if (i2 == 15) {
                ReadBuf readBuf2 = this.bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            } else if (FlexBuffers.isTypedVector(i2)) {
                ReadBuf readBuf3 = this.bb;
                return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
            } else {
                return Vector.empty();
            }
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isFloat() {
            int i2 = this.type;
            return i2 == 3 || i2 == 8;
        }

        public boolean isInt() {
            int i2 = this.type;
            boolean z = true;
            if (i2 != 1) {
                z = i2 == 6;
            }
            return z;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i2 = this.type;
            return i2 == 2 || i2 == 7;
        }

        public boolean isVector() {
            int i2 = this.type;
            return i2 == 10 || i2 == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public StringBuilder toString(StringBuilder sb) {
            int i2 = this.type;
            if (i2 != 36) {
                switch (i2) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append('\"');
                        StringBuilder key = asKey.toString(sb);
                        key.append('\"');
                        return key;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Sized.class */
    public static abstract class Sized extends Object {
        public final int size;

        public Sized(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
            this.size = FlexBuffers.readInt(this.bb, i2 - i3, i3);
        }

        public int size() {
            return this.size;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$TypedVector.class */
    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i2, int i3, int i4) {
            super(readBuf, i2, i3);
            this.elemType = i4;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i2) {
            if (i2 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, this.end + (i2 * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Unsigned.class */
    public static class Unsigned {
        public static int byteToUnsignedInt(byte b2) {
            return b2 & 255;
        }

        public static long intToUnsignedLong(int i2) {
            return i2 & 4294967295L;
        }

        public static int shortToUnsignedInt(short s2) {
            return s2 & 65535;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/flatbuffer/FlexBuffers$Vector.class */
    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i2) {
            long size = size();
            long j2 = i2;
            if (j2 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, this.end + (i2 * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.bb.get((int) (this.end + (size * this.byteWidth) + j2))));
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                get(i2).toString(sb);
                if (i2 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int limit = readBuf.limit() - 1;
        byte b2 = readBuf.get(limit);
        int i2 = limit - 1;
        return new Reference(readBuf, i2 - b2, b2, Unsigned.byteToUnsignedInt(readBuf.get(i2)));
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i2, int i3) {
        return (int) (i2 - readUInt(readBuf, i2, i3));
    }

    public static boolean isTypeInline(int i2) {
        return i2 <= 3 || i2 == 26;
    }

    public static boolean isTypedVector(int i2) {
        return (i2 >= 11 && i2 <= 15) || i2 == 36;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r3 > 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isTypedVectorElementType(int r3) {
        /*
            r0 = 1
            r4 = r0
            r0 = r3
            r1 = 1
            if (r0 < r1) goto Le
            r0 = r4
            r5 = r0
            r0 = r3
            r1 = 4
            if (r0 <= r1) goto L1b
        Le:
            r0 = r3
            r1 = 26
            if (r0 != r1) goto L19
            r0 = r4
            r5 = r0
            goto L1b
        L19:
            r0 = 0
            r5 = r0
        L1b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVectorElementType(int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i2, int i3) {
        if (i3 != 4) {
            if (i3 != 8) {
                return -1.0d;
            }
            return readBuf.getDouble(i2);
        }
        return readBuf.getFloat(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i2, int i3) {
        return (int) readLong(readBuf, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i2, int i3) {
        short s2;
        if (i3 == 1) {
            s2 = readBuf.get(i2);
        } else if (i3 == 2) {
            s2 = readBuf.getShort(i2);
        } else if (i3 != 4) {
            if (i3 != 8) {
                return -1L;
            }
            return readBuf.getLong(i2);
        } else {
            s2 = readBuf.getInt(i2);
        }
        return s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i2, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        return -1L;
                    }
                    return readBuf.getLong(i2);
                }
                return Unsigned.intToUnsignedLong(readBuf.getInt(i2));
            }
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i2));
        }
        return Unsigned.byteToUnsignedInt(readBuf.get(i2));
    }

    public static int toTypedVector(int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return 0;
                    }
                    return (i2 - 1) + 22;
                }
                return (i2 - 1) + 19;
            }
            return (i2 - 1) + 16;
        }
        return (i2 - 1) + 11;
    }

    public static int toTypedVectorElementType(int i2) {
        return (i2 - 11) + 1;
    }
}
