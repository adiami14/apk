package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��>\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018��2\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b��\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001f\u001a\u00020\u001aH\u0002ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b \u0010\fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010\"\u001a\u00020��2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001c\u0010\t\u001a\u00020\nø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@@X\u0086\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Ljava/util/List;)V", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "buttons", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getButtons-ry648PA", "()I", "I", "getChanges", "()Ljava/util/List;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<set-?>", "Landroidx/compose/ui/input/pointer/PointerEventType;", "type", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "calculatePointerEventType", "calculatePointerEventType-7fucELk", "component1", "copy", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerEvent.class */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    @NotNull
    private final List<PointerInputChange> changes;
    @Nullable
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerEvent(@NotNull List<PointerInputChange> changes) {
        this(changes, null);
        Intrinsics.checkNotNullParameter(changes, "changes");
    }

    public PointerEvent(@NotNull List<PointerInputChange> changes, @Nullable InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.changes = changes;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m3726constructorimpl(motionEvent$ui_release == null ? 0 : motionEvent$ui_release.getButtonState());
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m3845constructorimpl(motionEvent$ui_release2 == null ? 0 : motionEvent$ui_release2.getMetaState());
        this.type = m3733calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk  reason: not valid java name */
    private final int m3733calculatePointerEventType7fucELk() {
        int m3754getPress7fucELk;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = list.get(i2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m3755getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m3754getPress7fucELk();
                }
            }
            return PointerEventType.Companion.m3753getMove7fucELk();
        }
        int actionMasked = motionEvent$ui_release.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            m3754getPress7fucELk = PointerEventType.Companion.m3756getScroll7fucELk();
                            break;
                        case 9:
                            m3754getPress7fucELk = PointerEventType.Companion.m3751getEnter7fucELk();
                            break;
                        case 10:
                            m3754getPress7fucELk = PointerEventType.Companion.m3752getExit7fucELk();
                            break;
                        default:
                            m3754getPress7fucELk = PointerEventType.Companion.m3757getUnknown7fucELk();
                            break;
                    }
                    return m3754getPress7fucELk;
                }
                m3754getPress7fucELk = PointerEventType.Companion.m3753getMove7fucELk();
                return m3754getPress7fucELk;
            }
            m3754getPress7fucELk = PointerEventType.Companion.m3755getRelease7fucELk();
            return m3754getPress7fucELk;
        }
        m3754getPress7fucELk = PointerEventType.Companion.m3754getPress7fucELk();
        return m3754getPress7fucELk;
    }

    @NotNull
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    @NotNull
    public final PointerEvent copy(@NotNull List<PointerInputChange> changes, @Nullable MotionEvent motionEvent) {
        PointerEvent pointerEvent;
        Intrinsics.checkNotNullParameter(changes, "changes");
        if (motionEvent == null) {
            pointerEvent = new PointerEvent(changes, null);
        } else if (Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release())) {
            pointerEvent = new PointerEvent(changes, this.internalPointerEvent);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = changes.get(i2);
                linkedHashMap.put(PointerId.m3779boximpl(pointerInputChange.m3793getIdJ3iCeTQ()), pointerInputChange);
            }
            ArrayList arrayList = new ArrayList(changes.size());
            int size2 = changes.size();
            for (int i3 = 0; i3 < size2; i3++) {
                PointerInputChange pointerInputChange2 = changes.get(i3);
                long m3793getIdJ3iCeTQ = pointerInputChange2.m3793getIdJ3iCeTQ();
                long uptimeMillis = pointerInputChange2.getUptimeMillis();
                long m3794getPositionF1C5BW0 = pointerInputChange2.m3794getPositionF1C5BW0();
                long m3794getPositionF1C5BW02 = pointerInputChange2.m3794getPositionF1C5BW0();
                boolean pressed = pointerInputChange2.getPressed();
                int m3797getTypeT8wyACA = pointerInputChange2.m3797getTypeT8wyACA();
                InternalPointerEvent internalPointerEvent$ui_release = getInternalPointerEvent$ui_release();
                boolean z = true;
                if (internalPointerEvent$ui_release == null || !internalPointerEvent$ui_release.m3721issuesEnterExitEvent0FcD4WY(pointerInputChange2.m3793getIdJ3iCeTQ())) {
                    z = false;
                }
                arrayList.add(new PointerInputEventData(m3793getIdJ3iCeTQ, uptimeMillis, m3794getPositionF1C5BW0, m3794getPositionF1C5BW02, pressed, m3797getTypeT8wyACA, z, null, 0L, 384, null));
            }
            pointerEvent = new PointerEvent(changes, new InternalPointerEvent(linkedHashMap, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
        }
        return pointerEvent;
    }

    /* renamed from: getButtons-ry648PA  reason: not valid java name */
    public final int m3734getButtonsry648PA() {
        return this.buttons;
    }

    @NotNull
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    @Nullable
    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A  reason: not valid java name */
    public final int m3735getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        return internalPointerEvent == null ? null : internalPointerEvent.getMotionEvent();
    }

    /* renamed from: getType-7fucELk  reason: not valid java name */
    public final int m3736getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release  reason: not valid java name */
    public final void m3737setTypeEhbLWgg$ui_release(int i2) {
        this.type = i2;
    }
}
