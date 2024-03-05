package j;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��4\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H��ø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH��ø\u0001��¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0011H��ø\u0001��¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lkotlin/Result;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lj/q;", "caller", "b", "(Ljava/lang/Object;Lj/q;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/k0.class */
public final class k0 {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull Continuation<? super T> continuation) {
        if (obj instanceof e0) {
            Result.Companion companion = Result.Companion;
            obj = ResultKt.createFailure(((e0) obj).f467a);
        } else {
            Result.Companion companion2 = Result.Companion;
        }
        return Result.m5849constructorimpl(obj);
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj, @NotNull q<?> qVar) {
        Throwable m5852exceptionOrNullimpl = Result.m5852exceptionOrNullimpl(obj);
        if (m5852exceptionOrNullimpl != null) {
            obj = new e0(m5852exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        f0 e0Var;
        Throwable m5852exceptionOrNullimpl = Result.m5852exceptionOrNullimpl(obj);
        if (m5852exceptionOrNullimpl == null) {
            e0Var = obj;
            if (function1 != null) {
                e0Var = new f0(obj, function1);
            }
        } else {
            e0Var = new e0(m5852exceptionOrNullimpl, false, 2, null);
        }
        return e0Var;
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        return c(obj, function1);
    }
}
