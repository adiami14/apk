package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
/* loaded from: ItsOnFire.jar:androidx/core/view/MenuHost.class */
public interface MenuHost {
    void addMenuProvider(@NonNull MenuProvider menuProvider);

    void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(@NonNull MenuProvider menuProvider);
}
