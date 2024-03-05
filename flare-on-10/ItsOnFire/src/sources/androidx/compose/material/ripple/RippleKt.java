package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material.TextFieldImplKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a3\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"DefaultTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "incomingStateLayerAnimationSpecFor", "Landroidx/compose/animation/core/AnimationSpec;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingStateLayerAnimationSpecFor", "rememberRipple", "Landroidx/compose/foundation/Indication;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material-ripple_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ripple/RippleKt.class */
public final class RippleKt {
    @NotNull
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        TweenSpec<Float> tweenSpec;
        if (!(interaction instanceof HoverInteraction.Enter)) {
            if (interaction instanceof FocusInteraction.Focus) {
                tweenSpec = new TweenSpec<>(45, 0, EasingKt.getLinearEasing(), 2, null);
            } else if (interaction instanceof DragInteraction.Start) {
                tweenSpec = new TweenSpec<>(45, 0, EasingKt.getLinearEasing(), 2, null);
            }
            return tweenSpec;
        }
        tweenSpec = DefaultTweenSpec;
        return tweenSpec;
    }

    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        return ((interaction instanceof HoverInteraction.Enter) || (interaction instanceof FocusInteraction.Focus) || !(interaction instanceof DragInteraction.Start)) ? DefaultTweenSpec : new TweenSpec<>(TextFieldImplKt.AnimationDuration, 0, EasingKt.getLinearEasing(), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L17;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: rememberRipple-9IZ8Weo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.Indication m1924rememberRipple9IZ8Weo(boolean r7, float r8, long r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = r11
            r1 = -1508283743(0xffffffffa6196aa1, float:-5.322705E-16)
            r0.startReplaceableGroup(r1)
            r0 = r13
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r0 = 1
            r7 = r0
        L12:
            r0 = r13
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L20
            androidx.compose.ui.unit.Dp$Companion r0 = androidx.compose.ui.unit.Dp.Companion
            float r0 = r0.m4805getUnspecifiedD9Ej5fM()
            r8 = r0
        L20:
            r0 = r13
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            long r0 = r0.m2450getUnspecified0d7_KjU()
            r9 = r0
        L2e:
            r0 = r9
            androidx.compose.ui.graphics.Color r0 = androidx.compose.ui.graphics.Color.m2404boximpl(r0)
            r1 = r11
            r2 = r12
            r3 = 6
            int r2 = r2 >> r3
            r3 = 14
            r2 = r2 & r3
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r0, r1, r2)
            r14 = r0
            r0 = r8
            androidx.compose.ui.unit.Dp r0 = androidx.compose.ui.unit.Dp.m4783boximpl(r0)
            r15 = r0
            r0 = r11
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r11
            r1 = r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.changed(r1)
            r16 = r0
            r0 = r11
            r1 = r15
            boolean r0 = r0.changed(r1)
            r17 = r0
            r0 = r11
            java.lang.Object r0 = r0.rememberedValue()
            r18 = r0
            r0 = r16
            r1 = r17
            r0 = r0 | r1
            if (r0 != 0) goto L88
            r0 = r18
            r15 = r0
            r0 = r18
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L9f
        L88:
            androidx.compose.material.ripple.PlatformRipple r0 = new androidx.compose.material.ripple.PlatformRipple
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r14
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r15 = r0
            r0 = r11
            r1 = r15
            r0.updateRememberedValue(r1)
        L9f:
            r0 = r11
            r0.endReplaceableGroup()
            r0 = r15
            androidx.compose.material.ripple.PlatformRipple r0 = (androidx.compose.material.ripple.PlatformRipple) r0
            r15 = r0
            r0 = r11
            r0.endReplaceableGroup()
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleKt.m1924rememberRipple9IZ8Weo(boolean, float, long, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.Indication");
    }
}
