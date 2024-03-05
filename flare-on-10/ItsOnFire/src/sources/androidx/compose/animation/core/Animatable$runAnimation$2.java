package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T, V] */
@Metadata(bv = {}, d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b��\u0010��\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationResult;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {291}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/Animatable$runAnimation$2.class */
public final class Animatable$runAnimation$2<T, V> extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
    public final /* synthetic */ Animation<T, V> $animation;
    public final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
    public final /* synthetic */ T $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t2, Animation<T, V> animation, long j2, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super Animatable$runAnimation$2> continuation) {
        super(1, continuation);
        this.this$0 = animatable;
        this.$initialVelocity = t2;
        this.$animation = animation;
        this.$startTime = j2;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Continuation) ((Continuation) obj));
    }

    @Nullable
    public final Object invoke(@Nullable Continuation<? super AnimationResult<T, V>> continuation) {
        return ((Animatable$runAnimation$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        final AnimationState copy$default;
        final Ref.BooleanRef booleanRef;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((V) ((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity)));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                copy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                booleanRef = new Ref.BooleanRef();
                Animation<T, V> animation = this.$animation;
                long j2 = this.$startTime;
                final Animatable<T, V> animatable = this.this$0;
                final Function1<Animatable<T, V>, Unit> function1 = this.$block;
                Function1<AnimationScope<T, V>, Unit> function12 = new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke((AnimationScope) ((AnimationScope) obj2));
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(@NotNull AnimationScope<T, V> animate) {
                        Object clampToBounds;
                        Intrinsics.checkNotNullParameter(animate, "$this$animate");
                        SuspendAnimationKt.updateState(animate, animatable.getInternalState$animation_core_release());
                        clampToBounds = animatable.clampToBounds(animate.getValue());
                        if (Intrinsics.areEqual(clampToBounds, animate.getValue())) {
                            Function1<Animatable<T, V>, Unit> function13 = function1;
                            if (function13 == null) {
                                return;
                            }
                            function13.invoke(animatable);
                            return;
                        }
                        animatable.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
                        copy$default.setValue$animation_core_release(clampToBounds);
                        Function1<Animatable<T, V>, Unit> function14 = function1;
                        if (function14 != null) {
                            function14.invoke(animatable);
                        }
                        animate.cancelAnimation();
                        booleanRef.element = true;
                    }
                };
                this.L$0 = copy$default;
                this.L$1 = booleanRef;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j2, function12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                booleanRef = (Ref.BooleanRef) this.L$1;
                AnimationState animationState = (AnimationState) this.L$0;
                ResultKt.throwOnFailure(obj);
                copy$default = animationState;
            }
            AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.endAnimation();
            return new AnimationResult(copy$default, animationEndReason);
        } catch (CancellationException e2) {
            this.this$0.endAnimation();
            throw e2;
        }
    }
}
