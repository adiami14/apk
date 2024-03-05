package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018�� R2\b\u0012\u0004\u0012\u00020��0\u0001:\u0001RB\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\b\u001a\u00020\tø\u0001��¢\u0006\u0004\b\u0004\u0010\nJ\u0016\u0010\u0015\u001a\u00020��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u0016\u0010\u0017\u001a\u00020��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020��H\u0096\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0016\u0010/\u001a\u00020��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0016\u0010M\u001a\u00020��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010\nJ\u001b\u0010O\u001a\u00020��2\u0006\u0010\u0011\u001a\u00020��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020��8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\bø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Float16.class */
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m2512constructorimpl((short) 5120);
    private static final short LowestValue = m2512constructorimpl((short) -1025);
    private static final short MaxValue = m2512constructorimpl((short) 31743);
    private static final short MinNormal = m2512constructorimpl((short) 1024);
    private static final short MinValue = m2512constructorimpl((short) 1);
    private static final short NaN = m2512constructorimpl((short) 32256);
    private static final short NegativeInfinity = m2512constructorimpl((short) -1024);
    private static final short NegativeZero = m2512constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m2512constructorimpl((short) 31744);
    private static final short PositiveZero = m2512constructorimpl((short) 0);
    private static final short One = m2511constructorimpl(1.0f);
    private static final short NegativeOne = m2511constructorimpl(-1.0f);

    @Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0002J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000202H\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0017\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0019\u001a\u00020\tX\u0082T¢\u0006\u0002\n��R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n��R\u001c\u0010\u001d\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n��R\u001c\u0010 \u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010)\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006R\u0019\u0010+\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010,\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u000e\u00100\u001a\u00020\tX\u0086T¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", "S", "FP16_COMBINED", "", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeOne", "NegativeZero", "getNegativeZero-slo4al4", "One", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "floatToHalf", "", "f", "toCompareValue", "value", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Float16$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f2) {
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f2);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & Float16.FP32_SIGNIFICAND_MASK;
            int i6 = 0;
            int i7 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i7 = 512;
                }
                i6 = 31;
            } else {
                int i8 = (i4 - 127) + 15;
                if (i8 >= 31) {
                    i6 = 49;
                    i7 = 0;
                } else if (i8 > 0) {
                    i7 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i2 = (((i8 << 10) | i7) + 1) | (i3 << 15);
                        return (short) i2;
                    }
                    i6 = i8;
                } else if (i8 < -10) {
                    i7 = 0;
                } else {
                    int i9 = (i5 | 8388608) >> (1 - i8);
                    int i10 = i9;
                    if ((i9 & 4096) != 0) {
                        i10 = i9 + 8192;
                    }
                    i7 = i10 >> 13;
                }
            }
            i2 = i7 | (i3 << 15) | (i6 << 10);
            return (short) i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short s2) {
            return (s2 & 32768) != 0 ? 32768 - (s2 & 65535) : s2 & 65535;
        }

        /* renamed from: getEpsilon-slo4al4  reason: not valid java name */
        public final short m2539getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4  reason: not valid java name */
        public final short m2540getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4  reason: not valid java name */
        public final short m2541getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4  reason: not valid java name */
        public final short m2542getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4  reason: not valid java name */
        public final short m2543getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4  reason: not valid java name */
        public final short m2544getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4  reason: not valid java name */
        public final short m2545getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4  reason: not valid java name */
        public final short m2546getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4  reason: not valid java name */
        public final short m2547getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4  reason: not valid java name */
        public final short m2548getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s2) {
        this.halfValue = s2;
    }

    /* renamed from: absoluteValue-slo4al4  reason: not valid java name */
    public static final short m2506absoluteValueslo4al4(short s2) {
        return m2512constructorimpl((short) (s2 & Short.MAX_VALUE));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Float16 m2507boximpl(short s2) {
        return new Float16(s2);
    }

    /* renamed from: ceil-slo4al4  reason: not valid java name */
    public static final short m2508ceilslo4al4(short s2) {
        int i2;
        int i3 = s2 & 65535;
        int i4 = i3 & 32767;
        int i5 = 1;
        if (i4 < 15360) {
            if (i4 == 0) {
                i5 = 0;
            }
            i2 = ((-((i3 >> 15) & i5)) & 15360) | (32768 & i3);
        } else {
            i2 = i3;
            if (i4 < 25600) {
                int i6 = (1 << (25 - (i4 >> 10))) - 1;
                i2 = (i3 + (((i3 >> 15) - 1) & i6)) & i6;
            }
        }
        return m2512constructorimpl((short) i2);
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m2509compareTo41bOqos(short s2, short s3) {
        if (m2522isNaNimpl(s2)) {
            return !m2522isNaNimpl(s3) ? 1 : 0;
        }
        if (m2522isNaNimpl(s3)) {
            return -1;
        }
        Companion companion = Companion;
        return Intrinsics.compare(companion.toCompareValue(s2), companion.toCompareValue(s3));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m2510constructorimpl(double d2) {
        return m2511constructorimpl((float) d2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m2511constructorimpl(float f2) {
        return m2512constructorimpl(Companion.floatToHalf(f2));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m2512constructorimpl(short s2) {
        return s2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2513equalsimpl(short s2, Object obj) {
        return (obj instanceof Float16) && s2 == ((Float16) obj).m2538unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2514equalsimpl0(short s2, short s3) {
        return s2 == s3;
    }

    /* renamed from: floor-slo4al4  reason: not valid java name */
    public static final short m2515floorslo4al4(short s2) {
        int i2;
        int i3 = s2 & 65535;
        int i4 = i3 & 32767;
        if (i4 < 15360) {
            i2 = ((i3 > 32768 ? 65535 : 0) & 15360) | (i3 & 32768);
        } else {
            i2 = i3;
            if (i4 < 25600) {
                int i5 = (1 << (25 - (i4 >> 10))) - 1;
                i2 = (i3 + ((-(i3 >> 15)) & i5)) & i5;
            }
        }
        return m2512constructorimpl((short) i2);
    }

    /* renamed from: getExponent-impl  reason: not valid java name */
    public static final int m2516getExponentimpl(short s2) {
        return ((s2 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4  reason: not valid java name */
    public static final short m2517getSignslo4al4(short s2) {
        if (m2522isNaNimpl(s2)) {
            return NaN;
        }
        if (m2509compareTo41bOqos(s2, NegativeZero) < 0) {
            return NegativeOne;
        }
        short s3 = s2;
        if (m2509compareTo41bOqos(s2, PositiveZero) > 0) {
            s3 = One;
        }
        return s3;
    }

    /* renamed from: getSignificand-impl  reason: not valid java name */
    public static final int m2518getSignificandimpl(short s2) {
        return s2 & FP16_SIGNIFICAND_MASK;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2519hashCodeimpl(short s2) {
        return Short.hashCode(s2);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m2520isFiniteimpl(short s2) {
        return (s2 & Short.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m2521isInfiniteimpl(short s2) {
        return (s2 & Short.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m2522isNaNimpl(short s2) {
        return (s2 & Short.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* renamed from: isNormalized-impl  reason: not valid java name */
    public static final boolean m2523isNormalizedimpl(short s2) {
        int i2 = s2 & FP16_EXPONENT_MAX;
        return (i2 == 0 || i2 == FP16_EXPONENT_MAX) ? false : true;
    }

    /* renamed from: round-slo4al4  reason: not valid java name */
    public static final short m2524roundslo4al4(short s2) {
        int i2;
        int i3 = s2 & 65535;
        int i4 = i3 & 32767;
        if (i4 < 15360) {
            i2 = (i3 & 32768) | ((i4 >= 14336 ? 65535 : 0) & 15360);
        } else {
            i2 = i3;
            if (i4 < 25600) {
                int i5 = 25 - (i4 >> 10);
                i2 = (i3 + (1 << (i5 - 1))) & ((1 << i5) - 1);
            }
        }
        return m2512constructorimpl((short) i2);
    }

    /* renamed from: toBits-impl  reason: not valid java name */
    public static final int m2525toBitsimpl(short s2) {
        return m2522isNaNimpl(s2) ? NaN : s2 & 65535;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    public static final byte m2526toByteimpl(short s2) {
        return (byte) m2528toFloatimpl(s2);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m2527toDoubleimpl(short s2) {
        return m2528toFloatimpl(s2);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m2528toFloatimpl(short s2) {
        int i2;
        int i3 = s2 & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & FP16_SIGNIFICAND_MASK;
        int i7 = 0;
        if (i5 != 0) {
            int i8 = i6 << 13;
            if (i5 == 31) {
                i2 = i8;
                i7 = 255;
                if (i8 != 0) {
                    i2 = i8 | 4194304;
                    i7 = 255;
                }
            } else {
                i7 = (i5 - 15) + 127;
                i2 = i8;
            }
        } else if (i6 != 0) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            float intBitsToFloat = Float.intBitsToFloat(i6 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
            if (i4 != 0) {
                intBitsToFloat = -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i2 = 0;
        }
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i2 | (i4 << 16) | (i7 << 23));
    }

    @NotNull
    /* renamed from: toHexString-impl  reason: not valid java name */
    public static final String m2529toHexStringimpl(short s2) {
        int checkRadix;
        String valueOf;
        int checkRadix2;
        StringBuilder sb = new StringBuilder();
        int i2 = s2 & 65535;
        int i3 = i2 >>> 15;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & FP16_SIGNIFICAND_MASK;
        if (i4 != 31) {
            if (i3 == 1) {
                sb.append('-');
            }
            if (i4 != 0) {
                sb.append("0x1.");
                checkRadix = CharsKt__CharJVMKt.checkRadix(16);
                String num = Integer.toString(i5, checkRadix);
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num, ""));
                sb.append('p');
                valueOf = String.valueOf(i4 - 15);
            } else if (i5 == 0) {
                valueOf = "0x0.0p0";
            } else {
                sb.append("0x0.");
                checkRadix2 = CharsKt__CharJVMKt.checkRadix(16);
                String num2 = Integer.toString(i5, checkRadix2);
                Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num2, ""));
                valueOf = "p-14";
            }
        } else if (i5 == 0) {
            if (i3 != 0) {
                sb.append('-');
            }
            valueOf = "Infinity";
        } else {
            valueOf = "NaN";
        }
        sb.append(valueOf);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "o.toString()");
        return sb2;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m2530toIntimpl(short s2) {
        return (int) m2528toFloatimpl(s2);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m2531toLongimpl(short s2) {
        return m2528toFloatimpl(s2);
    }

    /* renamed from: toRawBits-impl  reason: not valid java name */
    public static final int m2532toRawBitsimpl(short s2) {
        return s2 & 65535;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    public static final short m2533toShortimpl(short s2) {
        return (short) m2528toFloatimpl(s2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2534toStringimpl(short s2) {
        return String.valueOf(m2528toFloatimpl(s2));
    }

    /* renamed from: trunc-slo4al4  reason: not valid java name */
    public static final short m2535truncslo4al4(short s2) {
        int i2;
        int i3;
        int i4 = s2 & 65535;
        int i5 = i4 & 32767;
        if (i5 >= 15360) {
            i2 = i4;
            if (i5 < 25600) {
                i3 = (1 << (25 - (i5 >> 10))) - 1;
            }
            return m2512constructorimpl((short) i2);
        }
        i3 = 32768;
        i2 = i4 & i3;
        return m2512constructorimpl((short) i2);
    }

    /* renamed from: withSign-qCeQghg  reason: not valid java name */
    public static final short m2536withSignqCeQghg(short s2, short s3) {
        return m2512constructorimpl((short) ((s2 & Short.MAX_VALUE) | (s3 & 32768)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m2537compareTo41bOqos(float16.m2538unboximpl());
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m2537compareTo41bOqos(short s2) {
        return m2509compareTo41bOqos(this.halfValue, s2);
    }

    public boolean equals(Object obj) {
        return m2513equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m2519hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m2534toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m2538unboximpl() {
        return this.halfValue;
    }
}
