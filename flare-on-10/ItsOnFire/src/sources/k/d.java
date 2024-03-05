package k;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.R;
import j.c3;
import j.e1;
import j.m1;
import j.p1;
import j.q;
import j.r2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b��\u0018��2\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b+\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010��8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020��8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lk/d;", "Lk/e;", "Lj/e1;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "", "timeMillis", "Lj/q;", "continuation", "i", "Lj/p1;", "o", "", "toString", "", "other", "equals", "", "hashCode", "y", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "handler", "k", "Ljava/lang/String;", "name", "l", "Z", "invokeImmediately", "_immediate", "Lk/d;", "m", "z", "()Lk/d;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:k/d.class */
public final class d extends e implements e1 {
    @Nullable
    private volatile d _immediate;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final Handler f638j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f639k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f640l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final d f641m;

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020��H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "j/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:k/d$a.class */
    public static final class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ q f642j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d f643k;

        public a(q qVar, d dVar) {
            this.f642j = qVar;
            this.f643k = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f642j.t(this.f643k, Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n��\u0010��\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:k/d$b.class */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Runnable f645k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f645k = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            d.this.f638j.removeCallbacks(this.f645k);
        }
    }

    public d(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }

    public /* synthetic */ d(Handler handler, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Handler handler, String str, boolean z) {
        super(null);
        d dVar = null;
        this.f638j = handler;
        this.f639k = str;
        this.f640l = z;
        this._immediate = z ? this : dVar;
        d dVar2 = this._immediate;
        d dVar3 = dVar2;
        if (dVar2 == null) {
            dVar3 = new d(handler, str, true);
            this._immediate = dVar3;
        }
        this.f641m = dVar3;
    }

    public static final void A(d dVar, Runnable runnable) {
        dVar.f638j.removeCallbacks(runnable);
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.f638j.post(runnable)) {
            return;
        }
        y(coroutineContext, runnable);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof d) && ((d) obj).f638j == this.f638j;
    }

    public int hashCode() {
        return System.identityHashCode(this.f638j);
    }

    @Override // j.e1
    public void i(long j2, @NotNull q<? super Unit> qVar) {
        long coerceAtMost;
        a aVar = new a(qVar, this);
        Handler handler = this.f638j;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(j2, 4611686018427387903L);
        if (handler.postDelayed(aVar, coerceAtMost)) {
            qVar.A(new b(aVar));
        } else {
            y(qVar.getContext(), aVar);
        }
    }

    @Override // j.o0
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        return (this.f640l && Intrinsics.areEqual(Looper.myLooper(), this.f638j.getLooper())) ? false : true;
    }

    @Override // k.e, j.e1
    @NotNull
    public p1 o(long j2, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long coerceAtMost;
        Handler handler = this.f638j;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(j2, 4611686018427387903L);
        if (handler.postDelayed(runnable, coerceAtMost)) {
            return new p1() { // from class: k.c
                @Override // j.p1
                public final void dispose() {
                    d.A(d.this, runnable);
                }
            };
        }
        y(coroutineContext, runnable);
        return c3.f450j;
    }

    @Override // j.z2, j.o0
    @NotNull
    public String toString() {
        String s2 = s();
        String str = s2;
        if (s2 == null) {
            String str2 = this.f639k;
            String str3 = str2;
            if (str2 == null) {
                str3 = this.f638j.toString();
            }
            str = str3;
            if (this.f640l) {
                str = str3 + ".immediate";
            }
        }
        return str;
    }

    public final void y(CoroutineContext coroutineContext, Runnable runnable) {
        r2.g(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m1.c().dispatch(coroutineContext, runnable);
    }

    @Override // k.e
    @NotNull
    /* renamed from: z */
    public d t() {
        return this.f641m;
    }
}
