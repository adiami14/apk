package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Stable
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\b7\u0018��*\u0004\b��\u0010\u00012\u00020\u0002B\u0015\b\u0004\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028��0\u00112\u0006\u0010\u0012\u001a\u00028��H!¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u00028��8Ç\u0002¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\fX\u0080\u0004¢\u0006\u000e\n��\u0012\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "current", "getCurrent$annotations", "()V", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "defaultValueHolder", "Landroidx/compose/runtime/LazyValueHolder;", "getDefaultValueHolder$runtime_release$annotations", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/LazyValueHolder;", "provided", "Landroidx/compose/runtime/State;", "value", "provided$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/CompositionLocal.class */
public abstract class CompositionLocal<T> {
    @NotNull
    private final LazyValueHolder<T> defaultValueHolder;

    private CompositionLocal(Function0<? extends T> function0) {
        this.defaultValueHolder = new LazyValueHolder<>(function0);
    }

    public /* synthetic */ CompositionLocal(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    public static /* synthetic */ void getDefaultValueHolder$runtime_release$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrent")
    public final T getCurrent(@Nullable Composer composer, int i2) {
        return (T) composer.consume(this);
    }

    @NotNull
    public final LazyValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @Composable
    @NotNull
    public abstract State<T> provided$runtime_release(T t2, @Nullable Composer composer, int i2);
}
