package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.DoubleCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:androidx/core/content/res/CamColor.class */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    public CamColor(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.mHue = f2;
        this.mChroma = f3;
        this.mJ = f4;
        this.mQ = f5;
        this.mM = f6;
        this.mS = f7;
        this.mJstar = f8;
        this.mAstar = f9;
        this.mBstar = f10;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 100.0d) float f4) {
        CamColor camColor;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        CamColor camColor2 = null;
        float f7 = 100.0f;
        float f8 = 1000.0f;
        while (true) {
            camColor = camColor2;
            if (Math.abs(f6 - f7) <= 0.01f) {
                break;
            }
            float f9 = ((f7 - f6) / 2.0f) + f6;
            int viewedInSrgb = fromJch(f9, f3, f2).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f4 - lStarFromInt);
            float f10 = f5;
            float f11 = f8;
            camColor = camColor2;
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f2));
                f10 = f5;
                f11 = f8;
                camColor = camColor2;
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f10 = abs;
                    f11 = distance;
                }
            }
            if (f10 == 0.0f && f11 == 0.0f) {
                break;
            } else if (lStarFromInt < f4) {
                f6 = f9;
                f5 = f10;
                f8 = f11;
                camColor2 = camColor;
            } else {
                f7 = f9;
                f5 = f10;
                f8 = f11;
                camColor2 = camColor;
            }
        }
        return camColor;
    }

    @NonNull
    public static CamColor fromColor(@ColorInt int i2) {
        return fromColorInViewingConditions(i2, ViewingConditions.DEFAULT);
    }

    @NonNull
    public static CamColor fromColorInViewingConditions(@ColorInt int i2, @NonNull ViewingConditions viewingConditions) {
        float f2;
        float pow;
        float[] xyzFromInt = CamUtils.xyzFromInt(i2);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f3 = xyzFromInt[0];
        float[] fArr2 = fArr[0];
        float f4 = fArr2[0];
        float f5 = xyzFromInt[1];
        float f6 = fArr2[1];
        float f7 = xyzFromInt[2];
        float f8 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f9 = fArr3[0];
        float f10 = fArr3[1];
        float f11 = fArr3[2];
        float[] fArr4 = fArr[2];
        float f12 = fArr4[0];
        float f13 = fArr4[1];
        float f14 = fArr4[2];
        float f15 = viewingConditions.getRgbD()[0] * ((f4 * f3) + (f6 * f5) + (f8 * f7));
        float f16 = viewingConditions.getRgbD()[1] * ((f9 * f3) + (f10 * f5) + (f11 * f7));
        float f17 = viewingConditions.getRgbD()[2] * ((f3 * f12) + (f5 * f13) + (f7 * f14));
        float pow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f17)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d2 = signum;
        double d3 = signum2;
        double d4 = signum3;
        float f18 = ((float) (((d2 * 11.0d) + (d3 * (-12.0d))) + d4)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = (((signum * 20.0f) + f20) + (21.0f * signum3)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            f2 = atan2 + 360.0f;
        } else {
            f2 = atan2;
            if (atan2 >= 360.0f) {
                f2 = atan2 - 360.0f;
            }
        }
        float f23 = (3.1415927f * f2) / 180.0f;
        float pow5 = ((float) Math.pow((f22 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c2 = 4.0f / viewingConditions.getC();
        float sqrt = (float) Math.sqrt(pow5 / 100.0f);
        float aw = viewingConditions.getAw();
        float flRoot = viewingConditions.getFlRoot();
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f2) < 20.14d ? 360.0f + f2 : f2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float flRoot2 = pow6 * viewingConditions.getFlRoot();
        float sqrt2 = (float) Math.sqrt((pow * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f));
        float f24 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot2) + 1.0f)) * 43.85965f;
        double d5 = f23;
        return new CamColor(f2, pow6, pow5, flRoot * c2 * sqrt * (aw + 4.0f), flRoot2, sqrt2 * 50.0f, f24, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 360.0d) float f4) {
        return fromJchInFrame(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 360.0d) float f4, ViewingConditions viewingConditions) {
        double d2;
        float c2 = 4.0f / viewingConditions.getC();
        float sqrt = (float) Math.sqrt(f2 / 100.0d);
        float aw = viewingConditions.getAw();
        float flRoot = viewingConditions.getFlRoot();
        float flRoot2 = f3 * viewingConditions.getFlRoot();
        float sqrt2 = (float) Math.sqrt(((f3 / ((float) Math.sqrt(d2))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f));
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((flRoot2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f4) / 180.0f;
        return new CamColor(f4, f3, f2, c2 * sqrt * (aw + 4.0f) * flRoot, flRoot2, sqrt2 * 50.0f, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 100.0d) float f4) {
        return toColor(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 100.0d) float f4, @NonNull ViewingConditions viewingConditions) {
        if (f3 < 1.0d || Math.round(f4) <= 0.0d || Math.round(f4) >= 100.0d) {
            return CamUtils.intFromLStar(f4);
        }
        float min = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
        CamColor camColor = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f3;
        while (true) {
            float f7 = f6;
            if (Math.abs(f5 - f3) < CHROMA_SEARCH_ENDPOINT) {
                return camColor == null ? CamUtils.intFromLStar(f4) : camColor.viewed(viewingConditions);
            }
            CamColor findCamByJ = findCamByJ(min, f7, f4);
            if (z) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z = false;
            } else if (findCamByJ == null) {
                f3 = f7;
            } else {
                camColor = findCamByJ;
                f5 = f7;
            }
            f6 = ((f3 - f5) / 2.0f) + f5;
        }
    }

    public float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop)
    public float getJ() {
        return this.mJ;
    }

    @FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.mM;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.mQ;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.mS;
    }

    @ColorInt
    public int viewed(@NonNull ViewingConditions viewingConditions) {
        float pow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = (float) (Math.cos(2.0d + hue) + 3.8d);
        float aw = viewingConditions.getAw();
        float pow2 = (float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ());
        float nc = viewingConditions.getNc();
        float ncb = viewingConditions.getNcb();
        float nbb = (aw * pow2) / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f2 = (((0.305f + nbb) * 23.0f) * pow) / (((((((cos * 0.25f) * 3846.1538f) * nc) * ncb) * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = nbb * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float max = (float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6)));
        float signum = Math.signum(f6);
        float fl = 100.0f / viewingConditions.getFl();
        float pow3 = (float) Math.pow(max, 2.380952380952381d);
        float max2 = (float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7)));
        float signum2 = Math.signum(f7);
        float fl2 = 100.0f / viewingConditions.getFl();
        float pow4 = (float) Math.pow(max2, 2.380952380952381d);
        float max3 = (float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8)));
        float signum3 = Math.signum(f8);
        float fl3 = 100.0f / viewingConditions.getFl();
        float pow5 = (float) Math.pow(max3, 2.380952380952381d);
        float f9 = ((signum * fl) * pow3) / viewingConditions.getRgbD()[0];
        float f10 = ((signum2 * fl2) * pow4) / viewingConditions.getRgbD()[1];
        float f11 = ((signum3 * fl3) * pow5) / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f12 = fArr2[0];
        float f13 = fArr2[1];
        float f14 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f15 = fArr3[0];
        float f16 = fArr3[1];
        float f17 = fArr3[2];
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor((f12 * f9) + (f13 * f10) + (f14 * f11), (f15 * f9) + (f16 * f10) + (f17 * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }
}
