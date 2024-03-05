package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.core.view.InputDeviceCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��D\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a.\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H��\u001aG\u0010\b\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019\"\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aU\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u0010\u001a\u00020\rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u0006H��\u001a(\u0010!\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H��\u001a\u0014\u0010\"\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H��*<\b��\u0010#\"\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n2\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerInputTestUtilKt.class */
public final class PointerInputTestUtilKt {
    @NotNull
    public static final PointerInputChange down(long j2, long j3, float f2, float f3) {
        return new PointerInputChange(PointerId.m3780constructorimpl(j2), j3, OffsetKt.Offset(f2, f3), true, j3, OffsetKt.Offset(f2, f3), false, new ConsumedData(false, false, 3, null), 0, 256, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j2, long j3, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = 0;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        return down(j2, j3, f2, f3);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY  reason: not valid java name */
    public static final void m3832invokeOverAllPassesH0pRuoY(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverAllPasses, @NotNull PointerEvent pointerEvent, long j2) {
        List listOf;
        Intrinsics.checkNotNullParameter(invokeOverAllPasses, "$this$invokeOverAllPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final});
        m3836invokeOverPasseshUlJWOE(invokeOverAllPasses, pointerEvent, listOf, j2);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default  reason: not valid java name */
    public static /* synthetic */ void m3833invokeOverAllPassesH0pRuoY$default(Function3 function3, PointerEvent pointerEvent, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3832invokeOverAllPassesH0pRuoY(function3, pointerEvent, j2);
    }

    /* renamed from: invokeOverPass-hUlJWOE  reason: not valid java name */
    public static final void m3834invokeOverPasshUlJWOE(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPass, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pointerEventPass, long j2) {
        List listOf;
        Intrinsics.checkNotNullParameter(invokeOverPass, "$this$invokeOverPass");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pointerEventPass");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(pointerEventPass);
        m3836invokeOverPasseshUlJWOE(invokeOverPass, pointerEvent, listOf, j2);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default  reason: not valid java name */
    public static /* synthetic */ void m3835invokeOverPasshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3834invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j2);
    }

    /* renamed from: invokeOverPasses-hUlJWOE  reason: not valid java name */
    public static final void m3836invokeOverPasseshUlJWOE(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPasses, @NotNull PointerEvent pointerEvent, @NotNull List<? extends PointerEventPass> pointerEventPasses, long j2) {
        Intrinsics.checkNotNullParameter(invokeOverPasses, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPasses, "pointerEventPasses");
        if (!(!pointerEvent.getChanges().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!pointerEventPasses.isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int size = pointerEventPasses.size();
        for (int i2 = 0; i2 < size; i2++) {
            invokeOverPasses.invoke(pointerEvent, pointerEventPasses.get(i2), IntSize.m4943boximpl(j2));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE  reason: not valid java name */
    public static final void m3837invokeOverPasseshUlJWOE(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPasses, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass[] pointerEventPasses, long j2) {
        List list;
        Intrinsics.checkNotNullParameter(invokeOverPasses, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPasses, "pointerEventPasses");
        list = ArraysKt___ArraysKt.toList(pointerEventPasses);
        m3836invokeOverPasseshUlJWOE(invokeOverPasses, pointerEvent, list, j2);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default  reason: not valid java name */
    public static /* synthetic */ void m3838invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, List list, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3836invokeOverPasseshUlJWOE(function3, pointerEvent, list, j2);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default  reason: not valid java name */
    public static /* synthetic */ void m3839invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3837invokeOverPasseshUlJWOE(function3, pointerEvent, pointerEventPassArr, j2);
    }

    @NotNull
    public static final PointerInputChange moveBy(@NotNull PointerInputChange pointerInputChange, long j2, float f2, float f3) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return PointerInputChange.m3787copyEzrO64$default(pointerInputChange, 0L, pointerInputChange.getUptimeMillis() + j2, OffsetKt.Offset(Offset.m2167getXimpl(pointerInputChange.m3794getPositionF1C5BW0()) + f2, Offset.m2168getYimpl(pointerInputChange.m3794getPositionF1C5BW0()) + f3), true, uptimeMillis, pointerInputChange.m3794getPositionF1C5BW0(), pressed, new ConsumedData(false, false, 3, null), 0, InputDeviceCompat.SOURCE_KEYBOARD, null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return moveBy(pointerInputChange, j2, f2, f3);
    }

    @NotNull
    public static final PointerInputChange moveTo(@NotNull PointerInputChange pointerInputChange, long j2, float f2, float f3) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return PointerInputChange.m3787copyEzrO64$default(pointerInputChange, 0L, j2, OffsetKt.Offset(f2, f3), true, uptimeMillis, pointerInputChange.m3794getPositionF1C5BW0(), pressed, new ConsumedData(false, false, 3, null), 0, InputDeviceCompat.SOURCE_KEYBOARD, null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return moveTo(pointerInputChange, j2, f2, f3);
    }

    @NotNull
    public static final PointerInputChange up(@NotNull PointerInputChange pointerInputChange, long j2) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return PointerInputChange.m3787copyEzrO64$default(pointerInputChange, 0L, j2, pointerInputChange.m3794getPositionF1C5BW0(), false, uptimeMillis, pointerInputChange.m3794getPositionF1C5BW0(), pressed, new ConsumedData(false, false, 3, null), 0, InputDeviceCompat.SOURCE_KEYBOARD, null);
    }
}
