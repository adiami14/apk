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
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010��\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n��\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_favorite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Favorite", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFavorite", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/icons/twotone/FavoriteKt.class */
public final class FavoriteKt {
    @Nullable
    private static ImageVector _favorite;

    @NotNull
    public static final ImageVector getFavorite(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Favorite", Dp.m4785constructorimpl(24.0f), Dp.m4785constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2440getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m2711getButtKaPHkGw = companion2.m2711getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m2722getBevelLxFBmk8 = companion3.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 5.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -3.04f, 0.99f, -3.56f, 2.36f);
        pathBuilder.horizontalLineToRelative(-1.87f);
        pathBuilder.curveTo(10.54f, 5.99f, 9.04f, 5.0f, 7.5f, 5.0f);
        pathBuilder.curveTo(5.5f, 5.0f, 4.0f, 6.5f, 4.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, 2.89f, 3.14f, 5.74f, 7.9f, 10.05f);
        pathBuilder.lineToRelative(0.1f, 0.1f);
        pathBuilder.lineToRelative(0.1f, -0.1f);
        pathBuilder.curveTo(16.86f, 14.24f, 20.0f, 11.39f, 20.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, -2.0f, -1.5f, -3.5f, -3.5f, -3.5f);
        pathBuilder.close();
        ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m2711getButtKaPHkGw, m2722getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2440getBlack0d7_KjU(), null);
        int m2711getButtKaPHkGw2 = companion2.m2711getButtKaPHkGw();
        int m2722getBevelLxFBmk82 = companion3.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.5f, 3.0f);
        pathBuilder2.curveToRelative(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        pathBuilder2.curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        pathBuilder2.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        pathBuilder2.curveToRelative(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        pathBuilder2.lineTo(12.0f, 21.35f);
        pathBuilder2.lineToRelative(1.45f, -1.32f);
        pathBuilder2.curveTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        pathBuilder2.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.1f, 18.55f);
        pathBuilder2.lineToRelative(-0.1f, 0.1f);
        pathBuilder2.lineToRelative(-0.1f, -0.1f);
        pathBuilder2.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        pathBuilder2.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        pathBuilder2.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        pathBuilder2.horizontalLineToRelative(1.87f);
        pathBuilder2.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        pathBuilder2.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        pathBuilder2.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2711getButtKaPHkGw2, m2722getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
