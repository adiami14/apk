package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
@ShowFirstParty
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/GoogleApiManager.class */
public class GoogleApiManager implements Handler.Callback {
    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();
    @Nullable
    @GuardedBy("lock")
    private static GoogleApiManager zad;
    @Nullable
    private TelemetryData zai;
    @Nullable
    private TelemetryLoggingClient zaj;
    private final Context zak;
    private final GoogleApiAvailability zal;
    private final com.google.android.gms.common.internal.zal zam;
    @NotOnlyInitialized
    private final Handler zat;
    private volatile boolean zau;
    private long zae = 5000;
    private long zaf = 120000;
    private long zag = 10000;
    private boolean zah = false;
    private final AtomicInteger zan = new AtomicInteger(1);
    private final AtomicInteger zao = new AtomicInteger(0);
    private final Map<ApiKey<?>, zabq<?>> zap = new ConcurrentHashMap(5, 0.75f, 1);
    @Nullable
    @GuardedBy("lock")
    private zaae zaq = null;
    @GuardedBy("lock")
    private final Set<ApiKey<?>> zar = new ArraySet();
    private final Set<ApiKey<?>> zas = new ArraySet();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zau = true;
        this.zak = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.zat = zaqVar;
        this.zal = googleApiAvailability;
        this.zam = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zao.incrementAndGet();
                Handler handler = googleApiManager.zat;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaH(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String zab2 = apiKey.zab();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(zab2).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(zab2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    @WorkerThread
    private final zabq<?> zaI(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zabq<?> zabqVar = this.zap.get(apiKey);
        zabq<?> zabqVar2 = zabqVar;
        if (zabqVar == null) {
            zabqVar2 = new zabq<>(this, googleApi);
            this.zap.put(apiKey, zabqVar2);
        }
        if (zabqVar2.zaz()) {
            this.zas.add(apiKey);
        }
        zabqVar2.zao();
        return zabqVar2;
    }

    @WorkerThread
    private final TelemetryLoggingClient zaJ() {
        if (this.zaj == null) {
            this.zaj = TelemetryLogging.getClient(this.zak);
        }
        return this.zaj;
    }

    @WorkerThread
    private final void zaK() {
        TelemetryData telemetryData = this.zai;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaF()) {
                zaJ().log(telemetryData);
            }
            this.zai = null;
        }
    }

    private final <T> void zaL(TaskCompletionSource<T> taskCompletionSource, int i2, GoogleApi googleApi) {
        zacd zaa2;
        if (i2 == 0 || (zaa2 = zacd.zaa(this, i2, googleApi.getApiKey())) == null) {
            return;
        }
        Task<T> task = taskCompletionSource.getTask();
        final Handler handler = this.zat;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zaa2);
    }

    @NonNull
    public static GoogleApiManager zal() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @NonNull
    public static GoogleApiManager zam(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03de  */
    @Override // android.os.Handler.Callback
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(@androidx.annotation.NonNull android.os.Message r9) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.handleMessage(android.os.Message):boolean");
    }

    public final void zaA() {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaB(@NonNull GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zaC(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            if (this.zaq != zaaeVar) {
                this.zaq = zaaeVar;
                this.zar.clear();
            }
            this.zar.addAll(zaaeVar.zaa());
        }
    }

    public final void zaD(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            if (this.zaq == zaaeVar) {
                this.zaq = null;
                this.zar.clear();
            }
        }
    }

    @WorkerThread
    public final boolean zaF() {
        if (this.zah) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null || config.getMethodInvocationTelemetryEnabled()) {
            int zaa2 = this.zam.zaa(this.zak, 203400000);
            return zaa2 == -1 || zaa2 == 0;
        }
        return false;
    }

    public final boolean zaG(ConnectionResult connectionResult, int i2) {
        return this.zal.zah(this.zak, connectionResult, i2);
    }

    public final int zaa() {
        return this.zan.getAndIncrement();
    }

    @Nullable
    public final zabq zak(ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    @NonNull
    public final Task<Map<ApiKey<?>, String>> zao(@NonNull Iterable<? extends HasApiKey<?>> iterable) {
        zal zalVar = new zal(iterable);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    public final Task<Boolean> zap(@NonNull GoogleApi<?> googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Void> zaq(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaL(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new zach(zafVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Boolean> zar(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaL(taskCompletionSource, i2, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new zach(zahVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> void zaw(@NonNull GoogleApi<O> googleApi, int i2, @NonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i2, apiMethodImpl);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, this.zao.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zax(@NonNull GoogleApi<O> googleApi, int i2, @NonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        zaL(taskCompletionSource, taskApiCall.zaa(), googleApi);
        zag zagVar = new zag(i2, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zagVar, this.zao.get(), googleApi)));
    }

    public final void zay(MethodInvocation methodInvocation, int i2, long j2, int i3) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i2, j2, i3)));
    }

    public final void zaz(@NonNull ConnectionResult connectionResult, int i2) {
        if (zaG(connectionResult, i2)) {
            return;
        }
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
    }
}
