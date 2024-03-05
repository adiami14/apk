package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��,\n��\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b��\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"EndTension", "", "Inflection", "P1", "P2", "StartTension", "computeSplineInfo", "", "splinePositions", "", "splineTimes", "nbSamples", "", "splineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/SplineBasedDecayKt.class */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        while (i3 < i2) {
            int i4 = i3 + 1;
            float f12 = i3 / i2;
            float f13 = 1.0f;
            while (true) {
                f2 = ((f13 - f10) / 2.0f) + f10;
                f3 = 1.0f - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f14 = (((f3 * P1) + (f2 * P2)) * f4) + f5;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                } else if (f14 > f12) {
                    f13 = f2;
                } else {
                    f10 = f2;
                }
            }
            fArr[i3] = (f4 * ((f3 * 0.5f) + f2)) + f5;
            float f15 = 1.0f;
            while (true) {
                f6 = ((f15 - f11) / 2.0f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f16 = (((f7 * 0.5f) + f6) * f8) + f9;
                if (Math.abs(f16 - f12) < 1.0E-5d) {
                    break;
                } else if (f16 > f12) {
                    f15 = f6;
                } else {
                    f11 = f6;
                }
            }
            fArr2[i3] = (f8 * ((f7 * P1) + (f6 * P2))) + f9;
            i3 = i4;
        }
        fArr2[i2] = 1.0f;
        fArr[i2] = 1.0f;
    }

    @NotNull
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
