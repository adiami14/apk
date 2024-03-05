package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u.c;
import u.e;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018��2\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00104\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001a\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u0004*\u00020\bH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u0003*\u00020\bH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u0003*\u00020\u000eH\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\r\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u0013*\u00020\u0012H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000e*\u00020\u0003H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001J\u001a\u0010\u001e\u001a\u00020\u0012*\u00020\u0013H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u001a\u0010!\u001a\u00020\b*\u00020\u0003H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\b*\u00020\u000eH\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J\u001d\u0010!\u001a\u00020\b*\u00020\u0004H\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0013\u0010(\u001a\u00020$H\u0096@ø\u0001��¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020*H\u0096@ø\u0001��¢\u0006\u0004\b+\u0010)R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "", "cancel", "release", "reset", "awaitRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryAwaitRelease", "isReleased", "Z", "isCanceled", "Lu/c;", "mutex", "Lu/c;", "getDensity", "()F", "density", "getFontScale", "fontScale", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/PressGestureScopeImpl.class */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    @NotNull
    private final c mutex;

    public PressGestureScopeImpl(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.$$delegate_0 = density;
        this.mutex = e.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitRelease(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L25
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            r7 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r7
            r6 = r0
            goto L2f
        L25:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r7 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5a
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L50
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r6 = r0
            goto L74
        L50:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5a:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.tryAwaitRelease(r1)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r9
            if (r0 != r1) goto L74
            r0 = r9
            return r0
        L74:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L82:
            androidx.compose.foundation.gestures.GestureCancellationException r0 = new androidx.compose.foundation.gestures.GestureCancellationException
            r1 = r0
            java.lang.String r2 = "The press gesture was canceled."
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        c.a.d(this.mutex, null, 1, null);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        c.a.d(this.mutex, null, 1, null);
    }

    public final void reset() {
        c.a.c(this.mutex, null, 1, null);
        this.isReleased = false;
        this.isCanceled = false;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int mo517roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo517roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int mo518roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo518roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float mo519toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo519toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo520toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo520toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo521toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo521toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long mo522toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo522toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float mo523toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo523toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float mo524toPx0680j_4(float f2) {
        return this.$$delegate_0.mo524toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long mo525toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo525toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long mo526toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo526toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo527toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo527toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo528toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo528toSpkPz2Gy4(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L25
            r0 = r7
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r7 = r0
            goto L2f
        L25:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L2f:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L62
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L58
            r0 = r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            r8 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9c
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r8 = r0
            r0 = r6
            boolean r0 = r0.isReleased
            if (r0 != 0) goto L9c
            r0 = r6
            r8 = r0
            r0 = r6
            boolean r0 = r0.isCanceled
            if (r0 != 0) goto L9c
            r0 = r6
            u.c r0 = r0.mutex
            r10 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r6
            r8 = r0
            r0 = r10
            r1 = 0
            r2 = r7
            r3 = 1
            r4 = 0
            java.lang.Object r0 = u.c.a.b(r0, r1, r2, r3, r4)
            r1 = r11
            if (r0 != r1) goto L9c
            r0 = r11
            return r0
        L9c:
            r0 = r8
            boolean r0 = r0.isReleased
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
