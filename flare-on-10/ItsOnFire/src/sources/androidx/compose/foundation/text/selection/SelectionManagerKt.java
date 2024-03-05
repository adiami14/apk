package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\u001a\u0018\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H��\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H��\u001a!\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\f\u0010\u0010\u001a\u00020\u000b*\u00020\u0011H��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"getCurrentSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "merge", "lhs", "rhs", "containsInclusive", "", "Landroidx/compose/ui/geometry/Rect;", "offset", "Landroidx/compose/ui/geometry/Offset;", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "visibleBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/SelectionManagerKt.class */
public final class SelectionManagerKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        if ((r0 <= r0 && r0 <= r0) != false) goto L15;
     */
    /* renamed from: containsInclusive-Uv8p0NA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m1086containsInclusiveUv8p0NA(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.Rect r3, long r4) {
        /*
            r0 = r3
            java.lang.String r1 = "$this$containsInclusive"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            float r0 = r0.getLeft()
            r6 = r0
            r0 = r3
            float r0 = r0.getRight()
            r7 = r0
            r0 = r4
            float r0 = androidx.compose.ui.geometry.Offset.m2167getXimpl(r0)
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r6
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L2f
            r0 = r8
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L2f
            r0 = 1
            r10 = r0
            goto L32
        L2f:
            r0 = 0
            r10 = r0
        L32:
            r0 = r10
            if (r0 == 0) goto L68
            r0 = r3
            float r0 = r0.getTop()
            r7 = r0
            r0 = r3
            float r0 = r0.getBottom()
            r6 = r0
            r0 = r4
            float r0 = androidx.compose.ui.geometry.Offset.m2168getYimpl(r0)
            r8 = r0
            r0 = r7
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L5d
            r0 = r8
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L5d
            r0 = 1
            r10 = r0
            goto L60
        L5d:
            r0 = 0
            r10 = r0
        L60:
            r0 = r10
            if (r0 == 0) goto L68
            goto L6b
        L68:
            r0 = 0
            r9 = r0
        L6b:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManagerKt.m1086containsInclusiveUv8p0NA(androidx.compose.ui.geometry.Rect, long):boolean");
    }

    @NotNull
    public static final AnnotatedString getCurrentSelectedText(@NotNull Selectable selectable, @NotNull Selection selection) {
        Selection.AnchorInfo end;
        Selection.AnchorInfo end2;
        int offset;
        int length;
        AnnotatedString subSequence;
        Selection.AnchorInfo end3;
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selection, "selection");
        AnnotatedString text = selectable.getText();
        if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
                if (selection.getHandlesCrossed()) {
                    offset = selection.getEnd().getOffset();
                    end3 = selection.getStart();
                } else {
                    offset = selection.getStart().getOffset();
                    end3 = selection.getEnd();
                }
                length = end3.getOffset();
            } else if (selectable.getSelectableId() == selection.getStart().getSelectableId()) {
                if (selection.getHandlesCrossed()) {
                    end = selection.getStart();
                    subSequence = text.subSequence(0, end.getOffset());
                } else {
                    end2 = selection.getStart();
                    offset = end2.getOffset();
                    length = text.length();
                }
            } else if (selection.getHandlesCrossed()) {
                end2 = selection.getEnd();
                offset = end2.getOffset();
                length = text.length();
            } else {
                end = selection.getEnd();
                subSequence = text.subSequence(0, end.getOffset());
            }
            subSequence = text.subSequence(offset, length);
        } else {
            subSequence = text;
        }
        return subSequence;
    }

    @Nullable
    public static final Selection merge(@Nullable Selection selection, @Nullable Selection selection2) {
        Selection merge;
        if (selection != null && (merge = selection.merge(selection2)) != null) {
            selection2 = merge;
        }
        return selection2;
    }

    @NotNull
    public static final Rect visibleBounds(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m2206Rect0a9Yr6o(layoutCoordinates.mo3931windowToLocalMKHz9U(boundsInWindow.m2203getTopLeftF1C5BW0()), layoutCoordinates.mo3931windowToLocalMKHz9U(boundsInWindow.m2197getBottomRightF1C5BW0()));
    }
}
