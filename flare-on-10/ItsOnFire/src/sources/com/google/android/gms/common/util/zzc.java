package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/zzc.class */
final class zzc {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zza.matcher(str);
            int i2 = 0;
            StringBuilder sb = null;
            while (matcher.find()) {
                StringBuilder sb2 = sb;
                if (sb == null) {
                    sb2 = new StringBuilder();
                }
                int start = matcher.start();
                int i3 = start;
                while (i3 >= 0 && str.charAt(i3) == '\\') {
                    i3--;
                }
                sb = sb2;
                if ((start - i3) % 2 != 0) {
                    int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                    sb2.append((CharSequence) str, i2, matcher.start());
                    if (parseInt == 92) {
                        sb2.append("\\\\");
                    } else {
                        sb2.append(Character.toChars(parseInt));
                    }
                    i2 = matcher.end();
                    sb = sb2;
                }
            }
            if (sb == null) {
                return str;
            }
            if (i2 < matcher.regionEnd()) {
                sb.append((CharSequence) str, i2, matcher.regionEnd());
            }
            str2 = sb.toString();
        }
        return str2;
    }
}
