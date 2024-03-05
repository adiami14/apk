package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0010\b\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0010\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H��¨\u0006\u0007"}, d2 = {"lowestBitOf", "", "bits", "", "binarySearch", "", "value", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/SnapshotIdSetKt.class */
public final class SnapshotIdSetKt {
    public static final int binarySearch(@NotNull int[] iArr, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i2 > i5) {
                i3 = i4 + 1;
            } else if (i2 >= i5) {
                return i4;
            } else {
                length = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lowestBitOf(long j2) {
        long j3;
        int i2 = 32;
        if ((4294967295L & j2) == 0) {
            j3 = j2 >> 32;
        } else {
            i2 = 0;
            j3 = j2;
        }
        int i3 = i2;
        long j4 = j3;
        if ((65535 & j3) == 0) {
            i3 = i2 + 16;
            j4 = j3 >> 16;
        }
        int i4 = i3;
        long j5 = j4;
        if ((255 & j4) == 0) {
            i4 = i3 + 8;
            j5 = j4 >> 8;
        }
        int i5 = i4;
        long j6 = j5;
        if ((15 & j5) == 0) {
            i5 = i4 + 4;
            j6 = j5 >> 4;
        }
        if ((1 & j6) != 0) {
            return i5;
        }
        if ((2 & j6) != 0) {
            return i5 + 1;
        }
        if ((4 & j6) != 0) {
            return i5 + 2;
        }
        if ((j6 & 8) != 0) {
            return i5 + 3;
        }
        return -1;
    }
}
