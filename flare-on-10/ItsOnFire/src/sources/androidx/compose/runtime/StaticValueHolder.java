package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��&\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0080\b\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028��¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028��HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028��0��2\b\b\u0002\u0010\u0003\u001a\u00028��HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001a\u00028��X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", "T", "Landroidx/compose/runtime/State;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "equals", "", "other", "", "hashCode", "", "toString", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/StaticValueHolder.class */
public final class StaticValueHolder<T> implements State<T> {
    private final T value;

    public StaticValueHolder(T t2) {
        this.value = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = staticValueHolder.getValue();
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return getValue();
    }

    @NotNull
    public final StaticValueHolder<T> copy(T t2) {
        return new StaticValueHolder<>(t2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && Intrinsics.areEqual(getValue(), ((StaticValueHolder) obj).getValue());
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue() == null ? 0 : getValue().hashCode();
    }

    @NotNull
    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
