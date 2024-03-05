package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��h\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018��2\u00020\u0001B¨\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bø\u0001��¢\u0006\u0002\u0010\u001cJ³\u0001\u00107\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bø\u0001��ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016J\u0014\u0010?\u001a\u00020��2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010��H\u0007J\u0011\u0010@\u001a\u00020��2\u0006\u0010<\u001a\u00020��H\u0087\u0002J\b\u0010A\u001a\u00020\u000fH\u0016R\u001c\u0010\u0017\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n��\u001a\u0004\b \u0010!R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n��\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n��\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b'\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n��\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n��\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n��\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n��\u001a\u0004\b/\u00100R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n��\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n��\u001a\u0004\b3\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n��\u001a\u0004\b5\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getColor-0d7_KjU", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "copy", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/SpanStyle.class */
public final class SpanStyle {
    private final long background;
    @Nullable
    private final BaselineShift baselineShift;
    private final long color;
    @Nullable
    private final FontFamily fontFamily;
    @Nullable
    private final String fontFeatureSettings;
    private final long fontSize;
    @Nullable
    private final FontStyle fontStyle;
    @Nullable
    private final FontSynthesis fontSynthesis;
    @Nullable
    private final FontWeight fontWeight;
    private final long letterSpacing;
    @Nullable
    private final LocaleList localeList;
    @Nullable
    private final Shadow shadow;
    @Nullable
    private final TextDecoration textDecoration;
    @Nullable
    private final TextGeometricTransform textGeometricTransform;

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        this.color = j2;
        this.fontSize = j3;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j4;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j5;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.Companion.m2450getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? TextUnit.Companion.m4985getUnspecifiedXSAIIZE() : j3, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? TextUnit.Companion.m4985getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & 2048) != 0 ? Color.Companion.m2450getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, null);
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    /* renamed from: copy-IuqyXdg$default  reason: not valid java name */
    public static /* synthetic */ SpanStyle m4439copyIuqyXdg$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = spanStyle.m4443getColor0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j3 = spanStyle.m4444getFontSizeXSAIIZE();
        }
        if ((i2 & 4) != 0) {
            fontWeight = spanStyle.fontWeight;
        }
        if ((i2 & 8) != 0) {
            fontStyle = spanStyle.m4445getFontStyle4Lr2A7w();
        }
        if ((i2 & 16) != 0) {
            fontSynthesis = spanStyle.m4446getFontSynthesisZQGJjVo();
        }
        if ((i2 & 32) != 0) {
            fontFamily = spanStyle.fontFamily;
        }
        if ((i2 & 64) != 0) {
            str = spanStyle.fontFeatureSettings;
        }
        if ((i2 & 128) != 0) {
            j4 = spanStyle.m4447getLetterSpacingXSAIIZE();
        }
        if ((i2 & 256) != 0) {
            baselineShift = spanStyle.m4442getBaselineShift5SSeXJ0();
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform = spanStyle.textGeometricTransform;
        }
        if ((i2 & 1024) != 0) {
            localeList = spanStyle.localeList;
        }
        if ((i2 & 2048) != 0) {
            j5 = spanStyle.m4441getBackground0d7_KjU();
        }
        if ((i2 & 4096) != 0) {
            textDecoration = spanStyle.textDecoration;
        }
        if ((i2 & 8192) != 0) {
            shadow = spanStyle.shadow;
        }
        return spanStyle.m4440copyIuqyXdg(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    @NotNull
    /* renamed from: copy-IuqyXdg  reason: not valid java name */
    public final SpanStyle m4440copyIuqyXdg(long j2, long j3, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j4, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j5, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow) {
        return new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpanStyle) {
            SpanStyle spanStyle = (SpanStyle) obj;
            return Color.m2415equalsimpl0(m4443getColor0d7_KjU(), spanStyle.m4443getColor0d7_KjU()) && TextUnit.m4971equalsimpl0(m4444getFontSizeXSAIIZE(), spanStyle.m4444getFontSizeXSAIIZE()) && Intrinsics.areEqual(this.fontWeight, spanStyle.fontWeight) && Intrinsics.areEqual(m4445getFontStyle4Lr2A7w(), spanStyle.m4445getFontStyle4Lr2A7w()) && Intrinsics.areEqual(m4446getFontSynthesisZQGJjVo(), spanStyle.m4446getFontSynthesisZQGJjVo()) && Intrinsics.areEqual(this.fontFamily, spanStyle.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m4971equalsimpl0(m4447getLetterSpacingXSAIIZE(), spanStyle.m4447getLetterSpacingXSAIIZE()) && Intrinsics.areEqual(m4442getBaselineShift5SSeXJ0(), spanStyle.m4442getBaselineShift5SSeXJ0()) && Intrinsics.areEqual(this.textGeometricTransform, spanStyle.textGeometricTransform) && Intrinsics.areEqual(this.localeList, spanStyle.localeList) && Color.m2415equalsimpl0(m4441getBackground0d7_KjU(), spanStyle.m4441getBackground0d7_KjU()) && Intrinsics.areEqual(this.textDecoration, spanStyle.textDecoration) && Intrinsics.areEqual(this.shadow, spanStyle.shadow);
        }
        return false;
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m4441getBackground0d7_KjU() {
        return this.background;
    }

    @Nullable
    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m4442getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m4443getColor0d7_KjU() {
        return this.color;
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m4444getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @Nullable
    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m4445getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    @Nullable
    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m4446getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m4447getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.shadow;
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public int hashCode() {
        int m2421hashCodeimpl = Color.m2421hashCodeimpl(m4443getColor0d7_KjU());
        int m4975hashCodeimpl = TextUnit.m4975hashCodeimpl(m4444getFontSizeXSAIIZE());
        FontWeight fontWeight = this.fontWeight;
        int i2 = 0;
        int hashCode = fontWeight == null ? 0 : fontWeight.hashCode();
        FontStyle m4445getFontStyle4Lr2A7w = m4445getFontStyle4Lr2A7w();
        int m4531hashCodeimpl = m4445getFontStyle4Lr2A7w == null ? 0 : FontStyle.m4531hashCodeimpl(m4445getFontStyle4Lr2A7w.m4533unboximpl());
        FontSynthesis m4446getFontSynthesisZQGJjVo = m4446getFontSynthesisZQGJjVo();
        int m4541hashCodeimpl = m4446getFontSynthesisZQGJjVo == null ? 0 : FontSynthesis.m4541hashCodeimpl(m4446getFontSynthesisZQGJjVo.m4545unboximpl());
        FontFamily fontFamily = this.fontFamily;
        int hashCode2 = fontFamily == null ? 0 : fontFamily.hashCode();
        String str = this.fontFeatureSettings;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int m4975hashCodeimpl2 = TextUnit.m4975hashCodeimpl(m4447getLetterSpacingXSAIIZE());
        BaselineShift m4442getBaselineShift5SSeXJ0 = m4442getBaselineShift5SSeXJ0();
        int m4678hashCodeimpl = m4442getBaselineShift5SSeXJ0 == null ? 0 : BaselineShift.m4678hashCodeimpl(m4442getBaselineShift5SSeXJ0.m4680unboximpl());
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode4 = textGeometricTransform == null ? 0 : textGeometricTransform.hashCode();
        LocaleList localeList = this.localeList;
        int hashCode5 = localeList == null ? 0 : localeList.hashCode();
        int m2421hashCodeimpl2 = Color.m2421hashCodeimpl(m4441getBackground0d7_KjU());
        TextDecoration textDecoration = this.textDecoration;
        int hashCode6 = textDecoration == null ? 0 : textDecoration.hashCode();
        Shadow shadow = this.shadow;
        if (shadow != null) {
            i2 = shadow.hashCode();
        }
        return (((((((((((((((((((((((((m2421hashCodeimpl * 31) + m4975hashCodeimpl) * 31) + hashCode) * 31) + m4531hashCodeimpl) * 31) + m4541hashCodeimpl) * 31) + hashCode2) * 31) + hashCode3) * 31) + m4975hashCodeimpl2) * 31) + m4678hashCodeimpl) * 31) + hashCode4) * 31) + hashCode5) * 31) + m2421hashCodeimpl2) * 31) + hashCode6) * 31) + i2;
    }

    @Stable
    @NotNull
    public final SpanStyle merge(@Nullable SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        long m4443getColor0d7_KjU = spanStyle.m4443getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!(m4443getColor0d7_KjU != companion.m2450getUnspecified0d7_KjU())) {
            m4443getColor0d7_KjU = m4443getColor0d7_KjU();
        }
        FontFamily fontFamily = spanStyle.fontFamily;
        FontFamily fontFamily2 = fontFamily;
        if (fontFamily == null) {
            fontFamily2 = this.fontFamily;
        }
        long m4444getFontSizeXSAIIZE = !TextUnitKt.m4992isUnspecifiedR2X_6o(spanStyle.m4444getFontSizeXSAIIZE()) ? spanStyle.m4444getFontSizeXSAIIZE() : m4444getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.fontWeight;
        FontWeight fontWeight2 = fontWeight;
        if (fontWeight == null) {
            fontWeight2 = this.fontWeight;
        }
        FontStyle m4445getFontStyle4Lr2A7w = spanStyle.m4445getFontStyle4Lr2A7w();
        FontStyle fontStyle = m4445getFontStyle4Lr2A7w;
        if (m4445getFontStyle4Lr2A7w == null) {
            fontStyle = m4445getFontStyle4Lr2A7w();
        }
        FontSynthesis m4446getFontSynthesisZQGJjVo = spanStyle.m4446getFontSynthesisZQGJjVo();
        FontSynthesis fontSynthesis = m4446getFontSynthesisZQGJjVo;
        if (m4446getFontSynthesisZQGJjVo == null) {
            fontSynthesis = m4446getFontSynthesisZQGJjVo();
        }
        String str = spanStyle.fontFeatureSettings;
        String str2 = str;
        if (str == null) {
            str2 = this.fontFeatureSettings;
        }
        long m4447getLetterSpacingXSAIIZE = !TextUnitKt.m4992isUnspecifiedR2X_6o(spanStyle.m4447getLetterSpacingXSAIIZE()) ? spanStyle.m4447getLetterSpacingXSAIIZE() : m4447getLetterSpacingXSAIIZE();
        BaselineShift m4442getBaselineShift5SSeXJ0 = spanStyle.m4442getBaselineShift5SSeXJ0();
        BaselineShift baselineShift = m4442getBaselineShift5SSeXJ0;
        if (m4442getBaselineShift5SSeXJ0 == null) {
            baselineShift = m4442getBaselineShift5SSeXJ0();
        }
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform2 = this.textGeometricTransform;
        }
        LocaleList localeList = spanStyle.localeList;
        LocaleList localeList2 = localeList;
        if (localeList == null) {
            localeList2 = this.localeList;
        }
        long m4441getBackground0d7_KjU = spanStyle.m4441getBackground0d7_KjU();
        if (!(m4441getBackground0d7_KjU != companion.m2450getUnspecified0d7_KjU())) {
            m4441getBackground0d7_KjU = m4441getBackground0d7_KjU();
        }
        TextDecoration textDecoration = spanStyle.textDecoration;
        TextDecoration textDecoration2 = textDecoration;
        if (textDecoration == null) {
            textDecoration2 = this.textDecoration;
        }
        Shadow shadow = spanStyle.shadow;
        if (shadow == null) {
            shadow = this.shadow;
        }
        return new SpanStyle(m4443getColor0d7_KjU, m4444getFontSizeXSAIIZE, fontWeight2, fontStyle, fontSynthesis, fontFamily2, str2, m4447getLetterSpacingXSAIIZE, baselineShift, textGeometricTransform2, localeList2, m4441getBackground0d7_KjU, textDecoration2, shadow, null);
    }

    @Stable
    @NotNull
    public final SpanStyle plus(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m2422toStringimpl(m4443getColor0d7_KjU())) + ", fontSize=" + ((Object) TextUnit.m4981toStringimpl(m4444getFontSizeXSAIIZE())) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + m4445getFontStyle4Lr2A7w() + ", fontSynthesis=" + m4446getFontSynthesisZQGJjVo() + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + ((Object) this.fontFeatureSettings) + ", letterSpacing=" + ((Object) TextUnit.m4981toStringimpl(m4447getLetterSpacingXSAIIZE())) + ", baselineShift=" + m4442getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m2422toStringimpl(m4441getBackground0d7_KjU())) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ')';
    }
}
