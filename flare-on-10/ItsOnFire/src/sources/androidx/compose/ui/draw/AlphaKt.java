package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010��\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"alpha", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/AlphaKt.class */
public final class AlphaKt {
    @Stable
    @NotNull
    public static final Modifier alpha(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (!(f2 == 1.0f)) {
            modifier = GraphicsLayerModifierKt.m2552graphicsLayer2Xn7asI$default(modifier, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 12283, null);
        }
        return modifier;
    }
}
