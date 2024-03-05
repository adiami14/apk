package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0088\u0001\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b��\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a3\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b��\u0010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0088\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001c0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001f0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020!0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020#0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020%0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\r\"\u0004\b��\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00032*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020'0\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u001a©\u0001\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00040\r\"\u0004\b��\u0010\u000f\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010)*\u00020**\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)0,2*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u00040\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010-\u001a_\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b��\u0010\u000f\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u000f0\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\u0010/\u001a\"\u0012\u0013\u0012\u0011H\u000f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002H\u00040\u0011¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0001¢\u0006\u0002\u00101\u001aA\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b��\u0010\u000f\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0006\u00103\u001a\u0002H\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\u0006\u00104\u001a\u00020\u0007H\u0001¢\u0006\u0002\u00105\u001aa\u00106\u001a\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)07R\b\u0012\u0004\u0012\u0002H\u000f0\u0003\"\u0004\b��\u0010\u000f\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010)*\u00020**\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)0,2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u00108\u001am\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00040\r\"\u0004\b��\u0010\u000f\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010)*\u00020**\b\u0012\u0004\u0012\u0002H\u000f0\u00032\u0006\u0010:\u001a\u0002H\u00042\u0006\u0010;\u001a\u0002H\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H)0,2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010=\"\u000e\u0010��\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"AnimationDebugDurationScale", "", "updateTransition", "Landroidx/compose/animation/core/Transition;", "T", "targetState", Constants.ScionAnalytics.PARAM_LABEL, "", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "transitionState", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "S", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "initialValue", "targetValue", "animationSpec", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/TransitionKt.class */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    @Composable
    @NotNull
    public static final <S> State<Dp> animateDp(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Dp> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-307431328);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>>() { // from class: androidx.compose.animation.core.TransitionKt$animateDp$1
                @Composable
                @NotNull
                public final SpringSpec<Dp> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(252674177);
                    SpringSpec<Dp> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m4783boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "DpAnimation";
        }
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Dp> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<Float> animateFloat(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Float> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(1399891485);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt$animateFloat$1
                @Composable
                @NotNull
                public final SpringSpec<Float> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-87748792);
                    SpringSpec<Float> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "FloatAnimation";
        }
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Float> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<Integer> animateInt(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Integer> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-941422641);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt$animateInt$1
                @Composable
                @NotNull
                public final SpringSpec<Integer> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(847168882);
                    SpringSpec<Integer> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "IntAnimation";
        }
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Integer> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<IntOffset> animateIntOffset(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, IntOffset> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-1397279703);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntOffset$1
                @Composable
                @NotNull
                public final SpringSpec<IntOffset> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-2136566172);
                    SpringSpec<IntOffset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4898boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<IntOffset> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<IntSize> animateIntSize(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, IntSize> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-520509581);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntSize$1
                @Composable
                @NotNull
                public final SpringSpec<IntSize> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-1158357338);
                    SpringSpec<IntSize> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m4943boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<IntSize> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<Offset> animateOffset(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Offset> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-336089491);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateOffset$1
                @Composable
                @NotNull
                public final SpringSpec<Offset> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(1800993046);
                    SpringSpec<Offset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2156boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "OffsetAnimation";
        }
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Offset> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<Rect> animateRect(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Rect> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(887351751);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt$animateRect$1
                @Composable
                @NotNull
                public final SpringSpec<Rect> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-1189587468);
                    SpringSpec<Rect> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "RectAnimation";
        }
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Rect> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S> State<Size> animateSize(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Size> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(888409164);
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt$animateSize$1
                @Composable
                @NotNull
                public final SpringSpec<Size> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(1723943921);
                    SpringSpec<Size> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2227boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "SizeAnimation";
        }
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i4 = i2 << 3;
        int i5 = (i2 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(1847725064);
        S currentState = transition.getCurrentState();
        int i6 = (i5 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Size> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i6)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str, composer, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> animateValue(@NotNull Transition<S> transition, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, ? extends T> targetValueByState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(1847725064);
        if ((i3 & 2) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt$animateValue$1
                @Composable
                @NotNull
                public final SpringSpec<T> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-251233035);
                    SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    composer2.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 4) != 0) {
            str = "ValueAnimation";
        }
        S currentState = transition.getCurrentState();
        int i4 = (i2 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<T> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(currentState, composer, Integer.valueOf(i4)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i4)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i2 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), typeConverter, str, composer, (i2 & 14) | (57344 & (i2 << 9)) | (458752 & (i2 << 6)));
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
     */
    @androidx.compose.animation.core.ExperimentalTransitionApi
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T> androidx.compose.animation.core.Transition<T> createChildTransition(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<S> r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = r9
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r11
            java.lang.String r1 = "transformToChildState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            r1 = 1117107336(0x4295b488, float:74.8526)
            r0.startReplaceableGroup(r1)
            r0 = r10
            r15 = r0
            r0 = r14
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L25
            java.lang.String r0 = "ChildTransition"
            r15 = r0
        L25:
            r0 = r12
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r12
            r1 = r9
            boolean r0 = r0.changed(r1)
            r16 = r0
            r0 = r12
            java.lang.Object r0 = r0.rememberedValue()
            r17 = r0
            r0 = r16
            if (r0 != 0) goto L52
            r0 = r17
            r10 = r0
            r0 = r17
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L5e
        L52:
            r0 = r9
            java.lang.Object r0 = r0.getCurrentState()
            r10 = r0
            r0 = r12
            r1 = r10
            r0.updateRememberedValue(r1)
        L5e:
            r0 = r12
            r0.endReplaceableGroup()
            r0 = r9
            boolean r0 = r0.isSeeking()
            if (r0 == 0) goto L70
            r0 = r9
            java.lang.Object r0 = r0.getCurrentState()
            r10 = r0
        L70:
            r0 = r13
            r1 = 3
            int r0 = r0 >> r1
            r1 = 112(0x70, float:1.57E-43)
            r0 = r0 & r1
            r14 = r0
            r0 = r9
            r1 = r11
            r2 = r10
            r3 = r12
            r4 = r14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.invoke(r2, r3, r4)
            r2 = r11
            r3 = r9
            java.lang.Object r3 = r3.getTargetState()
            r4 = r12
            r5 = r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.invoke(r3, r4, r5)
            r3 = r15
            r4 = r12
            r5 = r13
            r6 = 14
            r5 = r5 & r6
            r6 = r13
            r7 = 6
            int r6 = r6 << r7
            r7 = 7168(0x1c00, float:1.0045E-41)
            r6 = r6 & r7
            r5 = r5 | r6
            androidx.compose.animation.core.Transition r0 = createChildTransitionInternal(r0, r1, r2, r3, r4, r5)
            r9 = r0
            r0 = r12
            r0.endReplaceableGroup()
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.createChildTransition(androidx.compose.animation.core.Transition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):androidx.compose.animation.core.Transition");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L12;
     */
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T> androidx.compose.animation.core.Transition<T> createChildTransitionInternal(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<S> r7, T r8, T r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(androidx.compose.animation.core.Transition, java.lang.Object, java.lang.Object, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.animation.core.Transition");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.core.InternalAnimationApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<S> r6, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.TwoWayConverter<T, V> r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            r0 = r6
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            java.lang.String r1 = "typeConverter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r9
            r1 = -44505534(0xfffffffffd58e642, float:-1.8019301E37)
            r0.startReplaceableGroup(r1)
            r0 = r8
            r12 = r0
            r0 = r11
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L25
            java.lang.String r0 = "DeferredAnimation"
            r12 = r0
        L25:
            r0 = r9
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r9
            r1 = r6
            boolean r0 = r0.changed(r1)
            r13 = r0
            r0 = r9
            java.lang.Object r0 = r0.rememberedValue()
            r14 = r0
            r0 = r13
            if (r0 != 0) goto L52
            r0 = r14
            r8 = r0
            r0 = r14
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L65
        L52:
            androidx.compose.animation.core.Transition$DeferredAnimation r0 = new androidx.compose.animation.core.Transition$DeferredAnimation
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r12
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r9
            r1 = r8
            r0.updateRememberedValue(r1)
        L65:
            r0 = r9
            r0.endReplaceableGroup()
            r0 = r8
            androidx.compose.animation.core.Transition$DeferredAnimation r0 = (androidx.compose.animation.core.Transition.DeferredAnimation) r0
            r7 = r0
            r0 = r7
            androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1 r1 = new androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>()
            r2 = r9
            r3 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect(r0, r1, r2, r3)
            r0 = r6
            boolean r0 = r0.isSeeking()
            if (r0 == 0) goto L8b
            r0 = r7
            r0.setupSeeking$animation_core_release()
        L8b:
            r0 = r9
            r0.endReplaceableGroup()
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.createDeferredAnimation(androidx.compose.animation.core.Transition, androidx.compose.animation.core.TwoWayConverter, java.lang.String, androidx.compose.runtime.Composer, int, int):androidx.compose.animation.core.Transition$DeferredAnimation");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L12;
     */
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> createTransitionAnimation(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<S> r8, T r9, T r10, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.FiniteAnimationSpec<T> r11, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.TwoWayConverter<T, V> r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15) {
        /*
            r0 = r8
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r11
            java.lang.String r1 = "animationSpec"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            java.lang.String r1 = "typeConverter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r13
            java.lang.String r1 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r14
            r1 = 460682138(0x1b75739a, float:2.0303278E-22)
            r0.startReplaceableGroup(r1)
            r0 = r14
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r14
            r1 = r8
            boolean r0 = r0.changed(r1)
            r16 = r0
            r0 = r14
            java.lang.Object r0 = r0.rememberedValue()
            r17 = r0
            r0 = r16
            if (r0 != 0) goto L58
            r0 = r17
            r18 = r0
            r0 = r17
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L76
        L58:
            androidx.compose.animation.core.Transition$TransitionAnimationState r0 = new androidx.compose.animation.core.Transition$TransitionAnimationState
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r12
            r5 = r10
            androidx.compose.animation.core.AnimationVector r4 = androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(r4, r5)
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r18 = r0
            r0 = r14
            r1 = r18
            r0.updateRememberedValue(r1)
        L76:
            r0 = r14
            r0.endReplaceableGroup()
            r0 = r18
            androidx.compose.animation.core.Transition$TransitionAnimationState r0 = (androidx.compose.animation.core.Transition.TransitionAnimationState) r0
            r12 = r0
            r0 = r8
            boolean r0 = r0.isSeeking()
            if (r0 == 0) goto L96
            r0 = r12
            r1 = r9
            r2 = r10
            r3 = r11
            r0.updateInitialAndTargetValue$animation_core_release(r1, r2, r3)
            goto L9d
        L96:
            r0 = r12
            r1 = r10
            r2 = r11
            r0.updateTargetValue$animation_core_release(r1, r2)
        L9d:
            r0 = r12
            androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1 r1 = new androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1
            r2 = r1
            r3 = r8
            r4 = r12
            r2.<init>()
            r2 = r14
            r3 = 0
            androidx.compose.runtime.EffectsKt.DisposableEffect(r0, r1, r2, r3)
            r0 = r14
            r0.endReplaceableGroup()
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.createTransitionAnimation(androidx.compose.animation.core.Transition, java.lang.Object, java.lang.Object, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.TwoWayConverter, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L11;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> androidx.compose.animation.core.Transition<T> updateTransition(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.MutableTransitionState<T> r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r7, int r8, int r9) {
        /*
            r0 = r5
            java.lang.String r1 = "transitionState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            r1 = 1641303020(0x61d44bec, float:4.8952256E20)
            r0.startReplaceableGroup(r1)
            r0 = r9
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L19
            r0 = 0
            r6 = r0
        L19:
            r0 = r7
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r7
            r1 = r5
            boolean r0 = r0.changed(r1)
            r10 = r0
            r0 = r7
            java.lang.Object r0 = r0.rememberedValue()
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L47
            r0 = r11
            r12 = r0
            r0 = r11
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L5a
        L47:
            androidx.compose.animation.core.Transition r0 = new androidx.compose.animation.core.Transition
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r7
            r1 = r12
            r0.updateRememberedValue(r1)
        L5a:
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r12
            androidx.compose.animation.core.Transition r0 = (androidx.compose.animation.core.Transition) r0
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.Object r1 = r1.getTargetState()
            r2 = r7
            r3 = 0
            r0.animateTo$animation_core_release(r1, r2, r3)
            r0 = r6
            androidx.compose.animation.core.TransitionKt$updateTransition$2 r1 = new androidx.compose.animation.core.TransitionKt$updateTransition$2
            r2 = r1
            r3 = r6
            r2.<init>()
            r2 = r7
            r3 = 0
            androidx.compose.runtime.EffectsKt.DisposableEffect(r0, r1, r2, r3)
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.updateTransition(androidx.compose.animation.core.MutableTransitionState, java.lang.String, androidx.compose.runtime.Composer, int, int):androidx.compose.animation.core.Transition");
    }

    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(T t2, @Nullable String str, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1641299376);
        String str2 = str;
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Transition transition = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            transition = new Transition(t2, str2);
            composer.updateRememberedValue(transition);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition2 = (Transition) transition;
        transition2.animateTo$animation_core_release(t2, composer, (i2 & 8) | 48 | (i2 & 14));
        EffectsKt.DisposableEffect(transition2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final Transition<T> transition3 = transition2;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Transition.this.onTransitionEnd$animation_core_release();
                    }
                };
            }
        }, composer, 6);
        composer.endReplaceableGroup();
        return transition2;
    }
}
