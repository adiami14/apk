package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"��\f\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\u001a\f\u0010��\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"updateProperties", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusManagerKt.class */
public final class FocusManagerKt {
    public static final /* synthetic */ void access$updateProperties(ModifiedFocusNode modifiedFocusNode) {
        updateProperties(modifiedFocusNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProperties(ModifiedFocusNode modifiedFocusNode) {
        FocusPropertiesKt.setUpdatedProperties(modifiedFocusNode, (FocusProperties) modifiedFocusNode.getModifier().getModifierLocalReadScope().getCurrent(FocusPropertiesKt.getModifierLocalFocusProperties()));
        List<ModifiedFocusNode> focusableChildren = modifiedFocusNode.focusableChildren(false);
        int size = focusableChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            updateProperties(focusableChildren.get(i2));
        }
    }
}
