package kotlin.collections;

import androidx.appcompat.R;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��0\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\t\u0010\n\u001a*\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\f\u0010\r\u001a*\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001��¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001��¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001��¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001��¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001��¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/collections/UArraySortingKt.class */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4  reason: not valid java name */
    private static final int m6322partitionnroSd4(long[] jArr, int i2, int i3) {
        int i4;
        long m6084getsVKNKU = ULongArray.m6084getsVKNKU(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            int i5 = i2;
            while (true) {
                i4 = i3;
                if (UnsignedKt.ulongCompare(ULongArray.m6084getsVKNKU(jArr, i5), m6084getsVKNKU) >= 0) {
                    break;
                }
                i5++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m6084getsVKNKU(jArr, i4), m6084getsVKNKU) > 0) {
                i4--;
            }
            i2 = i5;
            i3 = i4;
            if (i5 <= i4) {
                long m6084getsVKNKU2 = ULongArray.m6084getsVKNKU(jArr, i5);
                ULongArray.m6089setk8EXiF4(jArr, i5, ULongArray.m6084getsVKNKU(jArr, i4));
                ULongArray.m6089setk8EXiF4(jArr, i4, m6084getsVKNKU2);
                i2 = i5 + 1;
                i3 = i4 - 1;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c  reason: not valid java name */
    private static final int m6323partition4UcCI2c(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte m5926getw2LRezQ = UByteArray.m5926getw2LRezQ(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            int i6 = i2;
            while (true) {
                i4 = m5926getw2LRezQ & 255;
                i5 = i3;
                if (Intrinsics.compare(UByteArray.m5926getw2LRezQ(bArr, i6) & 255, i4) >= 0) {
                    break;
                }
                i6++;
            }
            while (Intrinsics.compare(UByteArray.m5926getw2LRezQ(bArr, i5) & 255, i4) > 0) {
                i5--;
            }
            i2 = i6;
            i3 = i5;
            if (i6 <= i5) {
                byte m5926getw2LRezQ2 = UByteArray.m5926getw2LRezQ(bArr, i6);
                UByteArray.m5931setVurrAj0(bArr, i6, UByteArray.m5926getw2LRezQ(bArr, i5));
                UByteArray.m5931setVurrAj0(bArr, i5, m5926getw2LRezQ2);
                i2 = i6 + 1;
                i3 = i5 - 1;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o  reason: not valid java name */
    private static final int m6324partitionAa5vz7o(short[] sArr, int i2, int i3) {
        int i4;
        int i5;
        short m6190getMh2AYeg = UShortArray.m6190getMh2AYeg(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            int i6 = i2;
            while (true) {
                i4 = m6190getMh2AYeg & 65535;
                i5 = i3;
                if (Intrinsics.compare(UShortArray.m6190getMh2AYeg(sArr, i6) & 65535, i4) >= 0) {
                    break;
                }
                i6++;
            }
            while (Intrinsics.compare(UShortArray.m6190getMh2AYeg(sArr, i5) & 65535, i4) > 0) {
                i5--;
            }
            i2 = i6;
            i3 = i5;
            if (i6 <= i5) {
                short m6190getMh2AYeg2 = UShortArray.m6190getMh2AYeg(sArr, i6);
                UShortArray.m6195set01HTLdE(sArr, i6, UShortArray.m6190getMh2AYeg(sArr, i5));
                UShortArray.m6195set01HTLdE(sArr, i5, m6190getMh2AYeg2);
                i2 = i6 + 1;
                i3 = i5 - 1;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg  reason: not valid java name */
    private static final int m6325partitionoBK06Vg(int[] iArr, int i2, int i3) {
        int i4;
        int m6005getpVg5ArA = UIntArray.m6005getpVg5ArA(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            int i5 = i2;
            while (true) {
                i4 = i3;
                if (UnsignedKt.uintCompare(UIntArray.m6005getpVg5ArA(iArr, i5), m6005getpVg5ArA) >= 0) {
                    break;
                }
                i5++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m6005getpVg5ArA(iArr, i4), m6005getpVg5ArA) > 0) {
                i4--;
            }
            i2 = i5;
            i3 = i4;
            if (i5 <= i4) {
                int m6005getpVg5ArA2 = UIntArray.m6005getpVg5ArA(iArr, i5);
                UIntArray.m6010setVXSXFK8(iArr, i5, UIntArray.m6005getpVg5ArA(iArr, i4));
                UIntArray.m6010setVXSXFK8(iArr, i4, m6005getpVg5ArA2);
                i2 = i5 + 1;
                i3 = i4 - 1;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4  reason: not valid java name */
    private static final void m6326quickSortnroSd4(long[] jArr, int i2, int i3) {
        int m6322partitionnroSd4 = m6322partitionnroSd4(jArr, i2, i3);
        int i4 = m6322partitionnroSd4 - 1;
        if (i2 < i4) {
            m6326quickSortnroSd4(jArr, i2, i4);
        }
        if (m6322partitionnroSd4 < i3) {
            m6326quickSortnroSd4(jArr, m6322partitionnroSd4, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c  reason: not valid java name */
    private static final void m6327quickSort4UcCI2c(byte[] bArr, int i2, int i3) {
        int m6323partition4UcCI2c = m6323partition4UcCI2c(bArr, i2, i3);
        int i4 = m6323partition4UcCI2c - 1;
        if (i2 < i4) {
            m6327quickSort4UcCI2c(bArr, i2, i4);
        }
        if (m6323partition4UcCI2c < i3) {
            m6327quickSort4UcCI2c(bArr, m6323partition4UcCI2c, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o  reason: not valid java name */
    private static final void m6328quickSortAa5vz7o(short[] sArr, int i2, int i3) {
        int m6324partitionAa5vz7o = m6324partitionAa5vz7o(sArr, i2, i3);
        int i4 = m6324partitionAa5vz7o - 1;
        if (i2 < i4) {
            m6328quickSortAa5vz7o(sArr, i2, i4);
        }
        if (m6324partitionAa5vz7o < i3) {
            m6328quickSortAa5vz7o(sArr, m6324partitionAa5vz7o, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg  reason: not valid java name */
    private static final void m6329quickSortoBK06Vg(int[] iArr, int i2, int i3) {
        int m6325partitionoBK06Vg = m6325partitionoBK06Vg(iArr, i2, i3);
        int i4 = m6325partitionoBK06Vg - 1;
        if (i2 < i4) {
            m6329quickSortoBK06Vg(iArr, i2, i4);
        }
        if (m6325partitionoBK06Vg < i3) {
            m6329quickSortoBK06Vg(iArr, m6325partitionoBK06Vg, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m6330sortArraynroSd4(@NotNull long[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6326quickSortnroSd4(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m6331sortArray4UcCI2c(@NotNull byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6327quickSort4UcCI2c(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m6332sortArrayAa5vz7o(@NotNull short[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6328quickSortAa5vz7o(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m6333sortArrayoBK06Vg(@NotNull int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6329quickSortoBK06Vg(array, i2, i3 - 1);
    }
}
