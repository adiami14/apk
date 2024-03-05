package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0017\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalInspectionMode", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalInspectionMode", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/InspectionModeKt.class */
public final class InspectionModeKt {
    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalInspectionMode = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.ui.platform.InspectionModeKt$LocalInspectionMode$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
