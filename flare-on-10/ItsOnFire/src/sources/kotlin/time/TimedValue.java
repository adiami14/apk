package kotlin.time;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0087\b\u0018��*\u0004\b��\u0010\u00012\u00020\u0002B\u0018\u0012\u0006\u0010\u0003\u001a\u00028��\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001��¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00028��HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001��¢\u0006\u0004\b\u000f\u0010\bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028��0��2\b\b\u0002\u0010\u0003\u001a\u00028��2\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028��¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/time/TimedValue;", "T", "", "value", "duration", "Lkotlin/time/Duration;", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDuration-UwyO8pc", "()J", "J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-UwyO8pc", "copy", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalTime
/* loaded from: ItsOnFire.jar:kotlin/time/TimedValue.class */
public final class TimedValue<T> {
    private final long duration;
    private final T value;

    private TimedValue(T t2, long j2) {
        this.value = t2;
        this.duration = j2;
    }

    public /* synthetic */ TimedValue(Object obj, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-RFiDyg4$default  reason: not valid java name */
    public static /* synthetic */ TimedValue m7459copyRFiDyg4$default(TimedValue timedValue, Object obj, long j2, int i2, Object obj2) {
        T t2 = obj;
        if ((i2 & 1) != 0) {
            t2 = timedValue.value;
        }
        if ((i2 & 2) != 0) {
            j2 = timedValue.duration;
        }
        return timedValue.m7461copyRFiDyg4(t2, j2);
    }

    public final T component1() {
        return this.value;
    }

    /* renamed from: component2-UwyO8pc  reason: not valid java name */
    public final long m7460component2UwyO8pc() {
        return this.duration;
    }

    @NotNull
    /* renamed from: copy-RFiDyg4  reason: not valid java name */
    public final TimedValue<T> m7461copyRFiDyg4(T t2, long j2) {
        return new TimedValue<>(t2, j2, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimedValue) {
            TimedValue timedValue = (TimedValue) obj;
            return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m7304equalsimpl0(this.duration, timedValue.duration);
        }
        return false;
    }

    /* renamed from: getDuration-UwyO8pc  reason: not valid java name */
    public final long m7462getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t2 = this.value;
        return ((t2 == null ? 0 : t2.hashCode()) * 31) + Duration.m7327hashCodeimpl(this.duration);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m7348toStringimpl(this.duration)) + ')';
    }
}