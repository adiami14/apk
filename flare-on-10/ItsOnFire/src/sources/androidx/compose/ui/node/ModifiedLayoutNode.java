package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b��\u0018�� !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/LayoutModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/LayoutModifier;)V", "modifierState", "Landroidx/compose/runtime/MutableState;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getWrappedByCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "modifierFromState", "onModifierChanged", "", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/ModifiedLayoutNode.class */
public final class ModifiedLayoutNode extends DelegatingLayoutNodeWrapper<LayoutModifier> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Paint modifierBoundsPaint;
    @Nullable
    private MutableState<LayoutModifier> modifierState;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/node/ModifiedLayoutNode$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getModifierBoundsPaint() {
            return ModifiedLayoutNode.modifierBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2294setColor8_81llA(Color.Companion.m2441getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2298setStylek9PVt8s(PaintingStyle.Companion.m2627getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedLayoutNode(@NotNull LayoutNodeWrapper wrapped, @NotNull LayoutModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    private final LayoutModifier modifierFromState() {
        MutableState<LayoutModifier> mutableStateOf$default;
        MutableState<LayoutModifier> mutableState = this.modifierState;
        MutableState<LayoutModifier> mutableState2 = mutableState;
        if (mutableState == null) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getModifier(), null, 2, null);
            mutableState2 = mutableStateOf$default;
        }
        this.modifierState = mutableState2;
        return mutableState2.getValue();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        int i2 = Integer.MIN_VALUE;
        if (getMeasureResult().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = getMeasureResult().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                i2 = num.intValue();
            }
            return i2;
        }
        int i3 = getWrapped$ui_release().get(alignmentLine);
        if (i3 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        setShallowPlacing(true);
        mo3911placeAtf8xVGno(m4079getPositionnOccac(), getZIndex(), getLayerBlock());
        setShallowPlacing(false);
        boolean z = alignmentLine instanceof HorizontalAlignmentLine;
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        return i3 + (z ? IntOffset.m4908getYimpl(wrapped$ui_release.m4079getPositionnOccac()) : IntOffset.m4907getXimpl(wrapped$ui_release.m4079getPositionnOccac()));
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public LayoutCoordinates getWrappedByCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return modifierFromState().maxIntrinsicHeight(getMeasureScope(), getWrapped$ui_release(), i2);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return modifierFromState().maxIntrinsicWidth(getMeasureScope(), getWrapped$ui_release(), i2);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo3910measureBRTryo0(long j2) {
        m3960setMeasurementConstraintsBRTryo0(j2);
        setMeasureResult$ui_release(getModifier().mo105measure3p2s80s(getMeasureScope(), getWrapped$ui_release(), j2));
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo4104resizeozmzZPI(m3957getMeasuredSizeYbymL2g());
        }
        return this;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return modifierFromState().minIntrinsicHeight(getMeasureScope(), getWrapped$ui_release(), i2);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return modifierFromState().minIntrinsicWidth(getMeasureScope(), getWrapped$ui_release(), i2);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        MutableState<LayoutModifier> mutableState = this.modifierState;
        if (mutableState == null) {
            return;
        }
        mutableState.setValue(getModifier());
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getWrapped$ui_release().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode$ui_release()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }
}
