package androidx.compose.material.icons.rounded;

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
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010��\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n��\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notifications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Notifications", "Landroidx/compose/material/icons/Icons$Rounded;", "getNotifications", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/icons/rounded/NotificationsKt.class */
public final class NotificationsKt {
    @Nullable
    private static ImageVector _notifications;

    @NotNull
    public static final ImageVector getNotifications(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = _notifications;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Notifications", Dp.m4785constructorimpl(24.0f), Dp.m4785constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2440getBlack0d7_KjU(), null);
        int m2711getButtKaPHkGw = StrokeCap.Companion.m2711getButtKaPHkGw();
        int m2722getBevelLxFBmk8 = StrokeJoin.Companion.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 22.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilder.lineTo(13.5f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(0.68f);
        pathBuilder.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-1.29f, 1.29f);
        pathBuilder.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        pathBuilder.lineTo(18.0f, 16.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2711getButtKaPHkGw, m2722getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notifications = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
