package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: ItsOnFire.jar:androidx/core/os/LocaleListCompatWrapper.class */
final class LocaleListCompatWrapper implements LocaleListInterface {
    private final Locale[] mList;
    @NonNull
    private final String mStringRepresentation;
    private static final Locale[] sEmptyList = new Locale[0];
    private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
    private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
    private static final Locale EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");

    @RequiresApi(21)
    /* loaded from: ItsOnFire.jar:androidx/core/os/LocaleListCompatWrapper$Api21Impl.class */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    public LocaleListCompatWrapper(@NonNull Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < localeArr.length; i2++) {
                Locale locale = localeArr[i2];
                if (locale == null) {
                    throw new NullPointerException("list[" + i2 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    toLanguageTag(sb2, locale2);
                    if (i2 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.mList = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.mStringRepresentation = sb;
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z) {
        int computeFirstMatchIndex = computeFirstMatchIndex(collection, z);
        return computeFirstMatchIndex == -1 ? null : this.mList[computeFirstMatchIndex];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r7 < Integer.MAX_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r4, boolean r5) {
        /*
            r3 = this;
            r0 = r3
            java.util.Locale[] r0 = r0.mList
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L14
            r0 = -1
            return r0
        L14:
            r0 = r5
            if (r0 == 0) goto L32
            r0 = r3
            java.util.Locale r1 = androidx.core.os.LocaleListCompatWrapper.EN_LATN
            int r0 = r0.findFirstMatchIndex(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L28
            r0 = 0
            return r0
        L28:
            r0 = r7
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L32
            goto L36
        L32:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7 = r0
        L36:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        L3d:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L6d
            r0 = r3
            r1 = r4
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r1)
            int r0 = r0.findFirstMatchIndex(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L5f
            r0 = 0
            return r0
        L5f:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3d
            r0 = r8
            r7 = r0
            goto L3d
        L6d:
            r0 = r7
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L76
            r0 = 0
            return r0
        L76:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.LocaleListCompatWrapper.computeFirstMatchIndex(java.util.Collection, boolean):int");
    }

    private int findFirstMatchIndex(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (matchScore(locale, localeArr[i2]) > 0) {
                return i2;
            }
            i2++;
        }
    }

    private static String getLikelyScript(Locale locale) {
        String script = Api21Impl.getScript(locale);
        return !script.isEmpty() ? script : "";
    }

    private static boolean isPseudoLocale(Locale locale) {
        return LOCALE_EN_XA.equals(locale) || LOCALE_AR_XB.equals(locale);
    }

    @IntRange(from = 0, to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        String likelyScript = getLikelyScript(locale);
        if (likelyScript.isEmpty()) {
            String country = locale.getCountry();
            int i2 = 1;
            if (!country.isEmpty()) {
                i2 = country.equals(locale2.getCountry()) ? 1 : 0;
            }
            return i2;
        }
        return likelyScript.equals(getLikelyScript(locale2)) ? 1 : 0;
    }

    @VisibleForTesting
    public static void toLanguageTag(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.mList;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i2) {
        Locale locale;
        if (i2 >= 0) {
            Locale[] localeArr = this.mList;
            if (i2 < localeArr.length) {
                locale = localeArr[i2];
                return locale;
            }
        }
        locale = null;
        return locale;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }

    @Override // androidx.core.os.LocaleListInterface
    @Nullable
    public Object getLocaleList() {
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        for (Locale locale : this.mList) {
            i2 = (i2 * 31) + locale.hashCode();
        }
        return i2;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i2].equals(locale)) {
                return i2;
            }
            i2++;
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.mList.length == 0;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.mList.length;
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
        return this.mStringRepresentation;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < this.mList.length - 1) {
                sb.append(',');
            }
            i2++;
        }
    }
}
