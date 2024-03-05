package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/IGmsServiceBroker.class */
public interface IGmsServiceBroker extends IInterface {

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/IGmsServiceBroker$Stub.class */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0150, code lost:
            if (r8.readInt() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0180, code lost:
            if (r8.readInt() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x019c, code lost:
            if (r8.readInt() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
            if (r8.readInt() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01bf, code lost:
            if (r8.readInt() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01c2, code lost:
            r0 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r8);
         */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onTransact(int r7, @androidx.annotation.NonNull android.os.Parcel r8, @androidx.annotation.Nullable android.os.Parcel r9, int r10) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 471
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.IGmsServiceBroker.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    @KeepForSdk
    void getService(@NonNull IGmsCallbacks iGmsCallbacks, @Nullable GetServiceRequest getServiceRequest) throws RemoteException;
}
