package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ThemedSpinnerAdapter.class */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ThemedSpinnerAdapter$Helper.class */
    public static final class Helper {
        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public Helper(@NonNull Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.mDropDownInflater;
            if (layoutInflater == null) {
                layoutInflater = this.mInflater;
            }
            return layoutInflater;
        }

        @Nullable
        public Resources.Theme getDropDownViewTheme() {
            LayoutInflater layoutInflater = this.mDropDownInflater;
            return layoutInflater == null ? null : layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(@Nullable Resources.Theme theme) {
            this.mDropDownInflater = theme == null ? null : theme == this.mContext.getTheme() ? this.mInflater : LayoutInflater.from(new ContextThemeWrapper(this.mContext, theme));
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
