package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.appcompat.R;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\r\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\bÀ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\nJ\"\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "()V", "create", "Landroid/text/BoringLayout;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "paint", "Landroid/text/TextPaint;", "width", "", "metrics", "Landroid/text/BoringLayout$Metrics;", "alignment", "Landroid/text/Layout$Alignment;", "includePadding", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "measure", "textDir", "Landroid/text/TextDirectionHeuristic;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/BoringLayoutFactory.class */
public final class BoringLayoutFactory {
    @NotNull
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory boringLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        if ((i4 & 32) != 0) {
            z = true;
        }
        if ((i4 & 64) != 0) {
            truncateAt = null;
        }
        if ((i4 & 128) != 0) {
            i3 = i2;
        }
        return boringLayoutFactory.create(charSequence, textPaint, i2, metrics, alignment, z, truncateAt, i3);
    }

    @NotNull
    public final BoringLayout create(@NotNull CharSequence text, @NotNull TextPaint paint, int i2, @NotNull BoringLayout.Metrics metrics, @NotNull Layout.Alignment alignment, boolean z, @Nullable TextUtils.TruncateAt truncateAt, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        boolean z2 = i2 >= 0;
        if (z2) {
            if (i3 >= 0 ? z2 : false) {
                return truncateAt == null ? new BoringLayout(text, paint, i2, alignment, 1.0f, 0.0f, metrics, z) : new BoringLayout(text, paint, i2, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i3);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Nullable
    public final BoringLayout.Metrics measure(@NotNull CharSequence text, @Nullable TextPaint textPaint, @NotNull TextDirectionHeuristic textDir) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        boolean isRtl = textDir.isRtl(text, 0, text.length());
        BoringLayout.Metrics metrics = null;
        if (!isRtl) {
            metrics = BoringLayout.isBoring(text, textPaint, null);
        }
        return metrics;
    }
}
