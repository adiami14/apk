package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzka.class */
public abstract class zzka implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzka zzb = new zzjx(zzlj.zzd);
    private static final zzjz zzd;
    private int zzc = 0;

    static {
        int i2 = zzjm.zza;
        zzd = new zzjz(null);
        zza = new zzjs();
    }

    public static int zzj(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
            } else if (i3 < i2) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
            }
        }
        return i5;
    }

    public static zzka zzl(byte[] bArr, int i2, int i3) {
        zzj(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzjx(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        int i3 = i2;
        if (i2 == 0) {
            int zzd2 = zzd();
            int zze = zze(zzd2, 0, zzd2);
            i3 = zze;
            if (zze == 0) {
                i3 = 1;
            }
            this.zzc = i3;
        }
        return i3;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzjr(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzni.zza(this) : zzni.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract int zze(int i2, int i3, int i4);

    public abstract zzka zzf(int i2, int i3);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzjq zzjqVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
