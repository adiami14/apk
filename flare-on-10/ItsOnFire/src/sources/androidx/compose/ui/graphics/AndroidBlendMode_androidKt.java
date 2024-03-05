package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.BlendMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010��\u001a\u00020\u0001*\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n*\u00020\u0002H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidBlendMode_androidKt.class */
public final class AndroidBlendMode_androidKt {
    /* renamed from: isSupported-s9anfk8  reason: not valid java name */
    public static final boolean m2261isSupporteds9anfk8(int i2) {
        return true;
    }

    @RequiresApi(29)
    @NotNull
    /* renamed from: toAndroidBlendMode-s9anfk8  reason: not valid java name */
    public static final android.graphics.BlendMode m2262toAndroidBlendModes9anfk8(int i2) {
        android.graphics.BlendMode blendMode;
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m2327equalsimpl0(i2, companion.m2331getClear0nO6VwU())) {
            blendMode = android.graphics.BlendMode.CLEAR;
        } else if (BlendMode.m2327equalsimpl0(i2, companion.m2354getSrc0nO6VwU())) {
            blendMode = android.graphics.BlendMode.SRC;
        } else if (BlendMode.m2327equalsimpl0(i2, companion.m2337getDst0nO6VwU())) {
            blendMode = android.graphics.BlendMode.DST;
        } else {
            if (!BlendMode.m2327equalsimpl0(i2, companion.m2358getSrcOver0nO6VwU())) {
                if (BlendMode.m2327equalsimpl0(i2, companion.m2341getDstOver0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.DST_OVER;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2356getSrcIn0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.SRC_IN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2339getDstIn0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.DST_IN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2357getSrcOut0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.SRC_OUT;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2340getDstOut0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.DST_OUT;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2355getSrcAtop0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.SRC_ATOP;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2338getDstAtop0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.DST_ATOP;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2359getXor0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.XOR;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2350getPlus0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.PLUS;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2347getModulate0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.MODULATE;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2352getScreen0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.SCREEN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2349getOverlay0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.OVERLAY;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2335getDarken0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.DARKEN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2345getLighten0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.LIGHTEN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2334getColorDodge0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.COLOR_DODGE;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2333getColorBurn0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.COLOR_BURN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2343getHardlight0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.HARD_LIGHT;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2353getSoftlight0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.SOFT_LIGHT;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2336getDifference0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.DIFFERENCE;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2342getExclusion0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.EXCLUSION;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2348getMultiply0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.MULTIPLY;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2344getHue0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.HUE;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2351getSaturation0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.SATURATION;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2332getColor0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.COLOR;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2346getLuminosity0nO6VwU())) {
                    blendMode = android.graphics.BlendMode.LUMINOSITY;
                }
            }
            blendMode = android.graphics.BlendMode.SRC_OVER;
        }
        return blendMode;
    }

    @NotNull
    /* renamed from: toPorterDuffMode-s9anfk8  reason: not valid java name */
    public static final PorterDuff.Mode m2263toPorterDuffModes9anfk8(int i2) {
        PorterDuff.Mode mode;
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m2327equalsimpl0(i2, companion.m2331getClear0nO6VwU())) {
            mode = PorterDuff.Mode.CLEAR;
        } else if (BlendMode.m2327equalsimpl0(i2, companion.m2354getSrc0nO6VwU())) {
            mode = PorterDuff.Mode.SRC;
        } else if (BlendMode.m2327equalsimpl0(i2, companion.m2337getDst0nO6VwU())) {
            mode = PorterDuff.Mode.DST;
        } else {
            if (!BlendMode.m2327equalsimpl0(i2, companion.m2358getSrcOver0nO6VwU())) {
                if (BlendMode.m2327equalsimpl0(i2, companion.m2341getDstOver0nO6VwU())) {
                    mode = PorterDuff.Mode.DST_OVER;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2356getSrcIn0nO6VwU())) {
                    mode = PorterDuff.Mode.SRC_IN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2339getDstIn0nO6VwU())) {
                    mode = PorterDuff.Mode.DST_IN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2357getSrcOut0nO6VwU())) {
                    mode = PorterDuff.Mode.SRC_OUT;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2340getDstOut0nO6VwU())) {
                    mode = PorterDuff.Mode.DST_OUT;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2355getSrcAtop0nO6VwU())) {
                    mode = PorterDuff.Mode.SRC_ATOP;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2338getDstAtop0nO6VwU())) {
                    mode = PorterDuff.Mode.DST_ATOP;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2359getXor0nO6VwU())) {
                    mode = PorterDuff.Mode.XOR;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2350getPlus0nO6VwU())) {
                    mode = PorterDuff.Mode.ADD;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2352getScreen0nO6VwU())) {
                    mode = PorterDuff.Mode.SCREEN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2349getOverlay0nO6VwU())) {
                    mode = PorterDuff.Mode.OVERLAY;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2335getDarken0nO6VwU())) {
                    mode = PorterDuff.Mode.DARKEN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2345getLighten0nO6VwU())) {
                    mode = PorterDuff.Mode.LIGHTEN;
                } else if (BlendMode.m2327equalsimpl0(i2, companion.m2347getModulate0nO6VwU())) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            mode = PorterDuff.Mode.SRC_OVER;
        }
        return mode;
    }
}
