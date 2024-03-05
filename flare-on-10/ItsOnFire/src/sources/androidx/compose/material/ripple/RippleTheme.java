package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018�� \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0002\u001a\u00020\u0003H'ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H'¢\u0006\u0002\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme;", "", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "Companion", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ripple/RippleTheme.class */
public interface RippleTheme {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ripple/RippleTheme$Companion;", "", "()V", "defaultRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "lightTheme", "", "defaultRippleAlpha-DxMtmZc", "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "defaultRippleColor", "defaultRippleColor-5vOe2sY", "(JZ)J", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/ripple/RippleTheme$Companion.class */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* renamed from: defaultRippleAlpha-DxMtmZc  reason: not valid java name */
        public final RippleAlpha m1927defaultRippleAlphaDxMtmZc(long j2, boolean z) {
            RippleAlpha rippleAlpha;
            RippleAlpha rippleAlpha2;
            RippleAlpha rippleAlpha3;
            RippleAlpha rippleAlpha4;
            if (!z) {
                rippleAlpha = RippleThemeKt.DarkThemeRippleAlpha;
                rippleAlpha2 = rippleAlpha;
            } else if (ColorKt.m2468luminance8_81llA(j2) > 0.5d) {
                rippleAlpha4 = RippleThemeKt.LightThemeHighContrastRippleAlpha;
                rippleAlpha2 = rippleAlpha4;
            } else {
                rippleAlpha3 = RippleThemeKt.LightThemeLowContrastRippleAlpha;
                rippleAlpha2 = rippleAlpha3;
            }
            return rippleAlpha2;
        }

        /* renamed from: defaultRippleColor-5vOe2sY  reason: not valid java name */
        public final long m1928defaultRippleColor5vOe2sY(long j2, boolean z) {
            float m2468luminance8_81llA = ColorKt.m2468luminance8_81llA(j2);
            long j3 = j2;
            if (!z) {
                j3 = j2;
                if (m2468luminance8_81llA < 0.5d) {
                    j3 = Color.Companion.m2451getWhite0d7_KjU();
                }
            }
            return j3;
        }
    }

    @Composable
    /* renamed from: defaultColor-WaAFU9c */
    long mo1389defaultColorWaAFU9c(@Nullable Composer composer, int i2);

    @Composable
    @NotNull
    RippleAlpha rippleAlpha(@Nullable Composer composer, int i2);
}
