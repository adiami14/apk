package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzha.class */
public final class zzha {
    public static HashMap zze;
    public static boolean zzj;
    private static Object zzm;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzl = new AtomicBoolean();
    public static final HashMap zzf = new HashMap(16, 1.0f);
    public static final HashMap zzg = new HashMap(16, 1.0f);
    public static final HashMap zzh = new HashMap(16, 1.0f);
    public static final HashMap zzi = new HashMap(16, 1.0f);
    public static final String[] zzk = new String[0];

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzha.class) {
            try {
                if (zze == null) {
                    zzl.set(false);
                    zze = new HashMap(16, 1.0f);
                    zzm = new Object();
                    zzj = false;
                    contentResolver.registerContentObserver(zza, true, new zzgz(null));
                } else if (zzl.getAndSet(false)) {
                    zze.clear();
                    zzf.clear();
                    zzg.clear();
                    zzh.clear();
                    zzi.clear();
                    zzm = new Object();
                    zzj = false;
                }
                Object obj = zzm;
                if (zze.containsKey(str)) {
                    String str3 = (String) zze.get(str);
                    if (str3 == null) {
                        str3 = null;
                    }
                    return str3;
                }
                int length = zzk.length;
                Cursor query = contentResolver.query(zza, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        zzc(obj, str, null);
                        query.close();
                        return null;
                    }
                    String string = query.getString(1);
                    query.close();
                    String str4 = string;
                    if (string != null) {
                        str4 = string;
                        if (string.equals(null)) {
                            str4 = null;
                        }
                    }
                    zzc(obj, str, str4);
                    if (str4 != null) {
                        return str4;
                    }
                    return null;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void zzc(Object obj, String str, String str2) {
        synchronized (zzha.class) {
            try {
                if (obj == zzm) {
                    zze.put(str, str2);
                }
            } finally {
            }
        }
    }
}
