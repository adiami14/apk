package androidx.compose.ui.window;

import androidx.appcompat.R;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��2\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001��¢\u0006\u0002\u0010\u0006J5\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getOffset-nOcc-ac", "()J", "J", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/window/AlignmentOffsetPositionProvider.class */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    @NotNull
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment, long j2) {
        this.alignment = alignment;
        this.offset = j2;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j2);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1044calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j2, @NotNull LayoutDirection layoutDirection, long j3) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long IntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        long mo2047alignKFBX0sM = alignment.mo2047alignKFBX0sM(companion.m4956getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long mo2047alignKFBX0sM2 = this.alignment.mo2047alignKFBX0sM(companion.m4956getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m4951getWidthimpl(j3), IntSize.m4950getHeightimpl(j3)), layoutDirection);
        long IntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(IntOffset) + IntOffset.m4907getXimpl(IntOffset2), IntOffset.m4908getYimpl(IntOffset) + IntOffset.m4908getYimpl(IntOffset2));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(IntOffset3) + IntOffset.m4907getXimpl(mo2047alignKFBX0sM), IntOffset.m4908getYimpl(IntOffset3) + IntOffset.m4908getYimpl(mo2047alignKFBX0sM));
        long IntOffset5 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(mo2047alignKFBX0sM2), IntOffset.m4908getYimpl(mo2047alignKFBX0sM2));
        long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(IntOffset4) - IntOffset.m4907getXimpl(IntOffset5), IntOffset.m4908getYimpl(IntOffset4) - IntOffset.m4908getYimpl(IntOffset5));
        long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(m5039getOffsetnOccac()) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), IntOffset.m4908getYimpl(m5039getOffsetnOccac()));
        return IntOffsetKt.IntOffset(IntOffset.m4907getXimpl(IntOffset6) + IntOffset.m4907getXimpl(IntOffset7), IntOffset.m4908getYimpl(IntOffset6) + IntOffset.m4908getYimpl(IntOffset7));
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public final long m5039getOffsetnOccac() {
        return this.offset;
    }
}
