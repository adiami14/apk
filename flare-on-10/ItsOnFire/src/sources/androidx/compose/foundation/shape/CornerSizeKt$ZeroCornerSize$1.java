package androidx.compose.foundation.shape;

import androidx.appcompat.R;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.ValueElement;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��+\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\u00020\u00012\u00020\u0002J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/shape/CornerSizeKt$ZeroCornerSize$1", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "valueOverride", "", "getValueOverride", "()Ljava/lang/String;", "toPx", "", "shapeSize", "Landroidx/compose/ui/geometry/Size;", "density", "Landroidx/compose/ui/unit/Density;", "toPx-TmRCtEA", "(JLandroidx/compose/ui/unit/Density;)F", "toString", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/shape/CornerSizeKt$ZeroCornerSize$1.class */
public final class CornerSizeKt$ZeroCornerSize$1 implements CornerSize, InspectableValue {
    @Override // androidx.compose.ui.platform.InspectableValue
    @NotNull
    public Sequence<ValueElement> getInspectableElements() {
        return InspectableValue.DefaultImpls.getInspectableElements(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public String getNameFallback() {
        return InspectableValue.DefaultImpls.getNameFallback(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @NotNull
    public String getValueOverride() {
        return "ZeroCornerSize";
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo859toPxTmRCtEA(long j2, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return 0.0f;
    }

    @NotNull
    public String toString() {
        return "ZeroCornerSize";
    }
}
