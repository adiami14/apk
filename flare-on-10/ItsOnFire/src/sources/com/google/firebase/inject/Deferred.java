package com.google.firebase.inject;

import androidx.annotation.NonNull;
import com.google.firebase.annotations.DeferredApi;
/* loaded from: ItsOnFire.jar:com/google/firebase/inject/Deferred.class */
public interface Deferred<T> {

    /* loaded from: ItsOnFire.jar:com/google/firebase/inject/Deferred$DeferredHandler.class */
    public interface DeferredHandler<T> {
        @DeferredApi
        void handle(Provider<T> provider);
    }

    void whenAvailable(@NonNull DeferredHandler<T> deferredHandler);
}
