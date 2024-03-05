package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/CommonNotificationBuilder.class */
public final class CommonNotificationBuilder {
    private static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: ItsOnFire.jar:com/google/firebase/messaging/CommonNotificationBuilder$DisplayNotificationInfo.class */
    public static class DisplayNotificationInfo {
        public final int id;
        public final NotificationCompat.Builder notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(NotificationCompat.Builder builder, String str, int i2) {
            this.notificationBuilder = builder;
            this.tag = str;
            this.id = i2;
        }
    }

    private CommonNotificationBuilder() {
    }

    @Nullable
    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent createTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (createTargetIntent == null) {
            return null;
        }
        createTargetIntent.addFlags(67108864);
        createTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            createTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), createTargetIntent, getPendingIntentFlags(1073741824));
    }

    @Nullable
    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), getPendingIntentFlags(1073741824));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            builder.setContentTitle(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            builder.setContentText(possiblyLocalizedString2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(possiblyLocalizedString2));
        }
        builder.setSmallIcon(getSmallIcon(packageManager, resources, packageName, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle));
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            builder.setSound(sound);
        }
        builder.setContentIntent(createContentIntent(context, notificationParams, packageName, packageManager));
        PendingIntent createDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (createDeleteIntent != null) {
            builder.setDeleteIntent(createDeleteIntent);
        }
        Integer color = getColor(context2, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            builder.setColor(color.intValue());
        }
        builder.setAutoCancel(!notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        builder.setLocalOnly(notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY));
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            builder.setTicker(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            builder.setPriority(notificationPriority.intValue());
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            builder.setVisibility(visibility.intValue());
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            builder.setNumber(notificationCount.intValue());
        }
        Long l2 = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l2 != null) {
            builder.setShowWhen(true);
            builder.setWhen(l2.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            builder.setVibrate(vibrateTimings);
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            builder.setLights(lightSettings[0], lightSettings[1], lightSettings[2]);
        }
        builder.setDefaults(getConsolidatedDefaults(notificationParams));
        return new DisplayNotificationInfo(builder, getTag(notificationParams), 0);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i2 = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(context, i2));
            } catch (Resources.NotFoundException e3) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        boolean z2 = z;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            z2 = z | true;
        }
        boolean z3 = z2;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS)) {
            z3 = z2 | true;
        }
        return z3 ? 1 : 0;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    @VisibleForTesting
    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else if (notificationManager.getNotificationChannel(string2) != null) {
                return string2;
            } else {
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL, string, 3));
                return FCM_FALLBACK_NOTIFICATION_CHANNEL;
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i2) {
        return i2 | 67108864;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        if (isValidIcon(r6, r0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (isValidIcon(r6, r10) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getSmallIcon(android.content.pm.PackageManager r5, android.content.res.Resources r6, java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r0 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6d
            r0 = r6
            r1 = r8
            java.lang.String r2 = "drawable"
            r3 = r7
            int r0 = r0.getIdentifier(r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L23
            r0 = r6
            r1 = r10
            boolean r0 = isValidIcon(r0, r1)
            if (r0 == 0) goto L23
            r0 = r10
            return r0
        L23:
            r0 = r6
            r1 = r8
            java.lang.String r2 = "mipmap"
            r3 = r7
            int r0 = r0.getIdentifier(r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L3f
            r0 = r6
            r1 = r10
            boolean r0 = isValidIcon(r0, r1)
            if (r0 == 0) goto L3f
            r0 = r10
            return r0
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            java.lang.String r1 = "Icon resource "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r11
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r11
            java.lang.String r1 = " not found. Notification will use default icon."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = r11
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.w(r0, r1)
        L6d:
            r0 = r9
            java.lang.String r1 = "com.google.firebase.messaging.default_notification_icon"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L89
            r0 = r12
            r10 = r0
            r0 = r6
            r1 = r12
            boolean r0 = isValidIcon(r0, r1)
            if (r0 != 0) goto Lbd
        L89:
            r0 = r5
            r1 = r7
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L97
            int r0 = r0.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L97
            r10 = r0
            goto Lbd
        L97:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "Couldn't get own application info: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = r5
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.w(r0, r1)
            r0 = r12
            r10 = r0
        Lbd:
            r0 = r10
            if (r0 == 0) goto Lcf
            r0 = r10
            r12 = r0
            r0 = r6
            r1 = r10
            boolean r0 = isValidIcon(r0, r1)
            if (r0 != 0) goto Ld4
        Lcf:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r12 = r0
        Ld4:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.CommonNotificationBuilder.getSmallIcon(android.content.pm.PackageManager, android.content.res.Resources, java.lang.String, java.lang.String, android.os.Bundle):int");
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (TextUtils.isEmpty(string)) {
            return "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return string;
    }

    @TargetApi(26)
    private static boolean isValidIcon(Resources resources, int i2) {
        return true;
    }

    public static boolean shouldUploadMetrics(@NonNull NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }
}
