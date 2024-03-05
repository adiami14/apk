package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2.class */
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
    public final /* synthetic */ Function1<Offset, Unit> $onLongPress;
    public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
    public final /* synthetic */ Function1<Offset, Unit> $onTap;
    public final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {}, l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ u0 $$this$coroutineScope;
        public final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
        public final /* synthetic */ Function1<Offset, Unit> $onLongPress;
        public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
        public final /* synthetic */ Function1<Offset, Unit> $onTap;
        public final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {R.styleable.AppCompatTheme_searchViewStyle, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowActionBarOverlay, 128, 141, 159}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1.class */
        public static final class C00151 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ u0 $$this$coroutineScope;
            public final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
            public final /* synthetic */ Function1<Offset, Unit> $onLongPress;
            public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
            public final /* synthetic */ Function1<Offset, Unit> $onTap;
            public final /* synthetic */ PressGestureScopeImpl $pressScope;
            public long J$0;
            private /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public int label;

            @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", i = {}, l = {R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1$1.class */
            public static final class C00161 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                public final /* synthetic */ PointerInputChange $down;
                public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                public final /* synthetic */ PressGestureScopeImpl $pressScope;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00161(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation<? super C00161> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C00161(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00161) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset m2156boximpl = Offset.m2156boximpl(this.$down.m3794getPositionF1C5BW0());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, m2156boximpl, this) == coroutine_suspended) {
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

            @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1$2.class */
            public static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
                private /* synthetic */ Object L$0;
                public int label;

                public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super PointerInputChange> continuation) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        Object waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation((AwaitPointerEventScope) this.L$0, this);
                        obj = waitForUpOrCancellation;
                        if (waitForUpOrCancellation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1$3.class */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                public final /* synthetic */ PressGestureScopeImpl $pressScope;
                public final /* synthetic */ PointerInputChange $secondDown;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass3(this.$onPress, this.$pressScope, this.$secondDown, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset m2156boximpl = Offset.m2156boximpl(this.$secondDown.m3794getPositionF1C5BW0());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, m2156boximpl, this) == coroutine_suspended) {
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

            @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1$4.class */
            public static final class AnonymousClass4 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
                public final /* synthetic */ Function1<Offset, Unit> $onTap;
                public final /* synthetic */ PressGestureScopeImpl $pressScope;
                public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $upOrCancel;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Ref.ObjectRef<PointerInputChange> objectRef, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                    this.$onDoubleTap = function1;
                    this.$onTap = function12;
                    this.$upOrCancel = objectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$pressScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    Unit unit;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        Object waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation((AwaitPointerEventScope) this.L$0, this);
                        obj = waitForUpOrCancellation;
                        if (waitForUpOrCancellation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        PointerEventKt.consumeDownChange(pointerInputChange);
                        this.$pressScope.release();
                        this.$onDoubleTap.invoke(Offset.m2156boximpl(pointerInputChange.m3794getPositionF1C5BW0()));
                    } else {
                        this.$pressScope.cancel();
                        Function1<Offset, Unit> function1 = this.$onTap;
                        if (function1 == null) {
                            unit = null;
                            return unit;
                        }
                        function1.invoke(Offset.m2156boximpl(this.$upOrCancel.element.m3794getPositionF1C5BW0()));
                    }
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00151(PressGestureScopeImpl pressGestureScopeImpl, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, u0 u0Var, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super C00151> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
                this.$onPress = function3;
                this.$$this$coroutineScope = u0Var;
                this.$onLongPress = function1;
                this.$onDoubleTap = function12;
                this.$onTap = function13;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00151 c00151 = new C00151(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
                c00151.L$0 = obj;
                return c00151;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00151) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0179  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x01d4  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x01d6  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x01f4 A[Catch: PointerEventTimeoutCancellationException -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x0210, blocks: (B:36:0x01e1, B:38:0x01f4, B:39:0x01fe), top: B:109:0x01e1 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x01fe A[Catch: PointerEventTimeoutCancellationException -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x0210, blocks: (B:36:0x01e1, B:38:0x01f4, B:39:0x01fe), top: B:109:0x01e1 }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0224  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x025f  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x027b  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x02e4  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0310  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0394  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x03b7  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x03e5  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 1020
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, u0 u0Var, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pressScope = pressGestureScopeImpl;
            this.$onPress = function3;
            this.$$this$coroutineScope = u0Var;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C00151 c00151 = new C00151(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00151, this) == coroutine_suspended) {
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
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super TapGestureDetectorKt$detectTapGestures$2> continuation) {
        super(2, continuation);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = function3;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            u0 u0Var = (u0) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pressGestureScopeImpl, this.$onPress, u0Var, this.$onLongPress, this.$onDoubleTap, this.$onTap, null);
            this.label = 1;
            if (ForEachGestureKt.forEachGesture(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
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
