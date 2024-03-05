package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzfv.class */
public final class zzfv {
    public static String zza(Context context) {
        String packageName;
        try {
            packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException e2) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    @Nullable
    public static final String zzb(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        String str3 = null;
        if (identifier != 0) {
            try {
                str3 = resources.getString(identifier);
            } catch (Resources.NotFoundException e2) {
            }
        }
        return str3;
    }
}
