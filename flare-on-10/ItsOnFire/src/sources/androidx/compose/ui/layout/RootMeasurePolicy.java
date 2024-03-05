package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/RootMeasurePolicy.class */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    @NotNull
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo89measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
        MeasureResult layout$default;
        int m4766constrainWidthK40F9xA;
        int m4765constrainHeightK40F9xA;
        RootMeasurePolicy$measure$1 rootMeasurePolicy$measure$1;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            m4766constrainWidthK40F9xA = Constraints.m4754getMinWidthimpl(j2);
            m4765constrainHeightK40F9xA = Constraints.m4753getMinHeightimpl(j2);
            rootMeasurePolicy$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                }
            };
        } else if (measurables.size() != 1) {
            final ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(measurables.get(i2).mo3910measureBRTryo0(j2));
            }
            int size2 = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Placeable placeable = (Placeable) arrayList.get(i5);
                i3 = Math.max(placeable.getWidth(), i3);
                i4 = Math.max(placeable.getHeight(), i4);
            }
            layout$default = MeasureScope.DefaultImpls.layout$default(receiver, ConstraintsKt.m4766constrainWidthK40F9xA(j2, i3), ConstraintsKt.m4765constrainHeightK40F9xA(j2, i4), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
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
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    List<Placeable> list = arrayList;
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        Placeable.PlacementScope.placeRelativeWithLayer$default(layout, list.get(i6), 0, 0, 0.0f, null, 12, null);
                    }
                }
            }, 4, null);
            return layout$default;
        } else {
            final Placeable mo3910measureBRTryo0 = measurables.get(0).mo3910measureBRTryo0(j2);
            m4766constrainWidthK40F9xA = ConstraintsKt.m4766constrainWidthK40F9xA(j2, mo3910measureBRTryo0.getWidth());
            m4765constrainHeightK40F9xA = ConstraintsKt.m4765constrainHeightK40F9xA(j2, mo3910measureBRTryo0.getHeight());
            rootMeasurePolicy$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
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
                    Placeable.PlacementScope.placeRelativeWithLayer$default(layout, Placeable.this, 0, 0, 0.0f, null, 12, null);
                }
            };
        }
        layout$default = MeasureScope.DefaultImpls.layout$default(receiver, m4766constrainWidthK40F9xA, m4765constrainHeightK40F9xA, null, rootMeasurePolicy$measure$1, 4, null);
        return layout$default;
    }
}
