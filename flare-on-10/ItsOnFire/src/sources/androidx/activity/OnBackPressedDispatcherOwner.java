package androidx.activity;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
/* loaded from: ItsOnFire.jar:androidx/activity/OnBackPressedDispatcherOwner.class */
public interface OnBackPressedDispatcherOwner extends LifecycleOwner {
    @NonNull
    OnBackPressedDispatcher getOnBackPressedDispatcher();
}
