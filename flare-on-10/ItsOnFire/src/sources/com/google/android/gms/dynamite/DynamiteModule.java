package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/DynamiteModule.class */
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final int REMOTE = 1;
    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzb;
    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static String zzc;
    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;
    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;
    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzf;
    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzq zzk;
    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    /* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader.class */
    public static class DynamiteLoaderClassLoader {
        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/DynamiteModule$LoadingException.class */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/DynamiteModule$VersionPolicy.class */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$IVersions.class */
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        /* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/DynamiteModule$VersionPolicy$SelectionResult.class */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException e2) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z;
        IObjectWrapper zze2;
        ThreadLocal threadLocal = zzg;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzh;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + selectModule.localVersion + " and remote module " + str + ":" + selectModule.remoteVersion);
            int i2 = selectModule.selection;
            if (i2 != 0) {
                int i3 = i2;
                if (i2 == -1) {
                    if (selectModule.localVersion != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || selectModule.remoteVersion != 0) {
                    if (i3 == -1) {
                        DynamiteModule zzc2 = zzc(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zzc2;
                    } else if (i3 != 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                    } else {
                        try {
                            int i4 = selectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        if (!zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    } finally {
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                        synchronized (DynamiteModule.class) {
                                            try {
                                                zzrVar = zzl;
                                            } finally {
                                            }
                                        }
                                        if (zzrVar == null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zzn zznVar3 = (zzn) threadLocal.get();
                                        if (zznVar3 == null || zznVar3.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext = context.getApplicationContext();
                                        Cursor cursor2 = zznVar3.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            try {
                                                z = zze >= 2;
                                            } finally {
                                            }
                                        }
                                        if (Boolean.valueOf(z).booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i4, ObjectWrapper.wrap(cursor2));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i4, ObjectWrapper.wrap(cursor2));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                        zzq zzg2 = zzg(context);
                                        if (zzg2 == null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        int zze3 = zzg2.zze();
                                        if (zze3 >= 3) {
                                            zzn zznVar4 = (zzn) threadLocal.get();
                                            if (zznVar4 == null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(zznVar4.zza));
                                        } else if (zze3 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i4);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i4);
                                        }
                                        Object unwrap = ObjectWrapper.unwrap(zzh2);
                                        if (unwrap == null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) unwrap);
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = zznVar2.zza;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(zznVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e2) {
                                throw new LoadingException("Failed to load remote module.", e2, null);
                            } catch (LoadingException e3) {
                                throw e3;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e4) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                            int i5 = selectModule.localVersion;
                            if (i5 == 0 || versionPolicy.selectModule(context, str, new zzo(i5, 0)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e4, null);
                            }
                            DynamiteModule zzc3 = zzc(context, str);
                            if (longValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(Long.valueOf(longValue));
                            }
                            Cursor cursor4 = zznVar2.zza;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            zzg.set(zznVar);
                            return zzc3;
                        }
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
        } catch (Throwable th2) {
            if (longValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = zznVar2.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzg.set(zznVar);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0304 -> B:168:0x0311). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x030f -> B:168:0x0311). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0335 -> B:18:0x005e). Please submit an issue!!! */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Field declaredField;
        Cursor cursor;
        int i2;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                StringBuilder sb = null;
                Boolean bool2 = bool;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool2 = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException e3) {
                                }
                                bool2 = Boolean.TRUE;
                                zzb = bool2;
                            } else if (!zzf(context)) {
                                return 0;
                            } else {
                                if (!zzd) {
                                    Boolean bool3 = Boolean.TRUE;
                                    if (!bool3.equals(null)) {
                                        try {
                                            int zzb2 = zzb(context, str, z, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader zza2 = zzb.zza();
                                                DelegateLastClassLoader delegateLastClassLoader = zza2;
                                                if (zza2 == null) {
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    delegateLastClassLoader = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                }
                                                zzd(delegateLastClassLoader);
                                                declaredField.set(null, delegateLastClassLoader);
                                                zzb = bool3;
                                                return zzb2;
                                            }
                                            return zzb2;
                                        } catch (LoadingException e4) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool2 = Boolean.FALSE;
                        zzb = bool2;
                    }
                }
                if (bool2.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e5) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e5.getMessage());
                        return 0;
                    }
                }
                zzq zzg2 = zzg(context);
                if (zzg2 == null) {
                    i2 = 0;
                } else {
                    Cursor cursor3 = null;
                    try {
                        try {
                            int zze2 = zzg2.zze();
                            if (zze2 >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor2 = zznVar.zza) == null) {
                                    cursor3 = null;
                                    cursor = (Cursor) ObjectWrapper.unwrap(zzg2.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor != 0) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                i2 = cursor.getInt(0);
                                                if (i2 > 0 && zze(cursor)) {
                                                    cursor = null;
                                                }
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                            }
                                        } catch (RemoteException e6) {
                                            e = e6;
                                            String message = e.getMessage();
                                            boolean z2 = cursor;
                                            boolean z3 = cursor;
                                            sb = new StringBuilder();
                                            boolean z4 = cursor;
                                            sb.append("Failed to retrieve remote module version: ");
                                            boolean z5 = cursor;
                                            sb.append(message);
                                            cursor3 = cursor;
                                            Log.w("DynamiteModule", sb.toString());
                                            i2 = 0;
                                            if (cursor != false) {
                                                cursor.close();
                                                i2 = 0;
                                            }
                                            return i2;
                                        } catch (Throwable th) {
                                            cursor3 = cursor;
                                            th = th;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    i2 = 0;
                                    if (cursor != 0) {
                                        cursor.close();
                                        i2 = 0;
                                    }
                                } else {
                                    cursor3 = null;
                                    i2 = cursor2.getInt(0);
                                }
                            } else if (zze2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                cursor3 = null;
                                i2 = zzg2.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                cursor3 = null;
                                i2 = zzg2.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (RemoteException e7) {
                        e = e7;
                        cursor = sb;
                    }
                }
                return i2;
            }
        } catch (Throwable th3) {
            CrashUtils.addDynamiteErrorToDropBox(context, th3);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r7, java.lang.String r8, boolean r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            boolean z2 = false;
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0) {
                z2 = false;
                if (resolveContentProvider != null) {
                    z2 = false;
                    if ("com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z2 = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z2);
            zzf = valueOf;
            boolean booleanValue = valueOf.booleanValue();
            z = booleanValue;
            if (booleanValue) {
                z = booleanValue;
                if (resolveContentProvider != null) {
                    ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                    z = booleanValue;
                    if (applicationInfo != null) {
                        z = booleanValue;
                        if ((applicationInfo.flags & 129) == 0) {
                            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            zzd = true;
                            z = booleanValue;
                        }
                    }
                }
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @Nullable
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            try {
                zzq zzqVar2 = zzk;
                if (zzqVar2 != null) {
                    return zzqVar2;
                }
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzqVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                    }
                    if (zzqVar != null) {
                        zzk = zzqVar;
                        return zzqVar;
                    }
                } catch (Exception e2) {
                    Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
                }
                return null;
            } finally {
            }
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
