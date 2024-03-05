package p;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.u0;
import j.v0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��*\u0004\b��\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028��0\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001��¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001��¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0082\u0004ø\u0001��¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lp/j;", "T", "R", "Lp/h;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "Lp/e;", "j", "Lo/j;", "collector", "", "s", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/jvm/functions/Function3;", "transform", "Lo/i;", "flow", "<init>", "(Lkotlin/jvm/functions/Function3;Lo/i;Lkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/j.class */
public final class j<T, R> extends h<T, R> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final Function3<o.j<? super R>, T, Continuation<? super Unit>, Object> f1896n;

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:p/j$a.class */
    public static final class a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1897j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1898k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ j<T, R> f1899l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1900m;

        @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: p.j$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:p/j$a$a.class */
        public static final class C0087a<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<n2> f1901j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ u0 f1902k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ j<T, R> f1903l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ o.j<R> f1904m;

            @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: p.j$a$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:p/j$a$a$a.class */
            public static final class C0088a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

                /* renamed from: j  reason: collision with root package name */
                public int f1905j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ j<T, R> f1906k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ o.j<R> f1907l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ T f1908m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0088a(j<T, R> jVar, o.j<? super R> jVar2, T t2, Continuation<? super C0088a> continuation) {
                    super(2, continuation);
                    this.f1906k = jVar;
                    this.f1907l = jVar2;
                    this.f1908m = t2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0088a(this.f1906k, this.f1907l, this.f1908m, continuation);
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0088a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
                    return invoke2(u0Var, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f1905j;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.f1906k.f1896n;
                        o.j<R> jVar = this.f1907l;
                        T t2 = this.f1908m;
                        this.f1905j = 1;
                        if (function3.invoke(jVar, t2, this) == coroutine_suspended) {
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

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: p.j$a$a$b */
            /* loaded from: ItsOnFire.jar:p/j$a$a$b.class */
            public static final class b extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public Object f1909j;

                /* renamed from: k  reason: collision with root package name */
                public Object f1910k;

                /* renamed from: l  reason: collision with root package name */
                public Object f1911l;

                /* renamed from: m  reason: collision with root package name */
                public /* synthetic */ Object f1912m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ C0087a<T> f1913n;

                /* renamed from: o  reason: collision with root package name */
                public int f1914o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0087a<? super T> c0087a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f1913n = c0087a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1912m = obj;
                    this.f1914o |= Integer.MIN_VALUE;
                    return this.f1913n.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0087a(Ref.ObjectRef<n2> objectRef, u0 u0Var, j<T, R> jVar, o.j<? super R> jVar2) {
                this.f1901j = objectRef;
                this.f1902k = u0Var;
                this.f1903l = jVar;
                this.f1904m = jVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
                /*
                    Method dump skipped, instructions count: 243
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p.j.a.C0087a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j<T, R> jVar, o.j<? super R> jVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1899l = jVar;
            this.f1900m = jVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1899l, this.f1900m, continuation);
            aVar.f1898k = obj;
            return aVar;
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1897j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                u0 u0Var = (u0) this.f1898k;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                j<T, R> jVar = this.f1899l;
                o.i<S> iVar = jVar.f1892m;
                C0087a c0087a = new C0087a(objectRef, u0Var, jVar, this.f1900m);
                this.f1897j = 1;
                if (iVar.collect(c0087a, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull Function3<? super o.j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull o.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        super(iVar, coroutineContext, i2, mVar);
        this.f1896n = function3;
    }

    public /* synthetic */ j(Function3 function3, o.i iVar, CoroutineContext coroutineContext, int i2, l.m mVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, iVar, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? l.m.SUSPEND : mVar);
    }

    @Override // p.e
    @NotNull
    public e<R> j(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return new j(this.f1896n, this.f1892m, coroutineContext, i2, mVar);
    }

    @Override // p.h
    @Nullable
    public Object s(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new a(this, jVar, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }
}
