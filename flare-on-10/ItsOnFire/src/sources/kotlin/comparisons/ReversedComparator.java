package kotlin.comparisons;

import androidx.appcompat.R;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018��*\u0004\b��\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028��0\u0002j\b\u0012\u0004\u0012\u00028��`\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028��2\u0006\u0010\u000b\u001a\u00028��H\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028��0\u0002j\b\u0012\u0004\u0012\u00028��`\u0003R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028��0\u0002j\b\u0012\u0004\u0012\u00028��`\u0003¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/comparisons/ReversedComparator;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Ljava/util/Comparator;)V", "getComparator", "()Ljava/util/Comparator;", "compare", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/comparisons/ReversedComparator.class */
final class ReversedComparator<T> implements Comparator<T> {
    @NotNull
    private final Comparator<T> comparator;

    public ReversedComparator(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        return this.comparator.compare(t3, t2);
    }

    @NotNull
    public final Comparator<T> getComparator() {
        return this.comparator;
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.comparator;
    }
}
