package androidx.compose.ui.node;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b��\u0018��2\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\f\u0010\u0011\u001a\u00020\f*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "postponedMeasureRequests", "", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/LayoutTreeConsistencyChecker.class */
public final class LayoutTreeConsistencyChecker {
    @NotNull
    private final List<LayoutNode> postponedMeasureRequests;
    @NotNull
    private final DepthSortedSet relayoutNodes;
    @NotNull
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode root, @NotNull DepthSortedSet relayoutNodes, @NotNull List<LayoutNode> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = postponedMeasureRequests;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r5 == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean consistentLayoutState(androidx.compose.ui.node.LayoutNode r4) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutTreeConsistencyChecker.consistentLayoutState(androidx.compose.ui.node.LayoutNode):boolean");
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (consistentLayoutState(layoutNode)) {
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!isTreeConsistent(children$ui_release.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i2) {
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        int i3 = i2;
        if (nodeToString.length() > 0) {
            int i4 = 0;
            while (i4 < i2) {
                i4++;
                sb.append("..");
            }
            sb.append(nodeToString);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i3 = i2 + 1;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i5), i3);
        }
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
