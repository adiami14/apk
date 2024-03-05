package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.appcompat.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b��\u0018��2\u00020\u0001B$\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001��¢\u0006\u0002\u0010\bJ\u001b\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003ø\u0001��¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "(Ljava/util/Map;Landroidx/compose/ui/input/pointer/PointerInputEvent;)V", "getChanges", "()Ljava/util/Map;", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "getPointerInputEvent", "()Landroidx/compose/ui/input/pointer/PointerInputEvent;", "suppressMovementConsumption", "", "getSuppressMovementConsumption", "()Z", "setSuppressMovementConsumption", "(Z)V", "issuesEnterExitEvent", "pointerId", "issuesEnterExitEvent-0FcD4WY", "(J)Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/InternalPointerEvent.class */
public final class InternalPointerEvent {
    @NotNull
    private final Map<PointerId, PointerInputChange> changes;
    @NotNull
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull PointerInputEvent pointerInputEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        this.changes = changes;
        this.pointerInputEvent = pointerInputEvent;
    }

    @NotNull
    public final Map<PointerId, PointerInputChange> getChanges() {
        return this.changes;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    @NotNull
    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    /* renamed from: issuesEnterExitEvent-0FcD4WY  reason: not valid java name */
    public final boolean m3721issuesEnterExitEvent0FcD4WY(long j2) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i2);
            if (PointerId.m3782equalsimpl0(pointerInputEventData.m3807getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            z = pointerInputEventData2.getIssuesEnterExit();
        }
        return z;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.suppressMovementConsumption = z;
    }
}
