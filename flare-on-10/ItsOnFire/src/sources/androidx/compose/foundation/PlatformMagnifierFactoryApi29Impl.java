package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\bÁ\u0002\u0018��2\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "()V", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "style", "Landroidx/compose/foundation/MagnifierStyle;", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(29)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/PlatformMagnifierFactoryApi29Impl.class */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    @NotNull
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "magnifier", "Landroid/widget/Magnifier;", "(Landroid/widget/Magnifier;)V", "update", "", "sourceCenter", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "zoom", "", "update-Wko1d7g", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @RequiresApi(29)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl.class */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformMagnifierImpl(@NotNull Magnifier magnifier) {
            super(magnifier);
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo416updateWko1d7g(long j2, long j3, float f2) {
            if (!Float.isNaN(f2)) {
                getMagnifier().setZoom(f2);
            }
            boolean m2186isSpecifiedk4lQ0M = OffsetKt.m2186isSpecifiedk4lQ0M(j3);
            Magnifier magnifier = getMagnifier();
            if (m2186isSpecifiedk4lQ0M) {
                magnifier.show(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2), Offset.m2167getXimpl(j3), Offset.m2168getYimpl(j3));
            } else {
                magnifier.show(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @NotNull
    public PlatformMagnifierImpl create(@NotNull MagnifierStyle style, @NotNull View view, @NotNull Density density, float f2) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        if (Intrinsics.areEqual(style, MagnifierStyle.Companion.getTextDefault())) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long mo525toSizeXkaWNTQ = density.mo525toSizeXkaWNTQ(style.m412getSizeMYxV2XQ$foundation_release());
        float mo524toPx0680j_4 = density.mo524toPx0680j_4(style.m410getCornerRadiusD9Ej5fM$foundation_release());
        float mo524toPx0680j_42 = density.mo524toPx0680j_4(style.m411getElevationD9Ej5fM$foundation_release());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo525toSizeXkaWNTQ != Size.Companion.m2247getUnspecifiedNHjbRc()) {
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m2239getWidthimpl(mo525toSizeXkaWNTQ));
            roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m2236getHeightimpl(mo525toSizeXkaWNTQ));
            builder.setSize(roundToInt, roundToInt2);
        }
        if (!Float.isNaN(mo524toPx0680j_4)) {
            builder.setCornerRadius(mo524toPx0680j_4);
        }
        if (!Float.isNaN(mo524toPx0680j_42)) {
            builder.setElevation(mo524toPx0680j_42);
        }
        if (!Float.isNaN(f2)) {
            builder.setInitialZoom(f2);
        }
        builder.setClippingEnabled(style.getClippingEnabled$foundation_release());
        Magnifier build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(build);
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }
}
