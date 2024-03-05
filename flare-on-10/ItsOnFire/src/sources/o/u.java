package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��P\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001��¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001��¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001��¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0080@ø\u0001��¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Lo/i;", "Lkotlin/Function3;", "Lo/j;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "a", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lo/i;JLkotlin/jvm/functions/Function2;)Lo/i;", "Lkotlin/Function4;", "attempt", "g", "(Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;", "collector", "b", "(Lo/i;Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/u.class */
public final /* synthetic */ class u {

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/u$a.class */
    public static final class a<T> implements i<T> {

        /* renamed from: j */
        public final /* synthetic */ i f1602j;

        /* renamed from: k */
        public final /* synthetic */ Function3 f1603k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        /* renamed from: o.u$a$a */
        /* loaded from: ItsOnFire.jar:o/u$a$a.class */
        public static final class C0079a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1604j;

            /* renamed from: k */
            public int f1605k;

            /* renamed from: m */
            public Object f1607m;

            /* renamed from: n */
            public Object f1608n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0079a(Continuation continuation) {
                super(continuation);
                a.this = r4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1604j = obj;
                this.f1605k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(i iVar, Function3 function3) {
            this.f1602j = iVar;
            this.f1603k = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.a.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/u$b.class */
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: j */
        public Object f1609j;

        /* renamed from: k */
        public /* synthetic */ Object f1610k;

        /* renamed from: l */
        public int f1611l;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1610k = obj;
            this.f1611l |= Integer.MIN_VALUE;
            return k.v(null, null, this);
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/u$c.class */
    public static final class c<T> implements j {

        /* renamed from: j */
        public final /* synthetic */ j<T> f1612j;

        /* renamed from: k */
        public final /* synthetic */ Ref.ObjectRef<Throwable> f1613k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/u$c$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public Object f1614j;

            /* renamed from: k */
            public /* synthetic */ Object f1615k;

            /* renamed from: l */
            public final /* synthetic */ c<T> f1616l;

            /* renamed from: m */
            public int f1617m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1616l = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1615k = obj;
                this.f1617m |= Integer.MIN_VALUE;
                return this.f1616l.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(j<? super T> jVar, Ref.ObjectRef<Throwable> objectRef) {
            this.f1612j = jVar;
            this.f1613k = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0066  */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, T] */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
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
                boolean r0 = r0 instanceof o.u.c.a
                if (r0 == 0) goto L26
                r0 = r7
                o.u$c$a r0 = (o.u.c.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1617m
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L26
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1617m = r1
                goto L30
            L26:
                o.u$c$a r0 = new o.u$c$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r8 = r0
            L30:
                r0 = r8
                java.lang.Object r0 = r0.f1615k
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r8
                int r0 = r0.f1617m
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L66
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L5c
                r0 = r8
                java.lang.Object r0 = r0.f1614j
                o.u$c r0 = (o.u.c) r0
                r7 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L9a
                goto L96
            L5c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L66:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                r7 = r0
                r0 = r5
                o.j<T> r0 = r0.f1612j     // Catch: java.lang.Throwable -> L9a
                r10 = r0
                r0 = r5
                r7 = r0
                r0 = r8
                r1 = r5
                r0.f1614j = r1     // Catch: java.lang.Throwable -> L9a
                r0 = r5
                r7 = r0
                r0 = r8
                r1 = 1
                r0.f1617m = r1     // Catch: java.lang.Throwable -> L9a
                r0 = r5
                r7 = r0
                r0 = r10
                r1 = r6
                r2 = r8
                java.lang.Object r0 = r0.emit(r1, r2)     // Catch: java.lang.Throwable -> L9a
                r6 = r0
                r0 = r6
                r1 = r11
                if (r0 != r1) goto L96
                r0 = r11
                return r0
            L96:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9a:
                r6 = move-exception
                r0 = r7
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r0 = r0.f1613k
                r1 = r6
                r0.element = r1
                r0 = r6
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n��\n\u0002\u0010\u0003\n��\n\u0002\u0010\u000b\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��2\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/u$d.class */
    public static final class d extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: j */
        public int f1618j;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull Throwable th, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1618j == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0018\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u000b\n��\u0010\u0007\u001a\u00020\u0006\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"T", "Lo/j;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/u$e.class */
    public static final class e<T> extends SuspendLambda implements Function4<j<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: j */
        public int f1619j;

        /* renamed from: k */
        public /* synthetic */ Object f1620k;

        /* renamed from: l */
        public /* synthetic */ long f1621l;

        /* renamed from: m */
        public final /* synthetic */ long f1622m;

        /* renamed from: n */
        public final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> f1623n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(4, continuation);
            this.f1622m = j2;
            this.f1623n = function2;
        }

        @Nullable
        public final Object i(@NotNull j<? super T> jVar, @NotNull Throwable th, long j2, @Nullable Continuation<? super Boolean> continuation) {
            e eVar = new e(this.f1622m, this.f1623n, continuation);
            eVar.f1620k = th;
            eVar.f1621l = j2;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l2, Continuation<? super Boolean> continuation) {
            return i((j) obj, th, l2.longValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
            if (((java.lang.Boolean) r6).booleanValue() != false) goto L9;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r7 = r0
                r0 = r5
                int r0 = r0.f1619j
                r8 = r0
                r0 = 1
                r9 = r0
                r0 = r8
                if (r0 == 0) goto L26
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L1c
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                goto L5f
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L26:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                java.lang.Object r0 = r0.f1620k
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r10 = r0
                r0 = r5
                long r0 = r0.f1621l
                r1 = r5
                long r1 = r1.f1622m
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L6c
                r0 = r5
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r0.f1623n
                r6 = r0
                r0 = r5
                r1 = 1
                r0.f1619j = r1
                r0 = r6
                r1 = r10
                r2 = r5
                java.lang.Object r0 = r0.invoke(r1, r2)
                r10 = r0
                r0 = r10
                r6 = r0
                r0 = r10
                r1 = r7
                if (r0 != r1) goto L5f
                r0 = r7
                return r0
            L5f:
                r0 = r6
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L6c
                goto L6f
            L6c:
                r0 = 0
                r9 = r0
            L6f:
                r0 = r9
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/u$f.class */
    public static final class f<T> implements i<T> {

        /* renamed from: j */
        public final /* synthetic */ i f1624j;

        /* renamed from: k */
        public final /* synthetic */ Function4 f1625k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        /* loaded from: ItsOnFire.jar:o/u$f$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1626j;

            /* renamed from: k */
            public int f1627k;

            /* renamed from: m */
            public Object f1629m;

            /* renamed from: n */
            public Object f1630n;

            /* renamed from: o */
            public Object f1631o;

            /* renamed from: p */
            public long f1632p;

            /* renamed from: q */
            public int f1633q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                f.this = r4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1626j = obj;
                this.f1627k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(i iVar, Function4 function4) {
            this.f1624j = iVar;
            this.f1625k = function4;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x011e -> B:74:0x0197). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:69:0x0174). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.f.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> i<T> a(@NotNull i<? extends T> iVar, @NotNull Function3<? super j<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new a(iVar, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0069  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull o.i<? extends T> r4, @org.jetbrains.annotations.NotNull o.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Throwable> r6) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.u.b(o.i, o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean c(Throwable th, CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.f531b);
        if (n2Var == null || !n2Var.isCancelled()) {
            return false;
        }
        return d(th, n2Var.u());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual(th2, th);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, long j2, @NotNull Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        if (j2 > 0) {
            return k.x1(iVar, new e(j2, function2, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j2).toString());
    }

    public static /* synthetic */ i f(i iVar, long j2, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            function2 = new d(null);
        }
        return k.v1(iVar, j2, function2);
    }

    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar, @NotNull Function4<? super j<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new f(iVar, function4);
    }
}
