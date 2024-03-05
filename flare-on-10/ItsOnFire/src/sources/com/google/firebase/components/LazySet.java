package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/firebase/components/LazySet.class */
public class LazySet<T> implements Provider<Set<T>> {
    private volatile Set<T> actualSet = null;
    private volatile Set<Provider<T>> providers = Collections.newSetFromMap(new ConcurrentHashMap());

    public LazySet(Collection<Provider<T>> collection) {
        this.providers.addAll(collection);
    }

    public static LazySet<?> fromCollection(Collection<Provider<?>> collection) {
        return new LazySet<>((Set) collection);
    }

    private void updateSet() {
        synchronized (this) {
            for (Provider<T> provider : this.providers) {
                this.actualSet.add(provider.get());
            }
            this.providers = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void add(Provider<T> provider) {
        Set set;
        synchronized (this) {
            if (this.actualSet == null) {
                set = (Set<Provider<T>>) this.providers;
            } else {
                set = this.actualSet;
                provider = provider.get();
            }
            set.add(provider);
        }
    }

    @Override // com.google.firebase.inject.Provider
    public Set<T> get() {
        if (this.actualSet == null) {
            synchronized (this) {
                if (this.actualSet == null) {
                    this.actualSet = Collections.newSetFromMap(new ConcurrentHashMap());
                    updateSet();
                }
            }
        }
        return Collections.unmodifiableSet(this.actualSet);
    }
}
