package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��@\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010��\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/AlignmentLineKt.class */
public final class AlignmentLineKt {
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA */
    public static final MeasureResult m565alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f2, float f3, Measurable measurable, long j2) {
        final int coerceIn;
        final int coerceIn2;
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null) : Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
        int i2 = mo3910measureBRTryo0.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int height = getHorizontal(alignmentLine) ? mo3910measureBRTryo0.getHeight() : mo3910measureBRTryo0.getWidth();
        int m4751getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m4751getMaxHeightimpl(j2) : Constraints.m4752getMaxWidthimpl(j2);
        Dp.Companion companion = Dp.Companion;
        int mo518roundToPx0680j_4 = !Dp.m4790equalsimpl0(f2, companion.m4805getUnspecifiedD9Ej5fM()) ? measureScope.mo518roundToPx0680j_4(f2) : 0;
        int i3 = m4751getMaxHeightimpl - height;
        coerceIn = RangesKt___RangesKt.coerceIn(mo518roundToPx0680j_4 - i2, 0, i3);
        coerceIn2 = RangesKt___RangesKt.coerceIn(((!Dp.m4790equalsimpl0(f3, companion.m4805getUnspecifiedD9Ej5fM()) ? measureScope.mo518roundToPx0680j_4(f3) : 0) - height) + i2, 0, i3 - coerceIn);
        int width = getHorizontal(alignmentLine) ? mo3910measureBRTryo0.getWidth() : Math.max(mo3910measureBRTryo0.getWidth() + coerceIn + coerceIn2, Constraints.m4754getMinWidthimpl(j2));
        int max = getHorizontal(alignmentLine) ? Math.max(mo3910measureBRTryo0.getHeight() + coerceIn + coerceIn2, Constraints.m4753getMinHeightimpl(j2)) : mo3910measureBRTryo0.getHeight();
        final int i4 = width;
        final int i5 = max;
        return MeasureScope.DefaultImpls.layout$default(measureScope, width, max, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                boolean horizontal;
                int width2;
                boolean horizontal2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                horizontal = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                if (horizontal) {
                    width2 = 0;
                } else {
                    width2 = !Dp.m4790equalsimpl0(f2, Dp.Companion.m4805getUnspecifiedD9Ej5fM()) ? coerceIn : (i4 - coerceIn2) - mo3910measureBRTryo0.getWidth();
                }
                horizontal2 = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                Placeable.PlacementScope.placeRelative$default(layout, mo3910measureBRTryo0, width2, !horizontal2 ? 0 : !Dp.m4790equalsimpl0(f2, Dp.Companion.m4805getUnspecifiedD9Ej5fM()) ? coerceIn : (i5 - coerceIn2) - mo3910measureBRTryo0.getHeight(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-4j6BHR0 */
    public static final Modifier m566paddingFrom4j6BHR0(@NotNull Modifier paddingFrom, @NotNull final AlignmentLine alignmentLine, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetDp(alignmentLine, f2, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom_4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", AlignmentLine.this);
                inspectorInfo.getProperties().set("before", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("after", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default */
    public static /* synthetic */ Modifier m567paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m566paddingFrom4j6BHR0(modifier, alignmentLine, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-Y_r0B1c */
    public static final Modifier m568paddingFromY_r0B1c(@NotNull Modifier paddingFrom, @NotNull final AlignmentLine alignmentLine, final long j2, final long j3) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetTextUnit(alignmentLine, j2, j3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom_Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", AlignmentLine.this);
                inspectorInfo.getProperties().set("before", TextUnit.m4964boximpl(j2));
                inspectorInfo.getProperties().set("after", TextUnit.m4964boximpl(j3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default */
    public static /* synthetic */ Modifier m569paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = TextUnit.Companion.m4985getUnspecifiedXSAIIZE();
        }
        if ((i2 & 4) != 0) {
            j3 = TextUnit.Companion.m4985getUnspecifiedXSAIIZE();
        }
        return m568paddingFromY_r0B1c(modifier, alignmentLine, j2, j3);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-VpY3zN4 */
    public static final Modifier m570paddingFromBaselineVpY3zN4(@NotNull Modifier paddingFromBaseline, float f2, float f3) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.Companion;
        return paddingFromBaseline.then(!Dp.m4790equalsimpl0(f3, companion.m4805getUnspecifiedD9Ej5fM()) ? m567paddingFrom4j6BHR0$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f3, 2, null) : Modifier.Companion).then(!Dp.m4790equalsimpl0(f2, companion.m4805getUnspecifiedD9Ej5fM()) ? m567paddingFrom4j6BHR0$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f2, 0.0f, 4, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default */
    public static /* synthetic */ Modifier m571paddingFromBaselineVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m570paddingFromBaselineVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-wCyjxdI */
    public static final Modifier m572paddingFromBaselinewCyjxdI(@NotNull Modifier paddingFromBaseline, long j2, long j3) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.then(!TextUnitKt.m4992isUnspecifiedR2X_6o(j3) ? m569paddingFromY_r0B1c$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j3, 2, null) : Modifier.Companion).then(!TextUnitKt.m4992isUnspecifiedR2X_6o(j2) ? m569paddingFromY_r0B1c$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j2, 0L, 4, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default */
    public static /* synthetic */ Modifier m573paddingFromBaselinewCyjxdI$default(Modifier modifier, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = TextUnit.Companion.m4985getUnspecifiedXSAIIZE();
        }
        if ((i2 & 2) != 0) {
            j3 = TextUnit.Companion.m4985getUnspecifiedXSAIIZE();
        }
        return m572paddingFromBaselinewCyjxdI(modifier, j2, j3);
    }
}
