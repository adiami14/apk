package l;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.d1;
import q.r0;
@Metadata(bv = {}, d1 = {"��V\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B)\u0012 \u0010.\u001a\u001c\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u000f\u0018\u00010,j\n\u0012\u0004\u0012\u00028��\u0018\u0001`-¢\u0006\u0004\b/\u00100J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0011H\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, d2 = {"Ll/a0;", "E", "Ll/a;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lt/f;", "select", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "l0", "m0", "", "wasClosed", "", "h0", "Ll/h0;", "receive", "b0", "Lq/d1;", "r0", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "m", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/lang/Object;", "value", "e0", "()Z", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "B", "isBufferAlwaysFull", "C", "isBufferFull", "isEmpty", "", "l", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/a0.class */
public class a0<E> extends a<E> {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final ReentrantLock f670m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public Object f671n;

    public a0(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f670m = new ReentrantLock();
        this.f671n = b.f674c;
    }

    @Override // l.c
    public final boolean B() {
        return false;
    }

    @Override // l.c
    public final boolean C() {
        return false;
    }

    @Override // l.c
    @NotNull
    public Object H(E e2) {
        j0<E> O;
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            if (this.f671n == b.f674c) {
                do {
                    O = O();
                    if (O != null) {
                        if (O instanceof w) {
                            return O;
                        }
                        Intrinsics.checkNotNull(O);
                    }
                } while (O.c(e2, null) == null);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                O.q(e2);
                return O.h();
            }
            d1 r0 = r0(e2);
            if (r0 == null) {
                return b.f675d;
            }
            throw r0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        Object r2;
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            if (this.f671n == b.f674c) {
                do {
                    c.d<E> j2 = j(e2);
                    r2 = fVar.r(j2);
                    if (r2 == null) {
                        j0<? super E> o2 = j2.o();
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        Intrinsics.checkNotNull(o2);
                        j0<? super E> j0Var = o2;
                        j0Var.q(e2);
                        return j0Var.h();
                    } else if (r2 != b.f676e) {
                    }
                } while (r2 == q.c.f2037b);
                if (r2 != t.g.d() && !(r2 instanceof w)) {
                    throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r2).toString());
                }
                return r2;
            }
            if (fVar.i()) {
                d1 r0 = r0(e2);
                if (r0 == null) {
                    return b.f675d;
                }
                throw r0;
            }
            return t.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    public boolean b0(@NotNull h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            return super.b0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    public final boolean e0() {
        return false;
    }

    @Override // l.a
    public final boolean f0() {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            boolean z = this.f671n == b.f674c;
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // l.a
    public void h0(boolean z) {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            d1 r0 = r0(b.f674c);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.h0(z);
            if (r0 != null) {
                throw r0;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // l.a, l.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            return g0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public String l() {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            return "(value=" + this.f671n + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    @Nullable
    public Object l0() {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            Object obj = this.f671n;
            r0 r0Var = b.f674c;
            if (obj != r0Var) {
                this.f671n = r0Var;
                Unit unit = Unit.INSTANCE;
                return obj;
            }
            Object n2 = n();
            Object obj2 = n2;
            if (n2 == null) {
                obj2 = b.f677f;
            }
            reentrantLock.unlock();
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    @Nullable
    public Object m0(@NotNull t.f<?> fVar) {
        ReentrantLock reentrantLock = this.f670m;
        reentrantLock.lock();
        try {
            Object obj = this.f671n;
            r0 r0Var = b.f674c;
            if (obj == r0Var) {
                Object n2 = n();
                Object obj2 = n2;
                if (n2 == null) {
                    obj2 = b.f677f;
                }
                reentrantLock.unlock();
                return obj2;
            } else if (fVar.i()) {
                Object obj3 = this.f671n;
                this.f671n = r0Var;
                Unit unit = Unit.INSTANCE;
                return obj3;
            } else {
                return t.g.d();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d1 r0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f671n;
        d1 d1Var = null;
        if (obj2 != b.f674c && (function1 = this.f682j) != null) {
            d1Var = q.i0.d(function1, obj2, null, 2, null);
        }
        this.f671n = obj;
        return d1Var;
    }
}
