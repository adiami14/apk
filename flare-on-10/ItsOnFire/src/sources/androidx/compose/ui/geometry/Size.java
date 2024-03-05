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
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� 32\u00020\u0001:\u00013B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000bJ*\u0010\u001a\u001a\u00020��2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020��2\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020��2\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/Size.class */
public final class Size {
    private final long packedValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/Size$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations  reason: not valid java name */
        public static /* synthetic */ void m2245getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations  reason: not valid java name */
        public static /* synthetic */ void m2246getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc  reason: not valid java name */
        public final long m2247getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc  reason: not valid java name */
        public final long m2248getZeroNHjbRc() {
            return Size.Zero;
        }
    }

    private /* synthetic */ Size(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Size m2227boximpl(long j2) {
        return new Size(j2);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m2228component1impl(long j2) {
        return m2239getWidthimpl(j2);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m2229component2impl(long j2) {
        return m2236getHeightimpl(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2230constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-xjbvk4A  reason: not valid java name */
    public static final long m2231copyxjbvk4A(long j2, float f2, float f3) {
        return SizeKt.Size(f2, f3);
    }

    /* renamed from: copy-xjbvk4A$default  reason: not valid java name */
    public static /* synthetic */ long m2232copyxjbvk4A$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m2239getWidthimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m2236getHeightimpl(j2);
        }
        return m2231copyxjbvk4A(j2, f2, f3);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8  reason: not valid java name */
    public static final long m2233div7Ah8Wj8(long j2, float f2) {
        return SizeKt.Size(m2239getWidthimpl(j2) / f2, m2236getHeightimpl(j2) / f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2234equalsimpl(long j2, Object obj) {
        return (obj instanceof Size) && j2 == ((Size) obj).m2244unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2235equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final float m2236getHeightimpl(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl  reason: not valid java name */
    public static final float m2237getMaxDimensionimpl(long j2) {
        return Math.max(Math.abs(m2239getWidthimpl(j2)), Math.abs(m2236getHeightimpl(j2)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl  reason: not valid java name */
    public static final float m2238getMinDimensionimpl(long j2) {
        return Math.min(Math.abs(m2239getWidthimpl(j2)), Math.abs(m2236getHeightimpl(j2)));
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final float m2239getWidthimpl(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2240hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static final boolean m2241isEmptyimpl(long j2) {
        return m2239getWidthimpl(j2) <= 0.0f || m2236getHeightimpl(j2) <= 0.0f;
    }

    @Stable
    /* renamed from: times-7Ah8Wj8  reason: not valid java name */
    public static final long m2242times7Ah8Wj8(long j2, float f2) {
        return SizeKt.Size(m2239getWidthimpl(j2) * f2, m2236getHeightimpl(j2) * f2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2243toStringimpl(long j2) {
        String str;
        if (j2 != Companion.m2247getUnspecifiedNHjbRc()) {
            str = "Size(" + GeometryUtilsKt.toStringAsFixed(m2239getWidthimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2236getHeightimpl(j2), 1) + ')';
        } else {
            str = "Size.Unspecified";
        }
        return str;
    }

    public boolean equals(Object obj) {
        return m2234equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2240hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m2243toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2244unboximpl() {
        return this.packedValue;
    }
}
