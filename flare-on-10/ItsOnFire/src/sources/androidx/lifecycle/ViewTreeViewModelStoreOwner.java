package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.viewmodel.R;
/* loaded from: ItsOnFire.jar:androidx/lifecycle/ViewTreeViewModelStoreOwner.class */
public class ViewTreeViewModelStoreOwner {
    private ViewTreeViewModelStoreOwner() {
    }

    @Nullable
    public static ViewModelStoreOwner get(@NonNull View view) {
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) view.getTag(R.id.view_tree_view_model_store_owner);
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if (viewModelStoreOwner != null) {
            return viewModelStoreOwner;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (viewModelStoreOwner2 != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            viewModelStoreOwner2 = (ViewModelStoreOwner) view.getTag(R.id.view_tree_view_model_store_owner);
        }
        return viewModelStoreOwner2;
    }

    public static void set(@NonNull View view, @Nullable ViewModelStoreOwner viewModelStoreOwner) {
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
