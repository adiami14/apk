package kotlin.ranges;

import androidx.appcompat.R;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b��\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/ranges/CharProgressionIterator.class */
public final class CharProgressionIterator extends CharIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public CharProgressionIterator(char c2, char c3, int i2) {
        this.step = i2;
        this.finalElement = c3;
        boolean z = true;
        if (i2 <= 0 ? Intrinsics.compare((int) c2, (int) c3) < 0 : Intrinsics.compare((int) c2, (int) c3) > 0) {
            z = false;
        }
        this.hasNext = z;
        this.next = z ? c2 : c3;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i2 = this.next;
        if (i2 != this.finalElement) {
            this.next = this.step + i2;
        } else if (!this.hasNext) {
            throw new NoSuchElementException();
        } else {
            this.hasNext = false;
        }
        return (char) i2;
    }
}