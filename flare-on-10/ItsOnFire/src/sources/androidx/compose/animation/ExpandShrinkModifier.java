package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018��2\u00020\u0001Bt\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bø\u0001��¢\u0006\u0002\u0010\u0010J#\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\b*\u0010(J)\u0010+\u001a\u00020,*\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b2\u00103R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0012R*\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001��¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0012R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001��¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001aR1\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001e¢\u0006\u0002\b!ø\u0001��¢\u0006\b\n��\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "expand", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "shrink", "alignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getAlignment", "()Landroidx/compose/runtime/State;", "currentAlignment", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getExpand", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getShrink", "getSizeAnimation", "sizeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "sizeByState", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "targetOffsetByState", "targetOffsetByState-oFUgxo0", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/ExpandShrinkModifier.class */
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    @NotNull
    private final State<Alignment> alignment;
    @Nullable
    private Alignment currentAlignment;
    @NotNull
    private final State<ChangeSize> expand;
    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    @NotNull
    private final State<ChangeSize> shrink;
    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    @NotNull
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/ExpandShrinkModifier$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @NotNull State<ChangeSize> expand, @NotNull State<ChangeSize> shrink, @NotNull State<? extends Alignment> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                SpringSpec access$getDefaultSizeAnimationSpec$p;
                ChangeSize changeSize;
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    ChangeSize value = ExpandShrinkModifier.this.getExpand().getValue();
                    changeSize = value;
                    if (value == null) {
                        access$getDefaultSizeAnimationSpec$p = null;
                    }
                    access$getDefaultSizeAnimationSpec$p = changeSize.getAnimationSpec();
                } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    ChangeSize value2 = ExpandShrinkModifier.this.getShrink().getValue();
                    changeSize = value2;
                    if (value2 == null) {
                        access$getDefaultSizeAnimationSpec$p = null;
                    }
                    access$getDefaultSizeAnimationSpec$p = changeSize.getAnimationSpec();
                } else {
                    access$getDefaultSizeAnimationSpec$p = EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p();
                }
                SpringSpec springSpec = access$getDefaultSizeAnimationSpec$p;
                if (access$getDefaultSizeAnimationSpec$p == null) {
                    springSpec = EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p();
                }
                return springSpec;
            }
        };
    }

    @NotNull
    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    @NotNull
    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @NotNull
    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(j2);
        final long IntSize = IntSizeKt.IntSize(mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight());
        long m4955unboximpl = this.sizeAnimation.animate(this.sizeTransitionSpec, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m4943boximpl(m191invokeYEO4UFw(enterExitState));
            }

            /* renamed from: invoke-YEO4UFw  reason: not valid java name */
            public final long m191invokeYEO4UFw(@NotNull EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ExpandShrinkModifier.this.m188sizeByStateUzc_VyU(it, IntSize);
            }
        }).getValue().m4955unboximpl();
        final long m4916unboximpl = this.offsetAnimation.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                return EnterExitTransitionKt.access$getDefaultOffsetAnimationSpec$p();
            }
        }, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m4898boximpl(m193invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4  reason: not valid java name */
            public final long m193invokeBjo55l4(@NotNull EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ExpandShrinkModifier.this.m189targetOffsetByStateoFUgxo0(it, IntSize);
            }
        }).getValue().m4916unboximpl();
        Alignment alignment = this.currentAlignment;
        IntOffset m4898boximpl = alignment == null ? null : IntOffset.m4898boximpl(alignment.mo2047alignKFBX0sM(IntSize, m4955unboximpl, LayoutDirection.Ltr));
        final long m4917getZeronOccac = m4898boximpl == null ? IntOffset.Companion.m4917getZeronOccac() : m4898boximpl.m4916unboximpl();
        return MeasureScope.DefaultImpls.layout$default(receiver, IntSize.m4951getWidthimpl(m4955unboximpl), IntSize.m4950getHeightimpl(m4955unboximpl), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.place$default(layout, Placeable.this, IntOffset.m4907getXimpl(m4917getZeronOccac) + IntOffset.m4907getXimpl(m4916unboximpl), IntOffset.m4908getYimpl(m4917getZeronOccac) + IntOffset.m4908getYimpl(m4916unboximpl), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setCurrentAlignment(@Nullable Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU  reason: not valid java name */
    public final long m188sizeByStateUzc_VyU(@NotNull EnterExitState targetState, long j2) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        long m4955unboximpl = value == null ? j2 : value.getSize().invoke(IntSize.m4943boximpl(j2)).m4955unboximpl();
        ChangeSize value2 = this.shrink.getValue();
        long m4955unboximpl2 = value2 == null ? j2 : value2.getSize().invoke(IntSize.m4943boximpl(j2)).m4955unboximpl();
        int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                j2 = m4955unboximpl;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j2 = m4955unboximpl2;
            }
        }
        return j2;
    }

    /* renamed from: targetOffsetByState-oFUgxo0  reason: not valid java name */
    public final long m189targetOffsetByStateoFUgxo0(@NotNull EnterExitState targetState, long j2) {
        int i2;
        IntOffset m4898boximpl;
        long m4916unboximpl;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.currentAlignment != null && this.alignment.getValue() != null && !Intrinsics.areEqual(this.currentAlignment, this.alignment.getValue()) && (i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) != 1 && i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChangeSize value = this.shrink.getValue();
            if (value == null) {
                m4898boximpl = null;
            } else {
                long m4955unboximpl = value.getSize().invoke(IntSize.m4943boximpl(j2)).m4955unboximpl();
                Alignment value2 = getAlignment().getValue();
                Intrinsics.checkNotNull(value2);
                Alignment alignment = value2;
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                long mo2047alignKFBX0sM = alignment.mo2047alignKFBX0sM(j2, m4955unboximpl, layoutDirection);
                Alignment currentAlignment = getCurrentAlignment();
                Intrinsics.checkNotNull(currentAlignment);
                long mo2047alignKFBX0sM2 = currentAlignment.mo2047alignKFBX0sM(j2, m4955unboximpl, layoutDirection);
                m4898boximpl = IntOffset.m4898boximpl(IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(mo2047alignKFBX0sM) - IntOffset.m4907getXimpl(mo2047alignKFBX0sM2), IntOffset.m4908getYimpl(mo2047alignKFBX0sM) - IntOffset.m4908getYimpl(mo2047alignKFBX0sM2)));
            }
            if (m4898boximpl != null) {
                m4916unboximpl = m4898boximpl.m4916unboximpl();
                return m4916unboximpl;
            }
        }
        m4916unboximpl = IntOffset.Companion.m4917getZeronOccac();
        return m4916unboximpl;
    }
}
