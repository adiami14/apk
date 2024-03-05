package l;

import j.e3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��\u0010\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003\"\u0004\b��\u0010��2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"E", "", "capacity", "Ll/i;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/j.class */
public final class j {
    @e3
    @NotNull
    public static final <E> i<E> a(int i2) {
        i gVar;
        if (i2 == -2) {
            gVar = new g(n.f727c.a());
        } else if (i2 == -1) {
            gVar = new z();
        } else if (i2 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else {
            if (i2 == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
            }
            gVar = new g(i2);
        }
        return gVar;
    }
}
