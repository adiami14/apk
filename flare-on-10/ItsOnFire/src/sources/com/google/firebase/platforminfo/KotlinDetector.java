package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import kotlin.KotlinVersion;
/* loaded from: ItsOnFire.jar:com/google/firebase/platforminfo/KotlinDetector.class */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError e2) {
            return null;
        }
    }
}
