package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010��\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n��¨\u0006\u0004"}, d2 = {"DefaultCameraDistance", "", "GraphicsLayerScope", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/GraphicsLayerScopeKt.class */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;

    @NotNull
    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }
}
