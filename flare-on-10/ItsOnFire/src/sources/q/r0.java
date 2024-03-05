package q;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u000e\n\u0002\b\n\b��\u0018��2\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00028��\"\u0004\b��\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lq/r0;", "", "", "toString", "T", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "symbol", "<init>", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/r0.class */
public final class r0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final String f2093a;

    public r0(@NotNull String str) {
        this.f2093a = str;
    }

    public final <T> T a(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj == this) {
            obj2 = null;
        }
        return (T) obj2;
    }

    @NotNull
    public String toString() {
        return '<' + this.f2093a + '>';
    }
}
