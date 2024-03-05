package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/cloudmessaging/zzb.class */
final class zzb implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzd createFromParcel(Parcel parcel) {
        return new zzd(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzd[] newArray(int i2) {
        return new zzd[i2];
    }
}
