package u;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.p1;
import j.q;
import j.r;
import j.s;
import j.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.j0;
import q.r0;
import q.w;
import q.y;
@Metadata(bv = {}, d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b��\u0018��2\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0006\u001a\t\u0014\u0013\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001��¢\u0006\u0004\b\t\u0010\nJT\u0010\u0011\u001a\u00020\b\"\u0004\b��\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0016ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001��¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lu/d;", "Lu/c;", "Lt/e;", "", "owner", "", "a", "(Ljava/lang/Object;)Z", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "S", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "e", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "i", "b", "()Z", "isLocked", "h", "isLockedEmptyQueueState", "f", "()Lt/e;", "onLock", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:u/d.class */
public final class d implements u.c, t.e<Object, u.c> {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2243j = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0004\b\u0082\u0004\u0018��2\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lu/d$a;", "Lu/d$c;", "Lu/d;", "", "i0", "", "g0", "", "toString", "Lj/q;", "p", "Lj/q;", "cont", "", "owner", "<init>", "(Lu/d;Ljava/lang/Object;Lj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:u/d$a.class */
    public final class a extends c {
        @NotNull

        /* renamed from: p  reason: collision with root package name */
        public final q<Unit> f2244p;

        @Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: u.d$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:u/d$a$a.class */
        public static final class C0099a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ d f2246j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a f2247k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0099a(d dVar, a aVar) {
                super(1);
                this.f2246j = dVar;
                this.f2247k = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.f2246j.d(this.f2247k.f2254m);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable Object obj, @NotNull q<? super Unit> qVar) {
            super(obj);
            this.f2244p = qVar;
        }

        @Override // u.d.c
        public void g0() {
            this.f2244p.Z(s.f553d);
        }

        @Override // u.d.c
        public boolean i0() {
            boolean z = false;
            if (h0()) {
                if (this.f2244p.C(Unit.INSTANCE, null, new C0099a(d.this, this)) != null) {
                    z = true;
                }
                return z;
            }
            return false;
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "LockCont[" + this.f2254m + ", " + this.f2244p + "] for " + d.this;
        }
    }

    @Metadata(bv = {}, d1 = {"��<\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0007\b\u0082\u0004\u0018��*\u0004\b��\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\n\u0012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001��¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR3\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e8\u0006X\u0087\u0004ø\u0001��¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lu/d$b;", "R", "Lu/d$c;", "Lu/d;", "", "i0", "", "g0", "", "toString", "Lt/f;", "p", "Lt/f;", "select", "Lkotlin/Function2;", "Lu/c;", "Lkotlin/coroutines/Continuation;", "", "q", "Lkotlin/jvm/functions/Function2;", "block", "owner", "<init>", "(Lu/d;Ljava/lang/Object;Lt/f;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:u/d$b.class */
    public final class b<R> extends c {
        @JvmField
        @NotNull

        /* renamed from: p  reason: collision with root package name */
        public final t.f<R> f2248p;
        @JvmField
        @NotNull

        /* renamed from: q  reason: collision with root package name */
        public final Function2<u.c, Continuation<? super R>, Object> f2249q;

        @Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:u/d$b$a.class */
        public static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ d f2251j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ b<R> f2252k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, b<R> bVar) {
                super(1);
                this.f2251j = dVar;
                this.f2252k = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.f2251j.d(this.f2252k.f2254m);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Nullable Object obj, @NotNull t.f<? super R> fVar, @NotNull Function2<? super u.c, ? super Continuation<? super R>, ? extends Object> function2) {
            super(obj);
            this.f2248p = fVar;
            this.f2249q = function2;
        }

        @Override // u.d.c
        public void g0() {
            r.a.e(this.f2249q, d.this, this.f2248p.o(), new a(d.this, this));
        }

        @Override // u.d.c
        public boolean i0() {
            return h0() && this.f2248p.i();
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "LockSelect[" + this.f2254m + ", " + this.f2248p + "] for " + d.this;
        }
    }

    @Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010��\n\u0002\b\u0006\b¢\u0004\u0018��2\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lu/d$c;", "Lq/y;", "Lj/p1;", "", "h0", "()Z", "", "dispose", "()V", "i0", "g0", "", "m", "Ljava/lang/Object;", "owner", "<init>", "(Lu/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:u/d$c.class */
    public abstract class c extends y implements p1 {

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f2253o = AtomicIntegerFieldUpdater.newUpdater(c.class, "isTaken");
        @NotNull
        private volatile /* synthetic */ int isTaken = 0;
        @JvmField
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public final Object f2254m;

        public c(@Nullable Object obj) {
            this.f2254m = obj;
        }

        @Override // j.p1
        public final void dispose() {
            Y();
        }

        public abstract void g0();

        public final boolean h0() {
            return f2253o.compareAndSet(this, 0, 1);
        }

        public abstract boolean i0();
    }

    @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010��\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lu/d$d;", "Lq/w;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: u.d$d  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:u/d$d.class */
    public static final class C0100d extends w {
        @JvmField
        @NotNull
        public volatile Object owner;

        public C0100d(@NotNull Object obj) {
            this.owner = obj;
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018��2\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lu/d$e;", "Lq/b;", "Lq/d;", "op", "", "c", "failure", "", "a", "Lu/d;", "b", "Lu/d;", "mutex", "Ljava/lang/Object;", "owner", "<init>", "(Lu/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:u/d$e.class */
    public static final class e extends q.b {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final d f2256b;
        @JvmField
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final Object f2257c;

        @Metadata(bv = {}, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018��2\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lu/d$e$a;", "Lq/j0;", "", "affected", "c", "Lq/d;", "a", "Lq/d;", "()Lq/d;", "atomicOp", "<init>", "(Lu/d$e;Lq/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:u/d$e$a.class */
        public final class a extends j0 {
            @NotNull

            /* renamed from: a  reason: collision with root package name */
            public final q.d<?> f2258a;

            public a(@NotNull q.d<?> dVar) {
                this.f2258a = dVar;
            }

            @Override // q.j0
            @NotNull
            public q.d<?> a() {
                return this.f2258a;
            }

            @Override // q.j0
            @Nullable
            public Object c(@Nullable Object obj) {
                Object a2;
                Object obj2;
                if (a().h()) {
                    obj2 = u.e.f2268f;
                    a2 = obj2;
                } else {
                    a2 = a();
                }
                if (obj != null) {
                    androidx.concurrent.futures.a.a(d.f2243j, (d) obj, this, a2);
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
            }
        }

        public e(@NotNull d dVar, @Nullable Object obj) {
            this.f2256b = dVar;
            this.f2257c = obj;
        }

        @Override // q.b
        public void a(@NotNull q.d<?> dVar, @Nullable Object obj) {
            u.b bVar;
            u.b bVar2;
            u.b bVar3;
            if (obj != null) {
                bVar3 = u.e.f2268f;
                bVar = bVar3;
            } else {
                Object obj2 = this.f2257c;
                if (obj2 == null) {
                    bVar2 = u.e.f2267e;
                    bVar = bVar2;
                } else {
                    bVar = new u.b(obj2);
                }
            }
            androidx.concurrent.futures.a.a(d.f2243j, this.f2256b, dVar, bVar);
        }

        @Override // q.b
        @Nullable
        public Object c(@NotNull q.d<?> dVar) {
            u.b bVar;
            r0 r0Var;
            a aVar = new a(dVar);
            d dVar2 = this.f2256b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2243j;
            bVar = u.e.f2268f;
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, dVar2, bVar, aVar)) {
                return aVar.c(this.f2256b);
            }
            r0Var = u.e.f2263a;
            return r0Var;
        }
    }

    @Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lu/d$f;", "Lq/d;", "Lu/d;", "affected", "", "k", "failure", "", "j", "Lu/d$d;", "b", "Lu/d$d;", "queue", "<init>", "(Lu/d$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:u/d$f.class */
    public static final class f extends q.d<d> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final C0100d f2260b;

        public f(@NotNull C0100d c0100d) {
            this.f2260b = c0100d;
        }

        @Override // q.d
        /* renamed from: j */
        public void d(@NotNull d dVar, @Nullable Object obj) {
            Object obj2;
            Object obj3;
            if (obj == null) {
                obj3 = u.e.f2268f;
                obj2 = obj3;
            } else {
                obj2 = this.f2260b;
            }
            androidx.concurrent.futures.a.a(d.f2243j, dVar, this, obj2);
        }

        @Override // q.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull d dVar) {
            r0 r0Var;
            r0 r0Var2;
            if (this.f2260b.h0()) {
                r0Var2 = null;
            } else {
                r0Var = u.e.f2264b;
                r0Var2 = r0Var;
            }
            return r0Var2;
        }
    }

    @Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:u/d$g.class */
    public static final class g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object f2262k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj) {
            super(1);
            this.f2262k = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            d.this.d(this.f2262k);
        }
    }

    public d(boolean z) {
        u.b bVar;
        u.b bVar2;
        u.b bVar3;
        if (z) {
            bVar3 = u.e.f2267e;
            bVar2 = bVar3;
        } else {
            bVar = u.e.f2268f;
            bVar2 = bVar;
        }
        this._state = bVar2;
    }

    @Override // t.e
    public <R> void S(@NotNull t.f<? super R> fVar, @Nullable Object obj, @NotNull Function2<? super u.c, ? super Continuation<? super R>, ? extends Object> function2) {
        r0 r0Var;
        r0 r0Var2;
        while (!fVar.l()) {
            Object obj2 = this._state;
            if (obj2 instanceof u.b) {
                u.b bVar = (u.b) obj2;
                Object obj3 = bVar.f2242a;
                r0Var = u.e.f2266d;
                if (obj3 != r0Var) {
                    androidx.concurrent.futures.a.a(f2243j, this, obj2, new C0100d(bVar.f2242a));
                } else {
                    Object r2 = fVar.r(new e(this, obj));
                    if (r2 == null) {
                        r.b.d(function2, this, fVar.o());
                        return;
                    } else if (r2 == t.g.d()) {
                        return;
                    } else {
                        r0Var2 = u.e.f2263a;
                        if (r2 != r0Var2 && r2 != q.c.f2037b) {
                            throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + r2).toString());
                        }
                    }
                }
            } else if (obj2 instanceof C0100d) {
                C0100d c0100d = (C0100d) obj2;
                if (!(c0100d.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                b bVar2 = new b(obj, fVar, function2);
                c0100d.D(bVar2);
                if (this._state == obj2 || !bVar2.h0()) {
                    fVar.m(bVar2);
                    return;
                }
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
    }

    @Override // u.c
    public boolean a(@Nullable Object obj) {
        r0 r0Var;
        u.b bVar;
        u.b bVar2;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof u.b) {
                Object obj3 = ((u.b) obj2).f2242a;
                r0Var = u.e.f2266d;
                if (obj3 != r0Var) {
                    return false;
                }
                if (obj == null) {
                    bVar2 = u.e.f2267e;
                    bVar = bVar2;
                } else {
                    bVar = new u.b(obj);
                }
                if (androidx.concurrent.futures.a.a(f2243j, this, obj2, bVar)) {
                    return true;
                }
            } else if (obj2 instanceof C0100d) {
                if (((C0100d) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
    }

    @Override // u.c
    public boolean b() {
        r0 r0Var;
        while (true) {
            Object obj = this._state;
            boolean z = true;
            if (obj instanceof u.b) {
                Object obj2 = ((u.b) obj).f2242a;
                r0Var = u.e.f2266d;
                if (obj2 == r0Var) {
                    z = false;
                }
                return z;
            } else if (obj instanceof C0100d) {
                return true;
            } else {
                if (!(obj instanceof j0)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                ((j0) obj).c(this);
            }
        }
    }

    @Override // u.c
    @Nullable
    public Object c(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (a(obj)) {
            return Unit.INSTANCE;
        }
        Object i2 = i(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return i2 == coroutine_suspended ? i2 : Unit.INSTANCE;
    }

    @Override // u.c
    public void d(@Nullable Object obj) {
        u.b bVar;
        r0 r0Var;
        r0 r0Var2;
        C0100d c0100d;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof u.b) {
                u.b bVar2 = (u.b) obj2;
                if (obj == null) {
                    Object obj3 = bVar2.f2242a;
                    r0Var = u.e.f2266d;
                    if (obj3 == r0Var) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (!(bVar2.f2242a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.f2242a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2243j;
                bVar = u.e.f2268f;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else if (!(obj2 instanceof C0100d)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                if (obj != null) {
                    if (!(((C0100d) obj2).owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c0100d.owner + " but expected " + obj).toString());
                    }
                }
                C0100d c0100d2 = (C0100d) obj2;
                y b0 = c0100d2.b0();
                if (b0 == null) {
                    f fVar = new f(c0100d2);
                    if (androidx.concurrent.futures.a.a(f2243j, this, obj2, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) b0;
                    if (cVar.i0()) {
                        Object obj4 = cVar.f2254m;
                        r0 r0Var3 = obj4;
                        if (obj4 == null) {
                            r0Var2 = u.e.f2265c;
                            r0Var3 = r0Var2;
                        }
                        c0100d2.owner = r0Var3;
                        cVar.g0();
                        return;
                    }
                }
            }
        }
    }

    @Override // u.c
    public boolean e(@NotNull Object obj) {
        Object obj2 = this._state;
        boolean z = true;
        if (!(obj2 instanceof u.b) ? !(obj2 instanceof C0100d) || ((C0100d) obj2).owner != obj : ((u.b) obj2).f2242a != obj) {
            z = false;
        }
        return z;
    }

    @Override // u.c
    @NotNull
    public t.e<Object, u.c> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof C0100d) && ((C0100d) obj).h0();
    }

    public final Object i(Object obj, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        r0 r0Var;
        u.b bVar;
        u.b bVar2;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r b2 = t.b(intercepted);
        a aVar = new a(obj, b2);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof u.b) {
                u.b bVar3 = (u.b) obj2;
                Object obj3 = bVar3.f2242a;
                r0Var = u.e.f2266d;
                if (obj3 != r0Var) {
                    androidx.concurrent.futures.a.a(f2243j, this, obj2, new C0100d(bVar3.f2242a));
                } else {
                    if (obj == null) {
                        bVar2 = u.e.f2267e;
                        bVar = bVar2;
                    } else {
                        bVar = new u.b(obj);
                    }
                    if (androidx.concurrent.futures.a.a(f2243j, this, obj2, bVar)) {
                        b2.O(Unit.INSTANCE, new g(obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C0100d) {
                C0100d c0100d = (C0100d) obj2;
                if (!(c0100d.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                c0100d.D(aVar);
                if (this._state == obj2 || !aVar.h0()) {
                    break;
                }
                aVar = new a(obj, b2);
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
        t.c(b2, aVar);
        Object x = b2.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        r6.append(r5);
        r6.append(']');
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
        return r6.toString();
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
        L0:
            r0 = r4
            java.lang.Object r0 = r0._state
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof u.b
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Mutex["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            u.b r0 = (u.b) r0
            java.lang.Object r0 = r0.f2242a
            r5 = r0
        L24:
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
        L36:
            r0 = r5
            boolean r0 = r0 instanceof q.j0
            if (r0 == 0) goto L49
            r0 = r5
            q.j0 r0 = (q.j0) r0
            r1 = r4
            java.lang.Object r0 = r0.c(r1)
            goto L0
        L49:
            r0 = r5
            boolean r0 = r0 instanceof u.d.C0100d
            if (r0 == 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Mutex["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            u.d$d r0 = (u.d.C0100d) r0
            java.lang.Object r0 = r0.owner
            r5 = r0
            goto L24
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Illegal state "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.toString():java.lang.String");
    }
}
