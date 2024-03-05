package androidx.lifecycle;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {1, 0, 3}, d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u001a\f\u0010��\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/view/View;", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: ItsOnFire.jar:androidx/lifecycle/ViewTreeViewModelKt.class */
public final class ViewTreeViewModelKt {
    @Nullable
    public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(@NotNull View findViewTreeViewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(findViewTreeViewModelStoreOwner, "$this$findViewTreeViewModelStoreOwner");
        return ViewTreeViewModelStoreOwner.get(findViewTreeViewModelStoreOwner);
    }
}
