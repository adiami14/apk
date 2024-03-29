package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018��2\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "Landroidx/compose/ui/layout/AlignmentLine;", "merger", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/HorizontalAlignmentLine.class */
public final class HorizontalAlignmentLine extends AlignmentLine {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAlignmentLine(@NotNull Function2<? super Integer, ? super Integer, Integer> merger) {
        super(merger, null);
        Intrinsics.checkNotNullParameter(merger, "merger");
    }
}
