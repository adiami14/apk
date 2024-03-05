package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b��\u0018�� \u0017*\b\b��\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b#B\u0017\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028��¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0��¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0005J3\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028��\u0018\u00010��j\n\u0012\u0004\u0012\u00028��\u0018\u0001`\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028��H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028��\u0018\u00010��j\n\u0012\u0004\u0012\u00028��\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00028��0��j\b\u0012\u0004\u0012\u00028��`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0012\u0012\u0004\u0012\u00028��0��j\b\u0012\u0004\u0012\u00028��`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lq/b0;", "", "E", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Z", "element", "", "a", "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lq/b0;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "g", FirebaseAnalytics.Param.INDEX, "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lq/b0;", "oldHead", "newHead", "m", "(II)Lq/b0;", "", "j", "()J", "state", "c", "(J)Lq/b0;", "b", "I", "capacity", "Z", "singleConsumer", "mask", "h", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/b0.class */
public final class b0<E> {

    /* renamed from: h  reason: collision with root package name */
    public static final int f2016h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final int f2017i = 30;

    /* renamed from: j  reason: collision with root package name */
    public static final int f2018j = 1073741823;

    /* renamed from: k  reason: collision with root package name */
    public static final int f2019k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final long f2020l = 1073741823;

    /* renamed from: m  reason: collision with root package name */
    public static final int f2021m = 30;

    /* renamed from: n  reason: collision with root package name */
    public static final long f2022n = 1152921503533105152L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2023o = 60;

    /* renamed from: p  reason: collision with root package name */
    public static final long f2024p = 1152921504606846976L;

    /* renamed from: q  reason: collision with root package name */
    public static final int f2025q = 61;

    /* renamed from: r  reason: collision with root package name */
    public static final long f2026r = 2305843009213693952L;

    /* renamed from: s  reason: collision with root package name */
    public static final int f2027s = 1024;

    /* renamed from: u  reason: collision with root package name */
    public static final int f2029u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2030v = 1;
    public static final int w = 2;
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f2031a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2032b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2033c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f2034d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final a f2013e = new a(null);
    @JvmField
    @NotNull

