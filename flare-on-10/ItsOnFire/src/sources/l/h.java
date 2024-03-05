package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.d1;
import q.r0;
@Metadata(bv = {}, d1 = {"��x\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B9\u0012\u0006\u0010&\u001a\u00020\u001c\u0012\u0006\u0010*\u001a\u00020'\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u0019\u0018\u00010Fj\n\u0012\u0004\u0012\u00028��\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028��0\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028��H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\tR\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010/\u001a\u00060+j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\tR\u0014\u00108\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0014\u0010?\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u0014\u0010A\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00107R\u0014\u0010E\u001a\u00020B8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006K"}, d2 = {"Ll/h;", "E", "Ll/a;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lt/f;", "select", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "Ll/l0;", "send", "k", "(Ll/l0;)Ljava/lang/Object;", "l0", "()Ljava/lang/Object;", "m0", "(Lt/f;)Ljava/lang/Object;", "Ll/h0;", "receive", "", "b0", "(Ll/h0;)Z", "wasClosed", "", "h0", "(Z)V", "", "currentSize", "Lq/r0;", "t0", "(I)Lq/r0;", "r0", "(ILjava/lang/Object;)V", "s0", "(I)V", "m", "capacity", "Ll/m;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ll/m;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "p", "[Ljava/lang/Object;", "buffer", "q", "head", "e0", "()Z", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "B", "isBufferAlwaysFull", "C", "isBufferFull", "isEmpty", "i", "isClosedForReceive", "", "l", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILl/m;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/h.class */
public class h<E> extends l.a<E> {

    /* renamed from: m  reason: collision with root package name */
    public final int f705m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final m f706n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final ReentrantLock f707o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public Object[] f708p;

    /* renamed from: q  reason: collision with root package name */
    public int f709q;
    @NotNull
    private volatile /* synthetic */ int size;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:l/h$a.class */
    public final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f710a;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.SUSPEND.ordinal()] = 1;
            iArr[m.DROP_LATEST.ordinal()] = 2;
            iArr[m.DROP_OLDEST.ordinal()] = 3;
            f710a = iArr;
        }
    }

    public h(int i2, @NotNull m mVar, @Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f705m = i2;
        this.f706n = mVar;
        if (!(i2 < 1 ? false : true)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f707o = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        ArraysKt___ArraysJvmKt.fill$default(objArr, b.f674c, 0, 0, 6, (Object) null);
        this.f708p = objArr;
        this.size = 0;
    }

    @Override // l.c
    public final boolean B() {
        return false;
    }

    @Override // l.c
    public final boolean C() {
        return this.size == this.f705m && this.f706n == m.SUSPEND;
    }

    @Override // l.c
    @NotNull
    public Object H(E e2) {
        j0<E> O;
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            r0 t0 = t0(i2);
            if (t0 != null) {
                return t0;
            }
            if (i2 == 0) {
                do {
                    O = O();
                    if (O != null) {
                        if (O instanceof w) {
                            this.size = i2;
                            return O;
                        }
                        Intrinsics.checkNotNull(O);
                    }
                } while (O.c(e2, null) == null);
                this.size = i2;
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                O.q(e2);
                return O.h();
            }
            r0(i2, e2);
            return b.f675d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        Object r2;
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            r0 t0 = t0(i2);
            if (t0 != null) {
                return t0;
            }
            if (i2 == 0) {
                do {
                    c.d<E> j2 = j(e2);
                    r2 = fVar.r(j2);
                    if (r2 == null) {
                        this.size = i2;
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
                this.size = i2;
                return r2;
            }
            if (fVar.i()) {
                r0(i2, e2);
                return b.f675d;
            }
            this.size = i2;
            return t.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    public boolean b0(@NotNull h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f707o;
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
        return this.size == 0;
    }

    @Override // l.a
    public void h0(boolean z) {
        Function1<E, Unit> function1 = this.f682j;
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            d1 d1Var = null;
            int i3 = 0;
            while (i3 < i2) {
                Object obj = this.f708p[this.f709q];
                d1 d1Var2 = d1Var;
                if (function1 != null) {
                    d1Var2 = d1Var;
                    if (obj != b.f674c) {
                        d1Var2 = q.i0.c(function1, obj, d1Var);
                    }
                }
                Object[] objArr = this.f708p;
                int i4 = this.f709q;
                objArr[i4] = b.f674c;
                this.f709q = (i4 + 1) % objArr.length;
                i3++;
                d1Var = d1Var2;
            }
            this.size = 0;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.h0(z);
            if (d1Var != null) {
                throw d1Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // l.a, l.i0
    public boolean i() {
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            return super.i();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a, l.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            return g0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @Nullable
    public Object k(@NotNull l0 l0Var) {
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            return super.k(l0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public String l() {
        return "(buffer:capacity=" + this.f705m + ",size=" + this.size + ')';
    }

    @Override // l.a
    @Nullable
    public Object l0() {
        ReentrantLock reentrantLock = this.f707o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object n2 = n();
                Object obj = n2;
                if (n2 == null) {
                    obj = b.f677f;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.f708p;
            int i3 = this.f709q;
            Object obj2 = objArr[i3];
            l0 l0Var = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            r0 r0Var = b.f677f;
            r0 r0Var2 = r0Var;
            boolean z = false;
            if (i2 == this.f705m) {
                l0 l0Var2 = null;
                while (true) {
                    l0Var = l0Var2;
                    l0 P = P();
                    if (P == null) {
                        r0Var2 = r0Var;
                        z = false;
                        break;
                    }
                    Intrinsics.checkNotNull(P);
                    if (P.j0(null) != null) {
                        z = true;
                        l0Var = P;
                        r0Var2 = P.h0();
                        break;
                    }
                    P.k0();
                    l0Var2 = P;
                }
            }
            if (r0Var2 != b.f677f && !(r0Var2 instanceof w)) {
                this.size = i2;
                Object[] objArr2 = this.f708p;
                objArr2[(this.f709q + i2) % objArr2.length] = r0Var2;
            }
            this.f709q = (this.f709q + 1) % this.f708p.length;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (z) {
                Intrinsics.checkNotNull(l0Var);
                l0Var.g0();
            }
            return obj2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0136 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x000b, B:5:0x0014, B:8:0x0022, B:12:0x002e, B:14:0x004a, B:17:0x005f, B:19:0x0073, B:38:0x0103, B:40:0x010b, B:42:0x0113, B:48:0x0152, B:43:0x012d, B:45:0x0136, B:21:0x008f, B:23:0x0097, B:25:0x009f, B:27:0x00a7, B:30:0x00c0, B:34:0x00d2, B:35:0x00fb), top: B:57:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    @Override // l.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m0(@org.jetbrains.annotations.NotNull t.f<?> r5) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.h.m0(t.f):java.lang.Object");
    }

    public final void r0(int i2, E e2) {
        if (i2 < this.f705m) {
            s0(i2);
            Object[] objArr = this.f708p;
            objArr[(this.f709q + i2) % objArr.length] = e2;
            return;
        }
        Object[] objArr2 = this.f708p;
        int i3 = this.f709q;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f709q = (i3 + 1) % objArr2.length;
    }

    public final void s0(int i2) {
        Object[] objArr = this.f708p;
        if (i2 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f705m);
            Object[] objArr2 = new Object[min];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f708p;
                objArr2[i3] = objArr3[(this.f709q + i3) % objArr3.length];
            }
            ArraysKt___ArraysJvmKt.fill((r0[]) objArr2, b.f674c, i2, min);
            this.f708p = objArr2;
            this.f709q = 0;
        }
    }

    public final r0 t0(int i2) {
        r0 r0Var = null;
        if (i2 < this.f705m) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.f710a[this.f706n.ordinal()];
        if (i3 == 1) {
            r0Var = b.f676e;
        } else if (i3 == 2) {
            r0Var = b.f675d;
        } else if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return r0Var;
    }
}
