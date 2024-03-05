package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\n\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010��\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"_isSystemInDarkTheme", "", "(Landroidx/compose/runtime/Composer;I)Z", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/DarkTheme_androidKt.class */
public final class DarkTheme_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean _isSystemInDarkTheme(@Nullable Composer composer, int i2) {
        return (((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32;
    }
}
