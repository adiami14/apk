package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzak.class */
public final class zzak extends zzku {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkq zzk;

    public zzak(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzk = new zzkq(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzaj(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    @WorkerThread
    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put("value", (Double) obj);
        }
    }

    @WorkerThread
    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    private final long zzaa(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    return j2;
                }
                cursor2 = rawQuery;
                cursor = rawQuery;
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            } catch (SQLiteException e2) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e2);
                Cursor cursor3 = cursor;
                throw e2;
            }
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x044b, code lost:
        r0 = r8.zzt.zzaA().zzk();
        r0 = com.google.android.gms.measurement.internal.zzet.zzn(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0462, code lost:
        if (r0.zzj() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0465, code lost:
        r13 = java.lang.Integer.valueOf(r0.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0472, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0475, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r0, java.lang.Integer.valueOf(r0), java.lang.String.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x048c, code lost:
        r0 = r0.zzbx();
        r0 = new android.content.ContentValues();
        r0.put("app_id", r9);
        r0.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x04b8, code lost:
        if (r0.zzj() == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04bb, code lost:
        r16 = java.lang.Integer.valueOf(r0.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04c8, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04cb, code lost:
        r0.put("filter_id", r16);
        r0.put("property_name", r0.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04e7, code lost:
        if (r0.zzk() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04ea, code lost:
        r16 = java.lang.Boolean.valueOf(r0.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04f7, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04fa, code lost:
        r0.put("session_scoped", r16);
        r0.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x051f, code lost:
        if (zzh().insertWithOnConflict("property_filters", null, r0, 5) != (-1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0522, code lost:
        r8.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x053c, code lost:
        r16 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x053e, code lost:
        r17 = r8.zzt.zzaA().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x054d, code lost:
        r13 = "Error storing property filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x054f, code lost:
        r20 = com.google.android.gms.measurement.internal.zzet.zzn(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0558, code lost:
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9);
        r0 = zzh();
        r0.delete("property_filters", r0, new java.lang.String[]{r9, java.lang.String.valueOf(r0)});
        r0.delete("event_filters", r0, new java.lang.String[]{r9, java.lang.String.valueOf(r0)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025f, code lost:
        r13.zzc(r20, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x026b, code lost:
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027e, code lost:
        if (r0.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028e, code lost:
        if (((com.google.android.gms.internal.measurement.zzet) r0.next()).zzj() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0291, code lost:
        r13 = r8.zzt.zzaA().zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a0, code lost:
        r20 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a2, code lost:
        r16 = com.google.android.gms.measurement.internal.zzet.zzn(r9);
        r17 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02b2, code lost:
        r0 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c9, code lost:
        if (r0.hasNext() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02cc, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzek) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02f3, code lost:
        if (r0.zzg().isEmpty() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f6, code lost:
        r0 = r8.zzt.zzaA().zzk();
        r0 = com.google.android.gms.measurement.internal.zzet.zzn(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x030d, code lost:
        if (r0.zzp() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0310, code lost:
        r13 = java.lang.Integer.valueOf(r0.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x031d, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0320, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r0, java.lang.Integer.valueOf(r0), java.lang.String.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0337, code lost:
        r0 = r0.zzbx();
        r0 = new android.content.ContentValues();
        r0.put("app_id", r9);
        r0.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0363, code lost:
        if (r0.zzp() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0366, code lost:
        r13 = java.lang.Integer.valueOf(r0.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0373, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0376, code lost:
        r0.put("filter_id", r13);
        r0.put("event_name", r0.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0392, code lost:
        if (r0.zzq() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0395, code lost:
        r13 = java.lang.Boolean.valueOf(r0.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03a2, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03a5, code lost:
        r0.put("session_scoped", r13);
        r0.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03ca, code lost:
        if (zzh().insertWithOnConflict("event_filters", null, r0, 5) != (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03cd, code lost:
        r8.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03e4, code lost:
        r16 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03e6, code lost:
        r17 = r8.zzt.zzaA().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03f5, code lost:
        r13 = "Error storing event filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03f7, code lost:
        r20 = com.google.android.gms.measurement.internal.zzet.zzn(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03ff, code lost:
        r17.zzc(r13, r20, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x040b, code lost:
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x041e, code lost:
        if (r0.hasNext() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0421, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0448, code lost:
        if (r0.zze().isEmpty() == false) goto L125;
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzB(java.lang.String r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzB(java.lang.String, java.util.List):void");
    }

    @WorkerThread
    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    @WorkerThread
    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzv = zzhVar.zzv();
        Preconditions.checkNotNull(zzv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzv);
        contentValues.put("app_instance_id", zzhVar.zzw());
        contentValues.put("gmp_app_id", zzhVar.zzA());
        contentValues.put("resettable_device_id_hash", zzhVar.zzC());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzy());
        contentValues.put("app_store", zzhVar.zzx());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzz());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzB());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzam()));
        contentValues.put("admob_app_id", zzhVar.zzt());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzD());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzap()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzr()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzq()));
        List zzE = zzhVar.zzE();
        if (zzE != null) {
            if (zzE.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", zzv);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzE));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzv}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.zzn(zzv));
            }
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzet.zzn(zzv), e2);
        }
    }

    @WorkerThread
    public final void zzE(zzaq zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put("name", zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.zzn(zzaqVar.zza), e2);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l2, long j2, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", zzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.zzn(str), e2);
            return false;
        }
    }

    @WorkerThread
    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.zzn(str));
                return true;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzet.zzn(str), e2);
            return true;
        }
    }

    @WorkerThread
    public final boolean zzL(zzlm zzlmVar) {
        Preconditions.checkNotNull(zzlmVar);
        zzg();
        zzW();
        if (zzp(zzlmVar.zza, zzlmVar.zzc) == null) {
            if (zzlp.zzak(zzlmVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlmVar.zza}) >= this.zzt.zzf().zzf(zzlmVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlmVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlmVar.zza, zzlmVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlmVar.zza);
        contentValues.put("origin", zzlmVar.zzb);
        contentValues.put("name", zzlmVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlmVar.zzd));
        zzV(contentValues, "value", zzlmVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.zzn(zzlmVar.zza));
                return true;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzet.zzn(zzlmVar.zza), e2);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzU(String str, long j2, long j3, zzle zzleVar) {
        Cursor cursor;
        Cursor cursor2;
        String str2;
        String[] strArr;
        String str3;
        Cursor cursor3;
        String[] strArr2;
        String str4;
        Preconditions.checkNotNull(zzleVar);
        zzg();
        zzW();
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                try {
                    if (TextUtils.isEmpty(null)) {
                        int i2 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        Cursor rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (i2 != 0 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", i2 != 0 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str2 = rawQuery.getString(0);
                        String string = rawQuery.getString(1);
                        rawQuery.close();
                        cursor3 = rawQuery;
                        str3 = string;
                    } else {
                        int i3 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        if (i3 != 0) {
                            strArr = new String[2];
                            strArr[0] = null;
                            strArr[1] = String.valueOf(j3);
                        } else {
                            strArr = new String[]{null};
                        }
                        Cursor rawQuery2 = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (i3 != 0 ? " and rowid <= ?" : "") + " order by rowid limit 1;", strArr);
                        if (!rawQuery2.moveToFirst()) {
                            rawQuery2.close();
                            return;
                        }
                        String string2 = rawQuery2.getString(0);
                        rawQuery2.close();
                        str3 = string2;
                        cursor3 = rawQuery2;
                        str2 = null;
                    }
                    try {
                        Cursor query = zzh2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str3}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.zzt.zzaA().zzd().zzb("Raw event metadata record is missing. appId", zzet.zzn(str2));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzlj.zzm(com.google.android.gms.internal.measurement.zzgd.zzu(), query.getBlob(0))).zzaD();
                                    if (query.moveToNext()) {
                                        this.zzt.zzaA().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzet.zzn(str2));
                                    }
                                    query.close();
                                    Preconditions.checkNotNull(zzgdVar);
                                    zzleVar.zza = zzgdVar;
                                    if (j3 != -1) {
                                        strArr2 = new String[]{str2, str3, String.valueOf(j3)};
                                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    } else {
                                        strArr2 = new String[]{str2, str3};
                                        str4 = "app_id = ? and metadata_fingerprint = ?";
                                    }
                                    Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str4, strArr2, null, null, "rowid", null);
                                    String str5 = str2;
                                    if (!query2.moveToFirst()) {
                                        this.zzt.zzaA().zzk().zzb("Raw event data disappeared while in transaction. appId", zzet.zzn(str2));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        String str6 = str2;
                                        long j4 = query2.getLong(0);
                                        String str7 = str2;
                                        byte[] blob = query2.getBlob(3);
                                        String str8 = str2;
                                        try {
                                            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), blob);
                                            String str9 = str2;
                                            zzfsVar.zzi(query2.getString(1));
                                            String str10 = str2;
                                            zzfsVar.zzm(query2.getLong(2));
                                            String str11 = str2;
                                            if (!zzleVar.zza(j4, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e2) {
                                            this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event. appId", zzet.zzn(str2), e2);
                                        }
                                        String str12 = str2;
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e3) {
                                    this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzet.zzn(str2), e3);
                                    query.close();
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                cursor2 = query;
                                this.zzt.zzaA().zzd().zzc("Data loss. Error selecting raw event. appId", zzet.zzn(str2), e);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        cursor2 = cursor3;
                    } catch (Throwable th3) {
                        cursor = cursor3;
                        th = th3;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    str2 = null;
                    cursor2 = null;
                }
            } catch (Throwable th4) {
                cursor = str;
                th = th4;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursor2 = null;
            str2 = null;
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
        }
    }

    @WorkerThread
    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e2);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final long zzc(String str, String str2) {
        long j2;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                long zzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                j2 = zzaa;
                if (zzaa == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.zzn(str), "first_open_count");
                        zzh2.endTransaction();
                        return -1L;
                    }
                    j2 = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + j2));
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzet.zzn(str), "first_open_count", e);
                    zzh2.endTransaction();
                    return j2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                j2 = 0;
            }
            if (zzh2.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.zzn(str), "first_open_count");
                zzh2.endTransaction();
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            zzh2.endTransaction();
            return j2;
        } catch (Throwable th) {
            zzh2.endTransaction();
            throw th;
        }
    }

    @WorkerThread
    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @WorkerThread
    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x017e: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:79:0x017e */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ef  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzj(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac zzk(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    @WorkerThread
    public final zzai zzl(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j2, str, 1L, false, false, z3, false, z5);
    }

    @WorkerThread
    public final zzai zzm(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        zzai zzaiVar = new zzai();
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzt.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzet.zzn(str));
                    query.close();
                    return zzaiVar;
                }
                if (query.getLong(0) == j2) {
                    zzaiVar.zzb = query.getLong(1);
                    zzaiVar.zza = query.getLong(2);
                    zzaiVar.zzc = query.getLong(3);
                    zzaiVar.zzd = query.getLong(4);
                    zzaiVar.zze = query.getLong(5);
                }
                if (z) {
                    zzaiVar.zzb += j3;
                }
                if (z2) {
                    zzaiVar.zza += j3;
                }
                if (z3) {
                    zzaiVar.zzc += j3;
                }
                if (z4) {
                    zzaiVar.zzd += j3;
                }
                if (z5) {
                    zzaiVar.zze += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", new String[]{str});
                query.close();
                return zzaiVar;
            } catch (SQLiteException e2) {
                this.zzt.zzaA().zzd().zzc("Error updating daily counts. appId", zzet.zzn(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaiVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaq zzn(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzlm zzp(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzlm");
    }

    @VisibleForTesting
    @WorkerThread
    public final Object zzq(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.zzt.zzaA().zzd().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    zzer zzd2 = this.zzt.zzaA().zzd();
                    if (type != 4) {
                        zzd2.zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    zzd2.zza("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i2);
            }
            return Double.valueOf(cursor.getDouble(i2));
        } else {
            return Long.valueOf(cursor.getLong(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzr() {
        /*
            r4 = this;
            r0 = r4
            android.database.sqlite.SQLiteDatabase r0 = r0.zzh()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            java.lang.String r1 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3d
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r5
            boolean r0 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L35 java.lang.Throwable -> L5f
            if (r0 == 0) goto L2d
            r0 = r5
            r6 = r0
            r0 = r5
            r1 = 0
            java.lang.String r0 = r0.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L35 java.lang.Throwable -> L5f
            r7 = r0
            r0 = r5
            r0.close()
            r0 = r7
            return r0
        L2d:
            r0 = r5
            r0.close()
            r0 = 0
            return r0
        L35:
            r7 = move-exception
            goto L40
        L39:
            r5 = move-exception
            goto L60
        L3d:
            r7 = move-exception
            r0 = 0
            r5 = r0
        L40:
            r0 = r5
            r6 = r0
            r0 = r4
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzd()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "Database error getting next bundle app id"
            r2 = r7
            r0.zzb(r1, r2)     // Catch: java.lang.Throwable -> L5f
            r0 = r5
            if (r0 == 0) goto L5d
            r0 = r5
            r0.close()
        L5d:
            r0 = 0
            return r0
        L5f:
            r5 = move-exception
        L60:
            r0 = r6
            if (r0 == 0) goto L6a
            r0 = r6
            r0.close()
        L6a:
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzr():java.lang.String");
    }

    @WorkerThread
    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e1, code lost:
        r0 = r16.zzt.zzaA().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f2, code lost:
        r16.zzt.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fb, code lost:
        r22 = r0;
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0100, code lost:
        r0.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r17, java.lang.String[] r18) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    @WorkerThread
    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                this.zzt.zzf();
                Cursor query = zzh2.query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!query.moveToFirst()) {
                    query.close();
                    return arrayList;
                }
                do {
                    cursor = query;
                    cursor2 = query;
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String str2 = string2;
                    if (string2 == null) {
                        str2 = "";
                    }
                    long j2 = query.getLong(2);
                    Object zzq = zzq(query, 3);
                    if (zzq == null) {
                        this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.zzn(str));
                    } else {
                        arrayList.add(new zzlm(str, str2, string, j2, zzq));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            } catch (SQLiteException e2) {
                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzet.zzn(str), e2);
                Cursor cursor3 = cursor2;
                List emptyList = Collections.emptyList();
                if (cursor2 != null) {
                    cursor2.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0208, code lost:
        r0 = r10.zzt.zzaA().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021e, code lost:
        r10.zzt.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0228, code lost:
        r16 = r0;
        r23 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0231, code lost:
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0354  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzv(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    @WorkerThread
    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzt.zzaA().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e2) {
                this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e2);
            }
        }
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(currentTimeMillis), String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
