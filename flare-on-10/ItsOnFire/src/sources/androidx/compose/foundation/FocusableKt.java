package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010��\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H��¨\u0006\u0007"}, d2 = {"focusable", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/FocusableKt.class */
public final class FocusableKt {
    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier, final boolean z, @Nullable final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("focusable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-2  reason: not valid java name */
            public static final boolean m388invoke$lambda2(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-3  reason: not valid java name */
            public static final void m389invoke$lambda3(MutableState<Boolean> mutableState, boolean z2) {
                mutableState.setValue(Boolean.valueOf(z2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v53, types: [androidx.compose.ui.Modifier] */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Modifier.Companion companion;
                MutableState mutableStateOf$default;
                MutableState mutableStateOf$default2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1407538527);
                composer.startReplaceableGroup(-723524056);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = rememberedValue;
                if (rememberedValue == companion2.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                    compositionScopedCoroutineScopeCanceller = compositionScopedCoroutineScopeCanceller2;
                }
                composer.endReplaceableGroup();
                final u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) compositionScopedCoroutineScopeCanceller).getCoroutineScope();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue2 = composer.rememberedValue();
                MutableState mutableState = rememberedValue2;
                if (rememberedValue2 == companion2.getEmpty()) {
                    mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    MutableState mutableState2 = mutableStateOf$default2;
                    composer.updateRememberedValue(mutableState2);
                    mutableState = mutableState2;
                }
                composer.endReplaceableGroup();
                final MutableState mutableState3 = (MutableState) mutableState;
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue3 = composer.rememberedValue();
                MutableState mutableState4 = rememberedValue3;
                if (rememberedValue3 == companion2.getEmpty()) {
                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    MutableState mutableState5 = mutableStateOf$default;
                    composer.updateRememberedValue(mutableState5);
                    mutableState4 = mutableState5;
                }
                composer.endReplaceableGroup();
                final MutableState mutableState6 = (MutableState) mutableState4;
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue4 = composer.rememberedValue();
                BringIntoViewRequester bringIntoViewRequester = rememberedValue4;
                if (rememberedValue4 == companion2.getEmpty()) {
                    BringIntoViewRequester BringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composer.updateRememberedValue(BringIntoViewRequester);
                    bringIntoViewRequester = BringIntoViewRequester;
                }
                composer.endReplaceableGroup();
                final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) bringIntoViewRequester;
                final MutableInteractionSource mutableInteractionSource2 = MutableInteractionSource.this;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<FocusInteraction.Focus> mutableState7 = mutableState3;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                FocusInteraction.Focus focus = (FocusInteraction.Focus) MutableState.this.getValue();
                                if (focus == null) {
                                    return;
                                }
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                if (mutableInteractionSource4 != null) {
                                    mutableInteractionSource4.tryEmit(unfocus);
                                }
                                MutableState.this.setValue(null);
                            }
                        };
                    }
                }, composer, 0);
                Boolean valueOf = Boolean.valueOf(z);
                final boolean z2 = z;
                final MutableInteractionSource mutableInteractionSource3 = MutableInteractionSource.this;
                EffectsKt.DisposableEffect(valueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.2

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", i = {}, l = {androidx.appcompat.R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1  reason: invalid class name */
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/FocusableKt$focusable$2$2$1.class */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public Object L$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended;
                            MutableState<FocusInteraction.Focus> mutableState;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                if (value != null) {
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$focusedInteraction;
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            } else if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj);
                                mutableState = (MutableState) this.L$0;
                            }
                            mutableState.setValue(null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        if (!z2) {
                            l.f(coroutineScope, null, null, new AnonymousClass1(mutableState3, mutableInteractionSource3, null), 3, null);
                        }
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, composer, 0);
                if (z) {
                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.3
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
                            SemanticsPropertiesKt.setFocused(semantics, FocusableKt$focusable$2.m388invoke$lambda2(mutableState6));
                        }
                    }, 1, null), bringIntoViewRequester2);
                    final MutableInteractionSource mutableInteractionSource4 = MutableInteractionSource.this;
                    companion = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(bringIntoViewRequester3, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.4

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", f = "Focusable.kt", i = {1}, l = {102, androidx.appcompat.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 108}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4$1  reason: invalid class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/FocusableKt$focusable$2$4$1.class */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
                            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, BringIntoViewRequester bringIntoViewRequester, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$focusedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                                this.$bringIntoViewRequester = bringIntoViewRequester;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, this.$bringIntoViewRequester, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @org.jetbrains.annotations.Nullable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                                /*
                                    Method dump skipped, instructions count: 271
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.FocusableKt$focusable$2.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$2", f = "Focusable.kt", i = {}, l = {androidx.appcompat.R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4$2  reason: invalid class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/FocusableKt$focusable$2$4$2.class */
                        public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
                                super(2, continuation);
                                this.$focusedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass2(this.$focusedInteraction, this.$interactionSource, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended;
                                MutableState<FocusInteraction.Focus> mutableState;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                    if (value != null) {
                                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                        mutableState = this.$focusedInteraction;
                                        FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                        if (mutableInteractionSource != null) {
                                            this.L$0 = mutableState;
                                            this.label = 1;
                                            if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                } else if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                } else {
                                    ResultKt.throwOnFailure(obj);
                                    mutableState = (MutableState) this.L$0;
                                }
                                mutableState.setValue(null);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                            invoke2(focusState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull FocusState it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            FocusableKt$focusable$2.m389invoke$lambda3(mutableState6, it.isFocused());
                            if (FocusableKt$focusable$2.m388invoke$lambda2(mutableState6)) {
                                l.f(u0.this, null, null, new AnonymousClass1(mutableState3, mutableInteractionSource4, bringIntoViewRequester2, null), 3, null);
                            } else {
                                l.f(u0.this, null, null, new AnonymousClass2(mutableState3, mutableInteractionSource4, null), 3, null);
                            }
                        }
                    }));
                } else {
                    companion = Modifier.Companion;
                }
                composer.endReplaceableGroup();
                return companion;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    @NotNull
    public static final Modifier focusableInNonTouchMode(@NotNull Modifier modifier, final boolean z, @Nullable final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1672139192);
                final InputModeManager inputModeManager = (InputModeManager) composer.consume(CompositionLocalsKt.getLocalInputModeManager());
                Modifier focusable = FocusableKt.focusable(FocusPropertiesKt.focusProperties(Modifier.Companion, new Function1<FocusProperties, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
                        invoke2(focusProperties);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull FocusProperties focusProperties) {
                        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                        focusProperties.setCanFocus(!InputMode.m3063equalsimpl0(InputModeManager.this.mo3069getInputModeaOaMEAU(), InputMode.Companion.m3068getTouchaOaMEAU()));
                    }
                }), z, mutableInteractionSource);
                composer.endReplaceableGroup();
                return focusable;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
