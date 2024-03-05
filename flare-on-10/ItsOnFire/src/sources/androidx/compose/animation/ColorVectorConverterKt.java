package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��>\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n\u0002\b\u0005\u001a0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0002\"8\u0010��\u001a)\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n��\"?\u0010\f\u001a)\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0001*\u00020\r8Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"ColorToVector", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", "name", "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "InverseM1", "", "M1", "VectorConverter", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;", "multiplyColumn", "", "column", "", "x", "y", "z", "matrix", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/ColorVectorConverterKt.class */
public final class ColorVectorConverterKt {
    @NotNull
    private static final Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> ColorToVector = new Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final TwoWayConverter<Color, AnimationVector4D> invoke(@NotNull final ColorSpace colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            return VectorConvertersKt.TwoWayConverter(new Function1<Color, AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
                    return m134invoke8_81llA(color.m2424unboximpl());
                }

                @NotNull
                /* renamed from: invoke-8_81llA  reason: not valid java name */
                public final AnimationVector4D m134invoke8_81llA(long j2) {
                    float[] fArr;
                    float multiplyColumn;
                    float[] fArr2;
                    float multiplyColumn2;
                    float[] fArr3;
                    float multiplyColumn3;
                    long m2411convertvNxB06k = Color.m2411convertvNxB06k(j2, ColorSpaces.INSTANCE.getCieXyz());
                    float m2420getRedimpl = Color.m2420getRedimpl(m2411convertvNxB06k);
                    float m2419getGreenimpl = Color.m2419getGreenimpl(m2411convertvNxB06k);
                    float m2417getBlueimpl = Color.m2417getBlueimpl(m2411convertvNxB06k);
                    fArr = ColorVectorConverterKt.M1;
                    multiplyColumn = ColorVectorConverterKt.multiplyColumn(0, m2420getRedimpl, m2419getGreenimpl, m2417getBlueimpl, fArr);
                    double d2 = multiplyColumn;
                    double d3 = 0.33333334f;
                    float pow = (float) Math.pow(d2, d3);
                    fArr2 = ColorVectorConverterKt.M1;
                    multiplyColumn2 = ColorVectorConverterKt.multiplyColumn(1, m2420getRedimpl, m2419getGreenimpl, m2417getBlueimpl, fArr2);
                    float pow2 = (float) Math.pow(multiplyColumn2, d3);
                    fArr3 = ColorVectorConverterKt.M1;
                    multiplyColumn3 = ColorVectorConverterKt.multiplyColumn(2, m2420getRedimpl, m2419getGreenimpl, m2417getBlueimpl, fArr3);
                    return new AnimationVector4D(Color.m2416getAlphaimpl(j2), pow, pow2, (float) Math.pow(multiplyColumn3, d3));
                }
            }, new Function1<AnimationVector4D, Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
                    return Color.m2404boximpl(m135invokevNxB06k(animationVector4D));
                }

                /* renamed from: invoke-vNxB06k  reason: not valid java name */
                public final long m135invokevNxB06k(@NotNull AnimationVector4D it) {
                    float[] fArr;
                    float multiplyColumn;
                    float[] fArr2;
                    float multiplyColumn2;
                    float[] fArr3;
                    float multiplyColumn3;
                    float coerceIn;
                    float coerceIn2;
                    float coerceIn3;
                    float coerceIn4;
                    Intrinsics.checkNotNullParameter(it, "it");
                    double d2 = 3.0f;
                    float pow = (float) Math.pow(it.getV2(), d2);
                    float pow2 = (float) Math.pow(it.getV3(), d2);
                    float pow3 = (float) Math.pow(it.getV4(), d2);
                    fArr = ColorVectorConverterKt.InverseM1;
                    multiplyColumn = ColorVectorConverterKt.multiplyColumn(0, pow, pow2, pow3, fArr);
                    fArr2 = ColorVectorConverterKt.InverseM1;
                    multiplyColumn2 = ColorVectorConverterKt.multiplyColumn(1, pow, pow2, pow3, fArr2);
                    fArr3 = ColorVectorConverterKt.InverseM1;
                    multiplyColumn3 = ColorVectorConverterKt.multiplyColumn(2, pow, pow2, pow3, fArr3);
                    coerceIn = RangesKt___RangesKt.coerceIn(it.getV1(), 0.0f, 1.0f);
                    coerceIn2 = RangesKt___RangesKt.coerceIn(multiplyColumn, -2.0f, 2.0f);
                    coerceIn3 = RangesKt___RangesKt.coerceIn(multiplyColumn2, -2.0f, 2.0f);
                    coerceIn4 = RangesKt___RangesKt.coerceIn(multiplyColumn3, -2.0f, 2.0f);
                    return Color.m2411convertvNxB06k(ColorKt.Color(coerceIn2, coerceIn3, coerceIn4, coerceIn, ColorSpaces.INSTANCE.getCieXyz()), ColorSpace.this);
                }
            });
        }
    };
    @NotNull
    private static final float[] M1 = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    @NotNull
    private static final float[] InverseM1 = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    @NotNull
    public static final Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(@NotNull Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ColorToVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float multiplyColumn(int i2, float f2, float f3, float f4, float[] fArr) {
        return (f2 * fArr[i2]) + (f3 * fArr[i2 + 3]) + (f4 * fArr[i2 + 6]);
    }
}
