package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzib.class */
public abstract class zzib {
    public static final /* synthetic */ int zzc = 0;
    @Nullable
    private static volatile zzhz zze;
    private static volatile boolean zzf;
    public final zzhy zza;
    public final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzid zzh = new zzid(new Object() { // from class: com.google.android.gms.internal.measurement.zzht
    });
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj, boolean z, zzia zziaVar) {
        if (zzhyVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            if (zze == null) {
                synchronized (obj) {
                    zzhz zzhzVar = zze;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhzVar == null || zzhzVar.zza() != context) {
                        zzhf.zze();
                        zzic.zzc();
                        zzhn.zze();
                        final Context context2 = context;
                        zze = new zzhc(context, zzir.zza(new zzim() { // from class: com.google.android.gms.internal.measurement.zzhs
                            @Override // com.google.android.gms.internal.measurement.zzim
                            public final Object zza() {
                                Context context3 = context2;
                                int i2 = zzib.zzc;
                                return zzho.zza(context3);
                            }
                        }));
                        zzi.incrementAndGet();
                    }
                }
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x0160, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0011, B:8:0x0019, B:11:0x0028, B:13:0x0039, B:15:0x0041, B:19:0x0071, B:21:0x007d, B:23:0x0088, B:28:0x00b5, B:30:0x00c4, B:35:0x00dc, B:37:0x00e6, B:43:0x0105, B:46:0x0113, B:41:0x00fe, B:49:0x011e, B:50:0x0126, B:54:0x0133, B:55:0x013b, B:57:0x0143, B:25:0x00a5, B:58:0x014f, B:59:0x015a, B:61:0x015c), top: B:70:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f A[Catch: all -> 0x0160, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0011, B:8:0x0019, B:11:0x0028, B:13:0x0039, B:15:0x0041, B:19:0x0071, B:21:0x007d, B:23:0x0088, B:28:0x00b5, B:30:0x00c4, B:35:0x00dc, B:37:0x00e6, B:43:0x0105, B:46:0x0113, B:41:0x00fe, B:49:0x011e, B:50:0x0126, B:54:0x0133, B:55:0x013b, B:57:0x0143, B:25:0x00a5, B:58:0x014f, B:59:0x015a, B:61:0x015c), top: B:70:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzib.zzb():java.lang.Object");
    }
}
