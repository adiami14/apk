package kotlin.sequences;

import androidx.appcompat.R;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"��#\n��\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028��H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028��0\u0001¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/sequences/SubSequence$iterator$1.class */
public final class SubSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {
    @NotNull
    private final Iterator<T> iterator;
    private int position;
    public final /* synthetic */ SubSequence<T> this$0;

    public SubSequence$iterator$1(SubSequence<T> subSequence) {
        Sequence sequence;
        this.this$0 = subSequence;
        sequence = ((SubSequence) subSequence).sequence;
        this.iterator = sequence.iterator();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drop() {
        /*
            r4 = this;
        L0:
            r0 = r4
            int r0 = r0.position
            r1 = r4
            kotlin.sequences.SubSequence<T> r1 = r1.this$0
            int r1 = kotlin.sequences.SubSequence.access$getStartIndex$p(r1)
            if (r0 >= r1) goto L31
            r0 = r4
            java.util.Iterator<T> r0 = r0.iterator
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L31
            r0 = r4
            java.util.Iterator<T> r0 = r0.iterator
            java.lang.Object r0 = r0.next()
            r0 = r4
            r1 = r4
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r0.position = r1
            goto L0
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SubSequence$iterator$1.drop():void");
    }

    @NotNull
    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i2;
        drop();
        int i3 = this.position;
        i2 = ((SubSequence) this.this$0).endIndex;
        return i3 < i2 && this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        int i2;
        drop();
        int i3 = this.position;
        i2 = ((SubSequence) this.this$0).endIndex;
        if (i3 < i2) {
            this.position++;
            return this.iterator.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPosition(int i2) {
        this.position = i2;
    }
}
