package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.appcompat.R;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��>\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n��\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u00022\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028��0\tH\u0016J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0016J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028��H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\tH\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028��0\u0012H\u0096\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028��0\u0014H\u0016J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028��0\u00022\u0006\u0010\u000e\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028��0\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\tH\u0016J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028��0\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028��0\tH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028��0\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/AbstractList;", "()V", "addAll", FirebaseAnalytics.Param.INDEX, "", "c", "", "elements", "clear", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "listIterator", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "subList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList.class */
public abstract class AbstractPersistentList<E> extends AbstractList<E> implements PersistentList<E> {
    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> addAll(int i2, @NotNull Collection<? extends E> c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i2, c2);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!elements.isEmpty()) {
            Iterator<T> it = elements.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                } else if (!contains(it.next())) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
        }
        return z;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((AbstractPersistentList<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> remove(E e2) {
        int indexOf = indexOf(e2);
        PersistentList<E> persistentList = this;
        if (indexOf != -1) {
            persistentList = removeAt(indexOf);
        }
        return persistentList;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> removeAll(@NotNull final Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAll((Function1) new Function1<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(E e2) {
                return Boolean.valueOf(elements.contains(e2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractPersistentList$removeAll$1<E>) obj);
            }
        });
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> retainAll(@NotNull final Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAll((Function1) new Function1<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(E e2) {
                return Boolean.valueOf(!elements.contains(e2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractPersistentList$retainAll$1<E>) obj);
            }
        });
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    @NotNull
    public ImmutableList<E> subList(int i2, int i3) {
        return PersistentList.DefaultImpls.subList(this, i2, i3);
    }
}
