package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:androidx/core/widget/TintableCompoundDrawablesView.class */
public interface TintableCompoundDrawablesView {
    @Nullable
    ColorStateList getSupportCompoundDrawablesTintList();

    @Nullable
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode);
}
