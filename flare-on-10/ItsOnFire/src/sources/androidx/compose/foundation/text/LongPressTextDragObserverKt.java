package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@ø\u0001��¢\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@ø\u0001��¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"detectDragGesturesAfterLongPressWithObserver", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "observer", "Landroidx/compose/foundation/text/TextDragObserver;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/LongPressTextDragObserverKt.class */
public final class LongPressTextDragObserverKt {
    @Nullable
    public static final Object detectDragGesturesAfterLongPressWithObserver(@NotNull PointerInputScope pointerInputScope, @NotNull final TextDragObserver textDragObserver, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object detectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m931invokek4lQ0M(offset.m2177unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m931invokek4lQ0M(long j2) {
                TextDragObserver.this.mo961onStartk4lQ0M(j2);
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3
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
                TextDragObserver.this.onStop();
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4
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
                TextDragObserver.this.onCancel();
            }
        }, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m932invokeUv8p0NA(pointerInputChange, offset.m2177unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
            public final void m932invokeUv8p0NA(@NotNull PointerInputChange noName_0, long j2) {
                Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                TextDragObserver.this.mo960onDragk4lQ0M(j2);
            }
        }, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return detectDragGesturesAfterLongPress == coroutine_suspended ? detectDragGesturesAfterLongPress : Unit.INSTANCE;
    }

    @Nullable
    public static final Object detectDragGesturesWithObserver(@NotNull PointerInputScope pointerInputScope, @NotNull final TextDragObserver textDragObserver, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m933invokek4lQ0M(offset.m2177unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m933invokek4lQ0M(long j2) {
                TextDragObserver.this.mo961onStartk4lQ0M(j2);
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
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
                TextDragObserver.this.onStop();
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
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
                TextDragObserver.this.onCancel();
            }
        }, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m934invokeUv8p0NA(pointerInputChange, offset.m2177unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
            public final void m934invokeUv8p0NA(@NotNull PointerInputChange noName_0, long j2) {
                Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                TextDragObserver.this.mo960onDragk4lQ0M(j2);
            }
        }, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return detectDragGestures == coroutine_suspended ? detectDragGestures : Unit.INSTANCE;
    }
}
