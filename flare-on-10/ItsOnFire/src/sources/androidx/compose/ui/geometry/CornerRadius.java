package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018�� 12\u00020\u0001:\u00011B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020��2\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u00020��2\u0006\u0010\u001d\u001a\u00020��H\u0087\u0002ø\u0001��ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u00020��2\u0006\u0010\u001d\u001a\u00020��H\u0087\u0002ø\u0001��ø\u0001\u0002¢\u0006\u0004\b(\u0010&J!\u0010)\u001a\u00020��2\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010\u001aJ\u000f\u0010+\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020��H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OHQCggk", "(JFF)J", "div", "operand", "div-Bz7bX_o", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-vF7b-mM", "(JJ)J", "plus", "plus-vF7b-mM", "times", "times-Bz7bX_o", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-kKHJgLs", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/CornerRadius.class */
public final class CornerRadius {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/CornerRadius;", "getZero-kKHJgLs$annotations", "getZero-kKHJgLs", "()J", "J", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/CornerRadius$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations  reason: not valid java name */
        public static /* synthetic */ void m2150getZerokKHJgLs$annotations() {
        }

        /* renamed from: getZero-kKHJgLs  reason: not valid java name */
        public final long m2151getZerokKHJgLs() {
            return CornerRadius.Zero;
        }
    }

    private /* synthetic */ CornerRadius(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ CornerRadius m2132boximpl(long j2) {
        return new CornerRadius(j2);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m2133component1impl(long j2) {
        return m2141getXimpl(j2);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m2134component2impl(long j2) {
        return m2142getYimpl(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2135constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-OHQCggk  reason: not valid java name */
    public static final long m2136copyOHQCggk(long j2, float f2, float f3) {
        return CornerRadiusKt.CornerRadius(f2, f3);
    }

    /* renamed from: copy-OHQCggk$default  reason: not valid java name */
    public static /* synthetic */ long m2137copyOHQCggk$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m2141getXimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m2142getYimpl(j2);
        }
        return m2136copyOHQCggk(j2, f2, f3);
    }

    @Stable
    /* renamed from: div-Bz7bX_o  reason: not valid java name */
    public static final long m2138divBz7bX_o(long j2, float f2) {
        return CornerRadiusKt.CornerRadius(m2141getXimpl(j2) / f2, m2142getYimpl(j2) / f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2139equalsimpl(long j2, Object obj) {
        return (obj instanceof CornerRadius) && j2 == ((CornerRadius) obj).m2149unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2140equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m2141getXimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m2142getYimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2143hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* renamed from: minus-vF7b-mM  reason: not valid java name */
    public static final long m2144minusvF7bmM(long j2, long j3) {
        return CornerRadiusKt.CornerRadius(m2141getXimpl(j2) - m2141getXimpl(j3), m2142getYimpl(j2) - m2142getYimpl(j3));
    }

    @Stable
    /* renamed from: plus-vF7b-mM  reason: not valid java name */
    public static final long m2145plusvF7bmM(long j2, long j3) {
        return CornerRadiusKt.CornerRadius(m2141getXimpl(j2) + m2141getXimpl(j3), m2142getYimpl(j2) + m2142getYimpl(j3));
    }

    @Stable
    /* renamed from: times-Bz7bX_o  reason: not valid java name */
    public static final long m2146timesBz7bX_o(long j2, float f2) {
        return CornerRadiusKt.CornerRadius(m2141getXimpl(j2) * f2, m2142getYimpl(j2) * f2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2147toStringimpl(long j2) {
        StringBuilder sb;
        float m2142getYimpl;
        if (m2141getXimpl(j2) == m2142getYimpl(j2)) {
            sb = new StringBuilder();
            sb.append("CornerRadius.circular(");
            m2142getYimpl = m2141getXimpl(j2);
        } else {
            sb = new StringBuilder();
            sb.append("CornerRadius.elliptical(");
            sb.append(GeometryUtilsKt.toStringAsFixed(m2141getXimpl(j2), 1));
            sb.append(", ");
            m2142getYimpl = m2142getYimpl(j2);
        }
        sb.append(GeometryUtilsKt.toStringAsFixed(m2142getYimpl, 1));
        sb.append(')');
        return sb.toString();
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs  reason: not valid java name */
    public static final long m2148unaryMinuskKHJgLs(long j2) {
        return CornerRadiusKt.CornerRadius(-m2141getXimpl(j2), -m2142getYimpl(j2));
    }

    public boolean equals(Object obj) {
        return m2139equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2143hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m2147toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2149unboximpl() {
        return this.packedValue;
    }
}
