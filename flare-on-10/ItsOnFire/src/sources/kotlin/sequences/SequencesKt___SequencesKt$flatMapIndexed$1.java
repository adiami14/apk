package kotlin.sequences;

import androidx.appcompat.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/sequences/SequencesKt___SequencesKt$flatMapIndexed$1.class */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$1();

    public SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Iterable) ((Iterable) obj));
    }

    @NotNull
    public final Iterator<R> invoke(@NotNull Iterable<? extends R> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (Iterator<? extends R>) p0.iterator();
    }
}
