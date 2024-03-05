package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Stable
@Metadata(d1 = {"��p\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018�� E2\u00020\u0001:\u0001EB\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011ø\u0001��¢\u0006\u0002\u0010\u0014J/\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00182\n\b\u0002\u0010<\u001a\u0004\u0018\u000108ø\u0001��ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u000e\u0010?\u001a\u00020@2\u0006\u0010;\u001a\u00020\u0018J%\u0010A\u001a\u00020B2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0018H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\bC\u0010DR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u00020\u000bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010(\u001a\u0004\b'\u0010\u001fR\u001c\u0010)\u001a\u0004\u0018\u00010$X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b*\u0010&\"\u0004\b+\u0010,R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\b\n��\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n��\u001a\u0004\b/\u00100R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b1\u00102R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b3\u00104R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b5\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "maxLines", "", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()I", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "nonNullIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getNonNullIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getOverflow-gIe3tQ8", "I", "paragraphIntrinsics", "getParagraphIntrinsics$foundation_release", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "getPlaceholders", "()Ljava/util/List;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getSoftWrap", "()Z", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layoutIntrinsics", "", "layoutText", "Landroidx/compose/ui/text/MultiParagraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@InternalFoundationTextApi
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextDelegate.class */
public final class TextDelegate {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Density density;
    @Nullable
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int overflow;
    @Nullable
    private MultiParagraphIntrinsics paragraphIntrinsics;
    @NotNull
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    @NotNull
    private final Font.ResourceLoader resourceLoader;
    private final boolean softWrap;
    @NotNull
    private final TextStyle style;
    @NotNull
    private final AnnotatedString text;

    @Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextDelegate$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z, int i3, Density density, Font.ResourceLoader resourceLoader, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density;
        this.resourceLoader = resourceLoader;
        this.placeholders = list;
        if (!(i2 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextDelegate(androidx.compose.ui.text.AnnotatedString r12, androidx.compose.ui.text.TextStyle r13, int r14, boolean r15, int r16, androidx.compose.ui.unit.Density r17, androidx.compose.ui.text.font.Font.ResourceLoader r18, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto Ld
            r0 = 2147483647(0x7fffffff, float:NaN)
            r14 = r0
            goto Ld
        Ld:
            r0 = r20
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L1b
            r0 = 1
            r15 = r0
            goto L1b
        L1b:
            r0 = r20
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            androidx.compose.ui.text.style.TextOverflow$Companion r0 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r0 = r0.m4734getClipgIe3tQ8()
            r16 = r0
            goto L2e
        L2e:
            r0 = r20
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L3f
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r19 = r0
            goto L3f
        L3f:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextDelegate.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, int, boolean, int, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.Font$ResourceLoader, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z, int i3, Density density, Font.ResourceLoader resourceLoader, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i2, z, i3, density, resourceLoader, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutForIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default */
    public static /* synthetic */ TextLayoutResult m967layoutNN6EwU$default(TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m970layoutNN6EwU(j2, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA */
    private final MultiParagraph m968layoutTextK40F9xA(long j2, LayoutDirection layoutDirection) {
        float coerceIn;
        layoutIntrinsics(layoutDirection);
        float m4754getMinWidthimpl = Constraints.m4754getMinWidthimpl(j2);
        boolean z = false;
        float m4752getMaxWidthimpl = ((this.softWrap || TextOverflow.m4727equalsimpl0(m969getOverflowgIe3tQ8(), TextOverflow.Companion.m4735getEllipsisgIe3tQ8())) && Constraints.m4748getHasBoundedWidthimpl(j2)) ? Constraints.m4752getMaxWidthimpl(j2) : Float.POSITIVE_INFINITY;
        int i2 = !this.softWrap && TextOverflow.m4727equalsimpl0(m969getOverflowgIe3tQ8(), TextOverflow.Companion.m4735getEllipsisgIe3tQ8()) ? 1 : this.maxLines;
        if (m4754getMinWidthimpl == m4752getMaxWidthimpl) {
            z = true;
        }
        if (!z) {
            coerceIn = RangesKt___RangesKt.coerceIn(getNonNullIntrinsics().getMaxIntrinsicWidth(), m4754getMinWidthimpl, m4752getMaxWidthimpl);
            m4752getMaxWidthimpl = coerceIn;
        }
        return new MultiParagraph(getNonNullIntrinsics(), i2, TextOverflow.m4727equalsimpl0(m969getOverflowgIe3tQ8(), TextOverflow.Companion.m4735getEllipsisgIe3tQ8()), m4752getMaxWidthimpl);
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return (int) Math.ceil(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return (int) Math.ceil(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    /* renamed from: getOverflow-gIe3tQ8 */
    public final int m969getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @Nullable
    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @NotNull
    public final Font.ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: layout-NN6Ew-U */
    public final TextLayoutResult m970layoutNN6EwU(long j2, @NotNull LayoutDirection layoutDirection, @Nullable TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (textLayoutResult == null || !TextLayoutHelperKt.m1022canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, m969getOverflowgIe3tQ8(), this.density, layoutDirection, this.resourceLoader, j2)) {
            MultiParagraph m968layoutTextK40F9xA = m968layoutTextK40F9xA(j2, layoutDirection);
            return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, m969getOverflowgIe3tQ8(), this.density, layoutDirection, this.resourceLoader, j2, null), m968layoutTextK40F9xA, ConstraintsKt.m4763constrain4WqzIAM(j2, IntSizeKt.IntSize((int) Math.ceil(m968layoutTextK40F9xA.getWidth()), (int) Math.ceil(m968layoutTextK40F9xA.getHeight()))), null);
        }
        return textLayoutResult.m4455copyO0kMr_c(TextLayoutInput.m4450copyhu1Yfo$default(textLayoutResult.getLayoutInput(), null, getStyle(), null, 0, false, 0, null, null, null, j2, 509, null), ConstraintsKt.m4763constrain4WqzIAM(j2, IntSizeKt.IntSize((int) Math.ceil(textLayoutResult.getMultiParagraph().getWidth()), (int) Math.ceil(textLayoutResult.getMultiParagraph().getHeight()))));
    }

    public final void layoutIntrinsics(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.resourceLoader);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@Nullable LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(@Nullable MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }
}
