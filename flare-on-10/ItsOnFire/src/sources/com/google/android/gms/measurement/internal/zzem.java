package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzem.class */
public final class zzem extends zzf {
    private final zzel zza;
    private boolean zzb;

    public zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzel(this, zzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzq(int r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v167, types: [com.google.android.gms.measurement.internal.zzlk] */
    /* JADX WARN: Type inference failed for: r0v185, types: [com.google.android.gms.measurement.internal.zzac] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzi(int r11) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzi(int):java.util.List");
    }

    @WorkerThread
    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e2);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    @WorkerThread
    public final boolean zzm() {
        int i2;
        zzg();
        if (!this.zzb && zzl()) {
            int i3 = 5;
            int i4 = 0;
            while (i4 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                SQLiteClosable sQLiteClosable = null;
                try {
                    try {
                        SQLiteDatabase zzh = zzh();
                        if (zzh == null) {
                            this.zzb = true;
                            return false;
                        }
                        zzh.beginTransaction();
                        zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        zzh.setTransactionSuccessful();
                        zzh.endTransaction();
                        zzh.close();
                        return true;
                    } catch (SQLiteFullException e2) {
                        this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e2);
                        this.zzb = true;
                        i2 = i3;
                        if (0 != 0) {
                            i2 = i3;
                            sQLiteDatabase = null;
                            sQLiteDatabase.close();
                            i4++;
                            i3 = i2;
                        } else {
                            i4++;
                            i3 = i2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException e3) {
                    SystemClock.sleep(i3);
                    int i5 = i3 + 20;
                    i2 = i5;
                    if (0 != 0) {
                        sQLiteDatabase = null;
                        i2 = i5;
                        sQLiteDatabase.close();
                        i4++;
                        i3 = i2;
                    } else {
                        i4++;
                        i3 = i2;
                    }
                } catch (SQLiteException e4) {
                    if (0 != 0) {
                        sQLiteClosable = null;
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (sQLiteClosable != null) {
                                sQLiteClosable.close();
                            }
                            throw th;
                        }
                    }
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e4);
                    this.zzb = true;
                    i2 = i3;
                    if (0 != 0) {
                        i2 = i3;
                        sQLiteDatabase.close();
                        i4++;
                        i3 = i2;
                    } else {
                        i4++;
                        i3 = i2;
                    }
                }
            }
            this.zzt.zzaA().zzk().zza("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length > 131072) {
            this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(2, zzap);
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel obtain = Parcel.obtain();
        zzav.zza(zzauVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzq(0, marshall);
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel obtain = Parcel.obtain();
        zzll.zza(zzlkVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(1, marshall);
    }
}
