package androidx.core.app;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
/* loaded from: ItsOnFire.jar:androidx/core/app/OnMultiWindowModeChangedProvider.class */
public interface OnMultiWindowModeChangedProvider {
    void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer);

    void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer);
}
