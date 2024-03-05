package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/Strings_androidKt.class */
public final class Strings_androidKt {
    @Composable
    @NotNull
    /* renamed from: getString-4foXLRw  reason: not valid java name */
    public static final String m1531getString4foXLRw(int i2, @Nullable Composer composer, int i3) {
        String str;
        String str2;
        composer.startReplaceableGroup(-845575816);
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m1522equalsimpl0(i2, companion.m1530getNavigationMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            str2 = "resources.getString(R.string.navigation_menu)";
        } else if (Strings.m1522equalsimpl0(i2, companion.m1526getCloseDrawerUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
            str2 = "resources.getString(R.string.close_drawer)";
        } else if (Strings.m1522equalsimpl0(i2, companion.m1527getCloseSheetUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
            str2 = "resources.getString(R.string.close_sheet)";
        } else if (Strings.m1522equalsimpl0(i2, companion.m1528getDefaultErrorMessageUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
            str2 = "resources.getString(R.st…ng.default_error_message)";
        } else if (!Strings.m1522equalsimpl0(i2, companion.m1529getExposedDropdownMenuUdPEhr4())) {
            str = "";
            composer.endReplaceableGroup();
            return str;
        } else {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            str2 = "resources.getString(R.string.dropdown_menu)";
        }
        Intrinsics.checkNotNullExpressionValue(str, str2);
        composer.endReplaceableGroup();
        return str;
    }
}
