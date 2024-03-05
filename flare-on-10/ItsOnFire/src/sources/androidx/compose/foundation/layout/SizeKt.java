package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��H\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a-\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010 \u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010!\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010\"\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a!\u0010#\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a-\u0010&\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001f\u001a!\u0010*\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b+\u0010%\u001a-\u0010,\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u0010%\u001a)\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b2\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aA\u00106\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b<\u0010%\u001a-\u0010=\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b>\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b?\u0010%\u001a)\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b@\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\bA\u00105\u001aA\u0010B\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\bC\u0010:\u001a!\u00101\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\bD\u0010%\u001a-\u0010E\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\bF\u0010\u001f\u001a \u0010G\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010H\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010I\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\"\u000e\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillModifier;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentModifier;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "createFillHeightModifier", "fraction", "", "createFillSizeModifier", "createFillWidthModifier", "createWrapContentHeightModifier", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "createWrapContentSizeModifier", "Landroidx/compose/ui/Alignment;", "createWrapContentWidthModifier", "Landroidx/compose/ui/Alignment$Horizontal;", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "wrapContentSize", "wrapContentWidth", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/SizeKt.class */
public final class SizeKt {
    @NotNull
    private static final WrapContentModifier WrapContentHeightCenter;
    @NotNull
    private static final WrapContentModifier WrapContentHeightTop;
    @NotNull
    private static final WrapContentModifier WrapContentSizeCenter;
    @NotNull
    private static final WrapContentModifier WrapContentSizeTopStart;
    @NotNull
    private static final WrapContentModifier WrapContentWidthCenter;
    @NotNull
    private static final WrapContentModifier WrapContentWidthStart;
    @NotNull
    private static final FillModifier FillWholeMaxWidth = createFillWidthModifier(1.0f);
    @NotNull
    private static final FillModifier FillWholeMaxHeight = createFillHeightModifier(1.0f);
    @NotNull
    private static final FillModifier FillWholeMaxSize = createFillSizeModifier(1.0f);

    static {
        Alignment.Companion companion = Alignment.Companion;
        WrapContentWidthCenter = createWrapContentWidthModifier(companion.getCenterHorizontally(), false);
        WrapContentWidthStart = createWrapContentWidthModifier(companion.getStart(), false);
        WrapContentHeightCenter = createWrapContentHeightModifier(companion.getCenterVertically(), false);
        WrapContentHeightTop = createWrapContentHeightModifier(companion.getTop(), false);
        WrapContentSizeCenter = createWrapContentSizeModifier(companion.getCenter(), false);
        WrapContentSizeTopStart = createWrapContentSizeModifier(companion.getTopStart(), false);
    }

