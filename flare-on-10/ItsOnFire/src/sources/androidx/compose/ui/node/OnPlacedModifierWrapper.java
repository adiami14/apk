package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.OnPlacedModifier;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/OnPlacedModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnPlacedModifier;)V", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "onPlaced", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/OnPlacedModifierWrapper.class */
public final class OnPlacedModifierWrapper extends DelegatingLayoutNodeWrapper<OnPlacedModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnPlacedModifierWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull OnPlacedModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getLayoutNode$ui_release();
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper = wrapped$ui_release;
            if (layoutNodeWrapper == null) {
                break;
            }
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, layoutNodeWrapper.getProvidedAlignmentLines());
            if (Intrinsics.areEqual(layoutNodeWrapper, getLayoutNode$ui_release().getInnerLayoutNodeWrapper$ui_release())) {
                break;
            }
            wrapped$ui_release = layoutNodeWrapper.getWrapped$ui_release();
        }
        return linkedHashSet;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onPlaced() {
        getModifier().onPlaced(this);
    }
}
