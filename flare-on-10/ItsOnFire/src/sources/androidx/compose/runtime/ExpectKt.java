package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010��\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b��\u0010\u0002H��¨\u0006\u0003"}, d2 = {"ThreadLocal", "Landroidx/compose/runtime/ThreadLocal;", "T", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/ExpectKt.class */
public final class ExpectKt {
    @NotNull
    public static final <T> ThreadLocal<T> ThreadLocal() {
        return new ThreadLocal<>(new Function0<T>() { // from class: androidx.compose.runtime.ExpectKt$ThreadLocal$1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final T invoke() {
                return null;
            }
        });
    }
}
