package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.ui.text.TextRange;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\b��\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\fH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\u0012\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\"\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\fH\u0016J\u0018\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\fH\u0016J\u0018\u00107\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\fH\u0016J\b\u00108\u001a\u00020\u0007H\u0016J\b\u00109\u001a\u00020\u0007H\u0002J\u0017\u0010:\u001a\u00020\u00072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0<H\u0082\bJ\b\u0010=\u001a\u00020\u0007H\u0016J\u0010\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\fH\u0016J\u001a\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010+\u001a\u00020\fH\u0016J\n\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010F\u001a\u0004\u0018\u0001022\u0006\u0010+\u001a\u00020\fH\u0016J\u0018\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0016J\u0018\u0010I\u001a\u0002022\u0006\u0010H\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0016J\u0010\u0010J\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\fH\u0016J\u0010\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\fH\u0016J\u001c\u0010Q\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010L2\b\u0010S\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010T\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u0007H\u0016J\u0010\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020ZH\u0016J\u0018\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\fH\u0016J\u001a\u0010^\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\fH\u0016J\u0018\u0010_\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\fH\u0016J\u001e\u0010`\u001a\u00020\u001e2\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n��R,\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038��@@X\u0081\u000e¢\u0006\u0014\n��\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006f"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "initState", "Landroidx/compose/ui/text/input/TextFieldValue;", "eventCallback", "Landroidx/compose/ui/text/input/InputEventCallback2;", "autoCorrect", "", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "getAutoCorrect", "()Z", "batchDepth", "", "currentExtractedTextRequestToken", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "extractedTextMonitorMode", "isActive", "value", "mTextFieldValue", "getMTextFieldValue$ui_release$annotations", "()V", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "addEditCommandWithBatch", "", "editCommand", "beginBatchEdit", "beginBatchEditInternal", "clearMetaKeyStates", "states", "closeConnection", "commitCompletion", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "Landroid/view/inputmethod/CompletionInfo;", "commitContent", "inputContentInfo", "Landroid/view/inputmethod/InputContentInfo;", "flags", "opts", "Landroid/os/Bundle;", "commitCorrection", "correctionInfo", "Landroid/view/inputmethod/CorrectionInfo;", "commitText", "", "newCursorPosition", "deleteSurroundingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "ensureActive", "block", "Lkotlin/Function0;", "finishComposingText", "getCursorCapsMode", "reqModes", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", "request", "Landroid/view/inputmethod/ExtractedTextRequest;", "getHandler", "Landroid/os/Handler;", "getSelectedText", "getTextAfterCursor", "maxChars", "getTextBeforeCursor", "logDebug", "message", "", "performContextMenuAction", "id", "performEditorAction", "editorAction", "performPrivateCommand", "action", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reportFullscreenMode", "enabled", "requestCursorUpdates", "cursorUpdateMode", "sendKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "setComposingRegion", "start", "end", "setComposingText", "setSelection", "updateInputState", "state", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/input/RecordingInputConnection.class */
public final class RecordingInputConnection implements InputConnection {
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    @NotNull
    private final List<EditCommand> editCommands;
    @NotNull
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    @NotNull
    private TextFieldValue mTextFieldValue;

