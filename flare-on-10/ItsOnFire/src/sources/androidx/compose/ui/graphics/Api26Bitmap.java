package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\b\u0002\u0018�� \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Api26Bitmap.class */
public final class Api26Bitmap {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H��¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H��¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH��¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap$Companion;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @RequiresApi(26)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Api26Bitmap$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<this>");
            android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace composeColorSpace$ui_graphics_release = colorSpace == null ? null : composeColorSpace$ui_graphics_release(colorSpace);
            Rgb rgb = composeColorSpace$ui_graphics_release;
            if (composeColorSpace$ui_graphics_release == null) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return rgb;
        }

        @NotNull
        public final ColorSpace composeColorSpace$ui_graphics_release(@NotNull android.graphics.ColorSpace colorSpace) {
            Rgb smpteC;
            Intrinsics.checkNotNullParameter(colorSpace, "<this>");
            if (!Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB))) {
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACES))) {
                    smpteC = ColorSpaces.INSTANCE.getAces();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG))) {
                    smpteC = ColorSpaces.INSTANCE.getAcescg();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
                    smpteC = ColorSpaces.INSTANCE.getAdobeRgb();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020))) {
                    smpteC = ColorSpaces.INSTANCE.getBt2020();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT709))) {
                    smpteC = ColorSpaces.INSTANCE.getBt709();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
                    smpteC = ColorSpaces.INSTANCE.getCieLab();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
                    smpteC = ColorSpaces.INSTANCE.getCieXyz();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3))) {
                    smpteC = ColorSpaces.INSTANCE.getDciP3();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
                    smpteC = ColorSpaces.INSTANCE.getDisplayP3();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
                    smpteC = ColorSpaces.INSTANCE.getExtendedSrgb();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
                    smpteC = ColorSpaces.INSTANCE.getLinearExtendedSrgb();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
                    smpteC = ColorSpaces.INSTANCE.getLinearSrgb();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
                    smpteC = ColorSpaces.INSTANCE.getNtsc1953();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
                    smpteC = ColorSpaces.INSTANCE.getProPhotoRgb();
                } else if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
                    smpteC = ColorSpaces.INSTANCE.getSmpteC();
                }
                return smpteC;
            }
            smpteC = ColorSpaces.INSTANCE.getSrgb();
            return smpteC;
        }

        @NotNull
        /* renamed from: createBitmap-x__-hDU$ui_graphics_release  reason: not valid java name */
        public final Bitmap m2322createBitmapx__hDU$ui_graphics_release(int i2, int i3, int i4, boolean z, @NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, AndroidImageBitmap_androidKt.m2284toBitmapConfig1JJdX4A(i4), z, toFrameworkColorSpace$ui_graphics_release(colorSpace));
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …olorSpace()\n            )");
            return createBitmap;
        }

        @NotNull
        public final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            ColorSpace.Named named;
            Intrinsics.checkNotNullParameter(colorSpace, "<this>");
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
                if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
                    named = ColorSpace.Named.ACES;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
                    named = ColorSpace.Named.ACESCG;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
                    named = ColorSpace.Named.ADOBE_RGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
                    named = ColorSpace.Named.BT2020;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
                    named = ColorSpace.Named.BT709;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
                    named = ColorSpace.Named.CIE_LAB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
                    named = ColorSpace.Named.CIE_XYZ;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
                    named = ColorSpace.Named.DCI_P3;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
                    named = ColorSpace.Named.EXTENDED_SRGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
                    named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
                    named = ColorSpace.Named.LINEAR_SRGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
                    named = ColorSpace.Named.NTSC_1953;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
                    named = ColorSpace.Named.PRO_PHOTO_RGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
                    named = ColorSpace.Named.SMPTE_C;
                }
                android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(named);
                Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(frameworkNamedSpace)");
                return colorSpace2;
            }
            named = ColorSpace.Named.SRGB;
            android.graphics.ColorSpace colorSpace22 = android.graphics.ColorSpace.get(named);
            Intrinsics.checkNotNullExpressionValue(colorSpace22, "get(frameworkNamedSpace)");
            return colorSpace22;
        }
    }
}
