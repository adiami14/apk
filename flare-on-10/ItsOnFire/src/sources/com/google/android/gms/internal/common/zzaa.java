package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzaa.class */
class zzaa extends zzab {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzaa(int i2) {
    }

    private final void zzb(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            int i4 = i3;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i4 = highestOneBit + highestOneBit;
            }
            int i5 = i4;
            if (i4 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i5);
        } else if (!this.zzc) {
            return;
        } else {
            this.zza = (Object[]) objArr.clone();
        }
        this.zzc = false;
    }

    @CanIgnoreReturnValue
    public final zzaa zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = obj;
        return this;
    }
}
