package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/zzb.class */
public final class zzb {
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static volatile ClassLoader zza;
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static volatile Thread zzb;

    @Nullable
    public static ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            try {
                if (zza == null) {
                    zza = zzb();
                }
                classLoader = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    @Nullable
    private static ClassLoader zzb() {
        synchronized (zzb.class) {
            try {
                ClassLoader classLoader = null;
                if (zzb == null) {
                    zzb = zzc();
                    if (zzb == null) {
                        return null;
                    }
                }
                synchronized (zzb) {
                    try {
                        classLoader = zzb.getContextClassLoader();
                    } catch (SecurityException e2) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e2.getMessage());
                    }
                }
                return classLoader;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static Thread zzc() {
        zza zzaVar;
        zza zzaVar2;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2;
        zza zzaVar3;
        synchronized (zzb.class) {
            try {
                ThreadGroup threadGroup3 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup3 == null) {
                    return null;
                }
                synchronized (Void.class) {
                    try {
                        int activeGroupCount = threadGroup3.activeGroupCount();
                        ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                        threadGroup3.enumerate(threadGroupArr);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= activeGroupCount) {
                                threadGroup = null;
                                break;
                            }
                            threadGroup = threadGroupArr[i2];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i2++;
                        }
                        threadGroup2 = threadGroup;
                        if (threadGroup == null) {
                            threadGroup2 = new ThreadGroup(threadGroup3, "dynamiteLoader");
                        }
                        int activeCount = threadGroup2.activeCount();
                        Thread[] threadArr = new Thread[activeCount];
                        threadGroup2.enumerate(threadArr);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= activeCount) {
                                zzaVar = null;
                                break;
                            }
                            zzaVar = threadArr[i3];
                            if ("GmsDynamite".equals(zzaVar.getName())) {
                                break;
                            }
                            i3++;
                        }
                        zzaVar2 = zzaVar;
                    } catch (SecurityException e2) {
                        e = e2;
                        zzaVar = null;
                    }
                    if (zzaVar == null) {
                        try {
                            zzaVar3 = new zza(threadGroup2, "GmsDynamite");
                        } catch (SecurityException e3) {
                            e = e3;
                        }
                        try {
                            zzaVar3.setContextClassLoader(null);
                            zzaVar3.start();
                            zzaVar = zzaVar3;
                        } catch (SecurityException e4) {
                            e = e4;
                            zzaVar = zzaVar3;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            zzaVar2 = zzaVar;
                            return zzaVar2;
                        }
                        zzaVar2 = zzaVar;
                    }
                }
                return zzaVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
