package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.appcompat.R;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@InternalPlatformTextApi
@Metadata(d1 = {"��R\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n��\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0005\b\u0007\u0018��2\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0010\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n��¨\u0006("}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", "offset", "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/LayoutHelper.class */
public final class LayoutHelper {
    @NotNull
    private final boolean[] bidiProcessedParagraphs;
    @NotNull
    private final Layout layout;
    @NotNull
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    @NotNull
    private final List<Integer> paragraphEnds;
    @Nullable
    private char[] tmpBuffer;

    @Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n��\b\u0082\b\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/android/LayoutHelper$BidiRun.class */
    public static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i2, int i3, boolean z) {
            this.start = i2;
            this.end = i3;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = bidiRun.start;
            }
            if ((i4 & 2) != 0) {
                i3 = bidiRun.end;
            }
            if ((i4 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i2, i3, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        @NotNull
        public final BidiRun copy(int i2, int i3, boolean z) {
            return new BidiRun(i2, i3, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BidiRun) {
                BidiRun bidiRun = (BidiRun) obj;
                return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.start);
            int hashCode2 = Integer.hashCode(this.end);
            boolean z = this.isRtl;
            int i2 = z ? 1 : 0;
            if (z) {
                i2 = 1;
            }
            return (((hashCode * 31) + hashCode2) * 31) + i2;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        @NotNull
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(@NotNull Layout layout) {
        int indexOf$default;
        int length;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            indexOf$default = StringsKt__StringsKt.indexOf$default(text, '\n', i2, false, 4, (Object) null);
            length = indexOf$default < 0 ? this.layout.getText().length() : indexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
            i2 = length;
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            i3++;
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i2, boolean z) {
        Layout layout = this.layout;
        return z ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    private final int lineEndToVisibleEnd(int i2) {
        while (i2 > 0 && isLineEndSpace(this.layout.getText().charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r0.length < r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
        if (r0.getRunCount() == 1) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a2, code lost:
        if (r0 == r0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0174, code lost:
        if (r0 == r0.isRtl()) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float getHorizontalPosition(int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.getHorizontalPosition(int, boolean, boolean):float");
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i2) {
        return this.paragraphEnds.get(i2).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i2) {
        int binarySearch$default;
        binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(i2), 0, 0, 6, (Object) null);
        return binarySearch$default < 0 ? -(binarySearch$default + 1) : binarySearch$default + 1;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i2) {
        return i2 == 0 ? 0 : this.paragraphEnds.get(i2 - 1).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r4 == 8199) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isLineEndSpace(char r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 32
            if (r0 == r1) goto L57
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 10
            if (r0 == r1) goto L57
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 5760(0x1680, float:8.071E-42)
            if (r0 == r1) goto L57
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = r4
            if (r0 > r1) goto L2f
            r0 = r4
            r1 = 8203(0x200b, float:1.1495E-41)
            if (r0 >= r1) goto L2f
            r0 = 1
            r7 = r0
            goto L32
        L2f:
            r0 = 0
            r7 = r0
        L32:
            r0 = r7
            if (r0 == 0) goto L40
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 8199(0x2007, float:1.1489E-41)
            if (r0 != r1) goto L57
        L40:
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 8287(0x205f, float:1.1613E-41)
            if (r0 == r1) goto L57
            r0 = r4
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L55
            r0 = r5
            r6 = r0
            goto L57
        L55:
            r0 = 0
            r6 = r0
        L57:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.isLineEndSpace(char):boolean");
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i2) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i2))) == -1;
    }
}
