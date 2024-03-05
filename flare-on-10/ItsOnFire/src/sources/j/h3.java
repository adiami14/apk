package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u001e\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��*\u0004\b��\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lj/h3;", "T", "Lj/u2;", "", "cause", "", "g0", "Lj/r;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lj/r;", "continuation", "<init>", "(Lj/r;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/h3.class */
public final class h3<T> extends u2 {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final r<T> f489n;

    /* JADX WARN: Multi-variable type inference failed */
    public h3(@NotNull r<? super T> rVar) {
        this.f489n = rVar;
    }

    @Override // j.g0
    public void g0(@Nullable Throwable th) {
        Object o2;
        Object G0 = h0().G0();
        boolean z = G0 instanceof e0;
        r<T> rVar = this.f489n;
        if (z) {
            Result.Companion companion = Result.Companion;
            o2 = ResultKt.createFailure(((e0) G0).f467a);
        } else {
            Result.Companion companion2 = Result.Companion;
            o2 = w2.o(G0);
        }
        rVar.resumeWith(Result.m5849constructorimpl(o2));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        g0(th);
        return Unit.INSTANCE;
    }
}
