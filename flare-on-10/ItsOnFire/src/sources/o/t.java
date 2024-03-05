package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001��¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028��0\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001��¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001��¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001��¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001��¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H��\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001��¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "R", "Lo/i;", "Lkotlin/Function3;", "Lo/j;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "g", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "h", "Lkotlin/Function2;", "action", "f", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "", "cause", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "b", "c", "(Lo/j;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/t.class */
public final /* synthetic */ class t {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/t$a.class */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1552j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1553k;

        /* renamed from: l  reason: collision with root package name */
        public int f1554l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1553k = obj;
            this.f1554l |= Integer.MIN_VALUE;
            return t.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/t$b.class */
    public static final class b<T> implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i f1555j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3 f1556k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedHeightMinor, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        /* loaded from: ItsOnFire.jar:o/t$b$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1557j;

            /* renamed from: k  reason: collision with root package name */
            public int f1558k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1560m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1561n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1557j = obj;
                this.f1558k |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(i iVar, Function3 function3) {
            this.f1555j = iVar;
            this.f1556k = function3;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:(2:3|(11:5|6|7|(2:9|(2:11|(2:13|(5:15|16|17|18|19)(2:25|26))(3:27|28|29))(3:30|31|32))(12:43|44|45|46|47|48|49|50|51|52|53|(2:55|56))|33|35|36|37|(2:39|40)|18|19))|35|36|37|(0)|18|19)|62|6|7|(0)(0)|33|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
            r0 = new o.z0(r6);
            r0 = r8.f1556k;
            r7.f1560m = r6;
            r7.f1561n = null;
            r7.f1558k = 2;
            r8 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x015f, code lost:
            if (o.t.c(r0, r0, r6, r7) == r0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0164, code lost:
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v2 */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.b.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/t$c.class */
    public static final class c<T> implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i f1562j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1563k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        /* loaded from: ItsOnFire.jar:o/t$c$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1564j;

            /* renamed from: k  reason: collision with root package name */
            public int f1565k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1567m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1568n;

            /* renamed from: o  reason: collision with root package name */
            public Object f1569o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1564j = obj;
                this.f1565k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(i iVar, Function2 function2) {
            this.f1562j = iVar;
            this.f1563k = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
        /* JADX WARN: Type inference failed for: r0v9, types: [p.v] */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.c.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/t$d.class */
    public static final class d<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f1570j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<T> f1571k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/t$d$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1572j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ d<T> f1573k;

            /* renamed from: l  reason: collision with root package name */
            public int f1574l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1573k = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1572j = obj;
                this.f1574l |= Integer.MIN_VALUE;
                return this.f1573k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Ref.BooleanRef booleanRef, j<? super T> jVar) {
            this.f1570j = booleanRef;
            this.f1571k = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
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
                boolean r0 = r0 instanceof o.t.d.a
                if (r0 == 0) goto L28
                r0 = r7
                o.t$d$a r0 = (o.t.d.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1574l
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1574l = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.t$d$a r0 = new o.t$d$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1572j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r7
                int r0 = r0.f1574l
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5f
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L55
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L86
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
                kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f1570j
                r1 = 0
                r0.element = r1
                r0 = r5
                o.j<T> r0 = r0.f1571k
                r10 = r0
                r0 = r7
                r1 = 1
                r0.f1574l = r1
                r0 = r10
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r8
                if (r0 != r1) goto L86
                r0 = r8
                return r0
            L86:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/t$e.class */
    public static final class e<T> implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2 f1575j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f1576k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {R.styleable.AppCompatTheme_viewInflaterClass, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: ItsOnFire.jar:o/t$e$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1577j;

            /* renamed from: k  reason: collision with root package name */
            public int f1578k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1580m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1581n;

            /* renamed from: o  reason: collision with root package name */
            public Object f1582o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1577j = obj;
                this.f1578k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Function2 function2, i iVar) {
            this.f1575j = function2;
            this.f1576k = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.e.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/t$f.class */
    public static final class f<R> extends SuspendLambda implements Function2<j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1583j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1584k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ i<T> f1585l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Function3<j<? super R>, T, Continuation<? super Unit>, Object> f1586m;

        @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/t$f$a.class */
        public static final class a<T> implements j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Function3<j<? super R>, T, Continuation<? super Unit>, Object> f1587j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ j<R> f1588k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            /* renamed from: o.t$f$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:o/t$f$a$a.class */
            public static final class C0078a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1589j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ a<T> f1590k;

                /* renamed from: l  reason: collision with root package name */
                public int f1591l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0078a(a<? super T> aVar, Continuation<? super C0078a> continuation) {
                    super(continuation);
                    this.f1590k = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1589j = obj;
                    this.f1591l |= Integer.MIN_VALUE;
                    return this.f1590k.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, j<? super R> jVar) {
                this.f1587j = function3;
                this.f1588k = jVar;
            }

            @Nullable
            public final Object a(T t2, @NotNull Continuation<? super Unit> continuation) {
                InlineMarker.mark(4);
                new C0078a(this, continuation);
                InlineMarker.mark(5);
                this.f1587j.invoke(this.f1588k, t2, continuation);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
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
                    boolean r0 = r0 instanceof o.t.f.a.C0078a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.t$f$a$a r0 = (o.t.f.a.C0078a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1591l
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1591l = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.t$f$a$a r0 = new o.t$f$a$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r2, r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1589j
                    r10 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r8 = r0
                    r0 = r7
                    int r0 = r0.f1591l
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L5f
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L55
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L86
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
                    kotlin.jvm.functions.Function3<o.j<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.f1587j
                    r10 = r0
                    r0 = r5
                    o.j<R> r0 = r0.f1588k
                    r11 = r0
                    r0 = r7
                    r1 = 1
                    r0.f1591l = r1
                    r0 = r10
                    r1 = r11
                    r2 = r6
                    r3 = r7
                    java.lang.Object r0 = r0.invoke(r1, r2, r3)
                    r1 = r8
                    if (r0 != r1) goto L86
                    r0 = r8
                    return r0
                L86:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.t.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f1585l = iVar;
            this.f1586m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.f1585l, this.f1586m, continuation);
            fVar.f1584k = obj;
            return fVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            j jVar = (j) this.f1584k;
            i<T> iVar = this.f1585l;
            a aVar = new a(this.f1586m, jVar);
            InlineMarker.mark(0);
            iVar.collect(aVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((j) ((j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1583j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = (j) this.f1584k;
                i<T> iVar = this.f1585l;
                a aVar = new a(this.f1586m, jVar);
                this.f1583j = 1;
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/t$g.class */
    public static final class g<R> implements i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i f1592j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3 f1593k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/t$g$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1594j;

            /* renamed from: k  reason: collision with root package name */
            public int f1595k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1594j = obj;
                this.f1595k |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(i iVar, Function3 function3) {
            this.f1592j = iVar;
            this.f1593k = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1592j.collect(new h(this.f1593k, jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            i iVar = this.f1592j;
            h hVar = new h(this.f1593k, jVar);
            InlineMarker.mark(0);
            iVar.collect(hVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    /* loaded from: ItsOnFire.jar:o/t$h.class */
    public static final class h<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function3<j<? super R>, T, Continuation<? super Unit>, Object> f1597j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<R> f1598k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {R.styleable.AppCompatTheme_colorControlActivated}, m = "emit", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/t$h$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1599j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ h<T> f1600k;

            /* renamed from: l  reason: collision with root package name */
            public int f1601l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1600k = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1599j = obj;
                this.f1601l |= Integer.MIN_VALUE;
                return this.f1600k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, j<? super R> jVar) {
            this.f1597j = function3;
            this.f1598k = jVar;
        }

        @Nullable
        public final Object a(T t2, @NotNull Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new a(this, continuation);
            InlineMarker.mark(5);
            this.f1597j.invoke(this.f1598k, t2, continuation);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
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
                boolean r0 = r0 instanceof o.t.h.a
                if (r0 == 0) goto L28
                r0 = r7
                o.t$h$a r0 = (o.t.h.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1601l
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1601l = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.t$h$a r0 = new o.t$h$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1599j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r7
                int r0 = r0.f1601l
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5f
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L55
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L86
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
                kotlin.jvm.functions.Function3<o.j<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.f1597j
                r10 = r0
                r0 = r5
                o.j<R> r0 = r0.f1598k
                r11 = r0
                r0 = r7
                r1 = 1
                r0.f1601l = r1
                r0 = r10
                r1 = r11
                r2 = r6
                r3 = r7
                java.lang.Object r0 = r0.invoke(r1, r2, r3)
                r1 = r8
                if (r0 != r1) goto L86
                r0 = r8
                return r0
            L86:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final void b(@NotNull j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).f1854j;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(o.j<? super T> r5, kotlin.jvm.functions.Function3<? super o.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, java.lang.Throwable r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r0 = r8
            boolean r0 = r0 instanceof o.t.a
            if (r0 == 0) goto L29
            r0 = r8
            o.t$a r0 = (o.t.a) r0
            r9 = r0
            r0 = r9
            int r0 = r0.f1554l
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1554l = r1
            goto L33
        L29:
            o.t$a r0 = new o.t$a
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
        L33:
            r0 = r9
            java.lang.Object r0 = r0.f1553k
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.f1554l
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L6c
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L62
            r0 = r9
            java.lang.Object r0 = r0.f1552j
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r8 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L9b
            goto L97
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6c:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r8 = r0
            r0 = r9
            r1 = r7
            r0.f1552j = r1     // Catch: java.lang.Throwable -> L9b
            r0 = r7
            r8 = r0
            r0 = r9
            r1 = 1
            r0.f1554l = r1     // Catch: java.lang.Throwable -> L9b
            r0 = r7
            r8 = r0
            r0 = r6
            r1 = r5
            r2 = r7
            r3 = r9
            java.lang.Object r0 = r0.invoke(r1, r2, r3)     // Catch: java.lang.Throwable -> L9b
            r5 = r0
            r0 = r5
            r1 = r12
            if (r0 != r1) goto L97
            r0 = r12
            return r0
        L97:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9b:
            r5 = move-exception
            r0 = r8
            if (r0 == 0) goto Laa
            r0 = r8
            r1 = r5
            if (r0 == r1) goto Laa
            r0 = r5
            r1 = r8
            kotlin.ExceptionsKt.addSuppressed(r0, r1)
        Laa:
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.c(o.j, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <T> i<T> d(@NotNull i<? extends T> iVar, @NotNull Function3<? super j<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new b(iVar, function3);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new c(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new e(function2, iVar);
    }

    @NotNull
    public static final <T, R> i<R> g(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return k.I0(new f(iVar, function3, null));
    }

    @PublishedApi
    @NotNull
    public static final <T, R> i<R> h(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new g(iVar, function3);
    }
}
