package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/firebase/heartbeatinfo/HeartBeatInfoStorage.class */
public class HeartBeatInfoStorage {
    private static final String GLOBAL = "fire-global";
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String LAST_STORED_DATE = "last-used-date";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseSharedPreferences = context.getSharedPreferences(HEARTBEAT_PREFERENCES_NAME + str, 0);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public HeartBeatInfoStorage(SharedPreferences sharedPreferences) {
        this.firebaseSharedPreferences = sharedPreferences;
    }

    private void cleanUpStoredHeartBeats() {
        synchronized (this) {
            long j2 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
            String str = null;
            String str2 = "";
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    String str3 = str2;
                    String str4 = str;
                    while (true) {
                        str = str4;
                        str2 = str3;
                        if (it.hasNext()) {
                            String str5 = (String) it.next();
                            if (str4 == null || str4.compareTo(str5) > 0) {
                                str3 = entry.getKey();
                                str4 = str5;
                            }
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str2, new HashSet()));
            hashSet.remove(str);
            this.firebaseSharedPreferences.edit().putStringSet(str2, hashSet).putLong(HEART_BEAT_COUNT_TAG, j2 - 1).commit();
        }
    }

    private String getFormattedDate(long j2) {
        String format;
        synchronized (this) {
            format = new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return format;
    }

    private String getStoredUserAgentString(String str) {
        synchronized (this) {
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str.equals(str2)) {
                            return entry.getKey();
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    private void removeStoredDate(String str) {
        synchronized (this) {
            String storedUserAgentString = getStoredUserAgentString(str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.firebaseSharedPreferences.edit().remove(storedUserAgentString) : this.firebaseSharedPreferences.edit().putStringSet(storedUserAgentString, hashSet)).commit();
        }
    }

    private void updateStoredUserAgent(String str, String str2) {
        synchronized (this) {
            removeStoredDate(str2);
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.add(str2);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).commit();
        }
    }

    public void deleteAllHeartBeats() {
        synchronized (this) {
            SharedPreferences.Editor edit = this.firebaseSharedPreferences.edit();
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove(entry.getKey());
                }
            }
            edit.remove(HEART_BEAT_COUNT_TAG);
            edit.commit();
        }
    }

    public List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList((Set) entry.getValue())));
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public int getHeartBeatCount() {
        return (int) this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
    }

    public long getLastGlobalHeartBeat() {
        long j2;
        synchronized (this) {
            j2 = this.firebaseSharedPreferences.getLong(GLOBAL, -1L);
        }
        return j2;
    }

    public boolean isSameDateUtc(long j2, long j3) {
        boolean equals;
        synchronized (this) {
            equals = getFormattedDate(j2).equals(getFormattedDate(j3));
        }
        return equals;
    }

    public void postHeartBeatCleanUp() {
        synchronized (this) {
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            this.firebaseSharedPreferences.edit().putString(LAST_STORED_DATE, formattedDate).commit();
            removeStoredDate(formattedDate);
        }
    }

    public boolean shouldSendGlobalHeartBeat(long j2) {
        boolean shouldSendSdkHeartBeat;
        synchronized (this) {
            shouldSendSdkHeartBeat = shouldSendSdkHeartBeat(GLOBAL, j2);
        }
        return shouldSendSdkHeartBeat;
    }

    public boolean shouldSendSdkHeartBeat(String str, long j2) {
        synchronized (this) {
            if (!this.firebaseSharedPreferences.contains(str)) {
                this.firebaseSharedPreferences.edit().putLong(str, j2).commit();
                return true;
            } else if (isSameDateUtc(this.firebaseSharedPreferences.getLong(str, -1L), j2)) {
                return false;
            } else {
                this.firebaseSharedPreferences.edit().putLong(str, j2).commit();
                return true;
            }
        }
    }

    public void storeHeartBeat(long j2, String str) {
        synchronized (this) {
            String formattedDate = getFormattedDate(j2);
            if (this.firebaseSharedPreferences.getString(LAST_STORED_DATE, "").equals(formattedDate)) {
                String storedUserAgentString = getStoredUserAgentString(formattedDate);
                if (storedUserAgentString == null) {
                    return;
                }
                if (storedUserAgentString.equals(str)) {
                    return;
                }
                updateStoredUserAgent(str, formattedDate);
                return;
            }
            long j3 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
            long j4 = j3;
            if (j3 + 1 == 30) {
                cleanUpStoredHeartBeats();
                j4 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.add(formattedDate);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong(HEART_BEAT_COUNT_TAG, j4 + 1).putString(LAST_STORED_DATE, formattedDate).commit();
        }
    }

    public void updateGlobalHeartBeat(long j2) {
        synchronized (this) {
            this.firebaseSharedPreferences.edit().putLong(GLOBAL, j2).commit();
        }
    }
}
