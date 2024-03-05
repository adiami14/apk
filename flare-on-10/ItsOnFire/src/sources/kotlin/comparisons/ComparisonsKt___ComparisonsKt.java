package kotlin.comparisons;

import androidx.appcompat.R;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aG\u0010��\u001a\u0002H\u0001\"\u0004\b��\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b��\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b��\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010��\u001a\u0002H\u0001\"\u0004\b��\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b��\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b��\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010��\u001a\u0002H\u0001\"\u0004\b��\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b��\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b��\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u0002H\u0001\"\u0004\b��\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b��\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b��\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\r\u001a\u0002H\u0001\"\u0004\b��\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b��\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b��\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\r\u001a\u0002H\u0001\"\u0004\b��\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b��\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b��\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"maxOf", "T", "a", "b", "c", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "other", "", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: ItsOnFire.jar:kotlin/comparisons/ComparisonsKt___ComparisonsKt.class */
class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
    @SinceKotlin(version = "1.1")
    public static final <T> T maxOf(T t2, T t3, T t4, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) maxOf(t2, maxOf(t3, t4, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T maxOf(T t2, T t3, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (comparator.compare(t2, t3) < 0) {
            t2 = t3;
        }
        return t2;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T maxOf(T t2, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = other.length;
        int i2 = 0;
        while (true) {
            T t3 = t2;
            if (i2 >= length) {
                return t3;
            }
            T t4 = other[i2];
            t2 = t3;
            if (comparator.compare(t3, t4) < 0) {
                t2 = t4;
            }
            i2++;
        }
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T minOf(T t2, T t3, T t4, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) minOf(t2, minOf(t3, t4, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T minOf(T t2, T t3, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (comparator.compare(t2, t3) > 0) {
            t2 = t3;
        }
        return t2;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T minOf(T t2, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = other.length;
        int i2 = 0;
        while (i2 < length) {
            T t3 = other[i2];
            T t4 = t2;
            if (comparator.compare(t2, t3) > 0) {
                t4 = t3;
            }
            i2++;
            t2 = t4;
        }
        return t2;
    }
}
