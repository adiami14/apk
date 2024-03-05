package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.core.app.NotificationCompat;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"��Z\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018��2\u00020\u0001B£\u0001\u0012<\u0010\u0014\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0013\u0012<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0013\u0012\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"ø\u0001��ø\u0001��¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0086@ø\u0001��¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0086@ø\u0001��¢\u0006\u0004\b\u000b\u0010\fRS\u0010\u0014\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u00138\u0006ø\u0001��ø\u0001��¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017RP\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u00138\u0006ø\u0001��¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "Lj/u0;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", NotificationCompat.CATEGORY_EVENT, "", "processDragStart", "(Lj/u0;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Lj/u0;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "Lkotlin/jvm/functions/Function3;", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "", "velocity", "onDragStopped", "getOnDragStopped", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragStartInteraction", "Landroidx/compose/runtime/MutableState;", "getDragStartInteraction", "()Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DragLogic.class */
public final class DragLogic {
    @NotNull
    private final MutableState<DragInteraction.Start> dragStartInteraction;
    @Nullable
    private final MutableInteractionSource interactionSource;
    @NotNull
    private final Function3<u0, Offset, Continuation<? super Unit>, Object> onDragStarted;
    @NotNull
    private final Function3<u0, Float, Continuation<? super Unit>, Object> onDragStopped;

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(@NotNull Function3<? super u0, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super u0, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, @NotNull MutableState<DragInteraction.Start> dragStartInteraction, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.dragStartInteraction = dragStartInteraction;
        this.interactionSource = mutableInteractionSource;
    }

    @NotNull
    public final MutableState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    public final Function3<u0, Offset, Continuation<? super Unit>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    @NotNull
    public final Function3<u0, Float, Continuation<? super Unit>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(@org.jetbrains.annotations.NotNull j.u0 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragCancel(j.u0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b0  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(@org.jetbrains.annotations.NotNull j.u0 r6, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.DragEvent.DragStarted r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStart(j.u0, androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(@org.jetbrains.annotations.NotNull j.u0 r6, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.DragEvent.DragStopped r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStop(j.u0, androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
