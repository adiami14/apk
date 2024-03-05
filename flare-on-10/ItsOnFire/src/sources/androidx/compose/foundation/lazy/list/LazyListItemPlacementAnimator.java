package androidx.compose.foundation.lazy.list;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.j;
import j.u0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b��\u0018��2\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b>\u0010?JM\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0002ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ;\u0010'\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0006ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0006\u0010(\u001a\u00020\u0013R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010=\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "", "", FirebaseAnalytics.Param.INDEX, "sizeWithSpacings", "averageItemsSize", "Landroidx/compose/ui/unit/IntOffset;", "scrolledBy", "", "reverseLayout", "mainAxisLayoutSize", "fallback", "calculateExpectedOffset-tGxSNXI", "(IIIJZII)I", "calculateExpectedOffset", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", "item", "Landroidx/compose/foundation/lazy/list/ItemInfo;", "itemInfo", "", "startAnimationsIfNeeded", "toOffset-Bjo55l4", "(I)J", "toOffset", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;", "itemProvider", "onMeasured", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "getAnimatedOffset", "reset", "Lj/u0;", "scope", "Lj/u0;", "isVertical", "Z", "", "keyToItemInfoMap", "Ljava/util/Map;", "", "keyToIndexMap", "viewportStartItemIndex", "I", "viewportStartItemNotVisiblePartSize", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "", "positionedKeys", "Ljava/util/Set;", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "<init>", "(Lj/u0;Z)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator.class */
public final class LazyListItemPlacementAnimator {
    private final boolean isVertical;
    @NotNull
    private Map<Object, Integer> keyToIndexMap;
    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    @NotNull
    private final Set<Object> positionedKeys;
    @NotNull
    private final u0 scope;
    private int viewportEndItemIndex;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemIndex;
    private int viewportStartItemNotVisiblePartSize;

