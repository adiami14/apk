package kotlin.sequences;

import androidx.appcompat.R;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"kotlin/sequences/SequencesKt__SequenceBuilderKt", "kotlin/sequences/SequencesKt__SequencesJVMKt", "kotlin/sequences/SequencesKt__SequencesKt", "kotlin/sequences/SequencesKt___SequencesJvmKt", "kotlin/sequences/SequencesKt___SequencesKt"}, k = 4, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: ItsOnFire.jar:kotlin/sequences/SequencesKt.class */
public final class SequencesKt extends SequencesKt___SequencesKt {
    private SequencesKt() {
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Iterable asIterable(@NotNull Sequence sequence) {
        return SequencesKt___SequencesKt.asIterable(sequence);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Sequence generateSequence(@NotNull Function0 function0, @NotNull Function1 function1) {
        return SequencesKt__SequencesKt.generateSequence(function0, function1);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Sequence map(@NotNull Sequence sequence, @NotNull Function1 function1) {
        return SequencesKt___SequencesKt.map(sequence, function1);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ Sequence sequence(@BuilderInference @NotNull Function2 function2) {
        return SequencesKt__SequenceBuilderKt.sequence(function2);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ List toList(@NotNull Sequence sequence) {
        return SequencesKt___SequencesKt.toList(sequence);
    }
}
