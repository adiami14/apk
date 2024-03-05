package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b��\u0018�� x2\u00020\u00012\u00020\u0002:\u0001xB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010$\u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020&H\u0014Jy\u0010'\u001a\u00020(\"\u0004\b��\u0010)2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H)0-2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e25\u00100\u001a1\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0-\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020(01¢\u0006\u0002\b2H\u0082\bø\u0001��ø\u0001\u0001¢\u0006\u0004\b3\u00104J;\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002050-2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001eH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b6\u00107J3\u00108\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0-2\u0006\u0010/\u001a\u00020\u001eH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0016J\u0010\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u0015H\u0016J\u001d\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0016J\u0010\u0010H\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u0015H\u0016J\u0010\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020KH\u0016J@\u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00072\u0019\u0010P\u001a\u0015\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020(\u0018\u00010Q¢\u0006\u0002\b2H\u0014ø\u0001��ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020\u001eH\u0016J\u001a\u0010Y\u001a\u00020\u0015*\u00020ZH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b[\u0010\\J\u001a\u0010Y\u001a\u00020\u0015*\u00020]H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010`\u001a\u00020Z*\u00020]H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ\u001d\u0010`\u001a\u00020Z*\u00020\u0007H\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ\u001d\u0010`\u001a\u00020Z*\u00020\u0015H\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bc\u0010eJ\u001a\u0010f\u001a\u00020g*\u00020hH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\bi\u0010jJ\u001a\u0010k\u001a\u00020\u0007*\u00020ZH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\bl\u0010dJ\u001a\u0010k\u001a\u00020\u0007*\u00020]H\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\bm\u0010bJ\r\u0010n\u001a\u00020o*\u00020pH\u0097\u0001J\u001a\u0010q\u001a\u00020h*\u00020gH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\br\u0010jJ\u001a\u0010s\u001a\u00020]*\u00020ZH\u0097\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ\u001d\u0010s\u001a\u00020]*\u00020\u0007H\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bv\u0010uJ\u001d\u0010s\u001a\u00020]*\u00020\u0015H\u0097\u0001ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bv\u0010wR\u0014\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/unit/Density;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "excludeDeactivated", "", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "getWrappedByCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hitTest", "", "T", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "childHitTest", "Lkotlin/Function5;", "Lkotlin/ExtensionFunctionType;", "hitTest-ULxng0E", "(JLandroidx/compose/ui/node/HitTestResult;ZZLkotlin/jvm/functions/Function5;)V", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-M_7yMNQ", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-9KIMszo", "(JLandroidx/compose/ui/node/HitTestResult;Z)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "propagateFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "shouldSharePointerInputWithSiblings", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/InnerPlaceable.class */
public final class InnerPlaceable extends LayoutNodeWrapper implements Density {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Paint innerBoundsPaint;
    private final /* synthetic */ MeasureScope $$delegate_0;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/node/InnerPlaceable$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerPlaceable.innerBoundsPaint;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/node/InnerPlaceable$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2294setColor8_81llA(Color.Companion.m2448getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2298setStylek9PVt8s(PaintingStyle.Companion.m2627getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerPlaceable(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.$$delegate_0 = layoutNode.getMeasureScope$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[EDGE_INSN: B:42:0x00e1->B:40:0x00e1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: hitTest-ULxng0E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> void m4048hitTestULxng0E(long r8, androidx.compose.ui.node.HitTestResult<T> r10, boolean r11, boolean r12, kotlin.jvm.functions.Function5<? super androidx.compose.ui.node.LayoutNode, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.node.HitTestResult<T>, ? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.m4048hitTestULxng0E(long, androidx.compose.ui.node.HitTestResult, boolean, boolean, kotlin.jvm.functions.Function5):void");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = getLayoutNode$ui_release().calculateAlignmentLines$ui_release().get(alignmentLine);
        return num == null ? Integer.MIN_VALUE : num.intValue();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findLastFocusWrapper() {
        return findPreviousFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        return findPreviousKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findNextFocusWrapper(boolean z) {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findPreviousFocusWrapper() {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        return wrappedBy$ui_release == null ? null : wrappedBy$ui_release.findPreviousFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findPreviousKeyInputWrapper() {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        return wrappedBy$ui_release == null ? null : wrappedBy$ui_release.findPreviousKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper() {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        return wrappedBy$ui_release == null ? null : wrappedBy$ui_release.findPreviousNestedScrollWrapper();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public MeasureScope getMeasureScope() {
        return getLayoutNode$ui_release().getMeasureScope$ui_release();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public LayoutCoordinates getWrappedByCoordinates() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[EDGE_INSN: B:42:0x00da->B:40:0x00da ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTest-M_7yMNQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4029hitTestM_7yMNQ(long r8, @org.jetbrains.annotations.NotNull androidx.compose.ui.node.HitTestResult<androidx.compose.ui.input.pointer.PointerInputFilter> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.mo4029hitTestM_7yMNQ(long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[EDGE_INSN: B:41:0x00d4->B:38:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTestSemantics-9KIMszo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4031hitTestSemantics9KIMszo(long r8, @org.jetbrains.annotations.NotNull androidx.compose.ui.node.HitTestResult<androidx.compose.ui.semantics.SemanticsWrapper> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.mo4031hitTestSemantics9KIMszo(long, androidx.compose.ui.node.HitTestResult, boolean):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo3910measureBRTryo0(long j2) {
        int i2;
        m3960setMeasurementConstraintsBRTryo0(j2);
        MutableVector<LayoutNode> mutableVector = getLayoutNode$ui_release().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            getLayoutNode$ui_release().handleMeasureResult$ui_release(getLayoutNode$ui_release().getMeasurePolicy().mo89measure3p2s80s(getLayoutNode$ui_release().getMeasureScope$ui_release(), getLayoutNode$ui_release().getChildren$ui_release(), j2));
            return this;
        }
        int i3 = 0;
        LayoutNode[] content = mutableVector.getContent();
        do {
            content[i3].setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            i2 = i3 + 1;
            i3 = i2;
        } while (i2 < size);
        getLayoutNode$ui_release().handleMeasureResult$ui_release(getLayoutNode$ui_release().getMeasurePolicy().mo89measure3p2s80s(getLayoutNode$ui_release().getMeasureScope$ui_release(), getLayoutNode$ui_release().getChildren$ui_release(), j2));
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void performDraw(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.Canvas r5) {
        /*
            r4 = this;
            r0 = r5
            java.lang.String r1 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            androidx.compose.ui.node.LayoutNode r0 = r0.getLayoutNode$ui_release()
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.LayoutNodeKt.requireOwner(r0)
            r6 = r0
            r0 = r4
            androidx.compose.ui.node.LayoutNode r0 = r0.getLayoutNode$ui_release()
            androidx.compose.runtime.collection.MutableVector r0 = r0.getZSortedChildren()
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            r8 = r0
            r0 = r8
            if (r0 <= 0) goto L52
            r0 = 0
            r9 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.getContent()
            r7 = r0
        L2a:
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            androidx.compose.ui.node.LayoutNode r0 = (androidx.compose.ui.node.LayoutNode) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0.isPlaced()
            if (r0 == 0) goto L41
            r0 = r10
            r1 = r5
            r0.draw$ui_release(r1)
        L41:
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            r1 = r8
            if (r0 < r1) goto L2a
        L52:
            r0 = r6
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L63
            r0 = r4
            r1 = r5
            androidx.compose.ui.graphics.Paint r2 = androidx.compose.ui.node.InnerPlaceable.innerBoundsPaint
            r0.drawBorder(r1, r2)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.performDraw(androidx.compose.ui.graphics.Canvas):void");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3911placeAtf8xVGno(long j2, float f2, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        super.mo3911placeAtf8xVGno(j2, f2, function1);
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        boolean z = false;
        if (wrappedBy$ui_release != null && wrappedBy$ui_release.isShallowPlacing()) {
            z = true;
        }
        if (z) {
            return;
        }
        getLayoutNode$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(@NotNull FocusState focusState) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        int i2 = 0;
        List<ModifiedFocusNode> focusableChildren = focusableChildren(false);
        int size = focusableChildren.size();
        ModifiedFocusNode modifiedFocusNode = null;
        Boolean bool2 = null;
        while (true) {
            Boolean bool3 = bool2;
            if (i2 >= size) {
                FocusStateImpl focusState2 = modifiedFocusNode == null ? null : modifiedFocusNode.getFocusState();
                FocusStateImpl focusStateImpl = focusState2;
                if (focusState2 == null) {
                    focusStateImpl = Intrinsics.areEqual(bool3, Boolean.TRUE) ? FocusStateImpl.Deactivated : FocusStateImpl.Inactive;
                }
                super.propagateFocusEvent(focusStateImpl);
                return;
            }
            ModifiedFocusNode modifiedFocusNode2 = focusableChildren.get(i2);
            switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode2.getFocusState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    bool = Boolean.FALSE;
                    break;
                case 5:
                    modifiedFocusNode2 = modifiedFocusNode;
                    bool = bool3;
                    if (bool3 != null) {
                        break;
                    } else {
                        bool = Boolean.TRUE;
                        modifiedFocusNode2 = modifiedFocusNode;
                        break;
                    }
                case 6:
                    bool = Boolean.FALSE;
                    modifiedFocusNode2 = modifiedFocusNode;
                    break;
                default:
                    modifiedFocusNode2 = modifiedFocusNode;
                    bool = bool3;
                    break;
            }
            i2++;
            modifiedFocusNode = modifiedFocusNode2;
            bool2 = bool;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo517roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo517roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo518roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo518roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public boolean shouldSharePointerInputWithSiblings() {
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo519toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo519toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo520toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo520toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo521toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo521toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo522toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo522toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo523toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo523toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo524toPx0680j_4(float f2) {
        return this.$$delegate_0.mo524toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo525toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo525toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo526toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo526toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo527toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo527toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo528toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo528toSpkPz2Gy4(i2);
    }
}
