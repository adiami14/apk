package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;
/* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat.class */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true);
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    /* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat$AnyStrong.class */
    public static class AnyStrong implements TextDirectionAlgorithm {
        public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
        private final boolean mLookForRtl;

        private AnyStrong(boolean z) {
            this.mLookForRtl = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i2, int i3) {
            boolean z = false;
            int i4 = i2;
            while (i4 < i3 + i2) {
                int isRtlText = TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charSequence.charAt(i4)));
                if (isRtlText != 0) {
                    if (isRtlText != 1) {
                        continue;
                        i4++;
                        z = z;
                    } else if (!this.mLookForRtl) {
                        return 1;
                    }
                } else if (this.mLookForRtl) {
                    return 0;
                }
                z = true;
                i4++;
                z = z;
            }
            if (z) {
                return this.mLookForRtl ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat$FirstStrong.class */
    public static class FirstStrong implements TextDirectionAlgorithm {
        public static final FirstStrong INSTANCE = new FirstStrong();

        private FirstStrong() {
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i2, int i3) {
            int i4 = 2;
            for (int i5 = i2; i5 < i3 + i2 && i4 == 2; i5++) {
                i4 = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charSequence.charAt(i5)));
            }
            return i4;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm.class */
    public interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i2, int i3);
    }

    /* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl.class */
    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }

        private boolean doCheck(CharSequence charSequence, int i2, int i3) {
            int checkRtl = this.mAlgorithm.checkRtl(charSequence, i2, i3);
            if (checkRtl != 0) {
                if (checkRtl != 1) {
                    return defaultIsRtl();
                }
                return false;
            }
            return true;
        }

        public abstract boolean defaultIsRtl();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            return this.mAlgorithm == null ? defaultIsRtl() : doCheck(charSequence, i2, i3);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i2, int i3) {
            return isRtl(CharBuffer.wrap(cArr), i2, i3);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal.class */
    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        public TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale.class */
    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        public static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

        public TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public boolean defaultIsRtl() {
            boolean z = true;
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                z = false;
            }
            return z;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.INSTANCE;
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(firstStrong, false);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(firstStrong, true);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    private TextDirectionHeuristicsCompat() {
    }

    public static int isRtlText(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int isRtlTextOrFormat(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    return 1;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