    public RecordingInputConnection(@NotNull TextFieldValue initState, @NotNull InputEventCallback2 eventCallback, boolean z) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.eventCallback = eventCallback;
        this.autoCorrect = z;
        this.mTextFieldValue = initState;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        List<? extends EditCommand> mutableList;
        int i2 = this.batchDepth - 1;
        this.batchDepth = i2;
        boolean z = true;
        if (i2 == 0 && (!this.editCommands.isEmpty())) {
            InputEventCallback2 inputEventCallback2 = this.eventCallback;
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.editCommands);
            inputEventCallback2.onEditCommands(mutableList);
            this.editCommands.clear();
        }
        if (this.batchDepth <= 0) {
            z = false;
        }
        return z;
    }

    private final boolean ensureActive(Function0<Unit> function0) {
        boolean z = this.isActive;
        if (z) {
            function0.invoke();
        }
        return z;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMTextFieldValue$ui_release$annotations() {
    }

    private final void logDebug(String str) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        boolean z = this.isActive;
        boolean z2 = z;
        if (z) {
            z2 = false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z = this.isActive;
        boolean z2 = z;
        if (z) {
            z2 = false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i2, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z = this.isActive;
        boolean z2 = z;
        if (z) {
            z2 = false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? getAutoCorrect() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new DeleteSurroundingTextCommand(i2, i3));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new FinishComposingTextCommand());
            return true;
        }
        return z;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i2) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m4473getMinimpl(this.mTextFieldValue.m4616getSelectiond9O1mEE()), i2);
    }

    @NotNull
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z = true;
        if ((i2 & 1) == 0) {
            z = false;
        }
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = extractedTextRequest == null ? 0 : extractedTextRequest.token;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @NotNull
    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i2) {
        return TextRange.m4469getCollapsedimpl(this.mTextFieldValue.m4616getSelectiond9O1mEE()) ? null : TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        boolean z = this.isActive;
        boolean z2 = z;
        if (z) {
            Log.w(RecordingInputConnection_androidKt.TAG, "performContextMenuAction is not supported");
            z2 = false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        int m4563getDefaulteUduSuo;
        boolean z = this.isActive;
        if (z) {
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        m4563getDefaulteUduSuo = ImeAction.Companion.m4565getGoeUduSuo();
                        break;
                    case 3:
                        m4563getDefaulteUduSuo = ImeAction.Companion.m4569getSearcheUduSuo();
                        break;
                    case 4:
                        m4563getDefaulteUduSuo = ImeAction.Companion.m4570getSendeUduSuo();
                        break;
                    case 5:
                        m4563getDefaulteUduSuo = ImeAction.Companion.m4566getNexteUduSuo();
                        break;
                    case 6:
                        m4563getDefaulteUduSuo = ImeAction.Companion.m4564getDoneeUduSuo();
                        break;
                    case 7:
                        m4563getDefaulteUduSuo = ImeAction.Companion.m4568getPreviouseUduSuo();
                        break;
                    default:
                        Log.w(RecordingInputConnection_androidKt.TAG, Intrinsics.stringPlus("IME sends unsupported Editor Action: ", Integer.valueOf(i2)));
                        break;
                }
                getEventCallback().mo4578onImeActionKlQnJC8(m4563getDefaulteUduSuo);
                return true;
            }
            m4563getDefaulteUduSuo = ImeAction.Companion.m4563getDefaulteUduSuo();
            getEventCallback().mo4578onImeActionKlQnJC8(m4563getDefaulteUduSuo);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z = this.isActive;
        boolean z2 = z;
        if (z) {
            z2 = true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        boolean z = this.isActive;
        boolean z2 = z;
        if (z) {
            Log.w(RecordingInputConnection_androidKt.TAG, "requestCursorUpdates is not supported");
            z2 = false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = this.isActive;
        if (z) {
            getEventCallback().onKeyEvent(event);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i2, i3));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(@NotNull TextFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mTextFieldValue = value;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetSelectionCommand(i2, i3));
            return true;
        }
        return z;
    }

    public final void updateInputState(@NotNull TextFieldValue state, @NotNull InputMethodManager inputMethodManager, @NotNull View view) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.isActive) {
            setMTextFieldValue$ui_release(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(view, this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(state));
            }
            TextRange m4615getCompositionMzsxiRA = state.m4615getCompositionMzsxiRA();
            int i2 = -1;
            int m4473getMinimpl = m4615getCompositionMzsxiRA == null ? -1 : TextRange.m4473getMinimpl(m4615getCompositionMzsxiRA.m4479unboximpl());
            TextRange m4615getCompositionMzsxiRA2 = state.m4615getCompositionMzsxiRA();
            if (m4615getCompositionMzsxiRA2 != null) {
                i2 = TextRange.m4472getMaximpl(m4615getCompositionMzsxiRA2.m4479unboximpl());
            }
            inputMethodManager.updateSelection(view, TextRange.m4473getMinimpl(state.m4616getSelectiond9O1mEE()), TextRange.m4472getMaximpl(state.m4616getSelectiond9O1mEE()), m4473getMinimpl, i2);
        }
    }
}
