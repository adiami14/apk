package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c2;
import j.d2;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n��\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001��¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��2\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u0013\"\b\u0012\u0004\u0012\u00028��0\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001��¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001��¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001��¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006X\u0087T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"T", "R", "Lo/i;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "", "concurrency", "c", "(Lo/i;ILkotlin/jvm/functions/Function2;)Lo/i;", "e", "", "l", "", "flows", "m", "([Lo/i;)Lo/i;", "f", "Lkotlin/Function3;", "Lo/j;", "", "Lkotlin/ExtensionFunctionType;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "b", "k", "I", "h", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/w.class */
public final /* synthetic */ class w {

    /* renamed from: a */
    public static final int f1709a = q.t0.b(k.f1364a, 16, 1, Integer.MAX_VALUE);

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$e"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/w$a.class */
    public static final class a<R> implements i<i<? extends R>> {

        /* renamed from: j */
        public final /* synthetic */ i f1710j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1711k;

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/a0$e$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o.w$a$a */
        /* loaded from: ItsOnFire.jar:o/w$a$a.class */
        public static final class C0081a<T> implements j {

            /* renamed from: j */
            public final /* synthetic */ j f1712j;

            /* renamed from: k */
            public final /* synthetic */ Function2 f1713k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* renamed from: o.w$a$a$a */
            /* loaded from: ItsOnFire.jar:o/w$a$a$a.class */
            public static final class C0082a extends ContinuationImpl {

                /* renamed from: j */
                public /* synthetic */ Object f1714j;

                /* renamed from: k */
                public int f1715k;

                /* renamed from: l */
                public Object f1716l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0082a(Continuation continuation) {
                    super(continuation);
                    C0081a.this = r4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1714j = obj;
                    this.f1715k |= Integer.MIN_VALUE;
                    return C0081a.this.emit(null, this);
                }
            }

            public C0081a(j jVar, Function2 function2) {
                this.f1712j = jVar;
                this.f1713k = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                /*
                    Method dump skipped, instructions count: 194
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.w.a.C0081a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(i iVar, Function2 function2) {
            this.f1710j = iVar;
            this.f1711k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1710j.collect(new C0081a(jVar, this.f1711k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028��H\u008a@"}, d2 = {"T", "R", "Lo/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/w$b.class */
    public static final class b<R, T> extends SuspendLambda implements Function3<j<? super R>, T, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1718j;

        /* renamed from: k */
        public /* synthetic */ Object f1719k;

        /* renamed from: l */
        public /* synthetic */ Object f1720l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T, Continuation<? super i<? extends R>>, Object> f1721m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f1721m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j<? super R> jVar, T t2, @Nullable Continuation<? super Unit> continuation) {
            b bVar = new b(this.f1721m, continuation);
            bVar.f1719k = jVar;
            bVar.f1720l = t2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1718j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (j) this.f1719k;
                Object obj2 = this.f1720l;
                this.f1719k = jVar;
                this.f1718j = 1;
                Object invoke = this.f1721m.invoke(obj2, this);
                obj = invoke;
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (j) this.f1719k;
                ResultKt.throwOnFailure(obj);
            }
            i iVar = (i) obj;
            this.f1719k = null;
            this.f1718j = 2;
            if (k.m0(jVar, iVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object j(@NotNull Object obj) {
            j jVar = (j) this.f1719k;
            Object obj2 = this.f1720l;
            InlineMarker.mark(0);
            k.m0(jVar, (i) this.f1721m.invoke(obj2, this), this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$e"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/w$c.class */
    public static final class c<R> implements i<i<? extends R>> {

        /* renamed from: j */
        public final /* synthetic */ i f1722j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1723k;

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/a0$e$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/w$c$a.class */
        public static final class a<T> implements j {

            /* renamed from: j */
            public final /* synthetic */ j f1724j;

            /* renamed from: k */
            public final /* synthetic */ Function2 f1725k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* renamed from: o.w$c$a$a */
            /* loaded from: ItsOnFire.jar:o/w$c$a$a.class */
            public static final class C0083a extends ContinuationImpl {

                /* renamed from: j */
                public /* synthetic */ Object f1726j;

                /* renamed from: k */
                public int f1727k;

                /* renamed from: l */
                public Object f1728l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0083a(Continuation continuation) {
                    super(continuation);
                    a.this = r4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1726j = obj;
                    this.f1727k |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, Function2 function2) {
                this.f1724j = jVar;
                this.f1725k = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof o.w.c.a.C0083a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.w$c$a$a r0 = (o.w.c.a.C0083a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1727k
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1727k = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.w$c$a$a r0 = new o.w$c$a$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1726j
                    r8 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r10 = r0
                    r0 = r7
                    int r0 = r0.f1727k
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L73
                    r0 = r9
                    r1 = 1
                    if (r0 == r1) goto L64
                    r0 = r9
                    r1 = 2
                    if (r0 != r1) goto L5a
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto Lbc
                L5a:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L64:
                    r0 = r7
                    java.lang.Object r0 = r0.f1728l
                    o.j r0 = (o.j) r0
                    r6 = r0
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto La2
                L73:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    o.j r0 = r0.f1724j
                    r11 = r0
                    r0 = r5
                    kotlin.jvm.functions.Function2 r0 = r0.f1725k
                    r8 = r0
                    r0 = r7
                    r1 = r11
                    r0.f1728l = r1
                    r0 = r7
                    r1 = 1
                    r0.f1727k = r1
                    r0 = r8
                    r1 = r6
                    r2 = r7
                    java.lang.Object r0 = r0.invoke(r1, r2)
                    r8 = r0
                    r0 = r8
                    r1 = r10
                    if (r0 != r1) goto L9f
                    r0 = r10
                    return r0
                L9f:
                    r0 = r11
                    r6 = r0
                La2:
                    r0 = r7
                    r1 = 0
                    r0.f1728l = r1
                    r0 = r7
                    r1 = 2
                    r0.f1727k = r1
                    r0 = r6
                    r1 = r8
                    r2 = r7
                    java.lang.Object r0 = r0.emit(r1, r2)
                    r1 = r10
                    if (r0 != r1) goto Lbc
                    r0 = r10
                    return r0
                Lbc:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.w.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(i iVar, Function2 function2) {
            this.f1722j = iVar;
            this.f1723k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1722j.collect(new a(jVar, this.f1723k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/w$d.class */
    public static final class d<T> implements i<T> {

        /* renamed from: j */
        public final /* synthetic */ i f1730j;

        public d(i iVar) {
            this.f1730j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1730j.collect(new e(jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028��0\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lo/i;", "value", "", "a", "(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/w$e.class */
    public static final class e<T> implements j {

        /* renamed from: j */
        public final /* synthetic */ j<T> f1731j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "emit", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/w$e$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1732j;

            /* renamed from: k */
            public final /* synthetic */ e<T> f1733k;

            /* renamed from: l */
            public int f1734l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e<? super T> eVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1733k = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1732j = obj;
                this.f1734l |= Integer.MIN_VALUE;
                return this.f1733k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(j<? super T> jVar) {
            this.f1731j = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull o.i<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.w.e.a
                if (r0 == 0) goto L28
                r0 = r7
                o.w$e$a r0 = (o.w.e.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1734l
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1734l = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.w$e$a r0 = new o.w$e$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1732j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r7
                int r0 = r0.f1734l
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5f
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L55
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L7c
            L55:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5f:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                o.j<T> r0 = r0.f1731j
                r10 = r0
                r0 = r7
                r1 = 1
                r0.f1734l = r1
                r0 = r10
                r1 = r6
                r2 = r7
                java.lang.Object r0 = o.k.m0(r0, r1, r2)
                r1 = r8
                if (r0 != r1) goto L7c
                r0 = r8
                return r0
            L7c:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.w.e.emit(o.i, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\u0010\u0005\u001a\u00020\u0004\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028��H\u008a@"}, d2 = {"T", "R", "Lo/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {214, 214}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/w$f.class */
    public static final class f<R, T> extends SuspendLambda implements Function3<j<? super R>, T, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1735j;

        /* renamed from: k */
        public /* synthetic */ Object f1736k;

        /* renamed from: l */
        public /* synthetic */ Object f1737l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T, Continuation<? super R>, Object> f1738m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super f> continuation) {
            super(3, continuation);
            this.f1738m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j<? super R> jVar, T t2, @Nullable Continuation<? super Unit> continuation) {
            f fVar = new f(this.f1738m, continuation);
            fVar.f1736k = jVar;
            fVar.f1737l = t2;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1735j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (j) this.f1736k;
                Object obj2 = this.f1737l;
                this.f1736k = jVar;
                this.f1735j = 1;
                Object invoke = this.f1738m.invoke(obj2, this);
                obj = invoke;
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (j) this.f1736k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1736k = null;
            this.f1735j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @d2
    @NotNull
    public static final <T, R> i<R> a(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return k.F0(new a(iVar, function2));
    }

    @c2
    @NotNull
    public static final <T, R> i<R> b(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return k.b2(iVar, new b(function2, null));
    }

    @d2
    @NotNull
    public static final <T, R> i<R> c(@NotNull i<? extends T> iVar, int i2, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return k.G0(new c(iVar, function2), i2);
    }

    public static /* synthetic */ i d(i iVar, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = f1709a;
        }
        return k.C0(iVar, i2, function2);
    }

    @d2
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [o.i] */
    @d2
    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends i<? extends T>> iVar, int i2) {
        if (i2 > 0) {
            return i2 == 1 ? k.F0(iVar) : new p.g(iVar, i2, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i2).toString());
    }

    public static /* synthetic */ i g(i iVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = f1709a;
        }
        return k.G0(iVar, i2);
    }

    public static final int h() {
        return f1709a;
    }

    @d2
    public static /* synthetic */ void i() {
    }

    @d2
    public static /* synthetic */ void j() {
    }

    @c2
    @NotNull
    public static final <T, R> i<R> k(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return k.b2(iVar, new f(function2, null));
    }

    @NotNull
    public static final <T> i<T> l(@NotNull Iterable<? extends i<? extends T>> iterable) {
        return new p.k(iterable, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> i<T> m(@NotNull i<? extends T>... iVarArr) {
        Iterable asIterable;
        asIterable = ArraysKt___ArraysKt.asIterable(iVarArr);
        return k.Y0(asIterable);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> n(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new p.j(function3, iVar, null, 0, null, 28, null);
    }
}
