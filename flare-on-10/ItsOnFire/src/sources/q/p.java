package q;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
@Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020��8��X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/p.class */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2086a;

    static {
        Object m5849constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
        }
        f2086a = Result.m5856isSuccessimpl(m5849constructorimpl);
    }

    public static final boolean a() {
        return f2086a;
    }
}
