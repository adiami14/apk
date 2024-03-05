package androidx.lifecycle;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/lifecycle/DefaultLifecycleObserver.class */
public interface DefaultLifecycleObserver extends FullLifecycleObserver {
    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onPause(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onResume(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onStart(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onStop(@NonNull LifecycleOwner lifecycleOwner) {
    }
}