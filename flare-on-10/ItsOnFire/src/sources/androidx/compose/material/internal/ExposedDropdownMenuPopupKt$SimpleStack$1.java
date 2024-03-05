package androidx.compose.material.internal;

import androidx.appcompat.R;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/internal/ExposedDropdownMenuPopupKt$SimpleStack$1.class */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopupKt$SimpleStack$1 INSTANCE = new ExposedDropdownMenuPopupKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo89measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
        int i2;
        int i3;
        Function1 function1;
        MeasureResult layout$default;
        int lastIndex;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i6 = 0;
            if (size != 1) {
                final ArrayList arrayList = new ArrayList(measurables.size());
                int size2 = measurables.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    arrayList.add(measurables.get(i7).mo3910measureBRTryo0(j2));
                }
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (lastIndex >= 0) {
                    i4 = 0;
                    i5 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i6);
                        i4 = Math.max(i4, placeable.getWidth());
                        i5 = Math.max(i5, placeable.getHeight());
                        if (i6 == lastIndex) {
                            break;
                        }
                        i6++;
                    }
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                layout$default = MeasureScope.DefaultImpls.layout$default(Layout, i4, i5, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3
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
                        int lastIndex2;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        if (lastIndex2 < 0) {
                            return;
                        }
                        int i8 = 0;
                        while (true) {
                            Placeable.PlacementScope.placeRelative$default(layout, arrayList.get(i8), 0, 0, 0.0f, 4, null);
                            if (i8 == lastIndex2) {
                                return;
                            }
                            i8++;
                        }
                    }
                }, 4, null);
                return layout$default;
            }
            final Placeable mo3910measureBRTryo0 = measurables.get(0).mo3910measureBRTryo0(j2);
            i2 = mo3910measureBRTryo0.getWidth();
            i3 = mo3910measureBRTryo0.getHeight();
            function1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2
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
            };
        } else {
            i2 = 0;
            i3 = 0;
            function1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1
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
        }
        layout$default = MeasureScope.DefaultImpls.layout$default(Layout, i2, i3, null, function1, 4, null);
        return layout$default;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
