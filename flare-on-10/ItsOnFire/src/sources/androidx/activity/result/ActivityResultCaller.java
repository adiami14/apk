package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/activity/result/ActivityResultCaller.class */
public interface ActivityResultCaller {
    @NonNull
    <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback);

    @NonNull
    <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull ActivityResultCallback<O> activityResultCallback);
}