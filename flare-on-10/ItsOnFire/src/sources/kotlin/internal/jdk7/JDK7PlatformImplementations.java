package kotlin.internal.jdk7;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018��2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/internal/jdk7/JDK7PlatformImplementations.class */
public class JDK7PlatformImplementations extends PlatformImplementations {

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion.class */
    public static final class ReflectSdkVersion {
        @NotNull
        public static final ReflectSdkVersion INSTANCE = new ReflectSdkVersion();
        @JvmField
        @Nullable
        public static final Integer sdkVersion;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        static {
            /*
                kotlin.internal.jdk7.JDK7PlatformImplementations$ReflectSdkVersion r0 = new kotlin.internal.jdk7.JDK7PlatformImplementations$ReflectSdkVersion
                r1 = r0
                r1.<init>()
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.INSTANCE = r0
                r0 = 0
                r3 = r0
                java.lang.String r0 = "android.os.Build$VERSION"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4d
                java.lang.String r1 = "SDK_INT"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L4d
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                r4 = r0
                r0 = r4
                boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L4d
                if (r0 == 0) goto L2a
                r0 = r4
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4d
                r4 = r0
                goto L2c
            L2a:
                r0 = 0
                r4 = r0
            L2c:
                r0 = r3
                r5 = r0
                r0 = r4
                if (r0 == 0) goto L48
                r0 = r4
                int r0 = r0.intValue()
                if (r0 <= 0) goto L3e
                r0 = 1
                r6 = r0
                goto L40
            L3e:
                r0 = 0
                r6 = r0
            L40:
                r0 = r3
                r5 = r0
                r0 = r6
                if (r0 == 0) goto L48
                r0 = r4
                r5 = r0
            L48:
                r0 = r5
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion = r0
                return
            L4d:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.m7118clinit():void");
        }

        private ReflectSdkVersion() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i2) {
        Integer num = ReflectSdkVersion.sdkVersion;
        return num == null || num.intValue() >= i2;
    }

    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (sdkIsNullOrAtLeast(19)) {
            cause.addSuppressed(exception);
        } else {
            super.addSuppressed(cause, exception);
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    @NotNull
    public List<Throwable> getSuppressed(@NotNull Throwable exception) {
        List<Throwable> suppressed;
        List<Throwable> asList;
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (sdkIsNullOrAtLeast(19)) {
            Throwable[] suppressed2 = exception.getSuppressed();
            Intrinsics.checkNotNullExpressionValue(suppressed2, "exception.suppressed");
            asList = ArraysKt___ArraysJvmKt.asList(suppressed2);
            suppressed = asList;
        } else {
            suppressed = super.getSuppressed(exception);
        }
        return suppressed;
    }
}
