package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"rotate", "Landroidx/compose/ui/Modifier;", "degrees", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/RotateKt.class */
public final class RotateKt {
    @Stable
    @NotNull
    public static final Modifier rotate(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (!(f2 == 0.0f)) {
            modifier = GraphicsLayerModifierKt.m2552graphicsLayer2Xn7asI$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0L, null, false, null, 16127, null);
        }
        return modifier;
    }
}
