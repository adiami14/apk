package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3", f = "Transformable.kt", i = {}, l = {R.styleable.AppCompatTheme_textAppearanceListItem}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TransformableKt$detectZoom$3.class */
public final class TransformableKt$detectZoom$3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.BooleanRef $lockedToPanZoom;
    public final /* synthetic */ Ref.LongRef $pan;
    public final /* synthetic */ State<Boolean> $panZoomLock;
    public final /* synthetic */ Ref.BooleanRef $pastTouchSlop;
    public final /* synthetic */ Ref.FloatRef $rotation;
    public final /* synthetic */ PointerInputScope $this_detectZoom;
    public final /* synthetic */ float $touchSlop;
    public final /* synthetic */ Ref.FloatRef $zoom;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1", f = "Transformable.kt", i = {0}, l = {R.styleable.AppCompatTheme_textAppearanceListItemSmall}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TransformableKt$detectZoom$3$1.class */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TransformScope $$this$transform;
        public final /* synthetic */ Ref.BooleanRef $lockedToPanZoom;
        public final /* synthetic */ Ref.LongRef $pan;
        public final /* synthetic */ State<Boolean> $panZoomLock;
        public final /* synthetic */ Ref.BooleanRef $pastTouchSlop;
        public final /* synthetic */ Ref.FloatRef $rotation;
        public final /* synthetic */ float $touchSlop;
        public final /* synthetic */ Ref.FloatRef $zoom;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.LongRef longRef, float f2, Ref.BooleanRef booleanRef2, State<Boolean> state, TransformScope transformScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pastTouchSlop = booleanRef;
            this.$zoom = floatRef;
            this.$rotation = floatRef2;
            this.$pan = longRef;
            this.$touchSlop = f2;
            this.$lockedToPanZoom = booleanRef2;
            this.$panZoomLock = state;
            this.$$this$transform = transformScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, this.$$this$transform, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x01d0, code lost:
            if (androidx.compose.ui.geometry.Offset.m2164equalsimpl0(r0, androidx.compose.ui.geometry.Offset.Companion.m2183getZeroF1C5BW0()) != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0257, code lost:
            if (r12 == false) goto L79;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0055 -> B:14:0x005a). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 606
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectZoom$3(PointerInputScope pointerInputScope, Ref.BooleanRef booleanRef, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.LongRef longRef, float f2, Ref.BooleanRef booleanRef2, State<Boolean> state, Continuation<? super TransformableKt$detectZoom$3> continuation) {
        super(2, continuation);
        this.$this_detectZoom = pointerInputScope;
        this.$pastTouchSlop = booleanRef;
        this.$zoom = floatRef;
        this.$rotation = floatRef2;
        this.$pan = longRef;
        this.$touchSlop = f2;
        this.$lockedToPanZoom = booleanRef2;
        this.$panZoomLock = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TransformableKt$detectZoom$3 transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(this.$this_detectZoom, this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, continuation);
        transformableKt$detectZoom$3.L$0 = obj;
        return transformableKt$detectZoom$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TransformableKt$detectZoom$3) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            TransformScope transformScope = (TransformScope) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectZoom;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, transformScope, null);
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
