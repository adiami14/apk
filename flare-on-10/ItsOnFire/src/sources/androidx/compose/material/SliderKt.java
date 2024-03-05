package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0094\u0001\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001a\u001a\u007f\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010'\u001a[\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a}\u00102\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u00103\u001a\u00020/2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u00104\u001aK\u00105\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u00106\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u00103\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00107\u001aE\u00108\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u00032\u0006\u00103\u001a\u00020/2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010:\u001a\u00020\u0003H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001aS\u0010=\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\bH\u0003¢\u0006\u0002\u0010@\u001a1\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\bH\u0082@ø\u0001��¢\u0006\u0002\u0010G\u001a \u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\bH\u0002\u001a0\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\bH\u0002\u001a<\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\bH\u0002\u001a.\u0010S\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\bH\u0002\u001a\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010!\u001a\u00020\"H\u0002\u001a;\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b\u0018\u00010X*\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0082@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b_\u0010`\u001a\u0092\u0001\u0010a\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0c2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010e\u001a\u00020 2\u0006\u0010U\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u00140c2\u0018\u0010g\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120hH\u0002\u001a\\\u0010i\u001a\u00020\u0001*\u00020\u00012\u0006\u0010B\u001a\u00020C2\u0006\u00103\u001a\u00020/2\u0006\u0010U\u001a\u00020\b2\u0006\u0010e\u001a\u00020 2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0c2\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140c2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001aX\u0010k\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"H\u0002\"\u000e\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u0003X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbPressedElevation", "ThumbRadius", "getThumbRadius", "()F", "ThumbRippleRadius", "TrackHeight", "getTrackHeight", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueState", "Landroidx/compose/runtime/MutableState;", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "RangeSlider", "values", "onValueChange", "modifier", "enabled", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Slider", "interactionSource", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "SliderThumb", "offset", "thumbSize", "SliderThumb-gNmqVrs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderPressModifier", "rawOffset", "sliderSemantics", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SliderKt.class */
public final class SliderKt {
    @NotNull
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    @NotNull
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m4785constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m4785constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m4785constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m4785constructorimpl(6);
    private static final float TrackHeight = Dp.m4785constructorimpl(4);

