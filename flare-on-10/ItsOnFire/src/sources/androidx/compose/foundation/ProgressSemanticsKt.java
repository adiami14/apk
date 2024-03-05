package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001a\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\u001a\f\u0010��\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a.\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"progressSemantics", "Landroidx/compose/ui/Modifier;", "value", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/ProgressSemanticsKt.class */
public final class ProgressSemanticsKt {
    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, ProgressBarRangeInfo.Companion.getIndeterminate());
            }
        });
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier, final float f2, @NotNull final ClosedFloatingPointRange<Float> valueRange, final int i2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Comparable coerceIn;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                coerceIn = RangesKt___RangesKt.coerceIn(Float.valueOf(f2), (ClosedFloatingPointRange<Float>) ((ClosedFloatingPointRange<Comparable>) valueRange));
                SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, new ProgressBarRangeInfo(((Number) coerceIn).floatValue(), valueRange, i2));
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f2, ClosedFloatingPointRange closedFloatingPointRange, int i2, int i3, Object obj) {
        ClosedFloatingPointRange rangeTo;
        if ((i3 & 2) != 0) {
            rangeTo = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
            closedFloatingPointRange = rangeTo;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return progressSemantics(modifier, f2, closedFloatingPointRange, i2);
    }
}
