package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/HexDumpUtils.class */
public final class HexDumpUtils {
    @Nullable
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i2, int i3, boolean z) {
        int length;
        int i4;
        char c2;
        if (bArr == null || (length = bArr.length) == 0 || i2 < 0 || i3 <= 0 || i2 + i3 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder((z ? 75 : 57) * ((i3 + 15) / 16));
        int i5 = i3;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i5 <= 0) {
                return sb.toString();
            }
            if (i6 == 0) {
                sb.append(i3 < 65536 ? String.format("%04X:", Integer.valueOf(i2)) : String.format("%08X:", Integer.valueOf(i2)));
                i4 = i2;
            } else {
                i4 = i8;
                if (i6 == 8) {
                    sb.append(" -");
                    i4 = i8;
                }
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i2] & 255)));
            i5--;
            int i9 = i6 + 1;
            if (z && (i9 == 16 || i5 == 0)) {
                int i10 = 16 - i9;
                if (i10 > 0) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb.append("   ");
                    }
                }
                if (i10 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i12 = 0; i12 < i9; i12++) {
                    char c3 = (char) bArr[i4 + i12];
                    if (c3 >= ' ') {
                        c2 = c3;
                        if (c3 <= '~') {
                            sb.append(c2);
                        }
                    }
                    c2 = '.';
                    sb.append(c2);
                }
            }
            if (i9 != 16) {
                i6 = i9;
                if (i5 != 0) {
                    i2++;
                    i7 = i4;
                }
            }
            sb.append('\n');
            i6 = 0;
            i2++;
            i7 = i4;
        }
    }
}
