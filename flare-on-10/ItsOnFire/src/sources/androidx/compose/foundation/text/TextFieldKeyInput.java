package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��j\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\b��\u0018��2\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J!\u0010#\u001a\u00020$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&¢\u0006\u0002\b(H\u0002J\u001b\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020+ø\u0001��ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010*\u001a\u00020+H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101J\f\u00102\u001a\u00020$*\u000203H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "state", "Landroidx/compose/foundation/text/TextFieldState;", "selectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "", "singleLine", "preparedSelectionState", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/KeyMapping;)V", "getEditable", "()Z", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSingleLine", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "commandExecutionContext", "", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "process", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "typedCommand", "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "apply", "Landroidx/compose/ui/text/input/EditCommand;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldKeyInput.class */
public final class TextFieldKeyInput {
    private final boolean editable;
    @NotNull
    private final KeyMapping keyMapping;
    @NotNull
    private final OffsetMapping offsetMapping;
    @NotNull
    private final TextPreparedSelectionState preparedSelectionState;
    @NotNull
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    @NotNull
    private final TextFieldState state;
    @Nullable
    private final UndoManager undoManager;
    @NotNull
    private final TextFieldValue value;

    public TextFieldKeyInput(@NotNull TextFieldState state, @NotNull TextFieldSelectionManager selectionManager, @NotNull TextFieldValue value, boolean z, boolean z2, @NotNull TextPreparedSelectionState preparedSelectionState, @NotNull OffsetMapping offsetMapping, @Nullable UndoManager undoManager, @NotNull KeyMapping keyMapping) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(preparedSelectionState, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(keyMapping, "keyMapping");
        this.state = state;
        this.selectionManager = selectionManager;
        this.value = value;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = preparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyMapping = keyMapping;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, KeyMapping keyMapping, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i2 & 128) != 0 ? null : undoManager, (i2 & 256) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        List<? extends EditCommand> listOf;
        EditProcessor processor = this.state.getProcessor();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), editCommand});
        TextFieldValue apply = processor.apply(listOf);
        if (!Intrinsics.areEqual(apply.getAnnotatedString().getText(), this.state.getTextDelegate().getText().getText())) {
            this.state.setHandleState(HandleState.None);
        }
        this.state.getOnValueChange().invoke(apply);
    }

    private final void commandExecutionContext(Function1<? super TextFieldPreparedSelection, Unit> function1) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        function1.invoke(textFieldPreparedSelection);
        if (TextRange.m4468equalsimpl0(textFieldPreparedSelection.m1041getSelectiond9O1mEE(), this.value.m4616getSelectiond9O1mEE()) && Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.state.getOnValueChange().invoke(textFieldPreparedSelection.getValue());
    }

    /* renamed from: typedCommand-ZmokQxo  reason: not valid java name */
    private final CommitTextCommand m981typedCommandZmokQxo(KeyEvent keyEvent) {
        CommitTextCommand commitTextCommand;
        if (TextFieldKeyInput_androidKt.m993isTypedEventZmokQxo(keyEvent)) {
            String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), KeyEvent_androidKt.m3674getUtf16CodePointZmokQxo(keyEvent)).toString();
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().appendCo…              .toString()");
            commitTextCommand = new CommitTextCommand(sb, 1);
        } else {
            commitTextCommand = null;
        }
        return commitTextCommand;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @NotNull
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @NotNull
    public final TextFieldState getState() {
        return this.state;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo  reason: not valid java name */
    public final boolean m982processZmokQxo(@NotNull KeyEvent event) {
        final KeyCommand mo918mapZmokQxo;
        Intrinsics.checkNotNullParameter(event, "event");
        CommitTextCommand m981typedCommandZmokQxo = m981typedCommandZmokQxo(event);
        boolean z = true;
        if (m981typedCommandZmokQxo != null) {
            if (getEditable()) {
                apply(m981typedCommandZmokQxo);
                getPreparedSelectionState().resetCachedX();
            } else {
                z = false;
            }
            return z;
        } else if (KeyEventType.m3665equalsimpl0(KeyEvent_androidKt.m3673getTypeZmokQxo(event), KeyEventType.Companion.m3669getKeyDownCS__XNY()) && (mo918mapZmokQxo = this.keyMapping.mo918mapZmokQxo(event)) != null) {
            if (!mo918mapZmokQxo.getEditsText() || this.editable) {
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                commandExecutionContext(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldKeyInput$process$2$WhenMappings.class */
                    public final /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[KeyCommand.values().length];
                            iArr[KeyCommand.COPY.ordinal()] = 1;
                            iArr[KeyCommand.PASTE.ordinal()] = 2;
                            iArr[KeyCommand.CUT.ordinal()] = 3;
                            iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                            iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                            iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                            iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                            iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                            iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                            iArr[KeyCommand.UP.ordinal()] = 10;
                            iArr[KeyCommand.DOWN.ordinal()] = 11;
                            iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                            iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                            iArr[KeyCommand.LINE_START.ordinal()] = 14;
                            iArr[KeyCommand.LINE_END.ordinal()] = 15;
                            iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                            iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                            iArr[KeyCommand.HOME.ordinal()] = 18;
                            iArr[KeyCommand.END.ordinal()] = 19;
                            iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                            iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                            iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                            iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                            iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                            iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                            iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                            iArr[KeyCommand.TAB.ordinal()] = 27;
                            iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                            iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                            iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                            iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                            iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                            iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                            iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                            iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                            iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                            iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                            iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                            iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                            iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                            iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                            iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                            iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                            iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                            iArr[KeyCommand.DESELECT.ordinal()] = 45;
                            iArr[KeyCommand.UNDO.ordinal()] = 46;
                            iArr[KeyCommand.REDO.ordinal()] = 47;
                            iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                        invoke2(textFieldPreparedSelection);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldPreparedSelection commandExecutionContext) {
                        AnonymousClass8 anonymousClass8;
                        TextFieldKeyInput textFieldKeyInput;
                        CommitTextCommand commitTextCommand;
                        TextFieldPreparedSelection moveCursorLeft;
                        TextFieldPreparedSelection moveCursorUpByPage;
                        TextFieldValue textFieldValue;
                        Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
                        switch (WhenMappings.$EnumSwitchMapping$0[KeyCommand.this.ordinal()]) {
                            case 1:
                                this.getSelectionManager().copy$foundation_release(false);
                                return;
                            case 2:
                                this.getSelectionManager().paste$foundation_release();
                                return;
                            case 3:
                                this.getSelectionManager().cut$foundation_release();
                                return;
                            case 4:
                                commandExecutionContext.collapseLeftOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection collapseLeftOr) {
                                        Intrinsics.checkNotNullParameter(collapseLeftOr, "$this$collapseLeftOr");
                                        collapseLeftOr.moveCursorLeft();
                                    }
                                });
                                return;
                            case 5:
                                commandExecutionContext.collapseRightOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection collapseRightOr) {
                                        Intrinsics.checkNotNullParameter(collapseRightOr, "$this$collapseRightOr");
                                        collapseRightOr.moveCursorRight();
                                    }
                                });
                                return;
                            case 6:
                                commandExecutionContext.moveCursorLeftByWord();
                                return;
                            case 7:
                                commandExecutionContext.moveCursorRightByWord();
                                return;
                            case 8:
                                commandExecutionContext.moveCursorPrevByParagraph();
                                return;
                            case 9:
                                commandExecutionContext.moveCursorNextByParagraph();
                                return;
                            case 10:
                                commandExecutionContext.moveCursorUpByLine();
                                return;
                            case 11:
                                commandExecutionContext.moveCursorDownByLine();
                                return;
                            case 12:
                                commandExecutionContext.moveCursorUpByPage();
                                return;
                            case 13:
                                commandExecutionContext.moveCursorDownByPage();
                                return;
                            case 14:
                                commandExecutionContext.moveCursorToLineStart();
                                return;
                            case 15:
                                commandExecutionContext.moveCursorToLineEnd();
                                return;
                            case 16:
                                commandExecutionContext.moveCursorToLineLeftSide();
                                return;
                            case 17:
                                commandExecutionContext.moveCursorToLineRightSide();
                                return;
                            case 18:
                                commandExecutionContext.moveCursorToHome();
                                return;
                            case 19:
                                commandExecutionContext.moveCursorToEnd();
                                return;
                            case 20:
                                anonymousClass8 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
                                        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                        deleteIfSelectedOr.moveCursorPrev().selectMovement().deleteSelected();
                                    }
                                };
                                commandExecutionContext.deleteIfSelectedOr(anonymousClass8);
                                return;
                            case 21:
                                anonymousClass8 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
                                        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                        deleteIfSelectedOr.moveCursorNext().selectMovement().deleteSelected();
                                    }
                                };
                                commandExecutionContext.deleteIfSelectedOr(anonymousClass8);
                                return;
                            case 22:
                                anonymousClass8 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
                                        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                        deleteIfSelectedOr.moveCursorPrevByWord().selectMovement().deleteSelected();
                                    }
                                };
                                commandExecutionContext.deleteIfSelectedOr(anonymousClass8);
                                return;
                            case 23:
                                anonymousClass8 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
                                        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                        deleteIfSelectedOr.moveCursorNextByWord().selectMovement().deleteSelected();
                                    }
                                };
                                commandExecutionContext.deleteIfSelectedOr(anonymousClass8);
                                return;
                            case 24:
                                anonymousClass8 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
                                        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                        deleteIfSelectedOr.moveCursorToLineStart().selectMovement().deleteSelected();
                                    }
                                };
                                commandExecutionContext.deleteIfSelectedOr(anonymousClass8);
                                return;
                            case 25:
                                anonymousClass8 = new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                                        invoke2(textFieldPreparedSelection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
                                        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                        deleteIfSelectedOr.moveCursorToLineEnd().selectMovement().deleteSelected();
                                    }
                                };
                                commandExecutionContext.deleteIfSelectedOr(anonymousClass8);
                                return;
                            case 26:
                                if (!this.getSingleLine()) {
                                    textFieldKeyInput = this;
                                    commitTextCommand = new CommitTextCommand("\n", 1);
                                    textFieldKeyInput.apply(commitTextCommand);
                                    return;
                                }
                                booleanRef.element = false;
                                return;
                            case 27:
                                if (!this.getSingleLine()) {
                                    textFieldKeyInput = this;
                                    commitTextCommand = new CommitTextCommand("\t", 1);
                                    textFieldKeyInput.apply(commitTextCommand);
                                    return;
                                }
                                booleanRef.element = false;
                                return;
                            case 28:
                                commandExecutionContext.selectAll();
                                return;
                            case 29:
                                moveCursorLeft = commandExecutionContext.moveCursorLeft();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 30:
                                moveCursorLeft = commandExecutionContext.moveCursorRight();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 31:
                                moveCursorLeft = commandExecutionContext.moveCursorLeftByWord();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 32:
                                moveCursorLeft = commandExecutionContext.moveCursorRightByWord();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 33:
                                moveCursorLeft = commandExecutionContext.moveCursorPrevByParagraph();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 34:
                                moveCursorLeft = commandExecutionContext.moveCursorNextByParagraph();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 35:
                                moveCursorLeft = commandExecutionContext.moveCursorToLineStart();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 36:
                                moveCursorLeft = commandExecutionContext.moveCursorToLineEnd();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 37:
                                moveCursorLeft = commandExecutionContext.moveCursorToLineLeftSide();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 38:
                                moveCursorLeft = commandExecutionContext.moveCursorToLineRightSide();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 39:
                                moveCursorLeft = commandExecutionContext.moveCursorUpByLine();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 40:
                                moveCursorLeft = commandExecutionContext.moveCursorDownByLine();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 41:
                                moveCursorUpByPage = commandExecutionContext.moveCursorUpByPage();
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 42:
                                moveCursorUpByPage = commandExecutionContext.moveCursorDownByPage();
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 43:
                                moveCursorLeft = commandExecutionContext.moveCursorToHome();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 44:
                                moveCursorLeft = commandExecutionContext.moveCursorToEnd();
                                moveCursorUpByPage = moveCursorLeft;
                                moveCursorUpByPage.selectMovement();
                                return;
                            case 45:
                                commandExecutionContext.deselect();
                                return;
                            case 46:
                                UndoManager undoManager = this.getUndoManager();
                                if (undoManager != null) {
                                    undoManager.makeSnapshot(commandExecutionContext.getValue());
                                }
                                UndoManager undoManager2 = this.getUndoManager();
                                if (undoManager2 == null) {
                                    return;
                                }
                                TextFieldValue undo = undoManager2.undo();
                                textFieldValue = undo;
                                if (undo == null) {
                                    return;
                                }
                                this.getState().getOnValueChange().invoke(textFieldValue);
                                return;
                            case 47:
                                UndoManager undoManager3 = this.getUndoManager();
                                if (undoManager3 == null) {
                                    return;
                                }
                                TextFieldValue redo = undoManager3.redo();
                                textFieldValue = redo;
                                if (redo == null) {
                                    return;
                                }
                                this.getState().getOnValueChange().invoke(textFieldValue);
                                return;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                KeyEventHelpers_androidKt.showCharacterPalette();
                                return;
                            default:
                                return;
                        }
                    }
                });
                UndoManager undoManager = this.undoManager;
                if (undoManager != null) {
                    undoManager.forceNextSnapshot();
                }
                return booleanRef.element;
            }
            return false;
        } else {
            return false;
        }
    }
}
