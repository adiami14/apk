package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0086\u0001\n��\n\u0002\u0010!\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ax\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001aØ\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+¢\u0006\u0002\b.\u0012\u0004\u0012\u00020/0*H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "measureLazyList", "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "itemsCount", "itemProvider", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "firstVisibleItemIndex", "Landroidx/compose/foundation/lazy/list/DataIndex;", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "placementAnimator", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-wroFCeY", "(ILandroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListMeasureKt.class */
public final class LazyListMeasureKt {
    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, int i2, int i3, int i4, int i5, int i6, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LayoutDirection layoutDirection) {
        int i7 = z ? i3 : i2;
        boolean z3 = i4 < Math.min(i7, i5);
        if (z3) {
            if (!(i6 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (z3) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = list.get(!z2 ? i8 : (size - i8) - 1).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr2[i9] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else if (horizontal == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                horizontal.arrange(density, i7, iArr, layoutDirection, iArr2);
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                int i12 = iArr2[i10];
                int i13 = i10 + 1;
                LazyMeasuredItem lazyMeasuredItem = list.get(!z2 ? i11 : (size - i11) - 1);
                int i14 = i12;
                if (z2) {
                    i14 = (i7 - i12) - lazyMeasuredItem.getSize();
                }
                arrayList.add(z2 ? 0 : arrayList.size(), lazyMeasuredItem.position(i14, i2, i3));
                i11++;
                i10 = i13;
            }
        } else {
            int size2 = list.size();
            for (int i15 = 0; i15 < size2; i15++) {
                LazyMeasuredItem lazyMeasuredItem2 = list.get(i15);
                arrayList.add(lazyMeasuredItem2.position(i6, i2, i3));
                i6 += lazyMeasuredItem2.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: measureLazyList-wroFCeY  reason: not valid java name */
    public static final LazyListMeasureResult m811measureLazyListwroFCeY(int i2, @NotNull LazyMeasuredItemProvider itemProvider, int i3, int i4, int i5, int i6, int i7, float f2, long j2, boolean z, @NotNull List<Integer> headerIndexes, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z2, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull LazyListItemPlacementAnimator placementAnimator, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i8;
        int roundToInt;
        int coerceAtLeast;
        int i9;
        int i10;
        int i11;
        int i12;
        int roundToInt2;
        int sign;
        int sign2;
        Object first;
        int i13;
        int lastIndex;
        int roundToInt3;
        int i14;
        List emptyList;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i2 <= 0) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    return new LazyListMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m4754getMinWidthimpl(j2)), Integer.valueOf(Constraints.m4753getMinHeightimpl(j2)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.list.LazyListMeasureKt$measureLazyList$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                        }
                    }), emptyList, -i4, i5, 0);
                }
                if (i6 >= i2) {
                    i8 = DataIndex.m783constructorimpl(i2 - 1);
                    i7 = 0;
                } else {
                    i8 = i6;
                }
                roundToInt = MathKt__MathJVMKt.roundToInt(f2);
                int i15 = i7 - roundToInt;
                int i16 = i15;
                int i17 = roundToInt;
                if (DataIndex.m786equalsimpl0(i8, DataIndex.m783constructorimpl(0))) {
                    i16 = i15;
                    i17 = roundToInt;
                    if (i15 < 0) {
                        i17 = roundToInt + i15;
                        i16 = 0;
                    }
                }
                ArrayList arrayList = new ArrayList();
                int i18 = i16 - i4;
                int i19 = -i4;
                int i20 = 0;
                int i21 = i8;
                while (i18 < 0 && i21 - DataIndex.m783constructorimpl(0) > 0) {
                    i21 = DataIndex.m783constructorimpl(i21 - 1);
                    LazyMeasuredItem m823getAndMeasureoA9DU0 = itemProvider.m823getAndMeasureoA9DU0(i21);
                    arrayList.add(0, m823getAndMeasureoA9DU0);
                    i20 = Math.max(i20, m823getAndMeasureoA9DU0.getCrossAxisSize());
                    i18 += m823getAndMeasureoA9DU0.getSizeWithSpacings();
                }
                int i22 = i18;
                int i23 = i17;
                if (i18 < i19) {
                    i23 = i17 + i18;
                    i22 = i19;
                }
                int i24 = i22 + i4;
                int i25 = i21;
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i3 + i5, 0);
                int i26 = -i24;
                int size = arrayList.size();
                int i27 = i25;
                for (int i28 = 0; i28 < size; i28++) {
                    LazyMeasuredItem lazyMeasuredItem = (LazyMeasuredItem) arrayList.get(i28);
                    i27 = DataIndex.m783constructorimpl(i27 + 1);
                    i26 += lazyMeasuredItem.getSizeWithSpacings();
                }
                int i29 = i27;
                int i30 = i24;
                while (true) {
                    if ((i26 <= coerceAtLeast || arrayList.isEmpty()) && i29 < i2) {
                        LazyMeasuredItem m823getAndMeasureoA9DU02 = itemProvider.m823getAndMeasureoA9DU0(i29);
                        i26 += m823getAndMeasureoA9DU02.getSizeWithSpacings();
                        if (i26 > i19 || i29 == i2 - 1) {
                            i20 = Math.max(i20, m823getAndMeasureoA9DU02.getCrossAxisSize());
                            arrayList.add(m823getAndMeasureoA9DU02);
                        } else {
                            i25 = DataIndex.m783constructorimpl(i29 + 1);
                            i30 -= m823getAndMeasureoA9DU02.getSizeWithSpacings();
                        }
                        i29 = DataIndex.m783constructorimpl(i29 + 1);
                    }
                }
                if (i26 < i3) {
                    int i31 = i3 - i26;
                    int i32 = i26 + i31;
                    int i33 = i30 - i31;
                    while (true) {
                        i14 = i33;
                        if (i14 >= i4 || i25 - DataIndex.m783constructorimpl(0) <= 0) {
                            break;
                        }
                        i25 = DataIndex.m783constructorimpl(i25 - 1);
                        LazyMeasuredItem m823getAndMeasureoA9DU03 = itemProvider.m823getAndMeasureoA9DU0(i25);
                        arrayList.add(0, m823getAndMeasureoA9DU03);
                        i20 = Math.max(i20, m823getAndMeasureoA9DU03.getCrossAxisSize());
                        i33 = i14 + m823getAndMeasureoA9DU03.getSizeWithSpacings();
                    }
                    i23 += i31;
                    if (i14 < 0) {
                        i23 += i14;
                        i11 = i20;
                        i12 = i32 + i14;
                        i10 = 0;
                        i9 = i19;
                    } else {
                        i11 = i20;
                        i12 = i32;
                        i10 = i14;
                        i9 = i19;
                    }
                } else {
                    int i34 = i30;
                    i9 = i19;
                    i10 = i34;
                    i11 = i20;
                    i12 = i26;
                }
                roundToInt2 = MathKt__MathJVMKt.roundToInt(f2);
                sign = MathKt__MathJVMKt.getSign(roundToInt2);
                sign2 = MathKt__MathJVMKt.getSign(i23);
                if (sign == sign2) {
                    roundToInt3 = MathKt__MathJVMKt.roundToInt(f2);
                    if (Math.abs(roundToInt3) >= Math.abs(i23)) {
                        f2 = i23;
                    }
                }
                int i35 = -i10;
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList);
                LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem) first;
                if (i4 > 0) {
                    int size2 = arrayList.size();
                    int i36 = 0;
                    while (true) {
                        if (i36 >= size2) {
                            i13 = i10;
                            break;
                        }
                        int i37 = i11;
                        int i38 = i36 + 1;
                        int sizeWithSpacings = ((LazyMeasuredItem) arrayList.get(i36)).getSizeWithSpacings();
                        LazyMeasuredItem lazyMeasuredItem3 = lazyMeasuredItem2;
                        i13 = i10;
                        lazyMeasuredItem2 = lazyMeasuredItem3;
                        i11 = i37;
                        if (sizeWithSpacings > i10) {
                            break;
                        }
                        i13 = i10;
                        lazyMeasuredItem2 = lazyMeasuredItem3;
                        i11 = i37;
                        int i39 = i36;
                        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        if (i39 == lastIndex) {
                            break;
                        }
                        i10 -= sizeWithSpacings;
                        lazyMeasuredItem2 = (LazyMeasuredItem) arrayList.get(i38);
                        i36 = i38;
                        i11 = i37;
                    }
                } else {
                    i13 = i10;
                }
                int m4766constrainWidthK40F9xA = ConstraintsKt.m4766constrainWidthK40F9xA(j2, z ? i11 : i12);
                if (z) {
                    i11 = i12;
                }
                int m4765constrainHeightK40F9xA = ConstraintsKt.m4765constrainHeightK40F9xA(j2, i11);
                final List<LazyListPositionedItem> calculateItemsOffsets = calculateItemsOffsets(arrayList, m4766constrainWidthK40F9xA, m4765constrainHeightK40F9xA, i12, i3, i35, z, vertical, horizontal, z2, density, layoutDirection);
                LazyListPositionedItem findOrComposeLazyListHeader = headerIndexes.isEmpty() ^ true ? LazyListHeadersKt.findOrComposeLazyListHeader(calculateItemsOffsets, itemProvider, headerIndexes, i4, m4766constrainWidthK40F9xA, m4765constrainHeightK40F9xA) : null;
                placementAnimator.onMeasured((int) f2, m4766constrainWidthK40F9xA, m4765constrainHeightK40F9xA, z2, calculateItemsOffsets, itemProvider);
                final LazyListPositionedItem lazyListPositionedItem = findOrComposeLazyListHeader;
                return new LazyListMeasureResult(lazyMeasuredItem2, i13, i12 > i3, f2, layout.invoke(Integer.valueOf(m4766constrainWidthK40F9xA), Integer.valueOf(m4765constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.list.LazyListMeasureKt$measureLazyList$3
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
                    public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                        List<LazyListPositionedItem> list = calculateItemsOffsets;
                        LazyListPositionedItem lazyListPositionedItem2 = lazyListPositionedItem;
                        int size3 = list.size();
                        for (int i40 = 0; i40 < size3; i40++) {
                            LazyListPositionedItem lazyListPositionedItem3 = list.get(i40);
                            if (lazyListPositionedItem3 != lazyListPositionedItem2) {
                                lazyListPositionedItem3.place(invoke);
                            }
                        }
                        LazyListPositionedItem lazyListPositionedItem4 = lazyListPositionedItem;
                        if (lazyListPositionedItem4 == null) {
                            return;
                        }
                        lazyListPositionedItem4.place(invoke);
                    }
                }), calculateItemsOffsets, i9, Math.min(i12, i3) + i5, i2);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
