package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutPlaceable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��2\u00020\u0001Bz\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0001ø\u0001��¢\u0006\u0002\u0010\u0018J\u001e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0017\u001a\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b#\u0010\u001bR\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;", "", FirebaseAnalytics.Param.INDEX, "", "placeables", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;", "isVertical", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "beforeContentPadding", "afterContentPadding", "placementAnimator", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "spacing", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "key", "(I[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;IJLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "getKey", "()Ljava/lang/Object;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;", "size", "getSize", "sizeWithSpacings", "getSizeWithSpacings", "J", "position", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", "offset", "layoutWidth", "layoutHeight", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyMeasuredItem.class */
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    @Nullable
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final Object key;
    @NotNull
    private final LayoutDirection layoutDirection;
    @NotNull
    private final LazyLayoutPlaceable[] placeables;
    @NotNull
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;
    @Nullable
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    private LazyMeasuredItem(int i2, LazyLayoutPlaceable[] lazyLayoutPlaceableArr, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3, int i4, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i5, long j2, Object obj) {
        this.index = i2;
        this.placeables = lazyLayoutPlaceableArr;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i4;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.spacing = i5;
        this.visualOffset = j2;
        this.key = obj;
        int length = lazyLayoutPlaceableArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = i6 + 1;
            Placeable placeable = lazyLayoutPlaceableArr[i6].getPlaceable();
            int height = i7 + (this.isVertical ? placeable.getHeight() : placeable.getWidth());
            i8 = Math.max(i8, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
            i6 = i9;
            i7 = height;
        }
        this.size = i7;
        this.sizeWithSpacings = i7 + this.spacing;
        this.crossAxisSize = i8;
    }

    public /* synthetic */ LazyMeasuredItem(int i2, LazyLayoutPlaceable[] lazyLayoutPlaceableArr, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3, int i4, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i5, long j2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, lazyLayoutPlaceableArr, z, horizontal, vertical, layoutDirection, z2, i3, i4, lazyListItemPlacementAnimator, i5, j2, obj);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    @NotNull
    public final LazyListPositionedItem position(int i2, int i3, int i4) {
        int i5;
        long IntOffset;
        int lastIndex;
        ArrayList arrayList = new ArrayList();
        int i6 = this.isVertical ? i4 : i3;
        boolean z = this.reverseLayout;
        int i7 = z ? (i6 - i2) - this.size : i2;
        if (z) {
            lastIndex = ArraysKt___ArraysKt.getLastIndex(this.placeables);
            i5 = lastIndex;
        } else {
            i5 = 0;
        }
        while (true) {
            boolean z2 = this.reverseLayout;
            boolean z3 = true;
            if (!z2 ? i5 >= this.placeables.length : i5 < 0) {
                z3 = false;
            }
            if (!z3) {
                return new LazyListPositionedItem(i2, this.index, this.key, this.size, this.sizeWithSpacings, -(!z2 ? this.beforeContentPadding : this.afterContentPadding), i6 + (!z2 ? this.afterContentPadding : this.beforeContentPadding), this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
            }
            Placeable placeable = this.placeables[i5].getPlaceable();
            int size = this.reverseLayout ? 0 : arrayList.size();
            if (this.isVertical) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                IntOffset = IntOffsetKt.IntOffset(horizontal.align(placeable.getWidth(), i3, this.layoutDirection), i7);
            } else {
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                IntOffset = IntOffsetKt.IntOffset(i7, vertical.align(placeable.getHeight(), i4));
            }
            i7 += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            arrayList.add(size, new LazyListPlaceableWrapper(IntOffset, placeable, this.placeables[i5].getParentData(), null));
            i5 = this.reverseLayout ? i5 - 1 : i5 + 1;
        }
    }
}
