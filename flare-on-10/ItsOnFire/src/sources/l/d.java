package l;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.n2;
import j.r0;
import j.y1;
import j.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��0\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u00022\b\u0012\u0004\u0012\u00028��0\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028��0\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Ll/d;", "E", "Ll/o;", "Ll/f;", "", "cause", "", "Z0", "exception", "", "H0", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ll/n;", "channel", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/n;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/d.class */
public class d<E> extends o<E> implements f<E> {
    public d(@NotNull CoroutineContext coroutineContext, @NotNull n<E> nVar, boolean z) {
        super(coroutineContext, nVar, false, z);
        J0((n2) coroutineContext.get(n2.f531b));
    }

    @Override // j.v2
    public boolean H0(@NotNull Throwable th) {
        r0.b(getContext(), th);
        return true;
    }

    @Override // j.v2
    public void Z0(@Nullable Throwable th) {
        n<E> x1 = x1();
        CancellationException cancellationException = null;
        CancellationException cancellationException2 = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException2 = (CancellationException) th;
            }
            cancellationException = cancellationException2;
            if (cancellationException2 == null) {
                cancellationException = y1.a(z0.a(this) + " was cancelled", th);
            }
        }
        x1.cancel(cancellationException);
    }
}
