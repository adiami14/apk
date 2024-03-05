package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/data/DataBufferObserver.class */
public interface DataBufferObserver {

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/data/DataBufferObserver$Observable.class */
    public interface Observable {
        void addObserver(@NonNull DataBufferObserver dataBufferObserver);

        void removeObserver(@NonNull DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i2, int i3);

    void onDataRangeInserted(int i2, int i3);

    void onDataRangeMoved(int i2, int i3, int i4);

    void onDataRangeRemoved(int i2, int i3);
}