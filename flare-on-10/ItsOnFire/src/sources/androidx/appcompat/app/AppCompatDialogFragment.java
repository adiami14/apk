package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
/* loaded from: ItsOnFire.jar:androidx/appcompat/app/AppCompatDialogFragment.class */
public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
    }

    public AppCompatDialogFragment(@LayoutRes int i2) {
        super(i2);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new AppCompatDialog(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i2) {
        if (!(dialog instanceof AppCompatDialog)) {
            super.setupDialog(dialog, i2);
            return;
        }
        AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        appCompatDialog.supportRequestWindowFeature(1);
    }
}
