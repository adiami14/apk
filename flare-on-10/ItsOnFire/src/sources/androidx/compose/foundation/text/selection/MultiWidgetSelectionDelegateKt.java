package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��F\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0005H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"getAssembledSelectionInfo", "Landroidx/compose/foundation/text/selection/Selection;", "newSelectionRange", "Landroidx/compose/ui/text/TextRange;", "handlesCrossed", "", "selectableId", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getAssembledSelectionInfo-vJH6DeI", "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "getOffsetForPosition", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getTextSelectionInfo", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "isStartHandle", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt.class */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: access$getAssembledSelectionInfo-vJH6DeI */
    public static final /* synthetic */ Selection m1049access$getAssembledSelectionInfovJH6DeI(long j2, boolean z, long j3, TextLayoutResult textLayoutResult) {
        return m1050getAssembledSelectionInfovJH6DeI(j2, z, j3, textLayoutResult);
    }

    /* renamed from: getAssembledSelectionInfo-vJH6DeI */
    public static final Selection m1050getAssembledSelectionInfovJH6DeI(long j2, boolean z, long j3, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m4475getStartimpl(j2)), TextRange.m4475getStartimpl(j2), j3), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m4470getEndimpl(j2) - 1, 0)), TextRange.m4470getEndimpl(j2), j3), z);
    }

    /* renamed from: getOffsetForPosition-0AR0LA0 */
    public static final int m1051getOffsetForPosition0AR0LA0(@NotNull TextLayoutResult textLayoutResult, @NotNull Rect bounds, long j2) {
        int coerceIn;
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m2194containsk4lQ0M(j2)) {
            coerceIn = RangesKt___RangesKt.coerceIn(textLayoutResult.m4456getOffsetForPositionk4lQ0M(j2), 0, length);
            length = coerceIn;
        } else if (SelectionMode.Vertical.mo1089compare3MmeM6k$foundation_release(j2, bounds) < 0) {
            length = 0;
        }
        return length;
    }

    @NotNull
    /* renamed from: getTextSelectionInfo-yM0VcXU */
    public static final Pair<Selection, Boolean> m1052getTextSelectionInfoyM0VcXU(@NotNull TextLayoutResult textLayoutResult, long j2, long j3, @Nullable Offset offset, long j4, @NotNull SelectionAdjustment adjustment, @Nullable Selection selection, boolean z) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m4951getWidthimpl(textLayoutResult.m4457getSizeYbymL2g()), IntSize.m4950getHeightimpl(textLayoutResult.m4457getSizeYbymL2g()));
        if (SelectionMode.Vertical.m1090isSelected2x9bVx0$foundation_release(rect, j2, j3)) {
            int m1051getOffsetForPosition0AR0LA0 = m1051getOffsetForPosition0AR0LA0(textLayoutResult, rect, j2);
            int m1051getOffsetForPosition0AR0LA02 = m1051getOffsetForPosition0AR0LA0(textLayoutResult, rect, j3);
            int m1051getOffsetForPosition0AR0LA03 = offset == null ? -1 : m1051getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.m2177unboximpl());
            long mo1057adjustZXO7KMw = adjustment.mo1057adjustZXO7KMw(textLayoutResult, TextRangeKt.TextRange(m1051getOffsetForPosition0AR0LA0, m1051getOffsetForPosition0AR0LA02), m1051getOffsetForPosition0AR0LA03, z, selection == null ? null : TextRange.m4463boximpl(selection.m1055toTextRanged9O1mEE()));
            Selection m1050getAssembledSelectionInfovJH6DeI = m1050getAssembledSelectionInfovJH6DeI(mo1057adjustZXO7KMw, TextRange.m4474getReversedimpl(mo1057adjustZXO7KMw), j4, textLayoutResult);
            boolean areEqual = Intrinsics.areEqual(m1050getAssembledSelectionInfovJH6DeI, selection);
            boolean z2 = !z ? m1051getOffsetForPosition0AR0LA02 == m1051getOffsetForPosition0AR0LA03 : m1051getOffsetForPosition0AR0LA0 == m1051getOffsetForPosition0AR0LA03;
            boolean z3 = true;
            if (!z2) {
                z3 = areEqual ^ true;
            }
            return new Pair<>(m1050getAssembledSelectionInfovJH6DeI, Boolean.valueOf(z3));
        }
        return new Pair<>(null, Boolean.FALSE);
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU$default */
    public static /* synthetic */ Pair m1053getTextSelectionInfoyM0VcXU$default(TextLayoutResult textLayoutResult, long j2, long j3, Offset offset, long j4, SelectionAdjustment selectionAdjustment, Selection selection, boolean z, int i2, Object obj) {
        if ((i2 & 64) != 0) {
            selection = null;
        }
        if ((i2 & 128) != 0) {
            z = true;
        }
        return m1052getTextSelectionInfoyM0VcXU(textLayoutResult, j2, j3, offset, j4, selectionAdjustment, selection, z);
    }
}
