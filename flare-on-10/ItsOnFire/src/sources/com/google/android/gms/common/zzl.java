package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/zzl.class */
abstract class zzl extends zzj {
    private static final WeakReference zza = new WeakReference(null);
    private WeakReference zzb;

    public zzl(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
        byte[] bArr;
        synchronized (this) {
            byte[] bArr2 = (byte[]) this.zzb.get();
            bArr = bArr2;
            if (bArr2 == null) {
                bArr = zzb();
                this.zzb = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
