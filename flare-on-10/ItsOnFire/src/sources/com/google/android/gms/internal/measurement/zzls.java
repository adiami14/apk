package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzls.class */
final class zzls extends zzlw {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzls() {
        super(null);
    }

    public /* synthetic */ zzls(zzlr zzlrVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j2) {
        zzlq unmodifiableList;
        List list = (List) zznu.zzf(obj, j2);
        if (list instanceof zzlq) {
            unmodifiableList = ((zzlq) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzmp) && (list instanceof zzli)) {
                zzli zzliVar = (zzli) list;
                if (zzliVar.zzc()) {
                    zzliVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zznu.zzs(obj, j2, unmodifiableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    @Override // com.google.android.gms.internal.measurement.zzlw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.lang.Object r6, java.lang.Object r7, long r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzls.zzb(java.lang.Object, java.lang.Object, long):void");
    }
}
