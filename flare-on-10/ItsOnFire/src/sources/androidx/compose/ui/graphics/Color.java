package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� :2\u00020\u0001:\u0001:B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b&\u0010\u0013J\u001e\u0010'\u001a\u00020��2\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010)J@\u0010*\u001a\u00020��2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0002ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Color.class */
public final class Color {
    private final long value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    @Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204H\u0007ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002JD\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204H\u0007ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R'\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R'\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R'\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R'\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R'\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R'\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R'\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R'\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Color$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m2425getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m2426getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m2427getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2428getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2429getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m2430getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2431getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m2432getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m2433getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m2434getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m2435getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m2436getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m2437getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m2438hslJlNiLsg$default(Companion companion, float f2, float f3, float f4, float f5, Rgb rgb, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                f5 = 1.0f;
            }
            if ((i2 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2453hslJlNiLsg(f2, f3, f4, f5, rgb);
        }

        private final float hslToRgbComponent(int i2, float f2, float f3, float f4) {
            float f5 = (i2 + (f2 / 30.0f)) % 12.0f;
            return f4 - ((f3 * Math.min(f4, 1.0f - f4)) * Math.max(-1.0f, Math.min(f5 - 3, Math.min(9 - f5, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m2439hsvJlNiLsg$default(Companion companion, float f2, float f3, float f4, float f5, Rgb rgb, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                f5 = 1.0f;
            }
            if ((i2 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2454hsvJlNiLsg(f2, f3, f4, f5, rgb);
        }

        private final float hsvToRgbComponent(int i2, float f2, float f3, float f4) {
            float f5 = (i2 + (f2 / 60.0f)) % 6.0f;
            return f4 - ((f3 * f4) * Math.max(0.0f, Math.min(f5, Math.min(4 - f5, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU */
        public final long m2440getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU */
        public final long m2441getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU */
        public final long m2442getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU */
        public final long m2443getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU */
        public final long m2444getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU */
        public final long m2445getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU */
        public final long m2446getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU */
        public final long m2447getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU */
        public final long m2448getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU */
        public final long m2449getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU */
        public final long m2450getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU */
        public final long m2451getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU */
        public final long m2452getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0089  */
        @androidx.compose.ui.graphics.ExperimentalGraphicsApi
        /* renamed from: hsl-JlNiLsg */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long m2453hslJlNiLsg(float r9, float r10, float r11, float r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.Rgb r13) {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.Color.Companion.m2453hslJlNiLsg(float, float, float, float, androidx.compose.ui.graphics.colorspace.Rgb):long");
        }

        @ExperimentalGraphicsApi
        /* renamed from: hsv-JlNiLsg */
        public final long m2454hsvJlNiLsg(float f2, float f3, float f4, float f5, @NotNull Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            boolean z = false;
            if (0.0f <= f2 && f2 <= 360.0f) {
                z = false;
                if (0.0f <= f3 && f3 <= 1.0f) {
                    z = false;
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z = true;
                    }
                }
            }
            if (z) {
                return ColorKt.Color(hsvToRgbComponent(5, f2, f3, f4), hsvToRgbComponent(3, f2, f3, f4), hsvToRgbComponent(1, f2, f3, f4), f5, colorSpace);
            }
            throw new IllegalArgumentException(("HSV (" + f2 + ", " + f3 + ", " + f4 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }
    }

    private /* synthetic */ Color(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Color m2404boximpl(long j2) {
        return new Color(j2);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m2405component1impl(long j2) {
        return m2420getRedimpl(j2);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m2406component2impl(long j2) {
        return m2419getGreenimpl(j2);
    }

    @Stable
    /* renamed from: component3-impl */
    public static final float m2407component3impl(long j2) {
        return m2417getBlueimpl(j2);
    }

    @Stable
    /* renamed from: component4-impl */
    public static final float m2408component4impl(long j2) {
        return m2416getAlphaimpl(j2);
    }

    @Stable
    @NotNull
    /* renamed from: component5-impl */
    public static final ColorSpace m2409component5impl(long j2) {
        return m2418getColorSpaceimpl(j2);
    }

    /* renamed from: constructor-impl */
    public static long m2410constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: convert-vNxB06k */
    public static final long m2411convertvNxB06k(long j2, @NotNull ColorSpace colorSpace) {
        float[] m2462getComponents8_81llA;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (Intrinsics.areEqual(colorSpace, m2418getColorSpaceimpl(j2))) {
            return j2;
        }
        Connector m2785connectYBCOT_4$default = ColorSpaceKt.m2785connectYBCOT_4$default(m2418getColorSpaceimpl(j2), colorSpace, 0, 2, null);
        m2462getComponents8_81llA = ColorKt.m2462getComponents8_81llA(j2);
        m2785connectYBCOT_4$default.transform(m2462getComponents8_81llA);
        return ColorKt.Color(m2462getComponents8_81llA[0], m2462getComponents8_81llA[1], m2462getComponents8_81llA[2], m2462getComponents8_81llA[3], colorSpace);
    }

    @Stable
    /* renamed from: copy-wmQWz5c */
    public static final long m2412copywmQWz5c(long j2, float f2, float f3, float f4, float f5) {
        return ColorKt.Color(f3, f4, f5, f2, m2418getColorSpaceimpl(j2));
    }

    /* renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m2413copywmQWz5c$default(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m2416getAlphaimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m2420getRedimpl(j2);
        }
        if ((i2 & 4) != 0) {
            f4 = m2419getGreenimpl(j2);
        }
        if ((i2 & 8) != 0) {
            f5 = m2417getBlueimpl(j2);
        }
        return m2412copywmQWz5c(j2, f2, f3, f4, f5);
    }

    /* renamed from: equals-impl */
    public static boolean m2414equalsimpl(long j2, Object obj) {
        return (obj instanceof Color) && j2 == ((Color) obj).m2424unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m2415equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl */
    public static final float m2416getAlphaimpl(long j2) {
        float ulongToDouble;
        float f2;
        if (ULong.m6025constructorimpl(63 & j2) == 0) {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2 >>> 56) & 255));
            f2 = 255.0f;
        } else {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2 >>> 6) & 1023));
            f2 = 1023.0f;
        }
        return ulongToDouble / f2;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl */
    public static final float m2417getBlueimpl(long j2) {
        return ULong.m6025constructorimpl(63 & j2) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2 >>> 32) & 255))) / 255.0f : Float16.m2528toFloatimpl(Float16.m2512constructorimpl((short) ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2 >>> 16) & 65535)));
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @NotNull
    /* renamed from: getColorSpace-impl */
    public static final ColorSpace m2418getColorSpaceimpl(long j2) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m6025constructorimpl(j2 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl */
    public static final float m2419getGreenimpl(long j2) {
        return ULong.m6025constructorimpl(63 & j2) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2 >>> 40) & 255))) / 255.0f : Float16.m2528toFloatimpl(Float16.m2512constructorimpl((short) ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2 >>> 32) & 65535)));
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl */
    public static final float m2420getRedimpl(long j2) {
        long m6025constructorimpl = ULong.m6025constructorimpl(63 & j2);
        long m6025constructorimpl2 = ULong.m6025constructorimpl(j2 >>> 48);
        return m6025constructorimpl == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m6025constructorimpl(m6025constructorimpl2 & 255))) / 255.0f : Float16.m2528toFloatimpl(Float16.m2512constructorimpl((short) ULong.m6025constructorimpl(m6025constructorimpl2 & 65535)));
    }

    /* renamed from: hashCode-impl */
    public static int m2421hashCodeimpl(long j2) {
        return ULong.m6037hashCodeimpl(j2);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m2422toStringimpl(long j2) {
        return "Color(" + m2420getRedimpl(j2) + ", " + m2419getGreenimpl(j2) + ", " + m2417getBlueimpl(j2) + ", " + m2416getAlphaimpl(j2) + ", " + m2418getColorSpaceimpl(j2).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m2414equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU */
    public final long m2423getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m2421hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m2422toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m2424unboximpl() {
        return this.value;
    }
}
