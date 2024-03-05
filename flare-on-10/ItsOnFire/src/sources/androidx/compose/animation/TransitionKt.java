package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��D\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0088\u0001\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b��\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2*\b\n\u0010\f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132&\u0010\u0014\u001a\"\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0002\b\u0010H\u0087\bø\u0001��ø\u0001\u0002¢\u0006\u0002\u0010\u0018\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "S", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", Constants.ScionAnalytics.PARAM_LABEL, "", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/TransitionKt.class */
public final class TransitionKt {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animateColor(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<S> r11, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.animation.core.Transition.Segment<S>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>> r12, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.TransitionKt.animateColor(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function3, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    @Composable
    @NotNull
    /* renamed from: animateColor-RIQooxk  reason: not valid java name */
    public static final State<Color> m216animateColorRIQooxk(@NotNull InfiniteTransition animateColor, long j2, long j3, @NotNull InfiniteRepeatableSpec<Color> animationSpec, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        composer.startReplaceableGroup(-1462135610);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        TwoWayConverter<Color, AnimationVector4D> twoWayConverter = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            twoWayConverter = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2418getColorSpaceimpl(j3));
            composer.updateRememberedValue(twoWayConverter);
        }
        composer.endReplaceableGroup();
        State<Color> animateValue = InfiniteTransitionKt.animateValue(animateColor, Color.m2404boximpl(j2), Color.m2404boximpl(j3), (TwoWayConverter) twoWayConverter, animationSpec, composer, InfiniteTransition.$stable | 4096 | (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & (i2 << 3)));
        composer.endReplaceableGroup();
        return animateValue;
    }
}
