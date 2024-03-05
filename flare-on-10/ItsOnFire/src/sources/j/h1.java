package j;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0003\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��2\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lj/h1;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "getLocalizedMessage", "", "fillInStackTrace", "Lkotlin/coroutines/CoroutineContext;", "j", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/h1.class */
public final class h1 extends RuntimeException {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f487j;

    public h1(@NotNull CoroutineContext coroutineContext) {
        this.f487j = coroutineContext;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getLocalizedMessage() {
        return this.f487j.toString();
    }
}
