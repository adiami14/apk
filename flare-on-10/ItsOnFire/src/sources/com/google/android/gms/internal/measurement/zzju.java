package com.google.android.gms.internal.measurement;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzju.class */
final class zzju extends zzjx {
    private final int zzc;

    public zzju(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzka.zzj(0, i3, bArr.length);
        this.zzc = i3;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [int, java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zza(int i2) {
        if (((this.zzc - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            ?? sb = new StringBuilder();
            sb.append("Index > length: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(sb);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final int zzd() {
        return this.zzc;
    }
}
