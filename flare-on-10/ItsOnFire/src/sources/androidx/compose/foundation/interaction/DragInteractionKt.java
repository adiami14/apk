package androidx.compose.foundation.interaction;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"collectIsDraggedAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/interaction/DragInteractionKt.class */
public final class DragInteractionKt {
    @Composable
    @NotNull
    public static final State<Boolean> collectIsDraggedAsState(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i2) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(interactionSource, "<this>");
        composer.startReplaceableGroup(517090637);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        MutableState mutableState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            mutableState = mutableStateOf$default;
            composer.updateRememberedValue(mutableState);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) mutableState;
        EffectsKt.LaunchedEffect(interactionSource, new DragInteractionKt$collectIsDraggedAsState$1(interactionSource, mutableState2, null), composer, i2 & 14);
        composer.endReplaceableGroup();
        return mutableState2;
    }
}