package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SliderKt$RangeSlider$2.class */
public final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ SliderColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $endInteractionSource;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    public final /* synthetic */ MutableInteractionSource $startInteractionSource;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $values;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SliderKt$RangeSlider$2$1.class */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ float $minPx;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = f2;
            this.$maxPx = f3;
        }

        @NotNull
        public final Float invoke(float f2) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SliderKt$RangeSlider$2$2.class */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Float, Float> {
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ float $minPx;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = f2;
            this.$maxPx = f3;
        }

        @NotNull
        public final Float invoke(float f2) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2, Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, List<Float> list, SliderColors sliderColors, Function0<Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$values = closedFloatingPointRange2;
        this.$$dirty = i2;
        this.$modifier = modifier;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$onValueChangeState = state;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeFinished = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3, float f4) {
        float scale;
        scale = SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f4, f2, f3);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(float f2, float f3, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        ClosedFloatingPointRange<Float> scale;
        scale = SliderKt.scale(f2, f3, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x02a0, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L38;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.BoxWithConstraintsScope r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, int r17) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$RangeSlider$2.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
