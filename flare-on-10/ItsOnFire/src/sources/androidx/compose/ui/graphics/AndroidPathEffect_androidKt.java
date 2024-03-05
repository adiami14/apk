package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import androidx.compose.ui.graphics.StampedPathEffectStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��8\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H��\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H��\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H��\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0001\u001a\u0019\u0010\u0015\u001a\u00020\u0016*\u00020\u0010H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"actualChainPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "actualCornerPathEffect", "radius", "", "actualDashPathEffect", "intervals", "", "phase", "actualStampedPathEffect", "shape", "Landroidx/compose/ui/graphics/Path;", "advance", "style", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "actualStampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "asAndroidPathEffect", "Landroid/graphics/PathEffect;", "toAndroidPathDashPathEffectStyle", "Landroid/graphics/PathDashPathEffect$Style;", "toAndroidPathDashPathEffectStyle-oQv6xUo", "(I)Landroid/graphics/PathDashPathEffect$Style;", "toComposePathEffect", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidPathEffect_androidKt.class */
public final class AndroidPathEffect_androidKt {
    @NotNull
    public static final PathEffect actualChainPathEffect(@NotNull PathEffect outer, @NotNull PathEffect inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        return new AndroidPathEffect(new ComposePathEffect(((AndroidPathEffect) outer).getNativePathEffect(), ((AndroidPathEffect) inner).getNativePathEffect()));
    }

    @NotNull
    public static final PathEffect actualCornerPathEffect(float f2) {
        return new AndroidPathEffect(new CornerPathEffect(f2));
    }

    @NotNull
    public static final PathEffect actualDashPathEffect(@NotNull float[] intervals, float f2) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        return new AndroidPathEffect(new DashPathEffect(intervals, f2));
    }

    @NotNull
    /* renamed from: actualStampedPathEffect-7aD1DOk  reason: not valid java name */
    public static final PathEffect m2311actualStampedPathEffect7aD1DOk(@NotNull Path shape, float f2, float f3, int i2) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (shape instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) shape).getInternalPath(), f2, f3, m2312toAndroidPathDashPathEffectStyleoQv6xUo(i2)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final android.graphics.PathEffect asAndroidPathEffect(@NotNull PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(pathEffect, "<this>");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    @NotNull
    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo  reason: not valid java name */
    public static final PathDashPathEffect.Style m2312toAndroidPathDashPathEffectStyleoQv6xUo(int i2) {
        PathDashPathEffect.Style style;
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        if (StampedPathEffectStyle.m2696equalsimpl0(i2, companion.m2700getMorphYpspkwk())) {
            style = PathDashPathEffect.Style.MORPH;
        } else if (StampedPathEffectStyle.m2696equalsimpl0(i2, companion.m2701getRotateYpspkwk())) {
            style = PathDashPathEffect.Style.ROTATE;
        } else {
            StampedPathEffectStyle.m2696equalsimpl0(i2, companion.m2702getTranslateYpspkwk());
            style = PathDashPathEffect.Style.TRANSLATE;
        }
        return style;
    }

    @NotNull
    public static final PathEffect toComposePathEffect(@NotNull android.graphics.PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(pathEffect, "<this>");
        return new AndroidPathEffect(pathEffect);
    }
}
