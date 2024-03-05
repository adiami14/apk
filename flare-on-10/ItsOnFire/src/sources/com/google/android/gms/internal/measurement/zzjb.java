package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzjb.class */
public abstract class zzjb extends zziw implements Set {
    @CheckForNull
    private transient zzja zza;

    public static int zzf(int i2) {
        int max = Math.max(i2, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static zzjb zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return zzk(15, objArr2);
    }

    private static zzjb zzk(int i2, Object... objArr) {
        int i3;
        int i4;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new zzjg(obj);
            }
            int zzf = zzf(i2);
            Object[] objArr2 = new Object[zzf];
            int i5 = zzf - 1;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i8 < i2) {
                Object obj2 = objArr[i8];
                zzjd.zza(obj2, i8);
                int hashCode = obj2.hashCode();
                int zza = zzit.zza(hashCode);
                while (true) {
                    int i9 = zza & i5;
                    Object obj3 = objArr2[i9];
                    if (obj3 == null) {
                        objArr[i6] = obj2;
                        objArr2[i9] = obj2;
                        i3 = i7 + hashCode;
                        i4 = i6 + 1;
                        break;
                    }
                    i3 = i7;
                    i4 = i6;
                    if (!obj3.equals(obj2)) {
                        zza++;
                    }
                }
                i8++;
                i7 = i3;
                i6 = i4;
            }
            Arrays.fill(objArr, i6, i2, (Object) null);
            if (i6 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new zzjg(obj4);
            }
            if (zzf(i6) < zzf / 2) {
                return zzk(i6, objArr);
            }
            Object[] objArr3 = objArr;
            if (i6 < 10) {
                objArr3 = Arrays.copyOf(objArr, i6);
            }
            return new zzjf(objArr3, i7, objArr2, i5, i6);
        }
        return zzjf.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzj() && ((zzjb) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                    }
                } catch (ClassCastException | NullPointerException e2) {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return i3;
            }
            Object next = it.next();
            i2 = i3 + (next != null ? next.hashCode() : 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzjh iterator();

    public final zzja zzg() {
        zzja zzjaVar = this.zza;
        zzja zzjaVar2 = zzjaVar;
        if (zzjaVar == null) {
            zzjaVar2 = zzh();
            this.zza = zzjaVar2;
        }
        return zzjaVar2;
    }

    public zzja zzh() {
        Object[] array = toArray();
        int i2 = zzja.zzd;
        return zzja.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
