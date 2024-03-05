package androidx.core.os;

import android.os.Parcel;
@Deprecated
/* loaded from: ItsOnFire.jar:androidx/core/os/ParcelableCompatCreatorCallbacks.class */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i2);
}
