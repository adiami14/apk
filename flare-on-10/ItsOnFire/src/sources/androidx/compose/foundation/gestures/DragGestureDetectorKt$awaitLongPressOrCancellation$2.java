package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {}, l = {757}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2.class */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    public final /* synthetic */ PointerInputScope $this_awaitLongPressOrCancellation;
    public int label;

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {760, 777}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "finished", "$this$awaitPointerEventScope", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2$1.class */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
        public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentDown = objectRef;
            this.$longPress = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDown, this.$longPress, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01c1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00e1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x014f A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v86, types: [androidx.compose.ui.input.pointer.PointerInputChange, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0181 -> B:52:0x0186). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 682
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(PointerInputScope pointerInputScope, Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$this_awaitLongPressOrCancellation = pointerInputScope;
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$this_awaitLongPressOrCancellation, this.$currentDown, this.$longPress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = this.$this_awaitLongPressOrCancellation;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDown, this.$longPress, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
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
