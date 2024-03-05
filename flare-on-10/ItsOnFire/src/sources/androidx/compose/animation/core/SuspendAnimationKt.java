package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��d\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0099\u0001\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0006\u0010\b\u001a\u0002H\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b26\u0010\f\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\rH\u0086@ø\u0001��¢\u0006\u0002\u0010\u0012\u001as\u0010��\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\u00132\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\rH\u0086@ø\u0001��¢\u0006\u0002\u0010\u0014\u001aa\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001626\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\rH\u0086@ø\u0001��¢\u0006\u0002\u0010\u0017\u001av\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001e\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001fH\u0080@ø\u0001��¢\u0006\u0002\u0010 \u001ap\u0010\u0015\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00182\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001e\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001fH\u0086@ø\u0001��¢\u0006\u0002\u0010$\u001az\u0010%\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00182\u0006\u0010\b\u001a\u0002H\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001e\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001fH\u0086@ø\u0001��¢\u0006\u0002\u0010&\u001aZ\u0010'\u001a\u0002H(\"\u0004\b��\u0010(\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001a2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(*\u0012\u0004\u0012\u0002H(0\u001dH\u0082@ø\u0001��¢\u0006\u0002\u0010+\u001a}\u0010,\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001e2\u0006\u0010*\u001a\u00020\u001c2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00182#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001e\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001fH\u0002\u001a<\u0010/\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001e2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0018H��\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"animate", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateDecay", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "animation", "Landroidx/compose/animation/core/Animation;", "startTimeNanos", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "sequentialAnimation", "", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callWithFrameNanos", "R", "onFrame", "frameTimeNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAnimationFrame", "anim", "state", "updateState", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/SuspendAnimationKt.class */
public final class SuspendAnimationKt {
    @Nullable
    public static final Object animate(float f2, float f3, float f4, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function2<? super Float, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animate = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f2), Boxing.boxFloat(f3), Boxing.boxFloat(f4), animationSpec, function2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animate == coroutine_suspended ? animate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a4  */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, androidx.compose.animation.core.AnimationScope] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.AnimationState<T, V> r12, @org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Animation<T, V> r13, long r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.animation.core.AnimationVector] */
    @Nullable
    public static final <T, V extends AnimationVector> Object animate(@NotNull final TwoWayConverter<T, V> twoWayConverter, T t2, T t3, @Nullable T t4, @NotNull AnimationSpec<T> animationSpec, @NotNull final Function2<? super T, ? super T, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        V invoke = t4 == null ? null : twoWayConverter.getConvertToVector().invoke(t4);
        if (invoke == null) {
            invoke = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t2));
        }
        Object animate$default = animate$default(new AnimationState(twoWayConverter, t2, invoke, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t2, t3, invoke), 0L, new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AnimationScope) ((AnimationScope) obj));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AnimationScope<T, V> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                function2.invoke(animate.getValue(), twoWayConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
            }
        }, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animate$default == coroutine_suspended ? animate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(float f2, float f3, float f4, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f2, f3, f4, animationSpec, function2, continuation);
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<AnimationScope<Object, Object>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Object, Object> animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }
            };
        }
        return animate(animationState, animation, j2, function1, continuation);
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i2, Object obj4) {
        if ((i2 & 8) != 0) {
            obj3 = null;
        }
        if ((i2 & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, function2, continuation);
    }

    @Nullable
    public static final Object animateDecay(float f2, float f3, @NotNull FloatDecayAnimationSpec floatDecayAnimationSpec, @NotNull final Function2<? super Float, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f2, f3, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f2, f3), 0L, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                function2.invoke(animate.getValue(), Float.valueOf(animate.getVelocityVector().getValue()));
            }
        }, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animate$default == coroutine_suspended ? animate$default : Unit.INSTANCE;
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateDecay(@NotNull AnimationState<T, V> animationState, @NotNull DecayAnimationSpec<T> decayAnimationSpec, boolean z, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) animationState.getTypeConverter(), (Object) animationState.getValue(), (AnimationVector) animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animate == coroutine_suspended ? animate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<AnimationScope<Object, Object>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Object, Object> animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, function1, continuation);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateTo(@NotNull AnimationState<T, V> animationState, T t2, @NotNull AnimationSpec<T> animationSpec, boolean z, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t2, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animate == coroutine_suspended ? animate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<AnimationScope<Object, Object>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Object, Object> animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }
            };
        }
        return animateTo(animationState, obj, animationSpec, z, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return animation.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation) : MonotonicFrameClockKt.withFrameNanos(new Function1<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R invoke(long j2) {
                return function1.invoke(Long.valueOf(j2 / 1));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Long l2) {
                return invoke(l2.longValue());
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j2, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j2);
        long startTimeNanos = j2 - animationScope.getStartTimeNanos();
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(startTimeNanos));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(startTimeNanos));
        if (animation.isFinishedFromNanos(startTimeNanos)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static final <T, V extends AnimationVector> void updateState(@NotNull AnimationScope<T, V> animationScope, @NotNull AnimationState<T, V> state) {
        Intrinsics.checkNotNullParameter(animationScope, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        state.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(state.getVelocityVector(), animationScope.getVelocityVector());
        state.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        state.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        state.setRunning$animation_core_release(animationScope.isRunning());
    }
}
