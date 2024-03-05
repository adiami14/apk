package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/zacd.class */
public final class zacd<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i2, ApiKey<?> apiKey, long j2, long j3, @Nullable String str, @Nullable String str2) {
        this.zaa = googleApiManager;
        this.zab = i2;
        this.zac = apiKey;
        this.zad = j2;
        this.zae = j3;
    }

    @Nullable
    public static <T> zacd<T> zaa(GoogleApiManager googleApiManager, int i2, ApiKey<?> apiKey) {
        boolean z;
        if (googleApiManager.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                z = true;
            } else if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            } else {
                boolean methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
                zabq zak = googleApiManager.zak(apiKey);
                z = methodTimingTelemetryEnabled;
                if (zak != null) {
                    if (!(zak.zaf() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                    z = methodTimingTelemetryEnabled;
                    if (baseGmsClient.hasConnectionInfo()) {
                        z = methodTimingTelemetryEnabled;
                        if (!baseGmsClient.isConnecting()) {
                            ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i2);
                            if (zab == null) {
                                return null;
                            }
                            zak.zaq();
                            z = zab.getMethodTimingTelemetryEnabled();
                        }
                    }
                }
            }
            return new zacd<>(googleApiManager, i2, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    @Nullable
    private static ConnectionTelemetryConfiguration zab(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i2) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i2)) {
                return null;
            }
        } else if (!ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i2)) {
            return null;
        }
        if (zabqVar.zac() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task<T> task) {
        zabq zak;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int errorCode;
        long j2;
        long j3;
        int i6;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                boolean z2 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    boolean methodTimingTelemetryEnabled = z2 & config.getMethodTimingTelemetryEnabled();
                    i4 = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i2 = config.getVersion();
                    boolean z3 = methodTimingTelemetryEnabled;
                    int i7 = maxMethodInvocationsInBatch;
                    if (baseGmsClient.hasConnectionInfo()) {
                        z3 = methodTimingTelemetryEnabled;
                        i7 = maxMethodInvocationsInBatch;
                        if (!baseGmsClient.isConnecting()) {
                            ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                            if (zab == null) {
                                return;
                            }
                            z3 = zab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                            i7 = zab.getMaxMethodInvocationsLogged();
                        }
                    }
                    i3 = i7;
                    z = z3;
                } else {
                    i2 = 0;
                    i3 = 100;
                    i4 = 5000;
                    z = z2;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                    i5 = 0;
                } else {
                    if (task.isCanceled()) {
                        i5 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i5 = statusCode;
                        } else {
                            i5 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z) {
                    j2 = this.zad;
                    j3 = System.currentTimeMillis();
                    i6 = (int) (SystemClock.elapsedRealtime() - this.zae);
                } else {
                    j2 = 0;
                    j3 = 0;
                    i6 = -1;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i5, errorCode, j2, j3, null, null, gCoreServiceId, i6), i2, i4, i3);
            }
        }
    }
}
