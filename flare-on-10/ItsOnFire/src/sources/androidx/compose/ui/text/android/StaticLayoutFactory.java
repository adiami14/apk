package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.appcompat.R;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\\\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\r\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\bÀ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÄ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0003\u0010\u0016\u001a\u00020\n2\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "()V", "delegate", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "create", "Landroid/text/StaticLayout;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "start", "", "end", "paint", "Landroid/text/TextPaint;", "width", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "hyphenationFrequency", "leftIndents", "", "rightIndents", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/StaticLayoutFactory.class */
public final class StaticLayoutFactory {
    @NotNull
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    @NotNull
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z, boolean z2, int i8, int i9, int[] iArr, int[] iArr2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i2 = 0;
        }
        if ((i10 & 4) != 0) {
            i3 = charSequence.length();
        }
        if ((i10 & 32) != 0) {
            textDirectionHeuristic = LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
        }
        if ((i10 & 64) != 0) {
            alignment = LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
        }
        if ((i10 & 128) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i10 & 256) != 0) {
            truncateAt = null;
        }
        if ((i10 & 512) != 0) {
            i6 = i4;
        }
        if ((i10 & 1024) != 0) {
            f2 = 1.0f;
        }
        if ((i10 & 2048) != 0) {
            f3 = 0.0f;
        }
        if ((i10 & 4096) != 0) {
            i7 = 0;
        }
        if ((i10 & 8192) != 0) {
            z = true;
        }
        if ((i10 & 16384) != 0) {
            z2 = true;
        }
        if ((32768 & i10) != 0) {
            i8 = 0;
        }
        if ((65536 & i10) != 0) {
            i9 = 0;
        }
        if ((131072 & i10) != 0) {
            iArr = null;
        }
        if ((i10 & 262144) != 0) {
            iArr2 = null;
        }
        return staticLayoutFactory.create(charSequence, i2, i3, textPaint, i4, textDirectionHeuristic, alignment, i5, truncateAt, i6, f2, f3, i7, z, z2, i8, i9, iArr, iArr2);
    }

    @NotNull
    public final StaticLayout create(@NotNull CharSequence text, int i2, int i3, @NotNull TextPaint paint, int i4, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, @IntRange(from = 0) int i5, @Nullable TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i6, @FloatRange(from = 0.0d) float f2, float f3, int i7, boolean z, boolean z2, int i8, int i9, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return delegate.create(new StaticLayoutParams(text, i2, i3, paint, i4, textDir, alignment, i5, truncateAt, i6, f2, f3, i7, z, z2, i8, i9, iArr, iArr2));
    }
}
