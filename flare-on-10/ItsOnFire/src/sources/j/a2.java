package j;

import j.e1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b��\u0018��2\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lj/a2;", "Lj/z1;", "Lj/e1;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "", "timeMillis", "Lj/q;", "continuation", "i", "Lj/p1;", "o", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "t", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "s", "Ljava/util/concurrent/Executor;", "k", "Ljava/util/concurrent/Executor;", "q", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/a2.class */
public final class a2 extends z1 implements e1 {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final Executor f438k;

    public a2(@NotNull Executor executor) {
        this.f438k = executor;
        q.f.c(q());
    }

    @Override // j.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor q2 = q();
        ExecutorService executorService = q2 instanceof ExecutorService ? (ExecutorService) q2 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r0 == null) goto L11;
     */
    @Override // j.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r5, @org.jetbrains.annotations.NotNull java.lang.Runnable r6) {
        /*
            r4 = this;
            r0 = r4
            java.util.concurrent.Executor r0 = r0.q()     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
            r7 = r0
            j.b r0 = j.c.b()     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L20
            r0 = r8
            r1 = r6
            java.lang.Runnable r0 = r0.i(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L23
        L20:
            r0 = r6
            r8 = r0
        L23:
            r0 = r7
            r1 = r8
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L2e
            goto L4e
        L2e:
            r8 = move-exception
            j.b r0 = j.c.b()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3f
            r0 = r9
            r0.f()
        L3f:
            r0 = r4
            r1 = r5
            r2 = r8
            r0.s(r1, r2)
            j.o0 r0 = j.m1.c()
            r1 = r5
            r2 = r6
            r0.dispatch(r1, r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a2.dispatch(kotlin.coroutines.CoroutineContext, java.lang.Runnable):void");
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof a2) && ((a2) obj).q() == q();
    }

    public int hashCode() {
        return System.identityHashCode(q());
    }

    @Override // j.e1
    public void i(long j2, @NotNull q<? super Unit> qVar) {
        Executor q2 = q();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = q2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) q2 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = t(scheduledExecutorService, new j3(this, qVar), qVar.getContext(), j2);
        }
        if (scheduledFuture != null) {
            r2.w(qVar, scheduledFuture);
        } else {
            a1.f430o.i(j2, qVar);
        }
    }

    @Override // j.e1
    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor q2 = q();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = q2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) q2 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = t(scheduledExecutorService, runnable, coroutineContext, j2);
        }
        return scheduledFuture != null ? new o1(scheduledFuture) : a1.f430o.o(j2, runnable, coroutineContext);
    }

    @Override // j.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p(long j2, @NotNull Continuation<? super Unit> continuation) {
        return e1.a.a(this, j2, continuation);
    }

    @Override // j.z1
    @NotNull
    public Executor q() {
        return this.f438k;
    }

    public final void s(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        r2.g(coroutineContext, y1.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> t(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j2) {
        ScheduledFuture<?> scheduledFuture;
        try {
            scheduledFuture = scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            s(coroutineContext, e2);
            scheduledFuture = null;
        }
        return scheduledFuture;
    }

    @Override // j.o0
    @NotNull
    public String toString() {
        return q().toString();
    }
}
