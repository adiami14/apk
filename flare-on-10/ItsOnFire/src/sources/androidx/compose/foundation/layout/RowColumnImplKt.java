package androidx.compose.foundation.layout;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��p\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001ad\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u001aE\u0010#\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u001at\u0010%\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002\u001aa\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u00172*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002010-2\u0006\u00102\u001a\u0002032\u0006\u0010 \u001a\u0002042\u0006\u0010��\u001a\u00020\u0001H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b5\u00106\"\u001c\u0010��\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f\"\u001a\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "fill", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "isRelative", ActivityChooserModel.ATTRIBUTE_WEIGHT, "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "MaxIntrinsicHeightMeasureBlock", "Lkotlin/Function3;", "", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "MaxIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MinIntrinsicWidthMeasureBlock", "intrinsicCrossAxisSize", "children", "mainAxisSize", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "intrinsicMainAxisSize", "crossAxisAvailable", "intrinsicSize", "intrinsicMainSize", "intrinsicCrossSize", "layoutOrientation", "intrinsicOrientation", "rowColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "arrangement", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/foundation/layout/SizeMode;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/RowColumnImplKt.class */
public final class RowColumnImplKt {
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    public static final /* synthetic */ int access$intrinsicSize(List list, Function2 function2, Function2 function22, int i2, int i3, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return intrinsicSize(list, function2, function22, i2, i3, layoutOrientation, layoutOrientation2);
    }

    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        return rowColumnParentData == null ? null : rowColumnParentData.getCrossAxisAlignment();
    }

    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        return parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
    }

    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        return rowColumnParentData == null ? true : rowColumnParentData.getFill();
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        return rowColumnParentData == null ? 0.0f : rowColumnParentData.getWeight();
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i2, int i3) {
        int roundToInt;
        int i4;
        int i5;
        int roundToInt2;
        float f2;
        int i6;
        int i7;
        int min = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        float f3 = 0.0f;
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            float weight = getWeight(getData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(function2.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i2 - min);
                i7 = min + min2;
                i6 = Math.max(i9, function22.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
                f2 = f3;
            } else {
                f2 = f3;
                i6 = i9;
                i7 = min;
                if (weight > 0.0f) {
                    f2 = f3 + weight;
                    i7 = min;
                    i6 = i9;
                }
            }
            i8++;
            f3 = f2;
            i9 = i6;
            min = i7;
        }
        if (f3 == 0.0f) {
            i4 = 0;
        } else if (i2 == Integer.MAX_VALUE) {
            i4 = Integer.MAX_VALUE;
        } else {
            roundToInt = MathKt__MathJVMKt.roundToInt(Math.max(i2 - min, 0) / f3);
            i4 = roundToInt;
        }
        int size2 = list.size();
        int i10 = 0;
        while (i10 < size2) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i10);
            float weight2 = getWeight(getData(intrinsicMeasurable2));
            int i11 = i9;
            if (weight2 > 0.0f) {
                if (i4 != Integer.MAX_VALUE) {
                    roundToInt2 = MathKt__MathJVMKt.roundToInt(i4 * weight2);
                    i5 = roundToInt2;
                } else {
                    i5 = Integer.MAX_VALUE;
                }
                i11 = Math.max(i9, function22.invoke(intrinsicMeasurable2, Integer.valueOf(i5)).intValue());
            }
            i10++;
            i9 = i11;
        }
        return i9;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, int i2, int i3) {
        int roundToInt;
        int i4;
        float f2;
        int i5;
        int roundToInt2;
        int size = list.size();
        float f3 = 0.0f;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z = true;
            if (i8 >= size) {
                roundToInt = MathKt__MathJVMKt.roundToInt(i7 * f3);
                return roundToInt + i6 + ((list.size() - 1) * i3);
            }
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            float weight = getWeight(getData(intrinsicMeasurable));
            int intValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue();
            if (weight != 0.0f) {
                z = false;
            }
            if (z) {
                i5 = i6 + intValue;
                i4 = i7;
                f2 = f3;
            } else {
                i4 = i7;
                f2 = f3;
                i5 = i6;
                if (weight > 0.0f) {
                    f2 = f3 + weight;
                    roundToInt2 = MathKt__MathJVMKt.roundToInt(intValue / weight);
                    i4 = Math.max(i7, roundToInt2);
                    i5 = i6;
                }
            }
            i8++;
            i7 = i4;
            f3 = f2;
            i6 = i5;
        }
    }

    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i2, int i3, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? intrinsicMainAxisSize(list, function2, i2, i3) : intrinsicCrossAxisSize(list, function22, function2, i2, i3);
    }

    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        return crossAxisAlignment == null ? false : crossAxisAlignment.isRelative$foundation_layout_release();
    }

    @NotNull
    /* renamed from: rowColumnMeasurePolicy-TDGSqEk */
    public static final MeasurePolicy m705rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation orientation, @NotNull final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, final float f2, @NotNull final SizeMode crossAxisSize, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MaxIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo518roundToPx0680j_4(f2)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MaxIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo518roundToPx0680j_4(f2)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo89measure3p2s80s(@NotNull final MeasureScope receiver, @NotNull final List<? extends Measurable> measurables, long j2) {
                int i2;
                int coerceAtMost;
                int i3;
                boolean z;
                float weight;
                int sign;
                int roundToInt;
                boolean fill;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
                boolean z2;
                boolean isRelative;
                float weight2;
                int roundToInt2;
                int i4;
                CrossAxisAlignment crossAxisAlignment2;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3;
                float weight3;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4;
                boolean isRelative2;
                RowColumnParentData data;
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j2, LayoutOrientation.this, null);
                int mo518roundToPx0680j_4 = receiver.mo518roundToPx0680j_4(f2);
                int size = measurables.size();
                final Placeable[] placeableArr = new Placeable[size];
                int size2 = measurables.size();
                final RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size2];
                for (int i5 = 0; i5 < size2; i5++) {
                    data = RowColumnImplKt.getData(measurables.get(i5));
                    rowColumnParentDataArr[i5] = data;
                }
                int size3 = measurables.size();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                boolean z3 = false;
                float f3 = 0.0f;
                int i10 = 0;
                while (i8 < size3) {
                    int i11 = i8 + 1;
                    Measurable measurable = measurables.get(i8);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr[i8];
                    weight3 = RowColumnImplKt.getWeight(rowColumnParentData);
                    if (weight3 > 0.0f) {
                        f3 += weight3;
                        i10++;
                    } else {
                        int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                        Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax == Integer.MAX_VALUE ? Integer.MAX_VALUE : mainAxisMax - i9, 0, 0, 8, null).m668toBoxConstraintsOenEA2s(LayoutOrientation.this));
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo3910measureBRTryo0, LayoutOrientation.this);
                        i6 = Math.min(mo518roundToPx0680j_4, (mainAxisMax - i9) - rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2);
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo3910measureBRTryo0, LayoutOrientation.this);
                        i9 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 + i6;
                        rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo3910measureBRTryo0, LayoutOrientation.this);
                        i7 = Math.max(i7, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4);
                        if (!z3) {
                            isRelative2 = RowColumnImplKt.isRelative(rowColumnParentData);
                            if (!isRelative2) {
                                z3 = false;
                                placeableArr[i8] = mo3910measureBRTryo0;
                            }
                        }
                        z3 = true;
                        placeableArr[i8] = mo3910measureBRTryo0;
                    }
                    i8 = i11;
                }
                if (i10 == 0) {
                    i9 -= i6;
                    i3 = 0;
                    z = z3;
                } else {
                    int i12 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                    int mainAxisMin = (i12 <= 0 || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints.getMainAxisMin() : orientationIndependentConstraints.getMainAxisMax();
                    int i13 = mo518roundToPx0680j_4 * (i10 - 1);
                    int i14 = (mainAxisMin - i9) - i13;
                    float f4 = i12 > 0 ? i14 / f3 : 0.0f;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        i2 = i16;
                        if (i15 >= size2) {
                            break;
                        }
                        i15++;
                        weight2 = RowColumnImplKt.getWeight(rowColumnParentDataArr[i15]);
                        roundToInt2 = MathKt__MathJVMKt.roundToInt(weight2 * f4);
                        i16 = i2 + roundToInt2;
                    }
                    int size4 = measurables.size();
                    int i17 = i14 - i2;
                    int i18 = i7;
                    int i19 = 0;
                    int i20 = 0;
                    boolean z4 = z3;
                    int i21 = i18;
                    while (i19 < size4) {
                        int i22 = i19 + 1;
                        if (placeableArr[i19] == null) {
                            Measurable measurable2 = measurables.get(i19);
                            RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr[i19];
                            weight = RowColumnImplKt.getWeight(rowColumnParentData2);
                            if (!(weight > 0.0f)) {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                            sign = MathKt__MathJVMKt.getSign(i17);
                            roundToInt = MathKt__MathJVMKt.roundToInt(weight * f4);
                            int max = Math.max(0, roundToInt + sign);
                            fill = RowColumnImplKt.getFill(rowColumnParentData2);
                            Placeable mo3910measureBRTryo02 = measurable2.mo3910measureBRTryo0(new OrientationIndependentConstraints((!fill || max == Integer.MAX_VALUE) ? 0 : max, max, 0, orientationIndependentConstraints.getCrossAxisMax()).m668toBoxConstraintsOenEA2s(LayoutOrientation.this));
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo3910measureBRTryo02, LayoutOrientation.this);
                            i20 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo3910measureBRTryo02, LayoutOrientation.this);
                            i21 = Math.max(i21, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize);
                            if (!z4) {
                                isRelative = RowColumnImplKt.isRelative(rowColumnParentData2);
                                if (!isRelative) {
                                    z2 = false;
                                    z4 = z2;
                                    placeableArr[i19] = mo3910measureBRTryo02;
                                    i19 = i22;
                                    i17 -= sign;
                                }
                            }
                            z2 = true;
                            z4 = z2;
                            placeableArr[i19] = mo3910measureBRTryo02;
                            i19 = i22;
                            i17 -= sign;
                        } else {
                            i19 = i22;
                        }
                    }
                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(i20 + i13, orientationIndependentConstraints.getMainAxisMax() - i9);
                    i3 = coerceAtMost;
                    z = z4;
                    i7 = i21;
                }
                final Ref.IntRef intRef = new Ref.IntRef();
                if (z) {
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        int i25 = i24;
                        i4 = i25;
                        if (i23 >= size) {
                            break;
                        }
                        Placeable placeable = placeableArr[i23];
                        Intrinsics.checkNotNull(placeable);
                        crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr[i23]);
                        Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 == null ? null : crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable);
                        int i26 = i25;
                        if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                            int i27 = intRef.element;
                            int intValue = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (intValue == Integer.MIN_VALUE) {
                                intValue = 0;
                            }
                            intRef.element = Math.max(i27, intValue);
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, LayoutOrientation.this);
                            LayoutOrientation layoutOrientation = LayoutOrientation.this;
                            int intValue2 = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (intValue2 == Integer.MIN_VALUE) {
                                rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                                intValue2 = rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3;
                            }
                            i26 = Math.max(i25, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 - intValue2);
                        }
                        i23++;
                        i24 = i26;
                    }
                } else {
                    i4 = 0;
                }
                final int max2 = Math.max(i9 + i3, orientationIndependentConstraints.getMainAxisMin());
                int max3 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || crossAxisSize != SizeMode.Expand) ? Math.max(i7, Math.max(orientationIndependentConstraints.getCrossAxisMin(), intRef.element + i4)) : orientationIndependentConstraints.getCrossAxisMax();
                LayoutOrientation layoutOrientation2 = LayoutOrientation.this;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                int i28 = layoutOrientation2 == layoutOrientation3 ? max2 : max3;
                int i29 = layoutOrientation2 == layoutOrientation3 ? max3 : max2;
                int size5 = measurables.size();
                final int[] iArr = new int[size5];
                for (int i30 = 0; i30 < size5; i30++) {
                    iArr[i30] = 0;
                }
                final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = arrangement;
                final LayoutOrientation layoutOrientation4 = LayoutOrientation.this;
                final CrossAxisAlignment crossAxisAlignment3 = crossAxisAlignment;
                final int i31 = max3;
                return MeasureScope.DefaultImpls.layout$default(receiver, i28, i29, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        CrossAxisAlignment crossAxisAlignment4;
                        int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize5;
                        int i32;
                        int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        int size6 = measurables.size();
                        int[] iArr2 = new int[size6];
                        int i33 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            Placeable placeable2 = placeableArr[i34];
                            Intrinsics.checkNotNull(placeable2);
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeable2, layoutOrientation4);
                            iArr2[i34] = rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4;
                        }
                        function5.invoke(Integer.valueOf(max2), iArr2, receiver.getLayoutDirection(), receiver, iArr);
                        Placeable[] placeableArr2 = placeableArr;
                        RowColumnParentData[] rowColumnParentDataArr2 = rowColumnParentDataArr;
                        CrossAxisAlignment crossAxisAlignment5 = crossAxisAlignment3;
                        int i35 = i31;
                        LayoutOrientation layoutOrientation5 = layoutOrientation4;
                        MeasureScope measureScope = receiver;
                        Ref.IntRef intRef2 = intRef;
                        int[] iArr3 = iArr;
                        int length = placeableArr2.length;
                        int i36 = 0;
                        while (i33 < length) {
                            Placeable placeable3 = placeableArr2[i33];
                            Intrinsics.checkNotNull(placeable3);
                            crossAxisAlignment4 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr2[i36]);
                            CrossAxisAlignment crossAxisAlignment6 = crossAxisAlignment4;
                            if (crossAxisAlignment4 == null) {
                                crossAxisAlignment6 = crossAxisAlignment5;
                            }
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize5 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable3, layoutOrientation5);
                            LayoutOrientation layoutOrientation6 = LayoutOrientation.Horizontal;
                            int align$foundation_layout_release = crossAxisAlignment6.align$foundation_layout_release(i35 - rowColumnMeasurePolicy_TDGSqEk$crossAxisSize5, layoutOrientation5 == layoutOrientation6 ? LayoutDirection.Ltr : measureScope.getLayoutDirection(), placeable3, intRef2.element);
                            if (layoutOrientation5 == layoutOrientation6) {
                                i32 = iArr3[i36];
                            } else {
                                i32 = align$foundation_layout_release;
                                align$foundation_layout_release = iArr3[i36];
                            }
                            Placeable.PlacementScope.place$default(layout, placeable3, i32, align$foundation_layout_release, 0.0f, 4, null);
                            i33++;
                            i36++;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MinIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo518roundToPx0680j_4(f2)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MinIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo518roundToPx0680j_4(f2)))).intValue();
            }
        };
    }

    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }
}
