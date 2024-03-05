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
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018��2\u00020\u00012\u00020\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eø\u0001��¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001c\u0010 \u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aH\u0016J)\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001c\u0010*\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0005\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R!\u0010\u0011\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "equals", "other", "", "hashCode", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/SizeModifier.class */
public final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    private SizeModifier(float f2, float f3, float f4, float f5, boolean z, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z;
    }

    public /* synthetic */ SizeModifier(float f2, float f3, float f4, float f5, boolean z, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.Companion.m4805getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m4805getUnspecifiedD9Ej5fM() : f3, (i2 & 4) != 0 ? Dp.Companion.m4805getUnspecifiedD9Ej5fM() : f4, (i2 & 8) != 0 ? Dp.Companion.m4805getUnspecifiedD9Ej5fM() : f5, z, function1, null);
    }

    public /* synthetic */ SizeModifier(float f2, float f3, float f4, float f5, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
        if (r13 != Integer.MAX_VALUE) goto L11;
     */
    /* renamed from: getTargetConstraints-OenEA2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m738getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r6) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeModifier.m738getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
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
        if (obj instanceof SizeModifier) {
            SizeModifier sizeModifier = (SizeModifier) obj;
            boolean z = false;
            if (Dp.m4790equalsimpl0(this.minWidth, sizeModifier.minWidth)) {
                z = false;
                if (Dp.m4790equalsimpl0(this.minHeight, sizeModifier.minHeight)) {
                    z = false;
                    if (Dp.m4790equalsimpl0(this.maxWidth, sizeModifier.maxWidth)) {
                        z = false;
                        if (Dp.m4790equalsimpl0(this.maxHeight, sizeModifier.maxHeight)) {
                            z = false;
                            if (this.enforceIncoming == sizeModifier.enforceIncoming) {
                                z = true;
                            }
                        }
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
        return ((((((Dp.m4791hashCodeimpl(this.minWidth) * 31) + Dp.m4791hashCodeimpl(this.minHeight)) * 31) + Dp.m4791hashCodeimpl(this.maxWidth)) * 31) + Dp.m4791hashCodeimpl(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m738getTargetConstraintsOenEA2s = m738getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m4749getHasFixedHeightimpl(m738getTargetConstraintsOenEA2s) ? Constraints.m4751getMaxHeightimpl(m738getTargetConstraintsOenEA2s) : ConstraintsKt.m4765constrainHeightK40F9xA(m738getTargetConstraintsOenEA2s, measurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m738getTargetConstraintsOenEA2s = m738getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m4750getHasFixedWidthimpl(m738getTargetConstraintsOenEA2s) ? Constraints.m4752getMaxWidthimpl(m738getTargetConstraintsOenEA2s) : ConstraintsKt.m4766constrainWidthK40F9xA(m738getTargetConstraintsOenEA2s, measurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        int coerceAtMost;
        int i2;
        int coerceAtLeast;
        int i3;
        int coerceAtMost2;
        int i4;
        int coerceAtLeast2;
        int i5;
        long Constraints;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m738getTargetConstraintsOenEA2s = m738getTargetConstraintsOenEA2s(receiver);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m4764constrainN9IONVI(j2, m738getTargetConstraintsOenEA2s);
        } else {
            float f2 = this.minWidth;
            Dp.Companion companion = Dp.Companion;
            if (Dp.m4790equalsimpl0(f2, companion.m4805getUnspecifiedD9Ej5fM())) {
                coerceAtMost = RangesKt___RangesKt.coerceAtMost(Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(m738getTargetConstraintsOenEA2s));
                i2 = coerceAtMost;
            } else {
                i2 = Constraints.m4754getMinWidthimpl(m738getTargetConstraintsOenEA2s);
            }
            if (Dp.m4790equalsimpl0(this.maxWidth, companion.m4805getUnspecifiedD9Ej5fM())) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Constraints.m4752getMaxWidthimpl(j2), Constraints.m4754getMinWidthimpl(m738getTargetConstraintsOenEA2s));
                i3 = coerceAtLeast;
            } else {
                i3 = Constraints.m4752getMaxWidthimpl(m738getTargetConstraintsOenEA2s);
            }
            if (Dp.m4790equalsimpl0(this.minHeight, companion.m4805getUnspecifiedD9Ej5fM())) {
                coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(m738getTargetConstraintsOenEA2s));
                i4 = coerceAtMost2;
            } else {
                i4 = Constraints.m4753getMinHeightimpl(m738getTargetConstraintsOenEA2s);
            }
            if (Dp.m4790equalsimpl0(this.maxHeight, companion.m4805getUnspecifiedD9Ej5fM())) {
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(Constraints.m4751getMaxHeightimpl(j2), Constraints.m4753getMinHeightimpl(m738getTargetConstraintsOenEA2s));
                i5 = coerceAtLeast2;
            } else {
                i5 = Constraints.m4751getMaxHeightimpl(m738getTargetConstraintsOenEA2s);
            }
            Constraints = ConstraintsKt.Constraints(i2, i3, i4, i5);
        }
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(Constraints);
        return MeasureScope.DefaultImpls.layout$default(receiver, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
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
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m738getTargetConstraintsOenEA2s = m738getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m4749getHasFixedHeightimpl(m738getTargetConstraintsOenEA2s) ? Constraints.m4751getMaxHeightimpl(m738getTargetConstraintsOenEA2s) : ConstraintsKt.m4765constrainHeightK40F9xA(m738getTargetConstraintsOenEA2s, measurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m738getTargetConstraintsOenEA2s = m738getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m4750getHasFixedWidthimpl(m738getTargetConstraintsOenEA2s) ? Constraints.m4752getMaxWidthimpl(m738getTargetConstraintsOenEA2s) : ConstraintsKt.m4766constrainWidthK40F9xA(m738getTargetConstraintsOenEA2s, measurable.minIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }
}
