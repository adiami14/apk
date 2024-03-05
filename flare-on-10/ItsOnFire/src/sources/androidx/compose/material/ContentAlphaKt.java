package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u0017\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalContentAlpha", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalContentAlpha", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ContentAlphaKt.class */
public final class ContentAlphaKt {
    @NotNull
    private static final ProvidableCompositionLocal<Float> LocalContentAlpha = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Float>() { // from class: androidx.compose.material.ContentAlphaKt$LocalContentAlpha$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(1.0f);
        }
    }, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
