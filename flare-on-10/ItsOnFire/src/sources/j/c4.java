package j;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��8\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��*\u0006\b��\u0010\u0001 ��2\b\u0012\u0004\u0012\u00028��0\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028��0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lj/c4;", "T", "Lq/n0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "oldValue", "", "z1", "", "y1", "state", "s1", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "m", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/c4.class */
public final class c4<T> extends q.n0<T> {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public ThreadLocal<Pair<CoroutineContext, Object>> f451m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c4(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6) {
        /*
            r4 = this;
            j.d4 r0 = j.d4.f458j
            r7 = r0
            r0 = r5
            r1 = r7
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            if (r0 != 0) goto L19
            r0 = r5
            r1 = r7
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r1)
            r7 = r0
            goto L1b
        L19:
            r0 = r5
            r7 = r0
        L1b:
            r0 = r4
            r1 = r7
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r2 = r1
            r2.<init>()
            r0.f451m = r1
            r0 = r6
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            boolean r0 = r0 instanceof j.o0
            if (r0 != 0) goto L51
            r0 = r5
            r1 = 0
            java.lang.Object r0 = q.w0.c(r0, r1)
            r6 = r0
            r0 = r5
            r1 = r6
            q.w0.a(r0, r1)
            r0 = r4
            r1 = r5
            r2 = r6
            r0.z1(r1, r2)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c4.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    @Override // q.n0, j.a
    public void s1(@Nullable Object obj) {
        Pair<CoroutineContext, Object> pair = this.f451m.get();
        if (pair != null) {
            q.w0.a(pair.component1(), pair.component2());
            this.f451m.set(null);
        }
        Object a2 = k0.a(obj, this.f2081l);
        Continuation<T> continuation = this.f2081l;
        CoroutineContext context = continuation.getContext();
        Object c2 = q.w0.c(context, null);
        c4<?> c4Var = null;
        if (c2 != q.w0.f2100a) {
            c4Var = n0.g(continuation, context, c2);
        }
        try {
            this.f2081l.resumeWith(a2);
            Unit unit = Unit.INSTANCE;
            if (c4Var == null || c4Var.y1()) {
                q.w0.a(context, c2);
            }
        } catch (Throwable th) {
            if (c4Var == null || c4Var.y1()) {
                q.w0.a(context, c2);
            }
            throw th;
        }
    }

    public final boolean y1() {
        if (this.f451m.get() == null) {
            return false;
        }
        this.f451m.set(null);
        return true;
    }

    public final void z1(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        this.f451m.set(TuplesKt.to(coroutineContext, obj));
    }
}
