package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018��2\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J)\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/FillModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "direction", "Landroidx/compose/foundation/layout/Direction;", "fraction", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/layout/Direction;FLkotlin/jvm/functions/Function1;)V", "equals", "", "other", "", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/FillModifier.class */
public final class FillModifier extends InspectorValueInfo implements LayoutModifier {
    @NotNull
    private final Direction direction;
    private final float fraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillModifier(@NotNull Direction direction, float f2, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.direction = direction;
        this.fraction = f2;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        if ((r3.fraction == r0.fraction) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof androidx.compose.foundation.layout.FillModifier
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L3c
            r0 = r3
            androidx.compose.foundation.layout.Direction r0 = r0.direction
            r7 = r0
            r0 = r4
            androidx.compose.foundation.layout.FillModifier r0 = (androidx.compose.foundation.layout.FillModifier) r0
            r4 = r0
            r0 = r7
            r1 = r4
            androidx.compose.foundation.layout.Direction r1 = r1.direction
            if (r0 != r1) goto L3c
            r0 = r3
            float r0 = r0.fraction
            r1 = r4
            float r1 = r1.fraction
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = 1
            r8 = r0
            goto L34
        L31:
            r0 = 0
            r8 = r0
        L34:
            r0 = r8
            if (r0 == 0) goto L3c
            goto L3e
        L3c:
            r0 = 0
            r6 = r0
        L3e:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FillModifier.equals(java.lang.Object):boolean");
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        int m4754getMinWidthimpl;
        int m4752getMaxWidthimpl;
        int m4753getMinHeightimpl;
        int m4751getMaxHeightimpl;
        int roundToInt;
        int coerceIn;
        int roundToInt2;
        int coerceIn2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!Constraints.m4748getHasBoundedWidthimpl(j2) || this.direction == Direction.Vertical) {
            m4754getMinWidthimpl = Constraints.m4754getMinWidthimpl(j2);
            m4752getMaxWidthimpl = Constraints.m4752getMaxWidthimpl(j2);
        } else {
            roundToInt2 = MathKt__MathJVMKt.roundToInt(Constraints.m4752getMaxWidthimpl(j2) * this.fraction);
            coerceIn2 = RangesKt___RangesKt.coerceIn(roundToInt2, Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
            m4754getMinWidthimpl = coerceIn2;
            m4752getMaxWidthimpl = m4754getMinWidthimpl;
        }
        if (!Constraints.m4747getHasBoundedHeightimpl(j2) || this.direction == Direction.Horizontal) {
            m4753getMinHeightimpl = Constraints.m4753getMinHeightimpl(j2);
            m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(j2);
        } else {
            roundToInt = MathKt__MathJVMKt.roundToInt(Constraints.m4751getMaxHeightimpl(j2) * this.fraction);
            coerceIn = RangesKt___RangesKt.coerceIn(roundToInt, Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
            m4753getMinHeightimpl = coerceIn;
            m4751getMaxHeightimpl = m4753getMinHeightimpl;
        }
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(ConstraintsKt.Constraints(m4754getMinWidthimpl, m4752getMaxWidthimpl, m4753getMinHeightimpl, m4751getMaxHeightimpl));
        return MeasureScope.DefaultImpls.layout$default(receiver, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FillModifier$measure$1
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
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }
}
