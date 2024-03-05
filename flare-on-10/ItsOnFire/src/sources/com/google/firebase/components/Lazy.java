package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;
/* loaded from: ItsOnFire.jar:com/google/firebase/components/Lazy.class */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }

    public Lazy(T t2) {
        this.instance = UNINITIALIZED;
        this.instance = t2;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        Object obj = this.instance;
        Object obj2 = UNINITIALIZED;
        T t2 = obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj3 = this.instance;
                t2 = obj3;
                if (obj3 == obj2) {
                    t2 = this.provider.get();
                    this.instance = t2;
                    this.provider = null;
                }
            }
        }
        return (T) t2;
    }

    @VisibleForTesting
    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }
}
