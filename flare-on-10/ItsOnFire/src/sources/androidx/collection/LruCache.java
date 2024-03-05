package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: ItsOnFire.jar:androidx/collection/LruCache.class */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i2;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(K k2, V v2) {
        int sizeOf = sizeOf(k2, v2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v2);
    }

    @Nullable
    public V create(@NonNull K k2) {
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this) {
            i2 = this.createCount;
        }
        return i2;
    }

    public void entryRemoved(boolean z, @NonNull K k2, @NonNull V v2, @Nullable V v3) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    @Nullable
    public final V get(@NonNull K k2) {
        V put;
        if (k2 != null) {
            synchronized (this) {
                V v2 = this.map.get(k2);
                if (v2 != null) {
                    this.hitCount++;
                    return v2;
                }
                this.missCount++;
                V create = create(k2);
                if (create == null) {
                    return null;
                }
                synchronized (this) {
                    this.createCount++;
                    put = this.map.put(k2, create);
                    if (put != null) {
                        this.map.put(k2, put);
                    } else {
                        this.size += safeSizeOf(k2, create);
                    }
                }
                if (put != null) {
                    entryRemoved(false, k2, create, put);
                    return put;
                }
                trimToSize(this.maxSize);
                return create;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final int hitCount() {
        int i2;
        synchronized (this) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this) {
            i2 = this.missCount;
        }
        return i2;
    }

    @Nullable
    public final V put(@NonNull K k2, @NonNull V v2) {
        V put;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k2, v2);
            put = this.map.put(k2, v2);
            if (put != null) {
                this.size -= safeSizeOf(k2, put);
            }
        }
        if (put != null) {
            entryRemoved(false, k2, put, v2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i2;
        synchronized (this) {
            i2 = this.putCount;
        }
        return i2;
    }

    @Nullable
    public final V remove(@NonNull K k2) {
        V remove;
        if (k2 != null) {
            synchronized (this) {
                remove = this.map.remove(k2);
                if (remove != null) {
                    this.size -= safeSizeOf(k2, remove);
                }
            }
            if (remove != null) {
                entryRemoved(false, k2, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public void resize(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i2;
        }
        trimToSize(i2);
    }

    public final int size() {
        int i2;
        synchronized (this) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(@NonNull K k2, @NonNull V v2) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            linkedHashMap = new LinkedHashMap(this.map);
        }
        return linkedHashMap;
    }

    public final String toString() {
        String format;
        synchronized (this) {
            int i2 = this.hitCount;
            int i3 = this.missCount + i2;
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
        }
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            r0 = r6
            monitor-enter(r0)
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.Throwable -> Lad
            if (r0 < 0) goto L84
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.map     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L1a
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L84
        L1a:
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.Throwable -> Lad
            r1 = r7
            if (r0 <= r1) goto L81
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.map     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L2f
            goto L81
        L2f:
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.map     // Catch: java.lang.Throwable -> Lad
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lad
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Lad
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Throwable -> Lad
            r9 = r0
            r0 = r8
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lad
            r8 = r0
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.map     // Catch: java.lang.Throwable -> Lad
            r1 = r9
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            r1 = r6
            int r1 = r1.size     // Catch: java.lang.Throwable -> Lad
            r2 = r6
            r3 = r9
            r4 = r8
            int r2 = r2.safeSizeOf(r3, r4)     // Catch: java.lang.Throwable -> Lad
            int r1 = r1 - r2
            r0.size = r1     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            r1 = r6
            int r1 = r1.evictionCount     // Catch: java.lang.Throwable -> Lad
            r2 = 1
            int r1 = r1 + r2
            r0.evictionCount = r1     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            r1 = 1
            r2 = r9
            r3 = r8
            r4 = 0
            r0.entryRemoved(r1, r2, r3, r4)
            goto L0
        L81:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            return
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lad
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r8 = r0
            r0 = r8
            r0.<init>()     // Catch: java.lang.Throwable -> Lad
            r0 = r8
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r8
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lad
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lad:
            r9 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
