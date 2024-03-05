package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.BuilderInference;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"��B\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\r2\u0006\u0010\u000e\u001a\u00028��H\u0082@ø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001��¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028��0\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001��¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080Hø\u0001��¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lo/i;", "", "count", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "e", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "g", "Lo/j;", "value", "", "f", "(Lo/j;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "R", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "transform", "i", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "b", "(Lo/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/v.class */
public final /* synthetic */ class v {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/v$a.class */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1643j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1644k;

        /* renamed from: l  reason: collision with root package name */
        public int f1645l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1644k = obj;
            this.f1645l |= Integer.MIN_VALUE;
            return v.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0013\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"o/v$b", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/v$b.class */
    public static final class b<T> implements o.j<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f1646j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/v$b$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1647j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1648k;

            /* renamed from: m  reason: collision with root package name */
            public int f1650m;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1648k = obj;
                this.f1650m |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f1646j = function2;
        }

        @Nullable
        public Object a(T t2, @NotNull Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            if (((Boolean) this.f1646j.invoke(t2, continuation)).booleanValue()) {
                return Unit.INSTANCE;
            }
            throw new p.a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.v.b.a
                if (r0 == 0) goto L28
                r0 = r7
                o.v$b$a r0 = (o.v.b.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1650m
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1650m = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.v$b$a r0 = new o.v$b$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1648k
                r8 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.f1650m
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L68
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L5e
                r0 = r7
                java.lang.Object r0 = r0.f1647j
                o.v$b r0 = (o.v.b) r0
                r6 = r0
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                r7 = r0
                goto L91
            L5e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L68:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r0.f1646j
                r8 = r0
                r0 = r7
                r1 = r5
                r0.f1647j = r1
                r0 = r7
                r1 = 1
                r0.f1650m = r1
                r0 = r8
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.invoke(r1, r2)
                r8 = r0
                r0 = r5
                r6 = r0
                r0 = r8
                r7 = r0
                r0 = r8
                r1 = r10
                if (r0 != r1) goto L91
                r0 = r10
                return r0
            L91:
                r0 = r7
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L9f
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9f:
                p.a r0 = new p.a
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/v$c.class */
    public static final class c<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1651j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1652k;

        public c(o.i iVar, int i2) {
            this.f1651j = iVar;
            this.f1652k = i2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1651j.collect(new d(new Ref.IntRef(), this.f1652k, jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/v$d.class */
    public static final class d<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1653j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1654k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1655l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/v$d$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1656j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ d<T> f1657k;

            /* renamed from: l  reason: collision with root package name */
            public int f1658l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1657k = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1656j = obj;
                this.f1658l |= Integer.MIN_VALUE;
                return this.f1657k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Ref.IntRef intRef, int i2, o.j<? super T> jVar) {
            this.f1653j = intRef;
            this.f1654k = i2;
            this.f1655l = jVar;
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
                boolean r0 = r0 instanceof o.v.d.a
                if (r0 == 0) goto L28
                r0 = r7
                o.v$d$a r0 = (o.v.d.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1658l
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1658l = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.v$d$a r0 = new o.v$d$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1656j
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r7
                int r0 = r0.f1658l
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5f
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L55
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L94
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
                kotlin.jvm.internal.Ref$IntRef r0 = r0.f1653j
                r10 = r0
                r0 = r10
                int r0 = r0.element
                r9 = r0
                r0 = r9
                r1 = r5
                int r1 = r1.f1654k
                if (r0 < r1) goto L98
                r0 = r5
                o.j<T> r0 = r0.f1655l
                r10 = r0
                r0 = r7
                r1 = 1
                r0.f1658l = r1
                r0 = r10
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r8
                if (r0 != r1) goto L94
                r0 = r8
                return r0
            L94:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L98:
                r0 = r10
                r1 = r9
                r2 = 1
                int r1 = r1 + r2
                r0.element = r1
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/v$e.class */
    public static final class e<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1659j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1660k;

        public e(o.i iVar, Function2 function2) {
            this.f1659j = iVar;
            this.f1660k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1659j.collect(new f(new Ref.BooleanRef(), jVar, this.f1660k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/v$f.class */
    public static final class f<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f1661j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1662k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f1663l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        /* loaded from: ItsOnFire.jar:o/v$f$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1664j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1665k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1666l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ f<T> f1667m;

            /* renamed from: n  reason: collision with root package name */
            public int f1668n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1667m = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1666l = obj;
                this.f1668n |= Integer.MIN_VALUE;
                return this.f1667m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Ref.BooleanRef booleanRef, o.j<? super T> jVar, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f1661j = booleanRef;
            this.f1662k = jVar;
            this.f1663l = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/v$g.class */
    public static final class g<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1669j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1670k;

        /* renamed from: l  reason: collision with root package name */
        public int f1671l;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1670k = obj;
            this.f1671l |= Integer.MIN_VALUE;
            return v.f(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/v$h.class */
    public static final class h<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1672j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1673k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/v$h$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1674j;

            /* renamed from: k  reason: collision with root package name */
            public int f1675k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1677m;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1674j = obj;
                this.f1675k |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(o.i iVar, int i2) {
            this.f1672j = iVar;
            this.f1673k = i2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(2:9|(2:11|12)(2:18|19))(14:20|21|22|23|24|25|26|27|28|29|30|31|32|(2:34|35))|13|14|15))|38|6|7|(0)(0)|13|14|15) */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
            p.q.b(r6, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 191
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.h.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:o/v$i.class */
    public static final class i<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1678j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1679k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1680l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/v$i$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1681j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ i<T> f1682k;

            /* renamed from: l  reason: collision with root package name */
            public int f1683l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1682k = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1681j = obj;
                this.f1683l |= Integer.MIN_VALUE;
                return this.f1682k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(Ref.IntRef intRef, int i2, o.j<? super T> jVar) {
            this.f1678j = intRef;
            this.f1679k = i2;
            this.f1680l = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/v$j.class */
    public static final class j<T> implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1684j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1685k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        /* loaded from: ItsOnFire.jar:o/v$j$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1686j;

            /* renamed from: k  reason: collision with root package name */
            public int f1687k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1689m;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1686j = obj;
                this.f1687k |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(o.i iVar, Function2 function2) {
            this.f1684j = iVar;
            this.f1685k = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof o.v.j.a
                if (r0 == 0) goto L28
                r0 = r7
                o.v$j$a r0 = (o.v.j.a) r0
                r8 = r0
                r0 = r8
                int r0 = r0.f1687k
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L28
                r0 = r8
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.f1687k = r1
                r0 = r8
                r7 = r0
                goto L32
            L28:
                o.v$j$a r0 = new o.v$j$a
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r3)
                r7 = r0
            L32:
                r0 = r7
                java.lang.Object r0 = r0.f1686j
                r8 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.f1687k
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L6a
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L60
                r0 = r7
                java.lang.Object r0 = r0.f1689m
                o.v$k r0 = (o.v.k) r0
                r7 = r0
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)     // Catch: p.a -> L5c
                goto La6
            L5c:
                r6 = move-exception
                goto La1
            L60:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L6a:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                o.i r0 = r0.f1684j
                r11 = r0
                o.v$k r0 = new o.v$k
                r1 = r0
                r2 = r5
                kotlin.jvm.functions.Function2 r2 = r2.f1685k
                r3 = r6
                r1.<init>(r2, r3)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.f1689m = r1     // Catch: p.a -> L9e
                r0 = r7
                r1 = 1
                r0.f1687k = r1     // Catch: p.a -> L9e
                r0 = r11
                r1 = r8
                r2 = r7
                java.lang.Object r0 = r0.collect(r1, r2)     // Catch: p.a -> L9e
                r6 = r0
                r0 = r6
                r1 = r10
                if (r0 != r1) goto La6
                r0 = r10
                return r0
            L9e:
                r6 = move-exception
                r0 = r8
                r7 = r0
            La1:
                r0 = r6
                r1 = r7
                p.q.b(r0, r1)
            La6:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.j.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\u0013\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006��"}, d2 = {"o/v$b", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/v$k.class */
    public static final class k<T> implements o.j<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2 f1690j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.j f1691k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        /* loaded from: ItsOnFire.jar:o/v$k$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1692j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1693k;

            /* renamed from: l  reason: collision with root package name */
            public int f1694l;

            /* renamed from: n  reason: collision with root package name */
            public Object f1696n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1693k = obj;
                this.f1694l |= Integer.MIN_VALUE;
                return k.this.emit(null, this);
            }
        }

        public k(Function2 function2, o.j jVar) {
            this.f1690j = function2;
            this.f1691k = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    /* loaded from: ItsOnFire.jar:o/v$l.class */
    public static final class l<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1697j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1698k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.i<T> f1699l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Function3<o.j<? super R>, T, Continuation<? super Boolean>, Object> f1700m;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(bv = {}, d1 = {"��\u0013\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006��"}, d2 = {"o/v$b", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/v$l$a.class */
        public static final class a<T> implements o.j<T> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Function3 f1701j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.j f1702k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: o.v$l$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:o/v$l$a$a.class */
            public static final class C0080a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public Object f1703j;

                /* renamed from: k  reason: collision with root package name */
                public /* synthetic */ Object f1704k;

                /* renamed from: l  reason: collision with root package name */
                public int f1705l;

                public C0080a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1704k = obj;
                    this.f1705l |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(Function3 function3, o.j jVar) {
                this.f1701j = function3;
                this.f1702k = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof o.v.l.a.C0080a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.v$l$a$a r0 = (o.v.l.a.C0080a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1705l
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1705l = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.v$l$a$a r0 = new o.v$l$a$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1704k
                    r8 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r10 = r0
                    r0 = r7
                    int r0 = r0.f1705l
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L68
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L5e
                    r0 = r7
                    java.lang.Object r0 = r0.f1703j
                    o.v$l$a r0 = (o.v.l.a) r0
                    r6 = r0
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r8
                    r7 = r0
                    goto La3
                L5e:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L68:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    kotlin.jvm.functions.Function3 r0 = r0.f1701j
                    r11 = r0
                    r0 = r5
                    o.j r0 = r0.f1702k
                    r8 = r0
                    r0 = r7
                    r1 = r5
                    r0.f1703j = r1
                    r0 = r7
                    r1 = 1
                    r0.f1705l = r1
                    r0 = 6
                    kotlin.jvm.internal.InlineMarker.mark(r0)
                    r0 = r11
                    r1 = r8
                    r2 = r6
                    r3 = r7
                    java.lang.Object r0 = r0.invoke(r1, r2, r3)
                    r8 = r0
                    r0 = 7
                    kotlin.jvm.internal.InlineMarker.mark(r0)
                    r0 = r5
                    r6 = r0
                    r0 = r8
                    r7 = r0
                    r0 = r8
                    r1 = r10
                    if (r0 != r1) goto La3
                    r0 = r10
                    return r0
                La3:
                    r0 = r7
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto Lb1
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                Lb1:
                    p.a r0 = new p.a
                    r1 = r0
                    r2 = r6
                    r1.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.v.l.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(o.i<? extends T> iVar, Function3<? super o.j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f1699l = iVar;
            this.f1700m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.f1699l, this.f1700m, continuation);
            lVar.f1698k = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            a aVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1697j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1698k;
                o.i<T> iVar = this.f1699l;
                a aVar2 = new a(this.f1700m, jVar);
                try {
                    this.f1698k = aVar2;
                    this.f1697j = 1;
                    if (iVar.collect(aVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (p.a e2) {
                    e = e2;
                    aVar = aVar2;
                    p.q.b(e, aVar);
                    return Unit.INSTANCE;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                aVar = (a) this.f1698k;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (p.a e3) {
                    e = e3;
                    p.q.b(e, aVar);
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull o.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof o.v.a
            if (r0 == 0) goto L28
            r0 = r6
            o.v$a r0 = (o.v.a) r0
            r7 = r0
            r0 = r7
            int r0 = r0.f1645l
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1645l = r1
            r0 = r7
            r6 = r0
            goto L31
        L28:
            o.v$a r0 = new o.v$a
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.f1644k
            r7 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.f1645l
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r6
            java.lang.Object r0 = r0.f1643j
            o.v$b r0 = (o.v.b) r0
            r4 = r0
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: p.a -> L5b
            goto L9a
        L5b:
            r5 = move-exception
            goto L95
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            o.v$b r0 = new o.v$b
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = r7
            r0.f1643j = r1     // Catch: p.a -> L92
            r0 = r6
            r1 = 1
            r0.f1645l = r1     // Catch: p.a -> L92
            r0 = r4
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.collect(r1, r2)     // Catch: p.a -> L92
            r4 = r0
            r0 = r4
            r1 = r9
            if (r0 != r1) goto L9a
            r0 = r9
            return r0
        L92:
            r5 = move-exception
            r0 = r7
            r4 = r0
        L95:
            r0 = r5
            r1 = r4
            p.q.b(r0, r1)
        L9a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.b(o.i, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object c(o.i<? extends T> iVar, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        b bVar = new b(function2);
        try {
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
        } catch (p.a e2) {
            p.q.b(e2, bVar);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public static final <T> o.i<T> d(@NotNull o.i<? extends T> iVar, int i2) {
        if (i2 >= 0) {
            return new c(iVar, i2);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i2).toString());
    }

    @NotNull
    public static final <T> o.i<T> e(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new e(iVar, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(o.j<? super T> r4, T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof o.v.g
            if (r0 == 0) goto L28
            r0 = r6
            o.v$g r0 = (o.v.g) r0
            r7 = r0
            r0 = r7
            int r0 = r0.f1671l
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f1671l = r1
            r0 = r7
            r6 = r0
            goto L31
        L28:
            o.v$g r0 = new o.v$g
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.f1670k
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.f1671l
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L67
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L57
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L57:
            r0 = r6
            java.lang.Object r0 = r0.f1669j
            o.j r0 = (o.j) r0
            r7 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L88
        L67:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = r4
            r0.f1669j = r1
            r0 = r6
            r1 = 1
            r0.f1671l = r1
            r0 = r4
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r10
            if (r0 != r1) goto L88
            r0 = r10
            return r0
        L88:
            p.a r0 = new p.a
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.f(o.j, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <T> o.i<T> g(@NotNull o.i<? extends T> iVar, int i2) {
        if (i2 > 0) {
            return new h(iVar, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " should be positive").toString());
    }

    @NotNull
    public static final <T> o.i<T> h(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new j(iVar, function2);
    }

    @NotNull
    public static final <T, R> o.i<R> i(@NotNull o.i<? extends T> iVar, @BuilderInference @NotNull Function3<? super o.j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return o.k.I0(new l(iVar, function3, null));
    }
}
