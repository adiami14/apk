package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/AppCompatCheckedTextViewHelper.class */
class AppCompatCheckedTextViewHelper {
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    @NonNull
    private final CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(@NonNull CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    public void applyCheckMarkTint() {
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                Drawable mutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.mHasCheckMarkTint) {
                    DrawableCompat.setTintList(mutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    DrawableCompat.setTintMode(mutate, this.mCheckMarkTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(mutate);
            }
        }
    }

    public ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:3:0x0030, B:5:0x003c, B:7:0x0047, B:12:0x0063, B:14:0x006f, B:16:0x007a, B:17:0x008b, B:17:0x008b, B:18:0x008e, B:20:0x0097, B:21:0x00a3, B:21:0x00a3, B:22:0x00a6, B:24:0x00af), top: B:33:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:3:0x0030, B:5:0x003c, B:7:0x0047, B:12:0x0063, B:14:0x006f, B:16:0x007a, B:17:0x008b, B:17:0x008b, B:18:0x008e, B:20:0x0097, B:21:0x00a3, B:21:0x00a3, B:22:0x00a6, B:24:0x00af), top: B:33:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:3:0x0030, B:5:0x003c, B:7:0x0047, B:12:0x0063, B:14:0x006f, B:16:0x007a, B:17:0x008b, B:17:0x008b, B:18:0x008e, B:20:0x0097, B:21:0x00a3, B:21:0x00a3, B:22:0x00a6, B:24:0x00af), top: B:33:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextViewHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}
