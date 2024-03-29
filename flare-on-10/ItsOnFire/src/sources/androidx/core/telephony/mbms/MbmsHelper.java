package androidx.core.telephony.mbms;

import android.content.Context;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.Set;
/* loaded from: ItsOnFire.jar:androidx/core/telephony/mbms/MbmsHelper.class */
public final class MbmsHelper {

    @RequiresApi(28)
    /* loaded from: ItsOnFire.jar:androidx/core/telephony/mbms/MbmsHelper$Api28Impl.class */
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static CharSequence getBestNameForService(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i2 = 0;
            for (Locale locale : serviceInfo.getNamedContentLocales()) {
                strArr[i2] = locale.toLanguageTag();
                i2++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            return firstMatch == null ? null : serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private MbmsHelper() {
    }

    @Nullable
    public static CharSequence getBestNameForService(@NonNull Context context, @NonNull ServiceInfo serviceInfo) {
        return Api28Impl.getBestNameForService(context, serviceInfo);
    }
}
