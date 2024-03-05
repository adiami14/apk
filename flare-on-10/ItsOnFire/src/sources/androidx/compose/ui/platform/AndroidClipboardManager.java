package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\b��\u0018��2\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b��\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clipboardManager", "Landroid/content/ClipboardManager;", "(Landroid/content/ClipboardManager;)V", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "hasText", "", "setText", "", "annotatedString", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidClipboardManager.class */
public final class AndroidClipboardManager implements ClipboardManager {
    @NotNull
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(@NotNull android.content.ClipboardManager clipboardManager) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.clipboardManager = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidClipboardManager(@org.jetbrains.annotations.NotNull android.content.Context r5) {
        /*
            r4 = this;
            r0 = r5
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1a
            r0 = r4
            r1 = r5
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            r0.<init>(r1)
            return
        L1a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "null cannot be cast to non-null type android.content.ClipboardManager"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidClipboardManager.<init>(android.content.Context):void");
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    @Nullable
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        AnnotatedString annotatedString = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            annotatedString = AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt == null ? null : itemAt.getText());
        }
        return annotatedString;
    }

    public final boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        return primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/plain");
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }
}
