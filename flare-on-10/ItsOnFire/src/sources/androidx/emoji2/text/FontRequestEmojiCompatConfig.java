package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/FontRequestEmojiCompatConfig.class */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    private static final FontProviderHelper DEFAULT_FONTS_CONTRACT = new FontProviderHelper();

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy.class */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long j2) {
            this.mTotalMs = j2;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.mRetryOrigin == 0) {
                this.mRetryOrigin = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (uptimeMillis > this.mTotalMs) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.mTotalMs - uptimeMillis);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/FontRequestEmojiCompatConfig$FontProviderHelper.class */
    public static class FontProviderHelper {
        @Nullable
        public Typeface buildTypeface(@NonNull Context context, @NonNull FontsContractCompat.FontInfo fontInfo) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{fontInfo});
        }

        @NonNull
        public FontsContractCompat.FontFamilyResult fetchFonts(@NonNull Context context, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context, null, fontRequest);
        }

        public void registerObserver(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void unregisterObserver(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/FontRequestEmojiCompatConfig$FontRequestMetadataLoader.class */
    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        @Nullable
        @GuardedBy("mLock")
        public EmojiCompat.MetadataRepoLoaderCallback mCallback;
        @NonNull
        private final Context mContext;
        @Nullable
        @GuardedBy("mLock")
        private Executor mExecutor;
        @NonNull
        private final FontProviderHelper mFontProviderHelper;
        @NonNull
        private final Object mLock = new Object();
        @Nullable
        @GuardedBy("mLock")
        private Handler mMainHandler;
        @Nullable
        @GuardedBy("mLock")
        private Runnable mMainHandlerLoadCallback;
        @Nullable
        @GuardedBy("mLock")
        private ThreadPoolExecutor mMyThreadPoolExecutor;
        @Nullable
        @GuardedBy("mLock")
        private ContentObserver mObserver;
        @NonNull
        private final FontRequest mRequest;
        @Nullable
        @GuardedBy("mLock")
        private RetryPolicy mRetryPolicy;

        public FontRequestMetadataLoader(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontProviderHelper fontProviderHelper) {
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = fontRequest;
            this.mFontProviderHelper = fontProviderHelper;
        }

        private void cleanUp() {
            synchronized (this.mLock) {
                this.mCallback = null;
                ContentObserver contentObserver = this.mObserver;
                if (contentObserver != null) {
                    this.mFontProviderHelper.unregisterObserver(this.mContext, contentObserver);
                    this.mObserver = null;
                }
                Handler handler = this.mMainHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mMainHandlerLoadCallback);
                }
                this.mMainHandler = null;
                ThreadPoolExecutor threadPoolExecutor = this.mMyThreadPoolExecutor;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.mExecutor = null;
                this.mMyThreadPoolExecutor = null;
            }
        }

        @WorkerThread
        private FontsContractCompat.FontInfo retrieveFontInfo() {
            try {
                FontsContractCompat.FontFamilyResult fetchFonts = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
                if (fetchFonts.getStatusCode() == 0) {
                    FontsContractCompat.FontInfo[] fonts = fetchFonts.getFonts();
                    if (fonts == null || fonts.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return fonts[0];
                }
                throw new RuntimeException("fetchFonts failed (" + fetchFonts.getStatusCode() + ")");
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }

        @RequiresApi(19)
        @WorkerThread
        private void scheduleRetry(Uri uri, long j2) {
            synchronized (this.mLock) {
                Handler handler = this.mMainHandler;
                Handler handler2 = handler;
                if (handler == null) {
                    handler2 = ConcurrencyHelpers.mainHandlerAsync();
                    this.mMainHandler = handler2;
                }
                if (this.mObserver == null) {
                    ContentObserver contentObserver = new ContentObserver(handler2) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z, Uri uri2) {
                            FontRequestMetadataLoader.this.loadInternal();
                        }
                    };
                    this.mObserver = contentObserver;
                    this.mFontProviderHelper.registerObserver(this.mContext, uri, contentObserver);
                }
                if (this.mMainHandlerLoadCallback == null) {
                    this.mMainHandlerLoadCallback = new Runnable() { // from class: androidx.emoji2.text.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.loadInternal();
                        }
                    };
                }
                handler2.postDelayed(this.mMainHandlerLoadCallback, j2);
            }
        }

        @RequiresApi(19)
        @WorkerThread
        public void createMetadata() {
            synchronized (this.mLock) {
                if (this.mCallback == null) {
                    return;
                }
                try {
                    FontsContractCompat.FontInfo retrieveFontInfo = retrieveFontInfo();
                    int resultCode = retrieveFontInfo.getResultCode();
                    if (resultCode == 2) {
                        synchronized (this.mLock) {
                            RetryPolicy retryPolicy = this.mRetryPolicy;
                            if (retryPolicy != null) {
                                long retryDelay = retryPolicy.getRetryDelay();
                                if (retryDelay >= 0) {
                                    scheduleRetry(retrieveFontInfo.getUri(), retryDelay);
                                    return;
                                }
                            }
                        }
                    }
                    if (resultCode != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                    }
                    TraceCompat.beginSection(S_TRACE_BUILD_TYPEFACE);
                    Typeface buildTypeface = this.mFontProviderHelper.buildTypeface(this.mContext, retrieveFontInfo);
                    ByteBuffer mmap = TypefaceCompatUtil.mmap(this.mContext, null, retrieveFontInfo.getUri());
                    if (mmap == null || buildTypeface == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    MetadataRepo create = MetadataRepo.create(buildTypeface, mmap);
                    TraceCompat.endSection();
                    synchronized (this.mLock) {
                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.mCallback;
                        if (metadataRepoLoaderCallback != null) {
                            metadataRepoLoaderCallback.onLoaded(create);
                        }
                    }
                    cleanUp();
                } catch (Throwable th) {
                    synchronized (this.mLock) {
                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.mCallback;
                        if (metadataRepoLoaderCallback2 != null) {
                            metadataRepoLoaderCallback2.onFailed(th);
                        }
                        cleanUp();
                    }
                }
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        @RequiresApi(19)
        public void load(@NonNull EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.mLock) {
                this.mCallback = metadataRepoLoaderCallback;
            }
            loadInternal();
        }

        @RequiresApi(19)
        public void loadInternal() {
            synchronized (this.mLock) {
                if (this.mCallback == null) {
                    return;
                }
                if (this.mExecutor == null) {
                    ThreadPoolExecutor createBackgroundPriorityExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
                    this.mMyThreadPoolExecutor = createBackgroundPriorityExecutor;
                    this.mExecutor = createBackgroundPriorityExecutor;
                }
                this.mExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.createMetadata();
                    }
                });
            }
        }

        public void setExecutor(@NonNull Executor executor) {
            synchronized (this.mLock) {
                this.mExecutor = executor;
            }
        }

        public void setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
            synchronized (this.mLock) {
                this.mRetryPolicy = retryPolicy;
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/FontRequestEmojiCompatConfig$RetryPolicy.class */
    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest) {
        super(new FontRequestMetadataLoader(context, fontRequest, DEFAULT_FONTS_CONTRACT));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontProviderHelper fontProviderHelper) {
        super(new FontRequestMetadataLoader(context, fontRequest, fontProviderHelper));
    }

    @NonNull
    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(@Nullable Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setLoadingExecutor(@NonNull Executor executor) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(retryPolicy);
        return this;
    }
}
