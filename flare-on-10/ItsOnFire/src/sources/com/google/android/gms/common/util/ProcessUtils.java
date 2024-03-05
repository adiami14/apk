package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/ProcessUtils.class */
public class ProcessUtils {
    @Nullable
    private static String zza;
    private static int zzb;

    private ProcessUtils() {
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public static String getMyProcessName() {
        BufferedReader bufferedReader;
        if (zza == null) {
            int i2 = zzb;
            int i3 = i2;
            if (i2 == 0) {
                i3 = Process.myPid();
                zzb = i3;
            }
            String str = null;
            if (i3 <= 0) {
                str = null;
            } else {
                try {
                    String str2 = "/proc/" + i3 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException e2) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    Preconditions.checkNotNull(readLine);
                    str = readLine.trim();
                } catch (IOException e3) {
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly(bufferedReader);
                    throw th;
                }
                IOUtils.closeQuietly(bufferedReader);
            }
            zza = str;
        }
        return zza;
    }
}
