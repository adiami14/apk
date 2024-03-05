package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/TypefaceEmojiSpan.class */
public final class TypefaceEmojiSpan extends EmojiSpan {
    @Nullable
    private static Paint sDebugPaint;

    public TypefaceEmojiSpan(@NonNull EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    @NonNull
    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, float f2, int i4, int i5, int i6, @NonNull Paint paint) {
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f2, i4, f2 + getWidth(), i6, getDebugPaint());
        }
        getMetadata().draw(canvas, f2, i5, paint);
    }
}
