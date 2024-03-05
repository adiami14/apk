package androidx.compose.foundation;

import androidx.compose.foundation.gestures.OverScrollController;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018��2\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u001c\u0010\u001b\u001a\u00020\u0018*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u001c\u0010 \u001a\u00020\u0018*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0016J)\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010*\u001a\u00020\u0018*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u001c\u0010+\u001a\u00020\u0018*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "scrollerState", "Landroidx/compose/foundation/ScrollState;", "isReversed", "", "isVertical", "overScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "(Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/foundation/gestures/OverScrollController;)V", "()Z", "getOverScrollController", "()Landroidx/compose/foundation/gestures/OverScrollController;", "getScrollerState", "()Landroidx/compose/foundation/ScrollState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/ScrollingLayoutModifier.class */
public final class ScrollingLayoutModifier implements LayoutModifier {
    private final boolean isReversed;
    private final boolean isVertical;
    @NotNull
    private final OverScrollController overScrollController;
    @NotNull
    private final ScrollState scrollerState;

    public ScrollingLayoutModifier(@NotNull ScrollState scrollerState, boolean z, boolean z2, @NotNull OverScrollController overScrollController) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        Intrinsics.checkNotNullParameter(overScrollController, "overScrollController");
        this.scrollerState = scrollerState;
        this.isReversed = z;
        this.isVertical = z2;
        this.overScrollController = overScrollController;
    }

    public static /* synthetic */ ScrollingLayoutModifier copy$default(ScrollingLayoutModifier scrollingLayoutModifier, ScrollState scrollState, boolean z, boolean z2, OverScrollController overScrollController, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scrollState = scrollingLayoutModifier.scrollerState;
        }
        if ((i2 & 2) != 0) {
            z = scrollingLayoutModifier.isReversed;
        }
        if ((i2 & 4) != 0) {
            z2 = scrollingLayoutModifier.isVertical;
        }
        if ((i2 & 8) != 0) {
            overScrollController = scrollingLayoutModifier.overScrollController;
        }
        return scrollingLayoutModifier.copy(scrollState, z, z2, overScrollController);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    @NotNull
    public final ScrollState component1() {
        return this.scrollerState;
    }

    public final boolean component2() {
        return this.isReversed;
    }

    public final boolean component3() {
        return this.isVertical;
    }

    @NotNull
    public final OverScrollController component4() {
        return this.overScrollController;
    }

    @NotNull
    public final ScrollingLayoutModifier copy(@NotNull ScrollState scrollerState, boolean z, boolean z2, @NotNull OverScrollController overScrollController) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        Intrinsics.checkNotNullParameter(overScrollController, "overScrollController");
        return new ScrollingLayoutModifier(scrollerState, z, z2, overScrollController);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollingLayoutModifier) {
            ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
            return Intrinsics.areEqual(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical && Intrinsics.areEqual(this.overScrollController, scrollingLayoutModifier.overScrollController);
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

    @NotNull
    public final OverScrollController getOverScrollController() {
        return this.overScrollController;
    }

    @NotNull
    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    public int hashCode() {
        int hashCode = this.scrollerState.hashCode();
        boolean z = this.isReversed;
        int i2 = 1;
        int i3 = z ? 1 : 0;
        if (z) {
            i3 = 1;
        }
        boolean z2 = this.isVertical;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return (((((hashCode * 31) + i3) * 31) + i2) * 31) + this.overScrollController.hashCode();
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        int coerceAtMost;
        int coerceAtMost2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ScrollKt.m425assertNotNestingScrollableContainersK40F9xA(j2, this.isVertical);
        int i2 = Integer.MAX_VALUE;
        int m4751getMaxHeightimpl = this.isVertical ? Integer.MAX_VALUE : Constraints.m4751getMaxHeightimpl(j2);
        if (this.isVertical) {
            i2 = Constraints.m4752getMaxWidthimpl(j2);
        }
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(Constraints.m4743copyZbe2FdA$default(j2, 0, i2, 0, m4751getMaxHeightimpl, 5, null));
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(mo3910measureBRTryo0.getWidth(), Constraints.m4752getMaxWidthimpl(j2));
        coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(mo3910measureBRTryo0.getHeight(), Constraints.m4751getMaxHeightimpl(j2));
        int height = mo3910measureBRTryo0.getHeight() - coerceAtMost2;
        int width = mo3910measureBRTryo0.getWidth();
        if (!this.isVertical) {
            height = width - coerceAtMost;
        }
        this.overScrollController.mo441refreshContainerInfoTmRCtEA(SizeKt.Size(coerceAtMost, coerceAtMost2), height != 0);
        final int i3 = height;
        return MeasureScope.DefaultImpls.layout$default(receiver, coerceAtMost, coerceAtMost2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ScrollingLayoutModifier$measure$1
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
                int coerceIn;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                ScrollingLayoutModifier.this.getScrollerState().setMaxValue$foundation_release(i3);
                coerceIn = RangesKt___RangesKt.coerceIn(ScrollingLayoutModifier.this.getScrollerState().getValue(), 0, i3);
                int i4 = ScrollingLayoutModifier.this.isReversed() ? coerceIn - i3 : -coerceIn;
                int i5 = ScrollingLayoutModifier.this.isVertical() ? 0 : i4;
                if (!ScrollingLayoutModifier.this.isVertical()) {
                    i4 = 0;
                }
                Placeable.PlacementScope.placeRelativeWithLayer$default(layout, mo3910measureBRTryo0, i5, i4, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    @NotNull
    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.scrollerState + ", isReversed=" + this.isReversed + ", isVertical=" + this.isVertical + ", overScrollController=" + this.overScrollController + ')';
    }
}
