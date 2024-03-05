package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzq.class */
public final class zzq {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence] */
    public static final CharSequence zza(@CheckForNull Object obj, String str) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
