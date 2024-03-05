package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.runtime.R;
/* loaded from: ItsOnFire.jar:androidx/lifecycle/ViewTreeLifecycleOwner.class */
public class ViewTreeLifecycleOwner {
    private ViewTreeLifecycleOwner() {
    }

    @Nullable
    public static LifecycleOwner get(@NonNull View view) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) view.getTag(R.id.view_tree_lifecycle_owner);
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (lifecycleOwner2 != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            lifecycleOwner2 = (LifecycleOwner) view.getTag(R.id.view_tree_lifecycle_owner);
        }
        return lifecycleOwner2;
    }

    public static void set(@NonNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
