package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\t\u001a\"\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001��¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"CornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-3Ry4LBc", "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/CornerRadiusKt.class */
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f2, float f3) {
        return CornerRadius.m2135constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        return CornerRadius(f2, f3);
    }

    @Stable
    /* renamed from: lerp-3Ry4LBc  reason: not valid java name */
    public static final long m2152lerp3Ry4LBc(long j2, long j3, float f2) {
        return CornerRadius(MathHelpersKt.lerp(CornerRadius.m2141getXimpl(j2), CornerRadius.m2141getXimpl(j3), f2), MathHelpersKt.lerp(CornerRadius.m2142getYimpl(j2), CornerRadius.m2142getYimpl(j3), f2));
    }
}
