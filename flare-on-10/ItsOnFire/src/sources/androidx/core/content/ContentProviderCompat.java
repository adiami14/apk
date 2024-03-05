package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/content/ContentProviderCompat.class */
public final class ContentProviderCompat {
    private ContentProviderCompat() {
    }

    @NonNull
    public static Context requireContext(@NonNull ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
