package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��Ò\u0001\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010F\u001a\u0004\u0018\u0001HG\"\u0014\b��\u0010H*\u000e\u0012\u0004\u0012\u0002HI\u0012\u0004\u0012\u0002HJ0\u0001\"\u0004\b\u0001\u0010I\"\u0004\b\u0002\u0010J\"\u0006\b\u0003\u0010G\u0018\u00012\b\u0010K\u001a\u0004\u0018\u0001HJ2\u0006\u0010L\u001a\u0002HHH\u0080\b¢\u0006\u0002\u0010M\u001a\"\u0010F\u001a\u0004\u0018\u0001HG\"\u0006\b��\u0010G\u0018\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0003H\u0080\b¢\u0006\u0002\u0010N\u001aI\u0010O\u001a\u00020\u0003\"\u0014\b��\u0010H*\u000e\u0012\u0004\u0012\u0002HI\u0012\u0004\u0012\u0002HJ0\u0001\"\u0004\b\u0001\u0010I\"\u0004\b\u0002\u0010J2\b\u0010K\u001a\u0004\u0018\u0001HI2\u0006\u0010L\u001a\u0002HH2\u0006\u0010P\u001a\u00020QH��¢\u0006\u0002\u0010R\u001a\u001f\u0010O\u001a\u0004\u0018\u0001HH\"\u0004\b��\u0010H2\b\u0010K\u001a\u0004\u0018\u0001HHH��¢\u0006\u0002\u0010N\" \u0010��\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0004\u0010\u0005\"(\u0010\u0006\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b0\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\"\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0005\"\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u0005\"\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001��¢\u0006\b\n��\u0012\u0004\b(\u0010)\"\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n��\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020-8@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b.\u0010/\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001*\u0002008@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b.\u00101\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0001*\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00103\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001*\u0002048@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b.\u00105\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00107\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00109\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001*\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010;\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020<8@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b.\u0010=\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u0001*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010?\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001*\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010A\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001*\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010C\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001*\u00020D8@X\u0080\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b.\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotationRangeListSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeSaver", "BaselineShiftSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "ColorSaver", "Landroidx/compose/ui/graphics/Color;", "FontWeightSaver", "Landroidx/compose/ui/text/font/FontWeight;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleSaver", "Landroidx/compose/ui/text/intl/Locale;", "OffsetSaver", "Landroidx/compose/ui/geometry/Offset;", "ParagraphStyleSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyleSaver", "ShadowSaver", "Landroidx/compose/ui/graphics/Shadow;", "SpanStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyleSaver", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextIndentSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextRangeSaver", "Landroidx/compose/ui/text/TextRange;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnit;", "getTextUnitSaver$annotations", "()V", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Saver", "Landroidx/compose/ui/geometry/Offset$Companion;", "getSaver", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "restore", "Result", "T", "Original", "Saveable", "value", "saver", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "scope", "Landroidx/compose/runtime/saveable/SaverScope;", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/SaversKt.class */
public final class SaversKt {
    @NotNull
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new Function2<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString it) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            List<AnnotatedString.Range<SpanStyle>> spanStyles = it.getSpanStyles();
            saver = SaversKt.AnnotationRangeListSaver;
            List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = it.getParagraphStyles();
            saver2 = SaversKt.AnnotationRangeListSaver;
            List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = it.getAnnotations$ui_text_release();
            saver3 = SaversKt.AnnotationRangeListSaver;
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.getText()), SaversKt.save(spanStyles, saver, Saver), SaversKt.save(paragraphStyles, saver2, Saver), SaversKt.save(annotations$ui_text_release, saver3, Saver));
            return arrayListOf;
        }
    }, new Function1<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString invoke(@NotNull Object it) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            List list2 = null;
            String str = obj == null ? null : (String) obj;
            Intrinsics.checkNotNull(str);
            Object obj2 = list.get(1);
            saver = SaversKt.AnnotationRangeListSaver;
            Boolean bool = Boolean.FALSE;
            List list3 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (List) saver.restore(obj2);
            Intrinsics.checkNotNull(list3);
            Object obj3 = list.get(2);
            saver2 = SaversKt.AnnotationRangeListSaver;
            List list4 = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : (List) saver2.restore(obj3);
            Intrinsics.checkNotNull(list4);
            Object obj4 = list.get(3);
            saver3 = SaversKt.AnnotationRangeListSaver;
            if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
                list2 = (List) saver3.restore(obj4);
            }
            Intrinsics.checkNotNull(list2);
            return new AnnotatedString(str, list3, list4, list2);
        }
    });
    @NotNull
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new Function2<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull List<? extends AnnotatedString.Range<? extends Object>> it) {
            Saver saver;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            int size = it.size();
            for (int i2 = 0; i2 < size; i2++) {
                saver = SaversKt.AnnotationRangeSaver;
                arrayList.add(SaversKt.save(it.get(i2), saver, Saver));
            }
            return arrayList;
        }
    }, new Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(@NotNull Object it) {
            Saver saver;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    range = (AnnotatedString.Range) saver.restore(obj);
                }
                Intrinsics.checkNotNull(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });
    @NotNull
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/SaversKt$AnnotationRangeSaver$1$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString.Range<? extends Object> it) {
            Object obj;
            Saver paragraphStyleSaver;
            Object save;
            ArrayList arrayListOf;
            Saver saver;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object item = it.getItem();
            AnnotationType annotationType = item instanceof ParagraphStyle ? AnnotationType.Paragraph : item instanceof SpanStyle ? AnnotationType.Span : item instanceof VerbatimTtsAnnotation ? AnnotationType.VerbatimTts : AnnotationType.String;
            int i2 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i2 == 1) {
                obj = (ParagraphStyle) it.getItem();
                paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            } else if (i2 == 2) {
                obj = (SpanStyle) it.getItem();
                paragraphStyleSaver = SaversKt.getSpanStyleSaver();
            } else if (i2 != 3) {
                if (i2 == 4) {
                    save = SaversKt.save(it.getItem());
                    arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(it.getStart())), SaversKt.save(Integer.valueOf(it.getEnd())), SaversKt.save(it.getTag()));
                    return arrayListOf;
                }
                throw new NoWhenBranchMatchedException();
            } else {
                obj = (VerbatimTtsAnnotation) it.getItem();
                saver = SaversKt.VerbatimTtsAnnotationSaver;
                paragraphStyleSaver = saver;
            }
            save = SaversKt.save(obj, paragraphStyleSaver, Saver);
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(it.getStart())), SaversKt.save(Integer.valueOf(it.getEnd())), SaversKt.save(it.getTag()));
            return arrayListOf;
        }
    }, new Function1<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object it) {
            AnnotatedString.Range<? extends Object> range;
            Saver saver;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            AnnotationType annotationType = obj == null ? null : (AnnotationType) obj;
            Intrinsics.checkNotNull(annotationType);
            Object obj2 = list.get(2);
            Integer num = obj2 == null ? null : (Integer) obj2;
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Object obj3 = list.get(3);
            Integer num2 = obj3 == null ? null : (Integer) obj3;
            Intrinsics.checkNotNull(num2);
            int intValue2 = num2.intValue();
            Object obj4 = list.get(4);
            String str = obj4 == null ? null : (String) obj4;
            Intrinsics.checkNotNull(str);
            int i2 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i2 == 1) {
                Object obj5 = list.get(1);
                ParagraphStyle restore = Intrinsics.areEqual(obj5, Boolean.FALSE) ? null : obj5 == null ? null : SaversKt.getParagraphStyleSaver().restore(obj5);
                Intrinsics.checkNotNull(restore);
                range = new AnnotatedString.Range<>(restore, intValue, intValue2, str);
            } else if (i2 == 2) {
                Object obj6 = list.get(1);
                SpanStyle restore2 = Intrinsics.areEqual(obj6, Boolean.FALSE) ? null : obj6 == null ? null : SaversKt.getSpanStyleSaver().restore(obj6);
                Intrinsics.checkNotNull(restore2);
                range = new AnnotatedString.Range<>(restore2, intValue, intValue2, str);
            } else if (i2 == 3) {
                Object obj7 = list.get(1);
                saver = SaversKt.VerbatimTtsAnnotationSaver;
                VerbatimTtsAnnotation verbatimTtsAnnotation = Intrinsics.areEqual(obj7, Boolean.FALSE) ? null : obj7 == null ? null : (VerbatimTtsAnnotation) saver.restore(obj7);
                Intrinsics.checkNotNull(verbatimTtsAnnotation);
                range = new AnnotatedString.Range<>(verbatimTtsAnnotation, intValue, intValue2, str);
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                Object obj8 = list.get(1);
                String str2 = obj8 == null ? null : (String) obj8;
                Intrinsics.checkNotNull(str2);
                range = new AnnotatedString.Range<>(str2, intValue, intValue2, str);
            }
            return range;
        }
    });
    @NotNull
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new Function2<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull VerbatimTtsAnnotation it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return SaversKt.save(it.getVerbatim());
        }
    }, new Function1<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final VerbatimTtsAnnotation invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new VerbatimTtsAnnotation((String) it);
        }
    });
    @NotNull
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new Function2<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull ParagraphStyle it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.m4368getTextAlignbuA522U()), SaversKt.save(it.m4369getTextDirectionmmuk1to()), SaversKt.save(TextUnit.m4964boximpl(it.m4367getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), Saver), SaversKt.save(it.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), Saver));
            return arrayListOf;
        }
    }, new Function1<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ParagraphStyle invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextAlign textAlign = obj == null ? null : (TextAlign) obj;
            Object obj2 = list.get(1);
            TextDirection textDirection = obj2 == null ? null : (TextDirection) obj2;
            Object obj3 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
            Boolean bool = Boolean.FALSE;
            TextUnit restore = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : saver.restore(obj3);
            Intrinsics.checkNotNull(restore);
            long m4983unboximpl = restore.m4983unboximpl();
            Object obj4 = list.get(3);
            return new ParagraphStyle(textAlign, textDirection, m4983unboximpl, Intrinsics.areEqual(obj4, bool) ? null : obj4 == null ? null : SaversKt.getSaver(TextIndent.Companion).restore(obj4), null);
        }
    });
    @NotNull
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new Function2<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull SpanStyle it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Color m2404boximpl = Color.m2404boximpl(it.m4443getColor0d7_KjU());
            Color.Companion companion = Color.Companion;
            Object save = SaversKt.save(m2404boximpl, SaversKt.getSaver(companion), Saver);
            TextUnit m4964boximpl = TextUnit.m4964boximpl(it.m4444getFontSizeXSAIIZE());
            TextUnit.Companion companion2 = TextUnit.Companion;
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(save, SaversKt.save(m4964boximpl, SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), Saver), SaversKt.save(it.m4445getFontStyle4Lr2A7w()), SaversKt.save(it.m4446getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(it.getFontFeatureSettings()), SaversKt.save(TextUnit.m4964boximpl(it.m4447getLetterSpacingXSAIIZE()), SaversKt.getSaver(companion2), Saver), SaversKt.save(it.m4442getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), Saver), SaversKt.save(it.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), Saver), SaversKt.save(it.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), Saver), SaversKt.save(Color.m2404boximpl(it.m4441getBackground0d7_KjU()), SaversKt.getSaver(companion), Saver), SaversKt.save(it.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), Saver), SaversKt.save(it.getShadow(), SaversKt.getSaver(Shadow.Companion), Saver));
            return arrayListOf;
        }
    }, new Function1<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SpanStyle invoke(@NotNull Object it) {
            FontWeight restore;
            BaselineShift restore2;
            TextGeometricTransform restore3;
            LocaleList restore4;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Color.Companion companion = Color.Companion;
            Saver<Color, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Shadow shadow = null;
            Color restore5 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(restore5);
            long m2424unboximpl = restore5.m2424unboximpl();
            Object obj2 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.Companion;
            TextUnit restore6 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(companion2).restore(obj2);
            Intrinsics.checkNotNull(restore6);
            long m4983unboximpl = restore6.m4983unboximpl();
            Object obj3 = list.get(2);
            Saver<FontWeight, Object> saver2 = SaversKt.getSaver(FontWeight.Companion);
            if (Intrinsics.areEqual(obj3, bool)) {
                restore = null;
            } else {
                restore = obj3 == null ? null : saver2.restore(obj3);
            }
            Object obj4 = list.get(3);
            FontStyle fontStyle = obj4 == null ? null : (FontStyle) obj4;
            Object obj5 = list.get(4);
            FontSynthesis fontSynthesis = obj5 == null ? null : (FontSynthesis) obj5;
            Object obj6 = list.get(6);
            String str = obj6 == null ? null : (String) obj6;
            Object obj7 = list.get(7);
            TextUnit restore7 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : SaversKt.getSaver(companion2).restore(obj7);
            Intrinsics.checkNotNull(restore7);
            long m4983unboximpl2 = restore7.m4983unboximpl();
            Object obj8 = list.get(8);
            Saver<BaselineShift, Object> saver3 = SaversKt.getSaver(BaselineShift.Companion);
            if (Intrinsics.areEqual(obj8, bool)) {
                restore2 = null;
            } else {
                restore2 = obj8 == null ? null : saver3.restore(obj8);
            }
            Object obj9 = list.get(9);
            Saver<TextGeometricTransform, Object> saver4 = SaversKt.getSaver(TextGeometricTransform.Companion);
            if (Intrinsics.areEqual(obj9, bool)) {
                restore3 = null;
            } else {
                restore3 = obj9 == null ? null : saver4.restore(obj9);
            }
            Object obj10 = list.get(10);
            Saver<LocaleList, Object> saver5 = SaversKt.getSaver(LocaleList.Companion);
            if (Intrinsics.areEqual(obj10, bool)) {
                restore4 = null;
            } else {
                restore4 = obj10 == null ? null : saver5.restore(obj10);
            }
            Object obj11 = list.get(11);
            Color restore8 = (Intrinsics.areEqual(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(companion).restore(obj11);
            Intrinsics.checkNotNull(restore8);
            long m2424unboximpl2 = restore8.m2424unboximpl();
            Object obj12 = list.get(12);
            TextDecoration restore9 = Intrinsics.areEqual(obj12, bool) ? null : obj12 == null ? null : SaversKt.getSaver(TextDecoration.Companion).restore(obj12);
            Object obj13 = list.get(13);
            Saver<Shadow, Object> saver6 = SaversKt.getSaver(Shadow.Companion);
            if (!Intrinsics.areEqual(obj13, bool) && obj13 != null) {
                shadow = saver6.restore(obj13);
            }
            return new SpanStyle(m2424unboximpl, m4983unboximpl, restore, fontStyle, fontSynthesis, null, str, m4983unboximpl2, restore2, restore3, restore4, m2424unboximpl2, restore9, shadow, 32, null);
        }
    });
    @NotNull
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new Function2<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextDecoration it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getMask());
        }
    }, new Function1<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextDecoration invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new TextDecoration(((Integer) it).intValue());
        }
    });
    @NotNull
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new Function2<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextGeometricTransform it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
            return arrayListOf;
        }
    }, new Function1<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextGeometricTransform invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    @NotNull
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new Function2<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextIndent it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            TextUnit m4964boximpl = TextUnit.m4964boximpl(it.m4721getFirstLineXSAIIZE());
            TextUnit.Companion companion = TextUnit.Companion;
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(m4964boximpl, SaversKt.getSaver(companion), Saver), SaversKt.save(TextUnit.m4964boximpl(it.m4722getRestLineXSAIIZE()), SaversKt.getSaver(companion), Saver));
            return arrayListOf;
        }
    }, new Function1<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextIndent invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextUnit.Companion companion = TextUnit.Companion;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit restore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(restore);
            long m4983unboximpl = restore.m4983unboximpl();
            Object obj2 = list.get(1);
            TextUnit restore2 = Intrinsics.areEqual(obj2, bool) ? null : obj2 == null ? null : SaversKt.getSaver(companion).restore(obj2);
            Intrinsics.checkNotNull(restore2);
            return new TextIndent(m4983unboximpl, restore2.m4983unboximpl(), null);
        }
    });
    @NotNull
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new Function2<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull FontWeight it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getWeight());
        }
    }, new Function1<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final FontWeight invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FontWeight(((Integer) it).intValue());
        }
    });
    @NotNull
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new Function2<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return m4400invoke8a2Sb4w(saverScope, baselineShift.m4680unboximpl());
        }

        @Nullable
        /* renamed from: invoke-8a2Sb4w  reason: not valid java name */
        public final Object m4400invoke8a2Sb4w(@NotNull SaverScope Saver, float f2) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Float.valueOf(f2);
        }
    }, new Function1<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-jTk7eUs  reason: not valid java name */
        public final BaselineShift invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BaselineShift.m4674boximpl(BaselineShift.m4675constructorimpl(((Float) it).floatValue()));
        }
    });
    @NotNull
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new Function2<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
            return m4430invokeFDrldGo(saverScope, textRange.m4479unboximpl());
        }

        @Nullable
        /* renamed from: invoke-FDrldGo  reason: not valid java name */
        public final Object m4430invokeFDrldGo(@NotNull SaverScope Saver, long j2) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf((Integer) SaversKt.save(Integer.valueOf(TextRange.m4475getStartimpl(j2))), (Integer) SaversKt.save(Integer.valueOf(TextRange.m4470getEndimpl(j2))));
            return arrayListOf;
        }
    }, new Function1<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-VqIyPBM  reason: not valid java name */
        public final TextRange invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Integer num = obj == null ? null : (Integer) obj;
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Object obj2 = list.get(1);
            Integer num2 = obj2 == null ? null : (Integer) obj2;
            Intrinsics.checkNotNull(num2);
            return TextRange.m4463boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
        }
    });
    @NotNull
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new Function2<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull Shadow it) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Color.m2404boximpl(it.m2689getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), Saver), SaversKt.save(Offset.m2156boximpl(it.m2690getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), Saver), SaversKt.save(Float.valueOf(it.getBlurRadius())));
            return arrayListOf;
        }
    }, new Function1<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Shadow invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
            Boolean bool = Boolean.FALSE;
            Color restore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(restore);
            long m2424unboximpl = restore.m2424unboximpl();
            Object obj2 = list.get(1);
            Offset restore2 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(Offset.Companion).restore(obj2);
            Intrinsics.checkNotNull(restore2);
            long m2177unboximpl = restore2.m2177unboximpl();
            Object obj3 = list.get(2);
            Float f2 = obj3 == null ? null : (Float) obj3;
            Intrinsics.checkNotNull(f2);
            return new Shadow(m2424unboximpl, m2177unboximpl, f2.floatValue(), null);
        }
    });
    @NotNull
    private static final Saver<Color, Object> ColorSaver = SaverKt.Saver(new Function2<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return m4404invoke4WTKRHQ(saverScope, color.m2424unboximpl());
        }

        @Nullable
        /* renamed from: invoke-4WTKRHQ  reason: not valid java name */
        public final Object m4404invoke4WTKRHQ(@NotNull SaverScope Saver, long j2) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return ULong.m6019boximpl(j2);
        }
    }, new Function1<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-ijrfgN4  reason: not valid java name */
        public final Color invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Color.m2404boximpl(Color.m2410constructorimpl(((ULong) it).m6076unboximpl()));
        }
    });
    @NotNull
    private static final Saver<TextUnit, Object> TextUnitSaver = SaverKt.Saver(new Function2<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
            return m4434invokempE4wyQ(saverScope, textUnit.m4983unboximpl());
        }

        @Nullable
        /* renamed from: invoke-mpE4wyQ  reason: not valid java name */
        public final Object m4434invokempE4wyQ(@NotNull SaverScope Saver, long j2) {
            ArrayList arrayListOf;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(TextUnit.m4974getValueimpl(j2))), SaversKt.save(TextUnitType.m5000boximpl(TextUnit.m4973getTypeUIouoOA(j2))));
            return arrayListOf;
        }
    }, new Function1<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-XNhUCwk  reason: not valid java name */
        public final TextUnit invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Float f2 = obj == null ? null : (Float) obj;
            Intrinsics.checkNotNull(f2);
            float floatValue = f2.floatValue();
            Object obj2 = list.get(1);
            TextUnitType textUnitType = obj2 == null ? null : (TextUnitType) obj2;
            Intrinsics.checkNotNull(textUnitType);
            return TextUnit.m4964boximpl(TextUnitKt.m4986TextUnitanM5pPY(floatValue, textUnitType.m5006unboximpl()));
        }
    });
    @NotNull
    private static final Saver<Offset, Object> OffsetSaver = SaverKt.Saver(new Function2<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
            return m4414invokeUv8p0NA(saverScope, offset.m2177unboximpl());
        }

        @Nullable
        /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
        public final Object m4414invokeUv8p0NA(@NotNull SaverScope Saver, long j2) {
            Object arrayListOf;
            Object obj;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            if (Offset.m2164equalsimpl0(j2, Offset.Companion.m2182getUnspecifiedF1C5BW0())) {
                obj = Boolean.FALSE;
            } else {
                arrayListOf = CollectionsKt__CollectionsKt.arrayListOf((Float) SaversKt.save(Float.valueOf(Offset.m2167getXimpl(j2))), (Float) SaversKt.save(Float.valueOf(Offset.m2168getYimpl(j2))));
                obj = arrayListOf;
            }
            return obj;
        }
    }, new Function1<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-x-9fifI  reason: not valid java name */
        public final Offset invoke(@NotNull Object it) {
            long Offset;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it, Boolean.FALSE)) {
                Offset = Offset.Companion.m2182getUnspecifiedF1C5BW0();
            } else {
                List list = (List) it;
                Object obj = list.get(0);
                Float f2 = obj == null ? null : (Float) obj;
                Intrinsics.checkNotNull(f2);
                float floatValue = f2.floatValue();
                Object obj2 = list.get(1);
                Float f3 = obj2 == null ? null : (Float) obj2;
                Intrinsics.checkNotNull(f3);
                Offset = OffsetKt.Offset(floatValue, f3.floatValue());
            }
            return Offset.m2156boximpl(Offset);
        }
    });
    @NotNull
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new Function2<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull LocaleList it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            List<Locale> localeList = it.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList.size());
            int size = localeList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(SaversKt.save(localeList.get(i2), SaversKt.getSaver(Locale.Companion), Saver));
            }
            return arrayList;
        }
    }, new Function1<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final LocaleList invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.Companion);
                Locale locale = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    locale = saver.restore(obj);
                }
                Intrinsics.checkNotNull(locale);
                arrayList.add(locale);
            }
            return new LocaleList(arrayList);
        }
    });
    @NotNull
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new Function2<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull Locale it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toLanguageTag();
        }
    }, new Function1<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Locale invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Locale((String) it);
        }
    });

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    @NotNull
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetSaver;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ColorSaver;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ShadowSaver;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextRangeSaver;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return FontWeightSaver;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleSaver;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleListSaver;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return BaselineShiftSaver;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextDecorationSaver;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextGeometricTransformSaver;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextIndentSaver;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextUnitSaver;
    }

    @NotNull
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    private static /* synthetic */ void getTextUnitSaver$annotations() {
    }

    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == null) {
            obj = null;
        } else {
            Intrinsics.reifiedOperationMarker(1, "Result");
        }
        return (Result) obj;
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T saver) {
        Object restore;
        Intrinsics.checkNotNullParameter(saver, "saver");
        if (Intrinsics.areEqual(saveable, Boolean.FALSE)) {
            return null;
        }
        if (saveable == null) {
            restore = null;
        } else {
            restore = saver.restore(saveable);
            Intrinsics.reifiedOperationMarker(1, "Result");
        }
        return (Result) restore;
    }

    @Nullable
    public static final <T> T save(@Nullable T t2) {
        return t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r0 == null) goto L3;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.runtime.saveable.Saver<Original, Saveable>, Original, Saveable> java.lang.Object save(@org.jetbrains.annotations.Nullable Original r4, @org.jetbrains.annotations.NotNull T r5, @org.jetbrains.annotations.NotNull androidx.compose.runtime.saveable.SaverScope r6) {
        /*
            r0 = r5
            java.lang.String r1 = "saver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r6
            java.lang.String r1 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            if (r0 != 0) goto L19
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4 = r0
            goto L2b
        L19:
            r0 = r5
            r1 = r6
            r2 = r4
            java.lang.Object r0 = r0.save(r1, r2)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L2b
            goto L12
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt.save(java.lang.Object, androidx.compose.runtime.saveable.Saver, androidx.compose.runtime.saveable.SaverScope):java.lang.Object");
    }
}
