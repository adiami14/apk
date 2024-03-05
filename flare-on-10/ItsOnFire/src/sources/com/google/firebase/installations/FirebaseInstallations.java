package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: ItsOnFire.jar:com/google/firebase/installations/FirebaseInstallations.class */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
    private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private final ExecutorService backgroundExecutor;
    @GuardedBy("this")
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;
    @GuardedBy("FirebaseInstallations.this")
    private Set<FidListener> fidListeners;
    private final FirebaseApp firebaseApp;
    private final Lazy<IidStore> iidStore;
    @GuardedBy("lock")
    private final List<StateListener> listeners;
    private final Object lock;
    private final Executor networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;
    private static final Object lockGenerateFid = new Object();
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.mCount.getAndIncrement())));
        }
    };

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:com/google/firebase/installations/FirebaseInstallations$3.class */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004a -> B:24:0x0014). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:32:0x001f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:8:0x002a). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:26:0x003e). Please submit an issue!!! */
        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(final FirebaseApp firebaseApp, @NonNull Provider<HeartBeatController> provider, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider), new PersistedInstallation(firebaseApp), Utils.getInstance(), new Lazy(new Provider() { // from class: com.google.firebase.installations.e
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                IidStore lambda$new$0;
                lambda$new$0 = FirebaseInstallations.lambda$new$0(FirebaseApp.this);
                return lambda$new$0;
            }
        }), new RandomFidGenerator());
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy<IidStore> lazy, RandomFidGenerator randomFidGenerator) {
        this.lock = new Object();
        this.fidListeners = new HashSet();
        this.listeners = new ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = lazy;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = executor;
    }

    private Task<InstallationTokenResult> addGetAuthTokenListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new GetAuthTokenListener(this.utils, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> addGetIdListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void addStateListeners(StateListener stateListener) {
        synchronized (this.lock) {
            this.listeners.add(stateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void deleteFirebaseInstallationId() throws FirebaseInstallationsException {
        updateCacheFid(null);
        PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        if (multiProcessSafePrefs.isRegistered()) {
            this.serviceClient.deleteFirebaseInstallation(getApiKey(), multiProcessSafePrefs.getFirebaseInstallationId(), getProjectIdentifier(), multiProcessSafePrefs.getRefreshToken());
        }
        insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* renamed from: doNetworkCallIfNecessary */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lambda$doRegistrationOrRefresh$3(boolean r5) {
        /*
            r4 = this;
            r0 = r4
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.getMultiProcessSafePrefs()
            r6 = r0
            r0 = r6
            boolean r0 = r0.isErrored()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L86
            if (r0 != 0) goto L32
            r0 = r6
            boolean r0 = r0.isUnregistered()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L86
            if (r0 == 0) goto L16
            goto L32
        L16:
            r0 = r5
            if (r0 != 0) goto L29
            r0 = r4
            com.google.firebase.installations.Utils r0 = r0.utils     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L86
            r1 = r6
            boolean r0 = r0.isAuthTokenExpired(r1)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L86
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            r0 = r4
            r1 = r6
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.fetchAuthTokenFromServer(r1)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L86
            r7 = r0
            goto L38
        L32:
            r0 = r4
            r1 = r6
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.registerFidWithServer(r1)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L86
            r7 = r0
        L38:
            r0 = r4
            r1 = r7
            r0.insertOrUpdatePrefs(r1)
            r0 = r4
            r1 = r6
            r2 = r7
            r0.updateFidListener(r1, r2)
            r0 = r7
            boolean r0 = r0.isRegistered()
            if (r0 == 0) goto L52
            r0 = r4
            r1 = r7
            java.lang.String r1 = r1.getFirebaseInstallationId()
            r0.updateCacheFid(r1)
        L52:
            r0 = r7
            boolean r0 = r0.isErrored()
            if (r0 == 0) goto L6c
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r1 = r0
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r1.<init>(r2)
            r7 = r0
        L64:
            r0 = r4
            r1 = r7
            r0.triggerOnException(r1)
            goto L85
        L6c:
            r0 = r7
            boolean r0 = r0.isNotGenerated()
            if (r0 == 0) goto L80
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r7 = r0
            goto L64
        L80:
            r0 = r4
            r1 = r7
            r0.triggerOnStateReached(r1)
        L85:
            return
        L86:
            r7 = move-exception
            r0 = r4
            r1 = r7
            r0.triggerOnException(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.lambda$doRegistrationOrRefresh$3(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRegistrationOrRefresh */
    public final void lambda$getToken$2(final boolean z) {
        PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        PersistedInstallationEntry persistedInstallationEntry = prefsWithGeneratedIdMultiProcessSafe;
        if (z) {
            persistedInstallationEntry = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(persistedInstallationEntry);
        this.networkExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.a
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.lambda$doRegistrationOrRefresh$3(z);
            }
        });
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(@NonNull PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult generateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
        int i2 = AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[generateAuthToken.getResponseCode().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    updateCacheFid(null);
                    return persistedInstallationEntry.withNoGeneratedFid();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
            }
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        return persistedInstallationEntry.withAuthToken(generateAuthToken.getToken(), generateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
    }

    private String getCacheFid() {
        String str;
        synchronized (this) {
            str = this.cachedFid;
        }
        return str;
    }

    private IidStore getIidStore() {
        return this.iidStore.get();
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    private PersistedInstallationEntry getMultiProcessSafePrefs() {
        PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            CrossProcessLock acquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            if (acquire != null) {
                acquire.releaseAndClose();
            }
        }
        return readPersistedInstallationEntryValue;
    }

    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        PersistedInstallationEntry persistedInstallationEntry;
        synchronized (lockGenerateFid) {
            CrossProcessLock acquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            PersistedInstallationEntry readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            persistedInstallationEntry = readPersistedInstallationEntryValue;
            if (readPersistedInstallationEntryValue.isNotGenerated()) {
                persistedInstallationEntry = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(readPersistedInstallationEntryValue)));
            }
            if (acquire != null) {
                acquire.releaseAndClose();
            }
        }
        return persistedInstallationEntry;
    }

    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            CrossProcessLock acquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
            if (acquire != null) {
                acquire.releaseAndClose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getId$1() {
        lambda$getToken$2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IidStore lambda$new$0(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    private void preConditionChecks() {
        Preconditions.checkNotEmpty(getApplicationId(), APP_ID_VALIDATION_MSG);
        Preconditions.checkNotEmpty(getProjectIdentifier(), PROJECT_ID_VALIDATION_MSG);
        Preconditions.checkNotEmpty(getApiKey(), API_KEY_VALIDATION_MSG);
        Preconditions.checkArgument(Utils.isValidAppIdFormat(getApplicationId()), APP_ID_VALIDATION_MSG);
        Preconditions.checkArgument(Utils.isValidApiKeyFormat(getApiKey()), API_KEY_VALIDATION_MSG);
    }

    private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry) {
        if ((this.firebaseApp.getName().equals(CHIME_FIREBASE_APP_NAME) || this.firebaseApp.isDefaultApp()) && persistedInstallationEntry.shouldAttemptMigration()) {
            String readIid = getIidStore().readIid();
            String str = readIid;
            if (TextUtils.isEmpty(readIid)) {
                str = this.fidGenerator.createRandomFid();
            }
            return str;
        }
        return this.fidGenerator.createRandomFid();
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse createFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : getIidStore().readToken());
        int i2 = AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[createFirebaseInstallation.getResponseCode().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return persistedInstallationEntry.withFisError("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        return persistedInstallationEntry.withRegisteredFid(createFirebaseInstallation.getFid(), createFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), createFirebaseInstallation.getAuthToken().getToken(), createFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
    }

    private void triggerOnException(Exception exc) {
        synchronized (this.lock) {
            Iterator<StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onException(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.lock) {
            Iterator<StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onStateReached(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    private void updateCacheFid(String str) {
        synchronized (this) {
            this.cachedFid = str;
        }
    }

    private void updateFidListener(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        synchronized (this) {
            if (this.fidListeners.size() != 0 && !TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
                for (FidListener fidListener : this.fidListeners) {
                    fidListener.onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
                }
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<Void> delete() {
        return Tasks.call(this.backgroundExecutor, new Callable() { // from class: com.google.firebase.installations.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void deleteFirebaseInstallationId;
                deleteFirebaseInstallationId = FirebaseInstallations.this.deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
            }
        });
    }

    @Nullable
    public String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    @VisibleForTesting
    public String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        preConditionChecks();
        String cacheFid = getCacheFid();
        if (cacheFid != null) {
            return Tasks.forResult(cacheFid);
        }
        Task<String> addGetIdListener = addGetIdListener();
        this.backgroundExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.d
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.lambda$getId$1();
            }
        });
        return addGetIdListener;
    }

    @VisibleForTesting
    public String getName() {
        return this.firebaseApp.getName();
    }

    @Nullable
    public String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<InstallationTokenResult> getToken(final boolean z) {
        preConditionChecks();
        Task<InstallationTokenResult> addGetAuthTokenListener = addGetAuthTokenListener();
        this.backgroundExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.lambda$getToken$2(z);
            }
        });
        return addGetAuthTokenListener;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public FidListenerHandle registerFidListener(@NonNull final FidListener fidListener) {
        FidListenerHandle fidListenerHandle;
        synchronized (this) {
            this.fidListeners.add(fidListener);
            fidListenerHandle = new FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.2
                @Override // com.google.firebase.installations.internal.FidListenerHandle
                public void unregister() {
                    synchronized (FirebaseInstallations.this) {
                        FirebaseInstallations.this.fidListeners.remove(fidListener);
                    }
                }
            };
        }
        return fidListenerHandle;
    }
}