    public LazyListItemPlacementAnimator(@NotNull u0 scope, boolean z) {
        Map<Object, Integer> emptyMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z;
        this.keyToItemInfoMap = new LinkedHashMap();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.keyToIndexMap = emptyMap;
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    /* renamed from: calculateExpectedOffset-tGxSNXI  reason: not valid java name */
    private final int m800calculateExpectedOffsettGxSNXI(int i2, int i3, int i4, long j2, boolean z, int i5, int i6) {
        boolean z2 = false;
        int i7 = this.viewportEndItemIndex;
        boolean z3 = z ? i7 > i2 : i7 < i2;
        int i8 = this.viewportStartItemIndex;
        if (z ? i8 < i2 : i8 > i2) {
            z2 = true;
        }
        int i9 = -1;
        if (z3) {
            int i10 = this.viewportEndItemIndex;
            if (!z) {
                i9 = 1;
            }
            i6 = i5 + this.viewportEndItemNotVisiblePartSize + (i4 * (((i2 - i10) * i9) - 1)) + m801getMainAxisgyyYBs(j2);
        } else if (z2) {
            int i11 = this.viewportStartItemIndex;
            if (!z) {
                i9 = 1;
            }
            i6 = ((this.viewportStartItemNotVisiblePartSize - i3) - (i4 * (((i11 - i2) * i9) - 1))) + m801getMainAxisgyyYBs(j2);
        }
        return i6;
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m801getMainAxisgyyYBs(long j2) {
        return this.isVertical ? IntOffset.m4908getYimpl(j2) : IntOffset.m4907getXimpl(j2);
    }

    private final void startAnimationsIfNeeded(LazyListPositionedItem lazyListPositionedItem, ItemInfo itemInfo) {
        while (itemInfo.getPlaceables().size() > lazyListPositionedItem.getPlaceablesCount()) {
            CollectionsKt__MutableCollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyListPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long m815getOffsetBjo55l4 = lazyListPositionedItem.m815getOffsetBjo55l4(size);
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long m794getNotAnimatableDeltanOccac = itemInfo.m794getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m815getOffsetBjo55l4) - IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac), IntOffset.m4908getYimpl(m815getOffsetBjo55l4) - IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac)), lazyListPositionedItem.getMainAxisSize(size), null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PlaceableInfo placeableInfo = placeables2.get(i2);
            long m825getTargetOffsetnOccac = placeableInfo.m825getTargetOffsetnOccac();
            long m794getNotAnimatableDeltanOccac2 = itemInfo.m794getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m825getTargetOffsetnOccac) + IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac2), IntOffset.m4908getYimpl(m825getTargetOffsetnOccac) + IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac2));
            long m815getOffsetBjo55l42 = lazyListPositionedItem.m815getOffsetBjo55l4(i2);
            placeableInfo.setSize(lazyListPositionedItem.getMainAxisSize(i2));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyListPositionedItem.getAnimationSpec(i2);
            if (!IntOffset.m4906equalsimpl0(IntOffset, m815getOffsetBjo55l42)) {
                long m794getNotAnimatableDeltanOccac3 = itemInfo.m794getNotAnimatableDeltanOccac();
                placeableInfo.m826setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m815getOffsetBjo55l42) - IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac3), IntOffset.m4908getYimpl(m815getOffsetBjo55l42) - IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac3)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    j.e(this.scope, null, null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, null), 3, null);
                }
            }
        }
    }

    /* renamed from: toOffset-Bjo55l4  reason: not valid java name */
    private final long m802toOffsetBjo55l4(int i2) {
        boolean z = this.isVertical;
        int i3 = z ? 0 : i2;
        if (!z) {
            i2 = 0;
        }
        return IntOffsetKt.IntOffset(i3, i2);
    }

    /* renamed from: getAnimatedOffset-YT5a7pE  reason: not valid java name */
    public final long m803getAnimatedOffsetYT5a7pE(@NotNull Object key, int i2, int i3, int i4, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return j2;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i2);
        long m4916unboximpl = placeableInfo.getAnimatedOffset().getValue().m4916unboximpl();
        long m794getNotAnimatableDeltanOccac = itemInfo.m794getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m4916unboximpl) + IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac), IntOffset.m4908getYimpl(m4916unboximpl) + IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac));
        long m825getTargetOffsetnOccac = placeableInfo.m825getTargetOffsetnOccac();
        long m794getNotAnimatableDeltanOccac2 = itemInfo.m794getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m825getTargetOffsetnOccac) + IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac2), IntOffset.m4908getYimpl(m825getTargetOffsetnOccac) + IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac2));
        if (placeableInfo.getInProgress() && ((m801getMainAxisgyyYBs(IntOffset2) < i3 && m801getMainAxisgyyYBs(IntOffset) < i3) || (m801getMainAxisgyyYBs(IntOffset2) > i4 && m801getMainAxisgyyYBs(IntOffset) > i4))) {
            j.e(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return IntOffset;
    }

    public final void onMeasured(int i2, int i3, int i4, boolean z, @NotNull List<LazyListPositionedItem> positionedItems, @NotNull LazyMeasuredItemProvider itemProvider) {
        boolean z2;
        Object first;
        Object last;
        int sizeWithSpacings;
        boolean z3;
        boolean z4;
        int m800calculateExpectedOffsettGxSNXI;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z2 = false;
                break;
            } else if (positionedItems.get(i7).getHasAnimations()) {
                z2 = true;
                break;
            } else {
                i7++;
            }
        }
        if (!z2) {
            reset();
            return;
        }
        int i8 = this.isVertical ? i4 : i3;
        int i9 = i2;
        if (z) {
            i9 = -i2;
        }
        long m802toOffsetBjo55l4 = m802toOffsetBjo55l4(i9);
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) positionedItems);
        LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) first;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) positionedItems);
        LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) last;
        int size2 = positionedItems.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            LazyListPositionedItem lazyListPositionedItem3 = positionedItems.get(i11);
            ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListPositionedItem3.getKey());
            if (itemInfo != null) {
                itemInfo.setIndex(lazyListPositionedItem3.getIndex());
            }
            i10 += lazyListPositionedItem3.getSizeWithSpacings();
        }
        int size3 = i10 / positionedItems.size();
        this.positionedKeys.clear();
        int size4 = positionedItems.size();
        for (int i12 = 0; i12 < size4; i12++) {
            LazyListPositionedItem lazyListPositionedItem4 = positionedItems.get(i12);
            this.positionedKeys.add(lazyListPositionedItem4.getKey());
            ItemInfo itemInfo2 = this.keyToItemInfoMap.get(lazyListPositionedItem4.getKey());
            if (itemInfo2 == null) {
                if (lazyListPositionedItem4.getHasAnimations()) {
                    ItemInfo itemInfo3 = new ItemInfo(lazyListPositionedItem4.getIndex());
                    Integer num = this.keyToIndexMap.get(lazyListPositionedItem4.getKey());
                    long m815getOffsetBjo55l4 = lazyListPositionedItem4.m815getOffsetBjo55l4(0);
                    int mainAxisSize = lazyListPositionedItem4.getMainAxisSize(0);
                    if (num == null) {
                        m800calculateExpectedOffsettGxSNXI = m801getMainAxisgyyYBs(m815getOffsetBjo55l4);
                    } else {
                        int m801getMainAxisgyyYBs = m801getMainAxisgyyYBs(m815getOffsetBjo55l4);
                        if (z) {
                            m801getMainAxisgyyYBs = (m801getMainAxisgyyYBs - lazyListPositionedItem4.getSizeWithSpacings()) + mainAxisSize;
                        }
                        m800calculateExpectedOffsettGxSNXI = m800calculateExpectedOffsettGxSNXI(num.intValue(), lazyListPositionedItem4.getSizeWithSpacings(), size3, m802toOffsetBjo55l4, z, i8, m801getMainAxisgyyYBs) + (z ? lazyListPositionedItem4.getSize() - mainAxisSize : 0);
                    }
                    if (this.isVertical) {
                        i6 = 0;
                        i5 = 1;
                    } else {
                        i5 = 2;
                        i6 = m800calculateExpectedOffsettGxSNXI;
                        m800calculateExpectedOffsettGxSNXI = 0;
                    }
                    long m4903copyiSbpLlY$default = IntOffset.m4903copyiSbpLlY$default(m815getOffsetBjo55l4, i6, m800calculateExpectedOffsettGxSNXI, i5, null);
                    int placeablesCount = lazyListPositionedItem4.getPlaceablesCount();
                    for (int i13 = 0; i13 < placeablesCount; i13++) {
                        long m815getOffsetBjo55l42 = lazyListPositionedItem4.m815getOffsetBjo55l4(i13);
                        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m815getOffsetBjo55l42) - IntOffset.m4907getXimpl(m815getOffsetBjo55l4), IntOffset.m4908getYimpl(m815getOffsetBjo55l42) - IntOffset.m4908getYimpl(m815getOffsetBjo55l4));
                        itemInfo3.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m4903copyiSbpLlY$default) + IntOffset.m4907getXimpl(IntOffset), IntOffset.m4908getYimpl(m4903copyiSbpLlY$default) + IntOffset.m4908getYimpl(IntOffset)), lazyListPositionedItem4.getMainAxisSize(i13), null));
                        Unit unit = Unit.INSTANCE;
                    }
                    this.keyToItemInfoMap.put(lazyListPositionedItem4.getKey(), itemInfo3);
                    startAnimationsIfNeeded(lazyListPositionedItem4, itemInfo3);
                }
            } else if (lazyListPositionedItem4.getHasAnimations()) {
                long m794getNotAnimatableDeltanOccac = itemInfo2.m794getNotAnimatableDeltanOccac();
                itemInfo2.m795setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac) + IntOffset.m4907getXimpl(m802toOffsetBjo55l4), IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac) + IntOffset.m4908getYimpl(m802toOffsetBjo55l4)));
                startAnimationsIfNeeded(lazyListPositionedItem4, itemInfo2);
            } else {
                this.keyToItemInfoMap.remove(lazyListPositionedItem4.getKey());
            }
        }
        if (z) {
            this.viewportStartItemIndex = lazyListPositionedItem2.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i8 - lazyListPositionedItem2.getOffset()) - lazyListPositionedItem2.getSize();
            this.viewportEndItemIndex = lazyListPositionedItem.getIndex();
            sizeWithSpacings = (-lazyListPositionedItem.getOffset()) + (lazyListPositionedItem.getSizeWithSpacings() - lazyListPositionedItem.getSize());
        } else {
            this.viewportStartItemIndex = lazyListPositionedItem.getIndex();
            this.viewportStartItemNotVisiblePartSize = lazyListPositionedItem.getOffset();
            this.viewportEndItemIndex = lazyListPositionedItem2.getIndex();
            sizeWithSpacings = (lazyListPositionedItem2.getOffset() + lazyListPositionedItem2.getSizeWithSpacings()) - i8;
        }
        this.viewportEndItemNotVisiblePartSize = sizeWithSpacings;
        Iterator<Map.Entry<Object, ItemInfo>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, ItemInfo> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                ItemInfo value = next.getValue();
                long m794getNotAnimatableDeltanOccac2 = value.m794getNotAnimatableDeltanOccac();
                value.m795setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac2) + IntOffset.m4907getXimpl(m802toOffsetBjo55l4), IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac2) + IntOffset.m4908getYimpl(m802toOffsetBjo55l4)));
                Integer num2 = itemProvider.getKeyToIndexMap().get(next.getKey());
                List<PlaceableInfo> placeables = value.getPlaceables();
                int size5 = placeables.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        z3 = false;
                        break;
                    }
                    PlaceableInfo placeableInfo = placeables.get(i14);
                    long m825getTargetOffsetnOccac = placeableInfo.m825getTargetOffsetnOccac();
                    long m794getNotAnimatableDeltanOccac3 = value.m794getNotAnimatableDeltanOccac();
                    long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m825getTargetOffsetnOccac) + IntOffset.m4907getXimpl(m794getNotAnimatableDeltanOccac3), IntOffset.m4908getYimpl(m825getTargetOffsetnOccac) + IntOffset.m4908getYimpl(m794getNotAnimatableDeltanOccac3));
                    if (m801getMainAxisgyyYBs(IntOffset2) + placeableInfo.getSize() > 0 && m801getMainAxisgyyYBs(IntOffset2) < i8) {
                        z3 = true;
                        break;
                    }
                    i14++;
                }
                List<PlaceableInfo> placeables2 = value.getPlaceables();
                int size6 = placeables2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size6) {
                        z4 = false;
                        break;
                    } else if (placeables2.get(i15).getInProgress()) {
                        z4 = true;
                        break;
                    } else {
                        i15++;
                    }
                }
                if ((!z3 && (!z4)) || num2 == null || value.getPlaceables().isEmpty()) {
                    it.remove();
                } else {
                    LazyMeasuredItem m823getAndMeasureoA9DU0 = itemProvider.m823getAndMeasureoA9DU0(DataIndex.m783constructorimpl(num2.intValue()));
                    int m800calculateExpectedOffsettGxSNXI2 = m800calculateExpectedOffsettGxSNXI(num2.intValue(), m823getAndMeasureoA9DU0.getSizeWithSpacings(), size3, m802toOffsetBjo55l4, z, i8, i8);
                    int i16 = m800calculateExpectedOffsettGxSNXI2;
                    if (z) {
                        i16 = (i8 - m800calculateExpectedOffsettGxSNXI2) - m823getAndMeasureoA9DU0.getSize();
                    }
                    LazyListPositionedItem position = m823getAndMeasureoA9DU0.position(i16, i3, i4);
                    positionedItems.add(position);
                    startAnimationsIfNeeded(position, value);
                }
            }
        }
        this.keyToIndexMap = itemProvider.getKeyToIndexMap();
    }

    public final void reset() {
        Map<Object, Integer> emptyMap;
        this.keyToItemInfoMap.clear();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.keyToIndexMap = emptyMap;
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }
}
