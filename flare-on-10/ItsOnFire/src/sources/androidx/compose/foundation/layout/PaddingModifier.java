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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018��2\u00020\u00012\u00020\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eø\u0001��¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "rtlAware", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM", "getRtlAware", "()Z", "getStart-D9Ej5fM", "getTop-D9Ej5fM", "equals", "other", "", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/PaddingModifier.class */
public final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float bottom;
    private final float end;
    private final boolean rtlAware;
    private final float start;
    private final float top;

    private PaddingModifier(float f2, float f3, float f4, float f5, boolean z, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        this.rtlAware = z;
        if (!((m683getStartD9Ej5fM() >= 0.0f || Dp.m4790equalsimpl0(m683getStartD9Ej5fM(), Dp.Companion.m4805getUnspecifiedD9Ej5fM())) && (m684getTopD9Ej5fM() >= 0.0f || Dp.m4790equalsimpl0(m684getTopD9Ej5fM(), Dp.Companion.m4805getUnspecifiedD9Ej5fM())) && ((m682getEndD9Ej5fM() >= 0.0f || Dp.m4790equalsimpl0(m682getEndD9Ej5fM(), Dp.Companion.m4805getUnspecifiedD9Ej5fM())) && (m681getBottomD9Ej5fM() >= 0.0f || Dp.m4790equalsimpl0(m681getBottomD9Ej5fM(), Dp.Companion.m4805getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ PaddingModifier(float f2, float f3, float f4, float f5, boolean z, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.m4785constructorimpl(0) : f2, (i2 & 2) != 0 ? Dp.m4785constructorimpl(0) : f3, (i2 & 4) != 0 ? Dp.m4785constructorimpl(0) : f4, (i2 & 8) != 0 ? Dp.m4785constructorimpl(0) : f5, z, function1, null);
    }

    public /* synthetic */ PaddingModifier(float f2, float f3, float f4, float f5, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z, function1);
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
        PaddingModifier paddingModifier = obj instanceof PaddingModifier ? (PaddingModifier) obj : null;
        if (paddingModifier == null) {
            return false;
        }
        boolean z = false;
        if (Dp.m4790equalsimpl0(m683getStartD9Ej5fM(), paddingModifier.m683getStartD9Ej5fM())) {
            z = false;
            if (Dp.m4790equalsimpl0(m684getTopD9Ej5fM(), paddingModifier.m684getTopD9Ej5fM())) {
                z = false;
                if (Dp.m4790equalsimpl0(m682getEndD9Ej5fM(), paddingModifier.m682getEndD9Ej5fM())) {
                    z = false;
                    if (Dp.m4790equalsimpl0(m681getBottomD9Ej5fM(), paddingModifier.m681getBottomD9Ej5fM())) {
                        z = false;
                        if (this.rtlAware == paddingModifier.rtlAware) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m681getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM  reason: not valid java name */
    public final float m682getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m683getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m684getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((((Dp.m4791hashCodeimpl(m683getStartD9Ej5fM()) * 31) + Dp.m4791hashCodeimpl(m684getTopD9Ej5fM())) * 31) + Dp.m4791hashCodeimpl(m682getEndD9Ej5fM())) * 31) + Dp.m4791hashCodeimpl(m681getBottomD9Ej5fM())) * 31) + Boolean.hashCode(this.rtlAware);
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
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int mo518roundToPx0680j_4 = receiver.mo518roundToPx0680j_4(m683getStartD9Ej5fM()) + receiver.mo518roundToPx0680j_4(m682getEndD9Ej5fM());
        int mo518roundToPx0680j_42 = receiver.mo518roundToPx0680j_4(m684getTopD9Ej5fM()) + receiver.mo518roundToPx0680j_4(m681getBottomD9Ej5fM());
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(ConstraintsKt.m4768offsetNN6EwU(j2, -mo518roundToPx0680j_4, -mo518roundToPx0680j_42));
        return MeasureScope.DefaultImpls.layout$default(receiver, ConstraintsKt.m4766constrainWidthK40F9xA(j2, mo3910measureBRTryo0.getWidth() + mo518roundToPx0680j_4), ConstraintsKt.m4765constrainHeightK40F9xA(j2, mo3910measureBRTryo0.getHeight() + mo518roundToPx0680j_42), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
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
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                boolean rtlAware = PaddingModifier.this.getRtlAware();
                Placeable placeable = mo3910measureBRTryo0;
                if (rtlAware) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, receiver.mo518roundToPx0680j_4(PaddingModifier.this.m683getStartD9Ej5fM()), receiver.mo518roundToPx0680j_4(PaddingModifier.this.m684getTopD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(layout, placeable, receiver.mo518roundToPx0680j_4(PaddingModifier.this.m683getStartD9Ej5fM()), receiver.mo518roundToPx0680j_4(PaddingModifier.this.m684getTopD9Ej5fM()), 0.0f, 4, null);
                }
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
