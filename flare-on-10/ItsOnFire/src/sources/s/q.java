package s;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��>\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020��¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020��¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020��2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Ls/q;", "", "Ls/k;", "h", "()Ls/k;", "task", "", "fair", "a", "(Ls/k;Z)Ls/k;", "victim", "", "l", "(Ls/q;)J", "k", "Ls/f;", "globalQueue", "", "g", "(Ls/f;)V", "c", "(Ls/k;)Ls/k;", "blockingOnly", "m", "(Ls/q;Z)J", "queue", "j", "(Ls/f;)Z", "i", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ls/k;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:s/q.class */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2195b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2196c = AtomicIntegerFieldUpdater.newUpdater(q.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2197d = AtomicIntegerFieldUpdater.newUpdater(q.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2198e = AtomicIntegerFieldUpdater.newUpdater(q.class, "blockingTasksInBuffer");
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<k> f2199a = new AtomicReferenceArray<>(128);
    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ k b(q qVar, k kVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return qVar.a(kVar, z);
    }

    @Nullable
    public final k a(@NotNull k kVar, boolean z) {
        if (z) {
            return c(kVar);
        }
        k kVar2 = (k) f2195b.getAndSet(this, kVar);
        if (kVar2 == null) {
            return null;
        }
        return c(kVar2);
    }

    public final k c(k kVar) {
        boolean z = true;
        if (kVar.f2181k.f() != 1) {
            z = false;
        }
        if (z) {
            f2198e.incrementAndGet(this);
        }
        if (e() == 127) {
            return kVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.f2199a.get(i2) != null) {
            Thread.yield();
        }
        this.f2199a.lazySet(i2, kVar);
        f2196c.incrementAndGet(this);
        return null;
    }

    public final void d(k kVar) {
        if (kVar != null) {
            boolean z = true;
            if (kVar.f2181k.f() != 1) {
                z = false;
            }
            if (z) {
                f2198e.decrementAndGet(this);
            }
        }
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        Object obj = this.lastScheduledTask;
        int e2 = e();
        int i2 = e2;
        if (obj != null) {
            i2 = e2 + 1;
        }
        return i2;
    }

    public final void g(@NotNull f fVar) {
        k kVar = (k) f2195b.getAndSet(this, null);
        if (kVar != null) {
            fVar.a(kVar);
        }
        do {
        } while (j(fVar));
    }

    @Nullable
    public final k h() {
        k kVar = (k) f2195b.getAndSet(this, null);
        k kVar2 = kVar;
        if (kVar == null) {
            kVar2 = i();
        }
        return kVar2;
    }

    public final k i() {
        k andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            if (f2197d.compareAndSet(this, i2, i2 + 1) && (andSet = this.f2199a.getAndSet(i2 & 127, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    public final boolean j(f fVar) {
        k i2 = i();
        if (i2 == null) {
            return false;
        }
        fVar.a(i2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        return m(r7, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(@org.jetbrains.annotations.NotNull s.q r7) {
        /*
            r6 = this;
            r0 = r7
            int r0 = r0.consumerIndex
            r8 = r0
            r0 = r7
            int r0 = r0.producerIndex
            r9 = r0
            r0 = r7
            java.util.concurrent.atomic.AtomicReferenceArray<s.k> r0 = r0.f2199a
            r10 = r0
        L10:
            r0 = 1
            r11 = r0
            r0 = r8
            r1 = r9
            if (r0 == r1) goto L78
            r0 = r8
            r1 = 127(0x7f, float:1.78E-43)
            r0 = r0 & r1
            r12 = r0
            r0 = r7
            int r0 = r0.blockingTasksInBuffer
            if (r0 == 0) goto L78
            r0 = r10
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            s.k r0 = (s.k) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L72
            r0 = r13
            s.l r0 = r0.f2181k
            int r0 = r0.f()
            r1 = 1
            if (r0 != r1) goto L47
            goto L4a
        L47:
            r0 = 0
            r11 = r0
        L4a:
            r0 = r11
            if (r0 == 0) goto L72
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = 0
            boolean r0 = n.b.a(r0, r1, r2, r3)
            if (r0 == 0) goto L72
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = s.q.f2198e
            r1 = r7
            int r0 = r0.decrementAndGet(r1)
            r0 = r6
            r1 = r13
            r2 = 0
            r3 = 2
            r4 = 0
            s.k r0 = b(r0, r1, r2, r3, r4)
            r0 = -1
            return r0
        L72:
            int r8 = r8 + 1
            goto L10
        L78:
            r0 = r6
            r1 = r7
            r2 = 1
            long r0 = r0.m(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.q.k(s.q):long");
    }

    public final long l(@NotNull q qVar) {
        k i2 = qVar.i();
        if (i2 != null) {
            b(this, i2, false, 2, null);
            return -1L;
        }
        return m(qVar, false);
    }

    public final long m(q qVar, boolean z) {
        k kVar;
        do {
            kVar = (k) qVar.lastScheduledTask;
            if (kVar == null) {
                return -2L;
            }
            if (z) {
                boolean z2 = true;
                if (kVar.f2181k.f() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2L;
                }
            }
            long a2 = o.f2189f.a() - kVar.f2180j;
            long j2 = o.f2185b;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!androidx.concurrent.futures.a.a(f2195b, qVar, kVar, null));
        b(this, kVar, false, 2, null);
        return -1L;
    }
}
