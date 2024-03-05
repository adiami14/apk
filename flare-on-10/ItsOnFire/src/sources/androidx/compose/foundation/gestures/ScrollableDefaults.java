package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollableDefaults.class */
public final class ScrollableDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    private ScrollableDefaults() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.gestures.FlingBehavior flingBehavior(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r5, int r6) {
        /*
            r4 = this;
            r0 = r5
            r1 = 400129585(0x17d97e31, float:1.4055152E-24)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = 0
            androidx.compose.animation.core.DecayAnimationSpec r0 = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(r0, r1)
            r7 = r0
            r0 = r5
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = r7
            boolean r0 = r0.changed(r1)
            r8 = r0
            r0 = r5
            java.lang.Object r0 = r0.rememberedValue()
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L3b
            r0 = r9
            r10 = r0
            r0 = r9
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L4d
        L3b:
            androidx.compose.foundation.gestures.DefaultFlingBehavior r0 = new androidx.compose.foundation.gestures.DefaultFlingBehavior
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
            r0 = r5
            r1 = r10
            r0.updateRememberedValue(r1)
        L4d:
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r10
            androidx.compose.foundation.gestures.DefaultFlingBehavior r0 = (androidx.compose.foundation.gestures.DefaultFlingBehavior) r0
            r10 = r0
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior(androidx.compose.runtime.Composer, int):androidx.compose.foundation.gestures.FlingBehavior");
    }
}
