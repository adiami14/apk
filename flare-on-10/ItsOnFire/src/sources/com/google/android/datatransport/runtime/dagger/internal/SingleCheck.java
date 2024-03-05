package com.google.android.datatransport.runtime.dagger.internal;

import h.c;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/dagger/internal/SingleCheck.class */
public final class SingleCheck<T> implements c<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile c<T> provider;

    private SingleCheck(c<T> cVar) {
        this.provider = cVar;
    }

    public static <P extends c<T>, T> c<T> provider(P p2) {
        return ((p2 instanceof SingleCheck) || (p2 instanceof DoubleCheck)) ? p2 : new SingleCheck((c) Preconditions.checkNotNull(p2));
    }

    @Override // h.c
    public T get() {
        Object obj = this.instance;
        T t2 = obj;
        if (obj == UNINITIALIZED) {
            c<T> cVar = this.provider;
            if (cVar == null) {
                t2 = this.instance;
            } else {
                t2 = cVar.get();
                this.instance = t2;
                this.provider = null;
            }
        }
        return (T) t2;
    }
}
