package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/zaz.class */
public final class zaz extends RemoteCreator<zam> {
    private static final zaz zaa = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i2, int i3) throws RemoteCreator.RemoteCreatorException {
        zaz zazVar = zaa;
        try {
            zax zaxVar = new zax(1, i2, i3, null);
            return (View) ObjectWrapper.unwrap(zazVar.getRemoteCreatorInstance(context).zae(ObjectWrapper.wrap(context), zaxVar));
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i2);
            sb.append(" and color ");
            sb.append(i3);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ zam getRemoteCreator(IBinder iBinder) {
        zam zamVar;
        if (iBinder == null) {
            zamVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            zamVar = queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
        }
        return zamVar;
    }
}
