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
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010��\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n��\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_warning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Warning", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWarning", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/icons/twotone/WarningKt.class */
public final class WarningKt {
    @Nullable
    private static ImageVector _warning;

    @NotNull
    public static final ImageVector getWarning(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _warning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Warning", Dp.m4785constructorimpl(24.0f), Dp.m4785constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2440getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m2711getButtKaPHkGw = companion2.m2711getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m2722getBevelLxFBmk8 = companion3.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.47f, 19.0f);
        pathBuilder.horizontalLineToRelative(15.06f);
        pathBuilder.lineTo(12.0f, 5.99f);
        pathBuilder.lineTo(4.47f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m2711getButtKaPHkGw, m2722getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2440getBlack0d7_KjU(), null);
        int m2711getButtKaPHkGw2 = companion2.m2711getButtKaPHkGw();
        int m2722getBevelLxFBmk82 = companion3.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(22.0f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.lineTo(1.0f, 21.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.47f, 19.0f);
        pathBuilder2.lineTo(12.0f, 5.99f);
        pathBuilder2.lineTo(19.53f, 19.0f);
        pathBuilder2.lineTo(4.47f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2711getButtKaPHkGw2, m2722getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _warning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
