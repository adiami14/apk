package j;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b��\u0018��2\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020��8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lj/a3;", "Lq/w;", "Lj/g2;", "", "state", "k0", "toString", "", "b", "()Z", "isActive", "k", "()Lj/a3;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/a3.class */
public final class a3 extends q.w implements g2 {
    @Override // j.g2
    public boolean b() {
        return true;
    }

    @Override // j.g2
    @NotNull
    public a3 k() {
        return this;
    }

    @NotNull
    public final String k0(@NotNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        q.y yVar = (q.y) Q();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (Intrinsics.areEqual(yVar, this)) {
                sb.append("]");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            boolean z3 = z2;
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(u2Var);
                z3 = z2;
            }
            yVar = yVar.R();
            z = z3;
        }
    }

    @Override // q.y
    @NotNull
    public String toString() {
        return super.toString();
    }
}
