package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/HttpUtils.class */
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    @NonNull
    @KeepForSdk
    public static Map<String, String> parse(@NonNull URI uri, @NonNull String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        HashMap hashMap = emptyMap;
        if (rawQuery != null) {
            hashMap = emptyMap;
            if (rawQuery.length() > 0) {
                HashMap hashMap2 = new HashMap();
                zzx zzc2 = zzx.zzc(zzo.zzb('='));
                Iterator it = zzx.zzc(zzo.zzb('&')).zzb().zzd(rawQuery).iterator();
                while (true) {
                    hashMap = hashMap2;
                    if (!it.hasNext()) {
                        break;
                    }
                    List zzf = zzc2.zzf((String) it.next());
                    if (zzf.isEmpty() || zzf.size() > 2) {
                        break;
                    }
                    hashMap2.put(zza((String) zzf.get(0), str), zzf.size() == 2 ? zza((String) zzf.get(1), str) : null);
                }
                throw new IllegalArgumentException("bad parameter");
            }
        }
        return hashMap;
    }

    private static String zza(String str, String str2) {
        String str3 = str2;
        if (str2 == null) {
            str3 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str3);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
