package androidx.core.content.res;

import android.content.res.Resources;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/content/res/ConfigurationHelper.class */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
    }

    public static int getDensityDpi(@NonNull Resources resources) {
        return resources.getConfiguration().densityDpi;
    }
}
