package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/zae.class */
final class zae extends zag {
    public final /* synthetic */ Intent zaa;
    public final /* synthetic */ Fragment zab;
    public final /* synthetic */ int zac;

    public zae(Intent intent, Fragment fragment, int i2) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i2;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
