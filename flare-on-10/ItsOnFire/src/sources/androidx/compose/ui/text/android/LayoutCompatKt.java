package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\u001a\u001e\u0010��\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"getLineForOffset", "", "Landroid/text/Layout;", "offset", "upstream", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/LayoutCompatKt.class */
public final class LayoutCompatKt {
    @InternalPlatformTextApi
    public static final int getLineForOffset(@NotNull Layout layout, @IntRange(from = 0) int i2, boolean z) {
        int i3;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                i3 = lineForOffset;
                if (z) {
                    i3 = lineForOffset - 1;
                }
            } else {
                i3 = z ? lineForOffset : lineForOffset + 1;
            }
            return i3;
        }
        return lineForOffset;
    }
}
