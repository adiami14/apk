package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��8\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001��¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001��¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0006\b��\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\b\b��\u0010��*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018��0\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028��0\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001��¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b��\u0010��\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028��0\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001��¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00130\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001��¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118��¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001��¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118��¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118��¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001��¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"T", "Lo/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "a", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "c", "R", "b", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lkotlin/ParameterName;", "name", "value", "transform", "e", "f", "Lkotlin/collections/IndexedValue;", "k", "", "action", "g", "initial", "Lkotlin/Function3;", "accumulator", "operation", "j", "(Lo/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lo/i;", "h", "i", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/a0.class */
public final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$a.class */
    public static final class a<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1090j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1091k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* renamed from: o.a0$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:o/a0$a$a.class */
        public static final class C0062a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1092j;

            /* renamed from: k  reason: collision with root package name */
            public int f1093k;

            public C0062a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1092j = obj;
                this.f1093k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/a0$a$b.class */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1095j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1096k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            /* renamed from: o.a0$a$b$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:o/a0$a$b$a.class */
            public static final class C0063a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1097j;

                /* renamed from: k  reason: collision with root package name */
                public int f1098k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1100m;

                /* renamed from: n  reason: collision with root package name */
                public Object f1101n;

                public C0063a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1097j = obj;
                    this.f1098k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1095j = jVar;
                this.f1096k = function2;
            }

            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new C0063a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1095j;
                if (((Boolean) this.f1096k.invoke(obj, continuation)).booleanValue()) {
                    InlineMarker.mark(0);
                    jVar.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    Method dump skipped, instructions count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.a.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(o.i iVar, Function2 function2) {
            this.f1090j = iVar;
            this.f1091k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1090j.collect(new b(jVar, this.f1091k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new C0062a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1090j;
            b bVar = new b(jVar, this.f1091k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$a"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$b.class */
    public static final class b implements o.i<Object> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1102j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/a0$b$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1103j;

            /* renamed from: k  reason: collision with root package name */
            public int f1104k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1103j = obj;
                this.f1104k |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o.a0$b$b  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:o/a0$b$b.class */
        public static final class C0064b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1106j;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: o.a0$b$b$a */
            /* loaded from: ItsOnFire.jar:o/a0$b$b$a.class */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1107j;

                /* renamed from: k  reason: collision with root package name */
                public int f1108k;

                /* renamed from: l  reason: collision with root package name */
                public Object f1109l;

                /* renamed from: m  reason: collision with root package name */
                public Object f1110m;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1107j = obj;
                    this.f1108k |= Integer.MIN_VALUE;
                    return C0064b.this.emit(null, this);
                }
            }

            public C0064b(o.j jVar) {
                this.f1106j = jVar;
            }

            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1106j;
                Intrinsics.reifiedOperationMarker(3, "R");
                if (obj instanceof Object) {
                    InlineMarker.mark(0);
                    jVar.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
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
            public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof o.a0.b.C0064b.a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.a0$b$b$a r0 = (o.a0.b.C0064b.a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1108k
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1108k = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.a0$b$b$a r0 = new o.a0$b$b$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1107j
                    r10 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r8 = r0
                    r0 = r7
                    int r0 = r0.f1108k
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L5f
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L55
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L8b
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
                    o.j r0 = r0.f1106j
                    r10 = r0
                    r0 = 3
                    java.lang.String r1 = "R"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
                    r0 = r6
                    boolean r0 = r0 instanceof java.lang.Object
                    if (r0 == 0) goto L8b
                    r0 = r7
                    r1 = 1
                    r0.f1108k = r1
                    r0 = r10
                    r1 = r6
                    r2 = r7
                    java.lang.Object r0 = r0.emit(r1, r2)
                    r1 = r8
                    if (r0 != r1) goto L8b
                    r0 = r8
                    return r0
                L8b:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.b.C0064b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(o.i iVar) {
            this.f1102j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super Object> jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            o.i iVar = this.f1102j;
            Intrinsics.needClassReification();
            Object collect = iVar.collect(new C0064b(jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1102j;
            Intrinsics.needClassReification();
            C0064b c0064b = new C0064b(jVar);
            InlineMarker.mark(0);
            iVar.collect(c0064b, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$c.class */
    public static final class c<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1112j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1113k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/a0$c$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1114j;

            /* renamed from: k  reason: collision with root package name */
            public int f1115k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1114j = obj;
                this.f1115k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/a0$c$b.class */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1117j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1118k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            /* loaded from: ItsOnFire.jar:o/a0$c$b$a.class */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1119j;

                /* renamed from: k  reason: collision with root package name */
                public int f1120k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1122m;

                /* renamed from: n  reason: collision with root package name */
                public Object f1123n;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1119j = obj;
                    this.f1120k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1117j = jVar;
                this.f1118k = function2;
            }

            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1117j;
                if (!((Boolean) this.f1118k.invoke(obj, continuation)).booleanValue()) {
                    InlineMarker.mark(0);
                    jVar.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    Method dump skipped, instructions count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.c.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(o.i iVar, Function2 function2) {
            this.f1112j = iVar;
            this.f1113k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1112j.collect(new b(jVar, this.f1113k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1112j;
            b bVar = new b(jVar, this.f1113k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$d.class */
    public static final class d<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1124j;

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/a0$d$a.class */
        public static final class a<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1125j;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            /* renamed from: o.a0$d$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:o/a0$d$a$a.class */
            public static final class C0065a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1126j;

                /* renamed from: k  reason: collision with root package name */
                public int f1127k;

                public C0065a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1126j = obj;
                    this.f1127k |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(o.j jVar) {
                this.f1125j = jVar;
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
                    boolean r0 = r0 instanceof o.a0.d.a.C0065a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.a0$d$a$a r0 = (o.a0.d.a.C0065a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1127k
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1127k = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.a0$d$a$a r0 = new o.a0$d$a$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1126j
                    r10 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r8 = r0
                    r0 = r7
                    int r0 = r0.f1127k
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L5f
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L55
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L82
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
                    o.j r0 = r0.f1125j
                    r10 = r0
                    r0 = r6
                    if (r0 == 0) goto L82
                    r0 = r7
                    r1 = 1
                    r0.f1127k = r1
                    r0 = r10
                    r1 = r6
                    r2 = r7
                    java.lang.Object r0 = r0.emit(r1, r2)
                    r1 = r8
                    if (r0 != r1) goto L82
                    r0 = r8
                    return r0
                L82:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(o.i iVar) {
            this.f1124j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1124j.collect(new a(jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$e.class */
    public static final class e<R> implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1129j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1130k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/a0$e$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1131j;

            /* renamed from: k  reason: collision with root package name */
            public int f1132k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1131j = obj;
                this.f1132k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/a0$e$b.class */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1134j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1135k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* loaded from: ItsOnFire.jar:o/a0$e$b$a.class */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1136j;

                /* renamed from: k  reason: collision with root package name */
                public int f1137k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1139m;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1136j = obj;
                    this.f1137k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1134j = jVar;
                this.f1135k = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1134j;
                Object invoke = this.f1135k.invoke(obj, continuation);
                InlineMarker.mark(0);
                jVar.emit(invoke, continuation);
                InlineMarker.mark(1);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
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
                    boolean r0 = r0 instanceof o.a0.e.b.a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.a0$e$b$a r0 = (o.a0.e.b.a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1137k
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1137k = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.a0$e$b$a r0 = new o.a0$e$b$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1136j
                    r8 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r10 = r0
                    r0 = r7
                    int r0 = r0.f1137k
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
                    java.lang.Object r0 = r0.f1139m
                    o.j r0 = (o.j) r0
                    r6 = r0
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto La2
                L73:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    o.j r0 = r0.f1134j
                    r11 = r0
                    r0 = r5
                    kotlin.jvm.functions.Function2 r0 = r0.f1135k
                    r8 = r0
                    r0 = r7
                    r1 = r11
                    r0.f1139m = r1
                    r0 = r7
                    r1 = 1
                    r0.f1137k = r1
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
                    r0.f1139m = r1
                    r0 = r7
                    r1 = 2
                    r0.f1137k = r1
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
                throw new UnsupportedOperationException("Method not decompiled: o.a0.e.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(o.i iVar, Function2 function2) {
            this.f1129j = iVar;
            this.f1130k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1129j.collect(new b(jVar, this.f1130k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1129j;
            b bVar = new b(jVar, this.f1130k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$f.class */
    public static final class f<R> implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1140j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1141k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/a0$f$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1142j;

            /* renamed from: k  reason: collision with root package name */
            public int f1143k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1142j = obj;
                this.f1143k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/a0$f$b.class */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1145j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1146k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            /* loaded from: ItsOnFire.jar:o/a0$f$b$a.class */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1147j;

                /* renamed from: k  reason: collision with root package name */
                public int f1148k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1150m;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1147j = obj;
                    this.f1148k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1145j = jVar;
                this.f1146k = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1145j;
                Object invoke = this.f1146k.invoke(obj, continuation);
                if (invoke != null) {
                    InlineMarker.mark(0);
                    jVar.emit(invoke, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    Method dump skipped, instructions count: 203
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.f.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(o.i iVar, Function2 function2) {
            this.f1140j = iVar;
            this.f1141k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1140j.collect(new b(jVar, this.f1141k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1140j;
            b bVar = new b(jVar, this.f1141k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$g.class */
    public static final class g<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1151j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1152k;

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028��H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/a0$g$a.class */
        public static final class a<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1153j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1154k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            /* renamed from: o.a0$g$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:o/a0$g$a$a.class */
            public static final class C0066a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1155j;

                /* renamed from: k  reason: collision with root package name */
                public int f1156k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1158m;

                /* renamed from: n  reason: collision with root package name */
                public Object f1159n;

                public C0066a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1155j = obj;
                    this.f1156k |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(o.j jVar, Function2 function2) {
                this.f1153j = jVar;
                this.f1154k = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    Method dump skipped, instructions count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(o.i iVar, Function2 function2) {
            this.f1151j = iVar;
            this.f1152k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1151j.collect(new a(jVar, this.f1152k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$h.class */
    public static final class h<R> implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f1160j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.i f1161k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function3 f1162l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: ItsOnFire.jar:o/a0$h$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1163j;

            /* renamed from: k  reason: collision with root package name */
            public int f1164k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1166m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1167n;

            /* renamed from: o  reason: collision with root package name */
            public Object f1168o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1163j = obj;
                this.f1164k |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(Object obj, o.i iVar, Function3 function3) {
            this.f1160j = obj;
            this.f1161k = iVar;
            this.f1162l = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
        /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.h.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/a0$i.class */
    public static final class i<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<R> f1169j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> f1170k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1171l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {R.styleable.AppCompatTheme_textAppearanceListItem, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/a0$i$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1172j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1173k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1174l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ i<T> f1175m;

            /* renamed from: n  reason: collision with root package name */
            public int f1176n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1175m = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1174l = obj;
                this.f1176n |= Integer.MIN_VALUE;
                return this.f1175m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, o.j<? super R> jVar) {
            this.f1169j = objectRef;
            this.f1170k = function3;
            this.f1171l = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$j.class */
    public static final class j<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1177j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3 f1178k;

        public j(o.i iVar, Function3 function3) {
            this.f1177j = iVar;
            this.f1178k = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) p.u.f1988a;
            Object collect = this.f1177j.collect(new k(objectRef, this.f1178k, jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/a0$k.class */
    public static final class k<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f1179j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f1180k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1181l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {R.styleable.AppCompatTheme_windowMinWidthMinor, 127}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/a0$k$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1182j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1183k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1184l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ k<T> f1185m;

            /* renamed from: n  reason: collision with root package name */
            public int f1186n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(k<? super T> kVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1185m = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1184l = obj;
                this.f1186n |= Integer.MIN_VALUE;
                return this.f1185m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, o.j<? super T> jVar) {
            this.f1179j = objectRef;
            this.f1180k = function3;
            this.f1181l = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/a0$l.class */
    public static final class l<T> implements o.i<IndexedValue<? extends T>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1187j;

        public l(o.i iVar) {
            this.f1187j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super IndexedValue<? extends T>> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1187j.collect(new m(jVar, new Ref.IntRef()), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/a0$m.class */
    public static final class m<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.j<IndexedValue<? extends T>> f1188j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1189k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {R.styleable.AppCompatTheme_dividerVertical}, m = "emit", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/a0$m$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1190j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ m<T> f1191k;

            /* renamed from: l  reason: collision with root package name */
            public int f1192l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m<? super T> mVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1191k = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1190j = obj;
                this.f1192l |= Integer.MIN_VALUE;
                return this.f1191k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m(o.j<? super IndexedValue<? extends T>> jVar, Ref.IntRef intRef) {
            this.f1188j = jVar;
            this.f1189k = intRef;
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
                boolean r0 = r0 instanceof o.a0.m.a
                if (r0 == 0) goto L28
                r0 = r7
                o.a0$m$a r0 = (o.a0.m.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1192l
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1192l = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.a0$m$a r0 = new o.a0$m$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1190j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r7
                int r0 = r0.f1192l
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5f
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L55
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto La4
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
                o.j<kotlin.collections.IndexedValue<? extends T>> r0 = r0.f1188j
                r10 = r0
                r0 = r5
                kotlin.jvm.internal.Ref$IntRef r0 = r0.f1189k
                r11 = r0
                r0 = r11
                int r0 = r0.element
                r9 = r0
                r0 = r11
                r1 = r9
                r2 = 1
                int r1 = r1 + r2
                r0.element = r1
                r0 = r9
                if (r0 < 0) goto La8
                kotlin.collections.IndexedValue r0 = new kotlin.collections.IndexedValue
                r1 = r0
                r2 = r9
                r3 = r6
                r1.<init>(r2, r3)
                r6 = r0
                r0 = r7
                r1 = 1
                r0.f1192l = r1
                r0 = r10
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r8
                if (r0 != r1) goto La4
                r0 = r8
                return r0
            La4:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            La8:
                java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
                r1 = r0
                java.lang.String r2 = "Index overflow has happened"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.m.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> o.i<T> a(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new a(iVar, function2);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <R> o.i<R> b(o.i<?> r4) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            o.a0$b r0 = new o.a0$b
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a0.b(o.i):o.i");
    }

    @NotNull
    public static final <T> o.i<T> c(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new c(iVar, function2);
    }

    @NotNull
    public static final <T> o.i<T> d(@NotNull o.i<? extends T> iVar) {
        return new d(iVar);
    }

    @NotNull
    public static final <T, R> o.i<R> e(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return new e(iVar, function2);
    }

    @NotNull
    public static final <T, R> o.i<R> f(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return new f(iVar, function2);
    }

    @NotNull
    public static final <T> o.i<T> g(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new g(iVar, function2);
    }

    @NotNull
    public static final <T, R> o.i<R> h(@NotNull o.i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return new h(r2, iVar, function3);
    }

    @NotNull
    public static final <T> o.i<T> i(@NotNull o.i<? extends T> iVar, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return new j(iVar, function3);
    }

    @NotNull
    public static final <T, R> o.i<R> j(@NotNull o.i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return o.k.y1(iVar, r2, function3);
    }

    @NotNull
    public static final <T> o.i<IndexedValue<T>> k(@NotNull o.i<? extends T> iVar) {
        return new l(iVar);
    }
}
