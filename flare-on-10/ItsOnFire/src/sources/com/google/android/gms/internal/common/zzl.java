package com.google.android.gms.internal.common;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/common/zzl.class */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c2) {
        this.zza = c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        char c2 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c2) {
        return c2 == this.zza;
    }
}
