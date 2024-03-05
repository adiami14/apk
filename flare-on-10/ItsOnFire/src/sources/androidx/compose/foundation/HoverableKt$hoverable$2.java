package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010��\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/HoverableKt$hoverable$2.class */
public final class HoverableKt$hoverable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", i = {}, l = {androidx.appcompat.R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$2  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/HoverableKt$hoverable$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$enabled = z;
            this.$hoverInteraction$delegate = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, continuation);
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
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.$enabled) {
                    MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    this.label = 1;
                    if (HoverableKt$hoverable$2.invoke$emitExit(mutableState, mutableInteractionSource, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", i = {0, 0, 1, 1, 2, 2}, l = {100, 102, androidx.appcompat.R.styleable.AppCompatTheme_textAppearanceListItem}, m = "invokeSuspend", n = {"$this$pointerInput", "currentContext", "$this$pointerInput", "currentContext", "$this$pointerInput", "currentContext"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/HoverableKt$hoverable$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$interactionSource = mutableInteractionSource;
            this.$hoverInteraction$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$interactionSource, this.$hoverInteraction$delegate, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f8 -> B:35:0x0142). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010d -> B:35:0x0142). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x013d -> B:35:0x0142). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
            if (r0 == 0) goto L28
            r0 = r6
            androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
            r7 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r7
            r6 = r0
            goto L31
        L28:
            androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.result
            r7 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L63
            r0 = r6
            java.lang.Object r0 = r0.L$1
            androidx.compose.foundation.interaction.HoverInteraction$Enter r0 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r0
            r4 = r0
            r0 = r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            r5 = r0
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto La1
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6d:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            androidx.compose.foundation.interaction.HoverInteraction$Enter r0 = m390invoke$lambda1(r0)
            if (r0 != 0) goto La6
            androidx.compose.foundation.interaction.HoverInteraction$Enter r0 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            r1 = r5
            r0.L$0 = r1
            r0 = r6
            r1 = r7
            r0.L$1 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r4
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r9
            if (r0 != r1) goto L9f
            r0 = r9
            return r0
        L9f:
            r0 = r7
            r4 = r0
        La1:
            r0 = r5
            r1 = r4
            m391invoke$lambda2(r0, r1)
        La6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$emitExit(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r4, androidx.compose.foundation.interaction.MutableInteractionSource r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
            if (r0 == 0) goto L28
            r0 = r6
            androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
            r7 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r7
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r7
            r6 = r0
            goto L31
        L28:
            androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L66
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5c
            r0 = r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            r4 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9d
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            androidx.compose.foundation.interaction.HoverInteraction$Enter r0 = m390invoke$lambda1(r0)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L79
            goto La2
        L79:
            androidx.compose.foundation.interaction.HoverInteraction$Exit r0 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r9 = r0
            r0 = r6
            r1 = r4
            r0.L$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r9
            r2 = r6
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r7
            if (r0 != r1) goto L9d
            r0 = r7
            return r0
        L9d:
            r0 = r4
            r1 = 0
            m391invoke$lambda2(r0, r1)
        La2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.invoke$emitExit(androidx.compose.runtime.MutableState, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final HoverInteraction.Enter m390invoke$lambda1(MutableState<HoverInteraction.Enter> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$tryEmitExit(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource) {
        HoverInteraction.Enter m390invoke$lambda1 = m390invoke$lambda1(mutableState);
        if (m390invoke$lambda1 == null) {
            return;
        }
        mutableInteractionSource.tryEmit(new HoverInteraction.Exit(m390invoke$lambda1));
        mutableState.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.Modifier] */
    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Modifier.Companion companion;
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-222579755);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        MutableState mutableState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            MutableState mutableState2 = mutableStateOf$default;
            composer.updateRememberedValue(mutableState2);
            mutableState = mutableState2;
        }
        composer.endReplaceableGroup();
        final MutableState mutableState3 = (MutableState) mutableState;
        final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        EffectsKt.DisposableEffect(mutableInteractionSource, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MutableState<HoverInteraction.Enter> mutableState4 = mutableState3;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        HoverableKt$hoverable$2.invoke$tryEmitExit(MutableState.this, mutableInteractionSource2);
                    }
                };
            }
        }, composer, 0);
        EffectsKt.LaunchedEffect(Boolean.valueOf(this.$enabled), new AnonymousClass2(this.$enabled, mutableState3, this.$interactionSource, null), composer, 0);
        if (this.$enabled) {
            Modifier.Companion companion2 = Modifier.Companion;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            companion = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource2, new AnonymousClass3(mutableInteractionSource2, mutableState3, null));
        } else {
            companion = Modifier.Companion;
        }
        composer.endReplaceableGroup();
        return companion;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
