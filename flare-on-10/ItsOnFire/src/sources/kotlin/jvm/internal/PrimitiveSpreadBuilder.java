package kotlin.jvm.internal;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��$\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018��*\b\b��\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028��¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028��2\u0006\u0010\u0014\u001a\u00028��2\u0006\u0010\u0015\u001a\u00028��H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028��H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018��0\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/jvm/internal/PrimitiveSpreadBuilder.class */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    @NotNull
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i2) {
        this.size = i2;
        this.spreads = (T[]) new Object[i2];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i2 = this.position;
        this.position = i2 + 1;
        tArr[i2] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(@NotNull T t2);

    public final void setPosition(int i2) {
        this.position = i2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public final int size() {
        int i2 = 0;
        ?? it = new IntRange(0, this.size - 1).iterator();
        while (it.hasNext()) {
            T t2 = this.spreads[it.nextInt()];
            i2 += t2 != null ? getSize(t2) : 1;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        ?? it = new IntRange(0, this.size - 1).iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t2 = this.spreads[nextInt];
            if (t2 != null) {
                int i4 = i3;
                if (i2 < nextInt) {
                    int i5 = nextInt - i2;
                    System.arraycopy(values, i2, result, i3, i5);
                    i4 = i3 + i5;
                }
                int size = getSize(t2);
                System.arraycopy(t2, 0, result, i4, size);
                i3 = i4 + size;
                i2 = nextInt + 1;
            }
        }
        int i6 = this.size;
        if (i2 < i6) {
            System.arraycopy(values, i2, result, i3, i6 - i2);
        }
        return result;
    }
}
