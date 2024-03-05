package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.e1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b \u0018��2\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006<"}, d2 = {"Lj/u1;", "Lj/v1;", "Lj/e1;", "", "shutdown", "()V", "", "timeMillis", "Lj/q;", "continuation", "i", "(JLj/q;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lj/p1;", "c0", "(JLjava/lang/Runnable;)Lj/p1;", "D", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "T", "(Ljava/lang/Runnable;)V", "now", "Lj/u1$c;", "delayedTask", "a0", "(JLj/u1$c;)V", "Z", "", "U", "(Ljava/lang/Runnable;)Z", "S", "()Ljava/lang/Runnable;", "Q", "e0", "(Lj/u1$c;)Z", "", "b0", "(JLj/u1$c;)I", "V", "value", "e", "()Z", "d0", "(Z)V", "isCompleted", "A", "isEmpty", "w", "nextTime", "<init>", "a", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/u1.class */
public abstract class u1 extends v1 implements e1 {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f563m = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_queue");

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f564n = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_delayed");
    @NotNull
    private volatile /* synthetic */ Object _queue = null;
    @NotNull
    private volatile /* synthetic */ Object _delayed = null;
    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    @Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lj/u1$a;", "Lj/u1$c;", "", "run", "", "toString", "Lj/q;", "l", "Lj/q;", "cont", "", "nanoTime", "<init>", "(Lj/u1;JLj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:j/u1$a.class */
    public final class a extends c {
        @NotNull

        /* renamed from: l  reason: collision with root package name */
        public final q<Unit> f565l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, @NotNull q<? super Unit> qVar) {
            super(j2);
            this.f565l = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f565l.t(u1.this, Unit.INSTANCE);
        }

        @Override // j.u1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f565l;
        }
    }

    @Metadata(bv = {}, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018��2\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lj/u1$b;", "Lj/u1$c;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "l", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:j/u1$b.class */
    public static final class b extends c {
        @NotNull

        /* renamed from: l  reason: collision with root package name */
        public final Runnable f567l;

        public b(long j2, @NotNull Runnable runnable) {
            super(j2);
            this.f567l = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f567l.run();
        }

        @Override // j.u1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f567l;
        }
    }

    @Metadata(bv = {}, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010��\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018��2\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020��0\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020��H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lj/u1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lj/p1;", "Lq/b1;", "other", "", "c", "", "now", "", "e", "Lj/u1$d;", "delayed", "Lj/u1;", "eventLoop", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "dispose", "", "toString", "j", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "k", "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "Lq/a1;", "value", "a", "()Lq/a1;", "b", "(Lq/a1;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:j/u1$c.class */
    public static abstract class c implements Runnable, Comparable<c>, p1, q.b1 {
        @Nullable
        private volatile Object _heap;
        @JvmField

        /* renamed from: j  reason: collision with root package name */
        public long f568j;

        /* renamed from: k  reason: collision with root package name */
        public int f569k = -1;

        public c(long j2) {
            this.f568j = j2;
        }

        @Override // q.b1
        @Nullable
        public q.a1<?> a() {
            Object obj = this._heap;
            return obj instanceof q.a1 ? (q.a1) obj : null;
        }

        @Override // q.b1
        public void b(@Nullable q.a1<?> a1Var) {
            q.r0 r0Var;
            Object obj = this._heap;
            r0Var = x1.f609a;
            if (!(obj != r0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = a1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(@NotNull c cVar) {
            int i2 = ((this.f568j - cVar.f568j) > 0L ? 1 : ((this.f568j - cVar.f568j) == 0L ? 0 : -1));
            return i2 > 0 ? 1 : i2 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x007e A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0002, B:13:0x001d, B:18:0x0034, B:41:0x0089, B:15:0x001f, B:25:0x003e, B:34:0x006a, B:37:0x007e, B:39:0x0084, B:26:0x0046, B:31:0x005c), top: B:54:0x0002 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int d(long r6, @org.jetbrains.annotations.NotNull j.u1.d r8, @org.jetbrains.annotations.NotNull j.u1 r9) {
            /*
                r5 = this;
                r0 = r5
                monitor-enter(r0)
                r0 = r5
                java.lang.Object r0 = r0._heap     // Catch: java.lang.Throwable -> L97
                r10 = r0
                q.r0 r0 = j.x1.b()     // Catch: java.lang.Throwable -> L97
                r11 = r0
                r0 = r10
                r1 = r11
                if (r0 != r1) goto L1c
                r0 = 2
                r12 = r0
            L17:
                r0 = r5
                monitor-exit(r0)
                r0 = r12
                return r0
            L1c:
                r0 = r8
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L97
                r0 = r8
                q.b1 r0 = r0.f()     // Catch: java.lang.Throwable -> L90
                j.u1$c r0 = (j.u1.c) r0     // Catch: java.lang.Throwable -> L90
                r11 = r0
                r0 = r9
                boolean r0 = j.u1.O(r0)     // Catch: java.lang.Throwable -> L90
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L39
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
                r0 = r5
                monitor-exit(r0)
                r0 = 1
                return r0
            L39:
                r0 = r11
                if (r0 != 0) goto L46
            L3e:
                r0 = r8
                r1 = r6
                r0.f570b = r1     // Catch: java.lang.Throwable -> L90
                goto L6a
            L46:
                r0 = r11
                long r0 = r0.f568j     // Catch: java.lang.Throwable -> L90
                r14 = r0
                r0 = r14
                r1 = r6
                long r0 = r0 - r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L59
                goto L5c
            L59:
                r0 = r14
                r6 = r0
            L5c:
                r0 = r6
                r1 = r8
                long r1 = r1.f570b     // Catch: java.lang.Throwable -> L90
                long r0 = r0 - r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6a
                goto L3e
            L6a:
                r0 = r5
                long r0 = r0.f568j     // Catch: java.lang.Throwable -> L90
                r14 = r0
                r0 = r8
                long r0 = r0.f570b     // Catch: java.lang.Throwable -> L90
                r6 = r0
                r0 = r14
                r1 = r6
                long r0 = r0 - r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L83
                r0 = r5
                r1 = r6
                r0.f568j = r1     // Catch: java.lang.Throwable -> L90
            L83:
                r0 = r8
                r1 = r5
                r0.a(r1)     // Catch: java.lang.Throwable -> L90
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
                r0 = 0
                r12 = r0
                goto L17
            L90:
                r9 = move-exception
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
                r0 = r9
                throw r0     // Catch: java.lang.Throwable -> L97
            L97:
                r8 = move-exception
                r0 = r5
                monitor-exit(r0)
                r0 = r8
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j.u1.c.d(long, j.u1$d, j.u1):int");
        }

        @Override // j.p1
        public final void dispose() {
            q.r0 r0Var;
            q.r0 r0Var2;
            synchronized (this) {
                Object obj = this._heap;
                r0Var = x1.f609a;
                if (obj == r0Var) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.k(this);
                }
                r0Var2 = x1.f609a;
                this._heap = r0Var2;
            }
        }

        public final boolean e(long j2) {
            return j2 - this.f568j >= 0;
        }

        @Override // q.b1
        public int getIndex() {
            return this.f569k;
        }

        @Override // q.b1
        public void setIndex(int i2) {
            this.f569k = i2;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f568j + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lj/u1$d;", "Lq/a1;", "Lj/u1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:j/u1$d.class */
    public static final class d extends q.a1<c> {
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public long f570b;

        public d(long j2) {
            this.f570b = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public final boolean e() {
        return this._isCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0 == r1) goto L12;
     */
    @Override // j.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.C()
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r3
            java.lang.Object r0 = r0._delayed
            j.u1$d r0 = (j.u1.d) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r6
            boolean r0 = r0.h()
            if (r0 != 0) goto L22
            r0 = 0
            return r0
        L22:
            r0 = r3
            java.lang.Object r0 = r0._queue
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L30
        L2b:
            r0 = 1
            r5 = r0
            goto L4c
        L30:
            r0 = r6
            boolean r0 = r0 instanceof q.b0
            if (r0 == 0) goto L42
            r0 = r6
            q.b0 r0 = (q.b0) r0
            boolean r0 = r0.h()
            r5 = r0
            goto L4c
        L42:
            r0 = r6
            q.r0 r1 = j.x1.a()
            if (r0 != r1) goto L4c
            goto L2b
        L4c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.u1.A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    @Override // j.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long D() {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.E()
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            java.lang.Object r0 = r0._delayed
            j.u1$d r0 = (j.u1.d) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7f
            r0 = r5
            boolean r0 = r0.h()
            if (r0 != 0) goto L7f
            j.b r0 = j.c.b()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2c
            r0 = r6
            long r0 = r0.b()
            r7 = r0
            goto L30
        L2c:
            long r0 = java.lang.System.nanoTime()
            r7 = r0
        L30:
            r0 = r5
            monitor-enter(r0)
            r0 = r5
            q.b1 r0 = r0.f()     // Catch: java.lang.Throwable -> L7a
            r9 = r0
            r0 = 0
            r6 = r0
            r0 = r9
            if (r0 != 0) goto L44
        L3f:
            r0 = r5
            monitor-exit(r0)
            goto L70
        L44:
            r0 = r9
            j.u1$c r0 = (j.u1.c) r0     // Catch: java.lang.Throwable -> L7a
            r9 = r0
            r0 = r9
            r1 = r7
            boolean r0 = r0.e(r1)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L5f
            r0 = r4
            r1 = r9
            boolean r0 = r0.U(r1)     // Catch: java.lang.Throwable -> L7a
            r10 = r0
            goto L62
        L5f:
            r0 = 0
            r10 = r0
        L62:
            r0 = r10
            if (r0 == 0) goto L3f
            r0 = r5
            r1 = 0
            q.b1 r0 = r0.l(r1)     // Catch: java.lang.Throwable -> L7a
            r6 = r0
            goto L3f
        L70:
            r0 = r6
            j.u1$c r0 = (j.u1.c) r0
            if (r0 != 0) goto L30
            goto L7f
        L7a:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r6
            throw r0
        L7f:
            r0 = r4
            java.lang.Runnable r0 = r0.S()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L90
            r0 = r6
            r0.run()
            r0 = 0
            return r0
        L90:
            r0 = r4
            long r0 = r0.w()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.u1.D():long");
    }

    public final void Q() {
        q.r0 r0Var;
        q.r0 r0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f563m;
                r0Var = x1.f616h;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, r0Var)) {
                    return;
                }
            } else if (obj instanceof q.b0) {
                ((q.b0) obj).d();
                return;
            } else {
                r0Var2 = x1.f616h;
                if (obj == r0Var2) {
                    return;
                }
                q.b0 b0Var = new q.b0(8, true);
                b0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f563m, this, obj, b0Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable S() {
        q.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof q.b0) {
                q.b0 b0Var = (q.b0) obj;
                Object l2 = b0Var.l();
                if (l2 != q.b0.f2028t) {
                    return (Runnable) l2;
                }
                androidx.concurrent.futures.a.a(f563m, this, obj, b0Var.k());
            } else {
                r0Var = x1.f616h;
                if (obj == r0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f563m, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void T(@NotNull Runnable runnable) {
        if (U(runnable)) {
            L();
        } else {
            a1.f430o.T(runnable);
        }
    }

    public final boolean U(Runnable runnable) {
        q.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (e()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f563m, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof q.b0) {
                q.b0 b0Var = (q.b0) obj;
                int a2 = b0Var.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    androidx.concurrent.futures.a.a(f563m, this, obj, b0Var.k());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                r0Var = x1.f616h;
                if (obj == r0Var) {
                    return false;
                }
                q.b0 b0Var2 = new q.b0(8, true);
                b0Var2.a((Runnable) obj);
                b0Var2.a(runnable);
                if (androidx.concurrent.futures.a.a(f563m, this, obj, b0Var2)) {
                    return true;
                }
            }
        }
    }

    public final void V() {
        c n2;
        j.b b2 = j.c.b();
        long b3 = b2 != null ? b2.b() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (n2 = dVar.n()) == null) {
                return;
            }
            J(b3, n2);
        }
    }

    public final void Z() {
        this._queue = null;
        this._delayed = null;
    }

    public final void a0(long j2, @NotNull c cVar) {
        int b0 = b0(j2, cVar);
        if (b0 == 0) {
            if (e0(cVar)) {
                L();
            }
        } else if (b0 == 1) {
            J(j2, cVar);
        } else if (b0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final int b0(long j2, c cVar) {
        if (e()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        d dVar2 = dVar;
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f564n, this, null, new d(j2));
            Object obj = this._delayed;
            Intrinsics.checkNotNull(obj);
            dVar2 = (d) obj;
        }
        return cVar.d(j2, dVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j.c3] */
    @NotNull
    public final p1 c0(long j2, @NotNull Runnable runnable) {
        b bVar;
        long d2 = x1.d(j2);
        if (d2 < 4611686018427387903L) {
            j.b b2 = j.c.b();
            long b3 = b2 != null ? b2.b() : System.nanoTime();
            bVar = new b(d2 + b3, runnable);
            a0(b3, bVar);
        } else {
            bVar = c3.f450j;
        }
        return bVar;
    }

    public final void d0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    @Override // j.o0
    public final void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        T(runnable);
    }

    public final boolean e0(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar != null ? dVar.i() : null) == cVar;
    }

    @Override // j.e1
    public void i(long j2, @NotNull q<? super Unit> qVar) {
        long d2 = x1.d(j2);
        if (d2 < 4611686018427387903L) {
            j.b b2 = j.c.b();
            long b3 = b2 != null ? b2.b() : System.nanoTime();
            a aVar = new a(d2 + b3, qVar);
            a0(b3, aVar);
            t.a(qVar, aVar);
        }
    }

    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return e1.a.b(this, j2, runnable, coroutineContext);
    }

    @Override // j.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p(long j2, @NotNull Continuation<? super Unit> continuation) {
        return e1.a.a(this, j2, continuation);
    }

    @Override // j.t1
    public void shutdown() {
        u3.f572a.c();
        d0(true);
        Q();
        do {
        } while (D() <= 0);
        V();
    }

    @Override // j.t1
    public long w() {
        c i2;
        long coerceAtLeast;
        q.r0 r0Var;
        if (super.w() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof q.b0)) {
                r0Var = x1.f616h;
                return obj == r0Var ? Long.MAX_VALUE : 0L;
            } else if (!((q.b0) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (i2 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = i2.f568j;
        j.b b2 = j.c.b();
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j2 - (b2 != null ? b2.b() : System.nanoTime()), 0L);
        return coerceAtLeast;
    }
}
