package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
/* loaded from: ItsOnFire.jar:com/google/firebase/installations/StateListener.class */
interface StateListener {
    boolean onException(Exception exc);

    boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry);
}
