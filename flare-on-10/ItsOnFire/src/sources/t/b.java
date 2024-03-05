package t;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.e0;
import j.f1;
import j.k0;
import j.n2;
import j.p1;
import j.p2;
import j.r0;
import j.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.j0;
import q.w;
import q.y;
import t.a;
@Metadata(bv = {}, d1 = {"��¨\u0001\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018��*\u0006\b��\u0010\u0001 ��2\u00020\u00022\b\u0012\u0004\u0012\u00028��0\u00032\b\u0012\u0004\u0012\u00028��0\u00042\b\u0012\u0004\u0012\u00028��0\u00052\u00060\u0006j\u0002`\u0007:\u0004Z[\\#B\u0015\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028��0\u0005¢\u0006\u0004\bX\u0010YJ\u0017\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\fH\u0016ø\u0001��¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J5\u0010/\u001a\u00020\u000e*\u00020,2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0096\u0002ø\u0001��¢\u0006\u0004\b/\u00100JG\u00104\u001a\u00020\u000e\"\u0004\b\u0001\u00101*\b\u0012\u0004\u0012\u00028\u0001022\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0096\u0002ø\u0001��¢\u0006\u0004\b4\u00105J[\u00109\u001a\u00020\u000e\"\u0004\b\u0001\u00106\"\u0004\b\u0002\u00101*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002072\u0006\u00108\u001a\u00028\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0096\u0002ø\u0001��¢\u0006\u0004\b9\u0010:J8\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0016ø\u0001��¢\u0006\u0004\b=\u0010>J.\u0010A\u001a\u00020\u000e2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150?2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0?H\u0082\b¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028��0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u001c\u0010J\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028��0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010 R(\u0010W\u001a\u0004\u0018\u00010\u001a2\b\u0010@\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lt/b;", "R", "Lq/w;", "Lt/a;", "Lt/f;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "v", "(Ljava/lang/Throwable;)V", "", "o0", "()Ljava/lang/Object;", "e", "p0", "Lj/p1;", "handle", "m", "(Lj/p1;)V", "", "i", "()Z", "Lq/y$d;", "otherOp", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lq/y$d;)Ljava/lang/Object;", "Lq/b;", "desc", "r", "(Lq/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lt/c;", "Lkotlin/Function1;", "block", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lt/c;Lkotlin/jvm/functions/Function1;)V", "Q", "Lt/d;", "Lkotlin/Function2;", "g", "(Lt/d;Lkotlin/jvm/functions/Function2;)V", "P", "Lt/e;", "param", "u", "(Lt/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "p", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "value", "m0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "E", "()V", "l0", "Lkotlin/coroutines/Continuation;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "o", "()Lkotlin/coroutines/Continuation;", "completion", "l", "isSelected", "n0", "()Lj/p1;", "q0", "parentHandle", "<init>", "(Lkotlin/coroutines/Continuation;)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: ItsOnFire.jar:t/b.class */
public final class b<R> extends w implements t.a<R>, f<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2205n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2206o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final Continuation<R> f2207m;
    @NotNull
    public volatile /* synthetic */ Object _state = g.f();
    @NotNull
    private volatile /* synthetic */ Object _result = g.c();
    @NotNull
    private volatile /* synthetic */ Object _parentHandle = null;

    @Metadata(bv = {}, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018��2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lt/b$a;", "Lq/d;", "", "affected", "i", "failure", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "toString", "k", "l", "j", "Lt/b;", "b", "Lt/b;", "impl", "Lq/b;", "c", "Lq/b;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lt/b;Lq/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:t/b$a.class */
    public static final class a extends q.d<Object> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f2208b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final q.b f2209c;

        /* renamed from: d  reason: collision with root package name */
        public final long f2210d = g.b().a();

        public a(@NotNull b<?> bVar, @NotNull q.b bVar2) {
            this.f2208b = bVar;
            this.f2209c = bVar2;
            bVar2.d(this);
        }

        @Override // q.d
        public void d(@Nullable Object obj, @Nullable Object obj2) {
            j(obj2);
            this.f2209c.a(this, obj2);
        }

        @Override // q.d
        public long g() {
            return this.f2210d;
        }

        @Override // q.d
        @Nullable
        public Object i(@Nullable Object obj) {
            Object k2;
            if (obj != null || (k2 = k()) == null) {
                try {
                    return this.f2209c.c(this);
                } catch (Throwable th) {
                    if (obj == null) {
                        l();
                    }
                    throw th;
                }
            }
            return k2;
        }

        public final void j(Object obj) {
            boolean z = obj == null;
            if (androidx.concurrent.futures.a.a(b.f2205n, this.f2208b, this, z ? null : g.f()) && z) {
                this.f2208b.l0();
            }
        }

        public final Object k() {
            b<?> bVar = this.f2208b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof j0) {
                    ((j0) obj).c(this.f2208b);
                } else if (obj != g.f()) {
                    return g.d();
                } else {
                    if (androidx.concurrent.futures.a.a(b.f2205n, this.f2208b, g.f(), this)) {
                        return null;
                    }
                }
            }
        }

        public final void l() {
            androidx.concurrent.futures.a.a(b.f2205n, this.f2208b, this, g.f());
        }

        @Override // q.j0
        @NotNull
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��2\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lt/b$b;", "Lq/y;", "Lj/p1;", "m", "Lj/p1;", "handle", "<init>", "(Lj/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: t.b$b  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:t/b$b.class */
    public static final class C0098b extends y {
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final p1 f2211m;

        public C0098b(@NotNull p1 p1Var) {
            this.f2211m = p1Var;
        }
    }

    @Metadata(bv = {}, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lt/b$c;", "Lq/j0;", "", "affected", "c", "Lq/y$d;", "a", "Lq/y$d;", "otherOp", "Lq/d;", "()Lq/d;", "atomicOp", "<init>", "(Lq/y$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:t/b$c.class */
    public static final class c extends j0 {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final y.d f2212a;

        public c(@NotNull y.d dVar) {
            this.f2212a = dVar;
        }

        @Override // q.j0
        @NotNull
        public q.d<?> a() {
            return this.f2212a.a();
        }

        @Override // q.j0
        @Nullable
        public Object c(@Nullable Object obj) {
            if (obj != null) {
                b bVar = (b) obj;
                this.f2212a.d();
                Object e2 = this.f2212a.a().e(null);
                androidx.concurrent.futures.a.a(b.f2205n, bVar, this, e2 == null ? this.f2212a.f2125c : g.f());
                return e2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lt/b$d;", "Lj/p2;", "", "cause", "", "g0", "<init>", "(Lt/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:t/b$d.class */
    public final class d extends p2 {
        public d() {
        }

        @Override // j.g0
        public void g0(@Nullable Throwable th) {
            if (b.this.i()) {
                b.this.v(h0().u());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            g0(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020��H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "j/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:t/b$e.class */
    public static final class e implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function1 f2215k;

        public e(Function1 function1) {
            this.f2215k = function1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.i()) {
                r.a.d(this.f2215k, b.this.o());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Continuation<? super R> continuation) {
        this.f2207m = continuation;
    }

    public final void E() {
        n2 n2Var = (n2) getContext().get(n2.f531b);
        if (n2Var == null) {
            return;
        }
        p1 f2 = n2.a.f(n2Var, true, false, new d(), 2, null);
        q0(f2);
        if (l()) {
            f2.dispose();
        }
    }

    @Override // t.f
    @Nullable
    public Object d(@Nullable y.d dVar) {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                if (dVar != null) {
                    c cVar = new c(dVar);
                    if (androidx.concurrent.futures.a.a(f2205n, this, g.f(), cVar)) {
                        Object c2 = cVar.c(this);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                } else if (androidx.concurrent.futures.a.a(f2205n, this, g.f(), null)) {
                    break;
                }
            } else if (!(obj instanceof j0)) {
                if (dVar != null && obj == dVar.f2125c) {
                    return s.f553d;
                }
                return null;
            } else {
                if (dVar != null) {
                    q.d<?> a2 = dVar.a();
                    if ((a2 instanceof a) && ((a) a2).f2208b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (a2.b((j0) obj)) {
                        return q.c.f2037b;
                    }
                }
                ((j0) obj).c(this);
            }
        }
        l0();
        return s.f553d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.a
    public <Q> void g(@NotNull t.d<? extends Q> dVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        dVar.L(this, function2);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.f2207m;
        return continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f2207m.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // t.f
    public boolean i() {
        boolean z;
        Object d2 = d(null);
        if (d2 == s.f553d) {
            z = true;
        } else if (d2 != null) {
            throw new IllegalStateException(("Unexpected trySelectIdempotent result " + d2).toString());
        } else {
            z = false;
        }
        return z;
    }

    @Override // t.f
    public boolean l() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof j0)) {
                return true;
            }
            ((j0) obj).c(this);
        }
    }

    public final void l0() {
        p1 n0 = n0();
        if (n0 != null) {
            n0.dispose();
        }
        y yVar = (y) Q();
        while (true) {
            y yVar2 = yVar;
            if (Intrinsics.areEqual(yVar2, this)) {
                return;
            }
            if (yVar2 instanceof C0098b) {
                ((C0098b) yVar2).f2211m.dispose();
            }
            yVar = yVar2.R();
        }
    }

    @Override // t.f
    public void m(@NotNull p1 p1Var) {
        C0098b c0098b = new C0098b(p1Var);
        if (!l()) {
            D(c0098b);
            if (!l()) {
                return;
            }
        }
        p1Var.dispose();
    }

    public final void m0(Function0<? extends Object> function0, Function0<Unit> function02) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (androidx.concurrent.futures.a.a(f2206o, this, g.c(), function0.invoke())) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2206o;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, g.a())) {
                    function02.invoke();
                    return;
                }
            }
        }
    }

    @Override // t.a
    public void n(@NotNull t.c cVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        cVar.y(this, function1);
    }

    public final p1 n0() {
        return (p1) this._parentHandle;
    }

    @Override // t.f
    @NotNull
    public Continuation<R> o() {
        return this;
    }

    @PublishedApi
    @Nullable
    public final Object o0() {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (!l()) {
            E();
        }
        Object obj = this._result;
        Object obj2 = obj;
        if (obj == g.c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2206o;
            Object c2 = g.c();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c2, coroutine_suspended)) {
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return coroutine_suspended2;
            }
            obj2 = this._result;
        }
        if (obj2 != g.a()) {
            if (obj2 instanceof e0) {
                throw ((e0) obj2).f467a;
            }
            return obj2;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override // t.a
    public void p(long j2, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        if (j2 > 0) {
            m(f1.d(getContext()).o(j2, new e(function1), getContext()));
        } else if (i()) {
            r.b.c(function1, o());
        }
    }

    @PublishedApi
    public final void p0(@NotNull Throwable th) {
        if (i()) {
            Result.Companion companion = Result.Companion;
            resumeWith(Result.m5849constructorimpl(ResultKt.createFailure(th)));
        } else if (th instanceof CancellationException) {
        } else {
            Object o0 = o0();
            if ((o0 instanceof e0) && ((e0) o0).f467a == th) {
                return;
            }
            r0.b(getContext(), th);
        }
    }

    public final void q0(p1 p1Var) {
        this._parentHandle = p1Var;
    }

    @Override // t.f
    @Nullable
    public Object r(@NotNull q.b bVar) {
        return new a(this, bVar).c(null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        while (true) {
            Object obj2 = this._result;
            if (obj2 == g.c()) {
                if (androidx.concurrent.futures.a.a(f2206o, this, g.c(), k0.d(obj, null, 1, null))) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj2 != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2206o;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, g.a())) {
                    boolean m5855isFailureimpl = Result.m5855isFailureimpl(obj);
                    Continuation<R> continuation = this.f2207m;
                    Object obj3 = obj;
                    if (m5855isFailureimpl) {
                        Throwable m5852exceptionOrNullimpl = Result.m5852exceptionOrNullimpl(obj);
                        Intrinsics.checkNotNull(m5852exceptionOrNullimpl);
                        Result.Companion companion = Result.Companion;
                        obj3 = Result.m5849constructorimpl(ResultKt.createFailure(m5852exceptionOrNullimpl));
                    }
                    continuation.resumeWith(obj3);
                    return;
                }
            }
        }
    }

    @Override // q.y
    @NotNull
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.a
    public <P, Q> void u(@NotNull t.e<? super P, ? extends Q> eVar, P p2, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        eVar.S(this, p2, function2);
    }

    @Override // t.f
    public void v(@NotNull Throwable th) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Continuation intercepted;
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (androidx.concurrent.futures.a.a(f2206o, this, g.c(), new e0(th, false, 2, null))) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2206o;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, g.a())) {
                    intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f2207m);
                    Result.Companion companion = Result.Companion;
                    intercepted.resumeWith(Result.m5849constructorimpl(ResultKt.createFailure(th)));
                    return;
                }
            }
        }
    }

    @Override // t.a
    public <P, Q> void w(@NotNull t.e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        a.C0097a.a(this, eVar, function2);
    }
}
