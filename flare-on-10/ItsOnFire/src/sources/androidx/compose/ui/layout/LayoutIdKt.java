package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u001a\u0014\u0010��\u001a\u00020\u0005*\u00020\u00052\u0006\u0010��\u001a\u00020\u0001H\u0007\"\u0017\u0010��\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"layoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/LayoutIdKt.class */
public final class LayoutIdKt {
    @Nullable
    public static final Object getLayoutId(@NotNull Measurable measurable) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Object parentData = measurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        return layoutIdParentData == null ? null : layoutIdParentData.getLayoutId();
    }

    @Stable
    @NotNull
    public static final Modifier layoutId(@NotNull Modifier modifier, @NotNull final Object layoutId) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        return modifier.then(new LayoutId(layoutId, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.layout.LayoutIdKt$layoutId$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("layoutId");
                inspectorInfo.setValue(layoutId);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
