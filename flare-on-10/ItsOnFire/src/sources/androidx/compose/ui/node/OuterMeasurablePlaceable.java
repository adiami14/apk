package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010��\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b��\u0018��2\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0096\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0016J\u001d\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0016J\b\u0010:\u001a\u00020\u0015H\u0002J@\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001b2\u0019\u0010>\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u0016H\u0014ø\u0001��ø\u0001\u0001¢\u0006\u0004\b?\u0010@J@\u0010A\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001b2\u0019\u0010>\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u0016H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bB\u0010@J\u0006\u0010C\u001a\u00020\u0015J\u001b\u0010D\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000fø\u0001��ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u0006\u0010G\u001a\u00020\u0015R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u0016X\u0082\u000e¢\u0006\u0002\n��R\u0019\u0010\u0017\u001a\u00020\u0018X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010!\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010(@RX\u0096\u000e¢\u0006\b\n��\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "outerWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "duringAlignmentLinesQuery", "", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "getOuterWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setOuterWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "<set-?>", "", "parentData", "getParentData", "()Ljava/lang/Object;", "placedOnce", "get", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "onIntrinsicsQueried", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeOuterWrapper", "placeOuterWrapper-f8xVGno", "recalculateParentData", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/OuterMeasurablePlaceable.class */
public final class OuterMeasurablePlaceable extends Placeable implements Measurable {
    private boolean duringAlignmentLinesQuery;
    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    @NotNull
    private final LayoutNode layoutNode;
    private boolean measuredOnce;
    @NotNull
    private LayoutNodeWrapper outerWrapper;
    @Nullable
    private Object parentData;
    private boolean placedOnce;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/node/OuterMeasurablePlaceable$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OuterMeasurablePlaceable(@NotNull LayoutNode layoutNode, @NotNull LayoutNodeWrapper outerWrapper) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.layoutNode = layoutNode;
        this.outerWrapper = outerWrapper;
        this.lastPosition = IntOffset.Companion.m4917getZeronOccac();
    }

    private final void onIntrinsicsQueried() {
        this.layoutNode.requestRemeasure$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeOuterWrapper-f8xVGno  reason: not valid java name */
    public final void m4097placeOuterWrapperf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        if (function1 == null) {
            companion.m3966place70tqf50(getOuterWrapper(), j2, f2);
        } else {
            companion.m3971placeWithLayeraW9wM(getOuterWrapper(), j2, f2, function1);
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if ((parent$ui_release == null ? null : parent$ui_release.getLayoutState$ui_release()) == LayoutNode.LayoutState.Measuring) {
            this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if ((parent$ui_release2 == null ? null : parent$ui_release2.getLayoutState$ui_release()) == LayoutNode.LayoutState.LayingOut) {
                this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i2 = this.outerWrapper.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i2;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    @Nullable
    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m4098getLastConstraintsDWUhwKw() {
        return this.measuredOnce ? Constraints.m4740boximpl(m3958getMeasurementConstraintsmsEJaDk()) : null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return this.outerWrapper.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return this.outerWrapper.getMeasuredWidth();
    }

    @NotNull
    public final LayoutNodeWrapper getOuterWrapper() {
        return this.outerWrapper;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.parentData;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo3910measureBRTryo0(long j2) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            if (!(this.layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.NotUsed || this.layoutNode.getCanMultiMeasure$ui_release())) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.layoutNode.getMeasuredByParent$ui_release() + ". Parent state " + parent$ui_release.getLayoutState$ui_release() + '.').toString());
            }
            LayoutNode layoutNode = this.layoutNode;
            int i2 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i2 == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i2 != 2) {
                throw new IllegalStateException(Intrinsics.stringPlus("Measurable could be only measured from the parent's measure or layout block.Parents state is ", parent$ui_release.getLayoutState$ui_release()));
            } else {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.setMeasuredByParent$ui_release(usageByParent);
        } else {
            this.layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
        m4099remeasureBRTryo0(j2);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3911placeAtf8xVGno(final long j2, final float f2, @Nullable final Function1<? super GraphicsLayerScope, Unit> function1) {
        this.lastPosition = j2;
        this.lastZIndex = f2;
        this.lastLayerBlock = function1;
        LayoutNodeWrapper wrappedBy$ui_release = this.outerWrapper.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null && wrappedBy$ui_release.isShallowPlacing()) {
            m4097placeOuterWrapperf8xVGno(j2, f2, function1);
            return;
        }
        this.placedOnce = true;
        this.layoutNode.getAlignmentLines$ui_release().setUsedByModifierLayout$ui_release(false);
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(this.layoutNode, new Function0<Unit>() { // from class: androidx.compose.ui.node.OuterMeasurablePlaceable$placeAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                OuterMeasurablePlaceable.this.m4097placeOuterWrapperf8xVGno(j2, f2, function1);
            }
        });
    }

    public final void recalculateParentData() {
        this.parentData = this.outerWrapper.getParentData();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* renamed from: remeasure-BRTryo0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4099remeasureBRTryo0(final long r9) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.OuterMeasurablePlaceable.m4099remeasureBRTryo0(long):boolean");
    }

    public final void replace() {
        if (!this.placedOnce) {
            throw new IllegalStateException("Check failed.".toString());
        }
        mo3911placeAtf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    public final void setOuterWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
        this.outerWrapper = layoutNodeWrapper;
    }
}
