package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: ItsOnFire.jar:com/google/firebase/analytics/connector/internal/zze.class */
public final class zze implements zza {
    public final Set zza;
    private final AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final AppMeasurementSdk zzc;
    private final zzd zzd;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        zzd zzdVar = new zzd(this);
        this.zzd = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.zza = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
        boolean z;
        this.zza.clear();
        Set set2 = this.zza;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i2 = zzc.zza;
            if (str != null && str.length() != 0) {
                int codePointAt = str.codePointAt(0);
                int i3 = codePointAt;
                if (!Character.isLetter(codePointAt)) {
                    if (codePointAt == 95) {
                        i3 = 95;
                    }
                }
                int length = str.length();
                int charCount = Character.charCount(i3);
                while (true) {
                    int i4 = charCount;
                    if (i4 >= length) {
                        z = true;
                        break;
                    }
                    int codePointAt2 = str.codePointAt(i4);
                    if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                        break;
                    }
                    charCount = i4 + Character.charCount(codePointAt2);
                }
            }
            z = false;
            if (z && str.length() != 0) {
                int codePointAt3 = str.codePointAt(0);
                if (Character.isLetter(codePointAt3)) {
                    int length2 = str.length();
                    int charCount2 = Character.charCount(codePointAt3);
                    while (true) {
                        int i5 = charCount2;
                        if (i5 < length2) {
                            int codePointAt4 = str.codePointAt(i5);
                            if (codePointAt4 == 95 || Character.isLetterOrDigit(codePointAt4)) {
                                charCount2 = i5 + Character.charCount(codePointAt4);
                            }
                        } else {
                            String zzb = zzhc.zzb(str);
                            if (zzb == null) {
                                zzb = str;
                            }
                            Preconditions.checkNotNull(zzb);
                            hashSet.add(zzb);
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }
}
