package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018��2\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ5\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020��2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020��2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJP\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f26\u0010&\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\t0'H\u0082\b¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101J(\u0010.\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b9\u00107J\u0015\u0010:\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b;\u00107J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u000f¢\u0006\u0004\b>\u00107J-\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020��H\u0086\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bH\u00101J\u0010\u0010I\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "convertRgbToYuv", "", "convertRgbToYuv-impl", "([F)V", "convertYuvToRgb", "convertYuvToRgb-impl", "dot", "", "m1", "row", "", "m2", "column", "dot-Me4OoYI", "([F[FI[FI)F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "reset", "reset-impl", "rotateInternal", "degrees", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cosine", "sine", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "set", "src", "set-jHG-Opc", "([F[F)V", "v", "set-impl", "([FIIF)V", "setToRotateBlue", "setToRotateBlue-impl", "([FF)V", "setToRotateGreen", "setToRotateGreen-impl", "setToRotateRed", "setToRotateRed-impl", "setToSaturation", "sat", "setToSaturation-impl", "setToScale", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "timesAssign", "colorMatrix", "timesAssign-jHG-Opc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/ColorMatrix.class */
public final class ColorMatrix {
    @NotNull
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m2471boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static float[] m2472constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ float[] m2473constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m2472constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl  reason: not valid java name */
    public static final void m2474convertRgbToYuvimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        arg0[0] = 0.299f;
        arg0[1] = 0.587f;
        arg0[2] = 0.114f;
        arg0[5] = -0.16874f;
        arg0[6] = -0.33126f;
        arg0[7] = 0.5f;
        arg0[10] = 0.5f;
        arg0[11] = -0.41869f;
        arg0[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl  reason: not valid java name */
    public static final void m2475convertYuvToRgbimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        arg0[2] = 1.402f;
        arg0[5] = 1.0f;
        arg0[6] = -0.34414f;
        arg0[7] = -0.71414f;
        arg0[10] = 1.0f;
        arg0[11] = 1.772f;
        arg0[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI  reason: not valid java name */
    private static final float m2476dotMe4OoYI(float[] fArr, float[] fArr2, int i2, float[] fArr3, int i3) {
        int i4 = i2 * 5;
        return (fArr2[i4 + 0] * fArr3[0 + i3]) + (fArr2[i4 + 1] * fArr3[5 + i3]) + (fArr2[i4 + 2] * fArr3[10 + i3]) + (fArr2[i4 + 3] * fArr3[15 + i3]);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2477equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m2492unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2478equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final float m2479getimpl(float[] arg0, int i2, int i3) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0[(i2 * 5) + i3];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2480hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl  reason: not valid java name */
    public static final void m2481resetimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        ArraysKt___ArraysJvmKt.fill$default(arg0, 0.0f, 0, 0, 6, (Object) null);
        arg0[0] = 1.0f;
        arg0[12] = 1.0f;
        arg0[6] = 1.0f;
        arg0[18] = 1.0f;
    }

    /* renamed from: rotateInternal-impl  reason: not valid java name */
    private static final void m2482rotateInternalimpl(float[] fArr, float f2, Function2<? super Float, ? super Float, Unit> function2) {
        m2481resetimpl(fArr);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        function2.invoke(Float.valueOf((float) Math.cos(d2)), Float.valueOf((float) Math.sin(d2)));
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m2483setimpl(float[] arg0, int i2, int i3, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        arg0[(i2 * 5) + i3] = f2;
    }

    /* renamed from: set-jHG-Opc  reason: not valid java name */
    public static final void m2484setjHGOpc(float[] arg0, @NotNull float[] src) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(src, "src");
        ArraysKt___ArraysJvmKt.copyInto$default(src, arg0, 0, 0, 0, 14, (Object) null);
    }

    /* renamed from: setToRotateBlue-impl  reason: not valid java name */
    public static final void m2485setToRotateBlueimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        arg0[6] = cos;
        arg0[0] = cos;
        arg0[1] = sin;
        arg0[5] = -sin;
    }

    /* renamed from: setToRotateGreen-impl  reason: not valid java name */
    public static final void m2486setToRotateGreenimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        arg0[12] = cos;
        arg0[0] = cos;
        arg0[2] = -sin;
        arg0[10] = sin;
    }

