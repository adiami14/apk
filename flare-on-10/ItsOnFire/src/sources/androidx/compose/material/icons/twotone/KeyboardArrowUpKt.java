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
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010��\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n��\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardArrowUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardArrowUp", "Landroidx/compose/material/icons/Icons$TwoTone;", "getKeyboardArrowUp", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/icons/twotone/KeyboardArrowUpKt.class */
public final class KeyboardArrowUpKt {
    @Nullable
    private static ImageVector _keyboardArrowUp;

    @NotNull
    public static final ImageVector getKeyboardArrowUp(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = _keyboardArrowUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.KeyboardArrowUp", Dp.m4785constructorimpl(24.0f), Dp.m4785constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2440getBlack0d7_KjU(), null);
        int m2711getButtKaPHkGw = StrokeCap.Companion.m2711getButtKaPHkGw();
        int m2722getBevelLxFBmk8 = StrokeJoin.Companion.m2722getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.41f, 15.41f);
        pathBuilder.lineTo(12.0f, 10.83f);
        pathBuilder.lineToRelative(4.59f, 4.58f);
        pathBuilder.lineTo(18.0f, 14.0f);
        pathBuilder.lineToRelative(-6.0f, -6.0f);
        pathBuilder.lineToRelative(-6.0f, 6.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m2954addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2711getButtKaPHkGw, m2722getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardArrowUp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
