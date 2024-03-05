package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��b\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018��2\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@ø\u0001��¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020\u0005J1\u0010,\u001a\u00020$*\u00020-2\u0006\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u000201ø\u0001��ø\u0001\u0001¢\u0006\u0004\b2\u00103J\n\u00104\u001a\u00020$*\u00020$J\u0017\u00105\u001a\u00020$*\u00020'ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0017\u00105\u001a\u00020$*\u00020\u001dø\u0001��ø\u0001\u0001¢\u0006\u0004\b8\u00107J\u001a\u00109\u001a\u00020'*\u00020$ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010<\u001a\u00020\u001d*\u00020$ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b=\u0010;J\u001f\u0010>\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010?\u001a\u00020$ø\u0001��ø\u0001\u0001¢\u0006\u0004\b@\u0010AR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/OverScrollController;)V", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverScrollController", "()Landroidx/compose/foundation/gestures/OverScrollController;", "getReverseDirection", "()Z", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "axisVelocity", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "shouldScrollImmediately", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollDelta", "pointerPosition", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-iGfEq8s", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/ui/geometry/Offset;I)F", "reverseIfNeeded", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "toVelocity", "toVelocity-adjELrA", "update", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollingLogic.class */
public final class ScrollingLogic {
    @NotNull
    private final FlingBehavior flingBehavior;
    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    @NotNull
    private final Orientation orientation;
    @Nullable
    private final OverScrollController overScrollController;
    private final boolean reverseDirection;
    @NotNull
    private final ScrollableState scrollableState;

    public ScrollingLogic(@NotNull Orientation orientation, boolean z, @NotNull State<NestedScrollDispatcher> nestedScrollDispatcher, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable OverScrollController overScrollController) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overScrollController = overScrollController;
    }

    /* renamed from: dispatchScroll-iGfEq8s  reason: not valid java name */
    public final float m537dispatchScrolliGfEq8s(@NotNull ScrollScope receiver, float f2, @Nullable Offset offset, int i2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        OverScrollController overScrollController = this.overScrollController;
        float m541toFloatk4lQ0M = f2 - (overScrollController == null ? 0.0f : m541toFloatk4lQ0M(overScrollController.mo440consumePreScrollA0NYTsA(m542toOffsettuRUvjQ(f2), offset, i2)));
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        float m541toFloatk4lQ0M2 = m541toFloatk4lQ0M - m541toFloatk4lQ0M(value.m3690dispatchPreScrollOzD1aCk(m542toOffsettuRUvjQ(m541toFloatk4lQ0M), i2));
        float reverseIfNeeded = reverseIfNeeded(receiver.scrollBy(reverseIfNeeded(m541toFloatk4lQ0M2)));
        float f3 = m541toFloatk4lQ0M2 - reverseIfNeeded;
        long m3688dispatchPostScrollDzOQY0M = value.m3688dispatchPostScrollDzOQY0M(m542toOffsettuRUvjQ(reverseIfNeeded), m542toOffsettuRUvjQ(f3), i2);
        OverScrollController overScrollController2 = this.overScrollController;
        if (overScrollController2 != null) {
            overScrollController2.mo438consumePostScrolll7mfB5k(m542toOffsettuRUvjQ(m541toFloatk4lQ0M2), m542toOffsettuRUvjQ(f3 - m541toFloatk4lQ0M(m3688dispatchPostScrollDzOQY0M)), offset, i2);
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doFlingAnimation-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m538doFlingAnimationQWom1Mo(long r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r11) {
        /*
            r8 = this;
            r0 = r11
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L2c
            r0 = r11
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            r12 = r0
            r0 = r12
            int r0 = r0.label
            r13 = r0
            r0 = r13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r12
            r1 = r13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r12
            r11 = r0
            goto L36
        L2c:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r1 = r0
            r2 = r8
            r3 = r11
            r1.<init>(r2, r3)
            r11 = r0
        L36:
            r0 = r11
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r11
            int r0 = r0.label
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L6c
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L62
            r0 = r11
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            r11 = r0
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb5
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6c:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = r9
            r0.element = r1
            r0 = r8
            androidx.compose.foundation.gestures.ScrollableState r0 = r0.getScrollableState()
            r15 = r0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r1 = r0
            r2 = r8
            r3 = r12
            r4 = r9
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r16 = r0
            r0 = r11
            r1 = r12
            r0.L$0 = r1
            r0 = r11
            r1 = 1
            r0.label = r1
            r0 = r15
            r1 = 0
            r2 = r16
            r3 = r11
            r4 = 1
            r5 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableState.DefaultImpls.scroll$default(r0, r1, r2, r3, r4, r5)
            r1 = r14
            if (r0 != r1) goto Lb2
            r0 = r14
            return r0
        Lb2:
            r0 = r12
            r11 = r0
        Lb5:
            r0 = r11
            long r0 = r0.element
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5011boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m538doFlingAnimationQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final OverScrollController getOverScrollController() {
        return this.overScrollController;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ca  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDragStopped(float r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U  reason: not valid java name */
    public final long m539performRawScrollMKHz9U(long j2) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m2183getZeroF1C5BW0() : m542toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m541toFloatk4lQ0M(j2)))));
    }

    public final float reverseIfNeeded(float f2) {
        float f3 = f2;
        if (this.reverseDirection) {
            f3 = f2 * (-1);
        }
        return f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ((r0 == null ? false : r0.stopOverscrollAnimation()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldScrollImmediately() {
        /*
            r2 = this;
            r0 = r2
            androidx.compose.foundation.gestures.ScrollableState r0 = r0.scrollableState
            boolean r0 = r0.isScrollInProgress()
            r3 = r0
            r0 = 0
            r4 = r0
            r0 = r3
            if (r0 != 0) goto L29
            r0 = r2
            androidx.compose.foundation.gestures.OverScrollController r0 = r0.overScrollController
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1e
            r0 = 0
            r3 = r0
            goto L25
        L1e:
            r0 = r5
            boolean r0 = r0.stopOverscrollAnimation()
            r3 = r0
        L25:
            r0 = r3
            if (r0 == 0) goto L2b
        L29:
            r0 = 1
            r4 = r0
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.shouldScrollImmediately():boolean");
    }

    /* renamed from: toFloat-TH1AsA0  reason: not valid java name */
    public final float m540toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5020getXimpl(j2) : Velocity.m5021getYimpl(j2);
    }

    /* renamed from: toFloat-k-4lQ0M  reason: not valid java name */
    public final float m541toFloatk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m2167getXimpl(j2) : Offset.m2168getYimpl(j2);
    }

    /* renamed from: toOffset-tuRUvjQ  reason: not valid java name */
    public final long m542toOffsettuRUvjQ(float f2) {
        return (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? Offset.Companion.m2183getZeroF1C5BW0() : this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f2, 0.0f) : OffsetKt.Offset(0.0f, f2);
    }

    /* renamed from: toVelocity-adjELrA  reason: not valid java name */
    public final long m543toVelocityadjELrA(float f2) {
        return this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f2, 0.0f) : VelocityKt.Velocity(0.0f, f2);
    }

    /* renamed from: update-QWom1Mo  reason: not valid java name */
    public final long m544updateQWom1Mo(long j2, float f2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5016copyOhffZ5M$default(j2, f2, 0.0f, 2, null) : Velocity.m5016copyOhffZ5M$default(j2, 0.0f, f2, 1, null);
    }
}
