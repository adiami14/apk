package p;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.w0;
@Metadata(bv = {}, d1 = {"��0\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028��0\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004ø\u0001��¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lp/b0;", "T", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "j", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "", "k", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "l", "Lkotlin/jvm/functions/Function2;", "emitRef", "downstream", "<init>", "(Lo/j;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:p/b0.class */
public final class b0<T> implements o.j<T> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f1860j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final Object f1861k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final Function2<T, Continuation<? super Unit>, Object> f1862l;

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\u0010\u0003\u001a\u00020\u0002\"\u0004\b��\u0010��2\u0006\u0010\u0001\u001a\u00028��H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:p/b0$a.class */
    public static final class a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1863j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1864k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o.j<? super T> jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1865l = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1865l, continuation);
            aVar.f1864k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke2((a) obj, continuation);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(T t2, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(t2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1863j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f1864k;
                this.f1863j = 1;
                if (this.f1865l.emit(obj2, this) == coroutine_suspended) {
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

    public b0(@NotNull o.j<? super T> jVar, @NotNull CoroutineContext coroutineContext) {
        this.f1860j = coroutineContext;
        this.f1861k = w0.b(coroutineContext);
        this.f1862l = new a(jVar, null);
    }

    @Override // o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object c2 = f.c(this.f1860j, t2, this.f1861k, this.f1862l, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return c2 == coroutine_suspended ? c2 : Unit.INSTANCE;
    }
}
