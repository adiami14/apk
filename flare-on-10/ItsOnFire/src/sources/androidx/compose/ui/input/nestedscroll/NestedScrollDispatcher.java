package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import j.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J#\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148��@��X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00158��@��X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8��@��X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostFling", "Lkotlin/Function0;", "Lj/u0;", "calculateNestedScrollScope", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "originNestedScrollScope", "Lj/u0;", "getOriginNestedScrollScope$ui_release", "()Lj/u0;", "setOriginNestedScrollScope$ui_release", "(Lj/u0;)V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParent$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getCoroutineScope", "coroutineScope", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/nestedscroll/NestedScrollDispatcher.class */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    @NotNull
    private Function0<? extends u0> calculateNestedScrollScope = new Function0<u0>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final u0 invoke() {
            return NestedScrollDispatcher.this.getOriginNestedScrollScope$ui_release();
        }
    };
    @Nullable
    private u0 originNestedScrollScope;
    @Nullable
    private NestedScrollConnection parent;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: dispatchPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3687dispatchPostFlingRZ2iAVY(long r8, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r12) {
        /*
            r7 = this;
            r0 = r12
            boolean r0 = r0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L2f
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            r13 = r0
            r0 = r13
            int r0 = r0.label
            r14 = r0
            r0 = r14
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r13
            r1 = r14
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r13
            r12 = r0
            goto L3b
        L2f:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r1 = r0
            r2 = r7
            r3 = r12
            r1.<init>(r2, r3)
            r12 = r0
        L3b:
            r0 = r12
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r15 = r0
            r0 = r12
            int r0 = r0.label
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L6f
            r0 = r14
            r1 = 1
            if (r0 != r1) goto L65
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r13
            r12 = r0
            goto La6
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r0.getParent$ui_release()
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L85
            r0 = 0
            r12 = r0
            goto Lad
        L85:
            r0 = r12
            r1 = 1
            r0.label = r1
            r0 = r13
            r1 = r8
            r2 = r10
            r3 = r12
            java.lang.Object r0 = r0.mo532onPostFlingRZ2iAVY(r1, r2, r3)
            r13 = r0
            r0 = r13
            r12 = r0
            r0 = r13
            r1 = r15
            if (r0 != r1) goto La6
            r0 = r15
            return r0
        La6:
            r0 = r12
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            r12 = r0
        Lad:
            r0 = r12
            if (r0 != 0) goto Lbc
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m5031getZero9UxMQ8M()
            r8 = r0
            goto Lc2
        Lbc:
            r0 = r12
            long r0 = r0.m5029unboximpl()
            r8 = r0
        Lc2:
            r0 = r8
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5011boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m3687dispatchPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M  reason: not valid java name */
    public final long m3688dispatchPostScrollDzOQY0M(long j2, long j3, int i2) {
        NestedScrollConnection nestedScrollConnection = this.parent;
        Offset m2156boximpl = nestedScrollConnection == null ? null : Offset.m2156boximpl(nestedScrollConnection.mo533onPostScrollDzOQY0M(j2, j3, i2));
        return m2156boximpl == null ? Offset.Companion.m2183getZeroF1C5BW0() : m2156boximpl.m2177unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: dispatchPreFling-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3689dispatchPreFlingQWom1Mo(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L2c
            r0 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r9
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r8 = r0
            goto L36
        L2c:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L67
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L5d
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r8 = r0
            goto L99
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L67:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r0.getParent$ui_release()
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L7c
            r0 = 0
            r8 = r0
            goto L9e
        L7c:
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            r2 = r8
            java.lang.Object r0 = r0.mo534onPreFlingQWom1Mo(r1, r2)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            r1 = r11
            if (r0 != r1) goto L99
            r0 = r11
            return r0
        L99:
            r0 = r8
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            r8 = r0
        L9e:
            r0 = r8
            if (r0 != 0) goto Lac
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m5031getZero9UxMQ8M()
            r6 = r0
            goto Lb1
        Lac:
            r0 = r8
            long r0 = r0.m5029unboximpl()
            r6 = r0
        Lb1:
            r0 = r6
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5011boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m3689dispatchPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk  reason: not valid java name */
    public final long m3690dispatchPreScrollOzD1aCk(long j2, int i2) {
        NestedScrollConnection nestedScrollConnection = this.parent;
        Offset m2156boximpl = nestedScrollConnection == null ? null : Offset.m2156boximpl(nestedScrollConnection.mo535onPreScrollOzD1aCk(j2, i2));
        return m2156boximpl == null ? Offset.Companion.m2183getZeroF1C5BW0() : m2156boximpl.m2177unboximpl();
    }

    @NotNull
    public final Function0<u0> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    @NotNull
    public final u0 getCoroutineScope() {
        u0 invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Nullable
    public final u0 getOriginNestedScrollScope$ui_release() {
        return this.originNestedScrollScope;
    }

    @Nullable
    public final NestedScrollConnection getParent$ui_release() {
        return this.parent;
    }

    public final void setCalculateNestedScrollScope$ui_release(@NotNull Function0<? extends u0> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.calculateNestedScrollScope = function0;
    }

    public final void setOriginNestedScrollScope$ui_release(@Nullable u0 u0Var) {
        this.originNestedScrollScope = u0Var;
    }

    public final void setParent$ui_release(@Nullable NestedScrollConnection nestedScrollConnection) {
        this.parent = nestedScrollConnection;
    }
}
