package m;

import android.annotation.SuppressLint;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import n.h;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import sun.misc.SignalHandler;
@Metadata(bv = {}, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018��2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lm/b;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "b", "", "Z", "enableCreationStackTraces", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: ItsOnFire.jar:m/b.class */
public final class b {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final b f999a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1000b;

    @Metadata(bv = {}, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lm/b$a;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:m/b$a.class */
    public static final class a implements ClassFileTransformer {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public static final a f1001a = new a();

        @Nullable
        public byte[] a(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (Intrinsics.areEqual(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                n.a.f1002a.b(true);
                return ByteStreamsKt.readBytes(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object m5849constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            m5849constructorimpl = Result.m5849constructorimpl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5855isFailureimpl(m5849constructorimpl)) {
            m5849constructorimpl = null;
        }
        Boolean bool = (Boolean) m5849constructorimpl;
        f1000b = bool != null ? bool.booleanValue() : h.f1056a.u();
    }

    public static final void c(Signal signal) {
        h hVar = h.f1056a;
        if (hVar.z()) {
            hVar.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @JvmStatic
    public static final void d(@Nullable String str, @NotNull Instrumentation instrumentation) {
        n.a.f1002a.b(true);
        instrumentation.addTransformer(a.f1001a);
        h hVar = h.f1056a;
        hVar.K(f1000b);
        hVar.x();
        f999a.b();
    }

    public final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: m.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable th) {
        }
    }
}
