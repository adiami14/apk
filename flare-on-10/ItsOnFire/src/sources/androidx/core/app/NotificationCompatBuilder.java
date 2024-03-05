package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/core/app/NotificationCompatBuilder.class */
public class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private final Bundle mExtras = new Bundle();

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        int i2;
        this.mBuilderCompat = builder;
        this.mContext = builder.mContext;
        Notification.Builder builder2 = new Notification.Builder(builder.mContext, builder.mChannelId);
        this.mBuilder = builder2;
        Notification notification = builder.mNotification;
        builder2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        builder2.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
        while (it.hasNext()) {
            addAction(it.next());
        }
        Bundle bundle = builder.mExtras;
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = builder.mPeople;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String str : arrayList) {
                this.mBuilder.addPerson(str);
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER);
            Bundle bundle3 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i3 = 0; i3 < builder.mInvisibleActions.size(); i3++) {
                bundle5.putBundle(Integer.toString(i3), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i3)));
            }
            bundle3.putBundle(NotificationCompat.CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle5);
            bundle4.putBundle(NotificationCompat.CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle5);
            builder.getExtras().putBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER, bundle3);
            this.mExtras.putBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER, bundle4);
        }
        Icon icon = builder.mSmallIcon;
        if (icon != null) {
            this.mBuilder.setSmallIcon(icon);
        }
        this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
        RemoteViews remoteViews = builder.mContentView;
        if (remoteViews != null) {
            this.mBuilder.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = builder.mBigContentView;
        if (remoteViews2 != null) {
            this.mBuilder.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = builder.mHeadsUpContentView;
        if (remoteViews3 != null) {
            this.mBuilder.setCustomHeadsUpContentView(remoteViews3);
        }
        this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setSettingsText(builder.mSettingsText).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
        if (builder.mColorizedSet) {
            this.mBuilder.setColorized(builder.mColorized);
        }
        if (!TextUtils.isEmpty(builder.mChannelId)) {
            this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<Person> it2 = builder.mPersonList.iterator();
        while (it2.hasNext()) {
            this.mBuilder.addPerson(it2.next().toAndroidPerson());
        }
        int i4 = Build.VERSION.SDK_INT;
        this.mBuilder.setAllowSystemGeneratedContextualActions(builder.mAllowSystemGeneratedContextualActions);
        this.mBuilder.setBubbleMetadata(NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
        LocusIdCompat locusIdCompat = builder.mLocusId;
        if (locusIdCompat != null) {
            this.mBuilder.setLocusId(locusIdCompat.toLocusId());
        }
        if (i4 >= 31 && (i2 = builder.mFgsDeferBehavior) != 0) {
            this.mBuilder.setForegroundServiceBehavior(i2);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            int i5 = notification.defaults & (-2) & (-3);
            notification.defaults = i5;
            this.mBuilder.setDefaults(i5);
            if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                this.mBuilder.setGroup(NotificationCompat.GROUP_KEY_SILENT);
            }
            this.mBuilder.setGroupAlertBehavior(this.mGroupAlertBehavior);
        }
    }

    private void addAction(NotificationCompat.Action action) {
        IconCompat iconCompat = action.getIconCompat();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
        bundle.putBoolean(NotificationCompatJellybean.EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        int i2 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
        bundle.putInt(NotificationCompat.Action.EXTRA_SEMANTIC_ACTION, action.getSemanticAction());
        builder.setSemanticAction(action.getSemanticAction());
        builder.setContextual(action.isContextual());
        if (i2 >= 31) {
            builder.setAuthenticationRequired(action.isAuthenticationRequired());
        }
        bundle.putBoolean(NotificationCompat.Action.EXTRA_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        builder.addExtras(bundle);
        this.mBuilder.addAction(builder.build());
    }

    @Nullable
    private static List<String> combineLists(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    @Nullable
    private static List<String> getPeople(@Nullable List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person person : list) {
            arrayList.add(person.resolveToLegacyUri());
        }
        return arrayList;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r5 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification build() {
        /*
            r3 = this;
            r0 = r3
            androidx.core.app.NotificationCompat$Builder r0 = r0.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L11
            r0 = r4
            r1 = r3
            r0.apply(r1)
        L11:
            r0 = r4
            if (r0 == 0) goto L1e
            r0 = r4
            r1 = r3
            android.widget.RemoteViews r0 = r0.makeContentView(r1)
            r5 = r0
            goto L20
        L1e:
            r0 = 0
            r5 = r0
        L20:
            r0 = r3
            android.app.Notification r0 = r0.buildInternal()
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L31
        L29:
            r0 = r6
            r1 = r5
            r0.contentView = r1
            goto L40
        L31:
            r0 = r3
            androidx.core.app.NotificationCompat$Builder r0 = r0.mBuilderCompat
            android.widget.RemoteViews r0 = r0.mContentView
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L40
            goto L29
        L40:
            r0 = r4
            if (r0 == 0) goto L53
            r0 = r4
            r1 = r3
            android.widget.RemoteViews r0 = r0.makeBigContentView(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L53
            r0 = r6
            r1 = r5
            r0.bigContentView = r1
        L53:
            r0 = r4
            if (r0 == 0) goto L6c
            r0 = r3
            androidx.core.app.NotificationCompat$Builder r0 = r0.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            r1 = r3
            android.widget.RemoteViews r0 = r0.makeHeadsUpContentView(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L6c
            r0 = r6
            r1 = r5
            r0.headsUpContentView = r1
        L6c:
            r0 = r4
            if (r0 == 0) goto L7e
            r0 = r6
            android.os.Bundle r0 = androidx.core.app.NotificationCompat.getExtras(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7e
            r0 = r4
            r1 = r5
            r0.addCompatExtras(r1)
        L7e:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompatBuilder.build():android.app.Notification");
    }

    public Notification buildInternal() {
        return this.mBuilder.build();
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    public Context getContext() {
        return this.mContext;
    }
}
