package q;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028��0\u0001H\u0080\b¨\u0006\u0004"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "completion", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/k0.class */
public final class k0 {
    @NotNull
    public static final <T> Continuation<T> a(@NotNull Continuation<? super T> continuation) {
        return DebugProbesKt.probeCoroutineCreated(continuation);
    }
}
