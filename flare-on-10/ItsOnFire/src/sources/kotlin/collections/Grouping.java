package kotlin.collections;

import androidx.appcompat.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0010(\n��\bg\u0018��*\u0004\b��\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028��H&¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028��0\bH&¨\u0006\t"}, d2 = {"Lkotlin/collections/Grouping;", "T", "K", "", "keyOf", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/collections/Grouping.class */
public interface Grouping<T, K> {
    K keyOf(T t2);

    @NotNull
    Iterator<T> sourceIterator();
}
