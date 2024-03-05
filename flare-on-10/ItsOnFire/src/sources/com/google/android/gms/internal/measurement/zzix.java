package com.google.android.gms.internal.measurement;

import java.util.Arrays;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzix.class */
public final class zzix extends zziu {
    public zzix() {
        super(4);
    }

    public final zzix zza(Object... objArr) {
        zzjd.zzb(objArr, 15);
        int i2 = this.zzb + 15;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (length >= i2) {
            if (this.zzc) {
                this.zza = (Object[]) objArr2.clone();
            }
            System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
            this.zzb += 15;
            return this;
        }
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
        this.zza = Arrays.copyOf(objArr2, i5);
        this.zzc = false;
        System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
        this.zzb += 15;
        return this;
    }

    public final zzja zzb() {
        this.zzc = true;
        return zzja.zzg(this.zza, this.zzb);
    }
}
