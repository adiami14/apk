package u;

import androidx.appcompat.R;
import j.q;
import j.r;
import j.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.o0;
import q.p0;
import q.r0;
@Metadata(bv = {}, d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018��2\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H\u0082@ø\u0001��¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lu/g;", "Lu/f;", "", "c", "()Z", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "()V", "g", "Lj/q;", "cont", "h", "(Lj/q;)Z", "j", "i", "", "a", "I", "permits", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "onCancellationRelease", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:u/g.class */
public final class g implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2274c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2275d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2276e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2277f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2278g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits");
    @NotNull
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f2279a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Function1<Throwable, Unit> f2280b;
    @NotNull
    private volatile /* synthetic */ long deqIdx = 0;
    @NotNull
    private volatile /* synthetic */ long enqIdx = 0;
    @NotNull
    private volatile /* synthetic */ Object head;
    @NotNull
    private volatile /* synthetic */ Object tail;

    @Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:u/g$a.class */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            g.this.release();
        }
    }

    public g(int i2, int i3) {
        this.f2279a = i2;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i2).toString());
        }
        if (!(i3 >= 0 && i3 <= i2)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i2).toString());
        }
        i iVar = new i(0L, null, 2);
        this.head = iVar;
        this.tail = iVar;
        this._availablePermits = i2 - i3;
        this.f2280b = new a();
    }

    @Override // u.f
    public int a() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // u.f
    @Nullable
    public Object b(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (f2278g.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object g2 = g(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }

    @Override // u.f
    public boolean c() {
        int i2;
        do {
            i2 = this._availablePermits;
            if (i2 <= 0) {
                return false;
            }
        } while (!f2278g.compareAndSet(this, i2, i2 - 1));
        return true;
    }

    public final Object g(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r b2 = t.b(intercepted);
        while (true) {
            if (!h(b2)) {
                if (f2278g.getAndDecrement(this) > 0) {
                    b2.O(Unit.INSTANCE, this.f2280b);
                    break;
                }
            } else {
                break;
            }
        }
        Object x = b2.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        r16 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [q.o0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(j.q<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.g.h(j.q):boolean");
    }

    public final boolean i(q<? super Unit> qVar) {
        Object C = qVar.C(Unit.INSTANCE, null, this.f2280b);
        if (C == null) {
            return false;
        }
        qVar.Z(C);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [q.o0] */
    public final boolean j() {
        int i2;
        Object obj;
        i j2;
        Object b2;
        int i3;
        r0 r0Var;
        r0 r0Var2;
        int i4;
        r0 r0Var3;
        r0 r0Var4;
        r0 r0Var5;
        boolean z;
        Object obj2 = (i) this.head;
        long andIncrement = f2275d.getAndIncrement(this);
        i2 = h.f2287f;
        long j3 = andIncrement / i2;
        do {
            Object obj3 = obj2;
            while (true) {
                if (obj3.o() >= j3) {
                    obj = obj3;
                    if (!obj3.g()) {
                        break;
                    }
                }
                Object e2 = obj3.e();
                if (e2 == q.g.f2055b) {
                    obj = q.g.f2055b;
                    break;
                }
                i iVar = (o0) ((q.h) e2);
                if (iVar == null) {
                    j2 = h.j(obj3.o() + 1, obj3);
                    if (obj3.m(j2)) {
                        iVar = j2;
                        if (obj3.g()) {
                            obj3.l();
                            iVar = j2;
                        }
                    }
                }
                obj3 = iVar;
            }
            b2 = p0.b(obj);
            if (p0.h(b2)) {
                break;
            }
            o0 f2 = p0.f(b2);
            while (true) {
                o0 o0Var = (o0) this.head;
                if (o0Var.o() >= f2.o()) {
                    break;
                } else if (!f2.r()) {
                    z = false;
                    break;
                } else if (androidx.concurrent.futures.a.a(f2274c, this, o0Var, f2)) {
                    if (o0Var.n()) {
                        o0Var.l();
                    }
                } else if (f2.n()) {
                    f2.l();
                }
            }
            z = true;
        } while (!z);
        i iVar2 = (i) p0.f(b2);
        iVar2.b();
        if (iVar2.o() > j3) {
            return false;
        }
        i3 = h.f2287f;
        int i5 = (int) (andIncrement % i3);
        r0Var = h.f2283b;
        Object andSet = iVar2.f2292e.getAndSet(i5, r0Var);
        if (andSet != null) {
            r0Var2 = h.f2286e;
            if (andSet == r0Var2) {
                return false;
            }
            return i((q) andSet);
        }
        i4 = h.f2282a;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj4 = iVar2.f2292e.get(i5);
            r0Var5 = h.f2284c;
            if (obj4 == r0Var5) {
                return true;
            }
        }
        r0Var3 = h.f2283b;
        r0Var4 = h.f2285d;
        return !n.b.a(iVar2.f2292e, i5, r0Var3, r0Var4);
    }

    @Override // u.f
    public void release() {
        while (true) {
            int i2 = this._availablePermits;
            if (!(i2 < this.f2279a)) {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f2279a).toString());
            } else if (f2278g.compareAndSet(this, i2, i2 + 1) && (i2 >= 0 || j())) {
                return;
            }
        }
    }
}