    static {
        float m4785constructorimpl = Dp.m4785constructorimpl(48);
        SliderHeight = m4785constructorimpl;
        float m4785constructorimpl2 = Dp.m4785constructorimpl(144);
        SliderMinWidth = m4785constructorimpl2;
        DefaultSliderConstraints = SizeKt.m714heightInVpY3zN4$default(SizeKt.m733widthInVpY3zN4$default(Modifier.Companion, m4785constructorimpl2, 0.0f, 2, null), 0.0f, m4785constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L49;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CorrectValueSideEffect(final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> r9, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r10, final androidx.compose.runtime.MutableState<java.lang.Float> r11, final float r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.CorrectValueSideEffect(kotlin.jvm.functions.Function1, kotlin.ranges.ClosedFloatingPointRange, androidx.compose.runtime.MutableState, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x03e0, code lost:
        if (r0 == r0.getEmpty()) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0256  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r28, boolean r29, @org.jetbrains.annotations.Nullable kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r30, int r31, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.material.SliderColors r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void RangeSliderImpl(final boolean z, final float f2, final float f3, final List<Float> list, final SliderColors sliderColors, final float f4, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1161720378);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(-1990474327);
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1376089394);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1989constructorimpl = Updater.m1989constructorimpl(startRestartGroup);
        Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1996setimpl(m1989constructorimpl, density, companion2.getSetDensity());
        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1690176159);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo524toPx0680j_4 = density2.mo524toPx0680j_4(getTrackHeight());
        float mo524toPx0680j_42 = density2.mo524toPx0680j_4(getThumbRadius());
        float mo520toDpu2uoSUM = density2.mo520toDpu2uoSUM(f4);
        float m4785constructorimpl = Dp.m4785constructorimpl(getThumbRadius() * 2);
        float f5 = mo520toDpu2uoSUM - m4785constructorimpl;
        float m4785constructorimpl2 = Dp.m4785constructorimpl(Dp.m4785constructorimpl(f5) * f2);
        float m4785constructorimpl3 = Dp.m4785constructorimpl(Dp.m4785constructorimpl(f5) * f3);
        Modifier.Companion companion3 = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScopeInstance.align(companion3, companion.getCenterStart()), 0.0f, 1, null);
        int i3 = i2 << 6;
        Track(fillMaxSize$default, sliderColors, z, f2, f3, list, mo524toPx0680j_42, mo524toPx0680j_4, startRestartGroup, 262144 | ((i2 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
        Modifier align = boxScopeInstance.align(companion3, companion.getCenterStart());
        int i4 = (i2 >> 3) & 7168;
        int i5 = (i2 << 12) & 57344;
        m1504SliderThumbgNmqVrs(align, m4785constructorimpl2, mutableInteractionSource, sliderColors, z, m4785constructorimpl, startRestartGroup, ((i2 >> 12) & 896) | 196608 | i4 | i5);
        m1504SliderThumbgNmqVrs(boxScopeInstance.align(companion3, companion.getCenterStart()), m4785constructorimpl3, mutableInteractionSource2, sliderColors, z, m4785constructorimpl, startRestartGroup, ((i2 >> 15) & 896) | 196608 | i4 | i5);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                SliderKt.RangeSliderImpl(z, f2, f3, list, sliderColors, f4, mutableInteractionSource, mutableInteractionSource2, modifier, composer2, i2 | 1);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0459, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0268  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r28, boolean r29, @org.jetbrains.annotations.Nullable kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r30, int r31, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r33, @org.jetbrains.annotations.Nullable androidx.compose.material.SliderColors r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SliderImpl(final boolean z, final float f2, final List<Float> list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1568553907);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(-1990474327);
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1376089394);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1989constructorimpl = Updater.m1989constructorimpl(startRestartGroup);
        Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1996setimpl(m1989constructorimpl, density, companion2.getSetDensity());
        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(618021226);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo524toPx0680j_4 = density2.mo524toPx0680j_4(getTrackHeight());
        float mo524toPx0680j_42 = density2.mo524toPx0680j_4(getThumbRadius());
        float mo520toDpu2uoSUM = density2.mo520toDpu2uoSUM(f3);
        float m4785constructorimpl = Dp.m4785constructorimpl(getThumbRadius() * 2);
        float m4785constructorimpl2 = Dp.m4785constructorimpl(Dp.m4785constructorimpl(mo520toDpu2uoSUM - m4785constructorimpl) * f2);
        Modifier align = boxScopeInstance.align(Modifier.Companion, companion.getCenterStart());
        Track(SizeKt.fillMaxSize$default(align, 0.0f, 1, null), sliderColors, z, 0.0f, f2, list, mo524toPx0680j_42, mo524toPx0680j_4, startRestartGroup, 265216 | ((i2 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i2 << 6) & 896) | ((i2 << 9) & 57344));
        m1504SliderThumbgNmqVrs(align, m4785constructorimpl2, mutableInteractionSource, sliderColors, z, m4785constructorimpl, startRestartGroup, 196608 | ((i2 >> 9) & 896) | (i2 & 7168) | ((i2 << 12) & 57344));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                SliderKt.SliderImpl(z, f2, list, sliderColors, f3, mutableInteractionSource, modifier, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02db, code lost:
        if (r0 == r0.getEmpty()) goto L74;
     */
    @androidx.compose.runtime.Composable
    /* renamed from: SliderThumb-gNmqVrs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1504SliderThumbgNmqVrs(final androidx.compose.ui.Modifier r11, final float r12, final androidx.compose.foundation.interaction.MutableInteractionSource r13, final androidx.compose.material.SliderColors r14, final boolean r15, final float r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1504SliderThumbgNmqVrs(androidx.compose.ui.Modifier, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, boolean, float, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f2, final float f3, final List<Float> list, final float f4, final float f5, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1052526059);
        int i3 = ((i2 >> 6) & 14) | 48 | ((i2 << 3) & 896);
        final State<Color> trackColor = sliderColors.trackColor(z, false, startRestartGroup, i3);
        final State<Color> trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i3);
        final State<Color> tickColor = sliderColors.tickColor(z, false, startRestartGroup, i3);
        final State<Color> tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i3);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt$Track$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope Canvas) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z2 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long Offset = OffsetKt.Offset(f4, Offset.m2168getYimpl(Canvas.mo2840getCenterF1C5BW0()));
                long Offset2 = OffsetKt.Offset(Size.m2239getWidthimpl(Canvas.mo2841getSizeNHjbRc()) - f4, Offset.m2168getYimpl(Canvas.mo2840getCenterF1C5BW0()));
                long j2 = z2 ? Offset2 : Offset;
                if (z2) {
                    Offset2 = Offset;
                }
                long m2424unboximpl = trackColor.getValue().m2424unboximpl();
                float f6 = f5;
                StrokeCap.Companion companion = StrokeCap.Companion;
                int m2712getRoundKaPHkGw = companion.m2712getRoundKaPHkGw();
                long j3 = Offset2;
                long j4 = j2;
                DrawScope.DefaultImpls.m2885drawLineNGM6Ib0$default(Canvas, m2424unboximpl, j2, Offset2, f6, m2712getRoundKaPHkGw, null, 0.0f, null, 0, 480, null);
                DrawScope.DefaultImpls.m2885drawLineNGM6Ib0$default(Canvas, trackColor2.getValue().m2424unboximpl(), OffsetKt.Offset(Offset.m2167getXimpl(j4) + ((Offset.m2167getXimpl(j3) - Offset.m2167getXimpl(j4)) * f2), Offset.m2168getYimpl(Canvas.mo2840getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2167getXimpl(j4) + ((Offset.m2167getXimpl(j3) - Offset.m2167getXimpl(j4)) * f3), Offset.m2168getYimpl(Canvas.mo2840getCenterF1C5BW0())), f5, companion.m2712getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f7 = f3;
                float f8 = f2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float floatValue = ((Number) obj).floatValue();
                    Boolean valueOf = Boolean.valueOf(floatValue > f7 || floatValue < f8);
                    Object obj2 = linkedHashMap.get(valueOf);
                    ArrayList arrayList = obj2;
                    if (obj2 == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(valueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                State<Color> state = tickColor;
                State<Color> state2 = tickColor2;
                float f9 = f5;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List<Number> list3 = (List) entry.getValue();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    for (Number number : list3) {
                        arrayList2.add(Offset.m2156boximpl(OffsetKt.Offset(Offset.m2167getXimpl(OffsetKt.m2190lerpWko1d7g(j4, j3, number.floatValue())), Offset.m2168getYimpl(Canvas.mo2840getCenterF1C5BW0()))));
                    }
                    DrawScope.DefaultImpls.m2890drawPointsF8ZwMP8$default(Canvas, arrayList2, PointMode.Companion.m2668getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2424unboximpl(), f9, StrokeCap.Companion.m2712getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                }
            }
        }, startRestartGroup, i2 & 14);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Track$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                SliderKt.Track(Modifier.this, sliderColors, z, f2, f3, list, f4, f5, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f2, float f3, float f4, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object drag$default = DraggableState.DefaultImpls.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f2, f3, f4, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return drag$default == coroutine_suspended ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* renamed from: awaitSlop-8vUncbI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1507awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, long r8, int r10, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r11) {
        /*
            r0 = r11
            boolean r0 = r0 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L31
            r0 = r11
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            r12 = r0
            r0 = r12
            int r0 = r0.label
            r13 = r0
            r0 = r13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L31
            r0 = r12
            r1 = r13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r12
            r11 = r0
            goto L3c
        L31:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r11 = r0
        L3c:
            r0 = r11
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r11
            int r0 = r0.label
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7a
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L6f
            r0 = r11
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            r7 = r0
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r12
            r11 = r0
            goto Lb9
        L6f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L7a:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r1 = r0
            r1.<init>()
            r12 = r0
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r1 = r0
            r2 = r12
            r1.<init>()
            r15 = r0
            r0 = r11
            r1 = r12
            r0.L$0 = r1
            r0 = r11
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r15
            r4 = r11
            java.lang.Object r0 = androidx.compose.material.DragGestureDetectorCopyKt.m1300awaitHorizontalPointerSlopOrCancellationgDDlDlE(r0, r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = r14
            if (r0 != r1) goto Lb6
            r0 = r14
            return r0
        Lb6:
            r0 = r12
            r7 = r0
        Lb9:
            r0 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Ld5
            r0 = r11
            r1 = r7
            float r1 = r1.element
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r7 = r0
            goto Ld7
        Ld5:
            r0 = 0
            r7 = r0
        Ld7:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1507awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f2, float f3, float f4) {
        float coerceIn;
        float f5 = f3 - f2;
        coerceIn = RangesKt___RangesKt.coerceIn((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f4 - f2) / f5, 0.0f, 1.0f);
        return coerceIn;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2) {
        if (z) {
            modifier = SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f2), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, function2, z2, f2, state3, null));
        }
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.lerp(f5, f6, calcFraction(f2, f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f2, float f3, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f4, float f5) {
        ClosedFloatingPointRange<Float> rangeTo;
        rangeTo = RangesKt__RangesKt.rangeTo(scale(f2, f3, closedFloatingPointRange.getStart().floatValue(), f4, f5), scale(f2, f3, closedFloatingPointRange.getEndInclusive().floatValue(), f4, f5));
        return rangeTo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderPressModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f2, boolean z, State<Float> state, State<? extends Function1<? super Float, Unit>> state2, boolean z2) {
        if (z2) {
            modifier = SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f2), Boolean.valueOf(z)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$sliderPressModifier$1(draggableState, mutableInteractionSource, state2, z, f2, state, null));
        }
        return modifier;
    }

    private static final Modifier sliderSemantics(Modifier modifier, float f2, final List<Float> list, final boolean z, final Function1<? super Float, Unit> function1, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i2) {
        final float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i3 = i2;
                final List<Float> list2 = list;
                final float f3 = coerceIn;
                final Function1<Float, Unit> function12 = function1;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(float f4) {
                        float coerceIn2;
                        int collectionSizeOrDefault;
                        Object next;
                        coerceIn2 = RangesKt___RangesKt.coerceIn(f4, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        float f5 = coerceIn2;
                        if (i3 > 0) {
                            List<Float> list3 = list2;
                            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = closedFloatingPointRange2;
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            for (Number number : list3) {
                                arrayList.add(Float.valueOf(MathHelpersKt.lerp(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), number.floatValue())));
                            }
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    float abs = Math.abs(((Number) next).floatValue() - coerceIn2);
                                    Object obj = next;
                                    do {
                                        Object next2 = it.next();
                                        float abs2 = Math.abs(((Number) next2).floatValue() - coerceIn2);
                                        next = obj;
                                        float f6 = abs;
                                        if (Float.compare(abs, abs2) > 0) {
                                            next = next2;
                                            f6 = abs2;
                                        }
                                        obj = next;
                                        abs = f6;
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Float f7 = (Float) next;
                            f5 = f7 == null ? coerceIn2 : f7.floatValue();
                        }
                        boolean z2 = true;
                        if (f5 == f3) {
                            z2 = false;
                        } else {
                            function12.invoke(Float.valueOf(f5));
                        }
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f4) {
                        return invoke(f4.floatValue());
                    }
                }, 1, null);
            }
        }, 1, null), f2, closedFloatingPointRange, i2);
    }

    public static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f2, List list, boolean z, Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, int i2, int i3, Object obj) {
        ClosedFloatingPointRange rangeTo;
        if ((i3 & 16) != 0) {
            rangeTo = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
            closedFloatingPointRange = rangeTo;
        }
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        return sliderSemantics(modifier, f2, list, z, function1, closedFloatingPointRange, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f2, List<Float> list, float f3, float f4) {
        Object next;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(MathHelpersKt.lerp(f3, f4, ((Number) next).floatValue()) - f2);
                Object obj = next;
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(MathHelpersKt.lerp(f3, f4, ((Number) next2).floatValue()) - f2);
                    next = obj;
                    float f5 = abs;
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        f5 = abs2;
                    }
                    obj = next;
                    abs = f5;
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Float f6 = (Float) next;
        if (f6 != null) {
            f2 = MathHelpersKt.lerp(f3, f4, f6.floatValue());
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    private static final List<Float> stepsToTickFractions(int i2) {
        ArrayList arrayList;
        ?? emptyList;
        if (i2 == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            arrayList = emptyList;
        } else {
            int i3 = i2 + 2;
            arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(Float.valueOf(i4 / (i2 + 1)));
            }
        }
        return arrayList;
    }
}
