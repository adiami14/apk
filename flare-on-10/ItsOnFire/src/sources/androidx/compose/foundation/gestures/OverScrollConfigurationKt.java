package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010��\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LocalOverScrollConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/gestures/OverScrollConfiguration;", "getLocalOverScrollConfiguration$annotations", "()V", "getLocalOverScrollConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/OverScrollConfigurationKt.class */
public final class OverScrollConfigurationKt {
    @NotNull
    private static final ProvidableCompositionLocal<OverScrollConfiguration> LocalOverScrollConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new Function0<OverScrollConfiguration>() { // from class: androidx.compose.foundation.gestures.OverScrollConfigurationKt$LocalOverScrollConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final OverScrollConfiguration invoke() {
            return new OverScrollConfiguration(0L, false, null, 7, null);
        }
    }, 1, null);

    @ExperimentalFoundationApi
    @NotNull
    public static final ProvidableCompositionLocal<OverScrollConfiguration> getLocalOverScrollConfiguration() {
        return LocalOverScrollConfiguration;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalOverScrollConfiguration$annotations() {
    }
}
