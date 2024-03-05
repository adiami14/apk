package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"�� \n��\n\u0002\u0018\u0002\n��\n\u0002\u0010!\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010��\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH��¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListHeadersKt.class */
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListPositionedItem findOrComposeLazyListHeader(@NotNull List<LazyListPositionedItem> composedVisibleItems, @NotNull LazyMeasuredItemProvider itemProvider, @NotNull List<Integer> headerIndexes, int i2, int i3, int i4) {
        Object first;
        int i5;
        int i6;
        int i7;
        int i8;
        int lastIndex;
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) composedVisibleItems);
        int index = ((LazyListPositionedItem) first).getIndex();
        int size = headerIndexes.size();
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (i9 < size) {
            int i12 = i9 + 1;
            if (headerIndexes.get(i9).intValue() > index) {
                break;
            }
            i10 = headerIndexes.get(i9).intValue();
            if (i12 >= 0) {
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(headerIndexes);
                if (i12 <= lastIndex) {
                    i8 = headerIndexes.get(i12);
                    i11 = i8.intValue();
                    i9 = i12;
                }
            }
            i8 = -1;
            i11 = i8.intValue();
            i9 = i12;
        }
        int size2 = composedVisibleItems.size();
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = 0;
        int i16 = -1;
        while (true) {
            i5 = i16;
            if (i15 >= size2) {
                break;
            }
            LazyListPositionedItem lazyListPositionedItem = composedVisibleItems.get(i15);
            if (lazyListPositionedItem.getIndex() == i10) {
                i6 = lazyListPositionedItem.getOffset();
                i7 = i15;
            } else {
                i6 = i13;
                i7 = i5;
                if (lazyListPositionedItem.getIndex() == i11) {
                    i14 = lazyListPositionedItem.getOffset();
                    i7 = i5;
                    i6 = i13;
                }
            }
            i15++;
            i13 = i6;
            i16 = i7;
        }
        if (i10 == -1) {
            return null;
        }
        LazyMeasuredItem m823getAndMeasureoA9DU0 = itemProvider.m823getAndMeasureoA9DU0(DataIndex.m783constructorimpl(i10));
        int i17 = -i2;
        int i18 = i17;
        if (i13 != Integer.MIN_VALUE) {
            i18 = Math.max(i17, i13);
        }
        int i19 = i18;
        if (i14 != Integer.MIN_VALUE) {
            i19 = Math.min(i18, i14 - m823getAndMeasureoA9DU0.getSize());
        }
        LazyListPositionedItem position = m823getAndMeasureoA9DU0.position(i19, i3, i4);
        if (i5 != -1) {
            composedVisibleItems.set(i5, position);
        } else {
            composedVisibleItems.add(0, position);
        }
        return position;
    }
}
