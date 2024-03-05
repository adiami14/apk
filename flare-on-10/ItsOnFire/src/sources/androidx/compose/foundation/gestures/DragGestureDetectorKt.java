package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��p\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH\u0082Hø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\f\u001ag\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a_\u0010!\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u0004\u0018\u00010\u0007*\u00020&2\u0006\u0010'\u001a\u00020\u0007H\u0082@ø\u0001��¢\u0006\u0002\u0010(\u001a]\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050\u000fH\u0082Hø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001ag\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b.\u0010 \u001a_\u0010/\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u0010$\u001a'\u00101\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b2\u0010\f\u001ag\u00103\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001726\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0080@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b4\u0010 \u001a_\u00105\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n26\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u0010$\u001a\u0086\u0001\u00107\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010<\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��¢\u0006\u0002\u0010>\u001a\u0086\u0001\u0010?\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010<\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��¢\u0006\u0002\u0010>\u001a\u0086\u0001\u0010@\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010A\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��¢\u0006\u0002\u0010>\u001a\u0086\u0001\u0010B\u001a\u00020\u001e*\u00020&2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e0\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:26\u0010C\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001e0\u0019H\u0086@ø\u0001��ø\u0001��¢\u0006\u0002\u0010>\u001a9\u0010D\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bE\u0010\u0012\u001aa\u0010D\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000f2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fH\u0082Hø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bH\u0010I\u001a9\u0010J\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bK\u0010\u0012\u001a!\u0010L\u001a\u00020\u0010*\u00020M2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a!\u0010P\u001a\u00020\u0005*\u00020Q2\u0006\u0010\u0016\u001a\u00020\u0017H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bR\u0010S\u001a9\u0010T\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u000fH\u0086@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bU\u0010\u0012\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "initialDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation-gDDlDlE", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionFromChange", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/DragGestureDetectorKt.class */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m4785constructorimpl = Dp.m4785constructorimpl((float) 0.125d);
        mouseSlop = m4785constructorimpl;
        float m4785constructorimpl2 = Dp.m4785constructorimpl(18);
        defaultTouchSlop = m4785constructorimpl2;
        mouseToTouchSlopRatio = m4785constructorimpl / m4785constructorimpl2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00bf -> B:24:0x00c5). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitDragOrCancellation-rnUCldI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m454awaitDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r9) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m454awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88  reason: not valid java name */
    private static final Object m455awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        while (true) {
            InlineMarker.mark(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.DefaultImpls.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (PointerId.m3782equalsimpl0(pointerInputChange.m3793getIdJ3iCeTQ(), j2)) {
                    break;
                }
                i2++;
            }
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    pointerInputChange2 = null;
                    if (i3 >= size2) {
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return pointerInputChange3;
                }
                j2 = pointerInputChange4.m3793getIdJ3iCeTQ();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00bf -> B:24:0x00c5). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m456awaitHorizontalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r9) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m456awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02da, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeConsumed(r18) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x024d -> B:62:0x02e2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02cd -> B:59:0x02d5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0316 -> B:62:0x02e2). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m457awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r11) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m457awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02c7, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeConsumed(r18) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x023b -> B:22:0x013e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02ba -> B:59:0x02c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02f6 -> B:22:0x013e). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m458awaitHorizontalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m458awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.input.pointer.PointerInputChange, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitLongPressOrCancellation(androidx.compose.ui.input.pointer.PointerInputScope r6, androidx.compose.ui.input.pointer.PointerInputChange r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation(androidx.compose.ui.input.pointer.PointerInputScope, androidx.compose.ui.input.pointer.PointerInputChange, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0216 -> B:24:0x0118). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x02cf -> B:72:0x02df). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m459awaitPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r13) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m459awaitPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM  reason: not valid java name */
    private static final Object m460awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (m468isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float m469pointerSlopE8SPZFQ = m469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
        do {
            float f2 = 0.0f;
            while (true) {
                InlineMarker.mark(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.DefaultImpls.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.mark(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    if (PointerId.m3782equalsimpl0(pointerInputChange.m3793getIdJ3iCeTQ(), j2)) {
                        break;
                    }
                    i3++;
                }
                Intrinsics.checkNotNull(pointerInputChange);
                pointerInputChange2 = pointerInputChange;
                if (PointerEventKt.positionChangeConsumed(pointerInputChange2)) {
                    return null;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i4);
                        if (pointerInputChange3.getPressed()) {
                            break;
                        }
                        i4++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        return null;
                    }
                    j2 = pointerInputChange4.m3793getIdJ3iCeTQ();
                } else {
                    f2 += function1.invoke(Offset.m2156boximpl(pointerInputChange2.m3794getPositionF1C5BW0())).floatValue() - function1.invoke(Offset.m2156boximpl(pointerInputChange2.m3795getPreviousPositionF1C5BW0())).floatValue();
                    if (Math.abs(f2) < m469pointerSlopE8SPZFQ) {
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        InlineMarker.mark(0);
                        awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                        InlineMarker.mark(1);
                        if (PointerEventKt.positionChangeConsumed(pointerInputChange2)) {
                            return null;
                        }
                    } else {
                        function2.invoke(pointerInputChange2, Float.valueOf(f2 - (Math.signum(f2) * m469pointerSlopE8SPZFQ)));
                    }
                }
            }
        } while (!PointerEventKt.positionChangeConsumed(pointerInputChange2));
        return pointerInputChange2;
    }

    @Nullable
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88  reason: not valid java name */
    public static final Object m461awaitTouchSlopOrCancellationjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) {
        return m459awaitPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j2, PointerType.Companion.m3862getTouchT8wyACA(), function2, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00bf -> B:24:0x00c5). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m462awaitVerticalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r9) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m462awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02ba, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeConsumed(r14) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x022d -> B:22:0x0135). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02ad -> B:59:0x02b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02ea -> B:22:0x0135). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m463awaitVerticalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r11) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m463awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02e3, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeConsumed(r17) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0257 -> B:62:0x02eb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02d6 -> B:59:0x02de). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x031e -> B:62:0x02eb). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m464awaitVerticalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m464awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1, function2, function02, function0, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return forEachGesture == coroutine_suspended ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m472invokek4lQ0M(offset.m2177unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m472invokek4lQ0M(long j2) {
                }
            };
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return detectDragGestures(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPress(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function02, function0, function2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return forEachGesture == coroutine_suspended ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m477invokek4lQ0M(offset.m2177unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m477invokek4lQ0M(long j2) {
                }
            };
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    @Nullable
    public static final Object detectHorizontalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return forEachGesture == coroutine_suspended ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m481invokek4lQ0M(offset.m2177unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m481invokek4lQ0M(long j2) {
                }
            };
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return detectHorizontalDragGestures(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    @Nullable
    public static final Object detectVerticalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return forEachGesture == coroutine_suspended ? forEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m485invokek4lQ0M(offset.m2177unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m485invokek4lQ0M(long j2) {
                }
            };
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        if ((i2 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return detectVerticalDragGestures(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120 A[SYNTHETIC] */
    /* renamed from: drag-VnAYq1g  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object m465dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r9, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float> r10, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m465dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a4 -> B:20:0x00aa). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: drag-jO51t88  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m466dragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, long r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r0 = r9
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L2f
            r0 = r9
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r11 = r0
            r0 = r11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r10
            r1 = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r9 = r0
            goto L3a
        L2f:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r9 = r0
        L3a:
            r0 = r9
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L7c
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L72
            r0 = r9
            java.lang.Object r0 = r0.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r8 = r0
            r0 = r9
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            r5 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto Laa
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L7c:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
        L81:
            r0 = r9
            r1 = r5
            r0.L$0 = r1
            r0 = r9
            r1 = r8
            r0.L$1 = r1
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r6
            r2 = r9
            java.lang.Object r0 = m454awaitDragOrCancellationrnUCldI(r0, r1, r2)
            r13 = r0
            r0 = r13
            r10 = r0
            r0 = r13
            r1 = r12
            if (r0 != r1) goto Laa
            r0 = r12
            return r0
        Laa:
            r0 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            r10 = r0
            r0 = r10
            if (r0 != 0) goto Lbb
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        Lbb:
            r0 = r10
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r0)
            if (r0 == 0) goto Lc8
            r0 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        Lc8:
            r0 = r8
            r1 = r10
            java.lang.Object r0 = r0.invoke(r1)
            r0 = r10
            long r0 = r0.m3793getIdJ3iCeTQ()
            r6 = r0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m466dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ff -> B:24:0x0104). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: horizontalDrag-jO51t88  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m467horizontalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m467horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w  reason: not valid java name */
    public static final boolean m468isPointerUpDmW0f2w(PointerEvent pointerEvent, long j2) {
        PointerInputChange pointerInputChange;
        boolean z;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i2);
            if (PointerId.m3782equalsimpl0(pointerInputChange.m3793getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 == null) {
            z = false;
        } else {
            z = false;
            if (pointerInputChange2.getPressed()) {
                z = true;
            }
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ  reason: not valid java name */
    public static final float m469pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i2) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        boolean m3855equalsimpl0 = PointerType.m3855equalsimpl0(i2, PointerType.Companion.m3860getMouseT8wyACA());
        float touchSlop = pointerSlop.getTouchSlop();
        float f2 = touchSlop;
        if (m3855equalsimpl0) {
            f2 = touchSlop * mouseToTouchSlopRatio;
        }
        return f2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ff -> B:24:0x0104). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: verticalDrag-jO51t88  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m470verticalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m470verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
