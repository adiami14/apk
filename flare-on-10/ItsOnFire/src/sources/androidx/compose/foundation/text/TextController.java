package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\f\u0010%\u001a\u00020\u0006*\u00020\u0006H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/RememberObserver;", "state", "Landroidx/compose/foundation/text/TextState;", "(Landroidx/compose/foundation/text/TextState;)V", "coreModifiers", "Landroidx/compose/ui/Modifier;", "longPressDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getLongPressDragObserver", "()Landroidx/compose/foundation/text/TextDragObserver;", "setLongPressDragObserver", "(Landroidx/compose/foundation/text/TextDragObserver;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "modifiers", "getModifiers", "()Landroidx/compose/ui/Modifier;", "selectionModifiers", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "getState", "()Landroidx/compose/foundation/text/TextState;", "onAbandoned", "", "onForgotten", "onRemembered", "outOfBoundary", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "outOfBoundary-0a9Yr6o", "(JJ)Z", "update", "drawTextAndSelectionBehind", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextController.class */
public final class TextController implements RememberObserver {
    @NotNull
    private final Modifier coreModifiers;
    public TextDragObserver longPressDragObserver;
    @NotNull
    private final MeasurePolicy measurePolicy;
    @NotNull
    private Modifier selectionModifiers;
    @Nullable
    private SelectionRegistrar selectionRegistrar;
    @NotNull
    private final TextState state;

    public TextController(@NotNull TextState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return IntSize.m4950getHeightimpl(TextDelegate.m967layoutNN6EwU$default(TextController.this.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).m4457getSizeYbymL2g());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextController.this.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return TextController.this.getState().getTextDelegate().getMaxIntrinsicWidth();
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
                r0 = r0.selectionRegistrar;
             */
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @org.jetbrains.annotations.NotNull
            /* renamed from: measure-3p2s80s */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public androidx.compose.ui.layout.MeasureResult mo89measure3p2s80s(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.MeasureScope r11, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.compose.ui.layout.Measurable> r12, long r13) {
                /*
                    Method dump skipped, instructions count: 463
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$measurePolicy$1.mo89measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return IntSize.m4950getHeightimpl(TextDelegate.m967layoutNN6EwU$default(TextController.this.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).m4457getSizeYbymL2g());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextController.this.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return TextController.this.getState().getTextDelegate().getMinIntrinsicWidth();
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.coreModifiers = SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(companion), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
                r0 = r5.this$0.selectionRegistrar;
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r6) {
                /*
                    r5 = this;
                    r0 = r6
                    java.lang.String r1 = "it"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0 = r5
                    androidx.compose.foundation.text.TextController r0 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.TextState r0 = r0.getState()
                    r1 = r6
                    r0.setLayoutCoordinates(r1)
                    r0 = r5
                    androidx.compose.foundation.text.TextController r0 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.selection.SelectionRegistrar r0 = androidx.compose.foundation.text.TextController.access$getSelectionRegistrar$p(r0)
                    r1 = r5
                    androidx.compose.foundation.text.TextController r1 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.TextState r1 = r1.getState()
                    long r1 = r1.getSelectableId()
                    boolean r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(r0, r1)
                    if (r0 == 0) goto L68
                    r0 = r6
                    long r0 = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(r0)
                    r7 = r0
                    r0 = r7
                    r1 = r5
                    androidx.compose.foundation.text.TextController r1 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.TextState r1 = r1.getState()
                    long r1 = r1.m1031getPreviousGlobalPositionF1C5BW0()
                    boolean r0 = androidx.compose.ui.geometry.Offset.m2164equalsimpl0(r0, r1)
                    if (r0 != 0) goto L5d
                    r0 = r5
                    androidx.compose.foundation.text.TextController r0 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.selection.SelectionRegistrar r0 = androidx.compose.foundation.text.TextController.access$getSelectionRegistrar$p(r0)
                    r6 = r0
                    r0 = r6
                    if (r0 != 0) goto L4d
                    goto L5d
                L4d:
                    r0 = r6
                    r1 = r5
                    androidx.compose.foundation.text.TextController r1 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.TextState r1 = r1.getState()
                    long r1 = r1.getSelectableId()
                    r0.notifyPositionChange(r1)
                L5d:
                    r0 = r5
                    androidx.compose.foundation.text.TextController r0 = androidx.compose.foundation.text.TextController.this
                    androidx.compose.foundation.text.TextState r0 = r0.getState()
                    r1 = r7
                    r0.m1033setPreviousGlobalPositionk4lQ0M(r1)
                L68:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$coreModifiers$1.invoke2(androidx.compose.ui.layout.LayoutCoordinates):void");
            }
        }), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setText(semantics, TextController.this.getState().getTextDelegate().getText());
                final TextController textController = TextController.this;
                SemanticsPropertiesKt.getTextLayoutResult$default(semantics, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                        boolean z;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (TextController.this.getState().getLayoutResult() != null) {
                            TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                            Intrinsics.checkNotNull(layoutResult);
                            it.add(layoutResult);
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }, 1, null);
            }
        }, 1, null);
        this.selectionModifiers = companion;
    }

    @Stable
    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m2552graphicsLayer2Xn7asI$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16383, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawBehind) {
                SelectionRegistrar selectionRegistrar;
                Map<Long, Selection> subselections;
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextController textController = TextController.this;
                selectionRegistrar = textController.selectionRegistrar;
                Selection selection = null;
                if (selectionRegistrar != null && (subselections = selectionRegistrar.getSubselections()) != null) {
                    selection = subselections.get(Long.valueOf(textController.getState().getSelectableId()));
                }
                if (selection != null) {
                    int offset = (!selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset();
                    int offset2 = (!selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset();
                    if (offset != offset2) {
                        DrawScope.DefaultImpls.m2889drawPathLG529CI$default(drawBehind, layoutResult.getMultiParagraph().getPathForRange(offset, offset2), textController.getState().m1032getSelectionBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
                    }
                }
                TextDelegate.Companion.paint(drawBehind.getDrawContext().getCanvas(), layoutResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r0 < 0) goto L9;
     */
    /* renamed from: outOfBoundary-0a9Yr6o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m959outOfBoundary0a9Yr6o(long r5, long r7) {
        /*
            r4 = this;
            r0 = r4
            androidx.compose.foundation.text.TextState r0 = r0.state
            androidx.compose.ui.text.TextLayoutResult r0 = r0.getLayoutResult()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r9
            androidx.compose.ui.text.TextLayoutInput r0 = r0.getLayoutInput()
            androidx.compose.ui.text.AnnotatedString r0 = r0.getText()
            java.lang.String r0 = r0.getText()
            int r0 = r0.length()
            r11 = r0
            r0 = r9
            r1 = r5
            int r0 = r0.m4456getOffsetForPositionk4lQ0M(r1)
            r12 = r0
            r0 = r9
            r1 = r7
            int r0 = r0.m4456getOffsetForPositionk4lQ0M(r1)
            r13 = r0
            int r11 = r11 + (-1)
            r0 = r12
            r1 = r11
            if (r0 < r1) goto L44
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L56
        L44:
            r0 = r10
            r14 = r0
            r0 = r12
            if (r0 >= 0) goto L59
            r0 = r10
            r14 = r0
            r0 = r13
            if (r0 >= 0) goto L59
        L56:
            r0 = 1
            r14 = r0
        L59:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController.m959outOfBoundary0a9Yr6o(long, long):boolean");
    }

    @NotNull
    public final TextDragObserver getLongPressDragObserver() {
        TextDragObserver textDragObserver = this.longPressDragObserver;
        if (textDragObserver != null) {
            return textDragObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("longPressDragObserver");
        return null;
    }

    @NotNull
    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final Modifier getModifiers() {
        return this.coreModifiers.then(this.selectionModifiers);
    }

    @NotNull
    public final TextState getState() {
        return this.state;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        SelectionRegistrar selectionRegistrar = this.selectionRegistrar;
        if (selectionRegistrar == null) {
            return;
        }
        getState().setSelectable(selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(getState().getSelectableId(), new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final LayoutCoordinates invoke() {
                return TextController.this.getState().getLayoutCoordinates();
            }
        }, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final TextLayoutResult invoke() {
                return TextController.this.getState().getLayoutResult();
            }
        })));
    }

    public final void setLongPressDragObserver(@NotNull TextDragObserver textDragObserver) {
        Intrinsics.checkNotNullParameter(textDragObserver, "<set-?>");
        this.longPressDragObserver = textDragObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier] */
    public final void update(@Nullable final SelectionRegistrar selectionRegistrar) {
        Modifier.Companion companion;
        this.selectionRegistrar = selectionRegistrar;
        if (selectionRegistrar == null) {
            companion = Modifier.Companion;
        } else if (TouchMode_androidKt.isInTouchMode()) {
            setLongPressDragObserver(new TextDragObserver() { // from class: androidx.compose.foundation.text.TextController$update$1
                private long dragTotalDistance;
                private long lastPosition;

                {
                    Offset.Companion companion2 = Offset.Companion;
                    this.lastPosition = companion2.m2183getZeroF1C5BW0();
                    this.dragTotalDistance = companion2.m2183getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
                public void mo960onDragk4lQ0M(long j2) {
                    boolean m959outOfBoundary0a9Yr6o;
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        setDragTotalDistance(Offset.m2172plusMKHz9U(getDragTotalDistance(), j2));
                        long m2172plusMKHz9U = Offset.m2172plusMKHz9U(getLastPosition(), getDragTotalDistance());
                        m959outOfBoundary0a9Yr6o = textController.m959outOfBoundary0a9Yr6o(getLastPosition(), m2172plusMKHz9U);
                        if (m959outOfBoundary0a9Yr6o || !selectionRegistrar2.mo1092notifySelectionUpdate5iVPX68(layoutCoordinates, m2172plusMKHz9U, getLastPosition(), false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                            return;
                        }
                        setLastPosition(m2172plusMKHz9U);
                        setDragTotalDistance(Offset.Companion.m2183getZeroF1C5BW0());
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
                public void mo961onStartk4lQ0M(long j2) {
                    boolean m959outOfBoundary0a9Yr6o;
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        TextController textController = TextController.this;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        if (!layoutCoordinates.isAttached()) {
                            return;
                        }
                        m959outOfBoundary0a9Yr6o = textController.m959outOfBoundary0a9Yr6o(j2, j2);
                        if (m959outOfBoundary0a9Yr6o) {
                            selectionRegistrar2.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                        } else {
                            selectionRegistrar2.mo1093notifySelectionUpdateStartd4ec7I(layoutCoordinates, j2, SelectionAdjustment.Companion.getWord());
                        }
                        setLastPosition(j2);
                    }
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        this.dragTotalDistance = Offset.Companion.m2183getZeroF1C5BW0();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                public final void setDragTotalDistance(long j2) {
                    this.dragTotalDistance = j2;
                }

                public final void setLastPosition(long j2) {
                    this.lastPosition = j2;
                }
            });
            companion = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, getLongPressDragObserver(), new TextController$update$2(this, null));
        } else {
            ?? r0 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1
                private long lastPosition = Offset.Companion.m2183getZeroF1C5BW0();

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
                public boolean mo962onDrag3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                    Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return true;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        if (selectionRegistrar2.mo1092notifySelectionUpdate5iVPX68(layoutCoordinates, j2, getLastPosition(), false, adjustment)) {
                            setLastPosition(j2);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
                public boolean mo963onExtendk4lQ0M(long j2) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached()) {
                        if (selectionRegistrar2.mo1092notifySelectionUpdate5iVPX68(layoutCoordinates, j2, getLastPosition(), false, SelectionAdjustment.Companion.getNone())) {
                            setLastPosition(j2);
                        }
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                    }
                    return false;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
                public boolean mo964onExtendDragk4lQ0M(long j2) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return true;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        if (selectionRegistrar2.mo1092notifySelectionUpdate5iVPX68(layoutCoordinates, j2, getLastPosition(), false, SelectionAdjustment.Companion.getNone())) {
                            setLastPosition(j2);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onStart-3MmeM6k  reason: not valid java name */
                public boolean mo965onStart3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                    Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached()) {
                        selectionRegistrar2.mo1093notifySelectionUpdateStartd4ec7I(layoutCoordinates, j2, adjustment);
                        setLastPosition(j2);
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                    }
                    return false;
                }

                public final void setLastPosition(long j2) {
                    this.lastPosition = j2;
                }
            };
            companion = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r0, new TextController$update$3(r0, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        }
        this.selectionModifiers = companion;
    }
}
