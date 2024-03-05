package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import j.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzik.class */
public final class zzik extends zzf {
    @VisibleForTesting
    public zzij zza;
    public final zzs zzb;
    @VisibleForTesting
    public boolean zzc;
    private zzhf zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    @GuardedBy("consentLock")
    private zzhb zzi;
    private final AtomicLong zzj;
    private long zzk;
    private final zzlo zzl;

    public zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzl = new zzhz(this);
        this.zzg = new AtomicReference();
        this.zzi = zzhb.zza;
        this.zzk = -1L;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzaa(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z) {
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzab() {
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzY("app", "_npa", null, this.zzt.zzax().currentTimeMillis());
            } else {
                zzY("app", "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (!this.zzt.zzJ() || !this.zzc) {
            this.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
            this.zzt.zzt().zzI();
            return;
        }
        this.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzt.zzaB().zzp(new zzhn(this));
    }

    public static /* bridge */ /* synthetic */ void zzv(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        boolean z;
        zzha zzhaVar = zzha.ANALYTICS_STORAGE;
        zzha zzhaVar2 = zzha.AD_STORAGE;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                z = false;
                break;
            }
            zzha zzhaVar3 = new zzha[]{zzhaVar, zzhaVar2}[i2];
            if (!zzhbVar2.zzj(zzhaVar3) && zzhbVar.zzj(zzhaVar3)) {
                z = true;
                break;
            }
            i2++;
        }
        boolean zzn = zzhbVar.zzn(zzhbVar2, zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE);
        if (z || zzn) {
            zzikVar.zzt.zzh().zzo();
        }
    }

    public static /* synthetic */ void zzw(zzik zzikVar, zzhb zzhbVar, long j2, boolean z, boolean z2) {
        zzikVar.zzg();
        zzikVar.zza();
        zzhb zzc = zzikVar.zzt.zzm().zzc();
        if (j2 <= zzikVar.zzk && zzhb.zzk(zzc.zza(), zzhbVar.zza())) {
            zzikVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzhbVar);
            return;
        }
        zzfi zzm = zzikVar.zzt.zzm();
        zzgd zzgdVar = zzm.zzt;
        zzm.zzg();
        int zza = zzhbVar.zza();
        if (!zzm.zzl(zza)) {
            zzikVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzhbVar.zza()));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzhbVar.zzi());
        edit.putInt("consent_source", zza);
        edit.apply();
        zzikVar.zzk = j2;
        zzikVar.zzt.zzt().zzF(z);
        if (z2) {
            zzikVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzhu(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzl, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlp.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlp zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            int i2 = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                int i3 = i2 + 1;
                i2 = i3;
                if (i3 > zzc) {
                    zza.remove(str2);
                    i2 = i3;
                }
            }
            this.zzt.zzv().zzO(this.zzl, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (str2 == FirebaseAnalytics.Event.SCREEN_VIEW || (str2 != null && str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            this.zzt.zzs().zzx(bundle, j2);
            return;
        }
        boolean z3 = true;
        if (z2) {
            z3 = true;
            if (this.zzd != null) {
                z3 = zzlp.zzaj(str2);
            }
        }
        if (str == null) {
            str = "app";
        }
        zzM(str, str2, j2, bundle, z2, z3, z, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM(y0.f624c, str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void zzH(String str, String str2, long j2, Bundle bundle) {
        zzg();
        zzI(str, str2, j2, bundle, true, this.zzd == null || zzlp.zzaj(str2), true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v177, types: [java.lang.Object[]] */
    @WorkerThread
    public final void zzI(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        Bundle[] bundleArr;
        Bundle[] array;
        String str4;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzn = this.zzt.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzaw());
                } catch (Exception e2) {
                    this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e2);
                }
            } catch (ClassNotFoundException e3) {
                this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzay();
            zzY(y0.f624c, "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
        }
        this.zzt.zzay();
        if (z && zzlp.zzan(str2)) {
            this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
        }
        if (!z3) {
            this.zzt.zzay();
            if (!"_iap".equals(str2)) {
                zzlp zzv = this.zzt.zzv();
                int i2 = 2;
                if (zzv.zzad(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (zzv.zzaa(NotificationCompat.CATEGORY_EVENT, zzhc.zza, zzhc.zzb, str2)) {
                        zzv.zzt.zzf();
                        if (zzv.zzZ(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 13;
                    }
                }
                if (i2 != 0) {
                    this.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                    zzlp zzv2 = this.zzt.zzv();
                    this.zzt.zzf();
                    this.zzt.zzv().zzO(this.zzl, null, i2, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.zzt.zzay();
        zzir zzj = this.zzt.zzs().zzj(false);
        if (zzj != null && !bundle.containsKey("_sc")) {
            zzj.zzd = true;
        }
        zzlp.zzK(zzj, bundle, z && !z3);
        boolean equals = "am".equals(str);
        boolean zzaj = zzlp.zzaj(str2);
        if (!z || this.zzd == null || zzaj) {
            z4 = equals;
        } else if (!equals) {
            this.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
            Preconditions.checkNotNull(this.zzd);
            this.zzd.interceptEvent(str, str2, bundle, j2);
            return;
        } else {
            z4 = true;
        }
        if (this.zzt.zzM()) {
            int zzh = this.zzt.zzv().zzh(str2);
            if (zzh != 0) {
                this.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                zzlp zzv3 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzO(this.zzl, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(zzu);
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long elapsedRealtime = zzknVar.zzc.zzt.zzax().elapsedRealtime();
                long j3 = elapsedRealtime - zzknVar.zzb;
                zzknVar.zzb = elapsedRealtime;
                if (j3 > 0) {
                    this.zzt.zzv().zzI(zzu, j3);
                }
            }
            zzos.zzc();
            if (this.zzt.zzf().zzs(null, zzeg.zzae)) {
                if (!y0.f624c.equals(str) && "_ssr".equals(str2)) {
                    zzlp zzv4 = this.zzt.zzv();
                    String string = zzu.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        str4 = null;
                    } else {
                        str4 = string;
                        if (string != null) {
                            str4 = string.trim();
                        }
                    }
                    if (zzln.zza(str4, zzv4.zzt.zzm().zzp.zza())) {
                        zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzt.zzm().zzp.zzb(str4);
                } else if ("_ae".equals(str2)) {
                    String zza = this.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzu.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzu);
            boolean zzo = this.zzt.zzf().zzs(null, zzeg.zzaG) ? this.zzt.zzu().zzo() : this.zzt.zzm().zzm.zzb();
            if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j2) && zzo) {
                this.zzt.zzaA().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                zzY(y0.f624c, "_sid", null, this.zzt.zzax().currentTimeMillis());
                zzY(y0.f624c, "_sno", null, this.zzt.zzax().currentTimeMillis());
                zzY(y0.f624c, "_se", null, this.zzt.zzax().currentTimeMillis());
                this.zzt.zzm().zzk.zzb(0L);
            }
            if (zzu.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, 0L) == 1) {
                this.zzt.zzaA().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzt.zzu().zza.zzb(j2, true);
            }
            ArrayList arrayList2 = new ArrayList(zzu.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str5 = (String) arrayList2.get(i3);
                if (str5 != null) {
                    this.zzt.zzv();
                    Object obj = zzu.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            array = arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = array;
                    }
                    if (bundleArr != null) {
                        zzu.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i4 = 0;
            while (i4 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i4);
                String str6 = i4 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                Bundle bundle3 = bundle2;
                if (z2) {
                    bundle3 = this.zzt.zzv().zzt(bundle2);
                }
                this.zzt.zzt().zzA(new zzau(str6, new zzas(bundle3), str, j2), str3);
                if (!z4) {
                    for (zzhg zzhgVar : this.zze) {
                        zzhgVar.onEvent(str, str2, new Bundle(bundle3), j2);
                    }
                }
                i4++;
            }
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
        }
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.add(zzhgVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j2) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhs(this, j2));
    }

    public final void zzL(long j2, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkp zzu = this.zzt.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfi zzm = this.zzt.zzm();
        zzm.zzc.zzb(j2);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzph.zzc();
        zzag zzf = zzm.zzt.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzf.zzs(null, zzefVar)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z) {
            this.zzt.zzt().zzC();
        }
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzefVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    public final void zzM(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        Object obj2 = list.get(i3);
                        if (obj2 instanceof Bundle) {
                            list.set(i3, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, j2, bundle2, z, z2, z3, str3));
    }

    public final void zzN(String str, String str2, long j2, Object obj) {
        this.zzt.zzaB().zzp(new zzhq(this, str, str2, obj, j2));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j2) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzt.zzaA().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, "origin", String.class, null);
        zzgz.zza(bundle2, "name", String.class, null);
        zzgz.zza(bundle2, "value", Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
        } else if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
        } else {
            Object zzB = this.zzt.zzv().zzB(string, obj);
            if (zzB == null) {
                this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
                return;
            }
            zzgz.zzb(bundle2, zzB);
            long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                this.zzt.zzf();
                if (j3 > 15552000000L || j3 < 1) {
                    this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j3));
                    return;
                }
            }
            long j4 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            this.zzt.zzf();
            if (j4 > 15552000000L || j4 < 1) {
                this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j4));
            } else {
                this.zzt.zzaB().zzp(new zzht(this, bundle2));
            }
        }
    }

    public final void zzR(zzhb zzhbVar, long j2) {
        zzhb zzhbVar2;
        boolean z;
        boolean z2;
        boolean z3;
        zza();
        int zza = zzhbVar.zza();
        if (zza != -10 && zzhbVar.zzf() == null && zzhbVar.zzg() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            zzhbVar2 = this.zzi;
            z = true;
            z2 = false;
            if (zzhb.zzk(zza, zzhbVar2.zza())) {
                z2 = zzhbVar.zzm(this.zzi);
                zzha zzhaVar = zzha.ANALYTICS_STORAGE;
                boolean z4 = false;
                if (zzhbVar.zzj(zzhaVar)) {
                    z4 = false;
                    if (!this.zzi.zzj(zzhaVar)) {
                        z4 = true;
                    }
                }
                zzhbVar = zzhbVar.zze(this.zzi);
                this.zzi = zzhbVar;
                z3 = z4;
            } else {
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzhbVar);
            return;
        }
        long andIncrement = this.zzj.getAndIncrement();
        if (z2) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzif(this, zzhbVar, j2, andIncrement, z3, zzhbVar2));
            return;
        }
        zzig zzigVar = new zzig(this, zzhbVar, andIncrement, z3, zzhbVar2);
        if (zza == 30 || zza == -10) {
            this.zzt.zzaB().zzq(zzigVar);
        } else {
            this.zzt.zzaB().zzp(zzigVar);
        }
    }

    public final void zzS(Bundle bundle, int i2, long j2) {
        zza();
        String zzh = zzhb.zzh(bundle);
        if (zzh != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzh);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzR(zzhb.zzb(bundle, i2), j2);
    }

    @WorkerThread
    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.zzd)) {
            Preconditions.checkState(zzhfVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzie(this, bool));
    }

    @WorkerThread
    public final void zzV(zzhb zzhbVar) {
        zzg();
        boolean z = (zzhbVar.zzj(zzha.ANALYTICS_STORAGE) && zzhbVar.zzj(zzha.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX(y0.f624c, "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
        if ((r11 instanceof java.lang.CharSequence) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzX(java.lang.String r9, java.lang.String r10, java.lang.Object r11, boolean r12, long r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzX(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    @WorkerThread
    public final void zzY(String str, String str2, Object obj, long j2) {
        zzfh zzfhVar;
        String str3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    str3 = "false";
                    Long valueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    zzfh zzfhVar2 = this.zzt.zzm().zzh;
                    zzfhVar = zzfhVar2;
                    obj = valueOf;
                    if (valueOf.longValue() == 1) {
                        str3 = "true";
                        zzfhVar = zzfhVar2;
                        obj = valueOf;
                    }
                    zzfhVar.zzb(str3);
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                zzfhVar = this.zzt.zzm().zzh;
                str3 = "unset";
                zzfhVar.zzb(str3);
                str2 = "_npa";
            }
        }
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzj().zza("User property not set since app measurement is disabled");
        } else if (this.zzt.zzM()) {
            this.zzt.zzt().zzK(new zzlk(str2, j2, obj, str));
        }
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.remove(zzhgVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, "boolean test flag value", new zzhw(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, "double test flag value", new zzid(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, "int test flag value", new zzic(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, "long test flag value", new zzib(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, "String test flag value", new zzia(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        ArrayList zzH;
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            zzH = new ArrayList(0);
        } else {
            this.zzt.zzay();
            if (zzab.zza()) {
                this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
                zzH = new ArrayList(0);
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzhv(this, atomicReference, null, str, str2));
                List list = (List) atomicReference.get();
                if (list == null) {
                    this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
                    zzH = new ArrayList();
                } else {
                    zzH = zzlp.zzH(list);
                }
            }
        }
        return zzH;
    }

    public final List zzt(boolean z) {
        zzer zzd;
        String str;
        zza();
        this.zzt.zzaA().zzj().zza("Getting user properties (FE)");
        if (this.zzt.zzaB().zzs()) {
            zzd = this.zzt.zzaA().zzd();
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            this.zzt.zzay();
            if (!zzab.zza()) {
                AtomicReference atomicReference = new AtomicReference();
                this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhr(this, atomicReference, z));
                List list = (List) atomicReference.get();
                if (list == null) {
                    this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyList();
                }
                return list;
            }
            zzd = this.zzt.zzaA().zzd();
            str = "Cannot get all user properties from main thread";
        }
        zzd.zza(str);
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.Map] */
    public final Map zzu(String str, String str2, boolean z) {
        ArrayMap arrayMap;
        zzer zzd;
        String str3;
        if (this.zzt.zzaB().zzs()) {
            zzd = this.zzt.zzaA().zzd();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.zzt.zzay();
            if (!zzab.zza()) {
                AtomicReference atomicReference = new AtomicReference();
                this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhx(this, atomicReference, null, str, str2, z));
                List list = (List) atomicReference.get();
                if (list == null) {
                    this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    arrayMap = Collections.emptyMap();
                    return arrayMap;
                }
                ArrayMap arrayMap2 = new ArrayMap(list.size());
                Iterator it = list.iterator();
                while (true) {
                    arrayMap = arrayMap2;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzlk zzlkVar = (zzlk) it.next();
                    Object zza = zzlkVar.zza();
                    if (zza != null) {
                        arrayMap2.put(zzlkVar.zzb, zza);
                    }
                }
                return arrayMap;
            }
            zzd = this.zzt.zzaA().zzd();
            str3 = "Cannot get user properties from main thread";
        }
        zzd.zza(str3);
        arrayMap = Collections.emptyMap();
        return arrayMap;
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = zzik.this;
                            zzikVar.zzg();
                            if (zzikVar.zzt.zzm().zzn.zzb()) {
                                zzikVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzikVar.zzt.zzm().zzo.zza();
                            zzikVar.zzt.zzm().zzo.zzb(1 + zza);
                            zzikVar.zzt.zzf();
                            if (zza < 5) {
                                zzikVar.zzt.zzE();
                                return;
                            }
                            zzikVar.zzt.zzaA().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            zzikVar.zzt.zzm().zzn.zza(true);
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG(y0.f624c, "_ou", bundle);
        }
    }
}
