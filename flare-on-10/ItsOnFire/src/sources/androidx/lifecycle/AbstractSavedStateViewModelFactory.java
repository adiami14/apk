package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
/* loaded from: ItsOnFire.jar:androidx/lifecycle/AbstractSavedStateViewModelFactory.class */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.KeyedFactory {
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final Bundle mDefaultArgs;
    private final Lifecycle mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    public AbstractSavedStateViewModelFactory(@NonNull SavedStateRegistryOwner savedStateRegistryOwner, @Nullable Bundle bundle) {
        this.mSavedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.mLifecycle = savedStateRegistryOwner.getLifecycle();
        this.mDefaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends ViewModel> T create(@NonNull String str, @NonNull Class<T> cls) {
        SavedStateHandleController create = SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        T t2 = (T) create(str, cls, create.getHandle());
        t2.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t2;
    }

    @NonNull
    public abstract <T extends ViewModel> T create(@NonNull String str, @NonNull Class<T> cls, @NonNull SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(@NonNull ViewModel viewModel) {
        SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }
}