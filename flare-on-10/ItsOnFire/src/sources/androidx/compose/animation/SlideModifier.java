package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018��2\u00020\u0001BF\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tø\u0001��¢\u0006\u0002\u0010\fJ#\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b&\u0010'R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001��¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0010R1\u0010\u0012\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u0013¢\u0006\u0002\b\u0016ø\u0001��¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "lazyAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "slideIn", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideOut", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getLazyAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSlideIn", "()Landroidx/compose/runtime/State;", "getSlideOut", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "targetValueByState", "targetState", "fullSize", "Landroidx/compose/ui/unit/IntSize;", "targetValueByState-oFUgxo0", "(Landroidx/compose/animation/EnterExitState;J)J", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/SlideModifier.class */
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;
    @NotNull
    private final State<Slide> slideIn;
    @NotNull
    private final State<Slide> slideOut;
    @NotNull
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/SlideModifier$WhenMappings.class */
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

    public SlideModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation, @NotNull State<Slide> slideIn, @NotNull State<Slide> slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.lazyAnimation = lazyAnimation;
        this.slideIn = slideIn;
        this.slideOut = slideOut;
        this.transitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
                if (r6 == null) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
                if (r6 == null) goto L11;
             */
            @Override // kotlin.jvm.functions.Function1
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> invoke(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r5) {
                /*
                    r4 = this;
                    r0 = r5
                    java.lang.String r1 = "$this$null"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PreEnter
                    r6 = r0
                    androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.Visible
                    r7 = r0
                    r0 = r5
                    r1 = r6
                    r2 = r7
                    boolean r0 = r0.isTransitioningTo(r1, r2)
                    r8 = r0
                    r0 = 0
                    r9 = r0
                    r0 = 0
                    r6 = r0
                    r0 = r8
                    if (r0 == 0) goto L47
                    r0 = r4
                    androidx.compose.animation.SlideModifier r0 = androidx.compose.animation.SlideModifier.this
                    androidx.compose.runtime.State r0 = r0.getSlideIn()
                    java.lang.Object r0 = r0.getValue()
                    androidx.compose.animation.Slide r0 = (androidx.compose.animation.Slide) r0
                    r5 = r0
                    r0 = r5
                    if (r0 != 0) goto L39
                    goto L3e
                L39:
                    r0 = r5
                    androidx.compose.animation.core.FiniteAnimationSpec r0 = r0.getAnimationSpec()
                    r6 = r0
                L3e:
                    r0 = r6
                    r5 = r0
                    r0 = r6
                    if (r0 != 0) goto L7d
                    goto L79
                L47:
                    r0 = r5
                    r1 = r7
                    androidx.compose.animation.EnterExitState r2 = androidx.compose.animation.EnterExitState.PostExit
                    boolean r0 = r0.isTransitioningTo(r1, r2)
                    if (r0 == 0) goto L79
                    r0 = r4
                    androidx.compose.animation.SlideModifier r0 = androidx.compose.animation.SlideModifier.this
                    androidx.compose.runtime.State r0 = r0.getSlideOut()
                    java.lang.Object r0 = r0.getValue()
                    androidx.compose.animation.Slide r0 = (androidx.compose.animation.Slide) r0
                    r5 = r0
                    r0 = r5
                    if (r0 != 0) goto L6e
                    r0 = r9
                    r6 = r0
                    goto L73
                L6e:
                    r0 = r5
                    androidx.compose.animation.core.FiniteAnimationSpec r0 = r0.getAnimationSpec()
                    r6 = r0
                L73:
                    r0 = r6
                    r5 = r0
                    r0 = r6
                    if (r0 != 0) goto L7d
                L79:
                    androidx.compose.animation.core.SpringSpec r0 = androidx.compose.animation.EnterExitTransitionKt.access$getDefaultOffsetAnimationSpec$p()
                    r5 = r0
                L7d:
                    r0 = r5
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SlideModifier$transitionSpec$1.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
            }
        };
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    @NotNull
    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    @NotNull
    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(j2);
        final long IntSize = IntSizeKt.IntSize(mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight());
        return MeasureScope.DefaultImpls.layout$default(receiver, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SlideModifier$measure$1
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
                Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation = SlideModifier.this.getLazyAnimation();
                Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec = SlideModifier.this.getTransitionSpec();
                final SlideModifier slideModifier = SlideModifier.this;
                final long j3 = IntSize;
                Placeable.PlacementScope.m3965placeWithLayeraW9wM$default(layout, mo3910measureBRTryo0, lazyAnimation.animate(transitionSpec, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                        return IntOffset.m4898boximpl(m213invokeBjo55l4(enterExitState));
                    }

                    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
                    public final long m213invokeBjo55l4(@NotNull EnterExitState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return SlideModifier.this.m211targetValueByStateoFUgxo0(it, j3);
                    }
                }).getValue().m4916unboximpl(), 0.0f, null, 6, null);
            }
        }, 4, null);
    }

    /* renamed from: targetValueByState-oFUgxo0  reason: not valid java name */
    public final long m211targetValueByStateoFUgxo0(@NotNull EnterExitState targetState, long j2) {
        Function1<IntSize, IntOffset> slideOffset;
        IntOffset invoke;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        IntOffset invoke2 = (value == null || (slideOffset = value.getSlideOffset()) == null) ? null : slideOffset.invoke(IntSize.m4943boximpl(j2));
        long m4917getZeronOccac = invoke2 == null ? IntOffset.Companion.m4917getZeronOccac() : invoke2.m4916unboximpl();
        Slide value2 = this.slideOut.getValue();
        if (value2 == null) {
            invoke = null;
        } else {
            Function1<IntSize, IntOffset> slideOffset2 = value2.getSlideOffset();
            invoke = slideOffset2 == null ? null : slideOffset2.invoke(IntSize.m4943boximpl(j2));
        }
        long m4917getZeronOccac2 = invoke == null ? IntOffset.Companion.m4917getZeronOccac() : invoke.m4916unboximpl();
        int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i2 == 1) {
            m4917getZeronOccac = IntOffset.Companion.m4917getZeronOccac();
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m4917getZeronOccac = m4917getZeronOccac2;
        }
        return m4917getZeronOccac;
    }
}
