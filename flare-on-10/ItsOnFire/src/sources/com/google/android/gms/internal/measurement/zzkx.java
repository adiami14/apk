package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzkx.class */
public class zzkx<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjj<MessageType, BuilderType> {
    public zzlb zza;
    private final zzlb zzb;

    public zzkx(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzbR()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzbD();
    }

    private static void zza(Object obj, Object obj2) {
        zzmq.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    /* renamed from: zzaA */
    public final zzkx zzav() {
        zzkx zzkxVar = (zzkx) this.zzb.zzl(5, null, null);
        zzkxVar.zza = zzaF();
        return zzkxVar;
    }

    public final zzkx zzaB(zzlb zzlbVar) {
        if (!this.zzb.equals(zzlbVar)) {
            if (!this.zza.zzbR()) {
                zzaI();
            }
            zza(this.zza, zzlbVar);
        }
        return this;
    }

    public final zzkx zzaC(byte[] bArr, int i2, int i3, zzkn zzknVar) throws zzll {
        if (!this.zza.zzbR()) {
            zzaI();
        }
        try {
            zzmq.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i3, new zzjn(zzknVar));
            return this;
        } catch (zzll e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException e4) {
            throw zzll.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r0 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType zzaD() {
        /*
            r5 = this;
            r0 = r5
            com.google.android.gms.internal.measurement.zzlb r0 = r0.zzaF()
            r6 = r0
            r0 = r6
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Object r0 = r0.zzl(r1, r2, r3)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L1b
            goto L4b
        L1b:
            r0 = r7
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.measurement.zzmq r0 = com.google.android.gms.internal.measurement.zzmq.zza()
            r1 = r6
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.measurement.zzmt r0 = r0.zzb(r1)
            r1 = r6
            boolean r0 = r0.zzk(r1)
            r8 = r0
            r0 = 1
            r1 = r8
            if (r0 == r1) goto L3b
            r0 = 0
            r9 = r0
            goto L3e
        L3b:
            r0 = r6
            r9 = r0
        L3e:
            r0 = r6
            r1 = 2
            r2 = r9
            r3 = 0
            java.lang.Object r0 = r0.zzl(r1, r2, r3)
            r0 = r8
            if (r0 == 0) goto L4d
        L4b:
            r0 = r6
            return r0
        L4d:
            com.google.android.gms.internal.measurement.zznj r0 = new com.google.android.gms.internal.measurement.zznj
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zzaD():com.google.android.gms.internal.measurement.zzlb");
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: zzaE */
    public MessageType zzaF() {
        if (this.zza.zzbR()) {
            this.zza.zzbM();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    public final void zzaH() {
        if (this.zza.zzbR()) {
            return;
        }
        zzaI();
    }

    public void zzaI() {
        zzlb zzbD = this.zzb.zzbD();
        zza(zzbD, this.zza);
        this.zza = zzbD;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzaw(byte[] bArr, int i2, int i3) throws zzll {
        zzaC(bArr, 0, i3, zzkn.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzax(byte[] bArr, int i2, int i3, zzkn zzknVar) throws zzll {
        zzaC(bArr, 0, i3, zzknVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmi zzbV() {
        throw null;
    }
}
