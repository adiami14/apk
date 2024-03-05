package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
/* loaded from: ItsOnFire.jar:androidx/savedstate/SavedStateRegistryController.class */
public final class SavedStateRegistryController {
    private final SavedStateRegistryOwner mOwner;
    private final SavedStateRegistry mRegistry = new SavedStateRegistry();

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.mOwner = savedStateRegistryOwner;
    }

    @NonNull
    public static SavedStateRegistryController create(@NonNull SavedStateRegistryOwner savedStateRegistryOwner) {
        return new SavedStateRegistryController(savedStateRegistryOwner);
    }

    @NonNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.mRegistry;
    }

    @MainThread
    public void performRestore(@Nullable Bundle bundle) {
        Lifecycle lifecycle = this.mOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new Recreator(this.mOwner));
        this.mRegistry.performRestore(lifecycle, bundle);
    }

    @MainThread
    public void performSave(@NonNull Bundle bundle) {
        this.mRegistry.performSave(bundle);
    }
}