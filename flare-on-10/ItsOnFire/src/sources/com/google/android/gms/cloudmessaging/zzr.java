package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
/* loaded from: ItsOnFire.jar:com/google/android/gms/cloudmessaging/zzr.class */
final class zzr extends zzp<Bundle> {
    public zzr(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Bundle bundle3 = bundle2;
        if (bundle2 == null) {
            bundle3 = Bundle.EMPTY;
        }
        zzd(bundle3);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final boolean zzb() {
        return false;
    }
}
