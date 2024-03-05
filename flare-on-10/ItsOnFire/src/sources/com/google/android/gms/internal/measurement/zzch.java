package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzch.class */
public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        zzbo.zzc(parcel);
        zze(readString, readString2, bundle, readLong);
        parcel2.writeNoException();
        return true;
    }
}
