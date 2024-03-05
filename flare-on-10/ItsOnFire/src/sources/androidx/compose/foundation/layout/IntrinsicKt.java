package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"height", "Landroidx/compose/ui/Modifier;", "intrinsicSize", "Landroidx/compose/foundation/layout/IntrinsicSize;", "requiredHeight", "requiredWidth", "width", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/IntrinsicKt.class */
public final class IntrinsicKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/IntrinsicKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            iArr[IntrinsicSize.Min.ordinal()] = 1;
            iArr[IntrinsicSize.Max.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Stable
    @NotNull
    public static final Modifier height(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        MaxIntrinsicHeightModifier maxIntrinsicHeightModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i2 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i2 == 1) {
            maxIntrinsicHeightModifier = MinIntrinsicHeightModifier.INSTANCE;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            maxIntrinsicHeightModifier = MaxIntrinsicHeightModifier.INSTANCE;
        }
        return modifier.then(maxIntrinsicHeightModifier);
    }

    @Stable
    @NotNull
    public static final Modifier requiredHeight(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        RequiredMaxIntrinsicHeightModifier requiredMaxIntrinsicHeightModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i2 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i2 == 1) {
            requiredMaxIntrinsicHeightModifier = RequiredMinIntrinsicHeightModifier.INSTANCE;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            requiredMaxIntrinsicHeightModifier = RequiredMaxIntrinsicHeightModifier.INSTANCE;
        }
        return modifier.then(requiredMaxIntrinsicHeightModifier);
    }

    @Stable
    @NotNull
    public static final Modifier requiredWidth(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        RequiredMaxIntrinsicWidthModifier requiredMaxIntrinsicWidthModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i2 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i2 == 1) {
            requiredMaxIntrinsicWidthModifier = RequiredMinIntrinsicWidthModifier.INSTANCE;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            requiredMaxIntrinsicWidthModifier = RequiredMaxIntrinsicWidthModifier.INSTANCE;
        }
        return modifier.then(requiredMaxIntrinsicWidthModifier);
    }

    @Stable
    @NotNull
    public static final Modifier width(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        MaxIntrinsicWidthModifier maxIntrinsicWidthModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i2 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i2 == 1) {
            maxIntrinsicWidthModifier = MinIntrinsicWidthModifier.INSTANCE;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            maxIntrinsicWidthModifier = MaxIntrinsicWidthModifier.INSTANCE;
        }
        return modifier.then(maxIntrinsicWidthModifier);
    }
}
