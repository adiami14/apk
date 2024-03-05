package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010��\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"relocationRequester", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/RelocationRequesterModifierKt.class */
public final class RelocationRequesterModifierKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use bringIntoViewRequester instead.", replaceWith = @ReplaceWith(expression = "bringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.bringIntoViewRequester"}))
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier relocationRequester(@NotNull Modifier modifier, @NotNull Object relocationRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(relocationRequester, "relocationRequester");
        return modifier;
    }
}
