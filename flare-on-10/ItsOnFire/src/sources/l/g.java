package l;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0084\u0001\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\b��\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u00022\b\u0012\u0004\u0012\u00028��0\u0003:\u0001\fB\u000f\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\bQ\u0010OJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028��H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028��2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010 \u001a\u00020\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028��\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028��\u0018\u00010\u001dH\u0082\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00028��2\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R6\u0010;\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u001d06j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u001d`78\u0002X\u0082\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u001cR\u0014\u0010>\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010I\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010$\"\u0004\bG\u0010HR$\u0010L\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010HR$\u0010P\u001a\u00020(2\u0006\u0010E\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010O¨\u0006R"}, d2 = {"Ll/g;", "E", "Ll/c;", "Ll/i;", "Ll/i0;", "J", "()Ll/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lt/f;", "select", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "W", "X", "()V", "Ll/g$a;", "addSub", "removeSub", "i0", "(Ll/g$a;Ll/g$a;)V", "", "Y", "()J", FirebaseAnalytics.Param.INDEX, "Z", "(J)Ljava/lang/Object;", "", "m", "a0", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "o", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "p", "Ljava/util/List;", "getSubscribers$annotations", "subscribers", "B", "()Z", "isBufferAlwaysFull", "C", "isBufferFull", "", "l", "()Ljava/lang/String;", "bufferDebugString", "value", "b0", "f0", "(J)V", "head", "e0", "h0", "tail", "c0", "g0", "(I)V", "size", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/g.class */
public final class g<E> extends c<E> implements i<E> {
    @NotNull
    private volatile /* synthetic */ long _head;
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    private volatile /* synthetic */ long _tail;

    /* renamed from: m  reason: collision with root package name */
    public final int f699m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final ReentrantLock f700n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final Object[] f701o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final List<a<E>> f702p;

    @Metadata(bv = {}, d1 = {"��H\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018��*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0014\u0010'\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0014\u0010)\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0014\u0010+\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\n¨\u0006."}, d2 = {"Ll/g$a;", "E", "Ll/a;", "Ll/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "r0", "()Z", "", "l0", "()Ljava/lang/Object;", "Lt/f;", "select", "m0", "(Lt/f;)Ljava/lang/Object;", "t0", "u0", "Ll/g;", "m", "Ll/g;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "s0", "()J", "v0", "(J)V", "subHead", "e0", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "B", "isBufferAlwaysFull", "C", "isBufferFull", "<init>", "(Ll/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/g$a.class */
    public static final class a<E> extends l.a<E> implements i0<E> {
        @NotNull
        private volatile /* synthetic */ long _subHead;
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final g<E> f703m;
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final ReentrantLock f704n;

        public a(@NotNull g<E> gVar) {
            super(null);
            this.f703m = gVar;
            this.f704n = new ReentrantLock();
            this._subHead = 0L;
        }

        @Override // l.c
        public boolean B() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // l.c
        public boolean C() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // l.c, l.m0
        public boolean G(@Nullable Throwable th) {
            boolean G = super.G(th);
            if (G) {
                g.j0(this.f703m, null, this, 1, null);
                ReentrantLock reentrantLock = this.f704n;
                reentrantLock.lock();
                try {
                    v0(this.f703m.e0());
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return G;
        }

        @Override // l.a
        public boolean e0() {
            return false;
        }

        @Override // l.a
        public boolean f0() {
            return s0() >= this.f703m.e0();
        }

        @Override // l.a
        @Nullable
        public Object l0() {
            boolean z;
            ReentrantLock reentrantLock = this.f704n;
            reentrantLock.lock();
            try {
                Object u0 = u0();
                if ((u0 instanceof w) || u0 == b.f677f) {
                    z = false;
                } else {
                    v0(s0() + 1);
                    z = true;
                }
                reentrantLock.unlock();
                w wVar = u0 instanceof w ? (w) u0 : null;
                if (wVar != null) {
                    G(wVar.f986m);
                }
                if (r0()) {
                    z = true;
                }
                if (z) {
                    g.j0(this.f703m, null, null, 3, null);
                }
                return u0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // l.a
        @Nullable
        public Object m0(@NotNull t.f<?> fVar) {
            ReentrantLock reentrantLock = this.f704n;
            reentrantLock.lock();
            try {
                Object u0 = u0();
                Object obj = u0;
                boolean z = false;
                if (!(u0 instanceof w)) {
                    obj = u0;
                    z = false;
                    if (u0 != b.f677f) {
                        if (fVar.i()) {
                            v0(s0() + 1);
                            z = true;
                            obj = u0;
                        } else {
                            obj = t.g.d();
                            z = false;
                        }
                    }
                }
                reentrantLock.unlock();
                w wVar = obj instanceof w ? (w) obj : null;
                if (wVar != null) {
                    G(wVar.f986m);
                }
                if (r0()) {
                    z = true;
                }
                if (z) {
                    g.j0(this.f703m, null, null, 3, null);
                }
                return obj;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            r11 = (l.w) r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean r0() {
            /*
                r6 = this;
                r0 = 0
                r7 = r0
            L2:
                r0 = r6
                boolean r0 = r0.t0()
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = r9
                r11 = r0
                r0 = r8
                if (r0 == 0) goto Laa
                r0 = r9
                r11 = r0
                r0 = r6
                java.util.concurrent.locks.ReentrantLock r0 = r0.f704n
                boolean r0 = r0.tryLock()
                if (r0 == 0) goto Laa
                r0 = r6
                java.lang.Object r0 = r0.u0()     // Catch: java.lang.Throwable -> L9e
                r11 = r0
                q.r0 r0 = l.b.f677f     // Catch: java.lang.Throwable -> L9e
                r9 = r0
                r0 = r11
                r1 = r9
                if (r0 != r1) goto L3a
            L30:
                r0 = r6
                java.util.concurrent.locks.ReentrantLock r0 = r0.f704n
                r0.unlock()
                goto L2
            L3a:
                r0 = r11
                boolean r0 = r0 instanceof l.w     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L53
                r0 = r11
                l.w r0 = (l.w) r0     // Catch: java.lang.Throwable -> L9e
                r11 = r0
            L49:
                r0 = r6
                java.util.concurrent.locks.ReentrantLock r0 = r0.f704n
                r0.unlock()
                goto Laa
            L53:
                r0 = r6
                l.j0 r0 = r0.O()     // Catch: java.lang.Throwable -> L9e
                r9 = r0
                r0 = r9
                if (r0 != 0) goto L63
                r0 = r10
                r11 = r0
                goto L49
            L63:
                r0 = r9
                boolean r0 = r0 instanceof l.w     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L71
                r0 = r10
                r11 = r0
                goto L49
            L71:
                r0 = r9
                r1 = r11
                r2 = 0
                q.r0 r0 = r0.c(r1, r2)     // Catch: java.lang.Throwable -> L9e
                if (r0 != 0) goto L80
                goto L30
            L80:
                r0 = r6
                r1 = r6
                long r1 = r1.s0()     // Catch: java.lang.Throwable -> L9e
                r2 = 1
                long r1 = r1 + r2
                r0.v0(r1)     // Catch: java.lang.Throwable -> L9e
                r0 = 1
                r7 = r0
                r0 = r6
                java.util.concurrent.locks.ReentrantLock r0 = r0.f704n
                r0.unlock()
                r0 = r9
                r1 = r11
                r0.q(r1)
                goto L2
            L9e:
                r11 = move-exception
                r0 = r6
                java.util.concurrent.locks.ReentrantLock r0 = r0.f704n
                r0.unlock()
                r0 = r11
                throw r0
            Laa:
                r0 = r11
                if (r0 == 0) goto Lb9
                r0 = r6
                r1 = r11
                java.lang.Throwable r1 = r1.f986m
                boolean r0 = r0.G(r1)
            Lb9:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l.g.a.r0():boolean");
        }

        public final long s0() {
            return this._subHead;
        }

        public final boolean t0() {
            if (m() != null) {
                return false;
            }
            return (f0() && this.f703m.m() == null) ? false : true;
        }

        public final Object u0() {
            long s0 = s0();
            Object m2 = this.f703m.m();
            if (s0 < this.f703m.e0()) {
                Object Z = this.f703m.Z(s0);
                w<?> m3 = m();
                return m3 != null ? m3 : Z;
            }
            Object obj = m2;
            if (m2 == null) {
                Object m4 = m();
                obj = m4;
                if (m4 == null) {
                    obj = b.f677f;
                }
            }
            return obj;
        }

        public final void v0(long j2) {
            this._subHead = j2;
        }
    }

    public g(int i2) {
        super(null);
        this.f699m = i2;
        if (!(i2 < 1 ? false : true)) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f700n = new ReentrantLock();
        this.f701o = new Object[i2];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.f702p = q.f.d();
    }

    public static /* synthetic */ void d0() {
    }

    public static /* synthetic */ void j0(g gVar, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = null;
        }
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        gVar.i0(aVar, aVar2);
    }

    @Override // l.c
    public boolean B() {
        return false;
    }

    @Override // l.c
    public boolean C() {
        return c0() >= this.f699m;
    }

    @Override // l.c, l.m0
    public boolean G(@Nullable Throwable th) {
        if (super.G(th)) {
            X();
            return true;
        }
        return false;
    }

    @Override // l.c
    @NotNull
    public Object H(E e2) {
        ReentrantLock reentrantLock = this.f700n;
        reentrantLock.lock();
        try {
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            int c0 = c0();
            if (c0 >= this.f699m) {
                return b.f676e;
            }
            long e0 = e0();
            this.f701o[(int) (e0 % this.f699m)] = e2;
            g0(c0 + 1);
            h0(e0 + 1);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            X();
            return b.f675d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        ReentrantLock reentrantLock = this.f700n;
        reentrantLock.lock();
        try {
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            int c0 = c0();
            if (c0 >= this.f699m) {
                return b.f676e;
            }
            if (fVar.i()) {
                long e0 = e0();
                this.f701o[(int) (e0 % this.f699m)] = e2;
                g0(c0 + 1);
                h0(e0 + 1);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                X();
                return b.f675d;
            }
            return t.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.i
    @NotNull
    public i0<E> J() {
        a aVar = new a(this);
        j0(this, aVar, null, 2, null);
        return aVar;
    }

    @Override // l.i
    /* renamed from: W */
    public final boolean a(Throwable th) {
        boolean G = G(th);
        for (a<E> aVar : this.f702p) {
            aVar.a(th);
        }
        return G;
    }

    public final void X() {
        boolean z;
        boolean z2;
        Iterator<a<E>> it = this.f702p.iterator();
        boolean z3 = false;
        loop0: while (true) {
            z = z3;
            boolean z4 = z;
            while (true) {
                z2 = z4;
                if (!it.hasNext()) {
                    break loop0;
                } else if (it.next().r0()) {
                    break;
                } else {
                    z4 = true;
                }
            }
            z3 = true;
        }
        if (z || !z2) {
            j0(this, null, null, 3, null);
        }
    }

    public final long Y() {
        Iterator<a<E>> it = this.f702p.iterator();
        long j2 = Long.MAX_VALUE;
        while (true) {
            long j3 = j2;
            if (!it.hasNext()) {
                return j3;
            }
            j2 = RangesKt___RangesKt.coerceAtMost(j3, it.next().s0());
        }
    }

    public final E Z(long j2) {
        return (E) this.f701o[(int) (j2 % this.f699m)];
    }

    public final int a0() {
        return this.f699m;
    }

    public final long b0() {
        return this._head;
    }

    public final int c0() {
        return this._size;
    }

    @Override // l.i
    public void cancel(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    public final long e0() {
        return this._tail;
    }

    public final void f0(long j2) {
        this._head = j2;
    }

    public final void g0(int i2) {
        this._size = i2;
    }

    public final void h0(long j2) {
        this._tail = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0097, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(l.g.a<E> r7, l.g.a<E> r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.i0(l.g$a, l.g$a):void");
    }

    @Override // l.c
    @NotNull
    public String l() {
        return "(buffer:capacity=" + this.f701o.length + ",size=" + c0() + ')';
    }
}
