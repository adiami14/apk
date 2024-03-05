package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {565, 566}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1.class */
public final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ long $timeMillis;
    public int label;
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(long j2, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, Continuation<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1> continuation) {
        super(2, continuation);
        this.$timeMillis = j2;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2f
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L28
            r0 = r9
            r1 = 2
            if (r0 != r1) goto L1e
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L5c
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L28:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L4c
        L2f:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            long r0 = r0.$timeMillis
            r10 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = 1
            long r0 = r0 - r1
            r1 = r6
            java.lang.Object r0 = j.f1.b(r0, r1)
            r1 = r8
            if (r0 != r1) goto L4c
            r0 = r8
            return r0
        L4c:
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = 1
            r1 = r6
            java.lang.Object r0 = j.f1.b(r0, r1)
            r1 = r8
            if (r0 != r1) goto L5c
            r0 = r8
            return r0
        L5c:
            r0 = r6
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r0 = r0.this$0
            j.q r0 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.access$getPointerAwaiter$p(r0)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L6b
            goto L86
        L6b:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r8 = r0
            r0 = r7
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r1 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2 = r1
            r3 = r6
            long r3 = r3.$timeMillis
            r2.<init>(r3)
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m5849constructorimpl(r1)
            r0.resumeWith(r1)
        L86:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
