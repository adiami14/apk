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
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "()V", "DisabledActiveTrackAlpha", "", "DisabledInactiveTrackAlpha", "DisabledTickAlpha", "InactiveTrackAlpha", "TickAlpha", "colors", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SliderDefaults.class */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    @NotNull
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: colors-q0g_0yA  reason: not valid java name */
    public final SliderColors m1502colorsq0g_0yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, @Nullable Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-341393889);
        if ((i4 & 1) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i4 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j3 = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(materialTheme.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1232getSurface0d7_KjU());
        }
        if ((i4 & 4) != 0) {
            j4 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i4 & 8) != 0) {
            j5 = Color.m2413copywmQWz5c$default(j4, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 16) != 0) {
            j6 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 32) != 0) {
            j7 = Color.m2413copywmQWz5c$default(j6, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 64) != 0) {
            j8 = Color.m2413copywmQWz5c$default(ColorsKt.m1247contentColorForek8zF_U(j4, composer, (i2 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 128) != 0) {
            j9 = Color.m2413copywmQWz5c$default(j4, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 256) != 0) {
            j10 = Color.m2413copywmQWz5c$default(j8, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i4 & 512) != 0) {
            j11 = Color.m2413copywmQWz5c$default(j7, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, null);
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
