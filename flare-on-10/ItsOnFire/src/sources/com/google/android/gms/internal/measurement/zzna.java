package com.google.android.gms.internal.measurement;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzna.class */
public final class zzna implements Map.Entry, Comparable {
    public final /* synthetic */ zzng zza;
    private final Comparable zzb;
    private Object zzc;

    public zzna(zzng zzngVar, Comparable comparable, Object obj) {
        this.zza = zzngVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            equals = false;
        }
        return equals;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzna) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzb;
        int i2 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode ^ i2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        return valueOf + "=" + valueOf2;
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
