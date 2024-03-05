package androidx.core.content;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
/* loaded from: ItsOnFire.jar:androidx/core/content/OnConfigurationChangedProvider.class */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer);

    void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer);
}
