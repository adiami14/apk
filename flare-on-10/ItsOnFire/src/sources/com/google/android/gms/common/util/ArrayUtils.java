package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
@VisibleForTesting
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/util/ArrayUtils.class */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @NonNull
    @KeepForSdk
    public static <T> T[] concat(@NonNull T[]... tArr) {
        if (tArr.length != 0) {
            int i2 = 0;
            for (T[] tArr2 : tArr) {
                i2 += tArr2.length;
            }
            T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i2);
            int length = tArr[0].length;
            for (int i3 = 1; i3 < tArr.length; i3++) {
                T[] tArr4 = tArr[i3];
                int length2 = tArr4.length;
                System.arraycopy(tArr4, 0, tArr3, length, length2);
                length += length2;
            }
            return tArr3;
        }
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
    }

    @NonNull
    @KeepForSdk
    public static byte[] concatByteArrays(@NonNull byte[]... bArr) {
        if (bArr.length != 0) {
            int i2 = 0;
            for (byte[] bArr2 : bArr) {
                i2 += bArr2.length;
            }
            byte[] copyOf = Arrays.copyOf(bArr[0], i2);
            int length = bArr[0].length;
            for (int i3 = 1; i3 < bArr.length; i3++) {
                byte[] bArr3 = bArr[i3];
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, copyOf, length, length2);
                length += length2;
            }
            return copyOf;
        }
        return new byte[0];
    }

    @KeepForSdk
    public static boolean contains(@NonNull int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static <T> boolean contains(@NonNull T[] tArr, @NonNull T t2) {
        int length = tArr != null ? tArr.length : 0;
        int i2 = 0;
        while (i2 < length) {
            if (Objects.equal(tArr[i2], t2)) {
                return i2 >= 0;
            }
            i2++;
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @Nullable
    @KeepForSdk
    public static <T> T[] removeAll(@NonNull T[] tArr, @NonNull T... tArr2) {
        int length;
        int i2;
        int i3;
        Object[] objArr;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> componentType = tArr2.getClass().getComponentType();
        int length2 = tArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, length2);
        int i4 = 0;
        if (length == 1) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = i6;
                i3 = i7;
                if (i5 >= length2) {
                    break;
                }
                T t2 = tArr[i5];
                int i8 = i7;
                if (!Objects.equal(tArr2[0], t2)) {
                    objArr2[i7] = t2;
                    i8 = i7 + 1;
                }
                i5++;
                i6 = i8;
            }
        } else {
            int i9 = 0;
            while (true) {
                i2 = i9;
                if (i4 >= length2) {
                    break;
                }
                T t3 = tArr[i4];
                int i10 = i2;
                if (!contains(tArr2, t3)) {
                    objArr2[i2] = t3;
                    i10 = i2 + 1;
                }
                i4++;
                i9 = i10;
            }
            i3 = i2;
        }
        if (objArr2 == null) {
            objArr = null;
        } else if (i3 != objArr2.length) {
            return (T[]) Arrays.copyOf(objArr2, i3);
        } else {
            objArr = objArr2;
        }
        return (T[]) objArr;
    }

    @NonNull
    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(@NonNull T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t2 : tArr) {
            arrayList.add(t2);
        }
        return arrayList;
    }

    @NonNull
    @KeepForSdk
    public static int[] toPrimitiveArray(@NonNull Collection<Integer> collection) {
        int i2 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        for (Integer num : collection) {
            iArr[i2] = num.intValue();
            i2++;
        }
        return iArr;
    }

    @Nullable
    @KeepForSdk
    public static Integer[] toWrapperArray(@NonNull int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i2 = 0; i2 < length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb, @NonNull double[] dArr) {
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i2]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb, @NonNull float[] fArr) {
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i2]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb, @NonNull int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i2]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb, @NonNull long[] jArr) {
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i2]));
        }
    }

    @KeepForSdk
    public static <T> void writeArray(@NonNull StringBuilder sb, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(tArr[i2]);
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb, @NonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i2]));
        }
    }

    @KeepForSdk
    public static void writeStringArray(@NonNull StringBuilder sb, @NonNull String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i2]);
            sb.append("\"");
        }
    }
}
