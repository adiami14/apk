package androidx.core.util;

import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.io.PrintWriter;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/core/util/TimeUtils.class */
public final class TimeUtils {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i2, int i3, boolean z, int i4) {
        if (i2 > 99 || (z && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z && i4 >= 2)) {
            return i3 + 2;
        }
        if (z || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, long j3, PrintWriter printWriter) {
        if (j2 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j2 - j3, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, PrintWriter printWriter) {
        formatDuration(j2, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, PrintWriter printWriter, int i2) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j2, i2)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j2, 0));
        }
    }

    private static int formatDurationLocked(long j2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (sFormatStr.length < i2) {
            sFormatStr = new char[i2];
        }
        char[] cArr = sFormatStr;
        int i9 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i9 == 0) {
            while (i2 - 1 > 0) {
                cArr[0] = (char) 32;
            }
            cArr[0] = (char) 48;
            return 1;
        }
        if (i9 > 0) {
            i3 = 43;
        } else {
            i3 = 45;
            j2 = -j2;
        }
        int i10 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > SECONDS_PER_DAY) {
            i4 = floor / SECONDS_PER_DAY;
            floor -= SECONDS_PER_DAY * i4;
        } else {
            i4 = 0;
        }
        if (floor > SECONDS_PER_HOUR) {
            i5 = floor / SECONDS_PER_HOUR;
            floor -= i5 * SECONDS_PER_HOUR;
        } else {
            i5 = 0;
        }
        if (floor > 60) {
            i6 = floor / 60;
            i7 = floor - (i6 * 60);
        } else {
            i6 = 0;
            i7 = floor;
        }
        if (i2 != 0) {
            int accumField = accumField(i4, 1, false, 0);
            int accumField2 = accumField + accumField(i5, 1, accumField > 0, 2);
            int accumField3 = accumField2 + accumField(i6, 1, accumField2 > 0, 2);
            int accumField4 = accumField3 + accumField(i7, 1, accumField3 > 0, 2);
            int accumField5 = accumField4 + accumField(i10, 2, true, accumField4 > 0 ? 3 : 0) + 1;
            int i11 = 0;
            while (true) {
                i8 = i11;
                if (accumField5 >= i2) {
                    break;
                }
                cArr[i11] = (char) 32;
                i11++;
                accumField5++;
            }
        } else {
            i8 = 0;
        }
        cArr[i8] = (char) i3;
        int i12 = i8 + 1;
        boolean z = i2 != 0;
        int printField = printField(cArr, i4, 'd', i12, false, 0);
        int printField2 = printField(cArr, i5, 'h', printField, printField != i12, z ? 2 : 0);
        int printField3 = printField(cArr, i6, 'm', printField2, printField2 != i12, z ? 2 : 0);
        int printField4 = printField(cArr, i7, 's', printField3, printField3 != i12, z ? 2 : 0);
        int printField5 = printField(cArr, i10, 'm', printField4, true, (!z || printField4 == i12) ? 0 : 3);
        cArr[printField5] = (char) R.styleable.AppCompatTheme_tooltipFrameBackground;
        return printField5 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r8 != r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r6 > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int printField(char[] r5, int r6, char r7, int r8, boolean r9, int r10) {
        /*
            r0 = r9
            if (r0 != 0) goto Lc
            r0 = r8
            r11 = r0
            r0 = r6
            if (r0 <= 0) goto L95
        Lc:
            r0 = r9
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 3
            if (r0 >= r1) goto L1d
        L17:
            r0 = r6
            r1 = 99
            if (r0 <= r1) goto L3d
        L1d:
            r0 = r6
            r1 = 100
            int r0 = r0 / r1
            r12 = r0
            r0 = r5
            r1 = r8
            r2 = r12
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
            r0 = r6
            r1 = r12
            r2 = 100
            int r1 = r1 * r2
            int r0 = r0 - r1
            r6 = r0
            goto L40
        L3d:
            r0 = r8
            r11 = r0
        L40:
            r0 = r9
            if (r0 == 0) goto L4b
            r0 = r10
            r1 = 2
            if (r0 >= r1) goto L5e
        L4b:
            r0 = r6
            r1 = 9
            if (r0 > r1) goto L5e
            r0 = r11
            r12 = r0
            r0 = r6
            r10 = r0
            r0 = r8
            r1 = r11
            if (r0 == r1) goto L7b
        L5e:
            r0 = r6
            r1 = 10
            int r0 = r0 / r1
            r8 = r0
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = 10
            int r1 = r1 * r2
            int r0 = r0 - r1
            r10 = r0
        L7b:
            r0 = r5
            r1 = r12
            r2 = r10
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r12
            r1 = 1
            int r0 = r0 + r1
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
        L95:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.util.TimeUtils.printField(char[], int, char, int, boolean, int):int");
    }
}
