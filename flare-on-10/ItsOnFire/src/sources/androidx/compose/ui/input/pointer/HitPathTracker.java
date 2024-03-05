package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��@\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "addHitPath", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "dispatchChanges", "", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "processCancel", "removeDetachedPointerInputFilters", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/HitPathTracker.class */
public final class HitPathTracker {
    @NotNull
    private final NodeParent root;
    @NotNull
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(@NotNull LayoutCoordinates rootCoordinates) {
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.rootCoordinates = rootCoordinates;
        this.root = new NodeParent();
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z);
    }

    /* renamed from: addHitPath-KNwqfcY  reason: not valid java name */
    public final void m3720addHitPathKNwqfcY(long j2, @NotNull List<? extends PointerInputFilter> pointerInputFilters) {
        Node node;
        int i2;
        Intrinsics.checkNotNullParameter(pointerInputFilters, "pointerInputFilters");
        Node node2 = this.root;
        int size = pointerInputFilters.size();
        boolean z = true;
        int i3 = 0;
        while (i3 < size) {
            PointerInputFilter pointerInputFilter = pointerInputFilters.get(i3);
            boolean z2 = z;
            if (z) {
                MutableVector<Node> children = node2.getChildren();
                int size2 = children.getSize();
                if (size2 > 0) {
                    Node[] content = children.getContent();
                    int i4 = 0;
                    do {
                        node = content[i4];
                        if (Intrinsics.areEqual(node.getPointerInputFilter(), pointerInputFilter)) {
                            break;
                        }
                        i2 = i4 + 1;
                        i4 = i2;
                    } while (i2 < size2);
                    node = null;
                } else {
                    node = null;
                }
                Node node3 = node;
                if (node3 != null) {
                    node3.markIsIn();
                    z2 = z;
                    node2 = node3;
                    if (!node3.getPointerIds().contains(PointerId.m3779boximpl(j2))) {
                        node3.getPointerIds().add(PointerId.m3779boximpl(j2));
                        z2 = z;
                        node2 = node3;
                    }
                    i3++;
                    z = z2;
                } else {
                    z2 = false;
                }
            }
            Node node4 = new Node(pointerInputFilter);
            node4.getPointerIds().add(PointerId.m3779boximpl(j2));
            node2.getChildren().add(node4);
            node2 = node4;
            i3++;
            z = z2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchChanges(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r7, boolean r8) {
        /*
            r6 = this;
            r0 = r7
            java.lang.String r1 = "internalPointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r6
            androidx.compose.ui.input.pointer.NodeParent r0 = r0.root
            r1 = r7
            java.util.Map r1 = r1.getChanges()
            r2 = r6
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.rootCoordinates
            r3 = r7
            r4 = r8
            boolean r0 = r0.buildCache(r1, r2, r3, r4)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r6
            androidx.compose.ui.input.pointer.NodeParent r0 = r0.root
            r1 = r7
            java.util.Map r1 = r1.getChanges()
            r2 = r6
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.rootCoordinates
            r3 = r7
            r4 = r8
            boolean r0 = r0.dispatchMainEventPass(r1, r2, r3, r4)
            r9 = r0
            r0 = r6
            androidx.compose.ui.input.pointer.NodeParent r0 = r0.root
            r1 = r7
            boolean r0 = r0.dispatchFinalEventPass(r1)
            if (r0 != 0) goto L45
            r0 = r10
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L47
        L45:
            r0 = 1
            r8 = r0
        L47:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.HitPathTracker.dispatchChanges(androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @NotNull
    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
