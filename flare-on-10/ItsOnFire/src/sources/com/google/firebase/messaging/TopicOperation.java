package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/TopicOperation.class */
final class TopicOperation {
    private static final String OLD_TOPIC_PREFIX = "/topics/";
    @VisibleForTesting
    public static final String OPERATION_PAIR_DIVIDER = "!";
    private static final String TOPIC_NAME_PATTERN = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final Pattern TOPIC_NAME_REGEXP = Pattern.compile(TOPIC_NAME_PATTERN);
    private final String operation;
    private final String serializedString;
    private final String topic;

    private TopicOperation(String str, String str2) {
        this.topic = normalizeTopicOrThrow(str2, str);
        this.operation = str;
        this.serializedString = str + OPERATION_PAIR_DIVIDER + str2;
    }

    @Nullable
    public static TopicOperation from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(OPERATION_PAIR_DIVIDER, -1);
        if (split.length != 2) {
            return null;
        }
        return new TopicOperation(split[0], split[1]);
    }

    @NonNull
    private static String normalizeTopicOrThrow(String str, String str2) {
        String str3 = str;
        if (str != null) {
            str3 = str;
            if (str.startsWith(OLD_TOPIC_PREFIX)) {
                Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
                str3 = str.substring(8);
            }
        }
        if (str3 == null || !TOPIC_NAME_REGEXP.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, TOPIC_NAME_PATTERN));
        }
        return str3;
    }

    public static TopicOperation subscribe(@NonNull String str) {
        return new TopicOperation("S", str);
    }

    public static TopicOperation unsubscribe(@NonNull String str) {
        return new TopicOperation("U", str);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TopicOperation) {
            TopicOperation topicOperation = (TopicOperation) obj;
            boolean z = false;
            if (this.topic.equals(topicOperation.topic)) {
                z = false;
                if (this.operation.equals(topicOperation.operation)) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return Objects.hashCode(this.operation, this.topic);
    }

    public String serialize() {
        return this.serializedString;
    }
}
