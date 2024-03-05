package androidx.compose.ui.geometry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0012\n��\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H��¨\u0006\u0005"}, d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/GeometryUtilsKt.class */
public final class GeometryUtilsKt {
    @NotNull
    public static final String toStringAsFixed(float f2, int i2) {
        int max = Math.max(i2, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f3 = f2 * pow;
        int i3 = (int) f3;
        int i4 = i3;
        if (f3 - i3 >= 0.5f) {
            i4 = i3 + 1;
        }
        float f4 = i4 / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }
}
