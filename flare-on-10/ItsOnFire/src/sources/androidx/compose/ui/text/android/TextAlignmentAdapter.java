package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n��\bÀ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "()V", "ALIGN_LEFT_FRAMEWORK", "Landroid/text/Layout$Alignment;", "ALIGN_RIGHT_FRAMEWORK", "get", "value", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/TextAlignmentAdapter.class */
public final class TextAlignmentAdapter {
    @NotNull
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;
    @NotNull
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;
    @NotNull
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int length = values.length;
        int i2 = 0;
        Layout.Alignment alignment2 = alignment;
        while (i2 < length) {
            Layout.Alignment alignment3 = values[i2];
            int i3 = i2 + 1;
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
                i2 = i3;
            } else {
                i2 = i3;
                if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                    alignment2 = alignment3;
                    i2 = i3;
                }
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    private TextAlignmentAdapter() {
    }

    @NotNull
    public final Layout.Alignment get(int i2) {
        Layout.Alignment alignment;
        if (i2 != 0) {
            if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i2 == 3) {
                alignment = ALIGN_LEFT_FRAMEWORK;
            } else if (i2 == 4) {
                alignment = ALIGN_RIGHT_FRAMEWORK;
            }
            return alignment;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        return alignment;
    }
}
