package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/zaaa.class */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int zab(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return i5;
                }
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown color scheme: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            return i4;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zaa(android.content.res.Resources r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zaaa.zaa(android.content.res.Resources, int, int):void");
    }
}
