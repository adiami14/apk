package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.Constants;
import j.y0;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzgd.class */
public final class zzgd implements zzgy {
    private static volatile zzgd zzd;
    private zzek zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    @VisibleForTesting
    public Boolean zza;
    @VisibleForTesting
    public Boolean zzb;
    @VisibleForTesting
    public final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfi zzl;
    private final zzet zzm;
    private final zzga zzn;
    private final zzkp zzo;
    private final zzlp zzp;
    private final zzeo zzq;
    private final Clock zzr;
    private final zziz zzs;
    private final zzik zzt;
    private final zzd zzu;
    private final zzio zzv;
    private final String zzw;
    private zzem zzx;
    private zzjz zzy;
    private zzao zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzgd(zzhi zzhiVar) {
        zzer zzk;
        String str;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(zzhiVar);
        Context context = zzhiVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzed.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhiVar.zzb;
        this.zzg = zzhiVar.zzc;
        this.zzh = zzhiVar.zzd;
        this.zzi = zzhiVar.zzh;
        this.zzE = zzhiVar.zze;
        this.zzw = zzhiVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhiVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l2 = zzhiVar.zzi;
        this.zzc = l2 != null ? l2.longValue() : defaultClock.currentTimeMillis();
        this.zzk = new zzag(this);
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzw();
        this.zzl = zzfiVar;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.zzm = zzetVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzw();
        this.zzp = zzlpVar;
        this.zzq = new zzeo(new zzhh(zzhiVar, this));
        this.zzu = new zzd(this);
        zziz zzizVar = new zziz(this);
        zzizVar.zzb();
        this.zzs = zzizVar;
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.zzt = zzikVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzb();
        this.zzo = zzkpVar;
        zzio zzioVar = new zzio(this);
        zzioVar.zzw();
        this.zzv = zzioVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.zzn = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhiVar.zzg;
        z = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            zzik zzq = zzq();
            if (zzq.zzt.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzt.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzij(zzq);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    zzk = zzq.zzt.zzaA().zzj();
                    str = "Registered activity lifecycle callback";
                }
            }
            zzgaVar.zzp(new zzgc(this, zzhiVar));
        }
        zzk = zzaA().zzk();
        str = "Application context is not an Application";
        zzk.zza(str);
        zzgaVar.zzp(new zzgc(this, zzhiVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzgd zzgdVar, zzhi zzhiVar) {
        zzgdVar.zzaB().zzg();
        zzgdVar.zzk.zzn();
        zzao zzaoVar = new zzao(zzgdVar);
        zzaoVar.zzw();
        zzgdVar.zzz = zzaoVar;
        zzek zzekVar = new zzek(zzgdVar, zzhiVar.zzf);
        zzekVar.zzb();
        zzgdVar.zzA = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.zzx = zzemVar;
        zzjz zzjzVar = new zzjz(zzgdVar);
        zzjzVar.zzb();
        zzgdVar.zzy = zzjzVar;
        zzgdVar.zzp.zzx();
        zzgdVar.zzl.zzx();
        zzgdVar.zzA.zzc();
        zzer zzi = zzgdVar.zzaA().zzi();
        zzgdVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 79000L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.zzf)) {
            if (zzgdVar.zzv().zzaf(zzl)) {
                zzgdVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgdVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgdVar.zzaA().zzc().zza("Debug-level message logging enabled");
        if (zzgdVar.zzG != zzgdVar.zzH.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.zzG), Integer.valueOf(zzgdVar.zzH.get()));
        }
        zzgdVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgw zzgwVar) {
        if (zzgwVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzfVar.zze()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
        }
    }

    private static final void zzR(zzgx zzgxVar) {
        if (zzgxVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzgxVar.zzy()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgxVar.getClass())));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r14.zzf == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.measurement.internal.zzgd zzp(android.content.Context r13, com.google.android.gms.internal.measurement.zzcl r14, java.lang.Long r15) {
        /*
            r0 = r14
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L35
            r0 = r14
            java.lang.String r0 = r0.zze
            if (r0 == 0) goto L16
            r0 = r14
            r16 = r0
            r0 = r14
            java.lang.String r0 = r0.zzf
            if (r0 != 0) goto L35
        L16:
            com.google.android.gms.internal.measurement.zzcl r0 = new com.google.android.gms.internal.measurement.zzcl
            r1 = r0
            r2 = r14
            long r2 = r2.zza
            r3 = r14
            long r3 = r3.zzb
            r4 = r14
            boolean r4 = r4.zzc
            r5 = r14
            java.lang.String r5 = r5.zzd
            r6 = 0
            r7 = 0
            r8 = r14
            android.os.Bundle r8 = r8.zzg
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r16 = r0
        L35:
            r0 = r13
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r0 = r13
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzgd r0 = com.google.android.gms.measurement.internal.zzgd.zzd
            if (r0 != 0) goto L75
            java.lang.Class<com.google.android.gms.measurement.internal.zzgd> r0 = com.google.android.gms.measurement.internal.zzgd.class
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzgd r0 = com.google.android.gms.measurement.internal.zzgd.zzd     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L69
            com.google.android.gms.measurement.internal.zzhi r0 = new com.google.android.gms.measurement.internal.zzhi     // Catch: java.lang.Throwable -> L6f
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = r16
            r3 = r15
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.measurement.internal.zzgd r0 = new com.google.android.gms.measurement.internal.zzgd     // Catch: java.lang.Throwable -> L6f
            r13 = r0
            r0 = r13
            r1 = r14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r0 = r13
            com.google.android.gms.measurement.internal.zzgd.zzd = r0     // Catch: java.lang.Throwable -> L6f
        L69:
            java.lang.Class<com.google.android.gms.measurement.internal.zzgd> r0 = com.google.android.gms.measurement.internal.zzgd.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            goto La6
        L6f:
            r13 = move-exception
            java.lang.Class<com.google.android.gms.measurement.internal.zzgd> r0 = com.google.android.gms.measurement.internal.zzgd.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            r0 = r13
            throw r0
        L75:
            r0 = r16
            if (r0 == 0) goto La6
            r0 = r16
            android.os.Bundle r0 = r0.zzg
            r13 = r0
            r0 = r13
            if (r0 == 0) goto La6
            r0 = r13
            java.lang.String r1 = "dataCollectionDefaultEnabled"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto La6
            com.google.android.gms.measurement.internal.zzgd r0 = com.google.android.gms.measurement.internal.zzgd.zzd
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzgd r0 = com.google.android.gms.measurement.internal.zzgd.zzd
            r1 = r16
            android.os.Bundle r1 = r1.zzg
            java.lang.String r2 = "dataCollectionDefaultEnabled"
            boolean r1 = r1.getBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.zzE = r1
        La6:
            com.google.android.gms.measurement.internal.zzgd r0 = com.google.android.gms.measurement.internal.zzgd.zzd
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzgd r0 = com.google.android.gms.measurement.internal.zzgd.zzd
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgd.zzp(android.content.Context, com.google.android.gms.internal.measurement.zzcl, java.lang.Long):com.google.android.gms.measurement.internal.zzgd");
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    public final /* synthetic */ void zzC(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        int i3 = i2;
        if (i2 != 200) {
            i3 = i2;
            if (i2 != 204) {
                i3 = i2;
                if (i2 == 304) {
                    i3 = 304;
                }
                zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i3), th);
            }
        }
        if (th == null) {
            zzm().zzn.zza(true);
            if (bArr == null || bArr.length == 0) {
                zzaA().zzc().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    zzaA().zzc().zza("Deferred Deep Link is empty.");
                    return;
                }
                zzlp zzv = zzv();
                zzgd zzgdVar = zzv.zzt;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzt.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.zzt.zzG(y0.f624c, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                    zzlp zzv2 = zzv();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = zzv2.zzt.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            zzv2.zzt.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e2) {
                        zzv2.zzt.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e2);
                        return;
                    }
                }
                zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e3) {
                zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e3);
                return;
            }
        }
        zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i3), th);
    }

    public final void zzD() {
        this.zzG++;
    }

    @WorkerThread
    public final void zzE() {
        zzaB().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (!this.zzk.zzr() || ((Boolean) zzb.second).booleanValue() || TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzio zzr = zzr();
        zzr.zzv();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzt.zze.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e2) {
                networkInfo = null;
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            zzaA().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlp zzv = zzv();
        zzh().zzt.zzk.zzh();
        URL zzE = zzv.zzE(79000L, zzl, (String) zzb.first, zzm().zzo.zza() - 1);
        if (zzE != null) {
            zzio zzr2 = zzr();
            zzgb zzgbVar = new zzgb(this);
            zzr2.zzg();
            zzr2.zzv();
            Preconditions.checkNotNull(zzE);
            Preconditions.checkNotNull(zzgbVar);
            zzr2.zzt.zzaB().zzo(new zzin(zzr2, zzl, zzE, null, null, zzgbVar));
        }
    }

    @WorkerThread
    public final void zzF(boolean z) {
        this.zzE = Boolean.valueOf(z);
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaB().zzg();
        this.zzF = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
        if (r0.zzl() == false) goto L20;
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzH(com.google.android.gms.internal.measurement.zzcl r9) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgd.zzH(com.google.android.gms.internal.measurement.zzcl):void");
    }

    @WorkerThread
    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaB().zzg();
        return this.zzF;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    @WorkerThread
    public final boolean zzM() {
        if (this.zzB) {
            zzaB().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                Boolean valueOf = Boolean.valueOf(zzv().zzae("android.permission.INTERNET") && zzv().zzae("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlp.zzal(this.zze) && zzlp.zzam(this.zze, false))));
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    boolean z = true;
                    if (!zzv().zzY(zzh().zzm(), zzh().zzk())) {
                        z = !TextUtils.isEmpty(zzh().zzk());
                    }
                    this.zzC = Boolean.valueOf(z);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean zzN() {
        return this.zzi;
    }

    @WorkerThread
    public final int zza() {
        zzaB().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            zzaB().zzg();
            if (this.zzF) {
                Boolean zzd2 = zzm().zzd();
                if (zzd2 != null) {
                    return zzd2.booleanValue() ? 0 : 3;
                }
                zzag zzagVar = this.zzk;
                zzab zzabVar = zzagVar.zzt.zzj;
                Boolean zzk = zzagVar.zzk("firebase_analytics_collection_enabled");
                if (zzk != null) {
                    return zzk.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.zza;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzet zzaA() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzga zzaB() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Context zzaw() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Clock zzax() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzab zzay() {
        return this.zzj;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.zzk;
    }

    @Pure
    public final zzao zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzek zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzem zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzeo zzj() {
        return this.zzq;
    }

    public final zzet zzl() {
        zzet zzetVar = this.zzm;
        if (zzetVar == null || !zzetVar.zzy()) {
            return null;
        }
        return zzetVar;
    }

    @Pure
    public final zzfi zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    public final zzga zzo() {
        return this.zzn;
    }

    @Pure
    public final zzik zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzio zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zziz zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjz zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzkp zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    @Pure
    public final zzlp zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzg;
    }

    @Pure
    public final String zzy() {
        return this.zzh;
    }

    @Pure
    public final String zzz() {
        return this.zzw;
    }
}
