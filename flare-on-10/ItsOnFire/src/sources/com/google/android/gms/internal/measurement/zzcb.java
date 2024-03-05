package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzcb.class */
public abstract class zzcb extends zzbn implements zzcc {
    public zzcb() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof zzcc ? (zzcc) queryLocalInterface : new zzca(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzcd zzcdVar;
        zzcd zzcdVar2;
        zzcd zzcdVar3;
        zzcd zzcdVar4;
        zzcd zzcdVar5;
        zzcj zzcjVar;
        zzcd zzcdVar6;
        zzcd zzcdVar7;
        zzcd zzcdVar8;
        zzcd zzcdVar9;
        zzcd zzcdVar10;
        zzcd zzcdVar11;
        zzcg zzcgVar;
        zzcg zzcgVar2;
        zzcg zzcgVar3;
        zzcd zzcdVar12;
        zzcd zzcdVar13;
        zzcd zzcdVar14;
        zzcd zzcdVar15 = null;
        switch (i2) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) zzbo.zza(parcel, zzcl.CREATOR);
                long readLong = parcel.readLong();
                zzbo.zzc(parcel);
                initialize(asInterface, zzclVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                boolean zzf = zzbo.zzf(parcel);
                boolean zzf2 = zzbo.zzf(parcel);
                long readLong2 = parcel.readLong();
                zzbo.zzc(parcel);
                logEvent(readString, readString2, bundle, zzf, zzf2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar15 = queryLocalInterface instanceof zzcf ? (zzcf) queryLocalInterface : new zzcd(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                zzbo.zzc(parcel);
                logEventAndBundle(readString3, readString4, bundle2, zzcdVar15, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzf3 = zzbo.zzf(parcel);
                long readLong4 = parcel.readLong();
                zzbo.zzc(parcel);
                setUserProperty(readString5, readString6, asInterface2, zzf3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzf4 = zzbo.zzf(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzcdVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcd(readStrongBinder2);
                }
                zzbo.zzc(parcel);
                getUserProperties(readString7, readString8, zzf4, zzcdVar);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzcdVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar2 = queryLocalInterface3 instanceof zzcf ? (zzcf) queryLocalInterface3 : new zzcd(readStrongBinder3);
                }
                zzbo.zzc(parcel);
                getMaxUserProperties(readString9, zzcdVar2);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                zzbo.zzc(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                zzbo.zzc(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                zzbo.zzc(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzbo.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    zzcdVar3 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar3 = queryLocalInterface4 instanceof zzcf ? (zzcf) queryLocalInterface4 : new zzcd(readStrongBinder4);
                }
                zzbo.zzc(parcel);
                getConditionalUserProperties(readString11, readString12, zzcdVar3);
                break;
            case 11:
                boolean zzf5 = zzbo.zzf(parcel);
                long readLong7 = parcel.readLong();
                zzbo.zzc(parcel);
                setMeasurementEnabled(zzf5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                zzbo.zzc(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                zzbo.zzc(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                zzbo.zzc(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                long readLong11 = parcel.readLong();
                zzbo.zzc(parcel);
                setCurrentScreen(asInterface3, readString13, readString14, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    zzcdVar4 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar4 = queryLocalInterface5 instanceof zzcf ? (zzcf) queryLocalInterface5 : new zzcd(readStrongBinder5);
                }
                zzbo.zzc(parcel);
                getCurrentScreenName(zzcdVar4);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    zzcdVar5 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar5 = queryLocalInterface6 instanceof zzcf ? (zzcf) queryLocalInterface6 : new zzcd(readStrongBinder6);
                }
                zzbo.zzc(parcel);
                getCurrentScreenClass(zzcdVar5);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    zzcjVar = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzcjVar = queryLocalInterface7 instanceof zzck ? (zzck) queryLocalInterface7 : new zzcj(readStrongBinder7);
                }
                zzbo.zzc(parcel);
                setInstanceIdProvider(zzcjVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    zzcdVar6 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar6 = queryLocalInterface8 instanceof zzcf ? (zzcf) queryLocalInterface8 : new zzcd(readStrongBinder8);
                }
                zzbo.zzc(parcel);
                getCachedAppInstanceId(zzcdVar6);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    zzcdVar7 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar7 = queryLocalInterface9 instanceof zzcf ? (zzcf) queryLocalInterface9 : new zzcd(readStrongBinder9);
                }
                zzbo.zzc(parcel);
                getAppInstanceId(zzcdVar7);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    zzcdVar8 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar8 = queryLocalInterface10 instanceof zzcf ? (zzcf) queryLocalInterface10 : new zzcd(readStrongBinder10);
                }
                zzbo.zzc(parcel);
                getGmpAppId(zzcdVar8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    zzcdVar9 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar9 = queryLocalInterface11 instanceof zzcf ? (zzcf) queryLocalInterface11 : new zzcd(readStrongBinder11);
                }
                zzbo.zzc(parcel);
                generateEventId(zzcdVar9);
                break;
            case 23:
                String readString15 = parcel.readString();
                long readLong12 = parcel.readLong();
                zzbo.zzc(parcel);
                beginAdUnitExposure(readString15, readLong12);
                break;
            case 24:
                String readString16 = parcel.readString();
                long readLong13 = parcel.readLong();
                zzbo.zzc(parcel);
                endAdUnitExposure(readString16, readLong13);
                break;
            case 25:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityStarted(asInterface4, readLong14);
                break;
            case 26:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityStopped(asInterface5, readLong15);
                break;
            case 27:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle4 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityCreated(asInterface6, bundle4, readLong16);
                break;
            case 28:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityDestroyed(asInterface7, readLong17);
                break;
            case 29:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityPaused(asInterface8, readLong18);
                break;
            case 30:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityResumed(asInterface9, readLong19);
                break;
            case 31:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 == null) {
                    zzcdVar10 = null;
                } else {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar10 = queryLocalInterface12 instanceof zzcf ? (zzcf) queryLocalInterface12 : new zzcd(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivitySaveInstanceState(asInterface10, zzcdVar10, readLong20);
                break;
            case 32:
                Bundle bundle5 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 == null) {
                    zzcdVar11 = null;
                } else {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar11 = queryLocalInterface13 instanceof zzcf ? (zzcf) queryLocalInterface13 : new zzcd(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                zzbo.zzc(parcel);
                performAction(bundle5, zzcdVar11, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString17 = parcel.readString();
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbo.zzc(parcel);
                logHealthData(readInt, readString17, asInterface11, asInterface12, asInterface13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 == null) {
                    zzcgVar = null;
                } else {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar = queryLocalInterface14 instanceof zzci ? (zzci) queryLocalInterface14 : new zzcg(readStrongBinder14);
                }
                zzbo.zzc(parcel);
                setEventInterceptor(zzcgVar);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 == null) {
                    zzcgVar2 = null;
                } else {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar2 = queryLocalInterface15 instanceof zzci ? (zzci) queryLocalInterface15 : new zzcg(readStrongBinder15);
                }
                zzbo.zzc(parcel);
                registerOnMeasurementEventListener(zzcgVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 == null) {
                    zzcgVar3 = null;
                } else {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar3 = queryLocalInterface16 instanceof zzci ? (zzci) queryLocalInterface16 : new zzcg(readStrongBinder16);
                }
                zzbo.zzc(parcel);
                unregisterOnMeasurementEventListener(zzcgVar3);
                break;
            case 37:
                HashMap zzb = zzbo.zzb(parcel);
                zzbo.zzc(parcel);
                initForTests(zzb);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 == null) {
                    zzcdVar12 = null;
                } else {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar12 = queryLocalInterface17 instanceof zzcf ? (zzcf) queryLocalInterface17 : new zzcd(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                zzbo.zzc(parcel);
                getTestFlag(zzcdVar12, readInt2);
                break;
            case 39:
                boolean zzf6 = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                setDataCollectionEnabled(zzf6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 == null) {
                    zzcdVar13 = null;
                } else {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar13 = queryLocalInterface18 instanceof zzcf ? (zzcf) queryLocalInterface18 : new zzcd(readStrongBinder18);
                }
                zzbo.zzc(parcel);
                isDataCollectionEnabled(zzcdVar13);
                break;
            case 41:
            default:
                return false;
            case 42:
                zzbo.zzc(parcel);
                setDefaultEventParameters((Bundle) zzbo.zza(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                zzbo.zzc(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle6 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                zzbo.zzc(parcel);
                setConsent(bundle6, readLong23);
                break;
            case 45:
                Bundle bundle7 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                zzbo.zzc(parcel);
                setConsentThirdParty(bundle7, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 == null) {
                    zzcdVar14 = null;
                } else {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar14 = queryLocalInterface19 instanceof zzcf ? (zzcf) queryLocalInterface19 : new zzcd(readStrongBinder19);
                }
                zzbo.zzc(parcel);
                getSessionId(zzcdVar14);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
