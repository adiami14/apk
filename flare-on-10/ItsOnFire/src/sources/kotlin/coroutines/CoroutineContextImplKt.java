package kotlin.coroutines;

import androidx.appcompat.R;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u001a+\u0010��\u001a\u0004\u0018\u0001H\u0001\"\b\b��\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/coroutines/CoroutineContextImplKt.class */
public final class CoroutineContextImplKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @Nullable
    public static final <E extends CoroutineContext.Element> E getPolymorphicElement(@NotNull CoroutineContext.Element element, @NotNull CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof AbstractCoroutineContextKey)) {
            if (element.getKey() != key) {
                element = null;
            }
            return (E) element;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        E e2 = null;
        if (abstractCoroutineContextKey.isSubKey$kotlin_stdlib(element.getKey())) {
            CoroutineContext.Element tryCast$kotlin_stdlib = abstractCoroutineContextKey.tryCast$kotlin_stdlib(element);
            e2 = null;
            if (tryCast$kotlin_stdlib instanceof CoroutineContext.Element) {
                e2 = tryCast$kotlin_stdlib;
            }
        }
        return e2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final CoroutineContext minusPolymorphicKey(@NotNull CoroutineContext.Element element, @NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof AbstractCoroutineContextKey)) {
            CoroutineContext coroutineContext = element;
            if (element.getKey() == key) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            return coroutineContext;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        CoroutineContext coroutineContext2 = element;
        if (abstractCoroutineContextKey.isSubKey$kotlin_stdlib(element.getKey())) {
            coroutineContext2 = element;
            if (abstractCoroutineContextKey.tryCast$kotlin_stdlib(element) != null) {
                coroutineContext2 = EmptyCoroutineContext.INSTANCE;
            }
        }
        return coroutineContext2;
    }
}
