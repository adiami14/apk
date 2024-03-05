package p;

import j.i2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import l.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@i2
@Metadata(bv = {}, d1 = {"��\u001c\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lp/y;", "T", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/m0;", "j", "Ll/m0;", "channel", "<init>", "(Ll/m0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/y.class */
public final class y<T> implements o.j<T> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final m0<T> f2004j;

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull m0<? super T> m0Var) {
        this.f2004j = m0Var;
    }

    @Override // o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object U = this.f2004j.U(t2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return U == coroutine_suspended ? U : Unit.INSTANCE;
    }
}
