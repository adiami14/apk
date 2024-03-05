package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.ServiceStarter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��p\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n��\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028��0\u00042\b\u0012\u0004\u0012\u00028��0\u00052\b\u0012\u0004\u0012\u00028��0\u0006B\u000f\u0012\u0006\u00108\u001a\u00020(¢\u0006\u0004\b9\u00102J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028��2\u0006\u0010\b\u001a\u00028��H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028��H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028��0\u0014H\u0096@ø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\b\u0012\u0004\u0012\u00028��0%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010\u000bR\u0016\u0010.\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R*\u0010\f\u001a\u00028��2\u0006\u0010\f\u001a\u00028��8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b3\u0010\u0013\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028��048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lo/u0;", "T", "Lp/b;", "Lo/w0;", "Lo/e0;", "Lo/c;", "Lp/r;", "expect", "update", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "g", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()V", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "()Lo/w0;", "", "size", "", "r", "(I)[Lo/w0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ll/m;", "onBufferOverflow", "Lo/i;", "b", "(Lkotlin/coroutines/CoroutineContext;ILl/m;)Lo/i;", "", "expectedState", "newState", "t", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "a", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/u0.class */
public final class u0<T> extends p.b<w0> implements e0<T>, c<T>, p.r<T> {
    @NotNull
    private volatile /* synthetic */ Object _state;

    /* renamed from: n  reason: collision with root package name */
    public int f1634n;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, ServiceStarter.ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* loaded from: ItsOnFire.jar:o/u0$a.class */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1635j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1636k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1637l;

        /* renamed from: m  reason: collision with root package name */
        public Object f1638m;

        /* renamed from: n  reason: collision with root package name */
        public Object f1639n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f1640o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ u0<T> f1641p;

        /* renamed from: q  reason: collision with root package name */
        public int f1642q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0<T> u0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f1641p = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1640o = obj;
            this.f1642q |= Integer.MIN_VALUE;
            return this.f1641p.collect(null, this);
        }
    }

    public u0(@NotNull Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void s() {
    }

    @Override // o.i0
    @NotNull
    public List<T> a() {
        List<T> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(getValue());
        return listOf;
    }

    @Override // p.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return v0.d(this, coroutineContext, i2, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [q.r0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [q.r0] */
    @Override // o.e0
    public boolean c(T t2, T t3) {
        T t4 = t2;
        if (t2 == null) {
            t4 = p.u.f1988a;
        }
        T t5 = t3;
        if (t3 == null) {
            t5 = p.u.f1988a;
        }
        return t(t4, t5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ef, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12, r0) == false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a9  */
    /* JADX WARN: Type inference failed for: r0v10, types: [p.b] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, o.w0] */
    /* JADX WARN: Type inference failed for: r0v153, types: [o.w0] */
    /* JADX WARN: Type inference failed for: r0v171, types: [o.w0] */
    /* JADX WARN: Type inference failed for: r0v193, types: [o.w0] */
    /* JADX WARN: Type inference failed for: r0v69, types: [o.w0] */
    /* JADX WARN: Type inference failed for: r0v91, types: [o.w0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0326 -> B:50:0x01aa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x02a6 -> B:50:0x01aa). Please submit an issue!!! */
    @Override // o.i0, o.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r7) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.u0.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o.d0
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // o.d0, o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        setValue(t2);
        return Unit.INSTANCE;
    }

    @Override // o.d0
    public boolean g(T t2) {
        setValue(t2);
        return true;
    }

    @Override // o.e0, o.t0
    public T getValue() {
        q.r0 r0Var = p.u.f1988a;
        Object obj = this._state;
        Object obj2 = obj;
        if (obj == r0Var) {
            obj2 = null;
        }
        return (T) obj2;
    }

    @Override // p.b
    @NotNull
    /* renamed from: q */
    public w0 j() {
        return new w0();
    }

    @Override // p.b
    @NotNull
    /* renamed from: r */
    public w0[] k(int i2) {
        return new w0[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [q.r0] */
    @Override // o.e0
    public void setValue(T t2) {
        T t3 = t2;
        if (t2 == null) {
            t3 = p.u.f1988a;
        }
        t(null, t3);
    }

    public final boolean t(Object obj, Object obj2) {
        int i2;
        o();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i3 = this.f1634n;
            if ((i3 & 1) != 0) {
                this.f1634n = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f1634n = i4;
            w0[] o2 = o();
            Unit unit = Unit.INSTANCE;
            while (true) {
                w0[] w0VarArr = o2;
                if (w0VarArr != null) {
                    for (w0 w0Var : w0VarArr) {
                        if (w0Var != null) {
                            w0Var.f();
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f1634n;
                    if (i2 == i4) {
                        this.f1634n = i4 + 1;
                        return true;
                    }
                    o2 = o();
                    Unit unit2 = Unit.INSTANCE;
                }
                i4 = i2;
            }
        }
    }
}
