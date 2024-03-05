package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/images/Size.class */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i2, int i3) {
        this.zaa = i2;
        this.zab = i3;
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            int i2 = indexOf;
            if (indexOf < 0) {
                i2 = str.indexOf(120);
            }
            if (i2 >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, i2)), Integer.parseInt(str.substring(i2 + 1)));
                } catch (NumberFormatException e2) {
                    throw zaa(str);
                }
            }
            throw zaa(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    private static NumberFormatException zaa(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zaa == size.zaa && this.zab == size.zab;
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i2 = this.zab;
        int i3 = this.zaa;
        return ((i3 >>> 16) | (i3 << 16)) ^ i2;
    }

    @NonNull
    public String toString() {
        int i2 = this.zaa;
        int i3 = this.zab;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        return sb.toString();
    }
}
