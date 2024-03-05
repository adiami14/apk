package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
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
/* loaded from: ItsOnFire.jar:androidx/compose/material/SliderKt$Slider$3.class */
public final class SliderKt$Slider$3 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ SliderColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $value;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SliderKt$Slider$3$1.class */
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
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, float f2, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$$dirty = i2;
        this.$value = f2;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3, float f4) {
        float scale;
        scale = SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f4, f2, f3);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(float f2, float f3, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f4) {
        float scale;
        scale = SliderKt.scale(f2, f3, f4, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x015f, code lost:
        if (r13 == r0.getEmpty()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0251, code lost:
        if (r0 == r0.getEmpty()) goto L34;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.BoxWithConstraintsScope r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$Slider$3.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
