package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\bÃ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29VerificationHelper;", "", "()V", "setRenderEffect", "", "renderNode", "Landroid/graphics/RenderNode;", "target", "Landroidx/compose/ui/graphics/RenderEffect;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(31)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/RenderNodeApi29VerificationHelper.class */
final class RenderNodeApi29VerificationHelper {
    @NotNull
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    @DoNotInline
    public final void setRenderEffect(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setRenderEffect(renderEffect == null ? null : renderEffect.asAndroidRenderEffect());
    }
}
