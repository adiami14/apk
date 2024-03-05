package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��>\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001��¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001��¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001��¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001��¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b8\u00109\"\"\u0010��\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/ColorKt.class */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00aa  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r7, float r8, float r9, float r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r11) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    @Stable
    public static final long Color(int i2) {
        return Color.m2410constructorimpl(ULong.m6025constructorimpl(ULong.m6025constructorimpl(i2) << 32));
    }

    @Stable
    public static final long Color(int i2, int i3, int i4, int i5) {
        return Color(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    @Stable
    public static final long Color(long j2) {
        return Color.m2410constructorimpl(ULong.m6025constructorimpl(ULong.m6025constructorimpl(ULong.m6025constructorimpl(j2) & 4294967295L) << 32));
    }

    public static /* synthetic */ long Color$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f2, f3, f4, f5, colorSpace);
    }

    public static /* synthetic */ long Color$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = 255;
        }
        return Color(i2, i3, i4, i5);
    }

    /* renamed from: access$getComponents-8_81llA */
    public static final /* synthetic */ float[] m2460access$getComponents8_81llA(long j2) {
        return m2462getComponents8_81llA(j2);
    }

    private static final float compositeComponent(float f2, float f3, float f4, float f5, float f6) {
        return (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((f2 * f4) + ((f3 * f5) * (1.0f - f4))) / f6;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI */
    public static final long m2461compositeOverOWjLjI(long j2, long j3) {
        long m2411convertvNxB06k = Color.m2411convertvNxB06k(j2, Color.m2418getColorSpaceimpl(j3));
        float m2416getAlphaimpl = Color.m2416getAlphaimpl(j3);
        float m2416getAlphaimpl2 = Color.m2416getAlphaimpl(m2411convertvNxB06k);
        float f2 = 1.0f - m2416getAlphaimpl2;
        float f3 = (m2416getAlphaimpl * f2) + m2416getAlphaimpl2;
        float m2420getRedimpl = Color.m2420getRedimpl(m2411convertvNxB06k);
        float f4 = 0.0f;
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        float m2420getRedimpl2 = i2 == 0 ? 0.0f : ((m2420getRedimpl * m2416getAlphaimpl2) + ((Color.m2420getRedimpl(j3) * m2416getAlphaimpl) * f2)) / f3;
        float m2419getGreenimpl = i2 == 0 ? 0.0f : ((Color.m2419getGreenimpl(m2411convertvNxB06k) * m2416getAlphaimpl2) + ((Color.m2419getGreenimpl(j3) * m2416getAlphaimpl) * f2)) / f3;
        float m2417getBlueimpl = Color.m2417getBlueimpl(m2411convertvNxB06k);
        float m2417getBlueimpl2 = Color.m2417getBlueimpl(j3);
        if (!(i2 == 0)) {
            f4 = ((m2417getBlueimpl * m2416getAlphaimpl2) + ((m2417getBlueimpl2 * m2416getAlphaimpl) * f2)) / f3;
        }
        return Color(m2420getRedimpl2, m2419getGreenimpl, f4, f3, Color.m2418getColorSpaceimpl(j3));
    }

    /* renamed from: getComponents-8_81llA */
    public static final float[] m2462getComponents8_81llA(long j2) {
        return new float[]{Color.m2420getRedimpl(j2), Color.m2419getGreenimpl(j2), Color.m2417getBlueimpl(j2), Color.m2416getAlphaimpl(j2)};
    }

    /* renamed from: isSpecified-8_81llA */
    public static final boolean m2463isSpecified8_81llA(long j2) {
        return j2 != Color.Companion.m2450getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m2464isSpecified8_81llA$annotations(long j2) {
    }

    /* renamed from: isUnspecified-8_81llA */
    public static final boolean m2465isUnspecified8_81llA(long j2) {
        return j2 == Color.Companion.m2450getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m2466isUnspecified8_81llA$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM */
    public static final long m2467lerpjxsXWHM(long j2, long j3, float f2) {
        ColorSpace oklab$ui_graphics_release = ColorSpaces.INSTANCE.getOklab$ui_graphics_release();
        long m2411convertvNxB06k = Color.m2411convertvNxB06k(j2, oklab$ui_graphics_release);
        long m2411convertvNxB06k2 = Color.m2411convertvNxB06k(j3, oklab$ui_graphics_release);
        float m2416getAlphaimpl = Color.m2416getAlphaimpl(m2411convertvNxB06k);
        float m2420getRedimpl = Color.m2420getRedimpl(m2411convertvNxB06k);
        float m2419getGreenimpl = Color.m2419getGreenimpl(m2411convertvNxB06k);
        float m2417getBlueimpl = Color.m2417getBlueimpl(m2411convertvNxB06k);
        float m2416getAlphaimpl2 = Color.m2416getAlphaimpl(m2411convertvNxB06k2);
        float m2420getRedimpl2 = Color.m2420getRedimpl(m2411convertvNxB06k2);
        float m2419getGreenimpl2 = Color.m2419getGreenimpl(m2411convertvNxB06k2);
        float m2417getBlueimpl2 = Color.m2417getBlueimpl(m2411convertvNxB06k2);
        return Color.m2411convertvNxB06k(Color(MathHelpersKt.lerp(m2420getRedimpl, m2420getRedimpl2, f2), MathHelpersKt.lerp(m2419getGreenimpl, m2419getGreenimpl2, f2), MathHelpersKt.lerp(m2417getBlueimpl, m2417getBlueimpl2, f2), MathHelpersKt.lerp(m2416getAlphaimpl, m2416getAlphaimpl2, f2), oklab$ui_graphics_release), Color.m2418getColorSpaceimpl(j3));
    }

    @Stable
    /* renamed from: luminance-8_81llA */
    public static final float m2468luminance8_81llA(long j2) {
        ColorSpace m2418getColorSpaceimpl = Color.m2418getColorSpaceimpl(j2);
        if (ColorModel.m2773equalsimpl0(m2418getColorSpaceimpl.m2783getModelxdoWZVw(), ColorModel.Companion.m2780getRgbxdoWZVw())) {
            Function1<Double, Double> eotf = ((Rgb) m2418getColorSpaceimpl).getEotf();
            return saturate((float) ((eotf.invoke(Double.valueOf(Color.m2420getRedimpl(j2))).doubleValue() * 0.2126d) + (eotf.invoke(Double.valueOf(Color.m2419getGreenimpl(j2))).doubleValue() * 0.7152d) + (eotf.invoke(Double.valueOf(Color.m2417getBlueimpl(j2))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("The specified color must be encoded in an RGB color space. The supplied color space is ", ColorModel.m2776toStringimpl(m2418getColorSpaceimpl.m2783getModelxdoWZVw())).toString());
    }

    private static final float saturate(float f2) {
        float f3;
        if (f2 <= 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = f2;
            if (f2 >= 1.0f) {
                f3 = 1.0f;
            }
        }
        return f3;
    }

    /* renamed from: takeOrElse-DxMtmZc */
    public static final long m2469takeOrElseDxMtmZc(long j2, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(j2 != Color.Companion.m2450getUnspecified0d7_KjU())) {
            j2 = block.invoke().m2424unboximpl();
        }
        return j2;
    }

    @Stable
    /* renamed from: toArgb-8_81llA */
    public static final int m2470toArgb8_81llA(long j2) {
        ColorSpace m2418getColorSpaceimpl = Color.m2418getColorSpaceimpl(j2);
        if (m2418getColorSpaceimpl.isSrgb()) {
            return (int) ULong.m6025constructorimpl(j2 >>> 32);
        }
        float[] m2462getComponents8_81llA = m2462getComponents8_81llA(j2);
        ColorSpaceKt.m2785connectYBCOT_4$default(m2418getColorSpaceimpl, null, 0, 3, null).transform(m2462getComponents8_81llA);
        return ((int) ((m2462getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((m2462getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m2462getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m2462getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }
}
