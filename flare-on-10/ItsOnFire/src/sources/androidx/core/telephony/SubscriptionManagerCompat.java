package androidx.core.telephony;

import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
@RequiresApi(22)
/* loaded from: ItsOnFire.jar:androidx/core/telephony/SubscriptionManagerCompat.class */
public class SubscriptionManagerCompat {
    private static Method sGetSlotIndexMethod;

    @RequiresApi(29)
    /* loaded from: ItsOnFire.jar:androidx/core/telephony/SubscriptionManagerCompat$Api29Impl.class */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static int getSlotIndex(int i2) {
            return SubscriptionManager.getSlotIndex(i2);
        }
    }

    private SubscriptionManagerCompat() {
    }

    public static int getSlotIndex(int i2) {
        if (i2 == -1) {
            return -1;
        }
        return Api29Impl.getSlotIndex(i2);
    }
}
