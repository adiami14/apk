package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/FloatingActionButtonDefaults.class */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* renamed from: elevation-ixp7dh8  reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1371elevationixp7dh8(float f2, float f3, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(795786822);
        if ((i3 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(6);
        }
        if ((i3 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(12);
        }
        float f4 = 8;
        FloatingActionButtonElevation m1372elevationxZ9QkE = m1372elevationxZ9QkE(f2, f3, Dp.m4785constructorimpl(f4), Dp.m4785constructorimpl(f4), composer, (i2 & 14) | 3456 | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (57344 & (i2 << 6)), 0);
        composer.endReplaceableGroup();
        return m1372elevationxZ9QkE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L25;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: elevation-xZ9-QkE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.material.FloatingActionButtonElevation m1372elevationxZ9QkE(float r9, float r10, float r11, float r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonDefaults.m1372elevationxZ9QkE(float, float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material.FloatingActionButtonElevation");
    }
}
