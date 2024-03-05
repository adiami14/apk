package androidx.compose.runtime;

import androidx.compose.runtime.ComposableSingletons$RecomposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010��\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/ComposableSingletons$RecomposerKt$lambda_1$1.class */
public final class ComposableSingletons$RecomposerKt$lambda_1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$RecomposerKt.lambda-1.1 INSTANCE = new ComposableSingletons$RecomposerKt$lambda_1$1();

    public ComposableSingletons$RecomposerKt$lambda_1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        }
    }
}
