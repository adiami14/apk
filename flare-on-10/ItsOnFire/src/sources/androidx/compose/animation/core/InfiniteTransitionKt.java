package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��,\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010��\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a5\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0002\u0010\n\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0004\"\u0004\b��\u0010\f\"\b\b\u0001\u0010\r*\u00020\u000e*\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\f2\u0006\u0010\u0007\u001a\u0002H\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\f0\tH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "animateFloat", "Landroidx/compose/runtime/State;", "", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animateValue", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/InfiniteTransitionKt.class */
public final class InfiniteTransitionKt {
    @Composable
    @NotNull
    public static final State<Float> animateFloat(@NotNull InfiniteTransition infiniteTransition, float f2, float f3, @NotNull InfiniteRepeatableSpec<Float> animationSpec, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        composer.startReplaceableGroup(1399864148);
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f2), Float.valueOf(f3), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), animationSpec, composer, (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i2 & 896) | ((i2 << 3) & 57344));
        composer.endReplaceableGroup();
        return animateValue;
    }

    @Composable
    @NotNull
    public static final <T, V extends AnimationVector> State<T> animateValue(@NotNull final InfiniteTransition infiniteTransition, final T t2, final T t3, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull final InfiniteRepeatableSpec<T> animationSpec, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        composer.startReplaceableGroup(1847699412);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        InfiniteTransition.TransitionAnimationState transitionAnimationState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            transitionAnimationState = new InfiniteTransition.TransitionAnimationState(infiniteTransition, t2, t3, typeConverter, animationSpec);
            composer.updateRememberedValue(transitionAnimationState);
        }
        composer.endReplaceableGroup();
        final InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) transitionAnimationState;
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (Intrinsics.areEqual(t2, transitionAnimationState2.getInitialValue()) && Intrinsics.areEqual(t3, transitionAnimationState2.getTargetValue())) {
                    return;
                }
                transitionAnimationState2.updateValues(t2, t3, animationSpec);
            }
        }, composer, 0);
        EffectsKt.DisposableEffect(transitionAnimationState2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                InfiniteTransition.this.addAnimation$animation_core_release(transitionAnimationState2);
                final InfiniteTransition infiniteTransition2 = InfiniteTransition.this;
                final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        InfiniteTransition.this.removeAnimation$animation_core_release(transitionAnimationState3);
                    }
                };
            }
        }, composer, 6);
        composer.endReplaceableGroup();
        return transitionAnimationState2;
    }

    @Composable
    @NotNull
    public static final InfiniteTransition rememberInfiniteTransition(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(353815743);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        InfiniteTransition infiniteTransition = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            infiniteTransition = new InfiniteTransition();
            composer.updateRememberedValue(infiniteTransition);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition2 = (InfiniteTransition) infiniteTransition;
        infiniteTransition2.run$animation_core_release(composer, 8);
        composer.endReplaceableGroup();
        return infiniteTransition2;
    }
}
