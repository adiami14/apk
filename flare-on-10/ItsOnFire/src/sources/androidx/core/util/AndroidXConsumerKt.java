package androidx.core.util;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u001c\u0010��\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, d2 = {"asAndroidXConsumer", "Landroidx/core/util/Consumer;", "T", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/core/util/AndroidXConsumerKt.class */
public final class AndroidXConsumerKt {
    @NotNull
    public static final <T> Consumer<T> asAndroidXConsumer(@NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new AndroidXContinuationConsumer(continuation);
    }
}
