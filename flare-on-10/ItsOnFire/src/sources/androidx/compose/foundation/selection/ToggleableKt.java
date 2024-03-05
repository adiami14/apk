package androidx.compose.foundation.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Clickable_androidKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��<\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u000e\u001aG\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u000f\u001aS\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u0015\u001aS\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u0017\u001aA\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"toggleable", "Landroidx/compose/ui/Modifier;", "value", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onValueChange", "Lkotlin/Function1;", "", "toggleable-O2vRcR0", "toggleable-XHw0xAI", "toggleableImpl", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "toggleableImpl-3WzHGRc", "triStateToggleable", "triStateToggleable-O2vRcR0", "triStateToggleable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/selection/ToggleableKt.class */
public final class ToggleableKt {
    @NotNull
    /* renamed from: toggleable-O2vRcR0  reason: not valid java name */
    public static final Modifier m836toggleableO2vRcR0(@NotNull Modifier toggleable, final boolean z, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z2, @Nullable final Role role, @NotNull final Function1<? super Boolean, Unit> onValueChange) {
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        return InspectableValueKt.inspectableWrapper(toggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable_O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", onValueChange);
            }
        } : InspectableValueKt.getNoInspectorInfo(), m840toggleableImpl3WzHGRc(Modifier.Companion, ToggleableStateKt.ToggleableState(z), z2, role, interactionSource, indication, new Function0<Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onValueChange.invoke(Boolean.valueOf(!z));
            }
        }));
    }

    /* renamed from: toggleable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m837toggleableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m836toggleableO2vRcR0(modifier, z, mutableInteractionSource, indication, z2, role, function1);
    }

    @NotNull
    /* renamed from: toggleable-XHw0xAI  reason: not valid java name */
    public static final Modifier m838toggleableXHw0xAI(@NotNull Modifier toggleable, final boolean z, final boolean z2, @Nullable final Role role, @NotNull final Function1<? super Boolean, Unit> onValueChange) {
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        return ComposedModifierKt.composed(toggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable_XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", onValueChange);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Modifier m840toggleableImpl3WzHGRc;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1700574907);
                ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                MutableInteractionSource mutableInteractionSource = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(mutableInteractionSource);
                }
                composer.endReplaceableGroup();
                boolean z3 = z2;
                Role role2 = role;
                final Function1<Boolean, Unit> function1 = onValueChange;
                final boolean z4 = z;
                m840toggleableImpl3WzHGRc = ToggleableKt.m840toggleableImpl3WzHGRc(composed, ToggleableState, z3, role2, (MutableInteractionSource) mutableInteractionSource, (Indication) composer.consume(IndicationKt.getLocalIndication()), new Function0<Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(Boolean.valueOf(!z4));
                    }
                });
                composer.endReplaceableGroup();
                return m840toggleableImpl3WzHGRc;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: toggleable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m839toggleableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m838toggleableXHw0xAI(modifier, z, z2, role, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toggleableImpl-3WzHGRc  reason: not valid java name */
    public static final Modifier m840toggleableImpl3WzHGRc(Modifier modifier, final ToggleableState toggleableState, final boolean z, final Role role, final MutableInteractionSource mutableInteractionSource, final Indication indication, final Function0<Unit> function0) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                MutableState mutableStateOf$default;
                MutableState mutableStateOf$default2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-2134919645);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                MutableState mutableState = rememberedValue;
                if (rememberedValue == companion.getEmpty()) {
                    mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    mutableState = mutableStateOf$default2;
                    composer.updateRememberedValue(mutableState);
                }
                composer.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) mutableState;
                Modifier.Companion companion2 = Modifier.Companion;
                final Role role2 = role;
                final ToggleableState toggleableState2 = toggleableState;
                final boolean z2 = z;
                final Function0<Unit> function02 = function0;
                Modifier semantics = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$semantics$1
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
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics2) {
                        Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                        Role role3 = Role.this;
                        if (role3 != null) {
                            SemanticsPropertiesKt.m4346setRolekuIjeqM(semantics2, role3.m4313unboximpl());
                        }
                        SemanticsPropertiesKt.setToggleableState(semantics2, toggleableState2);
                        final Function0<Unit> function03 = function02;
                        SemanticsPropertiesKt.onClick$default(semantics2, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$semantics$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Boolean invoke() {
                                function03.invoke();
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        if (z2) {
                            return;
                        }
                        SemanticsPropertiesKt.disabled(semantics2);
                    }
                });
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composer, 0);
                composer.startReplaceableGroup(-2134919160);
                if (z) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(mutableInteractionSource, mutableState2, composer, 48);
                }
                composer.endReplaceableGroup();
                final Function0<Boolean> isComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue2 = composer.rememberedValue();
                MutableState mutableState3 = rememberedValue2;
                if (rememberedValue2 == companion.getEmpty()) {
                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    mutableState3 = mutableStateOf$default;
                    composer.updateRememberedValue(mutableState3);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState4 = (MutableState) mutableState3;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource, Boolean.valueOf(z), new ToggleableKt$toggleableImpl$1$gestures$1(z, mutableInteractionSource, mutableState2, SnapshotStateKt.rememberUpdatedState(new Function0<Boolean>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$delayPressInteraction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(mutableState4.getValue().booleanValue() || isComposeRootInScrollableContainer.invoke().booleanValue());
                    }
                }, composer, 0), rememberUpdatedState, null));
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue3 = composer.rememberedValue();
                ModifierLocalConsumer modifierLocalConsumer = rememberedValue3;
                if (rememberedValue3 == companion.getEmpty()) {
                    modifierLocalConsumer = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$1$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                            return ModifierLocalConsumer.DefaultImpls.all(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                            return ModifierLocalConsumer.DefaultImpls.any(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
                            return (R) ModifierLocalConsumer.DefaultImpls.foldIn(this, r2, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
                            return (R) ModifierLocalConsumer.DefaultImpls.foldOut(this, r2, function2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            mutableState4.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.ui.Modifier
                        @NotNull
                        public Modifier then(@NotNull Modifier modifier2) {
                            return ModifierLocalConsumer.DefaultImpls.then(this, modifier2);
                        }
                    };
                    composer.updateRememberedValue(modifierLocalConsumer);
                }
                composer.endReplaceableGroup();
                Modifier then = FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(composed.then((Modifier) modifierLocalConsumer).then(semantics), mutableInteractionSource, indication), mutableInteractionSource, z), z, mutableInteractionSource).then(pointerInput);
                composer.endReplaceableGroup();
                return then;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    /* renamed from: toggleableImpl-3WzHGRc$default  reason: not valid java name */
    public static /* synthetic */ Modifier m841toggleableImpl3WzHGRc$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, MutableInteractionSource mutableInteractionSource, Indication indication, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m840toggleableImpl3WzHGRc(modifier, toggleableState, z, role, mutableInteractionSource, indication, function0);
    }

    @NotNull
    /* renamed from: triStateToggleable-O2vRcR0  reason: not valid java name */
    public static final Modifier m842triStateToggleableO2vRcR0(@NotNull Modifier triStateToggleable, @NotNull final ToggleableState state, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return InspectableValueKt.inspectableWrapper(triStateToggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable_O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", ToggleableState.this);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), m840toggleableImpl3WzHGRc(Modifier.Companion, state, z, role, interactionSource, indication, onClick));
    }

    /* renamed from: triStateToggleable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m843triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m842triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z, role, function0);
    }

    @NotNull
    /* renamed from: triStateToggleable-XHw0xAI  reason: not valid java name */
    public static final Modifier m844triStateToggleableXHw0xAI(@NotNull Modifier triStateToggleable, @NotNull final ToggleableState state, final boolean z, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(triStateToggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable_XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", ToggleableState.this);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Modifier m840toggleableImpl3WzHGRc;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-434628333);
                ToggleableState toggleableState = ToggleableState.this;
                boolean z2 = z;
                Role role2 = role;
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                MutableInteractionSource mutableInteractionSource = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(mutableInteractionSource);
                }
                composer.endReplaceableGroup();
                m840toggleableImpl3WzHGRc = ToggleableKt.m840toggleableImpl3WzHGRc(composed, toggleableState, z2, role2, (MutableInteractionSource) mutableInteractionSource, (Indication) composer.consume(IndicationKt.getLocalIndication()), onClick);
                composer.endReplaceableGroup();
                return m840toggleableImpl3WzHGRc;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: triStateToggleable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m845triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m844triStateToggleableXHw0xAI(modifier, toggleableState, z, role, function0);
    }
}
