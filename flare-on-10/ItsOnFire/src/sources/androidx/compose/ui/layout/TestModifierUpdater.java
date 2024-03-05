package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\b\u0007\u0018��2\u00020\u0001B\u000f\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "updateModifier", "", "modifier", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/TestModifierUpdater.class */
public final class TestModifierUpdater {
    public static final int $stable = 8;
    @NotNull
    private final LayoutNode node;

    public TestModifierUpdater(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
    }

    public final void updateModifier(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.node.setModifier(modifier);
    }
}
