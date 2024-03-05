package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: ItsOnFire.jar:com/google/android/gms/ads/identifier/zzc.class */
public final class zzc {
    @WorkerThread
    public static final void zza(String str) {
        try {
            zzi.zzb(263);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(str);
                    Log.w("HttpUrlPinger", sb.toString());
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException | RuntimeException e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e2);
        } catch (IndexOutOfBoundsException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e3);
        } finally {
            zzi.zza();
        }
    }
}
