package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u001a\u001e\u0010��\u001a\u00020\u0001*\u00020\u00012\u0012\u0010��\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"onFocusChanged", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusChangedModifierKt.class */
public final class FocusChangedModifierKt {
    @NotNull
    public static final Modifier onFocusChanged(@NotNull Modifier modifier, @NotNull final Function1<? super FocusState, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onFocusChanged");
                inspectorInfo.getProperties().set("onFocusChanged", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                MutableState mutableStateOf$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-610209312);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                MutableState mutableState = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    mutableState = mutableStateOf$default;
                    composer.updateRememberedValue(mutableState);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) mutableState;
                Modifier.Companion companion = Modifier.Companion;
                final Function1<FocusState, Unit> function1 = onFocusChanged;
                Modifier onFocusEvent = FocusEventModifierKt.onFocusEvent(companion, new Function1<FocusState, Unit>() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                        invoke2(focusState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull FocusState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Intrinsics.areEqual(mutableState2.getValue(), it)) {
                            return;
                        }
                        mutableState2.setValue(it);
                        function1.invoke(it);
                    }
                });
                composer.endReplaceableGroup();
                return onFocusEvent;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
