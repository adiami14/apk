package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@InternalPlatformTextApi
@Metadata(d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\r\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\b\u0007\u0018��2\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u000e\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\tJ\u000e\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u00109\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\tJ\u000e\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tJ\u000e\u0010>\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tJ\u000e\u0010?\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tJ\u000e\u0010@\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tJ\u000e\u0010A\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u0010B\u001a\u00020\u00052\u0006\u00104\u001a\u00020\tJ\u000e\u0010C\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u0010D\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tJ\u0016\u0010E\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u0010F\u001a\u00020\u0005J\u000e\u0010G\u001a\u00020\t2\u0006\u00104\u001a\u00020\tJ\u000e\u0010H\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\tJ\u000e\u0010I\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\tJ\u001e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020\u00102\u0006\u00107\u001a\u00020\tJ\u000e\u0010Q\u001a\u00020\u00102\u0006\u00107\u001a\u00020\tJ\u000e\u0010R\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\tJ\u000e\u0010S\u001a\u00020K2\u0006\u0010T\u001a\u00020UR\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n��\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006V"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "charSequence", "", "width", "", "textPaint", "Landroid/text/TextPaint;", "alignment", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "includePadding", "", "maxLines", "breakStrategy", "hyphenationFrequency", "justificationMode", "leftIndents", "", "rightIndents", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "height", "getHeight", "()I", "layout", "Landroid/text/Layout;", "getLayout$annotations", "()V", "getLayout", "()Landroid/text/Layout;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "lineCount", "getLineCount", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "getText", "()Ljava/lang/CharSequence;", "getLineBaseline", "line", "getLineBottom", "getLineEllipsisCount", "lineIndex", "getLineEllipsisOffset", "getLineEnd", "getLineForOffset", "offset", "getLineForVertical", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineVisibleEnd", "getLineWidth", "getOffsetForHorizontal", "horizontal", "getParagraphDirection", "getPrimaryHorizontal", "getSecondaryHorizontal", "getSelectionPath", "", "start", "end", "dest", "Landroid/graphics/Path;", "isEllipsisApplied", "isLineEllipsized", "isRtlCharAt", "paint", "canvas", "Landroid/graphics/Canvas;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/TextLayout.class */
public final class TextLayout {
    private final boolean didExceedMaxLines;
    @NotNull
    private final Layout layout;
    @NotNull
    private final LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;

    public TextLayout(@NotNull CharSequence charSequence, float f2, @NotNull TextPaint textPaint, int i2, @Nullable TextUtils.TruncateAt truncateAt, int i3, float f3, @Px float f4, boolean z, int i4, int i5, int i6, int i7, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        this.layoutIntrinsics = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic = TextLayoutKt.getTextDirectionHeuristic(i3);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i2);
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
        double d2 = f2;
        int ceil = (int) Math.ceil(d2);
        BoringLayout create$default = (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f2 || z2) ? StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, charSequence, 0, charSequence.length(), textPaint, ceil, textDirectionHeuristic, alignment, i4, truncateAt, (int) Math.ceil(d2), f3, f4, i7, z, false, i5, i6, iArr, iArr2, 16384, null) : BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z, truncateAt, ceil);
        this.layout = create$default;
        int min = Math.min(create$default.getLineCount(), i4);
        this.lineCount = min;
        this.didExceedMaxLines = min >= i4 && (create$default.getEllipsisCount(min - 1) > 0 || create$default.getLineEnd(min - 1) != charSequence.length());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r19, float r20, android.text.TextPaint r21, int r22, android.text.TextUtils.TruncateAt r23, int r24, float r25, float r26, boolean r27, int r28, int r29, int r30, int r31, int[] r32, int[] r33, androidx.compose.ui.text.android.LayoutIntrinsics r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final int getHeight() {
        return this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight();
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineBaseline(int i2) {
        return this.layout.getLineBaseline(i2);
    }

    public final float getLineBottom(int i2) {
        return this.layout.getLineBottom(i2);
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEllipsisCount(int i2) {
        return this.layout.getEllipsisCount(i2);
    }

    public final int getLineEllipsisOffset(int i2) {
        return this.layout.getEllipsisStart(i2);
    }

    public final int getLineEnd(int i2) {
        int ellipsisStart = this.layout.getEllipsisStart(i2);
        Layout layout = this.layout;
        return ellipsisStart == 0 ? layout.getLineEnd(i2) : layout.getText().length();
    }

    public final int getLineForOffset(int i2) {
        return this.layout.getLineForOffset(i2);
    }

    public final int getLineForVertical(int i2) {
        return this.layout.getLineForVertical(i2);
    }

    public final float getLineHeight(int i2) {
        return this.layout.getLineBottom(i2) - this.layout.getLineTop(i2);
    }

    public final float getLineLeft(int i2) {
        return this.layout.getLineLeft(i2);
    }

    public final float getLineRight(int i2) {
        return this.layout.getLineRight(i2);
    }

    public final int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    public final float getLineTop(int i2) {
        return this.layout.getLineTop(i2);
    }

    public final int getLineVisibleEnd(int i2) {
        int ellipsisStart;
        if (this.layout.getEllipsisStart(i2) == 0) {
            ellipsisStart = this.layout.getLineVisibleEnd(i2);
        } else {
            ellipsisStart = this.layout.getEllipsisStart(i2) + this.layout.getLineStart(i2);
        }
        return ellipsisStart;
    }

    public final float getLineWidth(int i2) {
        return this.layout.getLineWidth(i2);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i2, float f2) {
        return this.layout.getOffsetForHorizontal(i2, f2);
    }

    public final int getParagraphDirection(int i2) {
        return this.layout.getParagraphDirection(i2);
    }

    public final float getPrimaryHorizontal(int i2) {
        return this.layout.getPrimaryHorizontal(i2);
    }

    public final float getSecondaryHorizontal(int i2) {
        return this.layout.getSecondaryHorizontal(i2);
    }

    public final void getSelectionPath(int i2, int i3, @NotNull Path dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.layout.getSelectionPath(i2, i3, dest);
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    public final boolean isEllipsisApplied(int i2) {
        return this.layout.getEllipsisCount(i2) > 0;
    }

    public final boolean isLineEllipsized(int i2) {
        return this.layout.getEllipsisStart(i2) != 0;
    }

    public final boolean isRtlCharAt(int i2) {
        return this.layout.isRtlCharAt(i2);
    }

    public final void paint(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.layout.draw(canvas);
    }
}
