package kotlin.ranges;

import androidx.appcompat.R;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010��\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010��\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001��¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010��\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001��¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001��¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001��¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001��¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001��¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001��¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001��¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001��¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001��¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001��¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001��¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001��¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001��¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001��¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001��¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001��¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001��¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001��¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001��¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0005*\u000208H\u0007ø\u0001��¢\u0006\u0002\u0010D\u001a\u0014\u0010C\u001a\u00020\b*\u00020>H\u0007ø\u0001��¢\u0006\u0002\u0010E\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001��\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001��\u001a\u0014\u0010G\u001a\u00020\u0005*\u000208H\u0007ø\u0001��¢\u0006\u0002\u0010D\u001a\u0014\u0010G\u001a\u00020\b*\u00020>H\u0007ø\u0001��¢\u0006\u0002\u0010E\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001��\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001��\u001a\u0015\u0010I\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001��¢\u0006\u0002\u0010J\u001a\u001c\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001��¢\u0006\u0002\u0010L\u001a\u0015\u0010I\u001a\u00020\b*\u00020/H\u0087\bø\u0001��¢\u0006\u0002\u0010M\u001a\u001c\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001��¢\u0006\u0002\u0010N\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001��\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001��\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001��\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001��\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001��¢\u0006\u0004\bU\u0010V\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001��¢\u0006\u0004\bW\u0010X\u001a\u001f\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001��¢\u0006\u0004\bY\u0010Z\u001a\u001f\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001��¢\u0006\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/ranges/URangesKt")
/* loaded from: ItsOnFire.jar:kotlin/ranges/URangesKt___URangesKt.class */
class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-5PvTz6A  reason: not valid java name */
    public static final short m7189coerceAtLeast5PvTz6A(short s2, short s3) {
        short s4 = s2;
        if (Intrinsics.compare(s2 & 65535, 65535 & s3) < 0) {
            s4 = s3;
        }
        return s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-J1ME1BU  reason: not valid java name */
    public static final int m7190coerceAtLeastJ1ME1BU(int i2, int i3) {
        int i4 = i2;
        if (UnsignedKt.uintCompare(i2, i3) < 0) {
            i4 = i3;
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-Kr8caGY  reason: not valid java name */
    public static final byte m7191coerceAtLeastKr8caGY(byte b2, byte b3) {
        byte b4 = b2;
        if (Intrinsics.compare(b2 & 255, b3 & 255) < 0) {
            b4 = b3;
        }
        return b4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-eb3DHEI  reason: not valid java name */
    public static final long m7192coerceAtLeasteb3DHEI(long j2, long j3) {
        long j4 = j2;
        if (UnsignedKt.ulongCompare(j2, j3) < 0) {
            j4 = j3;
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-5PvTz6A  reason: not valid java name */
    public static final short m7193coerceAtMost5PvTz6A(short s2, short s3) {
        short s4 = s2;
        if (Intrinsics.compare(s2 & 65535, 65535 & s3) > 0) {
            s4 = s3;
        }
        return s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-J1ME1BU  reason: not valid java name */
    public static final int m7194coerceAtMostJ1ME1BU(int i2, int i3) {
        int i4 = i2;
        if (UnsignedKt.uintCompare(i2, i3) > 0) {
            i4 = i3;
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-Kr8caGY  reason: not valid java name */
    public static final byte m7195coerceAtMostKr8caGY(byte b2, byte b3) {
        byte b4 = b2;
        if (Intrinsics.compare(b2 & 255, b3 & 255) > 0) {
            b4 = b3;
        }
        return b4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-eb3DHEI  reason: not valid java name */
    public static final long m7196coerceAtMosteb3DHEI(long j2, long j3) {
        long j4 = j2;
        if (UnsignedKt.ulongCompare(j2, j3) > 0) {
            j4 = j3;
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-JPwROB0  reason: not valid java name */
    public static final long m7197coerceInJPwROB0(long j2, @NotNull ClosedRange<ULong> range) {
        long j3;
        ULong endInclusive;
        Comparable coerceIn;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            coerceIn = RangesKt___RangesKt.coerceIn(ULong.m6019boximpl(j2), (ClosedFloatingPointRange<ULong>) ((ClosedFloatingPointRange<Comparable>) range));
            return ((ULong) coerceIn).m6076unboximpl();
        } else if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        } else {
            if (UnsignedKt.ulongCompare(j2, range.getStart().m6076unboximpl()) >= 0) {
                j3 = j2;
                if (UnsignedKt.ulongCompare(j2, range.getEndInclusive().m6076unboximpl()) > 0) {
                    endInclusive = range.getEndInclusive();
                }
                return j3;
            }
            endInclusive = range.getStart();
            j3 = endInclusive.m6076unboximpl();
            return j3;
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-VKSA0NQ  reason: not valid java name */
    public static final short m7198coerceInVKSA0NQ(short s2, short s3, short s4) {
        int i2 = s3 & 65535;
        int i3 = s4 & 65535;
        if (Intrinsics.compare(i2, i3) <= 0) {
            int i4 = 65535 & s2;
            return Intrinsics.compare(i4, i2) < 0 ? s3 : Intrinsics.compare(i4, i3) > 0 ? s4 : s2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m6176toStringimpl(s4)) + " is less than minimum " + ((Object) UShort.m6176toStringimpl(s3)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-WZ9TVnA  reason: not valid java name */
    public static final int m7199coerceInWZ9TVnA(int i2, int i3, int i4) {
        if (UnsignedKt.uintCompare(i3, i4) <= 0) {
            return UnsignedKt.uintCompare(i2, i3) < 0 ? i3 : UnsignedKt.uintCompare(i2, i4) > 0 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m5991toStringimpl(i4)) + " is less than minimum " + ((Object) UInt.m5991toStringimpl(i3)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-b33U2AM  reason: not valid java name */
    public static final byte m7200coerceInb33U2AM(byte b2, byte b3, byte b4) {
        int i2 = b3 & 255;
        int i3 = b4 & 255;
        if (Intrinsics.compare(i2, i3) <= 0) {
            int i4 = b2 & 255;
            return Intrinsics.compare(i4, i2) < 0 ? b3 : Intrinsics.compare(i4, i3) > 0 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m5912toStringimpl(b4)) + " is less than minimum " + ((Object) UByte.m5912toStringimpl(b3)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-sambcqE  reason: not valid java name */
    public static final long m7201coerceInsambcqE(long j2, long j3, long j4) {
        if (UnsignedKt.ulongCompare(j3, j4) <= 0) {
            return UnsignedKt.ulongCompare(j2, j3) < 0 ? j3 : UnsignedKt.ulongCompare(j2, j4) > 0 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m6070toStringimpl(j4)) + " is less than minimum " + ((Object) ULong.m6070toStringimpl(j3)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-wuiCnnA  reason: not valid java name */
    public static final int m7202coerceInwuiCnnA(int i2, @NotNull ClosedRange<UInt> range) {
        int i3;
        UInt endInclusive;
        Comparable coerceIn;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            coerceIn = RangesKt___RangesKt.coerceIn(UInt.m5940boximpl(i2), (ClosedFloatingPointRange<UInt>) ((ClosedFloatingPointRange<Comparable>) range));
            return ((UInt) coerceIn).m5997unboximpl();
        } else if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        } else {
            if (UnsignedKt.uintCompare(i2, range.getStart().m5997unboximpl()) >= 0) {
                i3 = i2;
                if (UnsignedKt.uintCompare(i2, range.getEndInclusive().m5997unboximpl()) > 0) {
                    endInclusive = range.getEndInclusive();
                }
                return i3;
            }
            endInclusive = range.getStart();
            i3 = endInclusive.m5997unboximpl();
            return i3;
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-68kG9v0  reason: not valid java name */
    public static final boolean m7203contains68kG9v0(@NotNull UIntRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m7177containsWZ4Q5Ns(UInt.m5946constructorimpl(b2 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-GYNo2lE  reason: not valid java name */
    private static final boolean m7204containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m7186containsVKZWuLQ(uLong.m6076unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-Gab390E  reason: not valid java name */
    public static final boolean m7205containsGab390E(@NotNull ULongRange contains, int i2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m7186containsVKZWuLQ(ULong.m6025constructorimpl(i2 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ULb-yJY  reason: not valid java name */
    public static final boolean m7206containsULbyJY(@NotNull ULongRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m7186containsVKZWuLQ(ULong.m6025constructorimpl(b2 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ZsK3CEQ  reason: not valid java name */
    public static final boolean m7207containsZsK3CEQ(@NotNull UIntRange contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m7177containsWZ4Q5Ns(UInt.m5946constructorimpl(s2 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-biwQdVI  reason: not valid java name */
    private static final boolean m7208containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m7177containsWZ4Q5Ns(uInt.m5997unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-fz5IDCE  reason: not valid java name */
    public static final boolean m7209containsfz5IDCE(@NotNull UIntRange contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m6025constructorimpl(j2 >>> 32) == 0 && contains.m7177containsWZ4Q5Ns(UInt.m5946constructorimpl((int) j2));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-uhHAxoY  reason: not valid java name */
    public static final boolean m7210containsuhHAxoY(@NotNull ULongRange contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m7186containsVKZWuLQ(ULong.m6025constructorimpl(s2 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-5PvTz6A  reason: not valid java name */
    public static final UIntProgression m7211downTo5PvTz6A(short s2, short s3) {
        return UIntProgression.Companion.m7174fromClosedRangeNkh28Cs(UInt.m5946constructorimpl(s2 & 65535), UInt.m5946constructorimpl(s3 & 65535), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-J1ME1BU  reason: not valid java name */
    public static final UIntProgression m7212downToJ1ME1BU(int i2, int i3) {
        return UIntProgression.Companion.m7174fromClosedRangeNkh28Cs(i2, i3, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-Kr8caGY  reason: not valid java name */
    public static final UIntProgression m7213downToKr8caGY(byte b2, byte b3) {
        return UIntProgression.Companion.m7174fromClosedRangeNkh28Cs(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(b3 & 255), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-eb3DHEI  reason: not valid java name */
    public static final ULongProgression m7214downToeb3DHEI(long j2, long j3) {
        return ULongProgression.Companion.m7183fromClosedRange7ftBX0g(j2, j3, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
        }
        return uIntProgression.m7172getFirstpVg5ArA();
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
        }
        return uLongProgression.m7181getFirstsVKNKU();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt firstOrNull(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return uIntProgression.isEmpty() ? null : UInt.m5940boximpl(uIntProgression.m7172getFirstpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong firstOrNull(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return uLongProgression.isEmpty() ? null : ULong.m6019boximpl(uLongProgression.m7181getFirstsVKNKU());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
        }
        return uIntProgression.m7173getLastpVg5ArA();
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
        }
        return uLongProgression.m7182getLastsVKNKU();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt lastOrNull(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return uIntProgression.isEmpty() ? null : UInt.m5940boximpl(uIntProgression.m7173getLastpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong lastOrNull(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return uLongProgression.isEmpty() ? null : ULong.m6019boximpl(uLongProgression.m7182getLastsVKNKU());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return random(uIntRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int random(@NotNull UIntRange uIntRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return random(uLongRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long random(@NotNull ULongRange uLongRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return randomOrNull(uIntRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt randomOrNull(@NotNull UIntRange uIntRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m5940boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return randomOrNull(uLongRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong randomOrNull(@NotNull ULongRange uLongRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m6019boximpl(URandomKt.nextULong(random, uLongRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression reversed(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.Companion.m7174fromClosedRangeNkh28Cs(uIntProgression.m7173getLastpVg5ArA(), uIntProgression.m7172getFirstpVg5ArA(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression reversed(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.Companion.m7183fromClosedRange7ftBX0g(uLongProgression.m7182getLastsVKNKU(), uLongProgression.m7181getFirstsVKNKU(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression step(@NotNull UIntProgression uIntProgression, int i2) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        UIntProgression.Companion companion = UIntProgression.Companion;
        int m7172getFirstpVg5ArA = uIntProgression.m7172getFirstpVg5ArA();
        int m7173getLastpVg5ArA = uIntProgression.m7173getLastpVg5ArA();
        if (uIntProgression.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.m7174fromClosedRangeNkh28Cs(m7172getFirstpVg5ArA, m7173getLastpVg5ArA, i2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression step(@NotNull ULongProgression uLongProgression, long j2) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j2 > 0, Long.valueOf(j2));
        ULongProgression.Companion companion = ULongProgression.Companion;
        long m7181getFirstsVKNKU = uLongProgression.m7181getFirstsVKNKU();
        long m7182getLastsVKNKU = uLongProgression.m7182getLastsVKNKU();
        if (uLongProgression.getStep() <= 0) {
            j2 = -j2;
        }
        return companion.m7183fromClosedRange7ftBX0g(m7181getFirstsVKNKU, m7182getLastsVKNKU, j2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-5PvTz6A  reason: not valid java name */
    public static final UIntRange m7215until5PvTz6A(short s2, short s3) {
        int i2 = s3 & 65535;
        return Intrinsics.compare(i2, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m5946constructorimpl(s2 & 65535), UInt.m5946constructorimpl(UInt.m5946constructorimpl(i2) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-J1ME1BU  reason: not valid java name */
    public static final UIntRange m7216untilJ1ME1BU(int i2, int i3) {
        return UnsignedKt.uintCompare(i3, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(i2, UInt.m5946constructorimpl(i3 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-Kr8caGY  reason: not valid java name */
    public static final UIntRange m7217untilKr8caGY(byte b2, byte b3) {
        int i2 = b3 & 255;
        return Intrinsics.compare(i2, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m5946constructorimpl(b2 & 255), UInt.m5946constructorimpl(UInt.m5946constructorimpl(i2) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-eb3DHEI  reason: not valid java name */
    public static final ULongRange m7218untileb3DHEI(long j2, long j3) {
        return UnsignedKt.ulongCompare(j3, 0L) <= 0 ? ULongRange.Companion.getEMPTY() : new ULongRange(j2, ULong.m6025constructorimpl(j3 - ULong.m6025constructorimpl(1 & 4294967295L)), null);
    }
}
