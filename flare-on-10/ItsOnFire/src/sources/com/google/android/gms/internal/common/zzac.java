package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;
@DoNotMock("Use ImmutableList.of or another implementation")
@NullMarked
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzac.class */
public abstract class zzac extends AbstractCollection implements Serializable {
    private static final Object[] zza = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] zzg = zzg();
            if (zzg != null) {
                return Arrays.copyOfRange(zzg, zzc(), zzb(), objArr.getClass());
            }
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else {
            objArr2 = objArr;
            if (length > size) {
                objArr[size] = null;
                objArr2 = objArr;
            }
        }
        zza(objArr2, 0);
        return objArr2;
    }

    @CanIgnoreReturnValue
    int zza(Object[] objArr, int i2) {
        throw null;
    }

    int zzb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzc() {
        throw null;
    }

    public zzag zzd() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzaj iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzf();

    @CheckForNull
    public Object[] zzg() {
        throw null;
    }
}
