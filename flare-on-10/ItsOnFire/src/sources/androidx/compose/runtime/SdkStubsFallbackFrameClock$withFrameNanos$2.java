package androidx.compose.runtime;

import j.f1;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(bv = {}, d1 = {"��\b\n��\n\u0002\u0018\u0002\n��\u0010\u0002\u001a\u00028��\"\u0004\b��\u0010��*\u00020\u0001H\u008a@"}, d2 = {"R", "Lj/u0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {androidx.appcompat.R.styleable.AppCompatTheme_colorBackgroundFloating}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/SdkStubsFallbackFrameClock$withFrameNanos$2.class */
public final class SdkStubsFallbackFrameClock$withFrameNanos$2<R> extends SuspendLambda implements Function2<u0, Continuation<? super R>, Object> {
    public final /* synthetic */ Function1<Long, R> $onFrame;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(Function1<? super Long, ? extends R> function1, Continuation<? super SdkStubsFallbackFrameClock$withFrameNanos$2> continuation) {
        super(2, continuation);
        this.$onFrame = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super R> continuation) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Object obj) {
        return invoke(u0Var, (Continuation) ((Continuation) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (f1.b(16L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return this.$onFrame.invoke(Boxing.boxLong(System.nanoTime()));
    }
}
