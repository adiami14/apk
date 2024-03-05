package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��:\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u0012\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001\u001aW\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001��\u001aY\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"isPlatformMagnifierSupported", "", "sdkVersion", "", "magnifier", "Landroidx/compose/ui/Modifier;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "zoom", "", "style", "Landroidx/compose/foundation/MagnifierStyle;", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/MagnifierKt.class */
public final class MagnifierKt {
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i2) {
        return i2 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.Modifier] */
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull final Function1<? super Density, Offset> sourceCenter, @NotNull final Function1<? super Density, Offset> magnifierCenter, final float f2, @NotNull final MagnifierStyle style) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1<InspectorInfo, Unit> noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", Function1.this);
                inspectorInfo.getProperties().set("magnifierCenter", magnifierCenter);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f2));
                inspectorInfo.getProperties().set("style", style);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.Companion;
        Modifier.Companion companion2 = companion;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            companion2 = magnifier(companion, sourceCenter, magnifierCenter, f2, style, PlatformMagnifierFactory.Companion.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, companion2);
    }

    @RequiresApi(28)
    @SuppressLint({"ModifierInspectorInfo"})
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull Function1<? super Density, Offset> sourceCenter, @NotNull Function1<? super Density, Offset> magnifierCenter, float f2, @NotNull MagnifierStyle style, @NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new MagnifierKt$magnifier$4(sourceCenter, magnifierCenter, f2, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f2, MagnifierStyle magnifierStyle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function12 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Offset invoke(Density density) {
                    return Offset.m2156boximpl(m398invoketuRUvjQ(density));
                }

                /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
                public final long m398invoketuRUvjQ(@NotNull Density density) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    return Offset.Companion.m2182getUnspecifiedF1C5BW0();
                }
            };
        }
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            magnifierStyle = MagnifierStyle.Companion.getDefault();
        }
        return magnifier(modifier, function1, function12, f2, magnifierStyle);
    }
}
