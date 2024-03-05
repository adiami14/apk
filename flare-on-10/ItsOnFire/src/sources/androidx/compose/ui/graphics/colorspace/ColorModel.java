package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00172\u00020\u0001:\u0001\u0017B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "packedValue", "", "constructor-impl", "(J)J", "componentCount", "", "getComponentCount$annotations", "()V", "getComponentCount-impl", "(J)I", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/ColorModel.class */
public final class ColorModel {
    private static final long Cmyk;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "()V", "Cmyk", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "getCmyk-xdoWZVw", "()J", "J", "Lab", "getLab-xdoWZVw", "Rgb", "getRgb-xdoWZVw", "Xyz", "getXyz-xdoWZVw", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/ColorModel$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw  reason: not valid java name */
        public final long m2778getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw  reason: not valid java name */
        public final long m2779getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw  reason: not valid java name */
        public final long m2780getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw  reason: not valid java name */
        public final long m2781getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }
    }

    static {
        long j2 = 3;
        long j3 = j2 << 32;
        Rgb = m2771constructorimpl((0 & 4294967295L) | j3);
        Xyz = m2771constructorimpl((1 & 4294967295L) | j3);
        Lab = m2771constructorimpl(j3 | (2 & 4294967295L));
        Cmyk = m2771constructorimpl((j2 & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorModel m2770boximpl(long j2) {
        return new ColorModel(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2771constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2772equalsimpl(long j2, Object obj) {
        return (obj instanceof ColorModel) && j2 == ((ColorModel) obj).m2777unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2773equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: getComponentCount-impl  reason: not valid java name */
    public static final int m2774getComponentCountimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2775hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2776toStringimpl(long j2) {
        return m2773equalsimpl0(j2, Rgb) ? "Rgb" : m2773equalsimpl0(j2, Xyz) ? "Xyz" : m2773equalsimpl0(j2, Lab) ? "Lab" : m2773equalsimpl0(j2, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2772equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2775hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m2776toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2777unboximpl() {
        return this.packedValue;
    }
}
