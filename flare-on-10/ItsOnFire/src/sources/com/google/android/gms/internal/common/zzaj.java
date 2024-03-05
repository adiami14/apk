package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzaj.class */
public abstract class zzaj implements Iterator {
    @Override // java.util.Iterator
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
