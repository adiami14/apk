package androidx.lifecycle;

import androidx.annotation.NonNull;
@Deprecated
/* loaded from: ItsOnFire.jar:androidx/lifecycle/LifecycleRegistryOwner.class */
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    LifecycleRegistry getLifecycle();
}
