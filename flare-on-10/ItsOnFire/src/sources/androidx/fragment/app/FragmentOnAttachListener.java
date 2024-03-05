package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/fragment/app/FragmentOnAttachListener.class */
public interface FragmentOnAttachListener {
    @MainThread
    void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment);
}