    private static final FillModifier createFillHeightModifier(final float f2) {
        return new FillModifier(Direction.Vertical, f2, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillHeightModifier$1
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxHeight");
                $receiver.getProperties().set("fraction", Float.valueOf(f2));
            }
        });
    }

    private static final FillModifier createFillSizeModifier(final float f2) {
        return new FillModifier(Direction.Both, f2, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillSizeModifier$1
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxSize");
                $receiver.getProperties().set("fraction", Float.valueOf(f2));
            }
        });
    }

    private static final FillModifier createFillWidthModifier(final float f2) {
        return new FillModifier(Direction.Horizontal, f2, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$createFillWidthModifier$1
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxWidth");
                $receiver.getProperties().set("fraction", Float.valueOf(f2));
            }
        });
    }

    private static final WrapContentModifier createWrapContentHeightModifier(final Alignment.Vertical vertical, final boolean z) {
        return new WrapContentModifier(Direction.Vertical, z, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m4898boximpl(m734invoke5SAbXVA(intSize.m4955unboximpl(), layoutDirection));
            }

            /* renamed from: invoke-5SAbXVA  reason: not valid java name */
            public final long m734invoke5SAbXVA(long j2, @NotNull LayoutDirection noName_1) {
                Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                return IntOffsetKt.IntOffset(0, Alignment.Vertical.this.align(0, IntSize.m4950getHeightimpl(j2)));
            }
        }, vertical, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$2
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentHeight");
                $receiver.getProperties().set("align", Alignment.Vertical.this);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z));
            }
        });
    }

    private static final WrapContentModifier createWrapContentSizeModifier(final Alignment alignment, final boolean z) {
        return new WrapContentModifier(Direction.Both, z, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m4898boximpl(m735invoke5SAbXVA(intSize.m4955unboximpl(), layoutDirection));
            }

            /* renamed from: invoke-5SAbXVA  reason: not valid java name */
            public final long m735invoke5SAbXVA(long j2, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return Alignment.this.mo2047alignKFBX0sM(IntSize.Companion.m4956getZeroYbymL2g(), j2, layoutDirection);
            }
        }, alignment, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$2
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentSize");
                $receiver.getProperties().set("align", Alignment.this);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z));
            }
        });
    }

    private static final WrapContentModifier createWrapContentWidthModifier(final Alignment.Horizontal horizontal, final boolean z) {
        return new WrapContentModifier(Direction.Horizontal, z, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m4898boximpl(m736invoke5SAbXVA(intSize.m4955unboximpl(), layoutDirection));
            }

            /* renamed from: invoke-5SAbXVA  reason: not valid java name */
            public final long m736invoke5SAbXVA(long j2, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return IntOffsetKt.IntOffset(Alignment.Horizontal.this.align(0, IntSize.m4951getWidthimpl(j2), layoutDirection), 0);
            }
        }, horizontal, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$2
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentWidth");
                $receiver.getProperties().set("align", Alignment.Horizontal.this);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z));
            }
        });
    }

    @Stable
    @NotNull
    /* renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m710defaultMinSizeVpY3zN4(@NotNull Modifier defaultMinSize, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsModifier(f2, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$defaultMinSize_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("defaultMinSize");
                inspectorInfo.getProperties().set("minWidth", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("minHeight", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m711defaultMinSizeVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m710defaultMinSizeVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxHeight(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxHeight : createFillHeightModifier(f2));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return fillMaxHeight(modifier, f2);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxSize(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxSize : createFillSizeModifier(f2));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return fillMaxSize(modifier, f2);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxWidth(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxWidth : createFillWidthModifier(f2));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return fillMaxWidth(modifier, f2);
    }

    @Stable
    @NotNull
    /* renamed from: height-3ABfNKs */
    public static final Modifier m712height3ABfNKs(@NotNull Modifier height, final float f2) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        return height.then(new SizeModifier(0.0f, f2, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    @NotNull
    /* renamed from: heightIn-VpY3zN4 */
    public static final Modifier m713heightInVpY3zN4(@NotNull Modifier heightIn, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new SizeModifier(0.0f, f2, 0.0f, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("max", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m714heightInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m713heightInVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: requiredHeight-3ABfNKs */
    public static final Modifier m715requiredHeight3ABfNKs(@NotNull Modifier requiredHeight, final float f2) {
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        return requiredHeight.then(new SizeModifier(0.0f, f2, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m716requiredHeightInVpY3zN4(@NotNull Modifier requiredHeightIn, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new SizeModifier(0.0f, f2, 0.0f, f3, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("max", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m717requiredHeightInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m716requiredHeightInVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: requiredSize-3ABfNKs */
    public static final Modifier m718requiredSize3ABfNKs(@NotNull Modifier requiredSize, final float f2) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f2, f2, f2, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredSize-6HolHcs */
    public static final Modifier m719requiredSize6HolHcs(@NotNull Modifier requiredSize, long j2) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m720requiredSizeVpY3zN4(requiredSize, DpSize.m4886getWidthD9Ej5fM(j2), DpSize.m4884getHeightD9Ej5fM(j2));
    }

    @Stable
    @NotNull
    /* renamed from: requiredSize-VpY3zN4 */
    public static final Modifier m720requiredSizeVpY3zN4(@NotNull Modifier requiredSize, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f2, f3, f2, f3, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("height", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m721requiredSizeInqDBjuR0(@NotNull Modifier requiredSizeIn, final float f2, final float f3, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new SizeModifier(f2, f3, f4, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn_qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("minHeight", Dp.m4783boximpl(f3));
                inspectorInfo.getProperties().set("maxWidth", Dp.m4783boximpl(f4));
                inspectorInfo.getProperties().set("maxHeight", Dp.m4783boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m722requiredSizeInqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m721requiredSizeInqDBjuR0(modifier, f2, f3, f4, f5);
    }

    @Stable
    @NotNull
    /* renamed from: requiredWidth-3ABfNKs */
    public static final Modifier m723requiredWidth3ABfNKs(@NotNull Modifier requiredWidth, final float f2) {
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new SizeModifier(f2, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredWidthIn-VpY3zN4 */
    public static final Modifier m724requiredWidthInVpY3zN4(@NotNull Modifier requiredWidthIn, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.then(new SizeModifier(f2, 0.0f, f3, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("max", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m725requiredWidthInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m724requiredWidthInVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: size-3ABfNKs */
    public static final Modifier m726size3ABfNKs(@NotNull Modifier size, final float f2) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f2, f2, f2, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* renamed from: size-6HolHcs */
    public static final Modifier m727size6HolHcs(@NotNull Modifier size, long j2) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m728sizeVpY3zN4(size, DpSize.m4886getWidthD9Ej5fM(j2), DpSize.m4884getHeightD9Ej5fM(j2));
    }

    @Stable
    @NotNull
    /* renamed from: size-VpY3zN4 */
    public static final Modifier m728sizeVpY3zN4(@NotNull Modifier size, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f2, f3, f2, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("height", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m729sizeInqDBjuR0(@NotNull Modifier sizeIn, final float f2, final float f3, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new SizeModifier(f2, f3, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn_qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("minHeight", Dp.m4783boximpl(f3));
                inspectorInfo.getProperties().set("maxWidth", Dp.m4783boximpl(f4));
                inspectorInfo.getProperties().set("maxHeight", Dp.m4783boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m730sizeInqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m729sizeInqDBjuR0(modifier, f2, f3, f4, f5);
    }

    @Stable
    @NotNull
    /* renamed from: width-3ABfNKs */
    public static final Modifier m731width3ABfNKs(@NotNull Modifier width, final float f2) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        return width.then(new SizeModifier(f2, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width_3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    @NotNull
    /* renamed from: widthIn-VpY3zN4 */
    public static final Modifier m732widthInVpY3zN4(@NotNull Modifier widthIn, final float f2, final float f3) {
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new SizeModifier(f2, 0.0f, f3, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn_VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", Dp.m4783boximpl(f2));
                inspectorInfo.getProperties().set("max", Dp.m4783boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m733widthInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m4805getUnspecifiedD9Ej5fM();
        }
        return m732widthInVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentHeight(@NotNull Modifier modifier, @NotNull Alignment.Vertical align, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenterVertically()) || z) ? (!Intrinsics.areEqual(align, companion.getTop()) || z) ? createWrapContentHeightModifier(align, z) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentSize(@NotNull Modifier modifier, @NotNull Alignment align, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenter()) || z) ? (!Intrinsics.areEqual(align, companion.getTopStart()) || z) ? createWrapContentSizeModifier(align, z) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentWidth(@NotNull Modifier modifier, @NotNull Alignment.Horizontal align, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenterHorizontally()) || z) ? (!Intrinsics.areEqual(align, companion.getStart()) || z) ? createWrapContentWidthModifier(align, z) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }
}
