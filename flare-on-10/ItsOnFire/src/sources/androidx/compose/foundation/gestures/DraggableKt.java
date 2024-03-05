package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import j.u0;
import j.v0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import l.m0;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020��\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020��H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aÑ\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fø\u0001��ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001f\u001aö\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\b\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0��2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0 2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fH��ø\u0001��ø\u0001��¢\u0006\u0004\b\u001e\u0010&\u001ac\u0010,\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010+*\u00020'2\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0��0(2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0 0(2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001��¢\u0006\u0004\b,\u0010-\u001aQ\u00102\u001a\u00020\f*\u00020'2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010+2\u0006\u0010*\u001a\u00020)2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001��¢\u0006\u0004\b2\u00103\u001a\u001e\u00104\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001��¢\u0006\u0004\b4\u00105\u001a!\u00108\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a!\u00108\u001a\u00020\u0001*\u0002092\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b:\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lj/u0;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/runtime/Composable;", "stateFactory", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlin/Pair;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dragStart", "Ll/m0;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "awaitDrag", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/Pair;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Ll/m0;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toOffset", "(FLandroidx/compose/foundation/gestures/Orientation;)J", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt.class */
public final class DraggableKt {
    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r8, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<java.lang.Boolean>> r9, androidx.compose.ui.input.pointer.util.VelocityTracker r10, androidx.compose.foundation.gestures.Orientation r11, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object awaitDrag(AwaitPointerEventScope awaitPointerEventScope, Pair<PointerInputChange, Float> pair, final VelocityTracker velocityTracker, final m0<? super DragEvent> m0Var, final boolean z, final Orientation orientation, Continuation<? super Boolean> continuation) {
        float floatValue = pair.getSecond().floatValue();
        PointerInputChange first = pair.getFirst();
        long m2171minusMKHz9U = Offset.m2171minusMKHz9U(first.m3794getPositionF1C5BW0(), Offset.m2174timestuRUvjQ(toOffset(floatValue, orientation), Math.signum(m490toFloat3MmeM6k(first.m3794getPositionF1C5BW0(), orientation))));
        m0Var.T(new DragEvent.DragStarted(m2171minusMKHz9U, null));
        float f2 = floatValue;
        if (z) {
            f2 = floatValue * (-1);
        }
        m0Var.T(new DragEvent.DragDelta(f2, m2171minusMKHz9U, null));
        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$dragTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PointerInputChange event) {
                float m490toFloat3MmeM6k;
                Intrinsics.checkNotNullParameter(event, "event");
                VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                m490toFloat3MmeM6k = DraggableKt.m490toFloat3MmeM6k(PointerEventKt.positionChange(event), orientation);
                PointerEventKt.consumePositionChange(event);
                m0<DragEvent> m0Var2 = m0Var;
                float f3 = m490toFloat3MmeM6k;
                if (z) {
                    f3 = m490toFloat3MmeM6k * (-1);
                }
                m0Var2.T(new DragEvent.DragDelta(f3, event.m3794getPositionF1C5BW0(), null));
            }
        };
        return orientation == Orientation.Vertical ? DragGestureDetectorKt.m470verticalDragjO51t88(awaitPointerEventScope, first.m3793getIdJ3iCeTQ(), function1, continuation) : DragGestureDetectorKt.m467horizontalDragjO51t88(awaitPointerEventScope, first.m3793getIdJ3iCeTQ(), function1, continuation);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull final DraggableState state, @NotNull Orientation orientation, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, final boolean z2, @NotNull Function3<? super u0, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super u0, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return draggable(modifier, new Function2<Composer, Integer, PointerAwareDraggableState>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            {
                super(2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
             */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.foundation.gestures.PointerAwareDraggableState invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r5, int r6) {
                /*
                    r4 = this;
                    r0 = r5
                    r1 = -1197727804(0xffffffffb89c1fc4, float:-7.4445765E-5)
                    r0.startReplaceableGroup(r1)
                    r0 = r4
                    androidx.compose.foundation.gestures.DraggableState r0 = androidx.compose.foundation.gestures.DraggableState.this
                    r7 = r0
                    r0 = r5
                    r1 = -3686930(0xffffffffffc7bdee, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r5
                    r1 = r7
                    boolean r0 = r0.changed(r1)
                    r8 = r0
                    r0 = r5
                    java.lang.Object r0 = r0.rememberedValue()
                    r9 = r0
                    r0 = r8
                    if (r0 != 0) goto L3a
                    r0 = r9
                    r10 = r0
                    r0 = r9
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L4c
                L3a:
                    androidx.compose.foundation.gestures.IgnorePointerDraggableState r0 = new androidx.compose.foundation.gestures.IgnorePointerDraggableState
                    r1 = r0
                    r2 = r7
                    r1.<init>(r2)
                    r10 = r0
                    r0 = r5
                    r1 = r10
                    r0.updateRememberedValue(r1)
                L4c:
                    r0 = r5
                    r0.endReplaceableGroup()
                    r0 = r10
                    androidx.compose.foundation.gestures.IgnorePointerDraggableState r0 = (androidx.compose.foundation.gestures.IgnorePointerDraggableState) r0
                    r10 = r0
                    r0 = r5
                    r0.endReplaceableGroup()
                    r0 = r10
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$3.invoke(androidx.compose.runtime.Composer, int):androidx.compose.foundation.gestures.PointerAwareDraggableState");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PointerAwareDraggableState invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }
        }, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }, orientation, z, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(z2);
            }
        }, onDragStarted, onDragStopped, z3);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, ? extends PointerAwareDraggableState> stateFactory, @NotNull final Function1<? super PointerInputChange, Boolean> canDrag, @NotNull final Orientation orientation, final boolean z, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final Function0<Boolean> startDragImmediately, @NotNull final Function3<? super u0, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull final Function3<? super u0, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(stateFactory, "stateFactory");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", Function1.this);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", startDragImmediately);
                inspectorInfo.getProperties().set("onDragStarted", onDragStarted);
                inspectorInfo.getProperties().set("onDragStopped", onDragStopped);
                inspectorInfo.getProperties().set("stateFactory", stateFactory);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {237, 239, 241, 251, 253, InputDeviceCompat.SOURCE_KEYBOARD}, m = "invokeSuspend", n = {"$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt$draggable$9$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                public final /* synthetic */ n<DragEvent> $channel;
                public final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                public final /* synthetic */ PointerAwareDraggableState $state;
                private /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public int label;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", i = {0}, l = {246}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2  reason: invalid class name and collision with other inner class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt$draggable$9$2$2.class */
                public static final class C00102 extends SuspendLambda implements Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ n<DragEvent> $channel;
                    public final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00102(Ref.ObjectRef<DragEvent> objectRef, n<DragEvent> nVar, Continuation<? super C00102> continuation) {
                        super(2, continuation);
                        this.$event = objectRef;
                        this.$channel = nVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C00102 c00102 = new C00102(this.$event, this.$channel, continuation);
                        c00102.L$0 = obj;
                        return c00102;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull PointerAwareDragScope pointerAwareDragScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C00102) create(pointerAwareDragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:26:0x00bb). Please submit an issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                        /*
                            r5 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r7 = r0
                            r0 = r5
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L35
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L2b
                            r0 = r5
                            java.lang.Object r0 = r0.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                            r9 = r0
                            r0 = r5
                            java.lang.Object r0 = r0.L$0
                            androidx.compose.foundation.gestures.PointerAwareDragScope r0 = (androidx.compose.foundation.gestures.PointerAwareDragScope) r0
                            r10 = r0
                            r0 = r6
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto Lbb
                        L2b:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L35:
                            r0 = r6
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r5
                            java.lang.Object r0 = r0.L$0
                            androidx.compose.foundation.gestures.PointerAwareDragScope r0 = (androidx.compose.foundation.gestures.PointerAwareDragScope) r0
                            r6 = r0
                        L41:
                            r0 = r5
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r0 = r0.$event
                            T r0 = r0.element
                            r9 = r0
                            r0 = r9
                            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                            if (r0 != 0) goto Lc7
                            r0 = r9
                            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                            if (r0 != 0) goto Lc7
                            r0 = r9
                            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                            if (r0 == 0) goto L6c
                            r0 = r9
                            androidx.compose.foundation.gestures.DragEvent$DragDelta r0 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r0
                            r9 = r0
                            goto L6f
                        L6c:
                            r0 = 0
                            r9 = r0
                        L6f:
                            r0 = r9
                            if (r0 != 0) goto L77
                            goto L87
                        L77:
                            r0 = r6
                            r1 = r9
                            float r1 = r1.getDelta()
                            r2 = r9
                            long r2 = r2.m448getPointerPositionF1C5BW0()
                            r0.mo499dragByUv8p0NA(r1, r2)
                        L87:
                            r0 = r5
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r0 = r0.$event
                            r9 = r0
                            r0 = r5
                            l.n<androidx.compose.foundation.gestures.DragEvent> r0 = r0.$channel
                            r10 = r0
                            r0 = r5
                            r1 = r6
                            r0.L$0 = r1
                            r0 = r5
                            r1 = r9
                            r0.L$1 = r1
                            r0 = r5
                            r1 = 1
                            r0.label = r1
                            r0 = r10
                            r1 = r5
                            java.lang.Object r0 = r0.F(r1)
                            r11 = r0
                            r0 = r6
                            r10 = r0
                            r0 = r11
                            r6 = r0
                            r0 = r11
                            r1 = r7
                            if (r0 != r1) goto Lbb
                            r0 = r7
                            return r0
                        Lbb:
                            r0 = r9
                            r1 = r6
                            r0.element = r1
                            r0 = r10
                            r6 = r0
                            goto L41
                        Lc7:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass2.C00102.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(n<DragEvent> nVar, PointerAwareDraggableState pointerAwareDraggableState, State<DragLogic> state, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$channel = nVar;
                    this.$state = pointerAwareDraggableState;
                    this.$dragLogic$delegate = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x012b  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x01b3  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0260  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0262  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x012b -> B:19:0x00d5). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01fd -> B:19:0x00d5). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x020c -> B:19:0x00d5). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0232 -> B:19:0x00d5). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x025d -> B:19:0x00d5). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                    /*
                        Method dump skipped, instructions count: 618
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt$draggable$9$3.class */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                public final /* synthetic */ n<DragEvent> $channel;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ Orientation $orientation;
                public final /* synthetic */ boolean $reverseDirection;
                public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                public int label;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1  reason: invalid class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1.class */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ PointerInputScope $$this$pointerInput;
                    public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                    public final /* synthetic */ n<DragEvent> $channel;
                    public final /* synthetic */ Orientation $orientation;
                    public final /* synthetic */ boolean $reverseDirection;
                    public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    public int label;

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1.class */
                    public static final class C00111 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ u0 $$this$coroutineScope;
                        public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                        public final /* synthetic */ n<DragEvent> $channel;
                        public final /* synthetic */ Orientation $orientation;
                        public final /* synthetic */ boolean $reverseDirection;
                        public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                        private /* synthetic */ Object L$0;
                        public int label;

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1", f = "Draggable.kt", i = {0, 0, 1, 1}, l = {267, 275}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "I$0"})
                        /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1$1.class */
                        public static final class C00121 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ u0 $$this$coroutineScope;
                            public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                            public final /* synthetic */ n<DragEvent> $channel;
                            public final /* synthetic */ Orientation $orientation;
                            public final /* synthetic */ boolean $reverseDirection;
                            public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                            public int I$0;
                            private /* synthetic */ Object L$0;
                            public Object L$1;
                            public Object L$2;
                            public Object L$3;
                            public boolean Z$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C00121(State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z, u0 u0Var, Continuation<? super C00121> continuation) {
                                super(2, continuation);
                                this.$canDragState = state;
                                this.$startImmediatelyState = state2;
                                this.$orientation = orientation;
                                this.$channel = nVar;
                                this.$reverseDirection = z;
                                this.$$this$coroutineScope = u0Var;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                C00121 c00121 = new C00121(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, continuation);
                                c00121.L$0 = obj;
                                return c00121;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00121) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:40:0x01c6  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x01ef  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x023f  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x024d  */
                            /* JADX WARN: Removed duplicated region for block: B:64:0x0263  */
                            /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @org.jetbrains.annotations.Nullable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                                /*
                                    Method dump skipped, instructions count: 668
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass3.AnonymousClass1.C00111.C00121.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C00111(State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z, u0 u0Var, Continuation<? super C00111> continuation) {
                            super(2, continuation);
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = nVar;
                            this.$reverseDirection = z;
                            this.$$this$coroutineScope = u0Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C00111 c00111 = new C00111(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, continuation);
                            c00111.L$0 = obj;
                            return c00111;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C00111) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                C00121 c00121 = new C00121(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, null);
                                this.label = 1;
                                if (pointerInputScope.awaitPointerEventScope(c00121, this) == coroutine_suspended) {
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
                    public AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = nVar;
                        this.$reverseDirection = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
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
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            u0 u0Var = (u0) this.L$0;
                            PointerInputScope pointerInputScope = this.$$this$pointerInput;
                            C00111 c00111 = new C00111(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, u0Var, null);
                            this.label = 1;
                            if (ForEachGestureKt.forEachGesture(pointerInputScope, c00111, this) == coroutine_suspended) {
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
                public AnonymousClass3(boolean z, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z2, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$enabled = z;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = nVar;
                    this.$reverseDirection = z2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        if (!this.$enabled) {
                            return Unit.INSTANCE;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (v0.g(anonymousClass1, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-2  reason: not valid java name */
            public static final DragLogic m496invoke$lambda2(State<DragLogic> state) {
                return state.getValue();
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                MutableState mutableStateOf$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1197726397);
                PointerAwareDraggableState invoke = stateFactory.invoke(composer, 0);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                MutableState mutableState = rememberedValue;
                if (rememberedValue == companion.getEmpty()) {
                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    mutableState = mutableStateOf$default;
                    composer.updateRememberedValue(mutableState);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) mutableState;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<DragInteraction.Start> mutableState3 = mutableState2;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DragInteraction.Start start = (DragInteraction.Start) MutableState.this.getValue();
                                if (start == null) {
                                    return;
                                }
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                if (mutableInteractionSource4 != null) {
                                    mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                }
                                MutableState.this.setValue(null);
                            }
                        };
                    }
                }, composer, 0);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue2 = composer.rememberedValue();
                n nVar = rememberedValue2;
                if (rememberedValue2 == companion.getEmpty()) {
                    nVar = q.d(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(nVar);
                }
                composer.endReplaceableGroup();
                n nVar2 = (n) nVar;
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(startDragImmediately, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(canDrag, composer, 0);
                EffectsKt.LaunchedEffect(invoke, new AnonymousClass2(nVar2, invoke, SnapshotStateKt.rememberUpdatedState(new DragLogic(onDragStarted, onDragStopped, mutableState2, mutableInteractionSource), composer, 0), null), composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                Orientation orientation2 = orientation;
                boolean z3 = z;
                boolean z4 = z2;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, new Object[]{orientation2, Boolean.valueOf(z3), Boolean.valueOf(z4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass3(z, rememberUpdatedState2, rememberUpdatedState, orientation, nVar2, z2, null));
                composer.endReplaceableGroup();
                return pointerInput;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function32, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            function3 = new DraggableKt$draggable$1(null);
        }
        if ((i2 & 64) != 0) {
            function32 = new DraggableKt$draggable$2(null);
        }
        if ((i2 & 128) != 0) {
            z3 = false;
        }
        return draggable(modifier, draggableState, orientation, z, mutableInteractionSource, z2, function3, function32, z3);
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, Function2 function2, Function1 function1, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, Function0 function0, Function3 function3, Function3 function32, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 64) != 0) {
            function3 = new DraggableKt$draggable$6(null);
        }
        if ((i2 & 128) != 0) {
            function32 = new DraggableKt$draggable$7(null);
        }
        if ((i2 & 256) != 0) {
            z2 = false;
        }
        return draggable(modifier, function2, function1, orientation, z, mutableInteractionSource, function0, function3, function32, z2);
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1<? super Float, Unit> onDelta, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-1066220065);
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i2 & 14);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        DraggableState draggableState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            draggableState = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                    invoke(f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f2));
                }
            });
            composer.updateRememberedValue(draggableState);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState2 = (DraggableState) draggableState;
        composer.endReplaceableGroup();
        return draggableState2;
    }

    /* renamed from: toFloat-3MmeM6k */
    public static final float m490toFloat3MmeM6k(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m2168getYimpl(j2) : Offset.m2167getXimpl(j2);
    }

    /* renamed from: toFloat-sF-c-tU */
    public static final float m491toFloatsFctU(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5021getYimpl(j2) : Velocity.m5020getXimpl(j2);
    }

    private static final long toOffset(float f2, Orientation orientation) {
        return orientation == Orientation.Vertical ? OffsetKt.Offset(0.0f, f2) : OffsetKt.Offset(f2, 0.0f);
    }
}
