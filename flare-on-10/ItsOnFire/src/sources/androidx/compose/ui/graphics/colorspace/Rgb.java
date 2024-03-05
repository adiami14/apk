package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0014\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010��\n\u0002\b\u0011\u0018�� H2\u00020\u0001:\u0001HB?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nBW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020��\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fBs\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010!J\u0013\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\u001e\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000fJ\u000e\u00109\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005H\u0016J\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u0010\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0017H\u0016J\u0010\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0017H\u0016J\u0006\u0010C\u001a\u00020\u0005J\u000e\u0010C\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010D\u001a\u00020\u0005J\u000e\u0010D\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010E\u001a\u00020\u0017H\u0016J\u001e\u0010F\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000fJ\u000e\u0010F\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005H\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n��\u001a\u0004\b\"\u0010#R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b)\u0010+R\u0014\u0010,\u001a\u00020*X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b,\u0010+R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n��R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n��\u001a\u0004\b-\u0010#R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b/\u0010#R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b0\u0010(R\u0013\u0010 \u001a\u0004\u0018\u00010\u0013¢\u0006\b\n��\u001a\u0004\b1\u00102R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b3\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b4\u00105¨\u0006I"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXyz", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/Rgb.class */
public final class Rgb extends ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Function1<Double, Double> DoubleIdentity = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$DoubleIdentity$1
        @NotNull
        public final Double invoke(double d2) {
            return Double.valueOf(d2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d2) {
            return invoke(d2.doubleValue());
        }
    };
    @NotNull
    private final Function1<Double, Double> eotf;
    @NotNull
    private final Function1<Double, Double> eotfOrig;
    @NotNull
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    @NotNull
    private final Function1<Double, Double> oetf;
    @NotNull
    private final Function1<Double, Double> oetfOrig;
    @NotNull
    private final float[] primaries;
    @Nullable
    private final TransferParameters transferParameters;
    @NotNull
    private final float[] transform;
    @NotNull
    private final WhitePoint whitePoint;

    @Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0014\n��\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH��¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002JX\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n��¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Lkotlin/Function1;", "", "area", "", "primaries", "", "compare", "", "point", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/Rgb$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] fArr) {
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float f8 = ((((((f2 * f5) + (f3 * f6)) + (f4 * f7)) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
            float f9 = f8;
            if (f8 < 0.0f) {
                f9 = -f8;
            }
            return f9;
        }

        private final boolean compare(double d2, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
            return Math.abs(function1.invoke(Double.valueOf(d2)).doubleValue() - function12.invoke(Double.valueOf(d2)).doubleValue()) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f2 = mul3x3Float3[0];
            float f3 = mul3x3Float3[1];
            float f4 = f2 + f3 + mul3x3Float3[2];
            return new WhitePoint(f2 / f4, f3 / f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f8 = 1;
            float f9 = (f8 - f2) / f3;
            float f10 = (f8 - f4) / f5;
            float f11 = (f8 - f6) / f7;
            float f12 = (f8 - x) / y;
            float f13 = f2 / f3;
            float f14 = f4 / f5;
            float f15 = f6 / f7;
            float f16 = x / y;
            float f17 = f14 - f13;
            float f18 = f16 - f13;
            float f19 = f10 - f9;
            float f20 = f15 - f13;
            float f21 = (((f12 - f9) * f17) - (f18 * f19)) / (((f11 - f9) * f17) - (f19 * f20));
            float f22 = (f18 - (f20 * f21)) / f17;
            float f23 = (1.0f - f22) - f21;
            float f24 = f23 / f3;
            float f25 = f22 / f5;
            float f26 = f21 / f7;
            return new float[]{f24 * f2, f23, f24 * ((1.0f - f2) - f3), f25 * f4, f22, f25 * ((1.0f - f4) - f5), f26 * f6, f21, f26 * ((1.0f - f6) - f7)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f2 = fArr[0] - fArr2[0];
            float f3 = fArr[1] - fArr2[1];
            float[] fArr3 = {f2, f3, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            boolean z = false;
            if (cross(f2, f3, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= 0.0f) {
                if (cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f) {
                    z = false;
                } else {
                    z = false;
                    if (cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f) {
                        if (cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f) {
                            z = false;
                        } else {
                            z = false;
                            if (cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f) {
                                z = false;
                                if (cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            return z;
        }

        private final float cross(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12, float f2, float f3, int i2) {
            if (i2 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (!(f2 == 0.0f)) {
                return false;
            }
            if (!(f3 == 1.0f)) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            double d2 = 0.0d;
            while (true) {
                double d3 = d2;
                if (d3 > 1.0d) {
                    return true;
                }
                if (!compare(d3, function1, srgb.getOetfOrig$ui_graphics_release()) || !compare(d3, function12, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
                d2 = d3 + 0.00392156862745098d;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f2, float f3) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            return (area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (f2 < 0.0f && f3 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = f2 + f3 + fArr[2];
                fArr2[0] = f2 / f4;
                fArr2[1] = f3 / f4;
                float f5 = fArr[3];
                float f6 = fArr[4];
                float f7 = f5 + f6 + fArr[5];
                fArr2[2] = f5 / f7;
                fArr2[3] = f6 / f7;
                float f8 = fArr[6];
                float f9 = fArr[7];
                float f10 = f8 + f9 + fArr[8];
                fArr2[4] = f8 / f10;
                fArr2[5] = f9 / f10;
            } else {
                ArraysKt___ArraysJvmKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f2 = mul3x3Float3[0];
            float f3 = mul3x3Float3[1];
            float f4 = f2 + f3 + mul3x3Float3[2];
            float f5 = mul3x3Float32[0] + mul3x3Float32[1] + mul3x3Float32[2];
            float f6 = mul3x3Float33[0] + mul3x3Float33[1] + mul3x3Float33[2];
            return new float[]{f2 / f4, f3 / f4, mul3x3Float32[0] / f5, mul3x3Float32[1] / f5, mul3x3Float33[0] / f6, mul3x3Float33[1] / f6};
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull Rgb colorSpace, @NotNull float[] transform, @NotNull WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull float[] r12, double r13) {
        /*
            r10 = this;
            r0 = r11
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            java.lang.String r1 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            r15 = r0
            r0 = r10
            r1 = r11
            r2 = r15
            r3 = r12
            float[] r2 = r2.computePrimaries$ui_graphics_release(r3)
            r3 = r15
            r4 = r12
            androidx.compose.ui.graphics.colorspace.WhitePoint r3 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r3, r4)
            r4 = r13
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = -1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull float[] r9, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            r0 = r8
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r9
            java.lang.String r1 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r10
            java.lang.String r1 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r9
            float[] r2 = r2.computePrimaries$ui_graphics_release(r3)
            r3 = r11
            r4 = r9
            androidx.compose.ui.graphics.colorspace.WhitePoint r3 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r3, r4)
            r4 = r10
            r5 = -1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double d2) {
        this(name, primaries, whitePoint, d2, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull float[] r30, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.WhitePoint r31, final double r32, float r34, float r35, int r36) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r30
            java.lang.String r1 = "primaries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r31
            java.lang.String r1 = "whitePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r32
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r37 = r0
            r0 = 1
            r38 = r0
            r0 = r37
            if (r0 != 0) goto L26
            r0 = 1
            r39 = r0
            goto L29
        L26:
            r0 = 0
            r39 = r0
        L29:
            r0 = r39
            if (r0 == 0) goto L36
            kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> r0 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
            r40 = r0
            goto L41
        L36:
            androidx.compose.ui.graphics.colorspace.Rgb$5 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$5
            r1 = r0
            r2 = r32
            r1.<init>()
            r40 = r0
        L41:
            r0 = r37
            if (r0 != 0) goto L4d
            r0 = r38
            r39 = r0
            goto L50
        L4d:
            r0 = 0
            r39 = r0
        L50:
            r0 = r39
            if (r0 == 0) goto L5d
            kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> r0 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
            r41 = r0
            goto L68
        L5d:
            androidx.compose.ui.graphics.colorspace.Rgb$6 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$6
            r1 = r0
            r2 = r32
            r1.<init>()
            r41 = r0
        L68:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = 0
            r5 = r40
            r6 = r41
            r7 = r34
            r8 = r35
            androidx.compose.ui.graphics.colorspace.TransferParameters r9 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r10 = r9
            r11 = r32
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 96
            r19 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull float[] r14, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.WhitePoint r15, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.colorspace.TransferParameters r16, int r17) {
        /*
            r12 = this;
            r0 = r13
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r14
            java.lang.String r1 = "primaries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r15
            java.lang.String r1 = "whitePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r16
            java.lang.String r1 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r16
            double r0 = r0.getE()
            r18 = r0
            r0 = 1
            r20 = r0
            r0 = r18
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L30
            r0 = 1
            r21 = r0
            goto L33
        L30:
            r0 = 0
            r21 = r0
        L33:
            r0 = r21
            if (r0 == 0) goto L5e
            r0 = r16
            double r0 = r0.getF()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            r0 = 1
            r21 = r0
            goto L4b
        L48:
            r0 = 0
            r21 = r0
        L4b:
            r0 = r21
            if (r0 == 0) goto L5e
            androidx.compose.ui.graphics.colorspace.Rgb$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$1
            r1 = r0
            r2 = r16
            r1.<init>()
            r22 = r0
            goto L69
        L5e:
            androidx.compose.ui.graphics.colorspace.Rgb$2 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$2
            r1 = r0
            r2 = r16
            r1.<init>()
            r22 = r0
        L69:
            r0 = r16
            double r0 = r0.getE()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L79
            r0 = 1
            r21 = r0
            goto L7c
        L79:
            r0 = 0
            r21 = r0
        L7c:
            r0 = r21
            if (r0 == 0) goto La8
            r0 = r16
            double r0 = r0.getF()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L92
            r0 = r20
            r21 = r0
            goto L95
        L92:
            r0 = 0
            r21 = r0
        L95:
            r0 = r21
            if (r0 == 0) goto La8
            androidx.compose.ui.graphics.colorspace.Rgb$3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$3
            r1 = r0
            r2 = r16
            r1.<init>()
            r23 = r0
            goto Lb3
        La8:
            androidx.compose.ui.graphics.colorspace.Rgb$4 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$4
            r1 = r0
            r2 = r16
            r1.<init>()
            r23 = r0
        Lb3:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = 0
            r5 = r22
            r6 = r23
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf, float f2, float f3) {
        this(name, primaries, whitePoint, null, oetf, eotf, f2, f3, null, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @Nullable float[] fArr, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf, float f2, float f3, @Nullable TransferParameters transferParameters, int i2) {
        super(name, ColorModel.Companion.m2780getRgbxdoWZVw(), i2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.min = f2;
        this.max = f3;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d2) {
                float f4;
                float f5;
                double coerceIn;
                double doubleValue = Rgb.this.getOetfOrig$ui_graphics_release().invoke(Double.valueOf(d2)).doubleValue();
                f4 = Rgb.this.min;
                f5 = Rgb.this.max;
                coerceIn = RangesKt___RangesKt.coerceIn(doubleValue, f4, f5);
                return Double.valueOf(coerceIn);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return invoke(d2.doubleValue());
            }
        };
        this.eotfOrig = eotf;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d2) {
                float f4;
                float f5;
                double coerceIn;
                Function1<Double, Double> eotfOrig$ui_graphics_release = Rgb.this.getEotfOrig$ui_graphics_release();
                f4 = Rgb.this.min;
                f5 = Rgb.this.max;
                coerceIn = RangesKt___RangesKt.coerceIn(d2, f4, f5);
                return eotfOrig$ui_graphics_release.invoke(Double.valueOf(coerceIn));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return invoke(d2.doubleValue());
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f3 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] xyPrimaries = companion.xyPrimaries(primaries);
        this.primaries = xyPrimaries;
        if (fArr == null) {
            this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
        } else if (fArr.length != 9) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Transform must have 9 entries! Has ", Integer.valueOf(fArr.length)));
        } else {
            this.transform = fArr;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(xyPrimaries, f2, f3);
        this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, oetf, eotf, f2, f3, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull float[] r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r15, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r16) {
        /*
            r12 = this;
            r0 = r13
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r14
            java.lang.String r1 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r15
            java.lang.String r1 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r16
            java.lang.String r1 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            r17 = r0
            r0 = r12
            r1 = r13
            r2 = r17
            r3 = r14
            float[] r2 = r2.computePrimaries$ui_graphics_release(r3)
            r3 = r17
            r4 = r14
            androidx.compose.ui.graphics.colorspace.WhitePoint r3 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r3, r4)
            r4 = 0
            r5 = r15
            r6 = r16
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r10 = -1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj != null) {
            if (!Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(Rgb.class), Reflection.getOrCreateKotlinClass(obj.getClass()))) {
                z = false;
            } else if (!super.equals(obj)) {
                return false;
            } else {
                Rgb rgb = (Rgb) obj;
                if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
                    return false;
                }
                TransferParameters transferParameters = this.transferParameters;
                if (transferParameters != null) {
                    return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
                }
                if (rgb.transferParameters == null) {
                    return true;
                }
                z = !Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig) ? false : Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
            }
        }
        return z;
    }

    @NotNull
    public final float[] fromLinear(float f2, float f3, float f4) {
        return fromLinear(new float[]{f2, f3, f4});
    }

    @NotNull
    public final float[] fromLinear(@NotNull float[] v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        v2[0] = (float) this.oetf.invoke(Double.valueOf(v2[0])).doubleValue();
        v2[1] = (float) this.oetf.invoke(Double.valueOf(v2[1])).doubleValue();
        v2[2] = (float) this.oetf.invoke(Double.valueOf(v2[2])).doubleValue();
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v2);
        v2[0] = (float) this.oetf.invoke(Double.valueOf(v2[0])).doubleValue();
        v2[1] = (float) this.oetf.invoke(Double.valueOf(v2[1])).doubleValue();
        v2[2] = (float) this.oetf.invoke(Double.valueOf(v2[2])).doubleValue();
        return v2;
    }

    @NotNull
    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    @NotNull
    public final Function1<Double, Double> getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getInverseTransform(@NotNull float[] inverseTransform) {
        float[] copyInto$default;
        Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform");
        copyInto$default = ArraysKt___ArraysJvmKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (Object) null);
        return copyInto$default;
    }

    @NotNull
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return this.min;
    }

    @NotNull
    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    @NotNull
    public final Function1<Double, Double> getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getPrimaries(@NotNull float[] primaries) {
        float[] copyInto$default;
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        copyInto$default = ArraysKt___ArraysJvmKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (Object) null);
        return copyInto$default;
    }

    @NotNull
    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getTransform(@NotNull float[] transform) {
        float[] copyInto$default;
        Intrinsics.checkNotNullParameter(transform, "transform");
        copyInto$default = ArraysKt___ArraysJvmKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (Object) null);
        return copyInto$default;
    }

    @NotNull
    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.whitePoint.hashCode();
        int hashCode3 = Arrays.hashCode(this.primaries);
        float f2 = this.min;
        boolean z = true;
        int i2 = 0;
        int floatToIntBits = !((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f2) : 0;
        float f3 = this.max;
        if (f3 != 0.0f) {
            z = false;
        }
        int floatToIntBits2 = !z ? Float.floatToIntBits(f3) : 0;
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            i2 = transferParameters.hashCode();
        }
        int i3 = (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + i2;
        int i4 = i3;
        if (this.transferParameters == null) {
            i4 = (((i3 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @NotNull
    public final float[] toLinear(float f2, float f3, float f4) {
        return toLinear(new float[]{f2, f3, f4});
    }

    @NotNull
    public final float[] toLinear(@NotNull float[] v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        v2[0] = (float) this.eotf.invoke(Double.valueOf(v2[0])).doubleValue();
        v2[1] = (float) this.eotf.invoke(Double.valueOf(v2[1])).doubleValue();
        v2[2] = (float) this.eotf.invoke(Double.valueOf(v2[2])).doubleValue();
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        v2[0] = (float) this.eotf.invoke(Double.valueOf(v2[0])).doubleValue();
        v2[1] = (float) this.eotf.invoke(Double.valueOf(v2[1])).doubleValue();
        v2[2] = (float) this.eotf.invoke(Double.valueOf(v2[2])).doubleValue();
        return ColorSpaceKt.mul3x3Float3(this.transform, v2);
    }
}
