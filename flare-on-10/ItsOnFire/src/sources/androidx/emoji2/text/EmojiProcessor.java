package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/EmojiProcessor.class */
public final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;
    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;
    @NonNull
    private final MetadataRepo mMetadataRepo;
    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    @RequiresApi(19)
    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/EmojiProcessor$CodepointIndexFinder.class */
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        public static int findIndexBackward(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i3 != 0) {
                    i2--;
                    if (i2 < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i2);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i3--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i3--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i2;
            }
        }

        public static int findIndexForward(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i3 != 0) {
                    if (i2 >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i2);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i3--;
                        i2++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i3--;
                        i2++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i2++;
                        z = true;
                    }
                }
                return i2;
            }
        }
    }

    @AnyThread
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/EmojiProcessor$DefaultGlyphChecker.class */
    public static class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
        private static final int PAINT_TEXT_SIZE = 10;
        private static final ThreadLocal<StringBuilder> sStringBuilder = new ThreadLocal<>();
        private final TextPaint mTextPaint;

        public DefaultGlyphChecker() {
            TextPaint textPaint = new TextPaint();
            this.mTextPaint = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder getStringBuilder() {
            ThreadLocal<StringBuilder> threadLocal = sStringBuilder;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
        public boolean hasGlyph(@NonNull CharSequence charSequence, int i2, int i3, int i4) {
            StringBuilder stringBuilder = getStringBuilder();
            stringBuilder.setLength(0);
            while (i2 < i3) {
                stringBuilder.append(charSequence.charAt(i2));
                i2++;
            }
            return PaintCompat.hasGlyph(this.mTextPaint, stringBuilder.toString());
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/EmojiProcessor$ProcessorSm.class */
    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        public ProcessorSm(MetadataRepo.Node node, boolean z, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i2) {
            return i2 == 65039;
        }

        private static boolean isTextStyle(int i2) {
            return i2 == 65038;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                return Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0;
            }
            return false;
        }

        public int check(int i2) {
            MetadataRepo.Node node = this.mCurrentNode.get(i2);
            int i3 = 3;
            if (this.mState != 2) {
                if (node != null) {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                    i3 = 2;
                }
                i3 = reset();
            } else {
                if (node != null) {
                    this.mCurrentNode = node;
                    this.mCurrentDepth++;
                } else {
                    if (!isTextStyle(i2)) {
                        if (!isEmojiStyle(i2)) {
                            if (this.mCurrentNode.getData() != null && (this.mCurrentDepth != 1 || shouldUseEmojiPresentationStyleForSingleCodepoint())) {
                                this.mFlushNode = this.mCurrentNode;
                                reset();
                            }
                        }
                    }
                    i3 = reset();
                }
                i3 = 2;
            }
            this.mLastCodepoint = i2;
            return i3;
        }

        public EmojiMetadata getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        public EmojiMetadata getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        public boolean isInFlushableState() {
            boolean z;
            if (this.mState == 2 && this.mCurrentNode.getData() != null) {
                z = true;
                if (this.mCurrentDepth <= 1) {
                    if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        z = true;
                    }
                }
                return z;
            }
            z = false;
            return z;
        }
    }

    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z, @Nullable int[] iArr) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z;
        this.mEmojiAsDefaultStyleExceptions = iArr;
    }

    private void addEmoji(@NonNull Spannable spannable, EmojiMetadata emojiMetadata, int i2, int i3) {
        spannable.setSpan(this.mSpanFactory.createSpan(emojiMetadata), i2, i3, 33);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (hasInvalidSelection(selectionStart, selectionEnd) || (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) == null || emojiSpanArr.length <= 0) {
            return false;
        }
        for (EmojiSpan emojiSpan : emojiSpanArr) {
            int spanStart = editable.getSpanStart(emojiSpan);
            int spanEnd = editable.getSpanEnd(emojiSpan);
            if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                editable.delete(spanStart, spanEnd);
                return true;
            }
        }
        return false;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
        int min;
        int i4;
        if (editable == null || inputConnection == null || i2 < 0 || i3 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (hasInvalidSelection(selectionStart, selectionEnd)) {
            return false;
        }
        if (z) {
            int findIndexBackward = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i2, 0));
            int findIndexForward = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i3, 0));
            if (findIndexBackward == -1) {
                return false;
            }
            i4 = findIndexBackward;
            min = findIndexForward;
            if (findIndexForward == -1) {
                return false;
            }
        } else {
            int max = Math.max(selectionStart - i2, 0);
            min = Math.min(selectionEnd + i3, editable.length());
            i4 = max;
        }
        EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(i4, min, EmojiSpan.class);
        if (emojiSpanArr == null || emojiSpanArr.length <= 0) {
            return false;
        }
        for (EmojiSpan emojiSpan : emojiSpanArr) {
            int spanStart = editable.getSpanStart(emojiSpan);
            int spanEnd = editable.getSpanEnd(emojiSpan);
            i4 = Math.min(spanStart, i4);
            min = Math.max(spanEnd, min);
        }
        int max2 = Math.max(i4, 0);
        int min2 = Math.min(min, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(max2, min2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i2, @NonNull KeyEvent keyEvent) {
        if (i2 != 67 ? i2 != 112 ? false : delete(editable, keyEvent, true) : delete(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean hasGlyph(CharSequence charSequence, int i2, int i3, EmojiMetadata emojiMetadata) {
        if (emojiMetadata.getHasGlyph() == 0) {
            emojiMetadata.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i2, i3, emojiMetadata.getSdkAdded()));
        }
        return emojiMetadata.getHasGlyph() == 2;
    }

    private static boolean hasInvalidSelection(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public EmojiMetadata getEmojiMetadata(@NonNull CharSequence charSequence) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                if (processorSm.isInFlushableState()) {
                    return processorSm.getCurrentMetadata();
                }
                return null;
            }
            int codePointAt = Character.codePointAt(charSequence, i3);
            if (processorSm.check(codePointAt) != 2) {
                return null;
            }
            i2 = i3 + Character.charCount(codePointAt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0238, code lost:
        if (hasGlyph(r7, r17, r9, r0.getCurrentMetadata()) == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x0286, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0286, blocks: (B:7:0x001a, B:11:0x0028, B:15:0x0033, B:17:0x0048, B:22:0x0066, B:26:0x0087, B:28:0x008d, B:33:0x00a9, B:36:0x00c5, B:38:0x00d0, B:42:0x00e9, B:49:0x010b, B:50:0x0125, B:50:0x0125, B:51:0x0128, B:58:0x0160, B:69:0x0188, B:74:0x01a1, B:76:0x01ad, B:78:0x01ca, B:81:0x01dc, B:83:0x01e9, B:86:0x01fe, B:90:0x020f, B:98:0x022b, B:103:0x0244, B:105:0x0250, B:18:0x0055), top: B:126:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence process(@androidx.annotation.NonNull java.lang.CharSequence r7, @androidx.annotation.IntRange(from = 0) int r8, @androidx.annotation.IntRange(from = 0) int r9, @androidx.annotation.IntRange(from = 0) int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
