package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.messaging.Constants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/FirebaseMessagingService.class */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    public static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    public static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        } else {
            return true;
        }
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        Bundle bundle = extras;
        if (extras == null) {
            bundle = new Bundle();
        }
        bundle.remove("androidx.content.wakelockid");
        if (NotificationParams.isNotification(bundle)) {
            NotificationParams notificationParams = new NotificationParams(bundle);
            ExecutorService newNetworkIOExecutor = FcmExecutors.newNetworkIOExecutor();
            try {
                if (new DisplayNotification(this, notificationParams, newNetworkIOExecutor).handleNotification()) {
                    return;
                }
                if (MessagingAnalytics.shouldUploadScionMetrics(intent)) {
                    MessagingAnalytics.logNotificationForeground(intent);
                }
            } finally {
                newNetworkIOExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(bundle));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        String str = stringExtra;
        if (stringExtra == null) {
            str = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        return str;
    }

    private void handleMessageIntent(Intent intent) {
        if (alreadyReceivedMessage(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID))) {
            return;
        }
        passMessageIntentToSdk(intent);
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        String str = stringExtra;
        if (stringExtra == null) {
            str = Constants.MessageTypes.MESSAGE;
        }
        boolean z = true;
        switch (str.hashCode()) {
            case -2062414158:
                if (str.equals(Constants.MessageTypes.DELETED)) {
                    z = false;
                    break;
                }
                break;
            case 102161:
                if (str.equals(Constants.MessageTypes.MESSAGE)) {
                    z = true;
                    break;
                }
                break;
            case 814694033:
                if (str.equals(Constants.MessageTypes.SEND_ERROR)) {
                    z = true;
                    break;
                }
                break;
            case 814800675:
                if (str.equals(Constants.MessageTypes.SEND_EVENT)) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                onDeletedMessages();
                return;
            case true:
                MessagingAnalytics.logNotificationReceived(intent);
                dispatchMessage(intent);
                return;
            case true:
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR)));
                return;
            case true:
                onMessageSent(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + str);
                return;
        }
    }

    @VisibleForTesting
    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return ServiceStarter.getInstance().getMessagingEvent();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    @WorkerThread
    public void onDeletedMessages() {
    }

    @WorkerThread
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    @WorkerThread
    public void onMessageSent(@NonNull String str) {
    }

    @WorkerThread
    public void onNewToken(@NonNull String str) {
    }

    @WorkerThread
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }
}
