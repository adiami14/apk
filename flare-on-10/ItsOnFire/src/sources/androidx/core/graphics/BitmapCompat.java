package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
/* loaded from: ItsOnFire.jar:androidx/core/graphics/BitmapCompat.class */
public final class BitmapCompat {

    @RequiresApi(17)
    /* loaded from: ItsOnFire.jar:androidx/core/graphics/BitmapCompat$Api17Impl.class */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        public static boolean hasMipMap(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @DoNotInline
        public static void setHasMipMap(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    @RequiresApi(19)
    /* loaded from: ItsOnFire.jar:androidx/core/graphics/BitmapCompat$Api19Impl.class */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @RequiresApi(27)
    /* loaded from: ItsOnFire.jar:androidx/core/graphics/BitmapCompat$Api27Impl.class */
    public static class Api27Impl {
        private Api27Impl() {
        }

        @DoNotInline
        public static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
                bitmap2 = bitmap.copy(config, true);
            }
            return bitmap2;
        }

        @DoNotInline
        public static Bitmap createBitmapWithSourceColorspace(int i2, int i3, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (!z || bitmap.getColorSpace().equals(colorSpace2)) {
                colorSpace2 = colorSpace;
                if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                    config = Bitmap.Config.ARGB_8888;
                    colorSpace2 = colorSpace;
                    if (Build.VERSION.SDK_INT >= 31) {
                        config = Api31Impl.getHardwareBitmapConfig(bitmap);
                        colorSpace2 = colorSpace;
                    }
                }
            } else {
                config = Bitmap.Config.RGBA_F16;
            }
            return Bitmap.createBitmap(i2, i3, config, bitmap.hasAlpha(), colorSpace2);
        }

        @DoNotInline
        public static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @RequiresApi(29)
    /* loaded from: ItsOnFire.jar:androidx/core/graphics/BitmapCompat$Api29Impl.class */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @RequiresApi(31)
    /* loaded from: ItsOnFire.jar:androidx/core/graphics/BitmapCompat$Api31Impl.class */
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            HardwareBuffer hardwareBuffer;
            hardwareBuffer = bitmap.getHardwareBuffer();
            return hardwareBuffer.getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private BitmapCompat() {
    }

    @NonNull
    public static Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i2, int i3, @Nullable Rect rect, boolean z) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect == null || (!rect.isEmpty() && rect.left >= 0 && rect.right <= bitmap.getWidth() && rect.top >= 0 && rect.bottom <= bitmap.getHeight())) {
            Bitmap copyBitmapIfHardware = Api27Impl.copyBitmapIfHardware(bitmap);
            int width = rect != null ? rect.width() : bitmap.getWidth();
            int height = rect != null ? rect.height() : bitmap.getHeight();
            float f2 = i2 / width;
            float f3 = i3 / height;
            int i8 = rect != null ? rect.left : 0;
            int i9 = rect != null ? rect.top : 0;
            if (i8 == 0 && i9 == 0 && i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) {
                return (bitmap.isMutable() && bitmap == copyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : copyBitmapIfHardware;
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            Api29Impl.setPaintBlendMode(paint);
            if (width == i2 && height == i3) {
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, copyBitmapIfHardware.getConfig());
                new Canvas(createBitmap).drawBitmap(copyBitmapIfHardware, -i8, -i9, paint);
                return createBitmap;
            }
            double log = Math.log(2.0d);
            double log2 = Math.log(f2) / log;
            int ceil = (int) (f2 > 1.0f ? Math.ceil(log2) : Math.floor(log2));
            int ceil2 = (int) (f3 > 1.0f ? Math.ceil(Math.log(f3) / log) : Math.floor(Math.log(f3) / log));
            Bitmap bitmap2 = null;
            if (!z || Api27Impl.isAlreadyF16AndLinear(bitmap)) {
                i4 = i8;
                i5 = 0;
            } else {
                Bitmap createBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(ceil > 0 ? sizeAtStep(width, i2, 1, ceil) : width, ceil2 > 0 ? sizeAtStep(height, i3, 1, ceil2) : height, bitmap, true);
                new Canvas(createBitmapWithSourceColorspace).drawBitmap(copyBitmapIfHardware, -i8, -i9, paint);
                i5 = 1;
                i9 = 0;
                i4 = 0;
                bitmap2 = copyBitmapIfHardware;
                copyBitmapIfHardware = createBitmapWithSourceColorspace;
            }
            Rect rect2 = new Rect(i4, i9, width, height);
            Rect rect3 = new Rect();
            int i10 = ceil;
            int i11 = ceil2;
            while (true) {
                int i12 = i11;
                if (i10 == 0 && i12 == 0) {
                    break;
                }
                if (i10 < 0) {
                    i6 = i10 + 1;
                } else {
                    i6 = i10;
                    if (i10 > 0) {
                        i6 = i10 - 1;
                    }
                }
                if (i12 < 0) {
                    i7 = i12 + 1;
                } else {
                    i7 = i12;
                    if (i12 > 0) {
                        i7 = i12 - 1;
                    }
                }
                rect3.set(0, 0, sizeAtStep(width, i2, i6, ceil), sizeAtStep(height, i3, i7, ceil2));
                boolean z2 = i6 == 0 && i7 == 0;
                boolean z3 = bitmap2 != null && bitmap2.getWidth() == i2 && bitmap2.getHeight() == i3;
                if (bitmap2 == null || bitmap2 == bitmap || ((z && !Api27Impl.isAlreadyF16AndLinear(bitmap2)) || (z2 && (!z3 || i5 != 0)))) {
                    if (bitmap2 != bitmap && bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    bitmap2 = Api27Impl.createBitmapWithSourceColorspace(sizeAtStep(width, i2, i6 > 0 ? i5 : i6, ceil), sizeAtStep(height, i3, i7 > 0 ? i5 : i7, ceil2), bitmap, z && !z2);
                }
                new Canvas(bitmap2).drawBitmap(copyBitmapIfHardware, rect2, rect3, paint);
                rect2.set(rect3);
                Bitmap bitmap3 = copyBitmapIfHardware;
                copyBitmapIfHardware = bitmap2;
                bitmap2 = bitmap3;
                i10 = i6;
                i11 = i7;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            return copyBitmapIfHardware;
        }
        throw new IllegalArgumentException("srcRect must be contained by srcBm!");
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return Api19Impl.getAllocationByteCount(bitmap);
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return Api17Impl.hasMipMap(bitmap);
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z) {
        Api17Impl.setHasMipMap(bitmap, z);
    }

    @VisibleForTesting
    public static int sizeAtStep(int i2, int i3, int i4, int i5) {
        return i4 == 0 ? i3 : i4 > 0 ? i2 * (1 << (i5 - i4)) : i3 << ((-i4) - 1);
    }
}
