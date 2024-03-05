package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c2;
import j.i2;
import j.p1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0006\b��\u0018��2\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0097Aø\u0001��¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0096\u0001J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0017J#\u0010\u001a\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0082\bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0014\u0010\u001d\u001a\u00020\u001b2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u001e\u0010'\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010,\u001a\u00060(j\u0002`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lq/s;", "Lj/o0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lj/e1;", "", "time", "", "p", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lj/p1;", "o", "Lj/q;", "continuation", "i", "", "parallelism", "limitedParallelism", "run", "dispatch", "dispatchYield", "Lkotlin/Function0;", "s", "", "t", "q", "j", "Lj/o0;", "dispatcher", "k", "I", "runningWorkers", "Lq/a0;", "m", "Lq/a0;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lj/o0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/s.class */
public final class s extends j.o0 implements Runnable, j.e1 {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final j.o0 f2094j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2095k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ j.e1 f2096l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final a0<Runnable> f2097m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final Object f2098n;
    private volatile int runningWorkers;

    public s(@NotNull j.o0 o0Var, int i2) {
        this.f2094j = o0Var;
        this.f2095k = i2;
        j.e1 e1Var = o0Var instanceof j.e1 ? (j.e1) o0Var : null;
        this.f2096l = e1Var == null ? j.b1.a() : e1Var;
        this.f2097m = new a0<>(false);
        this.f2098n = new Object();
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (q(runnable) || !t()) {
            return;
        }
        this.f2094j.dispatch(this, this);
    }

    @Override // j.o0
    @i2
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (q(runnable) || !t()) {
            return;
        }
        this.f2094j.dispatchYield(this, this);
    }

    @Override // j.e1
    public void i(long j2, @NotNull j.q<? super Unit> qVar) {
        this.f2096l.i(j2, qVar);
    }

    @Override // j.o0
    @c2
    @NotNull
    public j.o0 limitedParallelism(int i2) {
        t.a(i2);
        return i2 >= this.f2095k ? this : super.limitedParallelism(i2);
    }

    @Override // j.e1
    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f2096l.o(j2, runnable, coroutineContext);
    }

    @Override // j.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p(long j2, @NotNull Continuation<? super Unit> continuation) {
        return this.f2096l.p(j2, continuation);
    }

    public final boolean q(Runnable runnable) {
        this.f2097m.a(runnable);
        return this.runningWorkers >= this.f2095k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r4.f2098n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (r4.f2097m.c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        r4.runningWorkers++;
        r0 = kotlin.Unit.INSTANCE;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
        L0:
            r0 = 0
            r5 = r0
        L2:
            r0 = r4
            q.a0<java.lang.Runnable> r0 = r0.f2097m
            java.lang.Object r0 = r0.g()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L45
            r0 = r6
            r0.run()     // Catch: java.lang.Throwable -> L1a
            goto L22
        L1a:
            r6 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r1 = r6
            j.r0.b(r0, r1)
        L22:
            r0 = r5
            r1 = 1
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = 16
            if (r0 < r1) goto L2
            r0 = r7
            r5 = r0
            r0 = r4
            j.o0 r0 = r0.f2094j
            r1 = r4
            boolean r0 = r0.isDispatchNeeded(r1)
            if (r0 == 0) goto L2
            r0 = r4
            j.o0 r0 = r0.f2094j
            r1 = r4
            r2 = r4
            r0.dispatch(r1, r2)
            return
        L45:
            r0 = r4
            java.lang.Object r0 = r0.f2098n
            r6 = r0
            r0 = r6
            monitor-enter(r0)
            r0 = r4
            r1 = r4
            int r1 = r1.runningWorkers     // Catch: java.lang.Throwable -> L79
            r2 = 1
            int r1 = r1 - r2
            r0.runningWorkers = r1     // Catch: java.lang.Throwable -> L79
            r0 = r4
            q.a0<java.lang.Runnable> r0 = r0.f2097m     // Catch: java.lang.Throwable -> L79
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L79
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L65
            r0 = r6
            monitor-exit(r0)
            return
        L65:
            r0 = r4
            r1 = r4
            int r1 = r1.runningWorkers     // Catch: java.lang.Throwable -> L79
            r2 = 1
            int r1 = r1 + r2
            r0.runningWorkers = r1     // Catch: java.lang.Throwable -> L79
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L79
            r8 = r0
            r0 = r6
            monitor-exit(r0)
            goto L0
        L79:
            r8 = move-exception
            r0 = r6
            monitor-exit(r0)
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.s.run():void");
    }

    public final void s(Runnable runnable, Function0<Unit> function0) {
        if (!q(runnable) && t()) {
            function0.invoke();
        }
    }

    public final boolean t() {
        synchronized (this.f2098n) {
            if (this.runningWorkers >= this.f2095k) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }
}
