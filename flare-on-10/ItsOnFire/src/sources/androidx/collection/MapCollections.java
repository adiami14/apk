package androidx.collection;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:androidx/collection/MapCollections.class */
public abstract class MapCollections<K, V> {
    @Nullable
    public MapCollections<K, V>.EntrySet mEntrySet;
    @Nullable
    public MapCollections<K, V>.KeySet mKeySet;
    @Nullable
    public MapCollections<K, V>.ValuesCollection mValues;

    /* loaded from: ItsOnFire.jar:androidx/collection/MapCollections$ArrayIterator.class */
    public final class ArrayIterator<T> implements Iterator<T> {
        public boolean mCanRemove = false;
        public int mIndex;
        public final int mOffset;
        public int mSize;

        public ArrayIterator(int i2) {
            this.mOffset = i2;
            this.mSize = MapCollections.this.colGetSize();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mSize;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t2 = (T) MapCollections.this.colGetEntry(this.mIndex, this.mOffset);
                this.mIndex++;
                this.mCanRemove = true;
                return t2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.mCanRemove) {
                throw new IllegalStateException();
            }
            int i2 = this.mIndex - 1;
            this.mIndex = i2;
            this.mSize--;
            this.mCanRemove = false;
            MapCollections.this.colRemoveAt(i2);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/collection/MapCollections$EntrySet.class */
    public final class EntrySet implements Set<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            return add((Map.Entry) ((Map.Entry) obj));
        }

        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int colGetSize = MapCollections.this.colGetSize();
            for (Map.Entry<K, V> entry : collection) {
                MapCollections.this.colPut(entry.getKey(), entry.getValue());
            }
            return colGetSize != MapCollections.this.colGetSize();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.colClear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int colIndexOfKey = MapCollections.this.colIndexOfKey(entry.getKey());
                if (colIndexOfKey < 0) {
                    return false;
                }
                return ContainerHelpers.equal(MapCollections.this.colGetEntry(colIndexOfKey, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int colGetSize = MapCollections.this.colGetSize() - 1; colGetSize >= 0; colGetSize--) {
                Object colGetEntry = MapCollections.this.colGetEntry(colGetSize, 0);
                Object colGetEntry2 = MapCollections.this.colGetEntry(colGetSize, 1);
                i2 += (colGetEntry == null ? 0 : colGetEntry.hashCode()) ^ (colGetEntry2 == null ? 0 : colGetEntry2.hashCode());
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.colGetSize() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.colGetSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/collection/MapCollections$KeySet.class */
    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.colClear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.colIndexOfKey(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return MapCollections.containsAllHelper(MapCollections.this.colGetMap(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int colGetSize = MapCollections.this.colGetSize() - 1; colGetSize >= 0; colGetSize--) {
                Object colGetEntry = MapCollections.this.colGetEntry(colGetSize, 0);
                i2 += colGetEntry == null ? 0 : colGetEntry.hashCode();
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.colGetSize() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new ArrayIterator(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int colIndexOfKey = MapCollections.this.colIndexOfKey(obj);
            if (colIndexOfKey >= 0) {
                MapCollections.this.colRemoveAt(colIndexOfKey);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return MapCollections.removeAllHelper(MapCollections.this.colGetMap(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return MapCollections.retainAllHelper(MapCollections.this.colGetMap(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.colGetSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.toArrayHelper(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.toArrayHelper(tArr, 0);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/collection/MapCollections$MapIterator.class */
    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int mEnd;
        public boolean mEntryValid = false;
        public int mIndex = -1;

        public MapIterator() {
            this.mEnd = MapCollections.this.colGetSize() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.mEntryValid) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    boolean z = false;
                    if (ContainerHelpers.equal(entry.getKey(), MapCollections.this.colGetEntry(this.mIndex, 0))) {
                        z = false;
                        if (ContainerHelpers.equal(entry.getValue(), MapCollections.this.colGetEntry(this.mIndex, 1))) {
                            z = true;
                        }
                    }
                    return z;
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.mEntryValid) {
                return (K) MapCollections.this.colGetEntry(this.mIndex, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.mEntryValid) {
                return (V) MapCollections.this.colGetEntry(this.mIndex, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.mEntryValid) {
                int i2 = 0;
                Object colGetEntry = MapCollections.this.colGetEntry(this.mIndex, 0);
                Object colGetEntry2 = MapCollections.this.colGetEntry(this.mIndex, 1);
                int hashCode = colGetEntry == null ? 0 : colGetEntry.hashCode();
                if (colGetEntry2 != null) {
                    i2 = colGetEntry2.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.mIndex++;
                this.mEntryValid = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.mEntryValid) {
                throw new IllegalStateException();
            }
            MapCollections.this.colRemoveAt(this.mIndex);
            this.mIndex--;
            this.mEnd--;
            this.mEntryValid = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.mEntryValid) {
                return (V) MapCollections.this.colSetValue(this.mIndex, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/collection/MapCollections$ValuesCollection.class */
    public final class ValuesCollection implements Collection<V> {
        public ValuesCollection() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            MapCollections.this.colClear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.colIndexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.colGetSize() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ArrayIterator(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int colIndexOfValue = MapCollections.this.colIndexOfValue(obj);
            if (colIndexOfValue >= 0) {
                MapCollections.this.colRemoveAt(colIndexOfValue);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int colGetSize = MapCollections.this.colGetSize();
            int i2 = 0;
            boolean z = false;
            while (i2 < colGetSize) {
                int i3 = colGetSize;
                int i4 = i2;
                if (collection.contains(MapCollections.this.colGetEntry(i2, 1))) {
                    MapCollections.this.colRemoveAt(i2);
                    i4 = i2 - 1;
                    i3 = colGetSize - 1;
                    z = true;
                }
                i2 = i4 + 1;
                colGetSize = i3;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int colGetSize = MapCollections.this.colGetSize();
            int i2 = 0;
            boolean z = false;
            while (i2 < colGetSize) {
                int i3 = colGetSize;
                int i4 = i2;
                if (!collection.contains(MapCollections.this.colGetEntry(i2, 1))) {
                    MapCollections.this.colRemoveAt(i2);
                    i4 = i2 - 1;
                    i3 = colGetSize - 1;
                    z = true;
                }
                i2 = i4 + 1;
                colGetSize = i3;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return MapCollections.this.colGetSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.toArrayHelper(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.toArrayHelper(tArr, 1);
        }
    }

    public static <K, V> boolean containsAllHelper(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3.containsAll(r0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean equalsSetHelper(java.util.Set<T> r3, java.lang.Object r4) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L37
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L39
            r1 = r4
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            if (r0 != r1) goto L33
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L39
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            r5 = r0
        L35:
            r0 = r5
            return r0
        L37:
            r0 = 0
            return r0
        L39:
            r3 = move-exception
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MapCollections.equalsSetHelper(java.util.Set, java.lang.Object):boolean");
    }

    public static <K, V> boolean removeAllHelper(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean retainAllHelper(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void colClear();

    public abstract Object colGetEntry(int i2, int i3);

    public abstract Map<K, V> colGetMap();

    public abstract int colGetSize();

    public abstract int colIndexOfKey(Object obj);

    public abstract int colIndexOfValue(Object obj);

    public abstract void colPut(K k2, V v2);

    public abstract void colRemoveAt(int i2);

    public abstract V colSetValue(int i2, V v2);

    public Set<Map.Entry<K, V>> getEntrySet() {
        if (this.mEntrySet == null) {
            this.mEntrySet = new EntrySet();
        }
        return this.mEntrySet;
    }

    public Set<K> getKeySet() {
        if (this.mKeySet == null) {
            this.mKeySet = new KeySet();
        }
        return this.mKeySet;
    }

    public Collection<V> getValues() {
        if (this.mValues == null) {
            this.mValues = new ValuesCollection();
        }
        return this.mValues;
    }

    public Object[] toArrayHelper(int i2) {
        int colGetSize = colGetSize();
        Object[] objArr = new Object[colGetSize];
        for (int i3 = 0; i3 < colGetSize; i3++) {
            objArr[i3] = colGetEntry(i3, i2);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object[]] */
    public <T> T[] toArrayHelper(T[] tArr, int i2) {
        int colGetSize = colGetSize();
        T[] tArr2 = tArr;
        if (tArr.length < colGetSize) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), colGetSize);
        }
        for (int i3 = 0; i3 < colGetSize; i3++) {
            tArr2[i3] = colGetEntry(i3, i2);
        }
        if (tArr2.length > colGetSize) {
            tArr2[colGetSize] = null;
        }
        return tArr2;
    }
}
