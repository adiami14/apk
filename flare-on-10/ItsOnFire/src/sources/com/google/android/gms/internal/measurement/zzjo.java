package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzjo.class */
public final class zzjo {
    public static int zza(byte[] bArr, int i2, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zzj) {
                if (i3 == 0) {
                    zzjnVar.zzc = zzka.zzb;
                    return zzj;
                }
                zzjnVar.zzc = zzka.zzl(bArr, zzj, i3);
                return zzj + i3;
            }
            throw zzll.zzf();
        }
        throw zzll.zzd();
    }

    public static int zzb(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        return ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 1] & 255) << 8) | (b2 & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzmt zzmtVar, byte[] bArr, int i2, int i3, int i4, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzn = zzn(zze, zzmtVar, bArr, i2, i3, i4, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzmt zzmtVar, byte[] bArr, int i2, int i3, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzo = zzo(zze, zzmtVar, bArr, i2, i3, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzmt zzmtVar, int i2, byte[] bArr, int i3, int i4, zzli zzliVar, zzjn zzjnVar) throws IOException {
        int i5;
        int zzd = zzd(zzmtVar, bArr, i3, i4, zzjnVar);
        while (true) {
            i5 = zzd;
            zzliVar.add(zzjnVar.zzc);
            if (i5 >= i4) {
                break;
            }
            int zzj = zzj(bArr, i5, zzjnVar);
            if (i2 != zzjnVar.zza) {
                break;
            }
            zzd = zzd(zzmtVar, bArr, zzj, i4, zzjnVar);
        }
        return i5;
    }

    public static int zzf(byte[] bArr, int i2, zzli zzliVar, zzjn zzjnVar) throws IOException {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza + zzj;
        while (zzj < i3) {
            zzj = zzj(bArr, zzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (zzj == i3) {
            return zzj;
        }
        throw zzll.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzjnVar.zzc = "";
                return zzj;
            }
            zzjnVar.zzc = new String(bArr, zzj, i3, zzlj.zzb);
            return zzj + i3;
        }
        throw zzll.zzd();
    }

    public static int zzh(byte[] bArr, int i2, zzjn zzjnVar) throws zzll {
        int i3;
        int i4;
        byte b2;
        byte b3;
        int zzj = zzj(bArr, i2, zzjnVar);
        int i5 = zzjnVar.zza;
        if (i5 >= 0) {
            if (i5 == 0) {
                zzjnVar.zzc = "";
                return zzj;
            }
            int i6 = zznz.zza;
            int length = bArr.length;
            if ((((length - zzj) - i5) | zzj | i5) >= 0) {
                int i7 = zzj + i5;
                char[] cArr = new char[i5];
                int i8 = 0;
                while (true) {
                    i3 = i8;
                    i4 = zzj;
                    if (zzj >= i7) {
                        break;
                    }
                    i3 = i8;
                    i4 = zzj;
                    if (!zznv.zzd(bArr[zzj])) {
                        break;
                    }
                    zzj++;
                    cArr[i8] = (char) b3;
                    i8++;
                }
                while (i4 < i7) {
                    int i9 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (zznv.zzd(b4)) {
                        cArr[i3] = (char) b4;
                        int i10 = i3 + 1;
                        while (true) {
                            int i11 = i10;
                            i3 = i11;
                            i4 = i9;
                            if (i9 < i7) {
                                i3 = i11;
                                i4 = i9;
                                if (zznv.zzd(bArr[i9])) {
                                    i9++;
                                    i10 = i11 + 1;
                                    cArr[i11] = (char) b2;
                                }
                            }
                        }
                    } else if (b4 < -32) {
                        if (i9 >= i7) {
                            throw zzll.zzc();
                        }
                        zznv.zzc(b4, bArr[i9], cArr, i3);
                        i4 = i9 + 1;
                        i3++;
                    } else if (b4 < -16) {
                        if (i9 >= i7 - 1) {
                            throw zzll.zzc();
                        }
                        int i12 = i9 + 1;
                        zznv.zzb(b4, bArr[i9], bArr[i12], cArr, i3);
                        i4 = i12 + 1;
                        i3++;
                    } else if (i9 >= i7 - 2) {
                        throw zzll.zzc();
                    } else {
                        int i13 = i9 + 1;
                        int i14 = i13 + 1;
                        zznv.zza(b4, bArr[i9], bArr[i13], bArr[i14], cArr, i3);
                        i3 += 2;
                        i4 = i14 + 1;
                    }
                }
                zzjnVar.zzc = new String(cArr, 0, i3);
                return i7;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i5)));
        }
        throw zzll.zzd();
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zznl zznlVar, zzjn zzjnVar) throws zzll {
        int i5;
        int i6;
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                int zzm = zzm(bArr, i3, zzjnVar);
                zznlVar.zzj(i2, Long.valueOf(zzjnVar.zzb));
                return zzm;
            } else if (i7 == 1) {
                zznlVar.zzj(i2, Long.valueOf(zzp(bArr, i3)));
                return i3 + 8;
            } else if (i7 == 2) {
                int zzj = zzj(bArr, i3, zzjnVar);
                int i8 = zzjnVar.zza;
                if (i8 >= 0) {
                    if (i8 <= bArr.length - zzj) {
                        zznlVar.zzj(i2, i8 == 0 ? zzka.zzb : zzka.zzl(bArr, zzj, i8));
                        return zzj + i8;
                    }
                    throw zzll.zzf();
                }
                throw zzll.zzd();
            } else if (i7 != 3) {
                if (i7 == 5) {
                    zznlVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
                    return i3 + 4;
                }
                throw zzll.zzb();
            } else {
                int i9 = (i2 & (-8)) | 4;
                zznl zzf = zznl.zzf();
                int i10 = 0;
                while (true) {
                    i5 = i10;
                    i6 = i3;
                    if (i3 >= i4) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i3, zzjnVar);
                    i10 = zzjnVar.zza;
                    if (i10 == i9) {
                        i6 = zzj2;
                        i5 = i10;
                        break;
                    }
                    i3 = zzi(i10, bArr, zzj2, i4, zzf, zzjnVar);
                }
                if (i6 > i4 || i5 != i9) {
                    throw zzll.zze();
                }
                zznlVar.zzj(i2, zzf);
                return i6;
            }
        }
        throw zzll.zzb();
    }

    public static int zzj(byte[] bArr, int i2, zzjn zzjnVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzjnVar.zza = b2;
            return i3;
        }
        return zzk(b2, bArr, i3, zzjnVar);
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzjn zzjnVar) {
        int i4;
        int i5;
        int i6;
        byte b2 = bArr[i3];
        int i7 = i3 + 1;
        int i8 = i2 & 127;
        if (b2 < 0) {
            int i9 = i8 | ((b2 & Byte.MAX_VALUE) << 7);
            int i10 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i5 = b3 << 14;
                i4 = i10;
            } else {
                i8 = i9 | ((b3 & Byte.MAX_VALUE) << 14);
                i7 = i10 + 1;
                byte b4 = bArr[i10];
                if (b4 >= 0) {
                    i6 = b4 << 21;
                } else {
                    i9 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
                    int i11 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i4 = i11;
                        i5 = b5 << 28;
                    } else {
                        while (true) {
                            int i12 = i11 + 1;
                            if (bArr[i11] >= 0) {
                                zzjnVar.zza = i9 | ((b5 & Byte.MAX_VALUE) << 28);
                                return i12;
                            }
                            i11 = i12;
                        }
                    }
                }
            }
            zzjnVar.zza = i9 | i5;
            return i4;
        }
        i6 = b2 << 7;
        zzjnVar.zza = i8 | i6;
        return i7;
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzli zzliVar, zzjn zzjnVar) {
        int i5;
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i3, zzjnVar);
        while (true) {
            i5 = zzj;
            zzlcVar.zzh(zzjnVar.zza);
            if (i5 >= i4) {
                break;
            }
            int zzj2 = zzj(bArr, i5, zzjnVar);
            if (i2 != zzjnVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzjnVar);
        }
        return i5;
    }

    public static int zzm(byte[] bArr, int i2, zzjn zzjnVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzjnVar.zzb = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            j3 |= (b2 & Byte.MAX_VALUE) << i5;
            i4++;
        }
        zzjnVar.zzb = j3;
        return i4;
    }

    public static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i2, int i3, int i4, zzjn zzjnVar) throws IOException {
        int zzc = ((zzml) zzmtVar).zzc(obj, bArr, i2, i3, i4, zzjnVar);
        zzjnVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i2, int i3, zzjn zzjnVar) throws IOException {
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        int i5 = i4;
        int i6 = b2;
        if (b2 < 0) {
            i5 = zzk(b2, bArr, i4, zzjnVar);
            i6 = zzjnVar.zza;
        }
        if (i6 < 0 || i6 > i3 - i5) {
            throw zzll.zzf();
        }
        int i7 = i6 + i5;
        zzmtVar.zzh(obj, bArr, i5, i7, zzjnVar);
        zzjnVar.zzc = obj;
        return i7;
    }

    public static long zzp(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }
}
