package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: ItsOnFire.jar:androidx/collection/SimpleArrayMap.class */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    @Nullable
    public static Object[] mBaseCache;
    public static int mBaseCacheSize;
    @Nullable
    public static Object[] mTwiceBaseCache;
    public static int mTwiceBaseCacheSize;
    public Object[] mArray;
    public int[] mHashes;
    public int mSize;

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int i2) {
        if (i2 == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i2);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    private void allocArrays(int i2) {
        if (i2 == 8) {
            synchronized (SimpleArrayMap.class) {
                try {
                    Object[] objArr = mTwiceBaseCache;
                    if (objArr != null) {
                        this.mArray = objArr;
                        mTwiceBaseCache = (Object[]) objArr[0];
                        this.mHashes = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        mTwiceBaseCacheSize--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (SimpleArrayMap.class) {
                try {
                    Object[] objArr2 = mBaseCache;
                    if (objArr2 != null) {
                        this.mArray = objArr2;
                        mBaseCache = (Object[]) objArr2[0];
                        this.mHashes = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        mBaseCacheSize--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.mHashes = new int[i2];
        this.mArray = new Object[i2 << 1];
    }

    private static int binarySearchHashes(int[] iArr, int i2, int i3) {
        try {
            return ContainerHelpers.binarySearch(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                try {
                    if (mTwiceBaseCacheSize < 10) {
                        objArr[0] = mTwiceBaseCache;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        mTwiceBaseCache = objArr;
                        mTwiceBaseCacheSize++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                try {
                    if (mBaseCacheSize < 10) {
                        objArr[0] = mBaseCache;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        mBaseCache = objArr;
                        mBaseCacheSize++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i2 = this.mSize;
        if (i2 > 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i2);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i2) {
        int i3 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i2) {
            Object[] objArr = this.mArray;
            allocArrays(i2);
            if (this.mSize > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i3);
                System.arraycopy(objArr, 0, this.mArray, 0, i3 << 1);
            }
            freeArrays(iArr, objArr, i3);
        }
        if (this.mSize != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.mSize; i2++) {
                try {
                    K keyAt = keyAt(i2);
                    V valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    return false;
                }
            }
            return true;
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.mSize; i3++) {
                try {
                    K keyAt2 = keyAt(i3);
                    V valueAt2 = valueAt(i3);
                    Object obj3 = map.get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !map.containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!valueAt2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException e3) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public V getOrDefault(Object obj, V v2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            v2 = this.mArray[(indexOfKey << 1) + 1];
        }
        return v2;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i2 = this.mSize;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public int indexOf(Object obj, int i2) {
        int i3 = this.mSize;
        if (i3 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i3, i2);
        if (binarySearchHashes >= 0 && !obj.equals(this.mArray[binarySearchHashes << 1])) {
            int i4 = binarySearchHashes + 1;
            while (i4 < i3 && this.mHashes[i4] == i2) {
                if (obj.equals(this.mArray[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = binarySearchHashes - 1; i5 >= 0 && this.mHashes[i5] == i2; i5--) {
                if (obj.equals(this.mArray[i5 << 1])) {
                    return i5;
                }
            }
            return i4;
        }
        return binarySearchHashes;
    }

    public int indexOfKey(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public int indexOfNull() {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i2, 0);
        if (binarySearchHashes >= 0 && this.mArray[binarySearchHashes << 1] != null) {
            int i3 = binarySearchHashes + 1;
            while (i3 < i2 && this.mHashes[i3] == 0) {
                if (this.mArray[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            while (true) {
                binarySearchHashes--;
                if (binarySearchHashes < 0 || this.mHashes[binarySearchHashes] != 0) {
                    break;
                } else if (this.mArray[binarySearchHashes << 1] == null) {
                    return binarySearchHashes;
                }
            }
            return i3;
        }
        return binarySearchHashes;
    }

    public int indexOfValue(Object obj) {
        int i2 = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public K keyAt(int i2) {
        return (K) this.mArray[i2 << 1];
    }

    @Nullable
    public V put(K k2, V v2) {
        int hashCode;
        int indexOf;
        int i2 = this.mSize;
        if (k2 == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = k2.hashCode();
            indexOf = indexOf(k2, hashCode);
        }
        if (indexOf >= 0) {
            int i3 = (indexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
        int i4 = indexOf;
        int[] iArr = this.mHashes;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.mArray;
            allocArrays(i5);
            if (i2 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.mHashes;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.mSize - i4) << 1);
        }
        int i7 = this.mSize;
        if (i2 == i7) {
            int[] iArr4 = this.mHashes;
            if (i4 < iArr4.length) {
                iArr4[i4] = hashCode;
                Object[] objArr4 = this.mArray;
                int i8 = i4 << 1;
                objArr4[i8] = k2;
                objArr4[i8 + 1] = v2;
                this.mSize = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i2 = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i2);
        if (this.mSize != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(simpleArrayMap.keyAt(i3), simpleArrayMap.valueAt(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i2);
            System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i2 << 1);
            this.mSize = i2;
        }
    }

    @Nullable
    public V putIfAbsent(K k2, V v2) {
        V v3 = get(k2);
        V v4 = v3;
        if (v3 == null) {
            v4 = put(k2, v2);
        }
        return v4;
    }

    @Nullable
    public V remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            V valueAt = valueAt(indexOfKey);
            if (obj2 == valueAt || (obj2 != null && obj2.equals(valueAt))) {
                removeAt(indexOfKey);
                return true;
            }
            return false;
        }
        return false;
    }

    public V removeAt(int i2) {
        int i3;
        Object[] objArr = this.mArray;
        int i4 = i2 << 1;
        V v2 = (V) objArr[i4 + 1];
        int i5 = this.mSize;
        if (i5 <= 1) {
            freeArrays(this.mHashes, objArr, i5);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            i3 = 0;
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.mHashes;
            int i7 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i4, i9 << 1);
                }
                Object[] objArr3 = this.mArray;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i5 > 8) {
                    i7 = i5 + (i5 >> 1);
                }
                allocArrays(i7);
                if (i5 != this.mSize) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                    System.arraycopy(objArr, 0, this.mArray, 0, i4);
                }
                if (i2 < i6) {
                    int i11 = i2 + 1;
                    int i12 = i6 - i2;
                    System.arraycopy(iArr, i11, this.mHashes, i2, i12);
                    System.arraycopy(objArr, i11 << 1, this.mArray, i4, i12 << 1);
                }
            }
            i3 = i6;
        }
        if (i5 == this.mSize) {
            this.mSize = i3;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V replace(K k2, V v2) {
        int indexOfKey = indexOfKey(k2);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v2);
        }
        return null;
    }

    public boolean replace(K k2, V v2, V v3) {
        int indexOfKey = indexOfKey(k2);
        if (indexOfKey >= 0) {
            V valueAt = valueAt(indexOfKey);
            if (valueAt == v2 || (v2 != null && v2.equals(valueAt))) {
                setValueAt(indexOfKey, v3);
                return true;
            }
            return false;
        }
        return false;
    }

    public V setValueAt(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.mArray;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i2) {
        return (V) this.mArray[(i2 << 1) + 1];
    }
}
