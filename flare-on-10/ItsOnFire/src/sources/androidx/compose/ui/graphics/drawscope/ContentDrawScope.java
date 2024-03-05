package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\bf\u0018��2\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/ContentDrawScope.class */
public interface ContentDrawScope extends DrawScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/drawscope/ContentDrawScope$DefaultImpls.class */
    public static final class DefaultImpls {
        /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
        public static void m2857drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap image, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2, int i3) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            DrawScope.DefaultImpls.m2881drawImageAZ2fEMs(contentDrawScope, image, j2, j3, j4, j5, f2, style, colorFilter, i2, i3);
        }

        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m2858getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2896getCenterF1C5BW0(contentDrawScope);
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public static long m2859getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2897getSizeNHjbRc(contentDrawScope);
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m2860roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2899roundToPxR2X_6o(contentDrawScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m2861roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2900roundToPx0680j_4(contentDrawScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m2862toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2901toDpGaN1DYA(contentDrawScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2863toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2902toDpu2uoSUM(contentDrawScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2864toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2903toDpu2uoSUM((DrawScope) contentDrawScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m2865toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2904toDpSizekrfVVM(contentDrawScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m2866toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2905toPxR2X_6o(contentDrawScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m2867toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2906toPx0680j_4(contentDrawScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return DrawScope.DefaultImpls.toRect(contentDrawScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m2868toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2907toSizeXkaWNTQ(contentDrawScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m2869toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2908toSp0xMU5do(contentDrawScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2870toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2909toSpkPz2Gy4(contentDrawScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2871toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m2910toSpkPz2Gy4((DrawScope) contentDrawScope, i2);
        }
    }

    void drawContent();
}