    /* renamed from: setToRotateRed-impl  reason: not valid java name */
    public static final void m2487setToRotateRedimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        arg0[12] = cos;
        arg0[6] = cos;
        arg0[7] = sin;
        arg0[11] = -sin;
    }

    /* renamed from: setToSaturation-impl  reason: not valid java name */
    public static final void m2488setToSaturationimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        float f3 = 1 - f2;
        float f4 = 0.213f * f3;
        float f5 = 0.715f * f3;
        float f6 = f3 * 0.072f;
        arg0[0] = f4 + f2;
        arg0[1] = f5;
        arg0[2] = f6;
        arg0[5] = f4;
        arg0[6] = f5 + f2;
        arg0[7] = f6;
        arg0[10] = f4;
        arg0[11] = f5;
        arg0[12] = f6 + f2;
    }

    /* renamed from: setToScale-impl  reason: not valid java name */
    public static final void m2489setToScaleimpl(float[] arg0, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        m2481resetimpl(arg0);
        arg0[0] = f2;
        arg0[6] = f3;
        arg0[12] = f4;
        arg0[18] = f5;
    }

    /* renamed from: timesAssign-jHG-Opc  reason: not valid java name */
    public static final void m2490timesAssignjHGOpc(float[] arg0, @NotNull float[] colorMatrix) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
        float m2476dotMe4OoYI = m2476dotMe4OoYI(arg0, arg0, 0, colorMatrix, 0);
        float m2476dotMe4OoYI2 = m2476dotMe4OoYI(arg0, arg0, 0, colorMatrix, 1);
        float m2476dotMe4OoYI3 = m2476dotMe4OoYI(arg0, arg0, 0, colorMatrix, 2);
        float m2476dotMe4OoYI4 = m2476dotMe4OoYI(arg0, arg0, 0, colorMatrix, 3);
        float f2 = arg0[0];
        float f3 = colorMatrix[4];
        float f4 = arg0[1];
        float f5 = colorMatrix[9];
        float f6 = arg0[2];
        float f7 = colorMatrix[14];
        float f8 = arg0[3];
        float f9 = colorMatrix[19];
        float f10 = arg0[4];
        float m2476dotMe4OoYI5 = m2476dotMe4OoYI(arg0, arg0, 1, colorMatrix, 0);
        float m2476dotMe4OoYI6 = m2476dotMe4OoYI(arg0, arg0, 1, colorMatrix, 1);
        float m2476dotMe4OoYI7 = m2476dotMe4OoYI(arg0, arg0, 1, colorMatrix, 2);
        float m2476dotMe4OoYI8 = m2476dotMe4OoYI(arg0, arg0, 1, colorMatrix, 3);
        float f11 = arg0[5];
        float f12 = colorMatrix[4];
        float f13 = arg0[6];
        float f14 = colorMatrix[9];
        float f15 = arg0[7];
        float f16 = colorMatrix[14];
        float f17 = arg0[8];
        float f18 = colorMatrix[19];
        float f19 = arg0[9];
        float m2476dotMe4OoYI9 = m2476dotMe4OoYI(arg0, arg0, 2, colorMatrix, 0);
        float m2476dotMe4OoYI10 = m2476dotMe4OoYI(arg0, arg0, 2, colorMatrix, 1);
        float m2476dotMe4OoYI11 = m2476dotMe4OoYI(arg0, arg0, 2, colorMatrix, 2);
        float m2476dotMe4OoYI12 = m2476dotMe4OoYI(arg0, arg0, 2, colorMatrix, 3);
        float f20 = arg0[10];
        float f21 = colorMatrix[4];
        float f22 = arg0[11];
        float f23 = colorMatrix[9];
        float f24 = arg0[12];
        float f25 = colorMatrix[14];
        float f26 = arg0[13];
        float f27 = colorMatrix[19];
        float f28 = arg0[14];
        float m2476dotMe4OoYI13 = m2476dotMe4OoYI(arg0, arg0, 3, colorMatrix, 0);
        float m2476dotMe4OoYI14 = m2476dotMe4OoYI(arg0, arg0, 3, colorMatrix, 1);
        float m2476dotMe4OoYI15 = m2476dotMe4OoYI(arg0, arg0, 3, colorMatrix, 2);
        float m2476dotMe4OoYI16 = m2476dotMe4OoYI(arg0, arg0, 3, colorMatrix, 3);
        float f29 = arg0[15];
        float f30 = colorMatrix[4];
        float f31 = arg0[16];
        float f32 = colorMatrix[9];
        float f33 = arg0[17];
        float f34 = colorMatrix[14];
        float f35 = arg0[18];
        float f36 = colorMatrix[19];
        float f37 = arg0[19];
        arg0[0] = m2476dotMe4OoYI;
        arg0[1] = m2476dotMe4OoYI2;
        arg0[2] = m2476dotMe4OoYI3;
        arg0[3] = m2476dotMe4OoYI4;
        arg0[4] = (f2 * f3) + (f4 * f5) + (f6 * f7) + (f8 * f9) + f10;
        arg0[5] = m2476dotMe4OoYI5;
        arg0[6] = m2476dotMe4OoYI6;
        arg0[7] = m2476dotMe4OoYI7;
        arg0[8] = m2476dotMe4OoYI8;
        arg0[9] = (f11 * f12) + (f13 * f14) + (f15 * f16) + (f17 * f18) + f19;
        arg0[10] = m2476dotMe4OoYI9;
        arg0[11] = m2476dotMe4OoYI10;
        arg0[12] = m2476dotMe4OoYI11;
        arg0[13] = m2476dotMe4OoYI12;
        arg0[14] = (f20 * f21) + (f22 * f23) + (f24 * f25) + (f26 * f27) + f28;
        arg0[15] = m2476dotMe4OoYI13;
        arg0[16] = m2476dotMe4OoYI14;
        arg0[17] = m2476dotMe4OoYI15;
        arg0[18] = m2476dotMe4OoYI16;
        arg0[19] = (f29 * f30) + (f31 * f32) + (f33 * f34) + (f35 * f36) + f37;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2491toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m2477equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m2480hashCodeimpl(this.values);
    }

    public String toString() {
        return m2491toStringimpl(this.values);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float[] m2492unboximpl() {
        return this.values;
    }
}
