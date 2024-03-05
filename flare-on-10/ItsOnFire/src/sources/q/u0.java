package q;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010��2\u0006\u0010\u0001\u001a\u00020��H��\"\u001a\u0010\u0007\u001a\u00020\u00038��X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "propertyName", "b", "", "a", "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: ItsOnFire.jar:q/u0.class */
public final /* synthetic */ class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2099a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f2099a;
    }

    @Nullable
    public static final String b(@NotNull String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e2) {
            str2 = null;
        }
        return str2;
    }
}
