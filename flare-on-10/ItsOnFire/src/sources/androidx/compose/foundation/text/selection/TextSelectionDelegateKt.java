package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H��ø\u0001��¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offset", "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/TextSelectionDelegateKt.class */
public final class TextSelectionDelegateKt {
    public static final long getSelectionHandleCoordinates(@NotNull TextLayoutResult textLayoutResult, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        int max = ((!z || z2) && (z || !z2)) ? Math.max(i2 - 1, 0) : i2;
        boolean z3 = false;
        if (textLayoutResult.getBidiRunDirection(max) == textLayoutResult.getParagraphDirection(i2)) {
            z3 = true;
        }
        return OffsetKt.Offset(textLayoutResult.getHorizontalPosition(i2, z3), textLayoutResult.getLineBottom(lineForOffset));
    }
}
