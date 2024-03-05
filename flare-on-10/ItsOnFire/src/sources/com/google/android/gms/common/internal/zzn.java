package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/zzn.class */
public final class zzn {
    private static final Uri zza = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();
    @Nullable
    private final String zzb;
    @Nullable
    private final String zzc;
    @Nullable
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzn(ComponentName componentName, int i2) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = i2;
        this.zzf = false;
    }

    public zzn(String str, int i2, boolean z) {
        this(str, "com.google.android.gms", i2, false);
    }

    public zzn(String str, String str2, int i2, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = i2;
        this.zzf = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzn) {
            zzn zznVar = (zzn) obj;
            return Objects.equal(this.zzb, zznVar.zzb) && Objects.equal(this.zzc, zznVar.zzc) && Objects.equal(this.zzd, zznVar.zzd) && this.zze == zznVar.zze && this.zzf == zznVar.zzf;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str == null) {
            Preconditions.checkNotNull(this.zzd);
            return this.zzd.flattenToString();
        }
        return str;
    }

    public final int zza() {
        return this.zze;
    }

    @Nullable
    public final ComponentName zzb() {
        return this.zzd;
    }

    public final Intent zzc(Context context) {
        Intent component;
        Bundle bundle;
        if (this.zzb != null) {
            component = null;
            if (this.zzf) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.zzb);
                try {
                    bundle = context.getContentResolver().call(zza, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e2) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                    bundle = null;
                }
                Intent intent = bundle == null ? null : (Intent) bundle.getParcelable("serviceResponseIntentKey");
                component = intent;
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.zzb)));
                    component = intent;
                }
            }
            if (component == null) {
                return new Intent(this.zzb).setPackage(this.zzc);
            }
        } else {
            component = new Intent().setComponent(this.zzd);
        }
        return component;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }
}
