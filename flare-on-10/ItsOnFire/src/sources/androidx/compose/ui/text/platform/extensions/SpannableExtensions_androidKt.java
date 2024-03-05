package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��®\u0001\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\u001a'\u0010��\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010H��\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0002\u001a\u0016\u0010\u0015\u001a\u00020\u000b*\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u001a1\u0010\u0017\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\u001f\u001a\u00020\t*\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\"\u001a1\u0010#\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001e\u001a0\u0010%\u001a\u00020\t*\u00020\u00182\u0006\u0010&\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010'\u001a\u00020(H\u0002\u001a&\u0010)\u001a\u00020\t*\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u001a9\u0010,\u001a\u00020\t*\u00020\u00182\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a&\u00100\u001a\u00020\t*\u00020\u00182\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u001a1\u00103\u001a\u00020\t*\u00020\u00182\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a&\u00109\u001a\u00020\t*\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H��\u001a&\u0010<\u001a\u00020\t*\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u001a$\u0010?\u001a\u00020\t*\u00020\u00182\u0006\u0010@\u001a\u00020A2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H��\u001a:\u0010B\u001a\u00020\t*\u00020\u00182\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020F0Ej\b\u0012\u0004\u0012\u00020F`GH\u0002\u001a8\u0010H\u001a\u00020\t*\u00020\u00182\u0006\u0010&\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H��\u001a&\u0010I\u001a\u00020\t*\u00020\u00182\b\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H��\u001a&\u0010L\u001a\u00020\t*\u00020\u00182\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "hasFontAttributes", "", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setColor", "setColor-RPmYEkk", "setFontAttributes", "contextTextStyle", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "lineHeight", "contextFontSize", "", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "spanStyleRange", "lowPrioritySpans", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/SpanRange;", "Lkotlin/collections/ArrayList;", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt.class */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ  reason: not valid java name */
    private static final MetricAffectingSpan m4667createLetterSpacingSpaneAf_CNQ(long j2, Density density) {
        long m4973getTypeUIouoOA = TextUnit.m4973getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5008getSpUIouoOA()) ? new LetterSpacingSpanPx(density.mo523toPxR2X_6o(j2)) : TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5007getEmUIouoOA()) ? new LetterSpacingSpanEm(TextUnit.m4974getValueimpl(j2)) : null;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> block) {
        Object first;
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(merge(spanStyle, spanStyles.get(0).getItem()), Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i2 = size * 2;
        Integer[] numArr = new Integer[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            numArr[i3] = 0;
        }
        int size2 = spanStyles.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i4);
            numArr[i4] = Integer.valueOf(range.getStart());
            numArr[i4 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt___ArraysJvmKt.sort((Object[]) numArr);
        first = ArraysKt___ArraysKt.first(numArr);
        int intValue = ((Number) first).intValue();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= i2) {
                return;
            }
            int intValue2 = numArr[i6].intValue();
            int i7 = i6 + 1;
            if (intValue2 == intValue) {
                i5 = i7;
            } else {
                int size3 = spanStyles.size();
                SpanStyle spanStyle2 = spanStyle;
                int i8 = 0;
                while (i8 < size3) {
                    AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i8);
                    SpanStyle spanStyle3 = spanStyle2;
                    if (AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle3 = merge(spanStyle2, range2.getItem());
                    }
                    i8++;
                    spanStyle2 = spanStyle3;
                }
                if (spanStyle2 != null) {
                    block.invoke(spanStyle2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
                i5 = i7;
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m4491getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: setBackground-RPmYEkk  reason: not valid java name */
    public static final void m4668setBackgroundRPmYEkk(@NotNull Spannable setBackground, long j2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j2 != Color.Companion.m2450getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m2470toArgb8_81llA(j2)), i2, i3);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM  reason: not valid java name */
    private static final void m4669setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift == null) {
            return;
        }
        setSpan(spannable, new BaselineShiftSpan(baselineShift.m4680unboximpl()), i2, i3);
    }

    /* renamed from: setColor-RPmYEkk  reason: not valid java name */
    public static final void m4670setColorRPmYEkk(@NotNull Spannable setColor, long j2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j2 != Color.Companion.m2450getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m2470toArgb8_81llA(j2)), i2, i3);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final TypefaceAdapter typefaceAdapter) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().m4446getFontSynthesisZQGJjVo() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m4490getFontStyle4Lr2A7w(), textStyle.m4491getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), null, 0L, null, null, null, 0L, null, null, 16323, null) : null, arrayList, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SpanStyle spanStyle, int i3, int i4) {
                Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                TypefaceAdapter typefaceAdapter2 = typefaceAdapter;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                FontWeight fontWeight2 = fontWeight;
                if (fontWeight == null) {
                    fontWeight2 = FontWeight.Companion.getNormal();
                }
                FontStyle m4445getFontStyle4Lr2A7w = spanStyle.m4445getFontStyle4Lr2A7w();
                int m4535getNormal_LCdwA = m4445getFontStyle4Lr2A7w == null ? FontStyle.Companion.m4535getNormal_LCdwA() : m4445getFontStyle4Lr2A7w.m4533unboximpl();
                FontSynthesis m4446getFontSynthesisZQGJjVo = spanStyle.m4446getFontSynthesisZQGJjVo();
                spannable2.setSpan(new TypefaceSpan(typefaceAdapter2.m4652createDPcqOEQ(fontFamily, fontWeight2, m4535getNormal_LCdwA, m4446getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m4546getAllGVVA2EU() : m4446getFontSynthesisZQGJjVo.m4545unboximpl())), i3, i4, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i2, int i3) {
        if (str == null) {
            return;
        }
        setSpan(spannable, new FontFeatureSpan(str), i2, i3);
    }

    /* renamed from: setFontSize-KmRG4DE  reason: not valid java name */
    public static final void m4671setFontSizeKmRG4DE(@NotNull Spannable setFontSize, long j2, @NotNull Density density, int i2, int i3) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long m4973getTypeUIouoOA = TextUnit.m4973getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5008getSpUIouoOA())) {
            roundToInt = MathKt__MathJVMKt.roundToInt(density.mo523toPxR2X_6o(j2));
            setSpan(setFontSize, new AbsoluteSizeSpan(roundToInt, false), i2, i3);
        } else if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5007getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m4974getValueimpl(j2)), i2, i3);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform == null) {
            return;
        }
        setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i2, i3);
        setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i2, i3);
    }

    /* renamed from: setLineHeight-r9BaKPg  reason: not valid java name */
    public static final void m4672setLineHeightr9BaKPg(@NotNull Spannable setLineHeight, long j2, float f2, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        long m4973getTypeUIouoOA = TextUnit.m4973getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5008getSpUIouoOA())) {
            setSpan(setLineHeight, new LineHeightSpan((int) Math.ceil(density.mo523toPxR2X_6o(j2))), 0, setLineHeight.length());
        } else if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5007getEmUIouoOA())) {
            setSpan(setLineHeight, new LineHeightSpan((int) Math.ceil(TextUnit.m4974getValueimpl(j2) * f2)), 0, setLineHeight.length());
        }
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList == null) {
            return;
        }
        setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i2, i3);
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow == null) {
            return;
        }
        setSpan(spannable, new ShadowSpan(ColorKt.m2470toArgb8_81llA(shadow.m2689getColor0d7_KjU()), Offset.m2167getXimpl(shadow.m2690getOffsetF1C5BW0()), Offset.m2168getYimpl(shadow.m2690getOffsetF1C5BW0()), shadow.getBlurRadius()), i2, i3);
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object span, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i2, i3, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density, ArrayList<SpanRange> arrayList) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m4669setBaselineShift0ocSgnM(spannable, item.m4442getBaselineShift5SSeXJ0(), start, end);
        m4670setColorRPmYEkk(spannable, item.m4443getColor0d7_KjU(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m4671setFontSizeKmRG4DE(spannable, item.m4444getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m4668setBackgroundRPmYEkk(spannable, item.m4441getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        MetricAffectingSpan m4667createLetterSpacingSpaneAf_CNQ = m4667createLetterSpacingSpaneAf_CNQ(item.m4447getLetterSpacingXSAIIZE(), density);
        if (m4667createLetterSpacingSpaneAf_CNQ == null) {
            return;
        }
        arrayList.add(new SpanRange(m4667createLetterSpacingSpaneAf_CNQ, start, end));
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle contextTextStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Density density, @NotNull TypefaceAdapter typefaceAdapter) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(typefaceAdapter, "typefaceAdapter");
        setFontAttributes(spannable, contextTextStyle, spanStyles, typefaceAdapter);
        ArrayList arrayList = new ArrayList();
        int size = spanStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i2);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            SpanRange spanRange = (SpanRange) arrayList.get(i3);
            setSpan(spannable, spanRange.component1(), spanRange.component2(), spanRange.component3());
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration == null) {
            return;
        }
        TextDecoration.Companion companion = TextDecoration.Companion;
        setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i2, i3);
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f2, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent == null) {
            return;
        }
        if ((TextUnit.m4971equalsimpl0(textIndent.m4721getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m4971equalsimpl0(textIndent.m4722getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnitKt.m4992isUnspecifiedR2X_6o(textIndent.m4721getFirstLineXSAIIZE()) || TextUnitKt.m4992isUnspecifiedR2X_6o(textIndent.m4722getRestLineXSAIIZE())) {
            return;
        }
        long m4973getTypeUIouoOA = TextUnit.m4973getTypeUIouoOA(textIndent.m4721getFirstLineXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        float f3 = 0.0f;
        float mo523toPxR2X_6o = TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5008getSpUIouoOA()) ? density.mo523toPxR2X_6o(textIndent.m4721getFirstLineXSAIIZE()) : TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA, companion.m5007getEmUIouoOA()) ? TextUnit.m4974getValueimpl(textIndent.m4721getFirstLineXSAIIZE()) * f2 : 0.0f;
        long m4973getTypeUIouoOA2 = TextUnit.m4973getTypeUIouoOA(textIndent.m4722getRestLineXSAIIZE());
        if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA2, companion.m5008getSpUIouoOA())) {
            f3 = density.mo523toPxR2X_6o(textIndent.m4722getRestLineXSAIIZE());
        } else if (TextUnitType.m5003equalsimpl0(m4973getTypeUIouoOA2, companion.m5007getEmUIouoOA())) {
            f3 = TextUnit.m4974getValueimpl(textIndent.m4722getRestLineXSAIIZE()) * f2;
        }
        setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(mo523toPxR2X_6o), (int) Math.ceil(f3)), 0, spannable.length());
    }
}
