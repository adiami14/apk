package q;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"��\f\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020��H��¨\u0006\u0003"}, d2 = {"", "", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/t.class */
public final class t {
    public static final void a(int i2) {
        boolean z = true;
        if (i2 < 1) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
    }
}
