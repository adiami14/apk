package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001a\u0010��\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u001a!\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "consumeScrollDelta", "Lkotlin/Function1;", "", "rememberScrollableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollableStateKt.class */
public final class ScrollableStateKt {
    @NotNull
    public static final ScrollableState ScrollableState(@NotNull Function1<? super Float, Float> consumeScrollDelta) {
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        return new DefaultScrollableState(consumeScrollDelta);
    }

    @Composable
    @NotNull
    public static final ScrollableState rememberScrollableState(@NotNull Function1<? super Float, Float> consumeScrollDelta, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        composer.startReplaceableGroup(-624382454);
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(consumeScrollDelta, composer, i2 & 14);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        ScrollableState scrollableState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            scrollableState = ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @NotNull
                public final Float invoke(float f2) {
                    return rememberUpdatedState.getValue().invoke(Float.valueOf(f2));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                    return invoke(f2.floatValue());
                }
            });
            composer.updateRememberedValue(scrollableState);
        }
        composer.endReplaceableGroup();
        ScrollableState scrollableState2 = (ScrollableState) scrollableState;
        composer.endReplaceableGroup();
        return scrollableState2;
    }
}
