package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010��\u001a\u00020\u0001*\u00020\u0002H��\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080@ø\u0001��¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u0006H\u0080@ø\u0001��¢\u0006\u0002\u0010\u0007\u001a>\u0010\b\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@ø\u0001��¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ForEachGestureKt.class */
public final class ForEachGestureKt {
    public static final boolean allPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(awaitPointerEventScope, "<this>");
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            z = false;
            if (i2 >= size) {
                break;
            } else if (changes.get(i2).getPressed()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (allPointersUp(r4) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
        r0 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r5.L$0 = r4;
        r5.label = 1;
        r0 = r4.awaitPointerEvent(r0, r5);
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
        if (r0 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
        if (r7 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0089 -> B:21:0x008f). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object awaitAllPointersUp(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return awaitPointerEventScope == coroutine_suspended ? awaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(2:9|(2:11|(2:13|(2:15|16)(3:18|19|20))(7:21|22|23|24|25|26|(4:30|31|32|(2:34|35)(18:36|37|38|39|40|41|42|43|44|45|46|47|(2:49|50)|23|24|25|26|(2:28|29)(0)))(0)))(19:62|63|37|38|39|40|41|42|43|44|45|46|47|(0)|23|24|25|26|(0)(0)))(3:64|26|(0)(0))))|67|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
        r0 = r5;
        r6 = r0;
        r5 = r12;
        r12 = r7;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
        r6.L$0 = r5;
        r6.L$1 = null;
        r6.L$2 = null;
        r6.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cc, code lost:
        if (awaitAllPointersUp(r4, r6) == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d1, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        r11 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0192 -> B:21:0x009f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01d4 -> B:61:0x01d8). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerInputScope r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
