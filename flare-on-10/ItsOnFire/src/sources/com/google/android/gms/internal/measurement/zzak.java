package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzak.class */
final class zzak implements Iterator {
    public final /* synthetic */ Iterator zza;

    public zzak(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.zza.next());
    }
}
