package kotlin.reflect;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010��\n\u0002\b\u0002\bf\u0018��*\u0006\b��\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\fJ\r\u0010\b\u001a\u00028��H&¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH'R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/reflect/KProperty0;", "V", "Lkotlin/reflect/KProperty;", "Lkotlin/Function0;", "getter", "Lkotlin/reflect/KProperty0$Getter;", "getGetter", "()Lkotlin/reflect/KProperty0$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "", "Getter", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/reflect/KProperty0.class */
public interface KProperty0<V> extends KProperty<V>, Function0<V> {

    @Metadata(d1 = {"��\u0010\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\bf\u0018��*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KProperty0$Getter;", "V", "Lkotlin/reflect/KProperty$Getter;", "Lkotlin/Function0;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/reflect/KProperty0$Getter.class */
    public interface Getter<V> extends KProperty.Getter<V>, Function0<V> {
    }

    V get();

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<V> getGetter();
}
