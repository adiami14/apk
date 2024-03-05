package androidx.compose.ui.platform;

import android.view.View;
import androidx.appcompat.R;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018�� \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "createRecomposer", "Landroidx/compose/runtime/Recomposer;", "windowRootView", "Landroid/view/View;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@InternalComposeUiApi
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/WindowRecomposerFactory.class */
public interface WindowRecomposerFactory {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "()V", "LifecycleAware", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/WindowRecomposerFactory$Companion.class */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final WindowRecomposerFactory LifecycleAware = new WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.WindowRecomposerFactory$Companion$LifecycleAware$1
            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            @NotNull
            public final Recomposer createRecomposer(@NotNull View rootView) {
                Recomposer createLifecycleAwareViewTreeRecomposer;
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                createLifecycleAwareViewTreeRecomposer = WindowRecomposer_androidKt.createLifecycleAwareViewTreeRecomposer(rootView);
                return createLifecycleAwareViewTreeRecomposer;
            }
        };

        private Companion() {
        }

        @NotNull
        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }
    }

    @NotNull
    Recomposer createRecomposer(@NotNull View view);
}
