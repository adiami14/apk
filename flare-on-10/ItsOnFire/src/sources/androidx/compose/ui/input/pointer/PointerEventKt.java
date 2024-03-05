package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��.\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\n\u0010��\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\b*\u00020\u0002\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u0002ø\u0001��¢\u0006\u0002\u0010\u0016\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0018\u001a\u00020\u0015*\u00020\u0002ø\u0001��¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0001H\u0002ø\u0001��¢\u0006\u0002\u0010\u001b\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"anyChangeConsumed", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "consumeAllChanges", "", "consumeDownChange", "consumePositionChange", "isOutOfBounds", "size", "Landroidx/compose/ui/unit/IntSize;", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "positionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeConsumed", "positionChangeIgnoreConsumed", "positionChangeInternal", "ignoreConsumed", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChanged", "positionChangedIgnoreConsumed", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerEventKt.class */
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeConsumed(pointerInputChange) || pointerInputChange.getConsumed().getDownChange();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return (pointerInputChange.getConsumed().getDownChange() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return (pointerInputChange.getConsumed().getDownChange() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        consumeDownChange(pointerInputChange);
        consumePositionChange(pointerInputChange);
    }

    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.getConsumed().setDownChange(true);
        }
    }

    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (Offset.m2164equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m2183getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.getConsumed().setPositionChange(true);
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: isOutOfBounds-O0kMr_c  reason: not valid java name */
    public static final boolean m3738isOutOfBoundsO0kMr_c(@NotNull PointerInputChange isOutOfBounds, long j2) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long m3794getPositionF1C5BW0 = isOutOfBounds.m3794getPositionF1C5BW0();
        float m2167getXimpl = Offset.m2167getXimpl(m3794getPositionF1C5BW0);
        float m2168getYimpl = Offset.m2168getYimpl(m3794getPositionF1C5BW0);
        return m2167getXimpl < 0.0f || m2167getXimpl > ((float) IntSize.m4951getWidthimpl(j2)) || m2168getYimpl < 0.0f || m2168getYimpl > ((float) IntSize.m4950getHeightimpl(j2));
    }

    /* renamed from: isOutOfBounds-jwHxaWs  reason: not valid java name */
    public static final boolean m3739isOutOfBoundsjwHxaWs(@NotNull PointerInputChange isOutOfBounds, long j2, long j3) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (PointerType.m3855equalsimpl0(isOutOfBounds.m3797getTypeT8wyACA(), PointerType.Companion.m3862getTouchT8wyACA())) {
            long m3794getPositionF1C5BW0 = isOutOfBounds.m3794getPositionF1C5BW0();
            float m2167getXimpl = Offset.m2167getXimpl(m3794getPositionF1C5BW0);
            float m2168getYimpl = Offset.m2168getYimpl(m3794getPositionF1C5BW0);
            return m2167getXimpl < (-Size.m2239getWidthimpl(j3)) || m2167getXimpl > ((float) IntSize.m4951getWidthimpl(j2)) + Size.m2239getWidthimpl(j3) || m2168getYimpl < (-Size.m2236getHeightimpl(j3)) || m2168getYimpl > ((float) IntSize.m4950getHeightimpl(j2)) + Size.m2236getHeightimpl(j3);
        }
        return m3738isOutOfBoundsO0kMr_c(isOutOfBounds, j2);
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.getConsumed().getPositionChange();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long m2171minusMKHz9U = Offset.m2171minusMKHz9U(pointerInputChange.m3794getPositionF1C5BW0(), pointerInputChange.m3795getPreviousPositionF1C5BW0());
        long j2 = m2171minusMKHz9U;
        if (!z) {
            j2 = m2171minusMKHz9U;
            if (pointerInputChange.getConsumed().getPositionChange()) {
                j2 = Offset.Companion.m2183getZeroF1C5BW0();
            }
        }
        return j2;
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m2164equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m2183getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m2164equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m2183getZeroF1C5BW0());
    }
}
