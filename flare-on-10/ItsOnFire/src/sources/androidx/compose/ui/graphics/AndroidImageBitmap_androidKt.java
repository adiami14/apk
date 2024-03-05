package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0006H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0006*\u00020\u0011H��ø\u0001��¢\u0006\u0002\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidImageBitmap_androidKt.class */
public final class AndroidImageBitmap_androidKt {
    @NotNull
    /* renamed from: ActualImageBitmap-x__-hDU  reason: not valid java name */
    public static final ImageBitmap m2283ActualImageBitmapx__hDU(int i2, int i3, int i4, boolean z, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        m2284toBitmapConfig1JJdX4A(i4);
        return new AndroidImageBitmap(Api26Bitmap.Companion.m2322createBitmapx__hDU$ui_graphics_release(i2, i3, i4, z, colorSpace));
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(imageBitmap, "<this>");
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    /* renamed from: toBitmapConfig-1JJdX4A  reason: not valid java name */
    public static final Bitmap.Config m2284toBitmapConfig1JJdX4A(int i2) {
        Bitmap.Config config;
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (!ImageBitmapConfig.m2575equalsimpl0(i2, companion.m2580getArgb8888_sVssgQ())) {
            if (ImageBitmapConfig.m2575equalsimpl0(i2, companion.m2579getAlpha8_sVssgQ())) {
                config = Bitmap.Config.ALPHA_8;
            } else if (ImageBitmapConfig.m2575equalsimpl0(i2, companion.m2583getRgb565_sVssgQ())) {
                config = Bitmap.Config.RGB_565;
            } else if (ImageBitmapConfig.m2575equalsimpl0(i2, companion.m2581getF16_sVssgQ())) {
                config = Bitmap.Config.RGBA_F16;
            } else if (ImageBitmapConfig.m2575equalsimpl0(i2, companion.m2582getGpu_sVssgQ())) {
                config = Bitmap.Config.HARDWARE;
            }
            return config;
        }
        config = Bitmap.Config.ARGB_8888;
        return config;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        int m2582getGpu_sVssgQ;
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            m2582getGpu_sVssgQ = ImageBitmapConfig.Companion.m2579getAlpha8_sVssgQ();
        } else if (config == Bitmap.Config.RGB_565) {
            m2582getGpu_sVssgQ = ImageBitmapConfig.Companion.m2583getRgb565_sVssgQ();
        } else {
            if (config != Bitmap.Config.ARGB_4444) {
                if (config == Bitmap.Config.RGBA_F16) {
                    m2582getGpu_sVssgQ = ImageBitmapConfig.Companion.m2581getF16_sVssgQ();
                } else if (config == Bitmap.Config.HARDWARE) {
                    m2582getGpu_sVssgQ = ImageBitmapConfig.Companion.m2582getGpu_sVssgQ();
                }
            }
            m2582getGpu_sVssgQ = ImageBitmapConfig.Companion.m2580getArgb8888_sVssgQ();
        }
        return m2582getGpu_sVssgQ;
    }
}
