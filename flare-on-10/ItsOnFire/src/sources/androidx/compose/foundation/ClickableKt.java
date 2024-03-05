package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import j.v0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��T\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001aW\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u0014\u001aE\u0010\b\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u0089\u0001\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u001a\u001aw\u0010\u0016\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u001b\u001a\u007f\u0010\u001c\u001a\u00020\t*\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H��ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u001e\u001aQ\u0010\u001f\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130$H\u0080@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"PressedInteractionSourceDisposableEffect", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pressedInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "clickable", "Landroidx/compose/ui/Modifier;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "clickable-O2vRcR0", "clickable-XHw0xAI", "combinedClickable", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "combinedClickable-cJG_KMw", "genericClickableWithoutGesture", "gestureModifiers", "genericClickableWithoutGesture-BI-LeDI", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pressPoint", "Landroidx/compose/ui/geometry/Offset;", "delayPressInteraction", "Landroidx/compose/runtime/State;", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/ClickableKt.class */
public final class ClickableKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L30;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PressedInteractionSourceDisposableEffect(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.MutableInteractionSource r7, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction.Press> r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r9, final int r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):void");
    }

    @NotNull
    /* renamed from: clickable-O2vRcR0  reason: not valid java name */
    public static final Modifier m365clickableO2vRcR0(@NotNull Modifier clickable, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z, @Nullable final String str, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable_O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4
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
                composer.startReplaceableGroup(1841981045);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, 0);
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
                composer.startReplaceableGroup(1841981204);
                if (z) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState2, composer, 48);
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
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1
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
                }, composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, interactionSource, Boolean.valueOf(z), new ClickableKt$clickable$4$gesture$1(z, interactionSource, mutableState2, rememberUpdatedState2, rememberUpdatedState, null));
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue3 = composer.rememberedValue();
                ModifierLocalConsumer modifierLocalConsumer = rememberedValue3;
                if (rememberedValue3 == companion.getEmpty()) {
                    modifierLocalConsumer = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$1$1
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
                        public Modifier then(@NotNull Modifier modifier) {
                            return ModifierLocalConsumer.DefaultImpls.then(this, modifier);
                        }
                    };
                    composer.updateRememberedValue(modifierLocalConsumer);
                }
                composer.endReplaceableGroup();
                Modifier m373genericClickableWithoutGestureBILeDI = ClickableKt.m373genericClickableWithoutGestureBILeDI(companion2.then((Modifier) modifierLocalConsumer), pointerInput, interactionSource, indication, z, str, role, null, null, onClick);
                composer.endReplaceableGroup();
                return m373genericClickableWithoutGestureBILeDI;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: clickable-O2vRcR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m366clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m365clickableO2vRcR0(modifier, mutableInteractionSource, indication, z, str, role, function0);
    }

    @NotNull
    /* renamed from: clickable-XHw0xAI  reason: not valid java name */
    public static final Modifier m367clickableXHw0xAI(@NotNull Modifier clickable, final boolean z, @Nullable final String str, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable_XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1841979210);
                Modifier.Companion companion = Modifier.Companion;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                MutableInteractionSource mutableInteractionSource = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(mutableInteractionSource);
                }
                composer.endReplaceableGroup();
                Modifier m365clickableO2vRcR0 = ClickableKt.m365clickableO2vRcR0(companion, (MutableInteractionSource) mutableInteractionSource, indication, z, str, role, onClick);
                composer.endReplaceableGroup();
                return m365clickableO2vRcR0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: clickable-XHw0xAI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m368clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m367clickableXHw0xAI(modifier, z, str, role, function0);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: combinedClickable-XVZzFYc  reason: not valid java name */
    public static final Modifier m369combinedClickableXVZzFYc(@NotNull Modifier combinedClickable, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z, @Nullable final String str, @Nullable final Role role, @Nullable final String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable_XVZzFYc$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
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
                composer.startReplaceableGroup(1321106475);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, composer, 0);
                State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function02, composer, 0);
                boolean z2 = function0 != null;
                boolean z3 = function02 != null;
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
                final MutableState mutableState2 = (MutableState) mutableState;
                composer.startReplaceableGroup(1321106866);
                if (z) {
                    Boolean valueOf = Boolean.valueOf(z2);
                    final MutableInteractionSource mutableInteractionSource = interactionSource;
                    EffectsKt.DisposableEffect(valueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final MutableState<PressInteraction.Press> mutableState3 = mutableState2;
                            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                    if (press == null) {
                                        return;
                                    }
                                    mutableInteractionSource2.tryEmit(new PressInteraction.Cancel(press));
                                    MutableState.this.setValue(null);
                                }
                            };
                        }
                    }, composer, 0);
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState2, composer, 48);
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
                State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1
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
                }, composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, new Object[]{interactionSource, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ClickableKt$combinedClickable$4$gesture$1(z3, z, z2, rememberUpdatedState3, rememberUpdatedState2, interactionSource, mutableState2, rememberUpdatedState4, rememberUpdatedState, null));
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue3 = composer.rememberedValue();
                ModifierLocalConsumer modifierLocalConsumer = rememberedValue3;
                if (rememberedValue3 == companion.getEmpty()) {
                    modifierLocalConsumer = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1
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
                        public Modifier then(@NotNull Modifier modifier) {
                            return ModifierLocalConsumer.DefaultImpls.then(this, modifier);
                        }
                    };
                    composer.updateRememberedValue(modifierLocalConsumer);
                }
                composer.endReplaceableGroup();
                Modifier m373genericClickableWithoutGestureBILeDI = ClickableKt.m373genericClickableWithoutGestureBILeDI(companion2.then((Modifier) modifierLocalConsumer), pointerInput, interactionSource, indication, z, str, role, str2, function0, onClick);
                composer.endReplaceableGroup();
                return m373genericClickableWithoutGestureBILeDI;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: combinedClickable-XVZzFYc$default  reason: not valid java name */
    public static /* synthetic */ Modifier m370combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            function0 = null;
        }
        if ((i2 & 128) != 0) {
            function02 = null;
        }
        return m369combinedClickableXVZzFYc(modifier, mutableInteractionSource, indication, z, str, role, str2, function0, function02, function03);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: combinedClickable-cJG_KMw  reason: not valid java name */
    public static final Modifier m371combinedClickablecJG_KMw(@NotNull Modifier combinedClickable, final boolean z, @Nullable final String str, @Nullable final Role role, @Nullable final String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable_cJG_KMw$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1321104121);
                Modifier.Companion companion = Modifier.Companion;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                MutableInteractionSource mutableInteractionSource = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(mutableInteractionSource);
                }
                composer.endReplaceableGroup();
                Modifier m369combinedClickableXVZzFYc = ClickableKt.m369combinedClickableXVZzFYc(companion, (MutableInteractionSource) mutableInteractionSource, indication, z, str, role, str2, function0, function02, onClick);
                composer.endReplaceableGroup();
                return m369combinedClickableXVZzFYc;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: combinedClickable-cJG_KMw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m372combinedClickablecJG_KMw$default(Modifier modifier, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            function02 = null;
        }
        return m371combinedClickablecJG_KMw(modifier, z, str, role, str2, function0, function02, function03);
    }

    @NotNull
    /* renamed from: genericClickableWithoutGesture-BI-LeDI  reason: not valid java name */
    public static final Modifier m373genericClickableWithoutGestureBILeDI(@NotNull Modifier genericClickableWithoutGesture, @NotNull Modifier gestureModifiers, @NotNull MutableInteractionSource interactionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_BI_LeDI$detectClickFromKey(genericClickableWithoutGesture_BI_LeDI$clickSemantics(genericClickableWithoutGesture, role, str, function0, str2, z, onClick), z, onClick), interactionSource, indication), interactionSource, z), z, interactionSource).then(gestureModifiers);
    }

    /* renamed from: genericClickableWithoutGesture-BI-LeDI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m374genericClickableWithoutGestureBILeDI$default(Modifier modifier, Modifier modifier2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        if ((i2 & 32) != 0) {
            role = null;
        }
        if ((i2 & 64) != 0) {
            str2 = null;
        }
        if ((i2 & 128) != 0) {
            function0 = null;
        }
        return m373genericClickableWithoutGestureBILeDI(modifier, modifier2, mutableInteractionSource, indication, z, str, role, str2, function0, function02);
    }

    private static final Modifier genericClickableWithoutGesture_BI_LeDI$clickSemantics(Modifier modifier, final Role role, final String str, final Function0<Unit> function0, final String str2, final boolean z, final Function0<Unit> function02) {
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1
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
                Role role2 = Role.this;
                if (role2 != null) {
                    SemanticsPropertiesKt.m4346setRolekuIjeqM(semantics, role2.m4313unboximpl());
                }
                String str3 = str;
                final Function0<Unit> function03 = function02;
                SemanticsPropertiesKt.onClick(semantics, str3, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
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
                });
                final Function0<Unit> function04 = function0;
                if (function04 != null) {
                    SemanticsPropertiesKt.onLongClick(semantics, str2, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            function04.invoke();
                            return Boolean.TRUE;
                        }
                    });
                }
                if (z) {
                    return;
                }
                SemanticsPropertiesKt.disabled(semantics);
            }
        });
    }

    private static final Modifier genericClickableWithoutGesture_BI_LeDI$detectClickFromKey(Modifier modifier, final boolean z, final Function0<Unit> function0) {
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m382invokeZmokQxo(keyEvent.m3660unboximpl());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m382invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                boolean z2;
                Intrinsics.checkNotNullParameter(it, "it");
                if (z && Clickable_androidKt.m384isClickZmokQxo(it)) {
                    function0.invoke();
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    @Nullable
    /* renamed from: handlePressInteraction-EPk0efs  reason: not valid java name */
    public static final Object m375handlePressInteractionEPk0efs(@NotNull PressGestureScope pressGestureScope, long j2, @NotNull MutableInteractionSource mutableInteractionSource, @NotNull MutableState<PressInteraction.Press> mutableState, @NotNull State<? extends Function0<Boolean>> state, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new ClickableKt$handlePressInteraction$2(pressGestureScope, j2, mutableInteractionSource, mutableState, state, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }
}
