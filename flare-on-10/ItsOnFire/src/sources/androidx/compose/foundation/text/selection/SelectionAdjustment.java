package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018�� \u000e2\u00020\u0001:\u0001\u000eJ?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelectionRange", "previousHandleOffset", "", "isStartHandle", "", "previousSelectionRange", "adjust-ZXO7KMw", "(Landroidx/compose/ui/text/TextLayoutResult;JIZLandroidx/compose/ui/text/TextRange;)J", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/SelectionAdjustment.class */
public interface SelectionAdjustment {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0015H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "()V", "Character", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getCharacter", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "None", "getNone", "Paragraph", "getParagraph", "Word", "getWord", "adjustByBoundary", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelection", "boundaryFun", "Lkotlin/Function1;", "", "adjustByBoundary--Dv-ylE", "(Landroidx/compose/ui/text/TextLayoutResult;JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/SelectionAdjustment$Companion.class */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo1057adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return j2;
            }
        };
        @NotNull
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo1057adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                int lastIndex;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                long j3 = j2;
                if (TextRange.m4469getCollapsedimpl(j2)) {
                    boolean m4474getReversedimpl = textRange == null ? false : TextRange.m4474getReversedimpl(textRange.m4479unboximpl());
                    int m4475getStartimpl = TextRange.m4475getStartimpl(j2);
                    lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
                    j3 = SelectionAdjustmentKt.ensureAtLeastOneChar(m4475getStartimpl, lastIndex, z, m4474getReversedimpl);
                }
                return j3;
            }
        };
        @NotNull
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo1057adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                long m1060adjustByBoundaryDvylE;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m1060adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m1060adjustByBoundaryDvylE(textLayoutResult, j2, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
                return m1060adjustByBoundaryDvylE;
            }
        };
        @NotNull
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo1057adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                long m1060adjustByBoundaryDvylE;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m1060adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m1060adjustByBoundaryDvylE(textLayoutResult, j2, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
                return m1060adjustByBoundaryDvylE;
            }
        };
        @NotNull
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i2) {
                long m4458getWordBoundaryjx7JFs = textLayoutResult.m4458getWordBoundaryjx7JFs(i2);
                return i2 == TextRange.m4475getStartimpl(m4458getWordBoundaryjx7JFs) || i2 == TextRange.m4470getEndimpl(m4458getWordBoundaryjx7JFs);
            }

            private final boolean isExpanding(int i2, int i3, boolean z, boolean z2) {
                boolean z3;
                if (i3 == -1) {
                    return true;
                }
                if (i2 == i3) {
                    return false;
                }
                if (z ^ z2) {
                    if (i2 < i3) {
                        z3 = true;
                    }
                    z3 = false;
                } else {
                    if (i2 > i3) {
                        z3 = true;
                    }
                    z3 = false;
                }
                return z3;
            }

            private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int i2, int i3, int i4, boolean z, boolean z2) {
                long m4458getWordBoundaryjx7JFs = textLayoutResult.m4458getWordBoundaryjx7JFs(i2);
                int m4475getStartimpl = textLayoutResult.getLineForOffset(TextRange.m4475getStartimpl(m4458getWordBoundaryjx7JFs)) == i3 ? TextRange.m4475getStartimpl(m4458getWordBoundaryjx7JFs) : textLayoutResult.getLineStart(i3);
                int m4470getEndimpl = textLayoutResult.getLineForOffset(TextRange.m4470getEndimpl(m4458getWordBoundaryjx7JFs)) == i3 ? TextRange.m4470getEndimpl(m4458getWordBoundaryjx7JFs) : TextLayoutResult.getLineEnd$default(textLayoutResult, i3, false, 2, null);
                if (m4475getStartimpl == i4) {
                    return m4470getEndimpl;
                }
                if (m4470getEndimpl == i4) {
                    return m4475getStartimpl;
                }
                int i5 = (m4475getStartimpl + m4470getEndimpl) / 2;
                if (!(z ^ z2) ? i2 >= i5 : i2 > i5) {
                    m4475getStartimpl = m4470getEndimpl;
                }
                return m4475getStartimpl;
            }

            private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
                if (i2 == i3) {
                    return i4;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i2);
                if (lineForOffset != textLayoutResult.getLineForOffset(i4) || (isExpanding(i2, i3, z, z2) && isAtWordBoundary(textLayoutResult, i4))) {
                    return snapToWordBoundary(textLayoutResult, i2, lineForOffset, i5, z, z2);
                }
                return i2;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo1057adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                int updateSelectionBoundary;
                int i3;
                int lastIndex;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (textRange == null) {
                    return SelectionAdjustment.Companion.$$INSTANCE.getWord().mo1057adjustZXO7KMw(textLayoutResult, j2, i2, z, textRange);
                }
                if (TextRange.m4469getCollapsedimpl(j2)) {
                    int m4475getStartimpl = TextRange.m4475getStartimpl(j2);
                    lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(m4475getStartimpl, lastIndex, z, TextRange.m4474getReversedimpl(textRange.m4479unboximpl()));
                }
                if (z) {
                    i3 = updateSelectionBoundary(textLayoutResult, TextRange.m4475getStartimpl(j2), i2, TextRange.m4475getStartimpl(textRange.m4479unboximpl()), TextRange.m4470getEndimpl(j2), true, TextRange.m4474getReversedimpl(j2));
                    updateSelectionBoundary = TextRange.m4470getEndimpl(j2);
                } else {
                    int m4475getStartimpl2 = TextRange.m4475getStartimpl(j2);
                    updateSelectionBoundary = updateSelectionBoundary(textLayoutResult, TextRange.m4470getEndimpl(j2), i2, TextRange.m4470getEndimpl(textRange.m4479unboximpl()), TextRange.m4475getStartimpl(j2), false, TextRange.m4474getReversedimpl(j2));
                    i3 = m4475getStartimpl2;
                }
                return TextRangeKt.TextRange(i3, updateSelectionBoundary);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: adjustByBoundary--Dv-ylE  reason: not valid java name */
        public final long m1060adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long j2, Function1<? super Integer, TextRange> function1) {
            int lastIndex;
            int coerceIn;
            int coerceIn2;
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.Companion.m4480getZerod9O1mEE();
            }
            lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
            coerceIn = RangesKt___RangesKt.coerceIn(TextRange.m4475getStartimpl(j2), 0, lastIndex);
            long m4479unboximpl = function1.invoke(Integer.valueOf(coerceIn)).m4479unboximpl();
            coerceIn2 = RangesKt___RangesKt.coerceIn(TextRange.m4470getEndimpl(j2), 0, lastIndex);
            long m4479unboximpl2 = function1.invoke(Integer.valueOf(coerceIn2)).m4479unboximpl();
            return TextRangeKt.TextRange(TextRange.m4474getReversedimpl(j2) ? TextRange.m4470getEndimpl(m4479unboximpl) : TextRange.m4475getStartimpl(m4479unboximpl), TextRange.m4474getReversedimpl(j2) ? TextRange.m4475getStartimpl(m4479unboximpl2) : TextRange.m4470getEndimpl(m4479unboximpl2));
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return None;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    long mo1057adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange);
}
