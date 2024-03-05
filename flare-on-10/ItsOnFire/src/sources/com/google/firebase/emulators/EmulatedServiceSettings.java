package com.google.firebase.emulators;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/firebase/emulators/EmulatedServiceSettings.class */
public final class EmulatedServiceSettings {
    private final String host;
    private final int port;

    public EmulatedServiceSettings(@NonNull String str, int i2) {
        this.host = str;
        this.port = i2;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }
}
