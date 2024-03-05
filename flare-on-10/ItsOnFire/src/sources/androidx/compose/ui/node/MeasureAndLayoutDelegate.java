package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��R\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010!\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\bJ\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0003J\u0018\u0010\"\u001a\u00020\b2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010$J\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0003J\u0010\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u000e\u0010(\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0003J\u001b\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0018ø\u0001��ø\u0001\u0001¢\u0006\u0004\b,\u0010-R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n��R\u0018\u0010\u0019\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringMeasureLayout", "", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParent", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "dispatchOnPositionedCallbacks", "", "forceDispatch", "doRemeasure", "layoutNode", "forceMeasureTheSubtree", "measureAndLayout", "onLayout", "Lkotlin/Function0;", "onNodeDetached", "node", "remeasureAndRelayoutIfNeeded", "requestRelayout", "requestRemeasure", "updateRootConstraints", "constraints", "updateRootConstraints-BRTryo0", "(J)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/MeasureAndLayoutDelegate.class */
public final class MeasureAndLayoutDelegate {
    @Nullable
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    @NotNull
    private final OnPositionedDispatcher onPositionedDispatcher;
    @NotNull
    private final List<LayoutNode> postponedMeasureRequests;
    @NotNull
    private final DepthSortedSet relayoutNodes;
    @NotNull
    private final LayoutNode root;
    @Nullable
    private Constraints rootConstraints;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/node/MeasureAndLayoutDelegate$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.NeedsRemeasure.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            iArr[LayoutNode.LayoutState.NeedsRelayout.ordinal()] = 4;
            iArr[LayoutNode.LayoutState.Ready.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSet depthSortedSet = new DepthSortedSet(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSet;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.measureIteration = 1L;
        ArrayList arrayList = new ArrayList();
        this.postponedMeasureRequests = arrayList;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(root, depthSortedSet, arrayList) : null;
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    private final boolean doRemeasure(LayoutNode layoutNode) {
        boolean m4055remeasure_Sx5XlM$ui_release$default;
        boolean z = true;
        if (layoutNode == this.root) {
            Constraints constraints = this.rootConstraints;
            Intrinsics.checkNotNull(constraints);
            m4055remeasure_Sx5XlM$ui_release$default = layoutNode.m4058remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m4055remeasure_Sx5XlM$ui_release$default = LayoutNode.m4055remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4055remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure(parent$ui_release);
            } else {
                if (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InLayoutBlock) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                requestRelayout(parent$ui_release);
            }
        }
        return m4055remeasure_Sx5XlM$ui_release$default;
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.NeedsRemeasure && (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getAlignmentLines$ui_release().getRequired$ui_release());
    }

    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode) {
        boolean z = false;
        if (layoutNode.isPlaced() || getCanAffectParent(layoutNode) || layoutNode.getAlignmentLines$ui_release().getRequired$ui_release()) {
            z = layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.NeedsRemeasure ? doRemeasure(layoutNode) : false;
            if (layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.NeedsRelayout && layoutNode.isPlaced()) {
                if (layoutNode == this.root) {
                    layoutNode.place$ui_release(0, 0);
                } else {
                    layoutNode.replace$ui_release();
                }
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
            if (!this.postponedMeasureRequests.isEmpty()) {
                List<LayoutNode> list = this.postponedMeasureRequests;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    LayoutNode layoutNode2 = list.get(i2);
                    if (layoutNode2.isAttached()) {
                        requestRemeasure(layoutNode2);
                    }
                }
                this.postponedMeasureRequests.clear();
            }
        }
        return z;
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode) {
        int i2;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.relayoutNodes.isEmpty()) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(layoutNode.getLayoutState$ui_release() != LayoutNode.LayoutState.NeedsRemeasure)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            if (layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.NeedsRemeasure) {
                return;
            }
            return;
        }
        LayoutNode[] content = mutableVector.getContent();
        int i3 = 0;
        do {
            LayoutNode layoutNode2 = content[i3];
            LayoutNode.LayoutState layoutState$ui_release = layoutNode2.getLayoutState$ui_release();
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.NeedsRemeasure;
            if (layoutState$ui_release == layoutState && this.relayoutNodes.remove(layoutNode2)) {
                remeasureAndRelayoutIfNeeded(layoutNode2);
            }
            if (layoutNode2.getLayoutState$ui_release() != layoutState) {
                forceMeasureTheSubtree(layoutNode2);
            }
            i2 = i3 + 1;
            i3 = i2;
        } while (i2 < size);
        if (layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.NeedsRemeasure || !this.relayoutNodes.remove(layoutNode)) {
            return;
        }
        remeasureAndRelayoutIfNeeded(layoutNode);
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.relayoutNodes.isEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean measureAndLayout(@Nullable Function0<Unit> function0) {
        if (this.root.isAttached()) {
            if (this.root.isPlaced()) {
                if (!this.duringMeasureLayout) {
                    boolean z = false;
                    if (this.rootConstraints == null) {
                        return false;
                    }
                    if (!this.relayoutNodes.isEmpty()) {
                        this.duringMeasureLayout = true;
                        try {
                            DepthSortedSet depthSortedSet = this.relayoutNodes;
                            z = false;
                            while (!depthSortedSet.isEmpty()) {
                                LayoutNode pop = depthSortedSet.pop();
                                boolean remeasureAndRelayoutIfNeeded = remeasureAndRelayoutIfNeeded(pop);
                                if (pop == this.root && remeasureAndRelayoutIfNeeded) {
                                    z = true;
                                }
                            }
                            this.duringMeasureLayout = false;
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } catch (Throwable th) {
                            this.duringMeasureLayout = false;
                            throw th;
                        }
                    }
                    return z;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void onNodeDetached(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.relayoutNodes.remove(node);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        boolean z = false;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.NeedsRelayout;
            layoutNode.setLayoutState$ui_release(layoutState);
            if (layoutNode.isPlaced()) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                LayoutNode.LayoutState layoutState$ui_release = parent$ui_release == null ? null : parent$ui_release.getLayoutState$ui_release();
                if (layoutState$ui_release != LayoutNode.LayoutState.NeedsRemeasure && layoutState$ui_release != layoutState) {
                    this.relayoutNodes.add(layoutNode);
                }
            }
            if (!this.duringMeasureLayout) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x007a, code lost:
        if (r3.duringMeasureLayout == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestRemeasure(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.LayoutNode r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "layoutNode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
            r5 = r0
            int[] r0 = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0
            r1 = r5
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L9b
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L9b
            r0 = r6
            r1 = 3
            if (r0 == r1) goto L80
            r0 = r6
            r1 = 4
            if (r0 == r1) goto L3b
            r0 = r6
            r1 = 5
            if (r0 != r1) goto L33
            goto L3b
        L33:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L3b:
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.NeedsRemeasure
            r8 = r0
            r0 = r4
            r1 = r8
            r0.setLayoutState$ui_release(r1)
            r0 = r4
            boolean r0 = r0.isPlaced()
            if (r0 != 0) goto L55
            r0 = r3
            r1 = r4
            boolean r0 = r0.getCanAffectParent(r1)
            if (r0 == 0) goto L76
        L55:
            r0 = r4
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L63
            r0 = 0
            r5 = r0
            goto L68
        L63:
            r0 = r5
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
            r5 = r0
        L68:
            r0 = r5
            r1 = r8
            if (r0 == r1) goto L76
            r0 = r3
            androidx.compose.ui.node.DepthSortedSet r0 = r0.relayoutNodes
            r1 = r4
            r0.add(r1)
        L76:
            r0 = r3
            boolean r0 = r0.duringMeasureLayout
            if (r0 != 0) goto L9b
            goto L9e
        L80:
            r0 = r3
            java.util.List<androidx.compose.ui.node.LayoutNode> r0 = r0.postponedMeasureRequests
            r1 = r4
            boolean r0 = r0.add(r1)
            r0 = r3
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r0 = r0.consistencyChecker
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L97
            goto L9b
        L97:
            r0 = r4
            r0.assertConsistent()
        L9b:
            r0 = 0
            r7 = r0
        L9e:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.requestRemeasure(androidx.compose.ui.node.LayoutNode):boolean");
    }

    /* renamed from: updateRootConstraints-BRTryo0 */
    public final void m4086updateRootConstraintsBRTryo0(long j2) {
        Constraints constraints = this.rootConstraints;
        if (constraints == null ? false : Constraints.m4745equalsimpl0(constraints.m4758unboximpl(), j2)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.rootConstraints = Constraints.m4740boximpl(j2);
        this.root.setLayoutState$ui_release(LayoutNode.LayoutState.NeedsRemeasure);
        this.relayoutNodes.add(this.root);
    }
}
