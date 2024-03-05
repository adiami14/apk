package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import j.j;
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
@Metadata(d1 = {"��\"\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u001a7\u0010��\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H��ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldPressGestureFilterKt.class */
public final class TextFieldPressGestureFilterKt {
    @NotNull
    public static final Modifier tapPressTextFieldModifier(@NotNull Modifier modifier, @Nullable final MutableInteractionSource mutableInteractionSource, boolean z, @NotNull final Function1<? super Offset, Unit> onTap) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Modifier modifier2 = modifier;
        if (z) {
            modifier2 = ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2  reason: invalid class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public final /* synthetic */ State<Function1<Offset, Unit>> $onTapState;
                    public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                    public final /* synthetic */ u0 $scope;
                    private /* synthetic */ Object L$0;
                    public int label;

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1  reason: invalid class name */
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.class */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        public final /* synthetic */ u0 $scope;
                        public /* synthetic */ long J$0;
                        private /* synthetic */ Object L$0;
                        public int label;

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {61, R.styleable.AppCompatTheme_dividerVertical}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.class */
                        public static final class C00181 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ long $it;
                            public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                            public Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00181(MutableState<PressInteraction.Press> mutableState, long j2, MutableInteractionSource mutableInteractionSource, Continuation<? super C00181> continuation) {
                                super(2, continuation);
                                this.$pressedInteraction = mutableState;
                                this.$it = j2;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C00181(this.$pressedInteraction, this.$it, this.$interactionSource, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00181) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @org.jetbrains.annotations.Nullable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                                /*
                                    Method dump skipped, instructions count: 226
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.AnonymousClass2.AnonymousClass1.C00181.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2  reason: invalid class name and collision with other inner class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2.class */
                        public static final class C00192 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                            public final /* synthetic */ boolean $success;
                            public Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00192(MutableState<PressInteraction.Press> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, Continuation<? super C00192> continuation) {
                                super(2, continuation);
                                this.$pressedInteraction = mutableState;
                                this.$success = z;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C00192(this.$pressedInteraction, this.$success, this.$interactionSource, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00192) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended;
                                MutableState<PressInteraction.Press> mutableState;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    PressInteraction.Press value = this.$pressedInteraction.getValue();
                                    if (value != null) {
                                        boolean z = this.$success;
                                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                        mutableState = this.$pressedInteraction;
                                        PressInteraction.Release release = z ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                        if (mutableInteractionSource != null) {
                                            this.L$0 = mutableState;
                                            this.label = 1;
                                            if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
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
                        public AnonymousClass1(u0 u0Var, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                            super(3, continuation);
                            this.$scope = u0Var;
                            this.$pressedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                            return m1008invoked4ec7I(pressGestureScope, offset.m2177unboximpl(), continuation);
                        }

                        @Nullable
                        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                        public final Object m1008invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j2, @Nullable Continuation<? super Unit> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, continuation);
                            anonymousClass1.L$0 = pressGestureScope;
                            anonymousClass1.J$0 = j2;
                            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                j.e(this.$scope, null, null, new C00181(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                                this.label = 1;
                                Object tryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
                                obj = tryAwaitRelease;
                                if (tryAwaitRelease == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj);
                            }
                            j.e(this.$scope, null, null, new C00192(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass2(u0 u0Var, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Offset, Unit>> state, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$scope = u0Var;
                        this.$pressedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                        this.$onTapState = state;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                            final State<Function1<Offset, Unit>> state = this.$onTapState;
                            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    m1009invokek4lQ0M(offset.m2177unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                                public final void m1009invokek4lQ0M(long j2) {
                                    state.getValue().invoke(Offset.m2156boximpl(j2));
                                }
                            };
                            this.label = 1;
                            if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, function1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Composable
                @NotNull
                public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                    MutableState mutableStateOf$default;
                    Intrinsics.checkNotNullParameter(composed, "$this$composed");
                    composer.startReplaceableGroup(-219206304);
                    composer.startReplaceableGroup(-723524056);
                    composer.startReplaceableGroup(-3687241);
                    Object rememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = rememberedValue;
                    if (rememberedValue == companion.getEmpty()) {
                        compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    }
                    composer.endReplaceableGroup();
                    u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) compositionScopedCoroutineScopeCanceller).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-3687241);
                    Object rememberedValue2 = composer.rememberedValue();
                    MutableState mutableState = rememberedValue2;
                    if (rememberedValue2 == companion.getEmpty()) {
                        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        mutableState = mutableStateOf$default;
                        composer.updateRememberedValue(mutableState);
                    }
                    composer.endReplaceableGroup();
                    final MutableState mutableState2 = (MutableState) mutableState;
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTap, composer, 0);
                    final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final MutableState<PressInteraction.Press> mutableState3 = mutableState2;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                    if (press == null) {
                                        return;
                                    }
                                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    if (mutableInteractionSource4 != null) {
                                        mutableInteractionSource4.tryEmit(cancel);
                                    }
                                    MutableState.this.setValue(null);
                                }
                            };
                        }
                    }, composer, 0);
                    Modifier.Companion companion2 = Modifier.Companion;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass2(coroutineScope, mutableState2, mutableInteractionSource3, rememberUpdatedState, null));
                    composer.endReplaceableGroup();
                    return pointerInput;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier3, Composer composer, Integer num) {
                    return invoke(modifier3, composer, num.intValue());
                }
            }, 1, null);
        }
        return modifier2;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z, function1);
    }
}
