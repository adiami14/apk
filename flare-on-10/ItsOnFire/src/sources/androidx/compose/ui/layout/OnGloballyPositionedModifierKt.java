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
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u001a \u0010��\u001a\u00020\u0001*\u00020\u00012\u0012\u0010��\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¨\u0006\u0005"}, d2 = {"onGloballyPositioned", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/OnGloballyPositionedModifierKt.class */
public final class OnGloballyPositionedModifierKt {
    @Stable
    @NotNull
    public static final Modifier onGloballyPositioned(@NotNull Modifier modifier, @NotNull final Function1<? super LayoutCoordinates, Unit> onGloballyPositioned) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onGloballyPositioned, "onGloballyPositioned");
        return modifier.then(new OnGloballyPositionedModifierImpl(onGloballyPositioned, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.layout.OnGloballyPositionedModifierKt$onGloballyPositioned$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onGloballyPositioned");
                inspectorInfo.getProperties().set("onGloballyPositioned", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
