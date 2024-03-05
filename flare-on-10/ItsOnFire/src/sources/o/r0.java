package o;

import androidx.appcompat.R;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lo/r0;", "Lo/o0;", "Lo/t0;", "", "subscriptionCount", "Lo/i;", "Lo/m0;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:o/r0.class */
public final class r0 implements o0 {

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010��H\u008a@"}, d2 = {"Lo/j;", "Lo/m0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/r0$a.class */
    public static final class a extends SuspendLambda implements Function2<j<? super m0>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1532j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1533k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t0<Integer> f1534l;

        @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0010\b\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020��H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o.r0$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:o/r0$a$a.class */
        public static final class C0076a<T> implements j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f1535j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ j<m0> f1536k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            /* renamed from: o.r0$a$a$a  reason: collision with other inner class name */
            /* loaded from: ItsOnFire.jar:o/r0$a$a$a.class */
            public static final class C0077a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1537j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ C0076a<T> f1538k;

                /* renamed from: l  reason: collision with root package name */
                public int f1539l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0077a(C0076a<? super T> c0076a, Continuation<? super C0077a> continuation) {
                    super(continuation);
                    this.f1538k = c0076a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1537j = obj;
                    this.f1539l |= Integer.MIN_VALUE;
                    return this.f1538k.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0076a(Ref.BooleanRef booleanRef, j<? super m0> jVar) {
                this.f1535j = booleanRef;
                this.f1536k = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof o.r0.a.C0076a.C0077a
                    if (r0 == 0) goto L28
                    r0 = r7
                    o.r0$a$a$a r0 = (o.r0.a.C0076a.C0077a) r0
                    r8 = r0
                    r0 = r8
                    int r0 = r0.f1539l
                    r9 = r0
                    r0 = r9
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L28
                    r0 = r8
                    r1 = r9
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.f1539l = r1
                    r0 = r8
                    r7 = r0
                    goto L32
                L28:
                    o.r0$a$a$a r0 = new o.r0$a$a$a
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r2, r3)
                    r7 = r0
                L32:
                    r0 = r7
                    java.lang.Object r0 = r0.f1537j
                    r10 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r8 = r0
                    r0 = r7
                    int r0 = r0.f1539l
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L5f
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L55
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L9c
                L55:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L5f:
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r6
                    if (r0 <= 0) goto La0
                    r0 = r5
                    kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f1535j
                    r10 = r0
                    r0 = r10
                    boolean r0 = r0.element
                    if (r0 != 0) goto La0
                    r0 = r10
                    r1 = 1
                    r0.element = r1
                    r0 = r5
                    o.j<o.m0> r0 = r0.f1536k
                    r11 = r0
                    o.m0 r0 = o.m0.START
                    r10 = r0
                    r0 = r7
                    r1 = 1
                    r0.f1539l = r1
                    r0 = r11
                    r1 = r10
                    r2 = r7
                    java.lang.Object r0 = r0.emit(r1, r2)
                    r1 = r8
                    if (r0 != r1) goto L9c
                    r0 = r8
                    return r0
                L9c:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                La0:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.r0.a.C0076a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // o.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0<Integer> t0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1534l = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1534l, continuation);
            aVar.f1533k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull j<? super m0> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1532j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = (j) this.f1533k;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                t0<Integer> t0Var = this.f1534l;
                C0076a c0076a = new C0076a(booleanRef, jVar);
                this.f1532j = 1;
                if (t0Var.collect(c0076a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.o0
    @NotNull
    public i<m0> a(@NotNull t0<Integer> t0Var) {
        return k.I0(new a(t0Var, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
