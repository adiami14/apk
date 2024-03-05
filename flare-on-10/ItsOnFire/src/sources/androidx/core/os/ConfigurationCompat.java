package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: ItsOnFire.jar:androidx/core/os/ConfigurationCompat.class */
public final class ConfigurationCompat {

    @RequiresApi(24)
    /* loaded from: ItsOnFire.jar:androidx/core/os/ConfigurationCompat$Api24Impl.class */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static LocaleList getLocales(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
    }
}
