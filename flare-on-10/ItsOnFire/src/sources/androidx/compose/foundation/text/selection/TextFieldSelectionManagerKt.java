package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H��¨\u0006\n"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/TextFieldSelectionManagerKt.class */
public final class TextFieldSelectionManagerKt {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0052, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L11;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextFieldSelectionHandle(final boolean r12, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.style.ResolvedTextDirection r13, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.selection.TextFieldSelectionManager r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(boolean, androidx.compose.ui.text.style.ResolvedTextDirection, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final boolean isSelectionHandleInVisibleBound(@NotNull TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        boolean m1086containsInclusiveUv8p0NA;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null) {
            m1086containsInclusiveUv8p0NA = false;
        } else {
            LayoutCoordinates layoutCoordinates = state$foundation_release.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                m1086containsInclusiveUv8p0NA = false;
            } else {
                Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
                m1086containsInclusiveUv8p0NA = visibleBounds == null ? false : SelectionManagerKt.m1086containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1104getHandlePositiontuRUvjQ$foundation_release(z));
            }
        }
        return m1086containsInclusiveUv8p0NA;
    }
}
