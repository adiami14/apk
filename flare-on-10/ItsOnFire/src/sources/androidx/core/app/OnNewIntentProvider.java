package androidx.core.app;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
/* loaded from: ItsOnFire.jar:androidx/core/app/OnNewIntentProvider.class */
public interface OnNewIntentProvider {
    void addOnNewIntentListener(@NonNull Consumer<Intent> consumer);

    void removeOnNewIntentListener(@NonNull Consumer<Intent> consumer);
}
