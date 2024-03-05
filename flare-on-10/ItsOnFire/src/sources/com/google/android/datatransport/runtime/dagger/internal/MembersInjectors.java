package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.MembersInjector;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/dagger/internal/MembersInjectors.class */
public final class MembersInjectors {

    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/dagger/internal/MembersInjectors$NoOpMembersInjector.class */
    public enum NoOpMembersInjector implements MembersInjector<Object> {
        INSTANCE;

        @Override // com.google.android.datatransport.runtime.dagger.MembersInjector
        public void injectMembers(Object obj) {
            Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }

    public static <T> MembersInjector<T> noOp() {
        return NoOpMembersInjector.INSTANCE;
    }
}
