package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import l.i0;
import l.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.t0;
@Metadata(bv = {}, d1 = {"��\u0012\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018�� \u0004*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u00022\b\u0012\u0004\u0012\u00028��0\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Ll/n;", "E", "Ll/m0;", "Ll/i0;", "c", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/n.class */
public interface n<E> extends m0<E>, i0<E> {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final b f727c = b.f734a;

    /* renamed from: d  reason: collision with root package name */
    public static final int f728d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public static final int f729e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f730f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f731g = -2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f732h = -3;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final String f733i = "kotlinx.coroutines.channels.defaultBuffer";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:l/n$a.class */
    public static final class a {
        @NotNull
        public static <E> t.d<E> b(@NotNull n<E> nVar) {
            return i0.a.d(nVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull n<E> nVar, E e2) {
            return m0.a.c(nVar, e2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E d(@NotNull n<E> nVar) {
            return (E) i0.a.h(nVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @LowPriorityInOverloadResolution
        @Nullable
        public static <E> Object e(@NotNull n<E> nVar, @NotNull Continuation<? super E> continuation) {
            return i0.a.i(nVar, continuation);
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028��X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028��X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ll/n$b;", "", "", "b", "I", "UNLIMITED", "c", "RENDEZVOUS", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "CONFLATED", "e", "BUFFERED", "f", "OPTIONAL_CHANNEL", "", "g", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", "h", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:l/n$b.class */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f735b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public static final int f736c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f737d = -1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f738e = -2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f739f = -3;
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public static final String f740g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f734a = new b();

        /* renamed from: h  reason: collision with root package name */
        public static final int f741h = t0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return f741h;
        }
    }
}
