package q;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020��R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lq/j0;", "", "affected", "c", "", "toString", "that", "", "b", "Lq/d;", "a", "()Lq/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/j0.class */
public abstract class j0 {
    @Nullable
    public abstract d<?> a();

    public final boolean b(@NotNull j0 j0Var) {
        d<?> a2;
        d<?> a3 = a();
        boolean z = false;
        if (a3 == null || (a2 = j0Var.a()) == null) {
            return false;
        }
        if (a3.g() < a2.g()) {
            z = true;
        }
        return z;
    }

    @Nullable
    public abstract Object c(@Nullable Object obj);

    @NotNull
    public String toString() {
        return j.z0.a(this) + '@' + j.z0.b(this);
    }
}
