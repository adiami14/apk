package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018�� 92\u00020\u0001:\u00019B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u0013\u001a\u00020��2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020��2\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020��2\u0006\u0010\u001c\u001a\u00020��H\u0087\u0002ø\u0001��ø\u0001\u0002¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020��2\u0006\u0010\u001c\u001a\u00020��H\u0087\u0002ø\u0001��ø\u0001\u0002¢\u0006\u0004\b.\u0010,J!\u0010/\u001a\u00020��2\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u0010\u0019J!\u00101\u001a\u00020��2\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020��H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b8\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n��R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/Offset.class */
public final class Offset {
    private final long packedValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/Offset$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m2178getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m2179getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m2180getZeroF1C5BW0$annotations() {
        }

        /* renamed from: getInfinite-F1C5BW0  reason: not valid java name */
        public final long m2181getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0  reason: not valid java name */
        public final long m2182getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0  reason: not valid java name */
        public final long m2183getZeroF1C5BW0() {
            return Offset.Zero;
        }
    }

    private /* synthetic */ Offset(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Offset m2156boximpl(long j2) {
        return new Offset(j2);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m2157component1impl(long j2) {
        return m2167getXimpl(j2);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m2158component2impl(long j2) {
        return m2168getYimpl(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2159constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-dBAh8RU  reason: not valid java name */
    public static final long m2160copydBAh8RU(long j2, float f2, float f3) {
        return OffsetKt.Offset(f2, f3);
    }

    /* renamed from: copy-dBAh8RU$default  reason: not valid java name */
    public static /* synthetic */ long m2161copydBAh8RU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m2167getXimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m2168getYimpl(j2);
        }
        return m2160copydBAh8RU(j2, f2, f3);
    }

    @Stable
    /* renamed from: div-tuRUvjQ  reason: not valid java name */
    public static final long m2162divtuRUvjQ(long j2, float f2) {
        return OffsetKt.Offset(m2167getXimpl(j2) / f2, m2168getYimpl(j2) / f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2163equalsimpl(long j2, Object obj) {
        return (obj instanceof Offset) && j2 == ((Offset) obj).m2177unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2164equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m2165getDistanceimpl(long j2) {
        return (float) Math.sqrt((m2167getXimpl(j2) * m2167getXimpl(j2)) + (m2168getYimpl(j2) * m2168getYimpl(j2)));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl  reason: not valid java name */
    public static final float m2166getDistanceSquaredimpl(long j2) {
        return (m2167getXimpl(j2) * m2167getXimpl(j2)) + (m2168getYimpl(j2) * m2168getYimpl(j2));
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m2167getXimpl(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m2168getYimpl(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2169hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* renamed from: isValid-impl  reason: not valid java name */
    public static final boolean m2170isValidimpl(long j2) {
        if ((Float.isNaN(m2167getXimpl(j2)) || Float.isNaN(m2168getYimpl(j2))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* renamed from: minus-MK-Hz9U  reason: not valid java name */
    public static final long m2171minusMKHz9U(long j2, long j3) {
        return OffsetKt.Offset(m2167getXimpl(j2) - m2167getXimpl(j3), m2168getYimpl(j2) - m2168getYimpl(j3));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U  reason: not valid java name */
    public static final long m2172plusMKHz9U(long j2, long j3) {
        return OffsetKt.Offset(m2167getXimpl(j2) + m2167getXimpl(j3), m2168getYimpl(j2) + m2168getYimpl(j3));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ  reason: not valid java name */
    public static final long m2173remtuRUvjQ(long j2, float f2) {
        return OffsetKt.Offset(m2167getXimpl(j2) % f2, m2168getYimpl(j2) % f2);
    }

    @Stable
    /* renamed from: times-tuRUvjQ  reason: not valid java name */
    public static final long m2174timestuRUvjQ(long j2, float f2) {
        return OffsetKt.Offset(m2167getXimpl(j2) * f2, m2168getYimpl(j2) * f2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2175toStringimpl(long j2) {
        String str;
        if (OffsetKt.m2186isSpecifiedk4lQ0M(j2)) {
            str = "Offset(" + GeometryUtilsKt.toStringAsFixed(m2167getXimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2168getYimpl(j2), 1) + ')';
        } else {
            str = "Offset.Unspecified";
        }
        return str;
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0  reason: not valid java name */
    public static final long m2176unaryMinusF1C5BW0(long j2) {
        return OffsetKt.Offset(-m2167getXimpl(j2), -m2168getYimpl(j2));
    }

    public boolean equals(Object obj) {
        return m2163equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2169hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m2175toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2177unboximpl() {
        return this.packedValue;
    }
}
