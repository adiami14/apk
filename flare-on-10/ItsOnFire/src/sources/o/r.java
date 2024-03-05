package o;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.d2;
import j.f1;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import l.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��0\n��\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001��¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H��\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Lo/i;", "", "timeoutMillis", "a", "Lkotlin/Function1;", "b", "Lkotlin/time/Duration;", "timeout", "c", "(Lo/i;J)Lo/i;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lo/i;Lkotlin/jvm/functions/Function1;)Lo/i;", "timeoutMillisSelector", "e", "periodMillis", "h", "Lj/u0;", "delayMillis", "initialDelayMillis", "Ll/i0;", "", "f", "period", "i", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/r.class */
public final /* synthetic */ class r {

    @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��2\u0006\u0010\u0001\u001a\u00028��H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/r$a.class */
    public static final class a<T> extends Lambda implements Function1<T, Long> {

        /* renamed from: j */
        public final /* synthetic */ long f1483j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j2) {
            super(1);
            this.f1483j = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Long invoke(T t2) {
            return Long.valueOf(this.f1483j);
        }
    }

    @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��2\u0006\u0010\u0001\u001a\u00028��H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "emittedItem", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/r$b.class */
    public static final class b<T> extends Lambda implements Function1<T, Long> {

        /* renamed from: j */
        public final /* synthetic */ Function1<T, Duration> f1484j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super T, Duration> function1) {
            super(1);
            this.f1484j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Long invoke(T t2) {
            return Long.valueOf(f1.e(this.f1484j.invoke(t2).m7353unboximpl()));
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u008a@"}, d2 = {"T", "Lj/u0;", "Lo/j;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: ItsOnFire.jar:o/r$c.class */
    public static final class c<T> extends SuspendLambda implements Function3<j.u0, j<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public Object f1485j;

        /* renamed from: k */
        public Object f1486k;

        /* renamed from: l */
        public int f1487l;

        /* renamed from: m */
        public /* synthetic */ Object f1488m;

        /* renamed from: n */
        public /* synthetic */ Object f1489n;

        /* renamed from: o */
        public final /* synthetic */ Function1<T, Long> f1490o;

        /* renamed from: p */
        public final /* synthetic */ i<T> f1491p;

        @Metadata(bv = {}, d1 = {"��\b\n��\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001\"\u0004\b��\u0010��H\u008a@"}, d2 = {"T", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/r$c$a.class */
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1492j;

            /* renamed from: k */
            public final /* synthetic */ j<T> f1493k;

            /* renamed from: l */
            public final /* synthetic */ Ref.ObjectRef<Object> f1494l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, Ref.ObjectRef<Object> objectRef, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f1493k = jVar;
                this.f1494l = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f1493k, this.f1494l, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1492j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    j<T> jVar = this.f1493k;
                    q.r0 r0Var = p.u.f1988a;
                    T t2 = this.f1494l.element;
                    T t3 = t2;
                    if (t2 == r0Var) {
                        t3 = null;
                    }
                    this.f1492j = 1;
                    if (jVar.emit(t3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.f1494l.element = null;
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/r;", "", "value", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/r$c$b.class */
        public static final class b extends SuspendLambda implements Function2<l.r<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public Object f1495j;

            /* renamed from: k */
            public int f1496k;

            /* renamed from: l */
            public /* synthetic */ Object f1497l;

            /* renamed from: m */
            public final /* synthetic */ Ref.ObjectRef<Object> f1498m;

            /* renamed from: n */
            public final /* synthetic */ j<T> f1499n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.ObjectRef<Object> objectRef, j<? super T> jVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1498m = objectRef;
                this.f1499n = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.f1498m, this.f1499n, continuation);
                bVar.f1497l = obj;
                return bVar;
            }

            @Nullable
            public final Object i(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(l.r.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.r<? extends Object> rVar, Continuation<? super Unit> continuation) {
                return i(rVar.o(), continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1496k;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    T t2 = (T) ((l.r) this.f1497l).o();
                    objectRef = this.f1498m;
                    boolean z = t2 instanceof r.c;
                    if (!z) {
                        objectRef.element = t2;
                    }
                    j<T> jVar = this.f1499n;
                    if (z) {
                        Throwable f2 = l.r.f(t2);
                        if (f2 != null) {
                            throw f2;
                        }
                        Object obj2 = objectRef.element;
                        objectRef2 = objectRef;
                        if (obj2 != 0) {
                            T t3 = obj2;
                            if (obj2 == p.u.f1988a) {
                                t3 = null;
                            }
                            this.f1497l = t2;
                            this.f1495j = objectRef;
                            this.f1496k = 1;
                            if (jVar.emit(t3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        objectRef2.element = (T) p.u.f1990c;
                    }
                    return Unit.INSTANCE;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    objectRef = (Ref.ObjectRef) this.f1495j;
                }
                objectRef2 = objectRef;
                objectRef2.element = (T) p.u.f1990c;
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/g0;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.r$c$c */
        /* loaded from: ItsOnFire.jar:o/r$c$c.class */
        public static final class C0073c extends SuspendLambda implements Function2<l.g0<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1500j;

            /* renamed from: k */
            public /* synthetic */ Object f1501k;

            /* renamed from: l */
            public final /* synthetic */ i<T> f1502l;

            @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: o.r$c$c$a */
            /* loaded from: ItsOnFire.jar:o/r$c$c$a.class */
            public static final class a<T> implements j {

                /* renamed from: j */
                public final /* synthetic */ l.g0<Object> f1503j;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                /* renamed from: o.r$c$c$a$a */
                /* loaded from: ItsOnFire.jar:o/r$c$c$a$a.class */
                public static final class C0074a extends ContinuationImpl {

                    /* renamed from: j */
                    public /* synthetic */ Object f1504j;

                    /* renamed from: k */
                    public final /* synthetic */ a<T> f1505k;

                    /* renamed from: l */
                    public int f1506l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0074a(a<? super T> aVar, Continuation<? super C0074a> continuation) {
                        super(continuation);
                        this.f1505k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1504j = obj;
                        this.f1506l |= Integer.MIN_VALUE;
                        return this.f1505k.emit(null, this);
                    }
                }

                public a(l.g0<Object> g0Var) {
                    this.f1503j = g0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
                /* JADX WARN: Type inference failed for: r0v18, types: [q.r0] */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof o.r.c.C0073c.a.C0074a
                        if (r0 == 0) goto L28
                        r0 = r7
                        o.r$c$c$a$a r0 = (o.r.c.C0073c.a.C0074a) r0
                        r8 = r0
                        r0 = r8
                        int r0 = r0.f1506l
                        r9 = r0
                        r0 = r9
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L28
                        r0 = r8
                        r1 = r9
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.f1506l = r1
                        r0 = r8
                        r7 = r0
                        goto L32
                    L28:
                        o.r$c$c$a$a r0 = new o.r$c$c$a$a
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L32:
                        r0 = r7
                        java.lang.Object r0 = r0.f1504j
                        r8 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r10 = r0
                        r0 = r7
                        int r0 = r0.f1506l
                        r9 = r0
                        r0 = r9
                        if (r0 == 0) goto L5e
                        r0 = r9
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r8
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L88
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r8
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r5
                        l.g0<java.lang.Object> r0 = r0.f1503j
                        r11 = r0
                        r0 = r6
                        r8 = r0
                        r0 = r6
                        if (r0 != 0) goto L72
                        q.r0 r0 = p.u.f1988a
                        r8 = r0
                    L72:
                        r0 = r7
                        r1 = 1
                        r0.f1506l = r1
                        r0 = r11
                        r1 = r8
                        r2 = r7
                        java.lang.Object r0 = r0.U(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L88
                        r0 = r10
                        return r0
                    L88:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.r.c.C0073c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0073c(i<? extends T> iVar, Continuation<? super C0073c> continuation) {
                super(2, continuation);
                this.f1502l = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0073c c0073c = new C0073c(this.f1502l, continuation);
                c0073c.f1501k = obj;
                return c0073c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.g0<? super Object> g0Var, Continuation<? super Unit> continuation) {
                return invoke2((l.g0<Object>) g0Var, continuation);
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@NotNull l.g0<Object> g0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0073c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1500j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    l.g0 g0Var = (l.g0) this.f1501k;
                    i<T> iVar = this.f1502l;
                    a aVar = new a(g0Var);
                    this.f1500j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super T, Long> function1, i<? extends T> iVar, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f1490o = function1;
            this.f1491p = iVar;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j.u0 u0Var, @NotNull j<? super T> jVar, @Nullable Continuation<? super Unit> continuation) {
            c cVar = new c(this.f1490o, this.f1491p, continuation);
            cVar.f1488m = u0Var;
            cVar.f1489n = jVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:11|(6:13|(1:15)|16|(1:18)(1:34)|19|(2:21|(5:23|(1:25)|26|(2:28|29)|31))(2:32|33))|35|36|37|38|(1:40)|41|42|43|(1:45)|46|(2:48|49)|8|9|(2:53|54)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0223, code lost:
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0225, code lost:
            r0.p0(r15);
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01de A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:100:0x01d7, B:102:0x01de, B:104:0x0200), top: B:116:0x01d7 }] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0242 -> B:68:0x0042). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 587
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010��H\u008a@"}, d2 = {"Ll/g0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, 316, 317}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: ItsOnFire.jar:o/r$d.class */
    public static final class d extends SuspendLambda implements Function2<l.g0<? super Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1507j;

        /* renamed from: k */
        public /* synthetic */ Object f1508k;

        /* renamed from: l */
        public final /* synthetic */ long f1509l;

        /* renamed from: m */
        public final /* synthetic */ long f1510m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j2, long j3, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f1509l = j2;
            this.f1510m = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f1509l, this.f1510m, continuation);
            dVar.f1508k = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull l.g0<? super Unit> g0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00b5 -> B:46:0x0077). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r6 = r0
                r0 = r4
                int r0 = r0.f1507j
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L4f
                r0 = r7
                r1 = 1
                if (r0 == r1) goto L3c
                r0 = r7
                r1 = 2
                if (r0 == r1) goto L29
                r0 = r7
                r1 = 3
                if (r0 != r1) goto L1f
                goto L3c
            L1f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L29:
                r0 = r4
                java.lang.Object r0 = r0.f1508k
                l.g0 r0 = (l.g0) r0
                r8 = r0
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                r5 = r0
                goto L9e
            L3c:
                r0 = r4
                java.lang.Object r0 = r0.f1508k
                l.g0 r0 = (l.g0) r0
                r8 = r0
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                r5 = r0
                goto L77
            L4f:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r4
                java.lang.Object r0 = r0.f1508k
                l.g0 r0 = (l.g0) r0
                r5 = r0
                r0 = r4
                long r0 = r0.f1509l
                r9 = r0
                r0 = r4
                r1 = r5
                r0.f1508k = r1
                r0 = r4
                r1 = 1
                r0.f1507j = r1
                r0 = r9
                r1 = r4
                java.lang.Object r0 = j.f1.b(r0, r1)
                r1 = r6
                if (r0 != r1) goto L77
                r0 = r6
                return r0
            L77:
                r0 = r5
                l.m0 r0 = r0.c()
                r8 = r0
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r11 = r0
                r0 = r4
                r1 = r5
                r0.f1508k = r1
                r0 = r4
                r1 = 2
                r0.f1507j = r1
                r0 = r8
                r1 = r11
                r2 = r4
                java.lang.Object r0 = r0.U(r1, r2)
                r1 = r6
                if (r0 != r1) goto L9e
                r0 = r6
                return r0
            L9e:
                r0 = r4
                long r0 = r0.f1510m
                r9 = r0
                r0 = r4
                r1 = r5
                r0.f1508k = r1
                r0 = r4
                r1 = 3
                r0.f1507j = r1
                r0 = r9
                r1 = r4
                java.lang.Object r0 = j.f1.b(r0, r1)
                r1 = r6
                if (r0 != r1) goto L77
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u008a@"}, d2 = {"T", "Lj/u0;", "Lo/j;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: ItsOnFire.jar:o/r$e.class */
    public static final class e<T> extends SuspendLambda implements Function3<j.u0, j<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public Object f1511j;

        /* renamed from: k */
        public Object f1512k;

        /* renamed from: l */
        public int f1513l;

        /* renamed from: m */
        public /* synthetic */ Object f1514m;

        /* renamed from: n */
        public /* synthetic */ Object f1515n;

        /* renamed from: o */
        public final /* synthetic */ long f1516o;

        /* renamed from: p */
        public final /* synthetic */ i<T> f1517p;

        @Metadata(bv = {}, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/r;", "", "result", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/r$e$a.class */
        public static final class a extends SuspendLambda implements Function2<l.r<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1518j;

            /* renamed from: k */
            public /* synthetic */ Object f1519k;

            /* renamed from: l */
            public final /* synthetic */ Ref.ObjectRef<Object> f1520l;

            /* renamed from: m */
            public final /* synthetic */ l.i0<Unit> f1521m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<Object> objectRef, l.i0<Unit> i0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1520l = objectRef;
                this.f1521m = i0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f1520l, this.f1521m, continuation);
                aVar.f1519k = obj;
                return aVar;
            }

            @Nullable
            public final Object i(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(l.r.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.r<? extends Object> rVar, Continuation<? super Unit> continuation) {
                return i(rVar.o(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1518j == 0) {
                    ResultKt.throwOnFailure(obj);
                    T t2 = (T) ((l.r) this.f1519k).o();
                    Ref.ObjectRef<Object> objectRef = this.f1520l;
                    boolean z = t2 instanceof r.c;
                    if (!z) {
                        objectRef.element = t2;
                    }
                    l.i0<Unit> i0Var = this.f1521m;
                    if (z) {
                        Throwable f2 = l.r.f(t2);
                        if (f2 != null) {
                            throw f2;
                        }
                        i0Var.cancel(new p.l());
                        objectRef.element = (T) p.u.f1990c;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b��\u0010��2\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {AnimationConstants.DefaultDurationMillis}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/r$e$b.class */
        public static final class b extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1522j;

            /* renamed from: k */
            public final /* synthetic */ Ref.ObjectRef<Object> f1523k;

            /* renamed from: l */
            public final /* synthetic */ j<T> f1524l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.ObjectRef<Object> objectRef, j<? super T> jVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1523k = objectRef;
                this.f1524l = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f1523k, this.f1524l, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1522j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef<Object> objectRef = this.f1523k;
                    Object obj2 = objectRef.element;
                    if (obj2 == null) {
                        return Unit.INSTANCE;
                    }
                    objectRef.element = null;
                    j<T> jVar = this.f1524l;
                    Object obj3 = obj2;
                    if (obj2 == p.u.f1988a) {
                        obj3 = null;
                    }
                    this.f1522j = 1;
                    if (jVar.emit(obj3, this) == coroutine_suspended) {
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

        @Metadata(bv = {}, d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/g0;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/r$e$c.class */
        public static final class c extends SuspendLambda implements Function2<l.g0<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1525j;

            /* renamed from: k */
            public /* synthetic */ Object f1526k;

            /* renamed from: l */
            public final /* synthetic */ i<T> f1527l;

            @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* loaded from: ItsOnFire.jar:o/r$e$c$a.class */
            public static final class a<T> implements j {

                /* renamed from: j */
                public final /* synthetic */ l.g0<Object> f1528j;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                /* renamed from: o.r$e$c$a$a */
                /* loaded from: ItsOnFire.jar:o/r$e$c$a$a.class */
                public static final class C0075a extends ContinuationImpl {

                    /* renamed from: j */
                    public /* synthetic */ Object f1529j;

                    /* renamed from: k */
                    public final /* synthetic */ a<T> f1530k;

                    /* renamed from: l */
                    public int f1531l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0075a(a<? super T> aVar, Continuation<? super C0075a> continuation) {
                        super(continuation);
                        this.f1530k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1529j = obj;
                        this.f1531l |= Integer.MIN_VALUE;
                        return this.f1530k.emit(null, this);
                    }
                }

                public a(l.g0<Object> g0Var) {
                    this.f1528j = g0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
                /* JADX WARN: Type inference failed for: r0v18, types: [q.r0] */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof o.r.e.c.a.C0075a
                        if (r0 == 0) goto L28
                        r0 = r7
                        o.r$e$c$a$a r0 = (o.r.e.c.a.C0075a) r0
                        r8 = r0
                        r0 = r8
                        int r0 = r0.f1531l
                        r9 = r0
                        r0 = r9
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L28
                        r0 = r8
                        r1 = r9
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.f1531l = r1
                        r0 = r8
                        r7 = r0
                        goto L32
                    L28:
                        o.r$e$c$a$a r0 = new o.r$e$c$a$a
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L32:
                        r0 = r7
                        java.lang.Object r0 = r0.f1529j
                        r8 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r10 = r0
                        r0 = r7
                        int r0 = r0.f1531l
                        r9 = r0
                        r0 = r9
                        if (r0 == 0) goto L5e
                        r0 = r9
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r8
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L88
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r8
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r5
                        l.g0<java.lang.Object> r0 = r0.f1528j
                        r11 = r0
                        r0 = r6
                        r8 = r0
                        r0 = r6
                        if (r0 != 0) goto L72
                        q.r0 r0 = p.u.f1988a
                        r8 = r0
                    L72:
                        r0 = r7
                        r1 = 1
                        r0.f1531l = r1
                        r0 = r11
                        r1 = r8
                        r2 = r7
                        java.lang.Object r0 = r0.U(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L88
                        r0 = r10
                        return r0
                    L88:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.r.e.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(i<? extends T> iVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f1527l = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(this.f1527l, continuation);
                cVar.f1526k = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.g0<? super Object> g0Var, Continuation<? super Unit> continuation) {
                return invoke2((l.g0<Object>) g0Var, continuation);
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@NotNull l.g0<Object> g0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1525j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    l.g0 g0Var = (l.g0) this.f1526k;
                    i<T> iVar = this.f1527l;
                    a aVar = new a(g0Var);
                    this.f1525j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j2, i<? extends T> iVar, Continuation<? super e> continuation) {
            super(3, continuation);
            this.f1516o = j2;
            this.f1517p = iVar;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j.u0 u0Var, @NotNull j<? super T> jVar, @Nullable Continuation<? super Unit> continuation) {
            e eVar = new e(this.f1516o, this.f1517p, continuation);
            eVar.f1514m = u0Var;
            eVar.f1515n = jVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            j jVar;
            l.i0 g2;
            Ref.ObjectRef objectRef;
            l.i0 g3;
            l.i0 i0Var;
            Object coroutine_suspended2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1513l;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                j.u0 u0Var = (j.u0) this.f1514m;
                jVar = (j) this.f1515n;
                g2 = l.e0.g(u0Var, null, -1, new c(this.f1517p, null), 1, null);
                objectRef = new Ref.ObjectRef();
                g3 = r.g(u0Var, this.f1516o, 0L, 2, null);
                i0Var = g3;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i0Var = (l.i0) this.f1512k;
                objectRef = (Ref.ObjectRef) this.f1511j;
                g2 = (l.i0) this.f1515n;
                ResultKt.throwOnFailure(obj);
                jVar = (j) this.f1514m;
            }
            while (objectRef.element != p.u.f1990c) {
                this.f1514m = jVar;
                this.f1515n = g2;
                this.f1511j = objectRef;
                this.f1512k = i0Var;
                this.f1513l = 1;
                t.b bVar = new t.b(this);
                try {
                    bVar.g(g2.p(), new a(objectRef, i0Var, null));
                    bVar.g(i0Var.o(), new b(objectRef, jVar, null));
                } catch (Throwable th) {
                    bVar.p0(th);
                }
                Object o0 = bVar.o0();
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (o0 == coroutine_suspended2) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (o0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d2
    @NotNull
    public static final <T> i<T> a(@NotNull i<? extends T> iVar, long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            return i2 == 0 ? iVar : e(iVar, new a(j2));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @d2
    @OverloadResolutionByLambdaReturnType
    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Long> function1) {
        return e(iVar, function1);
    }

    @d2
    @NotNull
    public static final <T> i<T> c(@NotNull i<? extends T> iVar, long j2) {
        return k.a0(iVar, f1.e(j2));
    }

    @d2
    @JvmName(name = "debounceDuration")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> d(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Duration> function1) {
        return e(iVar, new b(function1));
    }

    public static final <T> i<T> e(i<? extends T> iVar, Function1<? super T, Long> function1) {
        return p.p.b(new c(function1, iVar, null));
    }

    @NotNull
    public static final l.i0<Unit> f(@NotNull j.u0 u0Var, long j2, long j3) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
        }
        if (j3 >= 0) {
            return l.e0.g(u0Var, null, 0, new d(j3, j2, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j3 + " ms").toString());
    }

    public static /* synthetic */ l.i0 g(j.u0 u0Var, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = j2;
        }
        return k.x0(u0Var, j2, j3);
    }

    @d2
    @NotNull
    public static final <T> i<T> h(@NotNull i<? extends T> iVar, long j2) {
        if (j2 > 0) {
            return p.p.b(new e(j2, iVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @d2
    @NotNull
    public static final <T> i<T> i(@NotNull i<? extends T> iVar, long j2) {
        return k.A1(iVar, f1.e(j2));
    }
}
