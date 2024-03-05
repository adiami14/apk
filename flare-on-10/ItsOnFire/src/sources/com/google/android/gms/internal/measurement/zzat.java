package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzat.class */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        return "\"" + str + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        throw new RuntimeException("d2j fail translate: java.lang.RuntimeException\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.mergeProviderType(TypeTransformer.java:613)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.mergeTypeToSubRef(TypeTransformer.java:457)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:560)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:392)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:369)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:45)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:165)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:449)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:41)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:132)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:582)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:441)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:457)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:126)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:275)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:107)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:290)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:33)\n");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        double d2;
        if (this.zza.isEmpty()) {
            d2 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.zza);
            } catch (NumberFormatException e2) {
                d2 = Double.NaN;
            }
        }
        return Double.valueOf(d2);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
