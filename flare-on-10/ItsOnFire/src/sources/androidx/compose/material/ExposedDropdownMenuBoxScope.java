package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018��2\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalMaterialApi
/* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuBoxScope.class */
public interface ExposedDropdownMenuBoxScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuBoxScope$DefaultImpls.class */
    public static final class DefaultImpls {
        /* JADX WARN: Code restructure failed: missing block: B:75:0x027e, code lost:
            if (r0 == r0.getEmpty()) goto L45;
         */
        @androidx.compose.runtime.Composable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void ExposedDropdownMenu(@org.jetbrains.annotations.NotNull final androidx.compose.material.ExposedDropdownMenuBoxScope r14, final boolean r15, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r19, final int r20, final int r21) {
            /*
                Method dump skipped, instructions count: 770
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.DefaultImpls.ExposedDropdownMenu(androidx.compose.material.ExposedDropdownMenuBoxScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
        }

        public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = true;
                }
                return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
    }

    @Composable
    void ExposedDropdownMenu(boolean z, @NotNull Function0<Unit> function0, @Nullable Modifier modifier, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3);

    @NotNull
    Modifier exposedDropdownSize(@NotNull Modifier modifier, boolean z);
}
