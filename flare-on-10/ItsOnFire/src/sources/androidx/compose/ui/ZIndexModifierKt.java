package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\f\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010��\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"zIndex", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/ZIndexModifierKt.class */
public final class ZIndexModifierKt {
    @Stable
    @NotNull
    public static final Modifier zIndex(@NotNull Modifier modifier, final float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new ZIndexModifier(f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.ZIndexModifierKt$zIndex$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("zIndex");
                inspectorInfo.setValue(Float.valueOf(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
