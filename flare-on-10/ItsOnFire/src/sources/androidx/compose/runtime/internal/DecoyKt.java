package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0001\n��\n\u0002\u0010\u000e\n��\u001a\u0010\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"illegalDecoyCallException", "", "fName", "", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/internal/DecoyKt.class */
public final class DecoyKt {
    @ComposeCompilerApi
    @NotNull
    public static final Void illegalDecoyCallException(@NotNull String fName) {
        Intrinsics.checkNotNullParameter(fName, "fName");
        throw new IllegalStateException("Function " + fName + " should have been replaced by compiler.");
    }
}
