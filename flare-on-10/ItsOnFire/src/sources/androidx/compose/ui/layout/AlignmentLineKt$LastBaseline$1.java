package androidx.compose.ui.layout;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/AlignmentLineKt$LastBaseline$1.class */
public final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, MathKt.class, "max", "max(II)I", 1);
    }

    @NotNull
    public final Integer invoke(int i2, int i3) {
        return Integer.valueOf(Math.max(i2, i3));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
