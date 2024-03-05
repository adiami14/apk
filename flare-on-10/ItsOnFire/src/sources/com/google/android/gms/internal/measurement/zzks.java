package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzks.class */
final class zzks {
    private static final zzks zzb = new zzks(true);
    public final zzng zza = new zzmw(16);
    private boolean zzc;
    private boolean zzd;

    private zzks() {
    }

    private zzks(boolean z) {
        zzb();
        zzb();
    }

    public static zzks zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzd(com.google.android.gms.internal.measurement.zzkr r8, java.lang.Object r9) {
        /*
            r0 = r8
            com.google.android.gms.internal.measurement.zzoa r0 = r0.zzb()
            r10 = r0
            byte[] r0 = com.google.android.gms.internal.measurement.zzlj.zzd
            r11 = r0
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            com.google.android.gms.internal.measurement.zzoa r0 = com.google.android.gms.internal.measurement.zzoa.zza
            r11 = r0
            com.google.android.gms.internal.measurement.zzob r0 = com.google.android.gms.internal.measurement.zzob.INT
            r11 = r0
            r0 = r10
            com.google.android.gms.internal.measurement.zzob r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto Lb3;
                case 1: goto Laa;
                case 2: goto La1;
                case 3: goto L98;
                case 4: goto L8f;
                case 5: goto L86;
                case 6: goto L75;
                case 7: goto L64;
                case 8: goto L53;
                default: goto L50;
            }
        L50:
            goto Lbf
        L53:
            r0 = r9
            boolean r0 = r0 instanceof com.google.android.gms.internal.measurement.zzmi
            if (r0 != 0) goto Lbe
            r0 = r9
            boolean r0 = r0 instanceof com.google.android.gms.internal.measurement.zzln
            if (r0 == 0) goto Lbf
            goto Lbe
        L64:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto Lbe
            r0 = r9
            boolean r0 = r0 instanceof com.google.android.gms.internal.measurement.zzld
            if (r0 == 0) goto Lbf
            goto Lbe
        L75:
            r0 = r9
            boolean r0 = r0 instanceof com.google.android.gms.internal.measurement.zzka
            if (r0 != 0) goto Lbe
            r0 = r9
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto Lbf
            goto Lbe
        L86:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            r12 = r0
            goto Lb9
        L8f:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Boolean
            r12 = r0
            goto Lb9
        L98:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Double
            r12 = r0
            goto Lb9
        La1:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Float
            r12 = r0
            goto Lb9
        Laa:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Long
            r12 = r0
            goto Lb9
        Lb3:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            r12 = r0
        Lb9:
            r0 = r12
            if (r0 == 0) goto Lbf
        Lbe:
            return
        Lbf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            int r6 = r6.zza()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            com.google.android.gms.internal.measurement.zzoa r6 = r6.zzb()
            com.google.android.gms.internal.measurement.zzob r6 = r6.zza()
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r9
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzks.zzd(com.google.android.gms.internal.measurement.zzkr, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzks zzksVar = new zzks();
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry zzg = this.zza.zzg(i2);
            zzksVar.zzc((zzkr) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzksVar.zzc((zzkr) entry.getKey(), entry.getValue());
        }
        zzksVar.zzd = this.zzd;
        return zzksVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzks) {
            return this.zza.equals(((zzks) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry zzg = this.zza.zzg(i2);
            if (zzg.getValue() instanceof zzlb) {
                ((zzlb) zzg.getValue()).zzbM();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzkr zzkrVar, Object obj) {
        if (!zzkrVar.zzc()) {
            zzd(zzkrVar, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzd(zzkrVar, arrayList.get(i2));
            }
            obj = arrayList;
        }
        if (obj instanceof zzln) {
            this.zzd = true;
        }
        this.zza.put(zzkrVar, obj);
    }
}
