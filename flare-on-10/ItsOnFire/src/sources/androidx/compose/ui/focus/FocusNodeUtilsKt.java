package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��*\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010!\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH��\u001a&\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\b\u001a\u00020\tH��\"\u000e\u0010��\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n��¨\u0006\r"}, d2 = {"FocusTag", "", "findFocusableChildren", "", "Landroidx/compose/ui/node/LayoutNode;", "focusableChildren", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "excludeDeactivated", "", "searchChildrenForFocusNode", "queue", "Landroidx/compose/runtime/collection/MutableVector;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusNodeUtilsKt.class */
public final class FocusNodeUtilsKt {
    @NotNull
    public static final String FocusTag = "Compose Focus";

    public static final void findFocusableChildren(@NotNull LayoutNode layoutNode, @NotNull List<ModifiedFocusNode> focusableChildren, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(focusableChildren, "focusableChildren");
        ModifiedFocusNode findNextFocusWrapper = layoutNode.getOuterLayoutNodeWrapper$ui_release().findNextFocusWrapper(z);
        if ((findNextFocusWrapper == null ? null : Boolean.valueOf(focusableChildren.add(findNextFocusWrapper))) == null) {
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                findFocusableChildren(children$ui_release.get(i2), focusableChildren, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.node.ModifiedFocusNode searchChildrenForFocusNode(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.LayoutNode r4, @org.jetbrains.annotations.NotNull androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> r5, boolean r6) {
        /*
            r0 = r4
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            java.lang.String r1 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            androidx.compose.runtime.collection.MutableVector r0 = r0.get_children$ui_release()
            r4 = r0
            r0 = r4
            int r0 = r0.getSize()
            r7 = r0
            r0 = r7
            if (r0 <= 0) goto L54
            r0 = r4
            java.lang.Object[] r0 = r0.getContent()
            r8 = r0
            r0 = 0
            r9 = r0
        L23:
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            androidx.compose.ui.node.LayoutNode r0 = (androidx.compose.ui.node.LayoutNode) r0
            r10 = r0
            r0 = r10
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.getOuterLayoutNodeWrapper$ui_release()
            r1 = r6
            androidx.compose.ui.node.ModifiedFocusNode r0 = r0.findNextFocusWrapper(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L3d
            r0 = r4
            return r0
        L3d:
            r0 = r5
            r1 = r10
            boolean r0 = r0.add(r1)
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            r1 = r7
            if (r0 < r1) goto L23
        L54:
            r0 = r5
            boolean r0 = r0.isNotEmpty()
            if (r0 == 0) goto L6f
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.removeAt(r1)
            androidx.compose.ui.node.LayoutNode r0 = (androidx.compose.ui.node.LayoutNode) r0
            r1 = r5
            r2 = r6
            androidx.compose.ui.node.ModifiedFocusNode r0 = searchChildrenForFocusNode(r0, r1, r2)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L54
            r0 = r4
            return r0
        L6f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusNodeUtilsKt.searchChildrenForFocusNode(androidx.compose.ui.node.LayoutNode, androidx.compose.runtime.collection.MutableVector, boolean):androidx.compose.ui.node.ModifiedFocusNode");
    }

    public static /* synthetic */ ModifiedFocusNode searchChildrenForFocusNode$default(LayoutNode layoutNode, MutableVector mutableVector, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutableVector = new MutableVector(new LayoutNode[16], 0);
        }
        return searchChildrenForFocusNode(layoutNode, mutableVector, z);
    }
}
