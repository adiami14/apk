package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\t\b��\u0018��2\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators.class */
public final class AccessibilityIterators {

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n��\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\b'\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "()V", "segment", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getRange", "start", "", "end", "initialize", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator.class */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        @NotNull
        private final int[] segment = new int[2];
        public String text;

        @Nullable
        public final int[] getRange(int i2, int i3) {
            if (i2 < 0 || i3 < 0 || i2 == i3) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i2;
            iArr[1] = i3;
            return iArr;
        }

        @NotNull
        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            return null;
        }

        public void initialize(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            setText(text);
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", "initialize", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "onLocaleChanged", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator.class */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        @Nullable
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n��¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final CharacterTextSegmentIterator getInstance(@NotNull Locale locale) {
                Intrinsics.checkNotNullParameter(locale, "locale");
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                if (characterTextSegmentIterator != null) {
                    return characterTextSegmentIterator;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            }
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
            Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(locale)");
            this.impl = characterInstance;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int i2) {
            int following;
            int length = getText().length();
            if (length > 0 && i2 < length) {
                int i3 = i2;
                if (i2 < 0) {
                    i3 = 0;
                }
                do {
                    BreakIterator breakIterator = this.impl;
                    BreakIterator breakIterator2 = breakIterator;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    if (breakIterator2.isBoundary(i3)) {
                        BreakIterator breakIterator3 = this.impl;
                        BreakIterator breakIterator4 = breakIterator3;
                        if (breakIterator3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("impl");
                            breakIterator4 = null;
                        }
                        int following2 = breakIterator4.following(i3);
                        if (following2 == -1) {
                            return null;
                        }
                        return getRange(i3, following2);
                    }
                    BreakIterator breakIterator5 = this.impl;
                    BreakIterator breakIterator6 = breakIterator5;
                    if (breakIterator5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator6 = null;
                    }
                    following = breakIterator6.following(i3);
                    i3 = following;
                } while (following != -1);
                return null;
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            super.initialize(text);
            BreakIterator breakIterator = this.impl;
            BreakIterator breakIterator2 = breakIterator;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            breakIterator2.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int i2) {
            int preceding;
            int length = getText().length();
            if (length > 0 && i2 > 0) {
                int i3 = i2;
                if (i2 > length) {
                    i3 = length;
                }
                do {
                    BreakIterator breakIterator = this.impl;
                    BreakIterator breakIterator2 = breakIterator;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    if (breakIterator2.isBoundary(i3)) {
                        BreakIterator breakIterator3 = this.impl;
                        BreakIterator breakIterator4 = breakIterator3;
                        if (breakIterator3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("impl");
                            breakIterator4 = null;
                        }
                        int preceding2 = breakIterator4.preceding(i3);
                        if (preceding2 == -1) {
                            return null;
                        }
                        return getRange(preceding2, i3);
                    }
                    BreakIterator breakIterator5 = this.impl;
                    BreakIterator breakIterator6 = breakIterator5;
                    if (breakIterator5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator6 = null;
                    }
                    preceding = breakIterator6.preceding(i3);
                    i3 = preceding;
                } while (preceding != -1);
                return null;
            }
            return null;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018�� \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n��¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "initialize", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator.class */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        @Nullable
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        @NotNull
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        @NotNull
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                if (lineTextSegmentIterator != null) {
                    return lineTextSegmentIterator;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            }
        }

        private LineTextSegmentIterator() {
        }

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getLineEdgeIndex(int i2, ResolvedTextDirection resolvedTextDirection) {
            int lineEnd$default;
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = textLayoutResult;
            if (textLayoutResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult2 = null;
            }
            int lineStart = textLayoutResult2.getLineStart(i2);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            TextLayoutResult textLayoutResult4 = textLayoutResult3;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult4 = null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult4.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult5 = null;
                }
                lineEnd$default = textLayoutResult5.getLineStart(i2);
            } else {
                TextLayoutResult textLayoutResult6 = textLayoutResult5;
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult6 = null;
                }
                lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult6, i2, false, 2, null) - 1;
            }
            return lineEnd$default;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int i2) {
            int i3;
            if (getText().length() > 0 && i2 < getText().length()) {
                if (i2 < 0) {
                    TextLayoutResult textLayoutResult = this.layoutResult;
                    TextLayoutResult textLayoutResult2 = textLayoutResult;
                    if (textLayoutResult == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult2 = null;
                    }
                    i3 = textLayoutResult2.getLineForOffset(0);
                } else {
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    TextLayoutResult textLayoutResult4 = textLayoutResult3;
                    if (textLayoutResult3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult4 = null;
                    }
                    int lineForOffset = textLayoutResult4.getLineForOffset(i2);
                    i3 = getLineEdgeIndex(lineForOffset, DirectionStart) == i2 ? lineForOffset : lineForOffset + 1;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                TextLayoutResult textLayoutResult6 = textLayoutResult5;
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult6 = null;
                }
                if (i3 >= textLayoutResult6.getLineCount()) {
                    return null;
                }
                return getRange(getLineEdgeIndex(i3, DirectionStart), getLineEdgeIndex(i3, DirectionEnd) + 1);
            }
            return null;
        }

        public final void initialize(@NotNull String text, @NotNull TextLayoutResult layoutResult) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
            setText(text);
            this.layoutResult = layoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int i2) {
            int i3;
            if (getText().length() > 0 && i2 > 0) {
                if (i2 > getText().length()) {
                    TextLayoutResult textLayoutResult = this.layoutResult;
                    TextLayoutResult textLayoutResult2 = textLayoutResult;
                    if (textLayoutResult == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult2 = null;
                    }
                    i3 = textLayoutResult2.getLineForOffset(getText().length());
                } else {
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    TextLayoutResult textLayoutResult4 = textLayoutResult3;
                    if (textLayoutResult3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult4 = null;
                    }
                    int lineForOffset = textLayoutResult4.getLineForOffset(i2);
                    i3 = getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i2 ? lineForOffset : lineForOffset - 1;
                }
                if (i3 < 0) {
                    return null;
                }
                return getRange(getLineEdgeIndex(i3, DirectionStart), getLineEdgeIndex(i3, DirectionEnd) + 1);
            }
            return null;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018�� \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "tempRect", "Landroid/graphics/Rect;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "initialize", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator.class */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        @Nullable
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        @NotNull
        private Rect tempRect;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        @NotNull
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        @NotNull
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                if (pageTextSegmentIterator != null) {
                    return pageTextSegmentIterator;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getLineEdgeIndex(int i2, ResolvedTextDirection resolvedTextDirection) {
            int lineEnd$default;
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = textLayoutResult;
            if (textLayoutResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult2 = null;
            }
            int lineStart = textLayoutResult2.getLineStart(i2);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            TextLayoutResult textLayoutResult4 = textLayoutResult3;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult4 = null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult4.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult5 = null;
                }
                lineEnd$default = textLayoutResult5.getLineStart(i2);
            } else {
                TextLayoutResult textLayoutResult6 = textLayoutResult5;
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult6 = null;
                }
                lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult6, i2, false, 2, null) - 1;
            }
            return lineEnd$default;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int i2) {
            int roundToInt;
            int coerceAtLeast;
            int lineCount;
            if (getText().length() > 0 && i2 < getText().length()) {
                try {
                    SemanticsNode semanticsNode = this.node;
                    SemanticsNode semanticsNode2 = semanticsNode;
                    if (semanticsNode == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("node");
                        semanticsNode2 = null;
                    }
                    roundToInt = MathKt__MathJVMKt.roundToInt(semanticsNode2.getBoundsInRoot().getHeight());
                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0, i2);
                    TextLayoutResult textLayoutResult = this.layoutResult;
                    TextLayoutResult textLayoutResult2 = textLayoutResult;
                    if (textLayoutResult == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(coerceAtLeast);
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    TextLayoutResult textLayoutResult4 = textLayoutResult3;
                    if (textLayoutResult3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult4 = null;
                    }
                    float lineTop = textLayoutResult4.getLineTop(lineForOffset) + roundToInt;
                    TextLayoutResult textLayoutResult5 = this.layoutResult;
                    TextLayoutResult textLayoutResult6 = textLayoutResult5;
                    if (textLayoutResult5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult6 = null;
                    }
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    TextLayoutResult textLayoutResult8 = textLayoutResult7;
                    if (textLayoutResult7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult8 = null;
                    }
                    if (lineTop < textLayoutResult6.getLineTop(textLayoutResult8.getLineCount() - 1)) {
                        TextLayoutResult textLayoutResult9 = this.layoutResult;
                        if (textLayoutResult9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                            textLayoutResult9 = null;
                        }
                        lineCount = textLayoutResult9.getLineForVerticalPosition(lineTop);
                    } else {
                        TextLayoutResult textLayoutResult10 = this.layoutResult;
                        if (textLayoutResult10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                            textLayoutResult10 = null;
                        }
                        lineCount = textLayoutResult10.getLineCount();
                    }
                    return getRange(coerceAtLeast, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
                } catch (IllegalStateException e2) {
                    return null;
                }
            }
            return null;
        }

        public final void initialize(@NotNull String text, @NotNull TextLayoutResult layoutResult, @NotNull SemanticsNode node) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
            Intrinsics.checkNotNullParameter(node, "node");
            setText(text);
            this.layoutResult = layoutResult;
            this.node = node;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int i2) {
            int roundToInt;
            int coerceAtMost;
            int i3;
            if (getText().length() > 0 && i2 > 0) {
                try {
                    SemanticsNode semanticsNode = this.node;
                    SemanticsNode semanticsNode2 = semanticsNode;
                    if (semanticsNode == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("node");
                        semanticsNode2 = null;
                    }
                    roundToInt = MathKt__MathJVMKt.roundToInt(semanticsNode2.getBoundsInRoot().getHeight());
                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(getText().length(), i2);
                    TextLayoutResult textLayoutResult = this.layoutResult;
                    TextLayoutResult textLayoutResult2 = textLayoutResult;
                    if (textLayoutResult == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(coerceAtMost);
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    TextLayoutResult textLayoutResult4 = textLayoutResult3;
                    if (textLayoutResult3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        textLayoutResult4 = null;
                    }
                    float lineTop = textLayoutResult4.getLineTop(lineForOffset) - roundToInt;
                    if (lineTop > 0.0f) {
                        TextLayoutResult textLayoutResult5 = this.layoutResult;
                        if (textLayoutResult5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                            textLayoutResult5 = null;
                        }
                        i3 = textLayoutResult5.getLineForVerticalPosition(lineTop);
                    } else {
                        i3 = 0;
                    }
                    int i4 = i3;
                    if (coerceAtMost == getText().length()) {
                        i4 = i3;
                        if (i3 < lineForOffset) {
                            i4 = i3 + 1;
                        }
                    }
                    return getRange(getLineEdgeIndex(i4, DirectionStart), coerceAtMost);
                } catch (IllegalStateException e2) {
                    return null;
                }
            }
            return null;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018�� \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "following", "", "current", "", "isEndBoundary", "", FirebaseAnalytics.Param.INDEX, "isStartBoundary", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator.class */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @Nullable
        private static ParagraphTextSegmentIterator instance;

        @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                if (paragraphTextSegmentIterator != null) {
                    return paragraphTextSegmentIterator;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isEndBoundary(int i2) {
            return i2 > 0 && getText().charAt(i2 - 1) != '\n' && (i2 == getText().length() || getText().charAt(i2) == '\n');
        }

        private final boolean isStartBoundary(int i2) {
            boolean z;
            if (getText().charAt(i2) != '\n') {
                z = true;
                if (i2 != 0) {
                    if (getText().charAt(i2 - 1) == '\n') {
                        z = true;
                    }
                }
                return z;
            }
            z = false;
            return z;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int i2) {
            int length = getText().length();
            if (length > 0 && i2 < length) {
                int i3 = i2;
                if (i2 < 0) {
                    i3 = 0;
                }
                while (i3 < length && getText().charAt(i3) == '\n' && !isStartBoundary(i3)) {
                    i3++;
                }
                if (i3 >= length) {
                    return null;
                }
                int i4 = i3 + 1;
                while (i4 < length && !isEndBoundary(i4)) {
                    i4++;
                }
                return getRange(i3, i4);
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length > 0 && i2 > 0) {
                int i3 = i2;
                if (i2 > length) {
                    i3 = length;
                }
                while (i3 > 0 && getText().charAt(i3 - 1) == '\n' && !isEndBoundary(i3)) {
                    i3--;
                }
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                while (i4 > 0 && !isStartBoundary(i4)) {
                    i4--;
                }
                return getRange(i4, i3);
            }
            return null;
        }
    }

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018��2\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator.class */
    public interface TextSegmentIterator {
        @Nullable
        int[] following(int i2);

        @Nullable
        int[] preceding(int i2);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018�� \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n��¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", "initialize", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "isEndBoundary", "", FirebaseAnalytics.Param.INDEX, "isLetterOrDigit", "isStartBoundary", "onLocaleChanged", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator.class */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        @Nullable
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n��¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final WordTextSegmentIterator getInstance(@NotNull Locale locale) {
                Intrinsics.checkNotNullParameter(locale, "locale");
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                if (wordTextSegmentIterator != null) {
                    return wordTextSegmentIterator;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            }
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final boolean isEndBoundary(int i2) {
            return i2 > 0 && isLetterOrDigit(i2 - 1) && (i2 == getText().length() || !isLetterOrDigit(i2));
        }

        private final boolean isLetterOrDigit(int i2) {
            if (i2 < 0 || i2 >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i2));
        }

        private final boolean isStartBoundary(int i2) {
            boolean z;
            if (isLetterOrDigit(i2)) {
                z = true;
                if (i2 != 0) {
                    if (!isLetterOrDigit(i2 - 1)) {
                        z = true;
                    }
                }
                return z;
            }
            z = false;
            return z;
        }

        private final void onLocaleChanged(Locale locale) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
            this.impl = wordInstance;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] following(int i2) {
            if (getText().length() > 0 && i2 < getText().length()) {
                int i3 = i2;
                if (i2 < 0) {
                    i3 = 0;
                }
                while (!isLetterOrDigit(i3) && !isStartBoundary(i3)) {
                    BreakIterator breakIterator = this.impl;
                    BreakIterator breakIterator2 = breakIterator;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    int following = breakIterator2.following(i3);
                    i3 = following;
                    if (following == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator3 = this.impl;
                BreakIterator breakIterator4 = breakIterator3;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator4 = null;
                }
                int following2 = breakIterator4.following(i3);
                if (following2 == -1 || !isEndBoundary(following2)) {
                    return null;
                }
                return getRange(i3, following2);
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            super.initialize(text);
            BreakIterator breakIterator = this.impl;
            BreakIterator breakIterator2 = breakIterator;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            breakIterator2.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @Nullable
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length > 0 && i2 > 0) {
                int i3 = i2;
                if (i2 > length) {
                    i3 = length;
                }
                while (i3 > 0 && !isLetterOrDigit(i3 - 1) && !isEndBoundary(i3)) {
                    BreakIterator breakIterator = this.impl;
                    BreakIterator breakIterator2 = breakIterator;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    int preceding = breakIterator2.preceding(i3);
                    i3 = preceding;
                    if (preceding == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator3 = this.impl;
                BreakIterator breakIterator4 = breakIterator3;
                if (breakIterator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator4 = null;
                }
                int preceding2 = breakIterator4.preceding(i3);
                if (preceding2 == -1 || !isStartBoundary(preceding2)) {
                    return null;
                }
                return getRange(preceding2, i3);
            }
            return null;
        }
    }
}
