package j;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010��\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030��H��\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlin/coroutines/Continuation;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/z0.class */
public final class z0 {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String c(@NotNull Continuation<?> continuation) {
        String m5849constructorimpl;
        String str;
        if (continuation instanceof q.l) {
            str = continuation.toString();
        } else {
            try {
                Result.Companion companion = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(continuation + '@' + b(continuation));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m5852exceptionOrNullimpl(m5849constructorimpl) != null) {
                m5849constructorimpl = continuation.getClass().getName() + '@' + b(continuation);
            }
            str = (String) m5849constructorimpl;
        }
        return str;
    }
}
