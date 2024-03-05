package kotlin.coroutines;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018��2\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b��\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b��\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020��2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020��2\u0006\u0010\u0010\u001a\u00020��H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/coroutines/CoroutineContext.class */
public interface CoroutineContext {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/coroutines/CoroutineContext$DefaultImpls.class */
    public static final class DefaultImpls {
        @NotNull
        public static CoroutineContext plus(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (context != EmptyCoroutineContext.INSTANCE) {
                coroutineContext = (CoroutineContext) context.fold(coroutineContext, new Function2<CoroutineContext, Element, CoroutineContext>() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.coroutines.CombinedContext] */
                    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.coroutines.CombinedContext] */
                    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.coroutines.CombinedContext] */
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final CoroutineContext invoke(@NotNull CoroutineContext acc, @NotNull CoroutineContext.Element element) {
                        CoroutineContext.Element combinedContext;
                        Intrinsics.checkNotNullParameter(acc, "acc");
                        Intrinsics.checkNotNullParameter(element, "element");
                        CoroutineContext minusKey = acc.minusKey(element.getKey());
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        if (minusKey != emptyCoroutineContext) {
                            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
                            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(key);
                            if (continuationInterceptor == null) {
                                combinedContext = new CombinedContext(minusKey, element);
                            } else {
                                CoroutineContext minusKey2 = minusKey.minusKey(key);
                                if (minusKey2 == emptyCoroutineContext) {
                                    element = new CombinedContext(element, continuationInterceptor);
                                } else {
                                    combinedContext = new CombinedContext(new CombinedContext(minusKey2, element), continuationInterceptor);
                                }
                            }
                            element = combinedContext;
                        }
                        return element;
                    }
                });
            }
            return coroutineContext;
        }
    }

    @Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018��2\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b��\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020��\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b��\u0010\r*\u00020��2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/coroutines/CoroutineContext$Element.class */
    public interface Element extends CoroutineContext {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:kotlin/coroutines/CoroutineContext$Element$DefaultImpls.class */
        public static final class DefaultImpls {
            public static <R> R fold(@NotNull Element element, R r2, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r2, element);
            }

            @Nullable
            public static <E extends Element> E get(@NotNull Element element, @NotNull Key<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (Intrinsics.areEqual(element.getKey(), key)) {
                    Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                } else {
                    element = null;
                }
                return (E) element;
            }

            @NotNull
            public static CoroutineContext minusKey(@NotNull Element element, @NotNull Key<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                CoroutineContext coroutineContext = element;
                if (Intrinsics.areEqual(element.getKey(), key)) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                return coroutineContext;
            }

            @NotNull
            public static CoroutineContext plus(@NotNull Element element, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return DefaultImpls.plus(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r2, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull Key<E> key);

        @NotNull
        Key<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        CoroutineContext minusKey(@NotNull Key<?> key);
    }

    @Metadata(d1 = {"��\u0010\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n��\bf\u0018��*\b\b��\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/coroutines/CoroutineContext$Key.class */
    public interface Key<E extends Element> {
    }

    <R> R fold(R r2, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    @Nullable
    <E extends Element> E get(@NotNull Key<E> key);

    @NotNull
    CoroutineContext minusKey(@NotNull Key<?> key);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
