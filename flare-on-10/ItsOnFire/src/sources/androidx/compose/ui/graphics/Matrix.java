package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018�� G2\u00020\u0001:\u0001GB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b/\u0010+J+\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001e\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020��H\u0086\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ+\u0010E\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\bF\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Matrix.class */
public final class Matrix {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    @NotNull
    private final float[] values;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/Matrix$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Matrix m2587boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static float[] m2588constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ float[] m2589constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m2588constructorimpl(fArr);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2590equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m2610unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2591equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final float m2592getimpl(float[] arg0, int i2, int i3) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0[(i2 * 4) + i3];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2593hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl  reason: not valid java name */
    public static final void m2594invertimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float f2 = arg0[0];
        float f3 = arg0[1];
        float f4 = arg0[2];
        float f5 = arg0[3];
        float f6 = arg0[4];
        float f7 = arg0[5];
        float f8 = arg0[6];
        float f9 = arg0[7];
        float f10 = arg0[8];
        float f11 = arg0[9];
        float f12 = arg0[10];
        float f13 = arg0[11];
        float f14 = arg0[12];
        float f15 = arg0[13];
        float f16 = arg0[14];
        float f17 = arg0[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f18 * f29) - (f19 * f28)) + (f20 * f27)) + (f21 * f26)) - (f22 * f25)) + (f23 * f24);
        if (f30 == 0.0f) {
            return;
        }
        float f31 = 1.0f / f30;
        arg0[0] = (((f7 * f29) - (f8 * f28)) + (f9 * f27)) * f31;
        arg0[1] = ((((-f3) * f29) + (f4 * f28)) - (f5 * f27)) * f31;
        arg0[2] = (((f15 * f23) - (f16 * f22)) + (f17 * f21)) * f31;
        arg0[3] = ((((-f11) * f23) + (f12 * f22)) - (f13 * f21)) * f31;
        float f32 = -f6;
        arg0[4] = (((f32 * f29) + (f8 * f26)) - (f9 * f25)) * f31;
        arg0[5] = (((f29 * f2) - (f4 * f26)) + (f5 * f25)) * f31;
        float f33 = -f14;
        arg0[6] = (((f33 * f23) + (f16 * f20)) - (f17 * f19)) * f31;
        arg0[7] = (((f23 * f10) - (f12 * f20)) + (f13 * f19)) * f31;
        arg0[8] = (((f6 * f28) - (f7 * f26)) + (f9 * f24)) * f31;
        arg0[9] = ((((-f2) * f28) + (f26 * f3)) - (f5 * f24)) * f31;
        arg0[10] = (((f14 * f22) - (f15 * f20)) + (f17 * f18)) * f31;
        arg0[11] = ((((-f10) * f22) + (f20 * f11)) - (f13 * f18)) * f31;
        arg0[12] = (((f32 * f27) + (f7 * f25)) - (f8 * f24)) * f31;
        arg0[13] = (((f2 * f27) - (f3 * f25)) + (f4 * f24)) * f31;
        arg0[14] = (((f33 * f21) + (f15 * f19)) - (f16 * f18)) * f31;
        arg0[15] = (((f10 * f21) - (f11 * f19)) + (f12 * f18)) * f31;
    }

    /* renamed from: map-MK-Hz9U  reason: not valid java name */
    public static final long m2595mapMKHz9U(float[] arg0, long j2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float m2167getXimpl = Offset.m2167getXimpl(j2);
        float m2168getYimpl = Offset.m2168getYimpl(j2);
        float f2 = (arg0[3] * m2167getXimpl) + (arg0[7] * m2168getYimpl) + arg0[15];
        float f3 = 0.0f;
        if (!(f2 == 0.0f)) {
            f3 = 1.0f / f2;
        }
        return OffsetKt.Offset(((arg0[0] * m2167getXimpl) + (arg0[4] * m2168getYimpl) + arg0[12]) * f3, f3 * ((arg0[1] * m2167getXimpl) + (arg0[5] * m2168getYimpl) + arg0[13]));
    }

    @NotNull
    /* renamed from: map-impl  reason: not valid java name */
    public static final Rect m2596mapimpl(float[] arg0, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m2595mapMKHz9U = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m2595mapMKHz9U2 = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m2595mapMKHz9U3 = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m2595mapMKHz9U4 = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m2167getXimpl(m2595mapMKHz9U), Offset.m2167getXimpl(m2595mapMKHz9U2)), Math.min(Offset.m2167getXimpl(m2595mapMKHz9U3), Offset.m2167getXimpl(m2595mapMKHz9U4))), Math.min(Math.min(Offset.m2168getYimpl(m2595mapMKHz9U), Offset.m2168getYimpl(m2595mapMKHz9U2)), Math.min(Offset.m2168getYimpl(m2595mapMKHz9U3), Offset.m2168getYimpl(m2595mapMKHz9U4))), Math.max(Math.max(Offset.m2167getXimpl(m2595mapMKHz9U), Offset.m2167getXimpl(m2595mapMKHz9U2)), Math.max(Offset.m2167getXimpl(m2595mapMKHz9U3), Offset.m2167getXimpl(m2595mapMKHz9U4))), Math.max(Math.max(Offset.m2168getYimpl(m2595mapMKHz9U), Offset.m2168getYimpl(m2595mapMKHz9U2)), Math.max(Offset.m2168getYimpl(m2595mapMKHz9U3), Offset.m2168getYimpl(m2595mapMKHz9U4))));
    }

    /* renamed from: map-impl  reason: not valid java name */
    public static final void m2597mapimpl(float[] arg0, @NotNull MutableRect rect) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m2595mapMKHz9U = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m2595mapMKHz9U2 = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m2595mapMKHz9U3 = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m2595mapMKHz9U4 = m2595mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m2167getXimpl(m2595mapMKHz9U), Offset.m2167getXimpl(m2595mapMKHz9U2)), Math.min(Offset.m2167getXimpl(m2595mapMKHz9U3), Offset.m2167getXimpl(m2595mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m2168getYimpl(m2595mapMKHz9U), Offset.m2168getYimpl(m2595mapMKHz9U2)), Math.min(Offset.m2168getYimpl(m2595mapMKHz9U3), Offset.m2168getYimpl(m2595mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m2167getXimpl(m2595mapMKHz9U), Offset.m2167getXimpl(m2595mapMKHz9U2)), Math.max(Offset.m2167getXimpl(m2595mapMKHz9U3), Offset.m2167getXimpl(m2595mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m2168getYimpl(m2595mapMKHz9U), Offset.m2168getYimpl(m2595mapMKHz9U2)), Math.max(Offset.m2168getYimpl(m2595mapMKHz9U3), Offset.m2168getYimpl(m2595mapMKHz9U4))));
    }

    /* renamed from: reset-impl  reason: not valid java name */
    public static final void m2598resetimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                arg0[(i3 * 4) + i2] = i2 == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i2++;
        }
    }

    /* renamed from: rotateX-impl  reason: not valid java name */
    public static final void m2599rotateXimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f3 = arg0[1];
        float f4 = arg0[2];
        float f5 = arg0[5];
        float f6 = arg0[6];
        float f7 = arg0[9];
        float f8 = arg0[10];
        float f9 = arg0[13];
        float f10 = arg0[14];
        arg0[1] = (f3 * cos) - (f4 * sin);
        arg0[2] = (f3 * sin) + (f4 * cos);
        arg0[5] = (f5 * cos) - (f6 * sin);
        arg0[6] = (f5 * sin) + (f6 * cos);
        arg0[9] = (f7 * cos) - (f8 * sin);
        arg0[10] = (f7 * sin) + (f8 * cos);
        arg0[13] = (f9 * cos) - (f10 * sin);
        arg0[14] = (f9 * sin) + (f10 * cos);
    }

    /* renamed from: rotateY-impl  reason: not valid java name */
    public static final void m2600rotateYimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f3 = arg0[0];
        float f4 = arg0[2];
        float f5 = -f3;
        float f6 = arg0[4];
        float f7 = arg0[6];
        float f8 = -f6;
        float f9 = arg0[8];
        float f10 = arg0[10];
        float f11 = -f9;
        float f12 = arg0[12];
        float f13 = arg0[14];
        arg0[0] = (f3 * cos) + (f4 * sin);
        arg0[2] = (f5 * sin) + (f4 * cos);
        arg0[4] = (f6 * cos) + (f7 * sin);
        arg0[6] = (f8 * sin) + (f7 * cos);
        arg0[8] = (f9 * cos) + (f10 * sin);
        arg0[10] = (f11 * sin) + (f10 * cos);
        arg0[12] = (f12 * cos) + (f13 * sin);
        arg0[14] = ((-f12) * sin) + (f13 * cos);
    }

    /* renamed from: rotateZ-impl  reason: not valid java name */
    public static final void m2601rotateZimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f3 = arg0[0];
        float f4 = arg0[4];
        float f5 = -sin;
        float f6 = arg0[1];
        float f7 = arg0[5];
        float f8 = arg0[2];
        float f9 = arg0[6];
        float f10 = arg0[3];
        float f11 = arg0[7];
        arg0[0] = (cos * f3) + (sin * f4);
        arg0[1] = (cos * f6) + (sin * f7);
        arg0[2] = (cos * f8) + (sin * f9);
        arg0[3] = (cos * f10) + (sin * f11);
        arg0[4] = (f3 * f5) + (f4 * cos);
        arg0[5] = (f6 * f5) + (f7 * cos);
        arg0[6] = (f8 * f5) + (f9 * cos);
        arg0[7] = (f5 * f10) + (cos * f11);
    }

    /* renamed from: scale-impl  reason: not valid java name */
    public static final void m2602scaleimpl(float[] arg0, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        arg0[0] = arg0[0] * f2;
        arg0[1] = arg0[1] * f2;
        arg0[2] = arg0[2] * f2;
        arg0[3] = arg0[3] * f2;
        arg0[4] = arg0[4] * f3;
        arg0[5] = arg0[5] * f3;
        arg0[6] = arg0[6] * f3;
        arg0[7] = arg0[7] * f3;
        arg0[8] = arg0[8] * f4;
        arg0[9] = arg0[9] * f4;
        arg0[10] = arg0[10] * f4;
        arg0[11] = arg0[11] * f4;
    }

    /* renamed from: scale-impl$default  reason: not valid java name */
    public static /* synthetic */ void m2603scaleimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        m2602scaleimpl(fArr, f2, f3, f4);
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m2604setimpl(float[] arg0, int i2, int i3, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        arg0[(i2 * 4) + i3] = f2;
    }

    /* renamed from: setFrom-58bKbWc  reason: not valid java name */
    public static final void m2605setFrom58bKbWc(float[] arg0, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i2 = 0; i2 < 16; i2++) {
            arg0[i2] = matrix[i2];
        }
    }

    /* renamed from: timesAssign-58bKbWc  reason: not valid java name */
    public static final void m2606timesAssign58bKbWc(float[] arg0, @NotNull float[] m2) {
        float m2612dotp89u6pk;
        float m2612dotp89u6pk2;
        float m2612dotp89u6pk3;
        float m2612dotp89u6pk4;
        float m2612dotp89u6pk5;
        float m2612dotp89u6pk6;
        float m2612dotp89u6pk7;
        float m2612dotp89u6pk8;
        float m2612dotp89u6pk9;
        float m2612dotp89u6pk10;
        float m2612dotp89u6pk11;
        float m2612dotp89u6pk12;
        float m2612dotp89u6pk13;
        float m2612dotp89u6pk14;
        float m2612dotp89u6pk15;
        float m2612dotp89u6pk16;
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(m2, "m");
        m2612dotp89u6pk = MatrixKt.m2612dotp89u6pk(arg0, 0, m2, 0);
        m2612dotp89u6pk2 = MatrixKt.m2612dotp89u6pk(arg0, 0, m2, 1);
        m2612dotp89u6pk3 = MatrixKt.m2612dotp89u6pk(arg0, 0, m2, 2);
        m2612dotp89u6pk4 = MatrixKt.m2612dotp89u6pk(arg0, 0, m2, 3);
        m2612dotp89u6pk5 = MatrixKt.m2612dotp89u6pk(arg0, 1, m2, 0);
        m2612dotp89u6pk6 = MatrixKt.m2612dotp89u6pk(arg0, 1, m2, 1);
        m2612dotp89u6pk7 = MatrixKt.m2612dotp89u6pk(arg0, 1, m2, 2);
        m2612dotp89u6pk8 = MatrixKt.m2612dotp89u6pk(arg0, 1, m2, 3);
        m2612dotp89u6pk9 = MatrixKt.m2612dotp89u6pk(arg0, 2, m2, 0);
        m2612dotp89u6pk10 = MatrixKt.m2612dotp89u6pk(arg0, 2, m2, 1);
        m2612dotp89u6pk11 = MatrixKt.m2612dotp89u6pk(arg0, 2, m2, 2);
        m2612dotp89u6pk12 = MatrixKt.m2612dotp89u6pk(arg0, 2, m2, 3);
        m2612dotp89u6pk13 = MatrixKt.m2612dotp89u6pk(arg0, 3, m2, 0);
        m2612dotp89u6pk14 = MatrixKt.m2612dotp89u6pk(arg0, 3, m2, 1);
        m2612dotp89u6pk15 = MatrixKt.m2612dotp89u6pk(arg0, 3, m2, 2);
        m2612dotp89u6pk16 = MatrixKt.m2612dotp89u6pk(arg0, 3, m2, 3);
        arg0[0] = m2612dotp89u6pk;
        arg0[1] = m2612dotp89u6pk2;
        arg0[2] = m2612dotp89u6pk3;
        arg0[3] = m2612dotp89u6pk4;
        arg0[4] = m2612dotp89u6pk5;
        arg0[5] = m2612dotp89u6pk6;
        arg0[6] = m2612dotp89u6pk7;
        arg0[7] = m2612dotp89u6pk8;
        arg0[8] = m2612dotp89u6pk9;
        arg0[9] = m2612dotp89u6pk10;
        arg0[10] = m2612dotp89u6pk11;
        arg0[11] = m2612dotp89u6pk12;
        arg0[12] = m2612dotp89u6pk13;
        arg0[13] = m2612dotp89u6pk14;
        arg0[14] = m2612dotp89u6pk15;
        arg0[15] = m2612dotp89u6pk16;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2607toStringimpl(float[] arg0) {
        String trimIndent;
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        trimIndent = StringsKt__IndentKt.trimIndent("\n            |" + arg0[0] + ' ' + arg0[1] + ' ' + arg0[2] + ' ' + arg0[3] + "|\n            |" + arg0[4] + ' ' + arg0[5] + ' ' + arg0[6] + ' ' + arg0[7] + "|\n            |" + arg0[8] + ' ' + arg0[9] + ' ' + arg0[10] + ' ' + arg0[11] + "|\n            |" + arg0[12] + ' ' + arg0[13] + ' ' + arg0[14] + ' ' + arg0[15] + "|\n        ");
        return trimIndent;
    }

    /* renamed from: translate-impl  reason: not valid java name */
    public static final void m2608translateimpl(float[] arg0, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float f5 = arg0[0];
        float f6 = arg0[4];
        float f7 = arg0[8];
        float f8 = arg0[12];
        float f9 = arg0[1];
        float f10 = arg0[5];
        float f11 = arg0[9];
        float f12 = arg0[13];
        float f13 = arg0[2];
        float f14 = arg0[6];
        float f15 = arg0[10];
        float f16 = arg0[14];
        float f17 = arg0[3];
        float f18 = arg0[7];
        float f19 = arg0[11];
        float f20 = arg0[15];
        arg0[12] = (f5 * f2) + (f6 * f3) + (f7 * f4) + f8;
        arg0[13] = (f9 * f2) + (f10 * f3) + (f11 * f4) + f12;
        arg0[14] = (f13 * f2) + (f14 * f3) + (f15 * f4) + f16;
        arg0[15] = (f17 * f2) + (f18 * f3) + (f19 * f4) + f20;
    }

    /* renamed from: translate-impl$default  reason: not valid java name */
    public static /* synthetic */ void m2609translateimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        m2608translateimpl(fArr, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        return m2590equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m2593hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m2607toStringimpl(this.values);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float[] m2610unboximpl() {
        return this.values;
    }
}