    /* renamed from: t  reason: collision with root package name */
    public static final r0 f2028t = new r0("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2014f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2015g = AtomicLongFieldUpdater.newUpdater(b0.class, "_state");

    @Metadata(bv = {}, d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lq/b0$a;", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "block", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lq/r0;", "REMOVE_FROZEN", "Lq/r0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/b0$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j2) {
            return (j2 & b0.f2026r) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return e(j2, b0.f2020l) | (i2 << 0);
        }

        public final long c(long j2, int i2) {
            return e(j2, b0.f2022n) | (i2 << 30);
        }

        public final <T> T d(long j2, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) ((b0.f2020l & j2) >> 0)), Integer.valueOf((int) ((j2 & b0.f2022n) >> 30)));
        }

        public final long e(long j2, long j3) {
            return j2 & j3;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\b\n\u0002\b\u0006\b��\u0018��2\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lq/b0$b;", "", "", "a", "I", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/b0$b.class */
    public static final class b {
        @JvmField

        /* renamed from: a  reason: collision with root package name */
        public final int f2035a;

        public b(int i2) {
            this.f2035a = i2;
        }
    }

    public b0(int i2, boolean z) {
        this.f2031a = i2;
        this.f2032b = z;
        int i3 = i2 - 1;
        this.f2033c = i3;
        this.f2034d = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(@NotNull E e2) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return f2013e.a(j2);
            }
            int i2 = (int) ((f2020l & j2) >> 0);
            int i3 = (int) ((f2022n & j2) >> 30);
            int i4 = this.f2033c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.f2032b && this.f2034d.get(i3 & i4) != null) {
                int i5 = this.f2031a;
                if (i5 < 1024 || ((i3 - i2) & f2018j) > (i5 >> 1)) {
                    return 1;
                }
            } else if (f2015g.compareAndSet(this, j2, f2013e.c(j2, (i3 + 1) & f2018j))) {
                this.f2034d.set(i3 & i4, e2);
                b0<E> b0Var = this;
                while ((b0Var._state & f2024p) != 0) {
                    b0<E> e3 = b0Var.k().e(i3, e2);
                    b0Var = e3;
                    if (e3 == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0<E> b(long j2) {
        b0<E> b0Var = new b0<>(this.f2031a * 2, this.f2032b);
        int i2 = (int) ((f2020l & j2) >> 0);
        int i3 = (int) ((f2022n & j2) >> 30);
        while (true) {
            int i4 = this.f2033c;
            if ((i2 & i4) == (i3 & i4)) {
                b0Var._state = f2013e.e(j2, f2024p);
                return b0Var;
            }
            Object obj = this.f2034d.get(i4 & i2);
            b bVar = obj;
            if (obj == null) {
                bVar = new b(i2);
            }
            b0Var.f2034d.set(b0Var.f2033c & i2, bVar);
            i2++;
        }
    }

    public final b0<E> c(long j2) {
        while (true) {
            b0<E> b0Var = (b0) this._next;
            if (b0Var != null) {
                return b0Var;
            }
            androidx.concurrent.futures.a.a(f2014f, this, null, b(j2));
        }
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & f2026r) != 0) {
                return true;
            }
            if ((f2024p & j2) != 0) {
                return false;
            }
        } while (!f2015g.compareAndSet(this, j2, j2 | f2026r));
        return true;
    }

    public final b0<E> e(int i2, E e2) {
        Object obj = this.f2034d.get(this.f2033c & i2);
        if ((obj instanceof b) && ((b) obj).f2035a == i2) {
            this.f2034d.set(i2 & this.f2033c, e2);
            return this;
        }
        return null;
    }

    public final int f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & f2022n) >> 30)) - ((int) ((f2020l & j2) >> 0)));
    }

    public final boolean g() {
        return (this._state & f2026r) != 0;
    }

    public final boolean h() {
        long j2 = this._state;
        boolean z = false;
        if (((int) ((f2020l & j2) >> 0)) == ((int) ((j2 & f2022n) >> 30))) {
            z = true;
        }
        return z;
    }

    @NotNull
    public final <R> List<R> i(@NotNull Function1<? super E, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(this.f2031a);
        long j2 = this._state;
        int i2 = (int) ((f2020l & j2) >> 0);
        int i3 = (int) ((j2 & f2022n) >> 30);
        while (true) {
            int i4 = this.f2033c;
            if ((i2 & i4) == (i3 & i4)) {
                return arrayList;
            }
            Object obj = (Object) this.f2034d.get(i4 & i2);
            if (obj != 0 && !(obj instanceof b)) {
                arrayList.add(function1.invoke(obj));
            }
            i2++;
        }
    }

    public final long j() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & f2024p) != 0) {
                return j2;
            }
            j3 = j2 | f2024p;
        } while (!f2015g.compareAndSet(this, j2, j3));
        return j3;
    }

    @NotNull
    public final b0<E> k() {
        return c(j());
    }

    @Nullable
    public final Object l() {
        b0<E> m2;
        while (true) {
            long j2 = this._state;
            if ((f2024p & j2) != 0) {
                return f2028t;
            }
            int i2 = (int) ((f2020l & j2) >> 0);
            int i3 = (int) ((f2022n & j2) >> 30);
            int i4 = this.f2033c;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.f2034d.get(i4 & i2);
            if (obj == null) {
                if (this.f2032b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i5 = (i2 + 1) & f2018j;
                if (f2015g.compareAndSet(this, j2, f2013e.b(j2, i5))) {
                    this.f2034d.set(this.f2033c & i2, null);
                    return obj;
                } else if (this.f2032b) {
                    b0<E> b0Var = this;
                    do {
                        m2 = b0Var.m(i2, i5);
                        b0Var = m2;
                    } while (m2 != null);
                    return obj;
                }
            }
        }
    }

    public final b0<E> m(int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = this._state;
            i4 = (int) ((f2020l & j2) >> 0);
            if ((f2024p & j2) != 0) {
                return k();
            }
        } while (!f2015g.compareAndSet(this, j2, f2013e.b(j2, i3)));
        this.f2034d.set(this.f2033c & i4, null);
        return null;
    }
}
