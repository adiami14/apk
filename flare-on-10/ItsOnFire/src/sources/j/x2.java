package j;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��2\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B;\u0012\u0006\u0010\n\u001a\u00020\t\u0012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000eø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lj/x2;", "T", "Lj/d1;", "", "b1", "Lkotlin/coroutines/Continuation;", "l", "Lkotlin/coroutines/Continuation;", "continuation", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Lj/u0;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/x2.class */
public final class x2<T> extends d1<T> {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final Continuation<Unit> f617l;

    public x2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        Continuation<Unit> createCoroutineUnintercepted;
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
        this.f617l = createCoroutineUnintercepted;
    }

    @Override // j.v2
    public void b1() {
        r.a.c(this.f617l, this);
    }
}
