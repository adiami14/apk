package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.r2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"��r\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\n\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b��\u0010��*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028��0\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028��H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028��0\u0016\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028��¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028��0\u0016\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001��¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b��\u0010��*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028��0\u0016\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001��¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"T", "Lo/i;", "Lj/u0;", "scope", "Lo/o0;", "started", "", "replay", "Lo/i0;", "g", "Lo/n0;", "c", "(Lo/i;I)Lo/n0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lo/d0;", "shared", "initialValue", "Lj/n2;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lo/i;Lo/d0;Lo/o0;Ljava/lang/Object;)Lj/n2;", "Lo/t0;", "j", "(Lo/i;Lj/u0;Lo/o0;Ljava/lang/Object;)Lo/t0;", "i", "(Lo/i;Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/z;", "result", "", "e", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lo/i;Lj/z;)V", "a", "Lo/e0;", "b", "Lkotlin/Function2;", "Lo/j;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "action", "f", "(Lo/i0;Lkotlin/jvm/functions/Function2;)Lo/i0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/z.class */
public final /* synthetic */ class z {

    @Metadata(bv = {}, d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/z$a.class */
    public static final class a extends SuspendLambda implements Function2<j.u0, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1834j;

        /* renamed from: k */
        public final /* synthetic */ o0 f1835k;

        /* renamed from: l */
        public final /* synthetic */ i<T> f1836l;

        /* renamed from: m */
        public final /* synthetic */ d0<T> f1837m;

        /* renamed from: n */
        public final /* synthetic */ T f1838n;

        @Metadata(bv = {}, d1 = {"��\u000e\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��2\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.z$a$a */
        /* loaded from: ItsOnFire.jar:o/z$a$a.class */
        public static final class C0084a extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: j */
            public int f1839j;

            /* renamed from: k */
            public /* synthetic */ int f1840k;

            public C0084a(Continuation<? super C0084a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0084a c0084a = new C0084a(continuation);
                c0084a.f1840k = ((Number) obj).intValue();
                return c0084a;
            }

            @Nullable
            public final Object i(int i2, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0084a) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                return i(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1839j == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.f1840k > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��2\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lo/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/z$a$b.class */
        public static final class b extends SuspendLambda implements Function2<m0, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1841j;

            /* renamed from: k */
            public /* synthetic */ Object f1842k;

            /* renamed from: l */
            public final /* synthetic */ i<T> f1843l;

            /* renamed from: m */
            public final /* synthetic */ d0<T> f1844m;

            /* renamed from: n */
            public final /* synthetic */ T f1845n;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: o.z$a$b$a */
            /* loaded from: ItsOnFire.jar:o/z$a$b$a.class */
            public final /* synthetic */ class C0085a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f1846a;

                static {
                    int[] iArr = new int[m0.values().length];
                    iArr[m0.START.ordinal()] = 1;
                    iArr[m0.STOP.ordinal()] = 2;
                    iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f1846a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(i<? extends T> iVar, d0<T> d0Var, T t2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1843l = iVar;
                this.f1844m = d0Var;
                this.f1845n = t2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.f1843l, this.f1844m, this.f1845n, continuation);
                bVar.f1842k = obj;
                return bVar;
            }

            @Nullable
            public final Object i(@NotNull m0 m0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(m0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(m0 m0Var, Continuation<? super Unit> continuation) {
                return i(m0Var, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1841j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i3 = C0085a.f1846a[((m0) this.f1842k).ordinal()];
                    if (i3 == 1) {
                        i<T> iVar = this.f1843l;
                        i0 i0Var = this.f1844m;
                        this.f1841j = 1;
                        if (iVar.collect(i0Var, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i3 == 3) {
                        T t2 = this.f1845n;
                        q.r0 r0Var = k0.f1365a;
                        d0<T> d0Var = this.f1844m;
                        if (t2 == r0Var) {
                            d0Var.d();
                        } else {
                            d0Var.g(t2);
                        }
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
        public a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1835k = o0Var;
            this.f1836l = iVar;
            this.f1837m = d0Var;
            this.f1838n = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f1835k, this.f1836l, this.f1837m, this.f1838n, continuation);
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@NotNull j.u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(j.u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/z$b.class */
    public static final class b extends SuspendLambda implements Function2<j.u0, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1847j;

        /* renamed from: k */
        public /* synthetic */ Object f1848k;

        /* renamed from: l */
        public final /* synthetic */ i<T> f1849l;

        /* renamed from: m */
        public final /* synthetic */ j.z<t0<T>> f1850m;

        @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:o/z$b$a.class */
        public static final class a<T> implements j {

            /* renamed from: j */
            public final /* synthetic */ Ref.ObjectRef<e0<T>> f1851j;

            /* renamed from: k */
            public final /* synthetic */ j.u0 f1852k;

            /* renamed from: l */
            public final /* synthetic */ j.z<t0<T>> f1853l;

            public a(Ref.ObjectRef<e0<T>> objectRef, j.u0 u0Var, j.z<t0<T>> zVar) {
                this.f1851j = objectRef;
                this.f1852k = u0Var;
                this.f1853l = zVar;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [T, o.t0, o.e0] */
            @Override // o.j
            @Nullable
            public final Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
                Unit unit;
                e0<T> e0Var = this.f1851j.element;
                if (e0Var != null) {
                    e0Var.setValue(t2);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    j.u0 u0Var = this.f1852k;
                    Ref.ObjectRef<e0<T>> objectRef = this.f1851j;
                    j.z<t0<T>> zVar = this.f1853l;
                    ?? r0 = (T) v0.a(t2);
                    zVar.P(new g0(r0, r2.B(u0Var.getCoroutineContext())));
                    objectRef.element = r0;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, j.z<t0<T>> zVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f1849l = iVar;
            this.f1850m = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f1849l, this.f1850m, continuation);
            bVar.f1848k = obj;
            return bVar;
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@NotNull j.u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(j.u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1847j;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    j.u0 u0Var = (j.u0) this.f1848k;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    i<T> iVar = this.f1849l;
                    a aVar = new a(objectRef, u0Var, this.f1850m);
                    this.f1847j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.f1850m.d(th);
                throw th;
            }
        }
    }

    @NotNull
    public static final <T> i0<T> a(@NotNull d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @NotNull
    public static final <T> t0<T> b(@NotNull e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        if (r0 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> o.n0<T> c(o.i<? extends T> r7, int r8) {
        /*
            r0 = r8
            l.n$b r1 = l.n.f727c
            int r1 = r1.a()
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
            r1 = r8
            int r0 = r0 - r1
            r9 = r0
            r0 = r7
            boolean r0 = r0 instanceof p.e
            if (r0 == 0) goto L75
            r0 = r7
            p.e r0 = (p.e) r0
            r10 = r0
            r0 = r10
            o.i r0 = r0.k()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L75
            r0 = r10
            int r0 = r0.f1868k
            r12 = r0
            r0 = r12
            r1 = -3
            if (r0 == r1) goto L43
            r0 = r12
            r1 = -2
            if (r0 == r1) goto L43
            r0 = r12
            if (r0 == 0) goto L43
            r0 = r12
            r8 = r0
            goto L62
        L43:
            r0 = r10
            l.m r0 = r0.f1869l
            l.m r1 = l.m.SUSPEND
            if (r0 != r1) goto L57
            r0 = r9
            r8 = r0
            r0 = r12
            if (r0 != 0) goto L62
            goto L60
        L57:
            r0 = r8
            if (r0 != 0) goto L60
            r0 = 1
            r8 = r0
            goto L62
        L60:
            r0 = 0
            r8 = r0
        L62:
            o.n0 r0 = new o.n0
            r1 = r0
            r2 = r11
            r3 = r8
            r4 = r10
            l.m r4 = r4.f1869l
            r5 = r10
            kotlin.coroutines.CoroutineContext r5 = r5.f1867j
            r1.<init>(r2, r3, r4, r5)
            return r0
        L75:
            o.n0 r0 = new o.n0
            r1 = r0
            r2 = r7
            r3 = r9
            l.m r4 = l.m.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r1.<init>(r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.c(o.i, int):o.n0");
    }

    public static final <T> n2 d(j.u0 u0Var, CoroutineContext coroutineContext, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t2) {
        return j.j.d(u0Var, coroutineContext, Intrinsics.areEqual(o0Var, o0.f1466a.c()) ? j.w0.DEFAULT : j.w0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t2, null));
    }

    public static final <T> void e(j.u0 u0Var, CoroutineContext coroutineContext, i<? extends T> iVar, j.z<t0<T>> zVar) {
        j.l.f(u0Var, coroutineContext, null, new b(iVar, zVar, null), 2, null);
    }

    @NotNull
    public static final <T> i0<T> f(@NotNull i0<? extends T> i0Var, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new y0(i0Var, function2);
    }

    @NotNull
    public static final <T> i0<T> g(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull o0 o0Var, int i2) {
        n0 c2 = c(iVar, i2);
        d0 a2 = k0.a(i2, c2.f1459b, c2.f1460c);
        return new f0(a2, d(u0Var, c2.f1461d, c2.f1458a, a2, o0Var, k0.f1365a));
    }

    public static /* synthetic */ i0 h(i iVar, j.u0 u0Var, o0 o0Var, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return k.F1(iVar, u0Var, o0Var, i2);
    }

    @Nullable
    public static final <T> Object i(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull Continuation<? super t0<? extends T>> continuation) {
        n0 c2 = c(iVar, 1);
        j.z c3 = j.b0.c(null, 1, null);
        e(u0Var, c2.f1461d, c2.f1458a, c3);
        return c3.x(continuation);
    }

    @NotNull
    public static final <T> t0<T> j(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull o0 o0Var, T t2) {
        n0 c2 = c(iVar, 1);
        e0 a2 = v0.a(t2);
        return new g0(a2, d(u0Var, c2.f1461d, c2.f1458a, a2, o0Var, t2));
    }
}
