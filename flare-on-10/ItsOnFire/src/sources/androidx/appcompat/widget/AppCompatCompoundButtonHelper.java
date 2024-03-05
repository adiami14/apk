package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/AppCompatCompoundButtonHelper.class */
class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    @NonNull
    private final CompoundButton mView;

    public AppCompatCompoundButtonHelper(@NonNull CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    public void applyButtonTint() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.mHasButtonTint) {
                    DrawableCompat.setTintList(mutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    DrawableCompat.setTintMode(mutate, this.mButtonTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(mutate);
            }
        }
    }

    public int getCompoundPaddingLeft(int i2) {
        return i2;
    }

    public ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCompoundButtonHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyButtonTint();
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }
}
