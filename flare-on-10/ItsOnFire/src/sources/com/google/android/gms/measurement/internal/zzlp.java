package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzlp.class */
public final class zzlp extends zzgx {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private Integer zzf;

    public zzlp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = null;
        this.zzd = new AtomicLong(0L);
    }

    public static MessageDigest zzF() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e2) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzacVar.zzd);
            bundle.putString("name", zzacVar.zzc.zzb);
            zzgz.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzacVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzau zzauVar2 = zzacVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzau zzauVar3 = zzacVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    public static void zzK(zzir zzirVar, Bundle bundle, boolean z) {
        boolean z2 = z;
        if (bundle != null) {
            z2 = z;
            if (zzirVar != null) {
                if (!bundle.containsKey("_sc") || z) {
                    String str = zzirVar.zza;
                    if (str != null) {
                        bundle.putString("_sn", str);
                    } else {
                        bundle.remove("_sn");
                    }
                    String str2 = zzirVar.zzb;
                    if (str2 != null) {
                        bundle.putString("_sc", str2);
                    } else {
                        bundle.remove("_sc");
                    }
                    bundle.putLong("_si", zzirVar.zzc);
                    return;
                }
                z2 = false;
            }
        }
        if (bundle != null && zzirVar == null && z2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzaj(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzak(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzal(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null) {
                return false;
            }
            return receiverInfo.enabled;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public static boolean zzam(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return zzav(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzan(String str) {
        return !zzb[0].equals(str);
    }

    public static final boolean zzaq(Bundle bundle, int i2) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i2);
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public static final boolean zzar(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzas(String str) {
        if ("_ldl".equals(str)) {
            this.zzt.zzf();
            return 2048;
        } else if ("_id".equals(str)) {
            this.zzt.zzf();
            return 256;
        } else {
            boolean equals = "_lgclid".equals(str);
            this.zzt.zzf();
            return equals ? 100 : 36;
        }
    }

    private final Object zzat(int i2, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zzD(obj.toString(), i2, z);
            }
            if (z2) {
                if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle zzt = zzt((Bundle) parcelable);
                            if (!zzt.isEmpty()) {
                                arrayList.add(zzt);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return null;
            }
            return null;
        }
    }

    private static boolean zzau(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzln.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzav(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null) {
                return false;
            }
            return serviceInfo.enabled;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    @VisibleForTesting
    public static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i2 = 0;
        Preconditions.checkState(length > 0);
        long j2 = 0;
        while (true) {
            length--;
            if (length < 0 || length < bArr.length - 8) {
                break;
            }
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public final Object zzA(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            this.zzt.zzf();
            return zzat(256, obj, true, true);
        }
        if (zzaj(str)) {
            this.zzt.zzf();
        } else {
            this.zzt.zzf();
            i2 = 100;
        }
        return zzat(i2, obj, false, true);
    }

    public final Object zzB(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int zzas = zzas(str);
        return equals ? zzat(zzas, obj, true, false) : zzat(zzas, obj, false, false);
    }

    public final String zzC() {
        byte[] bArr = new byte[16];
        zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzD(String str, int i2, boolean z) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i2) {
            if (z) {
                str2 = String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
            }
            return str2;
        }
        return str;
    }

    public final URL zzE(long j2, String str, String str2, long j3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 79000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j3));
            String str3 = format;
            if (str.equals(this.zzt.zzf().zzm())) {
                str3 = format.concat("&ddl_test=1");
            }
            return new URL(str3);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    @WorkerThread
    public final SecureRandom zzG() {
        zzg();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    @WorkerThread
    public final void zzI(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.zzt.zzaA().zzk().zzb("Params already contained engagement", Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void zzJ(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (zzaq(bundle, i2)) {
            this.zzt.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void zzL(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzt.zzv().zzP(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzM(Parcelable[] parcelableArr, int i2, boolean z) {
        int i3;
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i4 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzak(str) && !zzau(str, zzhd.zzd)) {
                    int i5 = i4 + 1;
                    i4 = i5;
                    if (i5 > i2) {
                        zzer zze = this.zzt.zzaA().zze();
                        if (z) {
                            zze.zzc("Param can't contain more than " + i2 + " item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                            i3 = 28;
                        } else {
                            zze.zzc("Param cannot contain item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                            i3 = 23;
                        }
                        zzaq(bundle, i3);
                        bundle.remove(str);
                        i4 = i5;
                    }
                }
            }
        }
    }

    public final void zzN(zzeu zzeuVar, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(zzeuVar.zzd.keySet())) {
            if (zzak(str)) {
                int i4 = i3 + 1;
                i3 = i4;
                if (i4 > i2) {
                    this.zzt.zzaA().zze().zzc("Event can't contain more than " + i2 + " params", this.zzt.zzj().zzd(zzeuVar.zza), this.zzt.zzj().zzb(zzeuVar.zzd));
                    zzaq(zzeuVar.zzd, 5);
                    zzeuVar.zzd.remove(str);
                    i3 = i4;
                }
            }
        }
    }

    public final void zzO(zzlo zzloVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        zzaq(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        zzloVar.zza(str, "_err", bundle);
    }

    public final void zzP(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzt.zzaA().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzt.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning boolean value to wrapper", e2);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle list to wrapper", e2);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle value to wrapper", e2);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning byte array to wrapper", e2);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning int value to wrapper", e2);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning long value to wrapper", e2);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e2) {
            this.zzt.zzaA().zzk().zzb("Error returning string value to wrapper", e2);
        }
    }

    public final void zzX(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i2;
        int zza2;
        if (bundle == null) {
            return;
        }
        zzag zzf = this.zzt.zzf();
        zzpq.zzc();
        String str4 = null;
        int i3 = (zzf.zzt.zzf().zzs(null, zzeg.zzaz) && zzf.zzt.zzv().zzai(231100000, true)) ? 35 : 0;
        int i4 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int zzj = !z ? zzj(str5) : 0;
                i2 = zzj;
                if (zzj == 0) {
                    i2 = zzi(str5);
                }
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                zzJ(bundle, i2, str5, str5, i2 == 3 ? str5 : str4);
                bundle.remove(str5);
            } else {
                if (zzag(bundle.get(str5))) {
                    this.zzt.zzaA().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    zza2 = 22;
                } else {
                    zza2 = zza(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (zza2 != 0 && !"_ev".equals(str5)) {
                    zzJ(bundle, zza2, str5, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (zzak(str5) && !zzau(str5, zzhd.zzd)) {
                    i4++;
                    int i5 = 23;
                    if (zzai(231100000, true)) {
                        int i6 = i3;
                        if (i4 > i6) {
                            zzpq.zzc();
                            if (this.zzt.zzf().zzs(null, zzeg.zzaz)) {
                                this.zzt.zzaA().zze().zzc("Item can't contain more than " + i6 + " item-scoped custom params", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                i5 = 28;
                            } else {
                                this.zzt.zzaA().zze().zzc("Item cannot contain custom parameters", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                            }
                            zzaq(bundle, i5);
                            bundle.remove(str5);
                        }
                    } else {
                        this.zzt.zzaA().zze().zzc("Item array not supported on client's version of Google Play Services (Android Only)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                        bundle.remove(str5);
                    }
                    str4 = null;
                }
                str4 = null;
            }
        }
    }

    public final boolean zzY(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzar(str)) {
                return true;
            }
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzet.zzn(str));
                return false;
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
            return false;
        } else if (zzar(str2)) {
            return true;
        } else {
            this.zzt.zzaA().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzet.zzn(str2));
            return false;
        }
    }

    public final boolean zzZ(String str, int i2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i2) {
            this.zzt.zzaA().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, android.os.Bundle r13, java.util.List r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlp.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    @WorkerThread
    public final void zzaC() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        long j2 = nextLong;
        if (nextLong == 0) {
            long nextLong2 = secureRandom.nextLong();
            j2 = nextLong2;
            if (nextLong2 == 0) {
                this.zzt.zzaA().zzk().zza("Utils falling back to Random for random id");
                j2 = nextLong2;
            }
        }
        this.zzd.set(j2);
    }

    public final boolean zzaa(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.zzt.zzaA().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzau(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !zzau(str2, strArr2)) {
            this.zzt.zzaA().zze().zzc("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    public final boolean zzab(String str, String str2, int i2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i2) {
                this.zzt.zzaA().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean zzac(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            int i2 = codePointAt;
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.zzt.zzaA().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                i2 = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(i2);
            while (true) {
                int i3 = charCount;
                if (i3 >= length) {
                    return true;
                }
                int codePointAt2 = str2.codePointAt(i3);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount = i3 + Character.charCount(codePointAt2);
            }
        }
    }

    public final boolean zzad(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.zzt.zzaA().zze().zzc("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (true) {
                int i2 = charCount;
                if (i2 >= length) {
                    return true;
                }
                int codePointAt2 = str2.codePointAt(i2);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount = i2 + Character.charCount(codePointAt2);
            }
        }
    }

    @WorkerThread
    public final boolean zzae(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzt.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzt.zzaA().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzaf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzt.zzf().zzl();
        this.zzt.zzay();
        return zzl.equals(str);
    }

    public final boolean zzag(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    public final boolean zzah(Context context, String str) {
        zzer zzd;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            zzd = this.zzt.zzaA().zzd();
            str2 = "Package name not found";
            zzd.zzb(str2, e);
            return true;
        } catch (CertificateException e3) {
            e = e3;
            zzd = this.zzt.zzaA().zzd();
            str2 = "Error obtaining certificate";
            zzd.zzb(str2, e);
            return true;
        }
    }

    public final boolean zzai(int i2, boolean z) {
        Boolean zzj = this.zzt.zzt().zzj();
        boolean z2 = false;
        if (zzm() < i2 / 1000) {
            if (zzj != null) {
                if (zzj.booleanValue()) {
                    return false;
                }
            }
            return z2;
        }
        z2 = true;
        return z2;
    }

    public final boolean zzao(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final byte[] zzap(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int zzd(String str, Object obj) {
        int zzas;
        String str2;
        if ("_ldl".equals(str)) {
            zzas = zzas(str);
            str2 = "user property referrer";
        } else {
            zzas = zzas(str);
            str2 = "user property";
        }
        return zzab(str2, str, zzas, obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String str) {
        if (zzac(NotificationCompat.CATEGORY_EVENT, str)) {
            if (zzaa(NotificationCompat.CATEGORY_EVENT, zzhc.zza, zzhc.zzb, str)) {
                this.zzt.zzf();
                return !zzZ(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int zzi(String str) {
        if (zzac("event param", str)) {
            if (zzaa("event param", null, null, str)) {
                this.zzt.zzf();
                return !zzZ("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int zzj(String str) {
        if (zzad("event param", str)) {
            if (zzaa("event param", null, null, str)) {
                this.zzt.zzf();
                return !zzZ("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int zzl(String str) {
        if (zzac("user property", str)) {
            if (zzaa("user property", zzhe.zza, null, str)) {
                this.zzt.zzf();
                return !zzZ("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzf == null) {
            this.zzf = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzaw()) / 1000);
        }
        return this.zzf.intValue();
    }

    public final int zzo(int i2) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzaw(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzq() {
        long andIncrement;
        long nextLong;
        long j2;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            nextLong = new Random(System.nanoTime() ^ this.zzt.zzax().currentTimeMillis()).nextLong();
            int i2 = this.zze + 1;
            this.zze = i2;
            j2 = i2;
        }
        return nextLong + j2;
    }

    public final long zzr(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    public final Bundle zzs(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    str6 = uri.getQueryParameter("utm_id");
                    str7 = uri.getQueryParameter("dclid");
                    str8 = uri.getQueryParameter("srsltid");
                    str = z ? uri.getQueryParameter("sfmc_id") : null;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                }
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("campaign", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("medium", str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("dclid", str7);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter8);
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("srsltid", str8);
                }
                if (z && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e2) {
                this.zzt.zzaA().zzk().zzb("Install referrer url isn't a hierarchical URI", e2);
                return null;
            }
        }
        return null;
    }

    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzt.zzaA().zzl().zzb("Param value can't be null", this.zzt.zzj().zze(str));
                } else {
                    zzP(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    public final Bundle zzu(String str, String str2, Bundle bundle, List list, boolean z) {
        Bundle bundle2;
        int i2;
        int i3;
        boolean zzau = zzau(str2, zzhc.zzd);
        if (bundle != null) {
            Bundle bundle3 = new Bundle(bundle);
            int zzc = this.zzt.zzf().zzc();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (list == null || !list.contains(str3)) {
                    int zzj = !z ? zzj(str3) : 0;
                    i2 = zzj;
                    if (zzj == 0) {
                        i2 = zzi(str3);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    zzJ(bundle3, i2, str3, str3, i2 == 3 ? str3 : null);
                    bundle3.remove(str3);
                    i3 = i5;
                } else {
                    int zza2 = zza(str, str2, str3, bundle.get(str3), bundle3, list, z, zzau);
                    if (zza2 == 17) {
                        zzJ(bundle3, 17, str3, str3, Boolean.FALSE);
                    } else if (zza2 != 0 && !"_ev".equals(str3)) {
                        zzJ(bundle3, zza2, zza2 == 21 ? str2 : str3, str3, bundle.get(str3));
                        bundle3.remove(str3);
                        i3 = i5;
                    }
                    i3 = i5;
                    if (zzak(str3)) {
                        i3 = i5 + 1;
                        if (i3 > zzc) {
                            this.zzt.zzaA().zze().zzc("Event can't contain more than " + zzc + " params", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                            zzaq(bundle3, 5);
                            bundle3.remove(str3);
                        }
                    }
                }
                i4 = i3;
            }
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        return bundle2;
    }

    public final zzau zzz(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional property event name", this.zzt.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle zzu = zzu(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        Bundle bundle3 = zzu;
        if (z) {
            bundle3 = zzt(zzu);
        }
        Preconditions.checkNotNull(bundle3);
        return new zzau(str2, new zzas(bundle3), str3, j2);
    }
}
