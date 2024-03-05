package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��V\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002\u001aR\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH��\u001aF\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u001aO\u0010\u001f\u001a\u00020\u0013*\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010!\"\u001a\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��¨\u0006\""}, d2 = {"ModifierLocalScrollableContainer", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "relocationDistance", "", "leadingEdge", "trailingEdge", "parentSize", "scrollableNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollLogic", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "scrollable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "reverseDirection", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "touchScrollable", "controller", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/OverScrollController;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollableKt.class */
public final class ScrollableKt {
    @NotNull
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f2) {
            return f2;
        }
    };
    @NotNull
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    @NotNull
    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float relocationDistance(float f2, float f3, float f4) {
        if ((f2 < 0.0f || f3 > f4) && (f2 >= 0.0f || f3 <= f4)) {
            float f5 = f3 - f4;
            if (Math.abs(f2) >= Math.abs(f5)) {
                f2 = f5;
            }
        } else {
            f2 = 0.0f;
        }
        return f2;
    }

    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull final ScrollableState state, @NotNull final Orientation orientation, @Nullable final OverScrollController overScrollController, final boolean z, final boolean z2, @Nullable final FlingBehavior flingBehavior, @Nullable final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("scrollable");
                inspectorInfo.getProperties().set("orientation", Orientation.this);
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("overScrollController", overScrollController);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float invoke$reverseIfNeeded(float f2, boolean z3) {
                float f3 = f2;
                if (z3) {
                    f3 = f2 * (-1);
                }
                return f3;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L18;
             */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14) {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollable$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull ScrollableState state, @NotNull Orientation orientation, boolean z, boolean z2, @Nullable FlingBehavior flingBehavior, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return scrollable(modifier, state, orientation, null, z, z2, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverScrollController overScrollController, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 64) != 0) {
            mutableInteractionSource = null;
        }
        return scrollable(modifier, scrollableState, orientation, overScrollController, z, z2, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 32) != 0) {
            mutableInteractionSource = null;
        }
        return scrollable(modifier, scrollableState, orientation, z, z2, flingBehavior, mutableInteractionSource);
    }

    private static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(z, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final Modifier touchScrollable(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z, ScrollableState scrollableState, FlingBehavior flingBehavior, OverScrollController overScrollController, boolean z2, Composer composer, int i2) {
        MutableState mutableStateOf$default;
        composer.startReplaceableGroup(-773069933);
        composer.startReplaceableGroup(-773069624);
        if (flingBehavior == null) {
            flingBehavior = ScrollableDefaults.INSTANCE.flingBehavior(composer, 6);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        MutableState mutableState = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            mutableState = mutableStateOf$default;
            composer.updateRememberedValue(mutableState);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) mutableState;
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z, mutableState2, scrollableState, flingBehavior, overScrollController), composer, 0);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(Boolean.valueOf(z2));
        NestedScrollConnection rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = scrollableNestedScrollConnection(rememberUpdatedState, z2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        ScrollDraggableState scrollDraggableState = rememberedValue3;
        if (rememberedValue3 == companion.getEmpty()) {
            scrollDraggableState = new ScrollDraggableState(rememberUpdatedState);
            composer.updateRememberedValue(scrollDraggableState);
        }
        composer.endReplaceableGroup();
        final ScrollDraggableState scrollDraggableState2 = (ScrollDraggableState) scrollDraggableState;
        Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(DraggableKt.draggable$default(modifier, new Function2<Composer, Integer, PointerAwareDraggableState>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$1
            {
                super(2);
            }

            @Composable
            @NotNull
            public final PointerAwareDraggableState invoke(@Nullable Composer composer2, int i3) {
                composer2.startReplaceableGroup(-971263152);
                ScrollDraggableState scrollDraggableState3 = ScrollDraggableState.this;
                composer2.endReplaceableGroup();
                return scrollDraggableState3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PointerAwareDraggableState invoke(Composer composer2, Integer num) {
                return invoke(composer2, num.intValue());
            }
        }, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange down) {
                Intrinsics.checkNotNullParameter(down, "down");
                return Boolean.valueOf(!PointerType.m3855equalsimpl0(down.m3797getTypeT8wyACA(), PointerType.Companion.m3860getMouseT8wyACA()));
            }
        }, orientation, z2, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(rememberUpdatedState.getValue().shouldScrollImmediately());
            }
        }, null, new ScrollableKt$touchScrollable$4(mutableState2, rememberUpdatedState, null), false, 64, null), nestedScrollConnection, (NestedScrollDispatcher) mutableState2.getValue());
        composer.endReplaceableGroup();
        return nestedScroll;
    }
}
