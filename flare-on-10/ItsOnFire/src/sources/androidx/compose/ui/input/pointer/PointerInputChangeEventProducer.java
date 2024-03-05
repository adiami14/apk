package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018��2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "()V", "previousPointerInputData", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "clear", "", "produce", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "PointerInputData", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerInputChangeEventProducer.class */
final class PointerInputChangeEventProducer {
    @NotNull
    private final Map<PointerId, PointerInputData> previousPointerInputData = new LinkedHashMap();

    @Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018��2\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001��¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u00020\tø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "down", "", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getPositionOnScreen-F1C5BW0", "()J", "J", "getType-T8wyACA", "()I", "I", "getUptime", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData.class */
    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        private PointerInputData(long j2, long j3, boolean z, int i2) {
            this.uptime = j2;
            this.positionOnScreen = j3;
            this.down = z;
            this.type = i2;
        }

        public /* synthetic */ PointerInputData(long j2, long j3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, z, i2);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
        public final long m3798getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        /* renamed from: getType-T8wyACA  reason: not valid java name */
        public final int m3799getTypeT8wyACA() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    @NotNull
    public final InternalPointerEvent produce(@NotNull PointerInputEvent pointerInputEvent, @NotNull PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long mo3865screenToLocalMKHz9U;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputEventData pointerInputEventData = pointers.get(i2);
            PointerInputData pointerInputData = this.previousPointerInputData.get(PointerId.m3779boximpl(pointerInputEventData.m3807getIdJ3iCeTQ()));
            if (pointerInputData == null) {
                uptime = pointerInputEventData.getUptime();
                mo3865screenToLocalMKHz9U = pointerInputEventData.m3808getPositionF1C5BW0();
                down = false;
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                mo3865screenToLocalMKHz9U = positionCalculator.mo3865screenToLocalMKHz9U(pointerInputData.m3798getPositionOnScreenF1C5BW0());
            }
            linkedHashMap.put(PointerId.m3779boximpl(pointerInputEventData.m3807getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m3807getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m3808getPositionF1C5BW0(), pointerInputEventData.getDown(), uptime, mo3865screenToLocalMKHz9U, down, new ConsumedData(false, false, 3, null), pointerInputEventData.m3811getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m3810getScrollDeltaF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(PointerId.m3779boximpl(pointerInputEventData.m3807getIdJ3iCeTQ()), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m3809getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m3811getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(PointerId.m3779boximpl(pointerInputEventData.m3807getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}
