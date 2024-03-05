package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u001a\n\u0010��\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/geometry/MutableRectKt.class */
public final class MutableRectKt {
    @NotNull
    public static final Rect toRect(@NotNull MutableRect mutableRect) {
        Intrinsics.checkNotNullParameter(mutableRect, "<this>");
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
