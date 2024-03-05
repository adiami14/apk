package s;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import s.a;
@Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020��H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020��H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", "a", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:s/b.class */
public final class b {
    @JvmName(name = "isSchedulerWorker")
    public static final boolean a(@NotNull Thread thread) {
        return thread instanceof a.c;
    }

    @JvmName(name = "mayNotBlock")
    public static final boolean b(@NotNull Thread thread) {
        return (thread instanceof a.c) && ((a.c) thread).f2148k == a.d.CPU_ACQUIRED;
    }
}
