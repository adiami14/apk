package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzhq.class */
public final class zzhq {
    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zza = new ArrayMap();

    public static Uri zza(String str) {
        synchronized (zzhq.class) {
            try {
                ArrayMap arrayMap = zza;
                Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
                if (uri == null) {
                    Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                    arrayMap.put("com.google.android.gms.measurement", parse);
                    return parse;
                }
                return uri;
            } finally {
            }
        }
    }
}
