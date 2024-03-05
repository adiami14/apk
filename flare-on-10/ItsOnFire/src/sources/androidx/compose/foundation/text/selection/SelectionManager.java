package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010P\u001a\u0004\u0018\u00010\u00132\u0006\u0010Q\u001a\u00020\f2\u0006\u0010R\u001a\u00020\u0013H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u000208H��¢\u0006\u0002\bVJ\u0018\u0010W\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0002\bXJ\b\u0010Y\u001a\u00020ZH\u0002J\u000f\u0010[\u001a\u0004\u0018\u00010\\H��¢\u0006\u0002\b]J\u000e\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020*J\r\u0010a\u001a\u000208H��¢\u0006\u0002\bbJ\u0006\u0010c\u001a\u000208J\r\u0010d\u001a\u00020\fH��¢\u0006\u0002\beJ9\u0010f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u0002070h0g2\u0006\u0010j\u001a\u00020i2\b\u0010k\u001a\u0004\u0018\u000107H��¢\u0006\u0002\blJ\r\u0010m\u001a\u000208H��¢\u0006\u0002\bnJ-\u0010o\u001a\u0002082\u0006\u0010p\u001a\u00020\u00132\u0006\u0010`\u001a\u00020*2\u0006\u0010q\u001a\u00020rH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bs\u0010tJ\b\u0010u\u001a\u000208H\u0002J?\u0010v\u001a\u00020*2\u0006\u0010C\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010w\u001a\u0004\u0018\u00010\u00132\u0006\u0010`\u001a\u00020*2\u0006\u0010q\u001a\u00020rH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\bx\u0010yJ7\u0010v\u001a\u00020*2\b\u0010z\u001a\u0004\u0018\u00010\u00132\b\u0010=\u001a\u0004\u0018\u00010\u00132\u0006\u0010`\u001a\u00020*2\u0006\u0010q\u001a\u00020rH��ø\u0001��ø\u0001\u0001¢\u0006\u0002\b{J\b\u0010|\u001a\u000208H\u0002J-\u0010}\u001a\u000208*\u00020~2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020806H\u0082@ø\u0001��ø\u0001��¢\u0006\u0003\u0010\u0080\u0001J\u001d\u0010\u0081\u0001\u001a\u000202*\u0002022\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u0002080\u0083\u0001H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u0013X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0014R\u0019\u0010\u0015\u001a\u00020\u0013X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0014R8\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00138F@BX\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001d\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R(\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020806X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0019\u0010=\u001a\u0004\u0018\u00010\u0013X\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n��R(\u0010>\u001a\u0004\u0018\u0001072\b\u0010\u000b\u001a\u0004\u0018\u000107@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R8\u0010C\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00138F@BX\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bF\u0010\u001d\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001bR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bN\u0010-\"\u0004\bO\u0010/\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "dragTotalDistance", "<set-?>", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setEndHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "endHandlePosition$delegate", "Landroidx/compose/runtime/MutableState;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "onSelectionChange", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/Selection;", "", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "previousPosition", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "startHandlePosition$delegate", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchMode", "getTouchMode", "setTouchMode", "convertToContainerCoordinates", "layoutCoordinates", "offset", "convertToContainerCoordinates-Q7Q5hAU", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", "copy", "copy$foundation_release", "currentSelectionStartPosition", "currentSelectionStartPosition-_m7T9-E", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isStartHandle", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "onRelease", "requireContainerCoordinates", "requireContainerCoordinates$foundation_release", "selectAll", "Lkotlin/Pair;", "", "", "selectableId", "previousSelection", "selectAll$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "startSelection", "position", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "updateHandleOffsets", "updateSelection", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "newPosition", "updateSelection-RHHTvR4$foundation_release", "updateSelectionToolbarPosition", "detectNonConsumingTap", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClearSelectionRequested", "block", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/SelectionManager.class */
public final class SelectionManager {
    @Nullable
    private ClipboardManager clipboardManager;
    @Nullable
    private LayoutCoordinates containerLayoutCoordinates;
    private long dragBeginPosition;
    private long dragTotalDistance;
    @NotNull
    private final MutableState endHandlePosition$delegate;
    @NotNull
    private FocusRequester focusRequester;
    @Nullable
    private HapticFeedback hapticFeedBack;
    @NotNull
    private final MutableState hasFocus$delegate;
    @NotNull
    private Function1<? super Selection, Unit> onSelectionChange;
    @Nullable
    private Offset previousPosition;
    @Nullable
    private Selection selection;
    @NotNull
    private final SelectionRegistrarImpl selectionRegistrar;
    @NotNull
    private final MutableState startHandlePosition$delegate;
    @Nullable
    private TextToolbar textToolbar;
    private boolean touchMode;

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrar) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrar;
        this.touchMode = true;
        this.onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                invoke2(selection);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Selection selection) {
            }
        };
        this.focusRequester = new FocusRequester();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m2183getZeroF1C5BW0();
        this.dragTotalDistance = companion.m2183getZeroF1C5BW0();
        this.startHandlePosition$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
        this.endHandlePosition$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                Selection.AnchorInfo start;
                Selection.AnchorInfo end;
                Selection selection = SelectionManager.this.getSelection();
                if (!((selection == null || (start = selection.getStart()) == null || j2 != start.getSelectableId()) ? false : true)) {
                    Selection selection2 = SelectionManager.this.getSelection();
                    if (!((selection2 == null || (end = selection2.getEnd()) == null || j2 != end.getSelectableId()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbarPosition();
            }
        });
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                m1081invoked4ec7I(layoutCoordinates, offset.m2177unboximpl(), selectionAdjustment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final void m1081invoked4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long j2, @NotNull SelectionAdjustment selectionMode) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                Offset m1072convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m1072convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j2);
                if (m1072convertToContainerCoordinatesQ7Q5hAU != null) {
                    SelectionManager.this.m1076startSelection9KIMszo(m1072convertToContainerCoordinatesQ7Q5hAU.m2177unboximpl(), false, selectionMode);
                    SelectionManager.this.getFocusRequester().requestFocus();
                    SelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            }
        });
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, Map<Long, Selection>> selectAll$foundation_release = selectionManager.selectAll$foundation_release(j2, selectionManager.getSelection());
                Selection component1 = selectAll$foundation_release.component1();
                Map<Long, Selection> component2 = selectAll$foundation_release.component2();
                if (!Intrinsics.areEqual(component1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(component2);
                    SelectionManager.this.getOnSelectionChange().invoke(component1);
                }
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new Function5<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Boolean invoke(LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool, SelectionAdjustment selectionAdjustment) {
                return m1082invoke5iVPX68(layoutCoordinates, offset.m2177unboximpl(), offset2.m2177unboximpl(), bool.booleanValue(), selectionAdjustment);
            }

            @NotNull
            /* renamed from: invoke-5iVPX68  reason: not valid java name */
            public final Boolean m1082invoke5iVPX68(@NotNull LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z, @NotNull SelectionAdjustment selectionMode) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                return Boolean.valueOf(SelectionManager.this.m1080updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m1072convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j2), SelectionManager.this.m1072convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j3), z, selectionMode));
            }
        });
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
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
                SelectionManager.this.showSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j2))) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                Selection.AnchorInfo start;
                Selection.AnchorInfo end;
                Selection selection = SelectionManager.this.getSelection();
                if (!((selection == null || (start = selection.getStart()) == null || j2 != start.getSelectableId()) ? false : true)) {
                    Selection selection2 = SelectionManager.this.getSelection();
                    if (!((selection2 == null || (end = selection2.getEnd()) == null || j2 != end.getSelectableId()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.m1075setStartHandlePosition_kEHs6E(null);
                SelectionManager.this.m1074setEndHandlePosition_kEHs6E(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-Q7Q5hAU  reason: not valid java name */
    public final Offset m1072convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long j2) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m2156boximpl(requireContainerCoordinates$foundation_release().mo3928localPositionOfR5De75A(layoutCoordinates, j2));
    }

    /* renamed from: currentSelectionStartPosition-_m7T9-E  reason: not valid java name */
    private final Offset m1073currentSelectionStartPosition_m7T9E() {
        Offset m2156boximpl;
        Selection selection = this.selection;
        LayoutCoordinates layoutCoordinates = null;
        if (selection == null) {
            m2156boximpl = null;
        } else {
            Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
            LayoutCoordinates requireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
            if (selectable != null) {
                layoutCoordinates = selectable.getLayoutCoordinates();
            }
            Intrinsics.checkNotNull(layoutCoordinates);
            m2156boximpl = Offset.m2156boximpl(requireContainerCoordinates$foundation_release.mo3928localPositionOfR5De75A(layoutCoordinates, SelectionHandlesKt.m1067getAdjustedCoordinatesk4lQ0M(selectable.mo1047getHandlePositiondBAh8RU(selection, true))));
        }
        return m2156boximpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return forEachGesture == coroutine_suspended ? forEachGesture : Unit.INSTANCE;
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        Selection selection = this.selection;
        if (selection != null) {
            Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
            Selectable selectable2 = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
            LayoutCoordinates layoutCoordinates2 = null;
            LayoutCoordinates layoutCoordinates3 = selectable == null ? null : selectable.getLayoutCoordinates();
            if (layoutCoordinates3 != null) {
                if (selectable2 != null) {
                    layoutCoordinates2 = selectable2.getLayoutCoordinates();
                }
                if (layoutCoordinates2 != null && (layoutCoordinates = this.containerLayoutCoordinates) != null && layoutCoordinates.isAttached()) {
                    long mo3928localPositionOfR5De75A = layoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates3, selectable.mo1047getHandlePositiondBAh8RU(selection, true));
                    long mo3928localPositionOfR5De75A2 = layoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates2, selectable2.mo1047getHandlePositiondBAh8RU(selection, false));
                    long mo3929localToRootMKHz9U = layoutCoordinates.mo3929localToRootMKHz9U(mo3928localPositionOfR5De75A);
                    long mo3929localToRootMKHz9U2 = layoutCoordinates.mo3929localToRootMKHz9U(mo3928localPositionOfR5De75A2);
                    return new Rect(Math.min(Offset.m2167getXimpl(mo3929localToRootMKHz9U), Offset.m2167getXimpl(mo3929localToRootMKHz9U2)), Math.min(Offset.m2168getYimpl(layoutCoordinates.mo3929localToRootMKHz9U(layoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates3, OffsetKt.Offset(0.0f, selectable.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m2168getYimpl(layoutCoordinates.mo3929localToRootMKHz9U(layoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, selectable2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m2167getXimpl(mo3929localToRootMKHz9U), Offset.m2167getXimpl(mo3929localToRootMKHz9U2)), Math.max(Offset.m2168getYimpl(mo3929localToRootMKHz9U), Offset.m2168getYimpl(mo3929localToRootMKHz9U2)) + ((float) (SelectionHandlesKt.getHandleHeight() * 4.0d)));
                }
            }
        }
        return Rect.Companion.getZero();
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0<Unit> function0) {
        Modifier modifier2 = modifier;
        if (getHasFocus()) {
            modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new SelectionManager$onClearSelectionRequested$1(this, function0, null));
        }
        return modifier2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E  reason: not valid java name */
    public final void m1074setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E  reason: not valid java name */
    public final void m1075setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo  reason: not valid java name */
    public final void m1076startSelection9KIMszo(long j2, boolean z, SelectionAdjustment selectionAdjustment) {
        m1079updateSelection3R_tFg$foundation_release(j2, j2, null, z, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Selection selection = this.selection;
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable selectable = (selection == null || (start = selection.getStart()) == null) ? null : this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(start.getSelectableId()));
        Selectable selectable2 = (selection == null || (end = selection.getEnd()) == null) ? null : this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(end.getSelectableId()));
        LayoutCoordinates layoutCoordinates2 = selectable == null ? null : selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates3 = selectable2 == null ? null : selectable2.getLayoutCoordinates();
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            m1075setStartHandlePosition_kEHs6E(null);
            m1074setEndHandlePosition_kEHs6E(null);
            return;
        }
        long mo3928localPositionOfR5De75A = layoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates2, selectable.mo1047getHandlePositiondBAh8RU(selection, true));
        long mo3928localPositionOfR5De75A2 = layoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates3, selectable2.mo1047getHandlePositiondBAh8RU(selection, false));
        Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        m1075setStartHandlePosition_kEHs6E(SelectionManagerKt.m1086containsInclusiveUv8p0NA(visibleBounds, mo3928localPositionOfR5De75A) ? Offset.m2156boximpl(mo3928localPositionOfR5De75A) : null);
        Offset offset = null;
        if (SelectionManagerKt.m1086containsInclusiveUv8p0NA(visibleBounds, mo3928localPositionOfR5De75A2)) {
            offset = Offset.m2156boximpl(mo3928localPositionOfR5De75A2);
        }
        m1074setEndHandlePosition_kEHs6E(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar == null ? null : textToolbar.getStatus()) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = getClipboardManager()) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    @Nullable
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    @Nullable
    /* renamed from: getEndHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m1077getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        return KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.Companion, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
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
                SelectionManager.this.onRelease();
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SelectionManager.this.setContainerLayoutCoordinates(it);
            }
        }), this.focusRequester), new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FocusState focusState) {
                Intrinsics.checkNotNullParameter(focusState, "focusState");
                if (!focusState.isFocused() && SelectionManager.this.getHasFocus()) {
                    SelectionManager.this.onRelease();
                }
                SelectionManager.this.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1083invokeZmokQxo(keyEvent.m3660unboximpl());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m1083invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (SelectionManager_androidKt.m1087isCopyKeyEventZmokQxo(it)) {
                    SelectionManager.this.copy$foundation_release();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @NotNull
    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (r0 == null) goto L32;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.text.AnnotatedString getSelectedText$foundation_release() {
        /*
            r5 = this;
            r0 = r5
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r0 = r0.selectionRegistrar
            r1 = r5
            androidx.compose.ui.layout.LayoutCoordinates r1 = r1.requireContainerCoordinates$foundation_release()
            java.util.List r0 = r0.sort(r1)
            r6 = r0
            r0 = r5
            androidx.compose.foundation.text.selection.Selection r0 = r0.selection
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 != 0) goto L1d
            goto Ld5
        L1d:
            r0 = 0
            r10 = r0
            r0 = r6
            int r0 = r0.size()
            r11 = r0
        L28:
            r0 = r9
            r8 = r0
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto Ld5
            r0 = r6
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.foundation.text.selection.Selectable r0 = (androidx.compose.foundation.text.selection.Selectable) r0
            r12 = r0
            r0 = r12
            long r0 = r0.getSelectableId()
            r1 = r7
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r1 = r1.getStart()
            long r1 = r1.getSelectableId()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L74
            r0 = r12
            long r0 = r0.getSelectableId()
            r1 = r7
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r1 = r1.getEnd()
            long r1 = r1.getSelectableId()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L74
            r0 = r9
            if (r0 != 0) goto L74
            r0 = r9
            r8 = r0
        L6b:
            int r10 = r10 + 1
            r0 = r8
            r9 = r0
            goto L28
        L74:
            r0 = r12
            r1 = r7
            androidx.compose.ui.text.AnnotatedString r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.getCurrentSelectedText(r0, r1)
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L83
            goto L94
        L83:
            r0 = r9
            r1 = r8
            androidx.compose.ui.text.AnnotatedString r0 = r0.plus(r1)
            r13 = r0
            r0 = r13
            r9 = r0
            r0 = r13
            if (r0 != 0) goto L97
        L94:
            r0 = r8
            r9 = r0
        L97:
            r0 = r12
            long r0 = r0.getSelectableId()
            r1 = r7
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r1 = r1.getEnd()
            long r1 = r1.getSelectableId()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb3
            r0 = r9
            r8 = r0
            r0 = r7
            boolean r0 = r0.getHandlesCrossed()
            if (r0 == 0) goto Ld5
        Lb3:
            r0 = r9
            r8 = r0
            r0 = r12
            long r0 = r0.getSelectableId()
            r1 = r7
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r1 = r1.getStart()
            long r1 = r1.getSelectableId()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6b
            r0 = r9
            r8 = r0
            r0 = r7
            boolean r0 = r0.getHandlesCrossed()
            if (r0 == 0) goto L6b
            r0 = r9
            r8 = r0
        Ld5:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.getSelectedText$foundation_release():androidx.compose.ui.text.AnnotatedString");
    }

    @Nullable
    public final Selection getSelection() {
        return this.selection;
    }

    @Nullable
    /* renamed from: getStartHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m1078getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    @NotNull
    public final TextDragObserver handleDragObserver(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo960onDragk4lQ0M(long j2) {
                long j3;
                long j4;
                long j5;
                long j6;
                SelectionManager selectionManager = SelectionManager.this;
                j3 = selectionManager.dragTotalDistance;
                selectionManager.dragTotalDistance = Offset.m2172plusMKHz9U(j3, j2);
                j4 = SelectionManager.this.dragBeginPosition;
                j5 = SelectionManager.this.dragTotalDistance;
                long m2172plusMKHz9U = Offset.m2172plusMKHz9U(j4, j5);
                SelectionManager selectionManager2 = SelectionManager.this;
                Offset m2156boximpl = Offset.m2156boximpl(m2172plusMKHz9U);
                j6 = SelectionManager.this.dragBeginPosition;
                if (selectionManager2.m1080updateSelectionRHHTvR4$foundation_release(m2156boximpl, Offset.m2156boximpl(j6), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.dragBeginPosition = m2172plusMKHz9U;
                    SelectionManager.this.dragTotalDistance = Offset.Companion.m2183getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo961onStartk4lQ0M(long j2) {
                long mo1047getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                LayoutCoordinates layoutCoordinates = null;
                if (z) {
                    if (selectable != null) {
                        layoutCoordinates = selectable.getLayoutCoordinates();
                    }
                } else if (selectable2 != null) {
                    layoutCoordinates = selectable2.getLayoutCoordinates();
                }
                Intrinsics.checkNotNull(layoutCoordinates);
                if (z) {
                    Intrinsics.checkNotNull(selectable);
                    mo1047getHandlePositiondBAh8RU = selectable.mo1047getHandlePositiondBAh8RU(selection, true);
                } else {
                    Intrinsics.checkNotNull(selectable2);
                    mo1047getHandlePositiondBAh8RU = selectable2.mo1047getHandlePositiondBAh8RU(selection, false);
                }
                long m1067getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1067getAdjustedCoordinatesk4lQ0M(mo1047getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.dragBeginPosition = selectionManager.requireContainerCoordinates$foundation_release().mo3928localPositionOfR5De75A(layoutCoordinates, m1067getAdjustedCoordinatesk4lQ0M);
                SelectionManager.this.dragTotalDistance = Offset.Companion.m2183getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 == null ? null : textToolbar2.getStatus()) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    public final void onRelease() {
        Map<Long, Selection> emptyMap;
        SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
        emptyMap = MapsKt__MapsKt.emptyMap();
        selectionRegistrarImpl.setSubselections(emptyMap);
        hideSelectionToolbar$foundation_release();
        if (this.selection != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback == null) {
                return;
            }
            hapticFeedback.mo3045performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3055getTextHandleMove5zf0vsI());
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                return layoutCoordinates;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public final Pair<Selection, Map<Long, Selection>> selectAll$foundation_release(long j2, @Nullable Selection selection) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = sort.get(i2);
            Selection selectAllSelection = selectable.getSelectableId() == j2 ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selection2 = SelectionManagerKt.merge(selection2, selectAllSelection);
        }
        if (!Intrinsics.areEqual(selection2, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3045performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3055getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection2, linkedHashMap);
    }

    public final void setClipboardManager(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || this.selection == null) {
            return;
        }
        Offset m2156boximpl = layoutCoordinates == null ? null : Offset.m2156boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates));
        if (Intrinsics.areEqual(this.previousPosition, m2156boximpl)) {
            return;
        }
        this.previousPosition = m2156boximpl;
        updateHandleOffsets();
        updateSelectionToolbarPosition();
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setOnSelectionChange(@NotNull Function1<? super Selection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final void setSelection(@Nullable Selection selection) {
        this.selection = selection;
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTouchMode(boolean z) {
        this.touchMode = z;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (!getHasFocus() || this.selection == null || (textToolbar = getTextToolbar()) == null) {
            return;
        }
        TextToolbar.DefaultImpls.showMenu$default(textToolbar, getContentRect(), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$showSelectionToolbar$1$1
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
                SelectionManager.this.copy$foundation_release();
                SelectionManager.this.onRelease();
            }
        }, null, null, null, 28, null);
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release  reason: not valid java name */
    public final boolean m1079updateSelection3R_tFg$foundation_release(long j2, long j3, @Nullable Offset offset, boolean z, @NotNull SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = sort.get(i2);
            Pair<Selection, Boolean> mo1048updateSelectionqCDeeow = selectable.mo1048updateSelectionqCDeeow(j2, j3, offset, z, requireContainerCoordinates$foundation_release(), adjustment, this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection component1 = mo1048updateSelectionqCDeeow.component1();
            z2 = z2 || mo1048updateSelectionqCDeeow.component2().booleanValue();
            if (component1 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), component1);
            }
            selection = SelectionManagerKt.merge(selection, component1);
        }
        if (!Intrinsics.areEqual(selection, this.selection)) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3045performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3055getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection);
        }
        return z2;
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release  reason: not valid java name */
    public final boolean m1080updateSelectionRHHTvR4$foundation_release(@Nullable Offset offset, @Nullable Offset offset2, boolean z, @NotNull SelectionAdjustment adjustment) {
        Offset m1072convertToContainerCoordinatesQ7Q5hAU;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (offset == null) {
            return false;
        }
        Selection selection = this.selection;
        if (selection == null) {
            m1072convertToContainerCoordinatesQ7Q5hAU = null;
        } else {
            Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf((z ? selection.getEnd() : selection.getStart()).getSelectableId()));
            if (selectable == null) {
                m1072convertToContainerCoordinatesQ7Q5hAU = null;
            } else {
                LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                Intrinsics.checkNotNull(layoutCoordinates);
                m1072convertToContainerCoordinatesQ7Q5hAU = m1072convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m1067getAdjustedCoordinatesk4lQ0M(selectable.mo1047getHandlePositiondBAh8RU(selection, !z)));
            }
        }
        if (m1072convertToContainerCoordinatesQ7Q5hAU == null) {
            return false;
        }
        long m2177unboximpl = m1072convertToContainerCoordinatesQ7Q5hAU.m2177unboximpl();
        long m2177unboximpl2 = z ? offset.m2177unboximpl() : m2177unboximpl;
        if (!z) {
            m2177unboximpl = offset.m2177unboximpl();
        }
        return m1079updateSelection3R_tFg$foundation_release(m2177unboximpl2, m2177unboximpl, offset2, z, adjustment);
    }
}
