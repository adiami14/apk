package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"�� \n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001��¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001��¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/PaddingKt.class */
public final class PaddingKt {
    @Stable
    @NotNull
    /* renamed from: PaddingValues-0680j_4  reason: not valid java name */
    public static final PaddingValues m669PaddingValues0680j_4(float f2) {
        return new PaddingValuesImpl(f2, f2, f2, f2, null);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-YgX7TsA  reason: not valid java name */
    public static final PaddingValues m670PaddingValuesYgX7TsA(float f2, float f3) {
        return new PaddingValuesImpl(f2, f3, f2, f3, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m671PaddingValuesYgX7TsA$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(0);
        }
        return m670PaddingValuesYgX7TsA(f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-a9UjIt4  reason: not valid java name */
    public static final PaddingValues m672PaddingValuesa9UjIt4(float f2, float f3, float f4, float f5) {
        return new PaddingValuesImpl(f2, f3, f4, f5, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m673PaddingValuesa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m4785constructorimpl(0);
        }
        return m672PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    @Stable
    @NotNull
    /* renamed from: absolutePadding-qDBjuR0  reason: not valid java name */
    public static final Modifier m674absolutePaddingqDBjuR0(@NotNull Modifier absolutePadding, final float f2, final float f3, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingModifier(f2, f3, f4, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding_qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("top", Dp.m4783boximpl(f3));
                inspectorInfo.getProperties().set("right", Dp.m4783boximpl(f4));
                inspectorInfo.getProperties().set("bottom", Dp.m4783boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m675absolutePaddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m4785constructorimpl(0);
        }
        return m674absolutePaddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo687calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo686calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo686calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo687calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", PaddingValues.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* renamed from: padding-3ABfNKs  reason: not valid java name */
    public static final Modifier m676padding3ABfNKs(@NotNull Modifier padding, final float f2) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f2, f2, f2, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* renamed from: padding-VpY3zN4  reason: not valid java name */
    public static final Modifier m677paddingVpY3zN4(@NotNull Modifier padding, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f2, f3, f2, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("vertical", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m678paddingVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(0);
        }
        return m677paddingVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: padding-qDBjuR0  reason: not valid java name */
    public static final Modifier m679paddingqDBjuR0(@NotNull Modifier padding, final float f2, final float f3, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f2, f3, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding_qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("start", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("top", Dp.m4783boximpl(f3));
                inspectorInfo.getProperties().set("end", Dp.m4783boximpl(f4));
                inspectorInfo.getProperties().set("bottom", Dp.m4783boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m680paddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m4785constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m4785constructorimpl(0);
        }
        return m679paddingqDBjuR0(modifier, f2, f3, f4, f5);
    }
}
