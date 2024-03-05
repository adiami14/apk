package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.appcompat.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0010\u0018��*\u0006\b��\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028��\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0004\u001a\u00028��X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "K", "V", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "equals", "", "other", "", "hashCode", "", "toString", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry.class */
public class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {
    private final K key;
    private final V value;

    public MapEntry(K k2, V v2) {
        this.key = k2;
        this.value = v2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        boolean z;
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        if (entry == null) {
            z = false;
        } else {
            z = false;
            if (Intrinsics.areEqual(entry.getKey(), getKey())) {
                z = false;
                if (Intrinsics.areEqual(entry.getValue(), getValue())) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int i2 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        V value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return hashCode ^ i2;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
