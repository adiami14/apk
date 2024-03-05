package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: ItsOnFire.jar:androidx/core/text/BidiFormatter.class */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    public static final BidiFormatter DEFAULT_LTR_INSTANCE;
    public static final BidiFormatter DEFAULT_RTL_INSTANCE;
    public static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    /* loaded from: ItsOnFire.jar:androidx/core/text/BidiFormatter$Builder.class */
    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.isRtlLocale(locale));
        }

        public Builder(boolean z) {
            initialize(z);
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z) {
            return z ? BidiFormatter.DEFAULT_RTL_INSTANCE : BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        private void initialize(boolean z) {
            this.mIsRtlContext = z;
            this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public BidiFormatter build() {
            return (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) ? getDefaultInstanceFromContext(this.mIsRtlContext) : new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }

        public Builder stereoReset(boolean z) {
            this.mFlags = z ? this.mFlags | 2 : this.mFlags & (-3);
            return this;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/text/BidiFormatter$DirectionalityEstimator.class */
    public static class DirectionalityEstimator {
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final CharSequence text;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];

        static {
            for (int i2 = 0; i2 < DIR_TYPE_CACHE_SIZE; i2++) {
                DIR_TYPE_CACHE[i2] = Character.getDirectionality(i2);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence, boolean z) {
            this.text = charSequence;
            this.isHtml = z;
            this.length = charSequence.length();
        }

        private static byte getCachedDirectionality(char c2) {
            return c2 < DIR_TYPE_CACHE_SIZE ? DIR_TYPE_CACHE[c2] : Character.getDirectionality(c2);
        }

        private byte skipEntityBackward() {
            char charAt;
            int i2 = this.charIndex;
            do {
                int i3 = this.charIndex;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i4 = i3 - 1;
                this.charIndex = i4;
                charAt = charSequence.charAt(i4);
                this.lastChar = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.charIndex = i2;
            this.lastChar = (char) 59;
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char charAt;
            do {
                int i2 = this.charIndex;
                if (i2 >= this.length) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i2 + 1;
                charAt = charSequence.charAt(i2);
                this.lastChar = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte skipTagBackward() {
            char charAt;
            int i2 = this.charIndex;
            while (true) {
                int i3 = this.charIndex;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i4 = i3 - 1;
                this.charIndex = i4;
                char charAt2 = charSequence.charAt(i4);
                this.lastChar = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i5 = this.charIndex;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.text;
                            int i6 = i5 - 1;
                            this.charIndex = i6;
                            charAt = charSequence2.charAt(i6);
                            this.lastChar = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.charIndex = i2;
            this.lastChar = (char) 62;
            return (byte) 13;
        }

        private byte skipTagForward() {
            char charAt;
            int i2 = this.charIndex;
            while (true) {
                int i3 = this.charIndex;
                if (i3 >= this.length) {
                    this.charIndex = i2;
                    this.lastChar = (char) 60;
                    return (byte) 13;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i3 + 1;
                char charAt2 = charSequence.charAt(i3);
                this.lastChar = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.charIndex;
                        if (i4 < this.length) {
                            CharSequence charSequence2 = this.text;
                            this.charIndex = i4 + 1;
                            charAt = charSequence2.charAt(i4);
                            this.lastChar = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        public byte dirTypeBackward() {
            char charAt = this.text.charAt(this.charIndex - 1);
            this.lastChar = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.charIndex--;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            byte b2 = cachedDirectionality;
            if (this.isHtml) {
                char c2 = this.lastChar;
                if (c2 == '>') {
                    b2 = skipTagBackward();
                } else {
                    b2 = cachedDirectionality;
                    if (c2 == ';') {
                        b2 = skipEntityBackward();
                    }
                }
            }
            return b2;
        }

        public byte dirTypeForward() {
            char charAt = this.text.charAt(this.charIndex);
            this.lastChar = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.text, this.charIndex);
                this.charIndex += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.charIndex++;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            byte b2 = cachedDirectionality;
            if (this.isHtml) {
                char c2 = this.lastChar;
                if (c2 == '<') {
                    b2 = skipTagForward();
                } else {
                    b2 = cachedDirectionality;
                    if (c2 == '&') {
                        b2 = skipEntityForward();
                    }
                }
            }
            return b2;
        }

        public int getEntryDir() {
            this.charIndex = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.charIndex < this.length && i2 == 0) {
                byte dirTypeForward = dirTypeForward();
                if (dirTypeForward != 0) {
                    if (dirTypeForward == 1 || dirTypeForward == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (dirTypeForward != 9) {
                        switch (dirTypeForward) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                break;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                break;
                            case 18:
                                i4--;
                                i3 = 0;
                                break;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        public int getExitDir() {
            throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a5\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:31)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.Ir2JRegAssignTransformer.transform(Ir2JRegAssignTransformer.java:182)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:167)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:449)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:41)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:132)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:582)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:441)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:457)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:126)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:275)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:107)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:290)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:33)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.an.SimpleLiveAnalyze.onUseLocal(SimpleLiveAnalyze.java:89)\n\tat com.googlecode.dex2jar.ir.ts.an.SimpleLiveAnalyze.onUseLocal(SimpleLiveAnalyze.java:27)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:31)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristicCompat;
        LRM_STRING = Character.toString((char) 8206);
        RLM_STRING = Character.toString((char) 8207);
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z, int i2, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z;
        this.mFlags = i2;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    private static int getEntryDir(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).getEntryDir();
    }

    private static int getExitDir(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).getExitDir();
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    public static BidiFormatter getInstance(boolean z) {
        return new Builder(z).build();
    }

    public static boolean isRtlLocale(Locale locale) {
        boolean z = true;
        if (TextUtilsCompat.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        return z;
    }

    private String markAfter(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        return (this.mIsRtlContext || !(isRtl || getExitDir(charSequence) == 1)) ? this.mIsRtlContext ? (!isRtl || getExitDir(charSequence) == -1) ? RLM_STRING : "" : "" : LRM_STRING;
    }

    private String markBefore(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        return (this.mIsRtlContext || !(isRtl || getEntryDir(charSequence) == 1)) ? this.mIsRtlContext ? (!isRtl || getEntryDir(charSequence) == -1) ? RLM_STRING : "" : "" : LRM_STRING;
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z) {
            spannableStringBuilder.append((CharSequence) markBefore(charSequence, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        if (isRtl != this.mIsRtlContext) {
            spannableStringBuilder.append(isRtl ? RLE : LRE);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) markAfter(charSequence, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        return spannableStringBuilder;
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, z);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, textDirectionHeuristicCompat, z).toString();
    }

    public String unicodeWrap(String str, boolean z) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, z);
    }
}
