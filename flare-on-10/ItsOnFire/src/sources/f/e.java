package f;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.SoundPool;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018�� \u000e2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lf/e;", "", "", "id", "", "m", "Landroid/media/SoundPool;", "a", "Landroid/media/SoundPool;", "soundPool", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "b", "app_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:f/e.class */
public final class e {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final a f407b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f408c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static int f409d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static int f410e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static int f411f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static int f412g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static int f413h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static int f414i = -1;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final SoundPool f415a;

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lf/e$a;", "", "", "playerExplodeID", "I", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()I", "j", "(I)V", "invaderExplodeID", "b", "h", "shootID", "e", "k", "damageShelterID", "a", "g", "uhID", "f", "l", "ohID", "c", "i", "<init>", "()V", "app_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:f/e$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f412g;
        }

        public final int b() {
            return e.f410e;
        }

        public final int c() {
            return e.f414i;
        }

        public final int d() {
            return e.f409d;
        }

        public final int e() {
            return e.f411f;
        }

        public final int f() {
            return e.f413h;
        }

        public final void g(int i2) {
            e.f412g = i2;
        }

        public final void h(int i2) {
            e.f410e = i2;
        }

        public final void i(int i2) {
            e.f414i = i2;
        }

        public final void j(int i2) {
            e.f409d = i2;
        }

        public final void k(int i2) {
            e.f411f = i2;
        }

        public final void l(int i2) {
            e.f413h = i2;
        }
    }

    public e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SoundPool soundPool = new SoundPool(10, 3, 0);
        this.f415a = soundPool;
        try {
            AssetManager assets = context.getAssets();
            AssetFileDescriptor openFd = assets.openFd("shoot.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd, "assetManager.openFd(\"shoot.ogg\")");
            f411f = soundPool.load(openFd, 0);
            AssetFileDescriptor openFd2 = assets.openFd("invaderexplode.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd2, "assetManager.openFd(\"invaderexplode.ogg\")");
            f410e = soundPool.load(openFd2, 0);
            AssetFileDescriptor openFd3 = assets.openFd("damageshelter.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd3, "assetManager.openFd(\"damageshelter.ogg\")");
            f412g = soundPool.load(openFd3, 0);
            AssetFileDescriptor openFd4 = assets.openFd("playerexplode.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd4, "assetManager.openFd(\"playerexplode.ogg\")");
            f409d = soundPool.load(openFd4, 0);
            AssetFileDescriptor openFd5 = assets.openFd("damageshelter.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd5, "assetManager.openFd(\"damageshelter.ogg\")");
            f412g = soundPool.load(openFd5, 0);
            AssetFileDescriptor openFd6 = assets.openFd("uh.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd6, "assetManager.openFd(\"uh.ogg\")");
            f413h = soundPool.load(openFd6, 0);
            AssetFileDescriptor openFd7 = assets.openFd("oh.ogg");
            Intrinsics.checkNotNullExpressionValue(openFd7, "assetManager.openFd(\"oh.ogg\")");
            f414i = soundPool.load(openFd7, 0);
        } catch (IOException e2) {
            Log.e(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "failed to load sound files");
        }
    }

    public final void m(int i2) {
        this.f415a.play(i2, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
