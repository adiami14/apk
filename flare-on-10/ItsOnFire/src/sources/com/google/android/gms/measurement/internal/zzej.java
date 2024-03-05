package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/measurement/internal/zzej.class */
public interface zzej extends IInterface {
    @Nullable
    String zzd(zzq zzqVar) throws RemoteException;

    @Nullable
    List zze(zzq zzqVar, boolean z) throws RemoteException;

    List zzf(@Nullable String str, @Nullable String str2, zzq zzqVar) throws RemoteException;

    List zzg(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    List zzh(@Nullable String str, @Nullable String str2, boolean z, zzq zzqVar) throws RemoteException;

    List zzi(String str, @Nullable String str2, @Nullable String str3, boolean z) throws RemoteException;

    void zzj(zzq zzqVar) throws RemoteException;

    void zzk(zzau zzauVar, zzq zzqVar) throws RemoteException;

    void zzl(zzau zzauVar, String str, @Nullable String str2) throws RemoteException;

    void zzm(zzq zzqVar) throws RemoteException;

    void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException;

    void zzo(zzac zzacVar) throws RemoteException;

    void zzp(zzq zzqVar) throws RemoteException;

    void zzq(long j2, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    void zzr(Bundle bundle, zzq zzqVar) throws RemoteException;

    void zzs(zzq zzqVar) throws RemoteException;

    void zzt(zzlk zzlkVar, zzq zzqVar) throws RemoteException;

    @Nullable
    byte[] zzu(zzau zzauVar, String str) throws RemoteException;
}
