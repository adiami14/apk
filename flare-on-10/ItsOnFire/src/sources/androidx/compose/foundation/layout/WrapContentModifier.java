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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018��2\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012ø\u0001��¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J)\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n��R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004ø\u0001��¢\u0006\u0002\n��R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "direction", "Landroidx/compose/foundation/layout/Direction;", "unbounded", "", "alignmentCallback", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "align", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "equals", "other", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/WrapContentModifier.class */
public final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {
    @NotNull
    private final Object align;
    @NotNull
    private final Function2<IntSize, LayoutDirection, IntOffset> alignmentCallback;
    @NotNull
    private final Direction direction;
    private final boolean unbounded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentModifier(@NotNull Direction direction, boolean z, @NotNull Function2<? super IntSize, ? super LayoutDirection, IntOffset> alignmentCallback, @NotNull Object align, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = alignmentCallback;
        this.align = align;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WrapContentModifier) {
            WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
            boolean z = false;
            if (this.direction == wrapContentModifier.direction) {
                z = false;
                if (this.unbounded == wrapContentModifier.unbounded) {
                    z = false;
                    if (Intrinsics.areEqual(this.align, wrapContentModifier.align)) {
                        z = true;
                    }
                }
            }
            return z;
        }
        return false;
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
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
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
    public MeasureResult mo105measure3p2s80s(@NotNull final MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        final int coerceIn;
        final int coerceIn2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int i2 = 0;
        int m4754getMinWidthimpl = direction != direction2 ? 0 : Constraints.m4754getMinWidthimpl(j2);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i2 = Constraints.m4753getMinHeightimpl(j2);
        }
        int i3 = Integer.MAX_VALUE;
        int m4752getMaxWidthimpl = (this.direction == direction2 || !this.unbounded) ? Constraints.m4752getMaxWidthimpl(j2) : Integer.MAX_VALUE;
        if (this.direction == direction4 || !this.unbounded) {
            i3 = Constraints.m4751getMaxHeightimpl(j2);
        }
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(ConstraintsKt.Constraints(m4754getMinWidthimpl, m4752getMaxWidthimpl, i2, i3));
        coerceIn = RangesKt___RangesKt.coerceIn(mo3910measureBRTryo0.getWidth(), Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
        coerceIn2 = RangesKt___RangesKt.coerceIn(mo3910measureBRTryo0.getHeight(), Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
        return MeasureScope.DefaultImpls.layout$default(receiver, coerceIn, coerceIn2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.WrapContentModifier$measure$1
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
                Function2 function2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                function2 = WrapContentModifier.this.alignmentCallback;
                Placeable.PlacementScope.m3962place70tqf50$default(layout, mo3910measureBRTryo0, ((IntOffset) function2.invoke(IntSize.m4943boximpl(IntSizeKt.IntSize(coerceIn - mo3910measureBRTryo0.getWidth(), coerceIn2 - mo3910measureBRTryo0.getHeight())), receiver.getLayoutDirection())).m4916unboximpl(), 0.0f, 2, null);
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
