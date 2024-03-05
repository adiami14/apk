package p;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.i2;
import j.u0;
import j.v0;
import j.w0;
import j.z0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.e0;
import l.g0;
import l.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@i2
@Metadata(bv = {}, d1 = {"��\\\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\b\b'\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028��\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028��0\rH¤@ø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028��0\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028��0\u0015H\u0096@ø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR9\u0010$\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!\u0012\u0006\u0012\u0004\u0018\u00010\"0 8@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b\u001e\u0010#R\u0014\u0010'\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lp/e;", "T", "Lp/r;", "Lo/i;", "k", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "b", "j", "Ll/g0;", "scope", "", "i", "(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/u0;", "Ll/i0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lo/j;", "collector", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "toString", "Lkotlin/coroutines/CoroutineContext;", "I", "l", "Ll/m;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "m", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/e.class */
public abstract class e<T> implements r<T> {
    @JvmField
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f1867j;
    @JvmField

    /* renamed from: k  reason: collision with root package name */
    public final int f1868k;
    @JvmField
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final l.m f1869l;

    @Metadata(bv = {}, d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:p/e$a.class */
    public static final class a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1870j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1871k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1872l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ e<T> f1873m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o.j<? super T> jVar, e<T> eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1872l = jVar;
            this.f1873m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1872l, this.f1873m, continuation);
            aVar.f1871k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1870j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                u0 u0Var = (u0) this.f1871k;
                o.j<T> jVar = this.f1872l;
                i0<T> n2 = this.f1873m.n(u0Var);
                this.f1870j = 1;
                if (o.k.l0(jVar, n2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028��0\u0001H\u008a@"}, d2 = {"T", "Ll/g0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:p/e$b.class */
    public static final class b extends SuspendLambda implements Function2<g0<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1874j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1875k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e<T> f1876l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f1876l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f1876l, continuation);
            bVar.f1875k = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((g0) ((g0) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull g0<? super T> g0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1874j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                g0<? super T> g0Var = (g0) this.f1875k;
                e<T> eVar = this.f1876l;
                this.f1874j = 1;
                if (eVar.i(g0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public e(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        this.f1867j = coroutineContext;
        this.f1868k = i2;
        this.f1869l = mVar;
    }

    public static /* synthetic */ Object f(e eVar, o.j jVar, Continuation continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new a(jVar, eVar, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }

    @Override // p.r
    @NotNull
    public o.i<T> b(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        CoroutineContext plus = coroutineContext.plus(this.f1867j);
        if (mVar == l.m.SUSPEND) {
            int i3 = this.f1868k;
            if (i3 != -3) {
                if (i2 == -3) {
                    i2 = i3;
                } else if (i3 != -2) {
                    if (i2 == -2) {
                        i2 = i3;
                    } else {
                        i2 = i3 + i2;
                        if (i2 < 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            mVar = this.f1869l;
        }
        return (Intrinsics.areEqual(plus, this.f1867j) && i2 == this.f1868k && mVar == this.f1869l) ? this : j(plus, i2, mVar);
    }

    @Override // o.i
    @Nullable
    public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
        return f(this, jVar, continuation);
    }

    @Nullable
    public String e() {
        return null;
    }

    @Nullable
    public abstract Object i(@NotNull g0<? super T> g0Var, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    public abstract e<T> j(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar);

    @Nullable
    public o.i<T> k() {
        return null;
    }

    @NotNull
    public final Function2<g0<? super T>, Continuation<? super Unit>, Object> l() {
        return new b(this, null);
    }

    public final int m() {
        int i2 = this.f1868k;
        int i3 = i2;
        if (i2 == -3) {
            i3 = -2;
        }
        return i3;
    }

    @NotNull
    public i0<T> n(@NotNull u0 u0Var) {
        return e0.h(u0Var, this.f1867j, m(), this.f1869l, w0.ATOMIC, null, l(), 16, null);
    }

    @NotNull
    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        String e2 = e();
        if (e2 != null) {
            arrayList.add(e2);
        }
        if (this.f1867j != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f1867j);
        }
        if (this.f1868k != -3) {
            arrayList.add("capacity=" + this.f1868k);
        }
        if (this.f1869l != l.m.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f1869l);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z0.a(this));
        sb.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        sb.append(']');
        return sb.toString();
    }
}
