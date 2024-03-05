package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\b��\u0018��2\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010X\u001a\u0002052\b\b\u0002\u0010Y\u001a\u00020\u0013H��¢\u0006\u0002\bZJ%\u0010[\u001a\u0002022\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020GH��¢\u0006\u0002\bcJ\r\u0010d\u001a\u000205H��¢\u0006\u0002\beJ\u001f\u0010f\u001a\u0002052\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u000fH��ø\u0001��ø\u0001\u0001¢\u0006\u0002\bhJ\r\u0010i\u001a\u000205H��¢\u0006\u0002\bjJ\r\u0010k\u001a\u000205H��¢\u0006\u0002\blJ\b\u0010m\u001a\u00020nH\u0002J \u0010o\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u0013H��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bq\u0010rJ\u0015\u0010s\u001a\u00020G2\u0006\u0010p\u001a\u00020\u0013H��¢\u0006\u0002\btJ\r\u0010u\u001a\u000205H��¢\u0006\u0002\bvJ\r\u0010w\u001a\u00020\u0013H��¢\u0006\u0002\bxJ\r\u0010y\u001a\u000205H��¢\u0006\u0002\bzJ\r\u0010{\u001a\u000205H��¢\u0006\u0002\b|J\u0010\u0010}\u001a\u0002052\u0006\u0010~\u001a\u00020\u007fH\u0002J\u000f\u0010\u0080\u0001\u001a\u000205H��¢\u0006\u0003\b\u0081\u0001J5\u0010\u0082\u0001\u001a\u0002052\u0006\u0010L\u001a\u0002022\u0007\u0010\u0083\u0001\u001a\u00020\f2\u0007\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010p\u001a\u00020\u00132\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0019\u0010\u000e\u001a\u00020\u000fX\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u000fX\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n��R&\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020504X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020GX\u0080\u0004¢\u0006\b\n��\u001a\u0004\bH\u0010IR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\bJ\u0010KR+\u0010L\u001a\u0002022\u0006\u0010\u0012\u001a\u0002028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u001a\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020SX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "dragTotalDistance", "<set-?>", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "Landroidx/compose/runtime/MutableState;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "copy", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "position", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateSelection", "transformedStartOffset", "transformedEndOffset", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/TextFieldSelectionManager.class */
public final class TextFieldSelectionManager {
    @Nullable
    private ClipboardManager clipboardManager;
    @Nullable
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    @NotNull
    private final MutableState editable$delegate;
    @Nullable
    private FocusRequester focusRequester;
    @Nullable
    private HapticFeedback hapticFeedBack;
    @NotNull
    private final MouseSelectionObserver mouseSelectionObserver;
    @NotNull
    private OffsetMapping offsetMapping;
    @NotNull
    private TextFieldValue oldValue;
    @NotNull
    private Function1<? super TextFieldValue, Unit> onValueChange;
    @Nullable
    private TextFieldState state;
    @Nullable
    private TextToolbar textToolbar;
    @NotNull
    private final TextDragObserver touchSelectionObserver;
    @Nullable
    private final UndoManager undoManager;
    @NotNull
    private final MutableState value$delegate;
    @NotNull
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public TextFieldSelectionManager(@Nullable UndoManager undoManager) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.undoManager = undoManager;
        this.offsetMapping = OffsetMapping.Companion.getIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TextFieldValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }
        };
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.visualTransformation = VisualTransformation.Companion.getNone();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.editable$delegate = mutableStateOf$default2;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m2183getZeroF1C5BW0();
        this.dragTotalDistance = companion.m2183getZeroF1C5BW0();
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo960onDragk4lQ0M(long j2) {
                long j3;
                TextLayoutResultProxy layoutResult;
                Integer num;
                int intValue;
                long j4;
                long j5;
                long j6;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2172plusMKHz9U(j3, j2);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num == null) {
                        j6 = textFieldSelectionManager2.dragBeginPosition;
                        intValue = layoutResult.m1026getOffsetForPosition3MmeM6k(j6, false);
                    } else {
                        intValue = num.intValue();
                    }
                    j4 = textFieldSelectionManager2.dragBeginPosition;
                    j5 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), intValue, layoutResult.m1026getOffsetForPosition3MmeM6k(Offset.m2172plusMKHz9U(j4, j5), false), false, SelectionAdjustment.Companion.getWord());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 == null) {
                    return;
                }
                state$foundation_release2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo961onStartk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult3;
                TextFieldValue m1101createTextFieldValueFDrldGo;
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 == null || state$foundation_release2.getDraggingHandle() == null) {
                    TextFieldState state$foundation_release3 = TextFieldSelectionManager.this.getState$foundation_release();
                    if (!((state$foundation_release3 == null || (layoutResult = state$foundation_release3.getLayoutResult()) == null || !layoutResult.m1027isPositionOnTextk4lQ0M(j2)) ? false : true) && (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) != null && (layoutResult3 = state$foundation_release.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                        int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult3, layoutResult3.getLineForVerticalPosition(Offset.m2168getYimpl(j2)), false, 2, null));
                        HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.mo3045performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3055getTextHandleMove5zf0vsI());
                        }
                        m1101createTextFieldValueFDrldGo = textFieldSelectionManager.m1101createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                        textFieldSelectionManager.enterSelectionMode$foundation_release();
                        textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m1101createTextFieldValueFDrldGo);
                        return;
                    }
                    if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                        return;
                    }
                    TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                    TextFieldState state$foundation_release4 = TextFieldSelectionManager.this.getState$foundation_release();
                    if (state$foundation_release4 != null && (layoutResult2 = state$foundation_release4.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        int m1024getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m1024getOffsetForPosition3MmeM6k$default(layoutResult2, j2, false, 2, null);
                        textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), m1024getOffsetForPosition3MmeM6k$default, m1024getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
                        textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(m1024getOffsetForPosition3MmeM6k$default);
                    }
                    TextFieldSelectionManager.this.dragBeginPosition = j2;
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2183getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if ((textToolbar == null ? null : textToolbar.getStatus()) == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo962onDrag3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                Integer num;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                if ((TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                int m1026getOffsetForPosition3MmeM6k = layoutResult.m1026getOffsetForPosition3MmeM6k(j2, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                num = textFieldSelectionManager.dragBeginOffsetInText;
                Intrinsics.checkNotNull(num);
                textFieldSelectionManager.updateSelection(value$foundation_release, num.intValue(), m1026getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo963onExtendk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4475getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4616getSelectiond9O1mEE())), TextLayoutResultProxy.m1024getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null), false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo964onExtendDragk4lQ0M(long j2) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                if ((TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4475getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4616getSelectiond9O1mEE())), layoutResult.m1026getOffsetForPosition3MmeM6k(j2, false), false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo965onStart3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                long j3;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = j2;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m1024getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null));
                j3 = textFieldSelectionManager.dragBeginPosition;
                int m1024getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m1024getOffsetForPosition3MmeM6k$default(layoutResult, j3, false, 2, null);
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), m1024getOffsetForPosition3MmeM6k$default, m1024getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : undoManager);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo  reason: not valid java name */
    public final TextFieldValue m1101createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j2) {
        return new TextFieldValue(annotatedString, j2, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default  reason: not valid java name */
    public static /* synthetic */ void m1102deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1103deselect_kEHs6E$foundation_release(offset);
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        Offset m2156boximpl;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value;
        int coerceIn;
        float top;
        float m2168getYimpl;
        LayoutCoordinates layoutCoordinates3;
        TextLayoutResult value2;
        int coerceIn2;
        float top2;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return Rect.Companion.getZero();
        }
        TextFieldState state$foundation_release = getState$foundation_release();
        Offset m2156boximpl2 = (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null) ? null : Offset.m2156boximpl(layoutCoordinates.mo3929localToRootMKHz9U(m1104getHandlePositiontuRUvjQ$foundation_release(true)));
        long m2183getZeroF1C5BW0 = m2156boximpl2 == null ? Offset.Companion.m2183getZeroF1C5BW0() : m2156boximpl2.m2177unboximpl();
        TextFieldState state$foundation_release2 = getState$foundation_release();
        if (state$foundation_release2 == null) {
            m2156boximpl = null;
        } else {
            LayoutCoordinates layoutCoordinates4 = state$foundation_release2.getLayoutCoordinates();
            m2156boximpl = layoutCoordinates4 == null ? null : Offset.m2156boximpl(layoutCoordinates4.mo3929localToRootMKHz9U(m1104getHandlePositiontuRUvjQ$foundation_release(false)));
        }
        long m2183getZeroF1C5BW02 = m2156boximpl == null ? Offset.Companion.m2183getZeroF1C5BW0() : m2156boximpl.m2177unboximpl();
        TextFieldState state$foundation_release3 = getState$foundation_release();
        float f2 = 0.0f;
        if (state$foundation_release3 == null || (layoutCoordinates2 = state$foundation_release3.getLayoutCoordinates()) == null) {
            m2168getYimpl = 0.0f;
        } else {
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult != null && (value = layoutResult.getValue()) != null) {
                coerceIn = RangesKt___RangesKt.coerceIn(TextRange.m4475getStartimpl(getValue$foundation_release().m4616getSelectiond9O1mEE()), 0, Math.max(0, getValue$foundation_release().getText().length() - 1));
                Rect cursorRect = value.getCursorRect(coerceIn);
                if (cursorRect != null) {
                    top = cursorRect.getTop();
                    m2168getYimpl = Offset.m2168getYimpl(layoutCoordinates2.mo3929localToRootMKHz9U(OffsetKt.Offset(0.0f, top)));
                }
            }
            top = 0.0f;
            m2168getYimpl = Offset.m2168getYimpl(layoutCoordinates2.mo3929localToRootMKHz9U(OffsetKt.Offset(0.0f, top)));
        }
        TextFieldState state$foundation_release4 = getState$foundation_release();
        if (state$foundation_release4 != null && (layoutCoordinates3 = state$foundation_release4.getLayoutCoordinates()) != null) {
            TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
            if (layoutResult2 != null && (value2 = layoutResult2.getValue()) != null) {
                coerceIn2 = RangesKt___RangesKt.coerceIn(TextRange.m4470getEndimpl(getValue$foundation_release().m4616getSelectiond9O1mEE()), 0, Math.max(0, getValue$foundation_release().getText().length() - 1));
                Rect cursorRect2 = value2.getCursorRect(coerceIn2);
                if (cursorRect2 != null) {
                    top2 = cursorRect2.getTop();
                    f2 = Offset.m2168getYimpl(layoutCoordinates3.mo3929localToRootMKHz9U(OffsetKt.Offset(0.0f, top2)));
                }
            }
            top2 = 0.0f;
            f2 = Offset.m2168getYimpl(layoutCoordinates3.mo3929localToRootMKHz9U(OffsetKt.Offset(0.0f, top2)));
        }
        return new Rect(Math.min(Offset.m2167getXimpl(m2183getZeroF1C5BW0), Offset.m2167getXimpl(m2183getZeroF1C5BW02)), Math.min(m2168getYimpl, f2), Math.max(Offset.m2167getXimpl(m2183getZeroF1C5BW0), Offset.m2167getXimpl(m2183getZeroF1C5BW02)), Math.max(Offset.m2168getYimpl(m2183getZeroF1C5BW0), Offset.m2168getYimpl(m2183getZeroF1C5BW02)) + (Dp.m4785constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setHandleState(handleState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue textFieldValue, int i2, int i3, boolean z, SelectionAdjustment selectionAdjustment) {
        TextLayoutResultProxy layoutResult;
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m4475getStartimpl(textFieldValue.m4616getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m4470getEndimpl(textFieldValue.m4616getSelectiond9O1mEE())));
        TextFieldState textFieldState = this.state;
        TextRange textRange = null;
        TextLayoutResult value = (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue();
        if (!TextRange.m4469getCollapsedimpl(TextRange)) {
            textRange = TextRange.m4463boximpl(TextRange);
        }
        long m1099getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m1099getTextFieldSelectionbb3KNj8(value, i2, i3, textRange, z, selectionAdjustment);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m4475getStartimpl(m1099getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m4470getEndimpl(m1099getTextFieldSelectionbb3KNj8)));
        if (TextRange.m4468equalsimpl0(TextRange2, textFieldValue.m4616getSelectiond9O1mEE())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo3045performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3055getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1101createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    public final void copy$foundation_release(boolean z) {
        if (TextRange.m4469getCollapsedimpl(getValue$foundation_release().m4616getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (z) {
            int m4472getMaximpl = TextRange.m4472getMaximpl(getValue$foundation_release().m4616getSelectiond9O1mEE());
            this.onValueChange.invoke(m1101createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m4472getMaximpl, m4472getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    @NotNull
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo960onDragk4lQ0M(long j2) {
                long j3;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j4;
                long j5;
                TextFieldValue m1101createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2172plusMKHz9U(j3, j2);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j4 = textFieldSelectionManager2.dragBeginPosition;
                j5 = textFieldSelectionManager2.dragTotalDistance;
                int m4456getOffsetForPositionk4lQ0M = value.m4456getOffsetForPositionk4lQ0M(Offset.m2172plusMKHz9U(j4, j5));
                long TextRange = TextRangeKt.TextRange(m4456getOffsetForPositionk4lQ0M, m4456getOffsetForPositionk4lQ0M);
                if (TextRange.m4468equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m4616getSelectiond9O1mEE())) {
                    return;
                }
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.mo3045performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3055getTextHandleMove5zf0vsI());
                }
                Function1<TextFieldValue, Unit> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                m1101createTextFieldValueFDrldGo = textFieldSelectionManager2.m1101createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                onValueChange$foundation_release.invoke(m1101createTextFieldValueFDrldGo);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo961onStartk4lQ0M(long j2) {
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1067getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1104getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2183getZeroF1C5BW0();
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null) {
                    return;
                }
                state$foundation_release.setDraggingHandle(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null) {
                    return;
                }
                state$foundation_release.setDraggingHandle(null);
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m4469getCollapsedimpl(getValue$foundation_release().m4616getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m4473getMinimpl = TextRange.m4473getMinimpl(getValue$foundation_release().m4616getSelectiond9O1mEE());
        this.onValueChange.invoke(m1101createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m4473getMinimpl, m4473getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager == null) {
            return;
        }
        undoManager.forceNextSnapshot();
    }

    /* renamed from: deselect-_kEHs6E$foundation_release  reason: not valid java name */
    public final void m1103deselect_kEHs6E$foundation_release(@Nullable Offset offset) {
        HandleState handleState;
        if (!TextRange.m4469getCollapsedimpl(getValue$foundation_release().m4616getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState == null ? null : textFieldState.getLayoutResult();
            this.onValueChange.invoke(TextFieldValue.m4611copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((offset == null || layoutResult == null) ? TextRange.m4472getMaximpl(getValue$foundation_release().m4616getSelectiond9O1mEE()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1024getOffsetForPosition3MmeM6k$default(layoutResult, offset.m2177unboximpl(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        if (offset != null) {
            if (getValue$foundation_release().getText().length() > 0) {
                handleState = HandleState.Cursor;
                setHandleState(handleState);
                hideSelectionToolbar$foundation_release();
            }
        }
        handleState = HandleState.None;
        setHandleState(handleState);
        hideSelectionToolbar$foundation_release();
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z = true;
        }
        if (z && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    @Nullable
    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    @Nullable
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m1104getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        long m4616getSelectiond9O1mEE = getValue$foundation_release().m4616getSelectiond9O1mEE();
        int m4475getStartimpl = z ? TextRange.m4475getStartimpl(m4616getSelectiond9O1mEE) : TextRange.m4470getEndimpl(m4616getSelectiond9O1mEE);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState == null ? null : textFieldState.getLayoutResult();
        Intrinsics.checkNotNull(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(m4475getStartimpl), z, TextRange.m4474getReversedimpl(getValue$foundation_release().m4616getSelectiond9O1mEE()));
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @NotNull
    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    @Nullable
    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @NotNull
    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @NotNull
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    @NotNull
    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    @NotNull
    public final TextDragObserver handleDragObserver$foundation_release(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo960onDragk4lQ0M(long j2) {
                long j3;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                int originalToTransformed;
                long j4;
                long j5;
                int m4456getOffsetForPositionk4lQ0M;
                long j6;
                long j7;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2172plusMKHz9U(j3, j2);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    boolean z2 = z;
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    if (z2) {
                        j6 = textFieldSelectionManager2.dragBeginPosition;
                        j7 = textFieldSelectionManager2.dragTotalDistance;
                        originalToTransformed = value.m4456getOffsetForPositionk4lQ0M(Offset.m2172plusMKHz9U(j6, j7));
                    } else {
                        originalToTransformed = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4475getStartimpl(textFieldSelectionManager2.getValue$foundation_release().m4616getSelectiond9O1mEE()));
                    }
                    if (z2) {
                        m4456getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4470getEndimpl(textFieldSelectionManager2.getValue$foundation_release().m4616getSelectiond9O1mEE()));
                    } else {
                        j4 = textFieldSelectionManager2.dragBeginPosition;
                        j5 = textFieldSelectionManager2.dragTotalDistance;
                        m4456getOffsetForPositionk4lQ0M = value.m4456getOffsetForPositionk4lQ0M(Offset.m2172plusMKHz9U(j4, j5));
                    }
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), originalToTransformed, m4456getOffsetForPositionk4lQ0M, z2, SelectionAdjustment.Companion.getCharacter());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 == null) {
                    return;
                }
                state$foundation_release2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo961onStartk4lQ0M(long j2) {
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1067getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1104getHandlePositiontuRUvjQ$foundation_release(z));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2183getZeroF1C5BW0();
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 == null) {
                    return;
                }
                state$foundation_release2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                TextToolbarStatus textToolbarStatus = null;
                if (state$foundation_release != null) {
                    state$foundation_release.setDraggingHandle(null);
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if (textToolbar != null) {
                    textToolbarStatus = textToolbar.getStatus();
                }
                if (textToolbarStatus == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 == null ? null : textToolbar2.getStatus()) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        ClipboardManager clipboardManager = this.clipboardManager;
        AnnotatedString text = clipboardManager == null ? null : clipboardManager.getText();
        if (text == null) {
            return;
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m4473getMinimpl = TextRange.m4473getMinimpl(getValue$foundation_release().m4616getSelectiond9O1mEE()) + text.length();
        this.onValueChange.invoke(m1101createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m4473getMinimpl, m4473getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager == null) {
            return;
        }
        undoManager.forceNextSnapshot();
    }

    public final void selectAll$foundation_release() {
        setHandleState(HandleState.None);
        TextFieldValue m1101createTextFieldValueFDrldGo = m1101createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m1101createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m4611copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1101createTextFieldValueFDrldGo.m4616getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        hideSelectionToolbar$foundation_release();
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(true);
        }
        showSelectionToolbar$foundation_release();
    }

    public final void setClipboardManager$foundation_release(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(@Nullable FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@NotNull OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@NotNull Function1<? super TextFieldValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(@Nullable TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(@NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.value$delegate.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(@NotNull VisualTransformation visualTransformation) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showSelectionToolbar$foundation_release() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar$foundation_release():void");
    }
}
