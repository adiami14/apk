package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n��\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001��J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%H\u0082\bJ7\u0010&\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001��J\u001a\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0006\u0010*\u001a\u00020\u001fJ\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n��R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n��R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rø\u0001��¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004ø\u0001��¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "(Landroidx/compose/ui/input/pointer/PointerInputFilter;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/PointerId;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "relevantChanges", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "wasIn", "buildCache", "changes", "", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/Node.class */
public final class Node extends NodeParent {
    @Nullable
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;
    @Nullable
    private PointerEvent pointerEvent;
    @NotNull
    private final MutableVector<PointerId> pointerIds;
    @NotNull
    private final PointerInputFilter pointerInputFilter;
    @NotNull
    private final Map<PointerId, PointerInputChange> relevantChanges;
    private boolean wasIn;

    public Node(@NotNull PointerInputFilter pointerInputFilter) {
        Intrinsics.checkNotNullParameter(pointerInputFilter, "pointerInputFilter");
        this.pointerInputFilter = pointerInputFilter;
        this.pointerIds = new MutableVector<>(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> function0) {
        if (!this.relevantChanges.isEmpty() && getPointerInputFilter().isAttached$ui_release()) {
            function0.invoke();
            return true;
        }
        return false;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Offset.m2164equalsimpl0(pointerEvent.getChanges().get(i2).m3794getPositionF1C5BW0(), pointerEvent2.getChanges().get(i2).m3794getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean z) {
        List list;
        PointerInputChange pointerInputChange;
        LayoutCoordinates layoutCoordinates;
        int m3753getMove7fucELk;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean buildCache = super.buildCache(changes, parentCoordinates, internalPointerEvent, z);
        if (this.pointerInputFilter.isAttached$ui_release()) {
            this.coordinates = this.pointerInputFilter.getLayoutCoordinates$ui_release();
            Iterator<Map.Entry<PointerId, PointerInputChange>> it = changes.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<PointerId, PointerInputChange> next = it.next();
                long m3785unboximpl = next.getKey().m3785unboximpl();
                PointerInputChange value = next.getValue();
                if (this.pointerIds.contains(PointerId.m3779boximpl(m3785unboximpl))) {
                    ArrayList arrayList = new ArrayList();
                    List<HistoricalChange> historical = value.getHistorical();
                    int size = historical.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        HistoricalChange historicalChange = historical.get(i2);
                        long uptimeMillis = historicalChange.getUptimeMillis();
                        LayoutCoordinates layoutCoordinates2 = this.coordinates;
                        Intrinsics.checkNotNull(layoutCoordinates2);
                        arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates2.mo3928localPositionOfR5De75A(parentCoordinates, historicalChange.m3719getPositionF1C5BW0()), null));
                    }
                    Map<PointerId, PointerInputChange> map = this.relevantChanges;
                    PointerId m3779boximpl = PointerId.m3779boximpl(m3785unboximpl);
                    LayoutCoordinates layoutCoordinates3 = this.coordinates;
                    Intrinsics.checkNotNull(layoutCoordinates3);
                    long mo3928localPositionOfR5De75A = layoutCoordinates3.mo3928localPositionOfR5De75A(parentCoordinates, value.m3795getPreviousPositionF1C5BW0());
                    LayoutCoordinates layoutCoordinates4 = this.coordinates;
                    Intrinsics.checkNotNull(layoutCoordinates4);
                    map.put(m3779boximpl, PointerInputChange.m3786copy96DQgws$default(value, 0L, 0L, layoutCoordinates4.mo3928localPositionOfR5De75A(parentCoordinates, value.m3794getPositionF1C5BW0()), false, 0L, mo3928localPositionOfR5De75A, false, null, 0, arrayList, 475, null));
                }
            }
            if (this.relevantChanges.isEmpty()) {
                this.pointerIds.clear();
                getChildren().clear();
                return true;
            }
            int size2 = this.pointerIds.getSize() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    if (!changes.containsKey(PointerId.m3779boximpl(this.pointerIds.getContent()[size2].m3785unboximpl()))) {
                        this.pointerIds.removeAt(size2);
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            list = CollectionsKt___CollectionsKt.toList(this.relevantChanges.values());
            PointerEvent pointerEvent = new PointerEvent(list, internalPointerEvent);
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size3 = changes2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size3) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes2.get(i4);
                if (internalPointerEvent.m3721issuesEnterExitEvent0FcD4WY(pointerInputChange.m3793getIdJ3iCeTQ())) {
                    break;
                }
                i4++;
            }
            PointerInputChange pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 != null) {
                if (!z) {
                    this.isIn = false;
                } else if (!this.isIn && (pointerInputChange2.getPressed() || pointerInputChange2.getPreviousPressed())) {
                    Intrinsics.checkNotNull(this.coordinates);
                    this.isIn = !PointerEventKt.m3738isOutOfBoundsO0kMr_c(pointerInputChange2, layoutCoordinates.mo3927getSizeYbymL2g());
                }
                if (this.isIn != this.wasIn) {
                    int m3736getType7fucELk = pointerEvent.m3736getType7fucELk();
                    PointerEventType.Companion companion = PointerEventType.Companion;
                    if (PointerEventType.m3746equalsimpl0(m3736getType7fucELk, companion.m3753getMove7fucELk()) || PointerEventType.m3746equalsimpl0(pointerEvent.m3736getType7fucELk(), companion.m3751getEnter7fucELk()) || PointerEventType.m3746equalsimpl0(pointerEvent.m3736getType7fucELk(), companion.m3752getExit7fucELk())) {
                        m3753getMove7fucELk = this.isIn ? companion.m3751getEnter7fucELk() : companion.m3752getExit7fucELk();
                        pointerEvent.m3737setTypeEhbLWgg$ui_release(m3753getMove7fucELk);
                    }
                }
                int m3736getType7fucELk2 = pointerEvent.m3736getType7fucELk();
                PointerEventType.Companion companion2 = PointerEventType.Companion;
                if ((PointerEventType.m3746equalsimpl0(m3736getType7fucELk2, companion2.m3751getEnter7fucELk()) && this.wasIn && !this.hasExited) || (PointerEventType.m3746equalsimpl0(pointerEvent.m3736getType7fucELk(), companion2.m3752getExit7fucELk()) && this.isIn && pointerInputChange2.getPressed())) {
                    m3753getMove7fucELk = companion2.m3753getMove7fucELk();
                    pointerEvent.m3737setTypeEhbLWgg$ui_release(m3753getMove7fucELk);
                }
            }
            boolean z2 = buildCache || !PointerEventType.m3746equalsimpl0(pointerEvent.m3736getType7fucELk(), PointerEventType.Companion.m3753getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent);
            this.pointerEvent = pointerEvent;
            return z2;
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if ((pointerInputChange.getPressed() || (internalPointerEvent.m3721issuesEnterExitEvent0FcD4WY(pointerInputChange.m3793getIdJ3iCeTQ()) && this.isIn)) ? false : true) {
                getPointerIds().remove(PointerId.m3779boximpl(pointerInputChange.m3793getIdJ3iCeTQ()));
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m3746equalsimpl0(pointerEvent.m3736getType7fucELk(), PointerEventType.Companion.m3752getExit7fucELk());
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        int i2;
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size <= 0) {
            this.pointerInputFilter.onCancel();
        }
        int i3 = 0;
        Node[] content = children.getContent();
        do {
            content[i3].dispatchCancel();
            i2 = i3 + 1;
            i3 = i2;
        } while (i2 < size);
        this.pointerInputFilter.onCancel();
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent) {
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int i3 = 0;
        if (!this.relevantChanges.isEmpty() && getPointerInputFilter().isAttached$ui_release()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            getPointerInputFilter().mo3816onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, layoutCoordinates.mo3927getSizeYbymL2g());
            z = true;
            if (getPointerInputFilter().isAttached$ui_release()) {
                MutableVector<Node> children = getChildren();
                int size = children.getSize();
                z = true;
                if (size > 0) {
                    Node[] content = children.getContent();
                    do {
                        content[i3].dispatchFinalEventPass(internalPointerEvent);
                        i2 = i3 + 1;
                        i3 = i2;
                    } while (i2 < size);
                    z = true;
                }
            }
        } else {
            z = false;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchMainEventPass(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r7, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r8, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchMainEventPass(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @NotNull
    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    @NotNull
    public final PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
