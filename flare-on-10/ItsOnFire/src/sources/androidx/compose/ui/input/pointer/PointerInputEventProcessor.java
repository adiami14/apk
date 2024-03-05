package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "process", "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "isInBounds", "", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "processCancel", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerInputEventProcessor.class */
public final class PointerInputEventProcessor {
    @NotNull
    private final HitPathTracker hitPathTracker;
    @NotNull
    private final HitTestResult<PointerInputFilter> hitResult;
    @NotNull
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer;
    @NotNull
    private final LayoutNode root;

    public PointerInputEventProcessor(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.hitPathTracker = new HitPathTracker(root.getCoordinates());
        this.pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
        this.hitResult = new HitTestResult<>();
    }

    /* renamed from: process-BIzXfog$default  reason: not valid java name */
    public static /* synthetic */ int m3812processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m3813processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    @NotNull
    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog  reason: not valid java name */
    public final int m3813processBIzXfog(@NotNull PointerInputEvent pointerEvent, @NotNull PositionCalculator positionCalculator, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);
        Collection<PointerInputChange> values = produce.getChanges().values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (PointerInputChange pointerInputChange : values) {
                if (pointerInputChange.getPressed() || pointerInputChange.getPreviousPressed()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        for (PointerInputChange pointerInputChange2 : produce.getChanges().values()) {
            if ((!z2) || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                LayoutNode.m4053hitTestM_7yMNQ$ui_release$default(getRoot(), pointerInputChange2.m3794getPositionF1C5BW0(), this.hitResult, PointerType.m3855equalsimpl0(pointerInputChange2.m3797getTypeT8wyACA(), PointerType.Companion.m3862getTouchT8wyACA()), false, 8, null);
                if (!this.hitResult.isEmpty()) {
                    this.hitPathTracker.m3720addHitPathKNwqfcY(pointerInputChange2.m3793getIdJ3iCeTQ(), this.hitResult);
                    this.hitResult.clear();
                }
            }
        }
        this.hitPathTracker.removeDetachedPointerInputFilters();
        boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z);
        if (!produce.getSuppressMovementConsumption()) {
            Collection<PointerInputChange> values2 = produce.getChanges().values();
            if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                for (PointerInputChange pointerInputChange3 : values2) {
                    if (pointerInputChange3.getConsumed().getPositionChange()) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        z3 = false;
        return PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z3);
    }

    public final void processCancel() {
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
