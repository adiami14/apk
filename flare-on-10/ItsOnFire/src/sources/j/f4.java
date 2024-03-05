package j;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020��H\u0086@ø\u0001��¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/f4.class */
public final class f4 {
    @Nullable
    public static final Object a(@NotNull Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object obj;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        CoroutineContext context = continuation.getContext();
        r2.A(context);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q.l lVar = intercepted instanceof q.l ? (q.l) intercepted : null;
        if (lVar == null) {
            obj = Unit.INSTANCE;
        } else {
            if (lVar.f2066m.isDispatchNeeded(context)) {
                lVar.n(context, Unit.INSTANCE);
            } else {
                e4 e4Var = new e4();
                CoroutineContext plus = context.plus(e4Var);
                Unit unit = Unit.INSTANCE;
                lVar.n(plus, unit);
                if (e4Var.f470j && !q.m.h(lVar)) {
                    obj = unit;
                }
            }
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            obj = coroutine_suspended;
        }
        Object obj2 = obj;
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (obj2 == coroutine_suspended2) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        Object obj3 = obj;
        coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return obj3 == coroutine_suspended3 ? obj : Unit.INSTANCE;
    }
}
