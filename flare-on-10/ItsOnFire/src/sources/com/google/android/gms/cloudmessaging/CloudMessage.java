package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: ItsOnFire.jar:com/google/android/gms/cloudmessaging/CloudMessage.class */
public final class CloudMessage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @NonNull
    @SafeParcelable.Field(id = 1)
    public Intent zza;
    @GuardedBy("this")
    private Map<String, String> zzb;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: ItsOnFire.jar:com/google/android/gms/cloudmessaging/CloudMessage$MessagePriority.class */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@NonNull @SafeParcelable.Param(id = 1) Intent intent) {
        this.zza = intent;
    }

    private static int zza(@Nullable String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @NonNull
    public Map<String, String> getData() {
        Map<String, String> map;
        synchronized (this) {
            if (this.zzb == null) {
                Bundle extras = this.zza.getExtras();
                ArrayMap arrayMap = new ArrayMap();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith(Constants.MessagePayloadKeys.RESERVED_PREFIX) && !str.equals(Constants.MessagePayloadKeys.FROM) && !str.equals(Constants.MessagePayloadKeys.MESSAGE_TYPE) && !str.equals(Constants.MessagePayloadKeys.COLLAPSE_KEY)) {
                                arrayMap.put(str, str2);
                            }
                        }
                    }
                }
                this.zzb = arrayMap;
            }
            map = this.zzb;
        }
        return map;
    }

    @Nullable
    public String getFrom() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.FROM);
    }

    @NonNull
    public Intent getIntent() {
        return this.zza;
    }

    @Nullable
    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    @Nullable
    public String getMessageType() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        String str = stringExtra;
        if (stringExtra == null) {
            str = this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return zza(str);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        String str = stringExtra;
        if (stringExtra == null) {
            if ("1".equals(this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            str = this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return zza(str);
    }

    @Nullable
    public byte[] getRawData() {
        return this.zza.getByteArrayExtra(Constants.MessagePayloadKeys.RAW_DATA);
    }

    @Nullable
    public String getSenderId() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Bundle extras = this.zza.getExtras();
        String str = extras != null ? extras.get(Constants.MessagePayloadKeys.SENT_TIME) : null;
        if (str instanceof Long) {
            return str.longValue();
        }
        if (str instanceof String) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e2) {
                String valueOf = String.valueOf(str);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid sent time: ");
                sb.append(valueOf);
                Log.w("CloudMessage", sb.toString());
                return 0L;
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.TO);
    }

    public int getTtl() {
        Bundle extras = this.zza.getExtras();
        String str = extras != null ? extras.get(Constants.MessagePayloadKeys.TTL) : null;
        if (str instanceof Integer) {
            return str.intValue();
        }
        if (str instanceof String) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e2) {
                String valueOf = String.valueOf(str);
                StringBuilder sb = new StringBuilder(valueOf.length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(valueOf);
                Log.w("CloudMessage", sb.toString());
                return 0;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
