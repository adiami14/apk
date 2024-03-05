package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(d1 = {"��$\n\u0002\u0018\u0002\n��\n\u0002\u0010*\n��\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018��*\u0006\b��\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\r\u001a\u00020\u000eH��¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u000eH��¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "E", "", FirebaseAnalytics.Param.INDEX, "", "size", "(II)V", "getIndex", "()I", "setIndex", "(I)V", "getSize", "setSize", "checkHasNext", "", "checkHasNext$runtime_release", "checkHasPrevious", "checkHasPrevious$runtime_release", "hasNext", "", "hasPrevious", "nextIndex", "previousIndex", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator.class */
public abstract class AbstractListIterator<E> implements ListIterator<E>, KMappedMarker {
    private int index;
    private int size;

    public AbstractListIterator(int i2, int i3) {
        this.index = i2;
        this.size = i3;
    }

    @Override // java.util.ListIterator
    public void add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime_release() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }

    public final void setSize(int i2) {
        this.size = i2;
    }
}
