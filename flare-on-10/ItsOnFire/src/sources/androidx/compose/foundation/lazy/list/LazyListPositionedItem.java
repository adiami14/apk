package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010��\n\u0002\b\u0005\n\u0002\u0010\u000b\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\b��\u0018��2\u00020\u0001Bf\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013ø\u0001��¢\u0006\u0002\u0010\u0014J\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010*2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001��J\u000e\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b \u0010\u0019R\u0019\u0010\u0012\u001a\u00020\u0013X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n��R\u001b\u0010\"\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\u00020\u0003*\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "offset", "", FirebaseAnalytics.Param.INDEX, "key", "", "size", "sizeWithSpacings", "minMainAxisOffset", "maxMainAxisOffset", "isVertical", "", "wrappers", "", "Landroidx/compose/foundation/lazy/list/LazyListPlaceableWrapper;", "placementAnimator", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "hasAnimations", "getHasAnimations", "()Z", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getOffset", "placeablesCount", "getPlaceablesCount", "getSize", "getSizeWithSpacings", "J", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "mainAxisSize", "Landroidx/compose/ui/layout/Placeable;", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "getAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getOffset-Bjo55l4", "(I)J", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListPositionedItem.class */
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    @NotNull
    private final Object key;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;
    @NotNull
    private final LazyListItemPlacementAnimator placementAnimator;
    private final int size;
    private final int sizeWithSpacings;
    private final long visualOffset;
    @NotNull
    private final List<LazyListPlaceableWrapper> wrappers;

    private LazyListPositionedItem(int i2, int i3, Object obj, int i4, int i5, int i6, int i7, boolean z, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j2) {
        boolean z2;
        this.offset = i2;
        this.index = i3;
        this.key = obj;
        this.size = i4;
        this.sizeWithSpacings = i5;
        this.minMainAxisOffset = i6;
        this.maxMainAxisOffset = i7;
        this.isVertical = z;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j2;
        int placeablesCount = getPlaceablesCount();
        int i8 = 0;
        while (true) {
            z2 = false;
            if (i8 >= placeablesCount) {
                break;
            } else if (getAnimationSpec(i8) != null) {
                z2 = true;
                break;
            } else {
                i8++;
            }
        }
        this.hasAnimations = z2;
    }

    public /* synthetic */ LazyListPositionedItem(int i2, int i3, Object obj, int i4, int i5, int i6, int i7, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, obj, i4, i5, i6, i7, z, list, lazyListItemPlacementAnimator, j2);
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m814getMainAxisgyyYBs(long j2) {
        return this.isVertical ? IntOffset.m4908getYimpl(j2) : IntOffset.m4907getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int i2) {
        Object parentData = this.wrappers.get(i2).getParentData();
        return parentData instanceof FiniteAnimationSpec ? (FiniteAnimationSpec) parentData : null;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int i2) {
        return getMainAxisSize(this.wrappers.get(i2).getPlaceable());
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* renamed from: getOffset-Bjo55l4  reason: not valid java name */
    public final long m815getOffsetBjo55l4(int i2) {
        return this.wrappers.get(i2).m813getOffsetnOccac();
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int placeablesCount = getPlaceablesCount();
        int i2 = 0;
        while (i2 < placeablesCount) {
            int i3 = i2 + 1;
            Placeable placeable = this.wrappers.get(i2).getPlaceable();
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i4 = this.maxMainAxisOffset;
            long m803getAnimatedOffsetYT5a7pE = getAnimationSpec(i2) != null ? this.placementAnimator.m803getAnimatedOffsetYT5a7pE(getKey(), i2, mainAxisSize, i4, m815getOffsetBjo55l4(i2)) : m815getOffsetBjo55l4(i2);
            i2 = i3;
            if (m814getMainAxisgyyYBs(m803getAnimatedOffsetYT5a7pE) > mainAxisSize) {
                i2 = i3;
                if (m814getMainAxisgyyYBs(m803getAnimatedOffsetYT5a7pE) < i4) {
                    if (this.isVertical) {
                        long j2 = this.visualOffset;
                        Placeable.PlacementScope.m3965placeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m803getAnimatedOffsetYT5a7pE) + IntOffset.m4907getXimpl(j2), IntOffset.m4908getYimpl(m803getAnimatedOffsetYT5a7pE) + IntOffset.m4908getYimpl(j2)), 0.0f, null, 6, null);
                        i2 = i3;
                    } else {
                        long j3 = this.visualOffset;
                        Placeable.PlacementScope.m3964placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m803getAnimatedOffsetYT5a7pE) + IntOffset.m4907getXimpl(j3), IntOffset.m4908getYimpl(m803getAnimatedOffsetYT5a7pE) + IntOffset.m4908getYimpl(j3)), 0.0f, null, 6, null);
                        i2 = i3;
                    }
                }
            }
        }
    }
}
