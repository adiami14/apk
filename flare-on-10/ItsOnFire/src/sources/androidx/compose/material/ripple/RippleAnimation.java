package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import j.b0;
import j.v0;
import j.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b��\u0018��2\u00020\u0001B$\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001��¢\u0006\u0004\b1\u00102J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001��¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u001f\u0010\r\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R!\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010,\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00100\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "", "fadeIn", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fadeOut", "animate", "finish", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "origin", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Dp;", "radius", "F", "", "bounded", "Z", "", "startRadius", "Ljava/lang/Float;", "targetRadius", "targetCenter", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "animatedRadiusPercent", "animatedCenterPercent", "Lj/z;", "finishSignalDeferred", "Lj/z;", "<set-?>", "finishedFadingIn$delegate", "Landroidx/compose/runtime/MutableState;", "getFinishedFadingIn", "()Z", "setFinishedFadingIn", "(Z)V", "finishedFadingIn", "finishRequested$delegate", "getFinishRequested", "setFinishRequested", "finishRequested", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/material/ripple/RippleAnimation.class */
public final class RippleAnimation {
    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    @NotNull
    private final MutableState finishRequested$delegate;
    @NotNull
    private final z<Unit> finishSignalDeferred;
    @NotNull
    private final MutableState finishedFadingIn$delegate;
    @Nullable
    private Offset origin;
    private final float radius;
    @Nullable
    private Float startRadius;
    @Nullable
    private Offset targetCenter;
    @Nullable
    private Float targetRadius;

    private RippleAnimation(Offset offset, float f2, boolean z) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.origin = offset;
        this.radius = f2;
        this.bounded = z;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = b0.a(null);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishedFadingIn$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = mutableStateOf$default2;
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new RippleAnimation$fadeIn$2(this, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new RippleAnimation$fadeOut$2(this, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }

    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ  reason: not valid java name */
    public final void m1914draw4WTKRHQ(@NotNull DrawScope receiver, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1917getRippleStartRadiusuvyYCjk(receiver.mo2841getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            this.targetRadius = Float.valueOf(Float.isNaN(this.radius) ? RippleAnimationKt.m1916getRippleEndRadiuscSwnlzA(receiver, this.bounded, receiver.mo2841getSizeNHjbRc()) : receiver.mo524toPx0680j_4(this.radius));
        }
        if (this.origin == null) {
            this.origin = Offset.m2156boximpl(receiver.mo2840getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m2156boximpl(OffsetKt.Offset(Size.m2239getWidthimpl(receiver.mo2841getSizeNHjbRc()) / 2.0f, Size.m2236getHeightimpl(receiver.mo2841getSizeNHjbRc()) / 2.0f));
        }
        float floatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f2 = this.startRadius;
        Intrinsics.checkNotNull(f2);
        float floatValue2 = f2.floatValue();
        Float f3 = this.targetRadius;
        Intrinsics.checkNotNull(f3);
        float lerp = MathHelpersKt.lerp(floatValue2, f3.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        Intrinsics.checkNotNull(offset);
        float m2167getXimpl = Offset.m2167getXimpl(offset.m2177unboximpl());
        Offset offset2 = this.targetCenter;
        Intrinsics.checkNotNull(offset2);
        float lerp2 = MathHelpersKt.lerp(m2167getXimpl, Offset.m2167getXimpl(offset2.m2177unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        Intrinsics.checkNotNull(offset3);
        float m2168getYimpl = Offset.m2168getYimpl(offset3.m2177unboximpl());
        Offset offset4 = this.targetCenter;
        Intrinsics.checkNotNull(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m2168getYimpl, Offset.m2168getYimpl(offset4.m2177unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m2413copywmQWz5c$default = Color.m2413copywmQWz5c$default(j2, Color.m2416getAlphaimpl(j2) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.DefaultImpls.m2879drawCircleVaOC9Bg$default(receiver, m2413copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float m2239getWidthimpl = Size.m2239getWidthimpl(receiver.mo2841getSizeNHjbRc());
        float m2236getHeightimpl = Size.m2236getHeightimpl(receiver.mo2841getSizeNHjbRc());
        int m2402getIntersectrtfAjoo = ClipOp.Companion.m2402getIntersectrtfAjoo();
        DrawContext drawContext = receiver.getDrawContext();
        long mo2847getSizeNHjbRc = drawContext.mo2847getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2851clipRectN_I0leg(0.0f, 0.0f, m2239getWidthimpl, m2236getHeightimpl, m2402getIntersectrtfAjoo);
        DrawScope.DefaultImpls.m2879drawCircleVaOC9Bg$default(receiver, m2413copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
        drawContext.getCanvas().restore();
        drawContext.mo2848setSizeuvyYCjk(mo2847getSizeNHjbRc);
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.P(Unit.INSTANCE);
    }
}
