package androidx.core.util;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u001a\u0010\u0010��\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"asRunnable", "Ljava/lang/Runnable;", "Lkotlin/coroutines/Continuation;", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/core/util/RunnableKt.class */
public final class RunnableKt {
    @NotNull
    public static final Runnable asRunnable(@NotNull Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new ContinuationRunnable(continuation);
    }
}
