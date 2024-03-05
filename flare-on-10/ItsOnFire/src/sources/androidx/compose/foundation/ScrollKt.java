package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AndroidOverScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.OverScrollController;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import j.l;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��8\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH��\u001a2\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u001a6\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a2\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f\"\u000e\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"HorizontalScrollableClipModifier", "Landroidx/compose/ui/Modifier;", "MaxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "VerticalScrollableClipModifier", "rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "assertNotNestingScrollableContainers", "", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "", "assertNotNestingScrollableContainers-K40F9xA", "(JZ)V", "clipScrollableContainer", "horizontalScroll", "state", "enabled", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "verticalScroll", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/ScrollKt.class */
public final class ScrollKt {
    @NotNull
    private static final Modifier HorizontalScrollableClipModifier;
    private static final float MaxSupportedElevation = Dp.m4785constructorimpl(30);
    @NotNull
    private static final Modifier VerticalScrollableClipModifier;

    static {
        Modifier.Companion companion = Modifier.Companion;
        HorizontalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ScrollKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            @NotNull
            /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
            public Outline mo426createOutlinePq9zytI(long j2, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                float f2;
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                f2 = ScrollKt.MaxSupportedElevation;
                float mo518roundToPx0680j_4 = density.mo518roundToPx0680j_4(f2);
                return new Outline.Rectangle(new Rect(0.0f, -mo518roundToPx0680j_4, Size.m2239getWidthimpl(j2), Size.m2236getHeightimpl(j2) + mo518roundToPx0680j_4));
            }
        });
        VerticalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ScrollKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            @NotNull
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo426createOutlinePq9zytI(long j2, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                float f2;
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                f2 = ScrollKt.MaxSupportedElevation;
                float mo518roundToPx0680j_4 = density.mo518roundToPx0680j_4(f2);
                return new Outline.Rectangle(new Rect(-mo518roundToPx0680j_4, 0.0f, Size.m2239getWidthimpl(j2) + mo518roundToPx0680j_4, Size.m2236getHeightimpl(j2)));
            }
        });
    }

    /* renamed from: assertNotNestingScrollableContainers-K40F9xA */
    public static final void m425assertNotNestingScrollableContainersK40F9xA(long j2, boolean z) {
        boolean z2 = true;
        if (!z) {
            if (!(Constraints.m4752getMaxWidthimpl(j2) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (Constraints.m4751getMaxHeightimpl(j2) == Integer.MAX_VALUE) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    @NotNull
    public static final Modifier clipScrollableContainer(@NotNull Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(z ? VerticalScrollableClipModifier : HorizontalScrollableClipModifier);
    }

    @NotNull
    public static final Modifier horizontalScroll(@NotNull Modifier modifier, @NotNull ScrollState state, boolean z, @Nullable FlingBehavior flingBehavior, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z2, flingBehavior, z, false);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    @Composable
    @NotNull
    public static final ScrollState rememberScrollState(int i2, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(122203352);
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        final int i5 = i2;
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) ScrollState.Companion.getSaver(), (String) null, (Function0<? extends Object>) new Function0<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ScrollState invoke() {
                return new ScrollState(i5);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, final ScrollState scrollState, final boolean z, final FlingBehavior flingBehavior, final boolean z2, final boolean z3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("scroll");
                inspectorInfo.getProperties().set("state", ScrollState.this);
                inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1641237764);
                boolean z4 = false;
                OverScrollController rememberOverScrollController = AndroidOverScrollKt.rememberOverScrollController(composer, 0);
                composer.startReplaceableGroup(-723524056);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                }
                composer.endReplaceableGroup();
                final u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) compositionScopedCoroutineScopeCanceller).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier.Companion companion = Modifier.Companion;
                final boolean z5 = z2;
                final boolean z6 = z;
                final boolean z7 = z3;
                final ScrollState scrollState2 = scrollState;
                Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        if (z5) {
                            final ScrollState scrollState3 = scrollState2;
                            Function0<Float> function0 = new Function0<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(ScrollState.this.getValue());
                                }
                            };
                            final ScrollState scrollState4 = scrollState2;
                            ScrollAxisRange scrollAxisRange = new ScrollAxisRange(function0, new Function0<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(ScrollState.this.getMaxValue());
                                }
                            }, z6);
                            if (z7) {
                                SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                            } else {
                                SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                            }
                            final u0 u0Var = coroutineScope;
                            final boolean z8 = z7;
                            final ScrollState scrollState5 = scrollState2;
                            SemanticsPropertiesKt.scrollBy$default(semantics, null, new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1

                                @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                                @DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {284, 286}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: ItsOnFire.jar:androidx/compose/foundation/ScrollKt$scroll$2$semantics$1$1$1.class */
                                public static final class C00051 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ boolean $isVertical;
                                    public final /* synthetic */ ScrollState $state;
                                    public final /* synthetic */ float $x;
                                    public final /* synthetic */ float $y;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C00051(boolean z, ScrollState scrollState, float f2, float f3, Continuation<? super C00051> continuation) {
                                        super(2, continuation);
                                        this.$isVertical = z;
                                        this.$state = scrollState;
                                        this.$y = f2;
                                        this.$x = f3;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new C00051(this.$isVertical, this.$state, this.$y, this.$x, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                        return ((C00051) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended;
                                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = this.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            if (this.$isVertical) {
                                                ScrollState scrollState = this.$state;
                                                float f2 = this.$y;
                                                this.label = 1;
                                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f2, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                ScrollState scrollState2 = this.$state;
                                                float f3 = this.$x;
                                                this.label = 2;
                                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f3, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else if (i2 != 1 && i2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @NotNull
                                public final Boolean invoke(float f2, float f3) {
                                    l.f(u0.this, null, null, new C00051(z8, scrollState5, f3, f2, null), 3, null);
                                    return Boolean.TRUE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Boolean invoke(Float f2, Float f3) {
                                    return invoke(f2.floatValue(), f3.floatValue());
                                }
                            }, 1, null);
                        }
                    }
                }, 1, null);
                boolean z8 = z3;
                Orientation orientation = z8 ? Orientation.Vertical : Orientation.Horizontal;
                boolean z9 = !z;
                if (composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z4 = true;
                }
                if (z4 && !z8) {
                    z9 = !z9;
                }
                Modifier then = ScrollKt.clipScrollableContainer(semantics$default, z3).then(ScrollableKt.scrollable(companion, scrollState, orientation, rememberOverScrollController, z2, z9, flingBehavior, scrollState.getInternalInteractionSource$foundation_release())).then(new ScrollingLayoutModifier(scrollState, z, z3, rememberOverScrollController));
                composer.endReplaceableGroup();
                return then;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier verticalScroll(@NotNull Modifier modifier, @NotNull ScrollState state, boolean z, @Nullable FlingBehavior flingBehavior, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z2, flingBehavior, z, true);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }
}
