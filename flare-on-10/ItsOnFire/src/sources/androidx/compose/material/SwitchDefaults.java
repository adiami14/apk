package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwitchDefaults.class */
public final class SwitchDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: colors-SQMK_m0  reason: not valid java name */
    public final SwitchColors m1552colorsSQMK_m0(long j2, long j3, float f2, long j4, long j5, float f3, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-1592206455);
        if ((i4 & 1) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, 6).m1231getSecondaryVariant0d7_KjU();
        }
        if ((i4 & 2) != 0) {
            j3 = j2;
        }
        float f4 = (i4 & 4) != 0 ? 0.54f : f2;
        if ((i4 & 8) != 0) {
            j4 = MaterialTheme.INSTANCE.getColors(composer, 6).m1232getSurface0d7_KjU();
        }
        if ((i4 & 16) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU();
        }
        float f5 = (i4 & 32) != 0 ? 0.38f : f3;
        if ((i4 & 64) != 0) {
            j6 = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(j2, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1232getSurface0d7_KjU());
        }
        if ((i4 & 128) != 0) {
            j7 = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(j3, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1232getSurface0d7_KjU());
        }
        if ((i4 & 256) != 0) {
            j8 = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(j4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1232getSurface0d7_KjU());
        }
        if ((i4 & 512) != 0) {
            j9 = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(j5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1232getSurface0d7_KjU());
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j2, Color.m2413copywmQWz5c$default(j3, f4, 0.0f, 0.0f, 0.0f, 14, null), j4, Color.m2413copywmQWz5c$default(j5, f5, 0.0f, 0.0f, 0.0f, 14, null), j6, Color.m2413copywmQWz5c$default(j7, f4, 0.0f, 0.0f, 0.0f, 14, null), j8, Color.m2413copywmQWz5c$default(j9, f5, 0.0f, 0.0f, 0.0f, 14, null), null);
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
