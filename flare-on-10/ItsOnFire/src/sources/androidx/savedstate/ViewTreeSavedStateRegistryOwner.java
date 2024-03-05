package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:androidx/savedstate/ViewTreeSavedStateRegistryOwner.class */
public final class ViewTreeSavedStateRegistryOwner {
    private ViewTreeSavedStateRegistryOwner() {
    }

    @Nullable
    public static SavedStateRegistryOwner get(@NonNull View view) {
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) view.getTag(R.id.view_tree_saved_state_registry_owner);
        SavedStateRegistryOwner savedStateRegistryOwner2 = savedStateRegistryOwner;
        if (savedStateRegistryOwner != null) {
            return savedStateRegistryOwner;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (savedStateRegistryOwner2 != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            savedStateRegistryOwner2 = (SavedStateRegistryOwner) view.getTag(R.id.view_tree_saved_state_registry_owner);
        }
        return savedStateRegistryOwner2;
    }

    public static void set(@NonNull View view, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
