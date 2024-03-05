package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��Z\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010$\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/DragGestureDetectorCopyKt.class */
public final class DragGestureDetectorCopyKt {
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

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02be, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeConsumed(r19) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0231 -> B:22:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02b1 -> B:59:0x02b9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02ee -> B:22:0x0139). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1300awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, long r7, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r11) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.m1300awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM  reason: not valid java name */
    private static final Object m1301awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (m1302isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float m1303pointerSlopE8SPZFQ = m1303pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
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
                    if (Math.abs(f2) < m1303pointerSlopE8SPZFQ) {
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        InlineMarker.mark(0);
                        awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                        InlineMarker.mark(1);
                        if (PointerEventKt.positionChangeConsumed(pointerInputChange2)) {
                            return null;
                        }
                    } else {
                        function2.invoke(pointerInputChange2, Float.valueOf(f2 - (Math.signum(f2) * m1303pointerSlopE8SPZFQ)));
                    }
                }
            }
        } while (!PointerEventKt.positionChangeConsumed(pointerInputChange2));
        return pointerInputChange2;
    }

    /* renamed from: isPointerUp-DmW0f2w  reason: not valid java name */
    private static final boolean m1302isPointerUpDmW0f2w(PointerEvent pointerEvent, long j2) {
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
    public static final float m1303pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i2) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        boolean m3855equalsimpl0 = PointerType.m3855equalsimpl0(i2, PointerType.Companion.m3860getMouseT8wyACA());
        float touchSlop = pointerSlop.getTouchSlop();
        float f2 = touchSlop;
        if (m3855equalsimpl0) {
            f2 = touchSlop * mouseToTouchSlopRatio;
        }
        return f2;
    }
}
