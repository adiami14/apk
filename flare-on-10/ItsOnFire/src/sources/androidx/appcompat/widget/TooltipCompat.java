package androidx.appcompat.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/TooltipCompat.class */
public class TooltipCompat {
    private TooltipCompat() {
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
