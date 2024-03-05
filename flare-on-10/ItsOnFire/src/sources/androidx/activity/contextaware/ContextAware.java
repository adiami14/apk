package androidx.activity.contextaware;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:androidx/activity/contextaware/ContextAware.class */
public interface ContextAware {
    void addOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener);

    @Nullable
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener);
}
