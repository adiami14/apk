package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0016\u0018�� \u00192\u00020\u0001:\u0002\u0019\u001aB\"\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001��¢\u0006\u0002\u0010\u0007B<\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001��¢\u0006\u0002\u0010\rJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u00020\u0006ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", FirebaseAnalytics.Param.DESTINATION, "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "transformSource", "transformDestination", "renderIntent", "transform", "", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDestination", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getRenderIntent-uksYyKA", "()I", "I", "getSource", "r", "", "g", "b", "v", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/Connector.class */
public class Connector {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final ColorSpace destination;
    private final int renderIntent;
    @NotNull
    private final ColorSpace source;
    @Nullable
    private final float[] transform;
    @NotNull
    private final ColorSpace transformDestination;
    @NotNull
    private final ColorSpace transformSource;

    @Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0014\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H��¢\u0006\u0002\b\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", FirebaseAnalytics.Param.DESTINATION, "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "identity", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/Connector$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4  reason: not valid java name */
        public final float[] m2792computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
            if (RenderIntent.m2801equalsimpl0(i2, RenderIntent.Companion.m2805getAbsoluteuksYyKA())) {
                long m2783getModelxdoWZVw = colorSpace.m2783getModelxdoWZVw();
                ColorModel.Companion companion = ColorModel.Companion;
                boolean m2773equalsimpl0 = ColorModel.m2773equalsimpl0(m2783getModelxdoWZVw, companion.m2780getRgbxdoWZVw());
                boolean m2773equalsimpl02 = ColorModel.m2773equalsimpl0(colorSpace2.m2783getModelxdoWZVw(), companion.m2780getRgbxdoWZVw());
                if (m2773equalsimpl0 && m2773equalsimpl02) {
                    return null;
                }
                if (m2773equalsimpl0 || m2773equalsimpl02) {
                    if (!m2773equalsimpl0) {
                        colorSpace = colorSpace2;
                    }
                    Rgb rgb = (Rgb) colorSpace;
                    float[] xyz$ui_graphics_release = m2773equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                    float[] xyz$ui_graphics_release2 = m2773equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                    return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
                }
                return null;
            }
            return null;
        }

        @NotNull
        public final Connector identity$ui_graphics_release(@NotNull final ColorSpace source) {
            Intrinsics.checkNotNullParameter(source, "source");
            final int m2807getRelativeuksYyKA = RenderIntent.Companion.m2807getRelativeuksYyKA();
            return new Connector(m2807getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(ColorSpace.this, ColorSpace.this, m2807getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                @NotNull
                public float[] transform(@NotNull float[] v2) {
                    Intrinsics.checkNotNullParameter(v2, "v");
                    return v2;
                }
            };
        }
    }

    @Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b��\u0018��2\u00020\u0001B\"\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001��¢\u0006\u0002\u0010\u0007J-\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mTransform", "", "computeTransform", "source", FirebaseAnalytics.Param.DESTINATION, "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "transform", "v", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/Connector$RgbConnector.class */
    public static final class RgbConnector extends Connector {
        @NotNull
        private final Rgb mDestination;
        @NotNull
        private final Rgb mSource;
        @NotNull
        private final float[] mTransform;

        private RgbConnector(Rgb rgb, Rgb rgb2, int i2) {
            super(rgb, rgb2, rgb, rgb2, i2, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m2793computeTransformYBCOT_4(rgb, rgb2, i2);
        }

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i2);
        }

        /* renamed from: computeTransform-YBCOT_4  reason: not valid java name */
        private final float[] m2793computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i2) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, copyOf), rgb.getTransform$ui_graphics_release());
            }
            float[] fArr = inverseTransform$ui_graphics_release;
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                fArr = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, copyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            float[] fArr2 = transform$ui_graphics_release;
            if (RenderIntent.m2801equalsimpl0(i2, RenderIntent.Companion.m2805getAbsoluteuksYyKA())) {
                fArr2 = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(fArr, fArr2);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        @NotNull
        public float[] transform(@NotNull float[] v2) {
            Intrinsics.checkNotNullParameter(v2, "v");
            v2[0] = (float) this.mSource.getEotf().invoke(Double.valueOf(v2[0])).doubleValue();
            v2[1] = (float) this.mSource.getEotf().invoke(Double.valueOf(v2[1])).doubleValue();
            v2[2] = (float) this.mSource.getEotf().invoke(Double.valueOf(v2[2])).doubleValue();
            ColorSpaceKt.mul3x3Float3(this.mTransform, v2);
            v2[0] = (float) this.mDestination.getOetf().invoke(Double.valueOf(v2[0])).doubleValue();
            v2[1] = (float) this.mDestination.getOetf().invoke(Double.valueOf(v2[1])).doubleValue();
            v2[2] = (float) this.mDestination.getOetf().invoke(Double.valueOf(v2[2])).doubleValue();
            return v2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r12, androidx.compose.ui.graphics.colorspace.ColorSpace r13, int r14) {
        /*
            r11 = this;
            r0 = r12
            long r0 = r0.m2783getModelxdoWZVw()
            r15 = r0
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r0 = androidx.compose.ui.graphics.colorspace.ColorModel.Companion
            r17 = r0
            r0 = r15
            r1 = r17
            long r1 = r1.m2780getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m2773equalsimpl0(r0, r1)
            if (r0 == 0) goto L2a
            r0 = r12
            androidx.compose.ui.graphics.colorspace.Illuminant r1 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r1 = r1.getD50()
            r2 = 0
            r3 = 2
            r4 = 0
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r0, r1, r2, r3, r4)
            r18 = r0
            goto L2d
        L2a:
            r0 = r12
            r18 = r0
        L2d:
            r0 = r13
            long r0 = r0.m2783getModelxdoWZVw()
            r1 = r17
            long r1 = r1.m2780getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m2773equalsimpl0(r0, r1)
            if (r0 == 0) goto L4e
            r0 = r13
            androidx.compose.ui.graphics.colorspace.Illuminant r1 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r1 = r1.getD50()
            r2 = 0
            r3 = 2
            r4 = 0
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r0, r1, r2, r3, r4)
            r17 = r0
            goto L51
        L4e:
            r0 = r13
            r17 = r0
        L51:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r18
            r4 = r17
            r5 = r14
            androidx.compose.ui.graphics.colorspace.Connector$Companion r6 = androidx.compose.ui.graphics.colorspace.Connector.Companion
            r7 = r12
            r8 = r13
            r9 = r14
            float[] r6 = androidx.compose.ui.graphics.colorspace.Connector.Companion.m2791access$computeTransformYBCOT_4(r6, r7, r8, r9)
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i2);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i2;
        this.transform = fArr;
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i2, fArr);
    }

    @NotNull
    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA  reason: not valid java name */
    public final int m2790getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    @NotNull
    public final ColorSpace getSource() {
        return this.source;
    }

    @NotNull
    public final float[] transform(float f2, float f3, float f4) {
        return transform(new float[]{f2, f3, f4});
    }

    @NotNull
    public float[] transform(@NotNull float[] v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        float[] xyz = this.transformSource.toXyz(v2);
        float[] fArr = this.transform;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }
}
