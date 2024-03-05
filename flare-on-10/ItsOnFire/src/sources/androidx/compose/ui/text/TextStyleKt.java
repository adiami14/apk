package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��0\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a'\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "DefaultLineHeight", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-Yj3eThk", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/TextDirection;)I", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/TextStyleKt.class */
public final class TextStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultLineHeight;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/TextStyleKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m2449getTransparent0d7_KjU();
        DefaultLineHeight = TextUnit.Companion.m4985getUnspecifiedXSAIIZE();
        DefaultColor = companion.m2440getBlack0d7_KjU();
    }

    @NotNull
    public static final TextStyle lerp(@NotNull TextStyle start, @NotNull TextStyle stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextStyle(SpanStyleKt.lerp(start.toSpanStyle(), stop.toSpanStyle(), f2), ParagraphStyleKt.lerp(start.toParagraphStyle(), stop.toParagraphStyle(), f2));
    }

    @NotNull
    public static final TextStyle resolveDefaults(@NotNull TextStyle style, @NotNull LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        long m4488getColor0d7_KjU = style.m4488getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!(m4488getColor0d7_KjU != companion.m2450getUnspecified0d7_KjU())) {
            m4488getColor0d7_KjU = DefaultColor;
        }
        long m4489getFontSizeXSAIIZE = TextUnitKt.m4992isUnspecifiedR2X_6o(style.m4489getFontSizeXSAIIZE()) ? DefaultFontSize : style.m4489getFontSizeXSAIIZE();
        FontWeight fontWeight = style.getFontWeight();
        FontWeight fontWeight2 = fontWeight;
        if (fontWeight == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontStyle m4490getFontStyle4Lr2A7w = style.m4490getFontStyle4Lr2A7w();
        FontStyle m4527boximpl = FontStyle.m4527boximpl(m4490getFontStyle4Lr2A7w == null ? FontStyle.Companion.m4535getNormal_LCdwA() : m4490getFontStyle4Lr2A7w.m4533unboximpl());
        FontSynthesis m4491getFontSynthesisZQGJjVo = style.m4491getFontSynthesisZQGJjVo();
        FontSynthesis m4537boximpl = FontSynthesis.m4537boximpl(m4491getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m4546getAllGVVA2EU() : m4491getFontSynthesisZQGJjVo.m4545unboximpl());
        FontFamily fontFamily = style.getFontFamily();
        SystemFontFamily systemFontFamily = fontFamily;
        if (fontFamily == null) {
            systemFontFamily = FontFamily.Companion.getDefault();
        }
        String fontFeatureSettings = style.getFontFeatureSettings();
        String str = fontFeatureSettings;
        if (fontFeatureSettings == null) {
            str = "";
        }
        long m4492getLetterSpacingXSAIIZE = TextUnitKt.m4992isUnspecifiedR2X_6o(style.m4492getLetterSpacingXSAIIZE()) ? DefaultLetterSpacing : style.m4492getLetterSpacingXSAIIZE();
        BaselineShift m4487getBaselineShift5SSeXJ0 = style.m4487getBaselineShift5SSeXJ0();
        BaselineShift m4674boximpl = BaselineShift.m4674boximpl(m4487getBaselineShift5SSeXJ0 == null ? BaselineShift.Companion.m4684getNoney9eOQZs() : m4487getBaselineShift5SSeXJ0.m4680unboximpl());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        LocaleList localeList = style.getLocaleList();
        LocaleList localeList2 = localeList;
        if (localeList == null) {
            localeList2 = LocaleList.Companion.getCurrent();
        }
        long m4486getBackground0d7_KjU = style.m4486getBackground0d7_KjU();
        if (!(m4486getBackground0d7_KjU != companion.m2450getUnspecified0d7_KjU())) {
            m4486getBackground0d7_KjU = DefaultBackgroundColor;
        }
        TextDecoration textDecoration = style.getTextDecoration();
        TextDecoration textDecoration2 = textDecoration;
        if (textDecoration == null) {
            textDecoration2 = TextDecoration.Companion.getNone();
        }
        Shadow shadow = style.getShadow();
        Shadow shadow2 = shadow;
        if (shadow == null) {
            shadow2 = Shadow.Companion.getNone();
        }
        TextAlign m4494getTextAlignbuA522U = style.m4494getTextAlignbuA522U();
        TextAlign m4690boximpl = TextAlign.m4690boximpl(m4494getTextAlignbuA522U == null ? TextAlign.Companion.m4702getStarte0LSkKk() : m4494getTextAlignbuA522U.m4696unboximpl());
        TextDirection m4705boximpl = TextDirection.m4705boximpl(m4497resolveTextDirectionYj3eThk(direction, style.m4495getTextDirectionmmuk1to()));
        long m4493getLineHeightXSAIIZE = TextUnitKt.m4992isUnspecifiedR2X_6o(style.m4493getLineHeightXSAIIZE()) ? DefaultLineHeight : style.m4493getLineHeightXSAIIZE();
        TextIndent textIndent = style.getTextIndent();
        TextIndent textIndent2 = textIndent;
        if (textIndent == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new TextStyle(m4488getColor0d7_KjU, m4489getFontSizeXSAIIZE, fontWeight2, m4527boximpl, m4537boximpl, systemFontFamily, str, m4492getLetterSpacingXSAIIZE, m4674boximpl, textGeometricTransform2, localeList2, m4486getBackground0d7_KjU, textDecoration2, shadow2, m4690boximpl, m4705boximpl, m4493getLineHeightXSAIIZE, textIndent2, null);
    }

    /* renamed from: resolveTextDirection-Yj3eThk  reason: not valid java name */
    public static final int m4497resolveTextDirectionYj3eThk(@NotNull LayoutDirection layoutDirection, @Nullable TextDirection textDirection) {
        int m4711unboximpl;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        TextDirection.Companion companion = TextDirection.Companion;
        if (textDirection == null ? false : TextDirection.m4708equalsimpl0(textDirection.m4711unboximpl(), companion.m4712getContents_7Xco())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                m4711unboximpl = companion.m4713getContentOrLtrs_7Xco();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m4711unboximpl = companion.m4714getContentOrRtls_7Xco();
            }
        } else if (textDirection == null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                m4711unboximpl = companion.m4715getLtrs_7Xco();
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m4711unboximpl = companion.m4716getRtls_7Xco();
            }
        } else {
            m4711unboximpl = textDirection.m4711unboximpl();
        }
        return m4711unboximpl;
    }
}
