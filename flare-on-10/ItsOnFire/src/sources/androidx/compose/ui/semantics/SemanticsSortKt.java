package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.semantics.NodeLocationHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��(\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010!\n��\n\u0002\u0018\u0002\n��\u001a\"\u0010��\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H��\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH��\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0001H��¨\u0006\f"}, d2 = {"findNodeByPredicateTraversal", "Landroidx/compose/ui/node/LayoutNode;", "predicate", "Lkotlin/Function1;", "", "findOneLayerOfSemanticsWrappersSortedByBounds", "", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "list", "", "findWrapperToGetBounds", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/semantics/SemanticsSortKt.class */
public final class SemanticsSortKt {
    @Nullable
    public static final LayoutNode findNodeByPredicateTraversal(@NotNull LayoutNode layoutNode, @NotNull Function1<? super LayoutNode, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(layoutNode).booleanValue()) {
            return layoutNode;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode findNodeByPredicateTraversal = findNodeByPredicateTraversal(children$ui_release.get(i2), predicate);
            if (findNodeByPredicateTraversal != null) {
                return findNodeByPredicateTraversal;
            }
        }
        return null;
    }

    @NotNull
    public static final List<SemanticsWrapper> findOneLayerOfSemanticsWrappersSortedByBounds(@NotNull LayoutNode layoutNode, @NotNull List<SemanticsWrapper> list) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        if (layoutNode.isAttached()) {
            ArrayList arrayList = new ArrayList();
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutNode layoutNode2 = children$ui_release.get(i2);
                if (layoutNode2.isAttached()) {
                    arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
                }
            }
            List<NodeLocationHolder> findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy = findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(arrayList);
            ArrayList arrayList2 = new ArrayList(findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.size());
            int size2 = findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.get(i3).getNode$ui_release());
            }
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i4);
                SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode3);
                if (outerSemantics != null) {
                    list.add(outerSemantics);
                } else {
                    findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode3, list);
                }
            }
            return list;
        }
        return list;
    }

    public static /* synthetic */ List findOneLayerOfSemanticsWrappersSortedByBounds$default(LayoutNode layoutNode, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode, list);
    }

    private static final List<NodeLocationHolder> findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(List<NodeLocationHolder> list) {
        List<NodeLocationHolder> mutableList;
        List<NodeLocationHolder> list2;
        List<NodeLocationHolder> mutableList2;
        try {
            NodeLocationHolder.Companion.setComparisonStrategy$ui_release(NodeLocationHolder.ComparisonStrategy.Stripe);
            mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            CollectionsKt__MutableCollectionsJVMKt.sort(mutableList2);
            list2 = mutableList2;
        } catch (IllegalArgumentException e2) {
            NodeLocationHolder.Companion.setComparisonStrategy$ui_release(NodeLocationHolder.ComparisonStrategy.Location);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            list2 = mutableList;
            CollectionsKt__MutableCollectionsJVMKt.sort(list2);
        }
        return list2;
    }

    @NotNull
    public static final LayoutNodeWrapper findWrapperToGetBounds(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        SemanticsWrapper outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(layoutNode);
        SemanticsWrapper semanticsWrapper = outerMergingSemantics;
        if (outerMergingSemantics == null) {
            SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
            semanticsWrapper = outerSemantics;
            if (outerSemantics == null) {
                semanticsWrapper = layoutNode.getInnerLayoutNodeWrapper$ui_release();
            }
        }
        return semanticsWrapper;
    }
}
