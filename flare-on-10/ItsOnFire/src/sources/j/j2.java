package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0018\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028��\"\u0004\b��\u0010��2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0086@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028��\"\u0004\b��\u0010��2\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coroutineContext", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "a", "I", "WORKING", "FINISHED", "c", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/j2.class */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f494a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f495b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f496c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f497d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"��\b\n��\n\u0002\u0018\u0002\n��\u0010\u0002\u001a\u00028��\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:j/j2$a.class */
    public static final class a<T> extends SuspendLambda implements Function2<u0, Continuation<? super T>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f498j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f499k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function0<T> f500l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends T> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f500l = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f500l, continuation);
            aVar.f499k = obj;
            return aVar;
        }

        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super T> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Object obj) {
            return invoke(u0Var, (Continuation) ((Continuation) obj));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f498j == 0) {
                ResultKt.throwOnFailure(obj);
                return j2.d(((u0) this.f499k).getCoroutineContext(), this.f500l);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
        return j.h(coroutineContext, new a(function0, null), continuation);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return b(coroutineContext, function0, continuation);
    }

    public static final <T> T d(CoroutineContext coroutineContext, Function0<? extends T> function0) {
        try {
            x3 x3Var = new x3(r2.B(coroutineContext));
            x3Var.d();
            T invoke = function0.invoke();
            x3Var.a();
            return invoke;
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        }
    }
}
