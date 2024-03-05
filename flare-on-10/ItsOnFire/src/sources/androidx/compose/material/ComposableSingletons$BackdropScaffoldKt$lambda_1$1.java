package androidx.compose.material;

import androidx.compose.material.ComposableSingletons$BackdropScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/SnackbarHostState;", "invoke", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ComposableSingletons$BackdropScaffoldKt$lambda_1$1.class */
public final class ComposableSingletons$BackdropScaffoldKt$lambda_1$1 extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {
    public static final ComposableSingletons$BackdropScaffoldKt.lambda-1.1 INSTANCE = new ComposableSingletons$BackdropScaffoldKt$lambda_1$1();

    public ComposableSingletons$BackdropScaffoldKt$lambda_1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
        invoke(snackbarHostState, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull SnackbarHostState it, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i3 = i2;
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(it) ? 4 : 2);
        }
        if (((i3 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            SnackbarHostKt.SnackbarHost(it, null, null, composer, i3 & 14, 6);
        }
    }
}
