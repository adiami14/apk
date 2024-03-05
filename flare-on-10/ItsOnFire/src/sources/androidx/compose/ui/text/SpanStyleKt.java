package androidx.compose.ui.text;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001a\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a+\u0010\u0006\u001a\u0002H\u0007\"\u0004\b��\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0006\u0010\t\u001a\u0002H\u00072\u0006\u0010\u0004\u001a\u00020\u0005H��¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpTextUnitInheritable", "Landroidx/compose/ui/unit/TextUnit;", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/SpanStyleKt.class */
public final class SpanStyleKt {
    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        long m2467lerpjxsXWHM = ColorKt.m2467lerpjxsXWHM(start.m4443getColor0d7_KjU(), stop.m4443getColor0d7_KjU(), f2);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f2);
        long m4448lerpTextUnitInheritableC3pnCVY = m4448lerpTextUnitInheritableC3pnCVY(start.m4444getFontSizeXSAIIZE(), stop.m4444getFontSizeXSAIIZE(), f2);
        FontWeight fontWeight = start.getFontWeight();
        FontWeight fontWeight2 = fontWeight;
        if (fontWeight == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight3 = stop.getFontWeight();
        FontWeight fontWeight4 = fontWeight3;
        if (fontWeight3 == null) {
            fontWeight4 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp = FontWeightKt.lerp(fontWeight2, fontWeight4, f2);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.m4445getFontStyle4Lr2A7w(), stop.m4445getFontStyle4Lr2A7w(), f2);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.m4446getFontSynthesisZQGJjVo(), stop.m4446getFontSynthesisZQGJjVo(), f2);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f2);
        long m4448lerpTextUnitInheritableC3pnCVY2 = m4448lerpTextUnitInheritableC3pnCVY(start.m4447getLetterSpacingXSAIIZE(), stop.m4447getLetterSpacingXSAIIZE(), f2);
        BaselineShift m4442getBaselineShift5SSeXJ0 = start.m4442getBaselineShift5SSeXJ0();
        float m4675constructorimpl = m4442getBaselineShift5SSeXJ0 == null ? BaselineShift.m4675constructorimpl(0.0f) : m4442getBaselineShift5SSeXJ0.m4680unboximpl();
        BaselineShift m4442getBaselineShift5SSeXJ02 = stop.m4442getBaselineShift5SSeXJ0();
        float m4687lerpjWV1Mfo = BaselineShiftKt.m4687lerpjWV1Mfo(m4675constructorimpl, m4442getBaselineShift5SSeXJ02 == null ? BaselineShift.m4675constructorimpl(0.0f) : m4442getBaselineShift5SSeXJ02.m4680unboximpl(), f2);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform3 = stop.getTextGeometricTransform();
        TextGeometricTransform textGeometricTransform4 = textGeometricTransform3;
        if (textGeometricTransform3 == null) {
            textGeometricTransform4 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp2 = TextGeometricTransformKt.lerp(textGeometricTransform2, textGeometricTransform4, f2);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f2);
        long m2467lerpjxsXWHM2 = ColorKt.m2467lerpjxsXWHM(start.m4441getBackground0d7_KjU(), stop.m4441getBackground0d7_KjU(), f2);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f2);
        Shadow shadow = start.getShadow();
        Shadow shadow2 = shadow;
        if (shadow == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow3 = stop.getShadow();
        Shadow shadow4 = shadow3;
        if (shadow3 == null) {
            shadow4 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(m2467lerpjxsXWHM, m4448lerpTextUnitInheritableC3pnCVY, lerp, fontStyle, fontSynthesis, fontFamily, str, m4448lerpTextUnitInheritableC3pnCVY2, BaselineShift.m4674boximpl(m4687lerpjWV1Mfo), lerp2, localeList, m2467lerpjxsXWHM2, textDecoration, ShadowKt.lerp(shadow2, shadow4, f2), null);
    }

    public static final <T> T lerpDiscrete(T t2, T t3, float f2) {
        if (f2 >= 0.5d) {
            t2 = t3;
        }
        return t2;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m4448lerpTextUnitInheritableC3pnCVY(long j2, long j3, float f2) {
        return (TextUnitKt.m4992isUnspecifiedR2X_6o(j2) || TextUnitKt.m4992isUnspecifiedR2X_6o(j3)) ? ((TextUnit) lerpDiscrete(TextUnit.m4964boximpl(j2), TextUnit.m4964boximpl(j3), f2)).m4983unboximpl() : TextUnitKt.m4994lerpC3pnCVY(j2, j3, f2);
    }
}
