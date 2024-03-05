package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b��\u0018��*\u0006\b��\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B-\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\r\u0010\u000f\u001a\u00028��H\u0002¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u000e\u0010\u0016\u001a\u00028��H\u0096\u0002¢\u0006\u0002\u0010\u0010J\r\u0010\u0017\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0010J7\u0010\u0018\u001a\u00020\u00122\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H��¢\u0006\u0004\b\u0019\u0010\nR\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n��R\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "root", "", "", FirebaseAnalytics.Param.INDEX, "", "size", "height", "([Ljava/lang/Object;III)V", "isInRightEdge", "", "path", "[Ljava/lang/Object;", "elementAtCurrentIndex", "()Ljava/lang/Object;", "fillPath", "", "startLevel", "fillPathIfNeeded", "indexPredicate", "next", "previous", "reset", "reset$runtime_release", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator.class */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    private int height;
    private boolean isInRightEdge;
    @NotNull
    private Object[] path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrieIterator(@NotNull Object[] root, int i2, int i3, int i4) {
        super(i2, i3);
        Intrinsics.checkNotNullParameter(root, "root");
        this.height = i4;
        Object[] objArr = new Object[i4];
        this.path = objArr;
        int i5 = i2 == i3 ? 1 : 0;
        this.isInRightEdge = i5;
        objArr[0] = root;
        fillPath(i2 - i5, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex();
        Object obj = this.path[this.height - 1];
        if (obj != null) {
            return (E) ((Object[]) obj)[index & 31];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    private final void fillPath(int i2, int i3) {
        int i4 = (this.height - i3) * 5;
        while (i3 < this.height) {
            Object[] objArr = this.path;
            Object[] objArr2 = objArr[i3 - 1];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i3] = objArr2[UtilsKt.indexSegment(i2, i4)];
            i4 -= 5;
            i3++;
        }
    }

    private final void fillPathIfNeeded(int i2) {
        int i3 = 0;
        while (UtilsKt.indexSegment(getIndex(), i3) == i2) {
            i3 += 5;
        }
        if (i3 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i3 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E elementAtCurrentIndex = elementAtCurrentIndex();
            setIndex(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.isInRightEdge = true;
                return elementAtCurrentIndex;
            }
            fillPathIfNeeded(0);
            return elementAtCurrentIndex;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            setIndex(getIndex() - 1);
            if (this.isInRightEdge) {
                this.isInRightEdge = false;
            } else {
                fillPathIfNeeded(31);
            }
            return elementAtCurrentIndex();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void reset$runtime_release(@NotNull Object[] root, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(root, "root");
        setIndex(i2);
        setSize(i3);
        this.height = i4;
        if (this.path.length < i4) {
            this.path = new Object[i4];
        }
        int i5 = 0;
        this.path[0] = root;
        if (i2 == i3) {
            i5 = 1;
        }
        this.isInRightEdge = i5;
        fillPath(i2 - i5, 1);
    }
}
