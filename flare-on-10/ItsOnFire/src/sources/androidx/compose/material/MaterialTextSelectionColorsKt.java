package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
@Metadata(d1 = {"�� \n��\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/MaterialTextSelectionColorsKt.class */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8  reason: not valid java name */
    private static final float m1390binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j2, long j3, long j4) {
        float f2 = 0.4f;
        float f3 = 0.2f;
        float f4 = 0.4f;
        for (int i2 = 0; i2 < 7; i2++) {
            float m1392calculateContrastRationb2GgbA = (m1392calculateContrastRationb2GgbA(j2, f2, j3, j4) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1392calculateContrastRationb2GgbA && m1392calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1392calculateContrastRationb2GgbA < 0.0f) {
                f4 = f2;
            } else {
                f3 = f2;
            }
            f2 = (f4 + f3) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio--OWjLjI  reason: not valid java name */
    public static final float m1391calculateContrastRatioOWjLjI(long j2, long j3) {
        float m2468luminance8_81llA = ColorKt.m2468luminance8_81llA(j2) + 0.05f;
        float m2468luminance8_81llA2 = ColorKt.m2468luminance8_81llA(j3) + 0.05f;
        return Math.max(m2468luminance8_81llA, m2468luminance8_81llA2) / Math.min(m2468luminance8_81llA, m2468luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA  reason: not valid java name */
    private static final float m1392calculateContrastRationb2GgbA(long j2, float f2, long j3, long j4) {
        long m2461compositeOverOWjLjI = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(j2, f2, 0.0f, 0.0f, 0.0f, 14, null), j4);
        return m1391calculateContrastRatioOWjLjI(ColorKt.m2461compositeOverOWjLjI(j3, m2461compositeOverOWjLjI), m2461compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8  reason: not valid java name */
    public static final long m1393calculateSelectionBackgroundColorysEtTa8(long j2, long j3, long j4) {
        return Color.m2413copywmQWz5c$default(j2, m1392calculateContrastRationb2GgbA(j2, DefaultSelectionBackgroundAlpha, j3, j4) >= DesiredContrastRatio ? 0.4f : m1392calculateContrastRationb2GgbA(j2, 0.2f, j3, j4) < DesiredContrastRatio ? 0.2f : m1390binarySearchForAccessibleSelectionColorAlphaysEtTa8(j2, j3, j4), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c9, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors rememberTextSelectionColors(@org.jetbrains.annotations.NotNull androidx.compose.material.Colors r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialTextSelectionColorsKt.rememberTextSelectionColors(androidx.compose.material.Colors, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
