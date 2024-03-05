package androidx.core.app;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
/* loaded from: ItsOnFire.jar:androidx/core/app/OnPictureInPictureModeChangedProvider.class */
public interface OnPictureInPictureModeChangedProvider {
    void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer);

    void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer);
}
