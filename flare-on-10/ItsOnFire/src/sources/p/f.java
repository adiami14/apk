package p;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.w0;
@Metadata(bv = {}, d1 = {"��*\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0001H��\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028��0\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028��\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lo/i;", "Lp/e;", "b", "Lo/j;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/f.class */
public final class f {
    public static final /* synthetic */ o.j a(o.j jVar, CoroutineContext coroutineContext) {
        return e(jVar, coroutineContext);
    }

    @NotNull
    public static final <T> e<T> b(@NotNull o.i<? extends T> iVar) {
        i iVar2 = iVar instanceof e ? (e) iVar : null;
        i iVar3 = iVar2;
        if (iVar2 == null) {
            iVar3 = new i(iVar, null, 0, null, 14, null);
        }
        return iVar3;
    }

    @Nullable
    public static final <T, V> Object c(@NotNull CoroutineContext coroutineContext, V v2, @NotNull Object obj, @NotNull Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Object c2 = w0.c(coroutineContext, obj);
        try {
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(v2, new z(continuation, coroutineContext));
            w0.a(coroutineContext, c2);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return invoke;
        } catch (Throwable th) {
            w0.a(coroutineContext, c2);
            throw th;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i2, Object obj3) {
        if ((i2 & 4) != 0) {
            obj2 = w0.b(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, function2, continuation);
    }

    public static final <T> o.j<T> e(o.j<? super T> jVar, CoroutineContext coroutineContext) {
        if (!(jVar instanceof y ? true : jVar instanceof t)) {
            jVar = new b0(jVar, coroutineContext);
        }
        return (o.j<T>) jVar;
    }
}
