package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzfd.class */
public final class zzfd {
    public final /* synthetic */ zzfi zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzfd(zzfi zzfiVar, String str, Bundle bundle) {
        this.zza = zzfiVar;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.zzb = "default_event_parameters";
        this.zzc = new Bundle();
    }

    @WorkerThread
    public final Bundle zza() {
        Bundle bundle;
        JSONArray jSONArray;
        int i2;
        boolean z;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    bundle = new Bundle();
                    jSONArray = new JSONArray(string);
                    i2 = 0;
                } catch (JSONException e2) {
                    this.zza.zzt.zzaA().zzd().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
                while (true) {
                    if (i2 >= jSONArray.length()) {
                        break;
                    }
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String string2 = jSONObject.getString(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
                        String string3 = jSONObject.getString("t");
                        int hashCode = string3.hashCode();
                        if (hashCode == 100) {
                            if (string3.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG)) {
                                z = true;
                            }
                            z = true;
                        } else if (hashCode != 108) {
                            if (hashCode == 115 && string3.equals("s")) {
                                z = false;
                            }
                            z = true;
                        } else {
                            if (string3.equals("l")) {
                                z = true;
                            }
                            z = true;
                        }
                        if (!z) {
                            bundle.putString(string2, jSONObject.getString("v"));
                        } else if (z) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        } else if (!z) {
                            this.zza.zzt.zzaA().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                        } else {
                            bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                        }
                    } catch (NumberFormatException | JSONException e3) {
                        this.zza.zzt.zzaA().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                    }
                    i2++;
                    this.zza.zzt.zzaA().zzd().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
                this.zzd = bundle;
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        SharedPreferences.Editor edit = this.zza.zza().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj2 = bundle2.get(str2);
                if (obj2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, str2);
                        jSONObject.put("v", obj2.toString());
                        if (obj2 instanceof String) {
                            obj = "s";
                        } else if (obj2 instanceof Long) {
                            obj = "l";
                        } else if (obj2 instanceof Double) {
                            obj = GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
                        } else {
                            this.zza.zzt.zzaA().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj2.getClass());
                        }
                        jSONObject.put("t", obj);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        this.zza.zzt.zzaA().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e2);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle2;
    }
}
