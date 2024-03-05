package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(d1 = {"��\u001a\n��\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b��\u0010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b��\u0010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u000b\"\u0014\u0010��\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"platformFlingScrollFriction", "", "getPlatformFlingScrollFriction", "()F", "rememberSplineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecayDeprecated", "density", "Landroidx/compose/ui/unit/Density;", "splineBasedDecay", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt.class */
public final class SplineBasedFloatDecayAnimationSpec_androidKt {
    private static final float platformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    public static final float getPlatformFlingScrollFriction() {
        return platformFlingScrollFriction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> androidx.compose.animation.core.DecayAnimationSpec<T> rememberSplineBasedDecay(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r4, int r5) {
        /*
            r0 = r4
            r1 = -903108490(0xffffffffca2ba876, float:-2812445.5)
            r0.startReplaceableGroup(r1)
            r0 = r4
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r0.consume(r1)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            r6 = r0
            r0 = r6
            float r0 = r0.getDensity()
            r7 = r0
            r0 = r4
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r4
            r1 = r7
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            boolean r0 = r0.changed(r1)
            r8 = r0
            r0 = r4
            java.lang.Object r0 = r0.rememberedValue()
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L4c
            r0 = r9
            r10 = r0
            r0 = r9
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L61
        L4c:
            androidx.compose.animation.SplineBasedFloatDecayAnimationSpec r0 = new androidx.compose.animation.SplineBasedFloatDecayAnimationSpec
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            androidx.compose.animation.core.DecayAnimationSpec r0 = androidx.compose.animation.core.DecayAnimationSpecKt.generateDecayAnimationSpec(r0)
            r10 = r0
            r0 = r4
            r1 = r10
            r0.updateRememberedValue(r1)
        L61:
            r0 = r4
            r0.endReplaceableGroup()
            r0 = r10
            androidx.compose.animation.core.DecayAnimationSpec r0 = (androidx.compose.animation.core.DecayAnimationSpec) r0
            r10 = r0
            r0 = r4
            r0.endReplaceableGroup()
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(androidx.compose.runtime.Composer, int):androidx.compose.animation.core.DecayAnimationSpec");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Moved to common code")
    @JvmName(name = "splineBasedDecay")
    public static final /* synthetic */ DecayAnimationSpec splineBasedDecay(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return SplineBasedDecayKt.splineBasedDecay(density);
    }
}
