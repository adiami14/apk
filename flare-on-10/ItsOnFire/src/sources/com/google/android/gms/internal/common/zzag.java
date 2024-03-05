package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzag.class */
public abstract class zzag extends zzac implements List, RandomAccess {
    private static final zzak zza = new zzae(zzai.zza, 0);

    public static zzag zzi(Object[] objArr, int i2) {
        return i2 == 0 ? zzai.zza : new zzai(objArr, i2);
    }

    public static zzag zzj(Iterable iterable) {
        zzag zzi;
        iterable.getClass();
        if (iterable instanceof Collection) {
            zzi = zzk((Collection) iterable);
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    zzad zzadVar = new zzad(4);
                    zzadVar.zzb(next);
                    zzadVar.zzc(it);
                    zzadVar.zzc = true;
                    zzi = zzi(zzadVar.zza, zzadVar.zzb);
                } else {
                    zzi = zzm(next);
                }
            } else {
                zzi = zzai.zza;
            }
        }
        return zzi;
    }

    public static zzag zzk(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzah.zza(array, length);
            return zzi(array, length);
        }
        zzag zzd = ((zzac) collection).zzd();
        zzag zzagVar = zzd;
        if (zzd.zzf()) {
            Object[] array2 = zzd.toArray();
            zzagVar = zzi(array2, array2.length);
        }
        return zzagVar;
    }

    public static zzag zzl() {
        return zzai.zza;
    }

    public static zzag zzm(Object obj) {
        Object[] objArr = {obj};
        zzah.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzag zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        boolean z;
        if (obj == this) {
            z = true;
        } else {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        int i2 = 0;
                        while (true) {
                            z = true;
                            if (i2 >= size) {
                                break;
                            } else if (!zzr.zza(get(i2), list.get(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (!zzr.zza(it.next(), it2.next())) {
                                    break;
                                }
                            } else if (!it2.hasNext()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        int i2;
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i3 = 0;
        while (true) {
            i2 = -1;
            if (i3 >= size) {
                break;
            } else if (obj.equals(get(i3))) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        int i2;
        if (obj == null) {
            return -1;
        }
        int size = size() - 1;
        while (true) {
            i2 = -1;
            if (size < 0) {
                break;
            } else if (obj.equals(get(size))) {
                i2 = size;
                break;
            } else {
                size--;
            }
        }
        return i2;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public int zza(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @InlineMe(replacement = "this")
    @Deprecated
    public final zzag zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final zzaj zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzag subList(int i2, int i3) {
        zzs.zzc(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? zzai.zza : new zzaf(this, i2, i4);
    }

    @Override // java.util.List
    /* renamed from: zzo */
    public final zzak listIterator(int i2) {
        zzs.zzb(i2, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzae(this, i2);
    }
}
