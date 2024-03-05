package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzic.class */
public final class zzic implements zzhk {
    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    @Nullable
    public static zzic zza(Context context, String str, Runnable runnable) {
        zzic zzicVar;
        if (zzhb.zzb()) {
            throw null;
        }
        synchronized (zzic.class) {
            try {
                zzicVar = (zzic) zza.get(null);
                if (zzicVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzicVar;
    }

    public static void zzc() {
        synchronized (zzic.class) {
            try {
                Map map = zza;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    SharedPreferences sharedPreferences = ((zzic) it.next()).zzb;
                    throw null;
                }
                map.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    @Nullable
    public final Object zzb(String str) {
        throw null;
    }
}
