package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j.u0;
import j.v0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", f = "ExposedDropdownMenu.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuKt$expandable$1.class */
public final class ExposedDropdownMenuKt$expandable$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onExpandedChange;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {}, l = {517}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuKt$expandable$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onExpandedChange;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1", f = "ExposedDropdownMenu.kt", i = {}, l = {518}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuKt$expandable$1$1$1.class */
        public static final class C00321 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $$this$forEachGesture;
            public final /* synthetic */ Function0<Unit> $onExpandedChange;
            public int label;

            @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {521}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
            /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuKt$expandable$1$1$1$1.class */
            public static final class C00331 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Function0<Unit> $onExpandedChange;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00331(Function0<Unit> function0, Continuation<? super C00331> continuation) {
                    super(2, continuation);
                    this.$onExpandedChange = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00331 c00331 = new C00331(this.$onExpandedChange, continuation);
                    c00331.L$0 = obj;
                    return c00331;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00331) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                    */
                /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:14:0x005e). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r6 = r0
                        r0 = r4
                        int r0 = r0.label
                        r7 = r0
                        r0 = r7
                        if (r0 == 0) goto L2c
                        r0 = r7
                        r1 = 1
                        if (r0 != r1) goto L22
                        r0 = r4
                        java.lang.Object r0 = r0.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                        r8 = r0
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L5e
                    L22:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L2c:
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r4
                        java.lang.Object r0 = r0.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                        r8 = r0
                    L39:
                        androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r5 = r0
                        r0 = r4
                        r1 = r8
                        r0.L$0 = r1
                        r0 = r4
                        r1 = 1
                        r0.label = r1
                        r0 = r8
                        r1 = r5
                        r2 = r4
                        java.lang.Object r0 = r0.awaitPointerEvent(r1, r2)
                        r9 = r0
                        r0 = r9
                        r5 = r0
                        r0 = r9
                        r1 = r6
                        if (r0 != r1) goto L5e
                        r0 = r6
                        return r0
                    L5e:
                        r0 = r5
                        androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
                        java.util.List r0 = r0.getChanges()
                        r5 = r0
                        r0 = r5
                        int r0 = r0.size()
                        r10 = r0
                        r0 = 0
                        r11 = r0
                        r0 = 0
                        r7 = r0
                    L73:
                        r0 = r7
                        r1 = r10
                        if (r0 >= r1) goto L95
                        r0 = r5
                        r1 = r7
                        java.lang.Object r0 = r0.get(r1)
                        androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                        boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)
                        if (r0 != 0) goto L8f
                        r0 = r11
                        r7 = r0
                        goto L97
                    L8f:
                        int r7 = r7 + 1
                        goto L73
                    L95:
                        r0 = 1
                        r7 = r0
                    L97:
                        r0 = r7
                        if (r0 == 0) goto L39
                        r0 = r4
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.$onExpandedChange
                        java.lang.Object r0 = r0.invoke()
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt$expandable$1.AnonymousClass1.C00321.C00331.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00321(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super C00321> continuation) {
                super(2, continuation);
                this.$$this$forEachGesture = pointerInputScope;
                this.$onExpandedChange = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C00321(this.$$this$forEachGesture, this.$onExpandedChange, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C00321) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C00331 c00331 = new C00331(this.$onExpandedChange, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c00331, this) == coroutine_suspended) {
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
        public AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, continuation);
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
                C00321 c00321 = new C00321((PointerInputScope) this.L$0, this.$onExpandedChange, null);
                this.label = 1;
                if (v0.g(c00321, this) == coroutine_suspended) {
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
    public ExposedDropdownMenuKt$expandable$1(Function0<Unit> function0, Continuation<? super ExposedDropdownMenuKt$expandable$1> continuation) {
        super(2, continuation);
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ExposedDropdownMenuKt$expandable$1 exposedDropdownMenuKt$expandable$1 = new ExposedDropdownMenuKt$expandable$1(this.$onExpandedChange, continuation);
        exposedDropdownMenuKt$expandable$1.L$0 = obj;
        return exposedDropdownMenuKt$expandable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ExposedDropdownMenuKt$expandable$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, null);
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
