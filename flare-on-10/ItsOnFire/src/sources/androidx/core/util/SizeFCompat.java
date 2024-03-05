package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: ItsOnFire.jar:androidx/core/util/SizeFCompat.class */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    @RequiresApi(21)
    /* loaded from: ItsOnFire.jar:androidx/core/util/SizeFCompat$Api21Impl.class */
    public static final class Api21Impl {
        private Api21Impl() {
        }

        @NonNull
        @DoNotInline
        public static SizeF toSizeF(@NonNull SizeFCompat sizeFCompat) {
            Preconditions.checkNotNull(sizeFCompat);
            return new SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }

        @NonNull
        @DoNotInline
        public static SizeFCompat toSizeFCompat(@NonNull SizeF sizeF) {
            Preconditions.checkNotNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f2, float f3) {
        this.mWidth = Preconditions.checkArgumentFinite(f2, "width");
        this.mHeight = Preconditions.checkArgumentFinite(f3, "height");
    }

    @NonNull
    @RequiresApi(21)
    public static SizeFCompat toSizeFCompat(@NonNull SizeF sizeF) {
        return Api21Impl.toSizeFCompat(sizeF);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeFCompat) {
            SizeFCompat sizeFCompat = (SizeFCompat) obj;
            if (sizeFCompat.mWidth != this.mWidth || sizeFCompat.mHeight != this.mHeight) {
                z = false;
            }
            return z;
        }
        return false;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.mHeight) ^ Float.floatToIntBits(this.mWidth);
    }

    @NonNull
    @RequiresApi(21)
    public SizeF toSizeF() {
        return Api21Impl.toSizeF(this);
    }

    @NonNull
    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
