package kotlin.comparisons;

import androidx.appcompat.R;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��B\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\"\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001��¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010��\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001��¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010��\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010��\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001��¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010��\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001��¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010��\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001��¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010��\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001��¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010��\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010��\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001��¢\u0006\u0004\b \u0010!\u001a&\u0010��\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001��¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b&\u0010\u0005\u001a+\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001��¢\u0006\u0004\b'\u0010\b\u001a&\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b(\u0010\f\u001a\"\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001��¢\u0006\u0004\b)\u0010\u000f\u001a+\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001��¢\u0006\u0004\b*\u0010\u0011\u001a&\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001��¢\u0006\u0004\b+\u0010\u0014\u001a\"\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001��¢\u0006\u0004\b,\u0010\u0017\u001a+\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001��¢\u0006\u0004\b-\u0010\u0019\u001a&\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001��¢\u0006\u0004\b.\u0010\u001c\u001a\"\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001��¢\u0006\u0004\b/\u0010\u001f\u001a+\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001��¢\u0006\u0004\b0\u0010!\u001a&\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001��¢\u0006\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: ItsOnFire.jar:kotlin/comparisons/UComparisonsKt___UComparisonsKt.class */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-5PvTz6A  reason: not valid java name */
    public static final short m7075maxOf5PvTz6A(short s2, short s3) {
        return Intrinsics.compare(s2 & 65535, 65535 & s3) >= 0 ? s2 : s3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-J1ME1BU  reason: not valid java name */
    public static int m7076maxOfJ1ME1BU(int i2, int i3) {
        if (UnsignedKt.uintCompare(i2, i3) < 0) {
            i2 = i3;
        }
        return i2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-Kr8caGY  reason: not valid java name */
    public static final byte m7077maxOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, b3 & 255) >= 0 ? b2 : b3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M  reason: not valid java name */
    public static final int m7078maxOfMd2H83M(int i2, @NotNull int... other) {
        int m7076maxOfJ1ME1BU;
        Intrinsics.checkNotNullParameter(other, "other");
        int m6006getSizeimpl = UIntArray.m6006getSizeimpl(other);
        int i3 = i2;
        for (int i4 = 0; i4 < m6006getSizeimpl; i4++) {
            m7076maxOfJ1ME1BU = m7076maxOfJ1ME1BU(i3, UIntArray.m6005getpVg5ArA(other, i4));
            i3 = m7076maxOfJ1ME1BU;
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM  reason: not valid java name */
    public static final long m7079maxOfR03FKyM(long j2, @NotNull long... other) {
        long m7084maxOfeb3DHEI;
        Intrinsics.checkNotNullParameter(other, "other");
        int m6085getSizeimpl = ULongArray.m6085getSizeimpl(other);
        for (int i2 = 0; i2 < m6085getSizeimpl; i2++) {
            m7084maxOfeb3DHEI = m7084maxOfeb3DHEI(j2, ULongArray.m6084getsVKNKU(other, i2));
            j2 = m7084maxOfeb3DHEI;
        }
        return j2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ  reason: not valid java name */
    private static final short m7080maxOfVKSA0NQ(short s2, short s3, short s4) {
        return m7075maxOf5PvTz6A(s2, m7075maxOf5PvTz6A(s3, s4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA  reason: not valid java name */
    private static final int m7081maxOfWZ9TVnA(int i2, int i3, int i4) {
        int m7076maxOfJ1ME1BU;
        int m7076maxOfJ1ME1BU2;
        m7076maxOfJ1ME1BU = m7076maxOfJ1ME1BU(i3, i4);
        m7076maxOfJ1ME1BU2 = m7076maxOfJ1ME1BU(i2, m7076maxOfJ1ME1BU);
        return m7076maxOfJ1ME1BU2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8  reason: not valid java name */
    public static final byte m7082maxOfWr6uiD8(byte b2, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m5927getSizeimpl = UByteArray.m5927getSizeimpl(other);
        byte b3 = b2;
        int i2 = 0;
        while (i2 < m5927getSizeimpl) {
            i2++;
            b3 = m7077maxOfKr8caGY(b3, UByteArray.m5926getw2LRezQ(other, i2));
        }
        return b3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-b33U2AM  reason: not valid java name */
    private static final byte m7083maxOfb33U2AM(byte b2, byte b3, byte b4) {
        return m7077maxOfKr8caGY(b2, m7077maxOfKr8caGY(b3, b4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-eb3DHEI  reason: not valid java name */
    public static long m7084maxOfeb3DHEI(long j2, long j3) {
        if (UnsignedKt.ulongCompare(j2, j3) < 0) {
            j2 = j3;
        }
        return j2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-sambcqE  reason: not valid java name */
    private static final long m7085maxOfsambcqE(long j2, long j3, long j4) {
        long m7084maxOfeb3DHEI;
        long m7084maxOfeb3DHEI2;
        m7084maxOfeb3DHEI = m7084maxOfeb3DHEI(j3, j4);
        m7084maxOfeb3DHEI2 = m7084maxOfeb3DHEI(j2, m7084maxOfeb3DHEI);
        return m7084maxOfeb3DHEI2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4  reason: not valid java name */
    public static final short m7086maxOft1qELG4(short s2, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m6191getSizeimpl = UShortArray.m6191getSizeimpl(other);
        short s3 = s2;
        int i2 = 0;
        while (i2 < m6191getSizeimpl) {
            i2++;
            s3 = m7075maxOf5PvTz6A(s3, UShortArray.m6190getMh2AYeg(other, i2));
        }
        return s3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-5PvTz6A  reason: not valid java name */
    public static final short m7087minOf5PvTz6A(short s2, short s3) {
        return Intrinsics.compare(s2 & 65535, 65535 & s3) <= 0 ? s2 : s3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-J1ME1BU  reason: not valid java name */
    public static int m7088minOfJ1ME1BU(int i2, int i3) {
        if (UnsignedKt.uintCompare(i2, i3) > 0) {
            i2 = i3;
        }
        return i2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-Kr8caGY  reason: not valid java name */
    public static final byte m7089minOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, b3 & 255) <= 0 ? b2 : b3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M  reason: not valid java name */
    public static final int m7090minOfMd2H83M(int i2, @NotNull int... other) {
        int m7088minOfJ1ME1BU;
        Intrinsics.checkNotNullParameter(other, "other");
        int m6006getSizeimpl = UIntArray.m6006getSizeimpl(other);
        int i3 = i2;
        for (int i4 = 0; i4 < m6006getSizeimpl; i4++) {
            m7088minOfJ1ME1BU = m7088minOfJ1ME1BU(i3, UIntArray.m6005getpVg5ArA(other, i4));
            i3 = m7088minOfJ1ME1BU;
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM  reason: not valid java name */
    public static final long m7091minOfR03FKyM(long j2, @NotNull long... other) {
        long m7096minOfeb3DHEI;
        Intrinsics.checkNotNullParameter(other, "other");
        int m6085getSizeimpl = ULongArray.m6085getSizeimpl(other);
        for (int i2 = 0; i2 < m6085getSizeimpl; i2++) {
            m7096minOfeb3DHEI = m7096minOfeb3DHEI(j2, ULongArray.m6084getsVKNKU(other, i2));
            j2 = m7096minOfeb3DHEI;
        }
        return j2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ  reason: not valid java name */
    private static final short m7092minOfVKSA0NQ(short s2, short s3, short s4) {
        return m7087minOf5PvTz6A(s2, m7087minOf5PvTz6A(s3, s4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA  reason: not valid java name */
    private static final int m7093minOfWZ9TVnA(int i2, int i3, int i4) {
        int m7088minOfJ1ME1BU;
        int m7088minOfJ1ME1BU2;
        m7088minOfJ1ME1BU = m7088minOfJ1ME1BU(i3, i4);
        m7088minOfJ1ME1BU2 = m7088minOfJ1ME1BU(i2, m7088minOfJ1ME1BU);
        return m7088minOfJ1ME1BU2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8  reason: not valid java name */
    public static final byte m7094minOfWr6uiD8(byte b2, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m5927getSizeimpl = UByteArray.m5927getSizeimpl(other);
        byte b3 = b2;
        int i2 = 0;
        while (i2 < m5927getSizeimpl) {
            i2++;
            b3 = m7089minOfKr8caGY(b3, UByteArray.m5926getw2LRezQ(other, i2));
        }
        return b3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-b33U2AM  reason: not valid java name */
    private static final byte m7095minOfb33U2AM(byte b2, byte b3, byte b4) {
        return m7089minOfKr8caGY(b2, m7089minOfKr8caGY(b3, b4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-eb3DHEI  reason: not valid java name */
    public static long m7096minOfeb3DHEI(long j2, long j3) {
        if (UnsignedKt.ulongCompare(j2, j3) > 0) {
            j2 = j3;
        }
        return j2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-sambcqE  reason: not valid java name */
    private static final long m7097minOfsambcqE(long j2, long j3, long j4) {
        long m7096minOfeb3DHEI;
        long m7096minOfeb3DHEI2;
        m7096minOfeb3DHEI = m7096minOfeb3DHEI(j3, j4);
        m7096minOfeb3DHEI2 = m7096minOfeb3DHEI(j2, m7096minOfeb3DHEI);
        return m7096minOfeb3DHEI2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4  reason: not valid java name */
    public static final short m7098minOft1qELG4(short s2, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m6191getSizeimpl = UShortArray.m6191getSizeimpl(other);
        short s3 = s2;
        int i2 = 0;
        while (i2 < m6191getSizeimpl) {
            i2++;
            s3 = m7087minOf5PvTz6A(s3, UShortArray.m6190getMh2AYeg(other, i2));
        }
        return s3;
    }
}
