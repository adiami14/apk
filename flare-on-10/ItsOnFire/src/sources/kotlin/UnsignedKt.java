package kotlin;

import androidx.appcompat.R;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��0\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001��¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001��¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001��¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001��¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001��¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H��\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmName(name = "UnsignedKt")
/* loaded from: ItsOnFire.jar:kotlin/UnsignedKt.class */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d2) {
        int i2 = -1;
        if (Double.isNaN(d2) || d2 <= uintToDouble(0)) {
            i2 = 0;
        } else if (d2 < uintToDouble(-1)) {
            i2 = UInt.m5946constructorimpl(d2 <= 2.147483647E9d ? (int) d2 : UInt.m5946constructorimpl((int) (d2 - Integer.MAX_VALUE)) + UInt.m5946constructorimpl(Integer.MAX_VALUE));
        }
        return i2;
    }

    @PublishedApi
    public static final long doubleToULong(double d2) {
        long j2 = -1;
        if (Double.isNaN(d2) || d2 <= ulongToDouble(0L)) {
            j2 = 0;
        } else if (d2 < ulongToDouble(-1L)) {
            j2 = ULong.m6025constructorimpl(d2 < 9.223372036854776E18d ? (long) d2 : ULong.m6025constructorimpl((long) (d2 - 9.223372036854776E18d)) - Long.MIN_VALUE);
        }
        return j2;
    }

    @PublishedApi
    public static final int uintCompare(int i2, int i3) {
        return Intrinsics.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU  reason: not valid java name */
    public static final int m6203uintDivideJ1ME1BU(int i2, int i3) {
        return UInt.m5946constructorimpl((int) ((i2 & 4294967295L) / (i3 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU  reason: not valid java name */
    public static final int m6204uintRemainderJ1ME1BU(int i2, int i3) {
        return UInt.m5946constructorimpl((int) ((i2 & 4294967295L) % (i3 & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i2) {
        return (Integer.MAX_VALUE & i2) + (((i2 >>> 31) << 30) * 2);
    }

    @PublishedApi
    public static final int ulongCompare(long j2, long j3) {
        return Intrinsics.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI  reason: not valid java name */
    public static final long m6205ulongDivideeb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return ulongCompare(j2, j3) < 0 ? ULong.m6025constructorimpl(0L) : ULong.m6025constructorimpl(1L);
        } else if (j2 >= 0) {
            return ULong.m6025constructorimpl(j2 / j3);
        } else {
            int i2 = 1;
            long j4 = ((j2 >>> 1) / j3) << 1;
            if (ulongCompare(ULong.m6025constructorimpl(j2 - (j4 * j3)), ULong.m6025constructorimpl(j3)) < 0) {
                i2 = 0;
            }
            return ULong.m6025constructorimpl(j4 + i2);
        }
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI  reason: not valid java name */
    public static final long m6206ulongRemaindereb3DHEI(long j2, long j3) {
        long j4;
        if (j3 < 0) {
            if (ulongCompare(j2, j3) >= 0) {
                j2 = ULong.m6025constructorimpl(j2 - j3);
            }
            return j2;
        }
        if (j2 >= 0) {
            j4 = j2 % j3;
        } else {
            long j5 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
            if (ulongCompare(ULong.m6025constructorimpl(j5), ULong.m6025constructorimpl(j3)) < 0) {
                j3 = 0;
            }
            j4 = j5 - j3;
        }
        return ULong.m6025constructorimpl(j4);
    }

    @PublishedApi
    public static final double ulongToDouble(long j2) {
        return ((j2 >>> 11) * 2048) + (j2 & 2047);
    }

    @NotNull
    public static final String ulongToString(long j2) {
        return ulongToString(j2, 10);
    }

    @NotNull
    public static final String ulongToString(long j2, int i2) {
        int checkRadix;
        int checkRadix2;
        int checkRadix3;
        if (j2 >= 0) {
            checkRadix3 = CharsKt__CharJVMKt.checkRadix(i2);
            String l2 = Long.toString(j2, checkRadix3);
            Intrinsics.checkNotNullExpressionValue(l2, "toString(this, checkRadix(radix))");
            return l2;
        }
        long j3 = i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        long j6 = j4;
        long j7 = j5;
        if (j5 >= j3) {
            j7 = j5 - j3;
            j6 = j4 + 1;
        }
        StringBuilder sb = new StringBuilder();
        checkRadix = CharsKt__CharJVMKt.checkRadix(i2);
        String l3 = Long.toString(j6, checkRadix);
        Intrinsics.checkNotNullExpressionValue(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        checkRadix2 = CharsKt__CharJVMKt.checkRadix(i2);
        String l4 = Long.toString(j7, checkRadix2);
        Intrinsics.checkNotNullExpressionValue(l4, "toString(this, checkRadix(radix))");
        sb.append(l4);
        return sb.toString();
    }
}
