package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\u000f\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001��ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lj/u0;", "scope", "", "handleInteraction", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "", "bounded", "Z", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "interactions", "Ljava/util/List;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "<init>", "(ZLandroidx/compose/runtime/State;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/material/ripple/StateLayer.class */
public final class StateLayer {
    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final boolean bounded;
    @Nullable
    private Interaction currentInteraction;
    @NotNull
    private final List<Interaction> interactions;
    @NotNull
    private final State<RippleAlpha> rippleAlpha;

    public StateLayer(boolean z, @NotNull State<RippleAlpha> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.bounded = z;
        this.rippleAlpha = rippleAlpha;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
    }

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m1931drawStateLayerH2RKhps(@NotNull DrawScope receiver, float f2, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        float m1916getRippleEndRadiuscSwnlzA = Float.isNaN(f2) ? RippleAnimationKt.m1916getRippleEndRadiuscSwnlzA(receiver, this.bounded, receiver.mo2841getSizeNHjbRc()) : receiver.mo524toPx0680j_4(f2);
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m2413copywmQWz5c$default = Color.m2413copywmQWz5c$default(j2, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                DrawScope.DefaultImpls.m2879drawCircleVaOC9Bg$default(receiver, m2413copywmQWz5c$default, m1916getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                return;
            }
            float m2239getWidthimpl = Size.m2239getWidthimpl(receiver.mo2841getSizeNHjbRc());
            float m2236getHeightimpl = Size.m2236getHeightimpl(receiver.mo2841getSizeNHjbRc());
            int m2402getIntersectrtfAjoo = ClipOp.Companion.m2402getIntersectrtfAjoo();
            DrawContext drawContext = receiver.getDrawContext();
            long mo2847getSizeNHjbRc = drawContext.mo2847getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2851clipRectN_I0leg(0.0f, 0.0f, m2239getWidthimpl, m2236getHeightimpl, m2402getIntersectrtfAjoo);
            DrawScope.DefaultImpls.m2879drawCircleVaOC9Bg$default(receiver, m2413copywmQWz5c$default, m1916getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            drawContext.getCanvas().restore();
            drawContext.mo2848setSizeuvyYCjk(mo2847getSizeNHjbRc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleInteraction(@org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.Interaction r8, @org.jetbrains.annotations.NotNull j.u0 r9) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.StateLayer.handleInteraction(androidx.compose.foundation.interaction.Interaction, j.u0):void");
    }
}
