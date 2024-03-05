package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010��\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n��\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/icons/twotone/StarKt.class */
public final class StarKt {
    @Nullable
    private static ImageVector _star;

    @NotNull
    public static final ImageVector getStar(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Star", Dp.m4785constructorimpl(24.0f), Dp.m4785constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2440getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m2711getButtKaPHkGw = companion2.m2711getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m2722getBevelLxFBmk8 = companion3.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 15.4f);
        pathBuilder.lineToRelative(-3.76f, 2.27f);
        pathBuilder.lineToRelative(1.0f, -4.28f);
        pathBuilder.lineToRelative(-3.32f, -2.88f);
        pathBuilder.lineToRelative(4.38f, -0.38f);
        pathBuilder.lineToRelative(1.7f, -4.03f);
        pathBuilder.lineToRelative(1.71f, 4.04f);
        pathBuilder.lineToRelative(4.38f, 0.38f);
        pathBuilder.lineToRelative(-3.32f, 2.88f);
        pathBuilder.lineToRelative(1.0f, 4.28f);
        pathBuilder.close();
        ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m2711getButtKaPHkGw, m2722getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2440getBlack0d7_KjU(), null);
        int m2711getButtKaPHkGw2 = companion2.m2711getButtKaPHkGw();
        int m2722getBevelLxFBmk82 = companion3.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 9.24f);
        pathBuilder2.lineToRelative(-7.19f, -0.62f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.lineTo(9.19f, 8.63f);
        pathBuilder2.lineTo(2.0f, 9.24f);
        pathBuilder2.lineToRelative(5.46f, 4.73f);
        pathBuilder2.lineTo(5.82f, 21.0f);
        pathBuilder2.lineTo(12.0f, 17.27f);
        pathBuilder2.lineTo(18.18f, 21.0f);
        pathBuilder2.lineToRelative(-1.63f, -7.03f);
        pathBuilder2.lineTo(22.0f, 9.24f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 15.4f);
        pathBuilder2.lineToRelative(-3.76f, 2.27f);
        pathBuilder2.lineToRelative(1.0f, -4.28f);
        pathBuilder2.lineToRelative(-3.32f, -2.88f);
        pathBuilder2.lineToRelative(4.38f, -0.38f);
        pathBuilder2.lineTo(12.0f, 6.1f);
        pathBuilder2.lineToRelative(1.71f, 4.04f);
        pathBuilder2.lineToRelative(4.38f, 0.38f);
        pathBuilder2.lineToRelative(-3.32f, 2.88f);
        pathBuilder2.lineToRelative(1.0f, 4.28f);
        pathBuilder2.lineTo(12.0f, 15.4f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2711getButtKaPHkGw2, m2722getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _star = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}