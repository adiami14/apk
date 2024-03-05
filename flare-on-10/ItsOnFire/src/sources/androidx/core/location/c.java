package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import androidx.core.os.CancellationSignal;
/* loaded from: ItsOnFire.jar:androidx/core/location/c.class */
public final /* synthetic */ class c implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f65a;

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        this.f65a.cancel();
    }
}
