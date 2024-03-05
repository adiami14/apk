package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��l\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0016\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a%\u0010\t\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\bø\u0001��\u001a(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H��\u001a\b\u0010\u0016\u001a\u00020\u0001H��\u001a@\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u00190\u0018\"\u0004\b��\u0010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001a0\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a(\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H��\u001a\u0014\u0010#\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\u0014\u0010&\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a(\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00190\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001ad\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b��\u0010\u001a*\u00020\u00012\u0006\u0010)\u001a\u00020\u00062>\b\u0004\u0010*\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u001a0+H\u0080\bø\u0001��\u001a \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u0018*\u00020\u00012\u0006\u0010)\u001a\u00020\u0006H��\u001a\u001c\u00100\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\u0014\u00102\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001aB\u00103\u001a\u0002H4\"\b\b��\u00104*\u000205*\u00020\f2\u0006\u00106\u001a\u0002072\u0019\b\u0004\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001��¢\u0006\u0002\u00108\u001aJ\u00103\u001a\u0002H4\"\b\b��\u00104*\u000205*\u00020\f2\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0019\b\u0004\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001��¢\u0006\u0002\u0010;\u001aB\u0010<\u001a\u0002H4\"\b\b��\u00104*\u000205*\u00020\f2\u0006\u0010=\u001a\u00020\u00062\u0019\b\u0004\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000b¢\u0006\u0002\b\u000eH\u0086\bø\u0001��¢\u0006\u0002\u0010>\u001aB\u0010<\u001a\u0002H4\"\b\b��\u00104*\u000205*\u00020\f2\u0006\u0010=\u001a\u00020\b2\u0019\b\u0004\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000b¢\u0006\u0002\b\u000eH\u0086\bø\u0001��¢\u0006\u0002\u0010?\"\u000e\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "ranges", "start", "end", "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", "style", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/AnnotatedStringKt.class */
public final class AnnotatedStringKt {
    @NotNull
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull ParagraphStyle paragraphStyle) {
        List emptyList;
        List listOf;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length()));
        return new AnnotatedString(text, emptyList, listOf);
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
        List listOf;
        List listOf2;
        List list;
        List emptyList;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(spanStyle, 0, text.length()));
        if (paragraphStyle == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list = emptyList;
        } else {
            listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length()));
            list = listOf2;
        }
        return new AnnotatedString(text, listOf, list);
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull Function1<? super AnnotatedString.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        builder.invoke(builder2);
        return builder2.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$capitalize$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i2, int i3) {
                String substring;
                Intrinsics.checkNotNullParameter(str, "str");
                if (i2 == 0) {
                    String substring2 = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    substring = StringKt.capitalize(substring2, LocaleList.this);
                } else {
                    substring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                return substring;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i2, int i3, int i4, int i5) {
        boolean z;
        if (i2 <= i4 && i5 <= i3) {
            z = true;
            if (i3 == i5) {
                if ((i4 == i5) == (i2 == i3)) {
                    z = true;
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$decapitalize$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i2, int i3) {
                String substring;
                Intrinsics.checkNotNullParameter(str, "str");
                if (i2 == 0) {
                    String substring2 = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    substring = StringKt.decapitalize(substring2, LocaleList.this);
                } else {
                    substring = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                return substring;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i2, int i3) {
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends T> range = list.get(i4);
            AnnotatedString.Range<? extends T> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i2, range3.getStart()) - i2, Math.min(i3, range3.getEnd()) - i2, range3.getTag()));
        }
        return arrayList2;
    }

    private static final List<AnnotatedString.Range<SpanStyle>> getLocalStyles(AnnotatedString annotatedString, int i2, int i3) {
        int coerceIn;
        int coerceIn2;
        List<AnnotatedString.Range<SpanStyle>> emptyList;
        if (i2 == i3) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        } else if (i2 != 0 || i3 < annotatedString.getText().length()) {
            List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
            ArrayList arrayList = new ArrayList(spanStyles.size());
            int size = spanStyles.size();
            for (int i4 = 0; i4 < size; i4++) {
                AnnotatedString.Range<SpanStyle> range = spanStyles.get(i4);
                AnnotatedString.Range<SpanStyle> range2 = range;
                if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
                Object item = range3.getItem();
                coerceIn = RangesKt___RangesKt.coerceIn(range3.getStart(), i2, i3);
                coerceIn2 = RangesKt___RangesKt.coerceIn(range3.getEnd(), i2, i3);
                arrayList2.add(new AnnotatedString.Range(item, coerceIn - i2, coerceIn2 - i2));
            }
            return arrayList2;
        } else {
            return annotatedString.getSpanStyles();
        }
    }

    public static final boolean intersect(int i2, int i3, int i4, int i5) {
        return Math.max(i2, i4) < Math.min(i3, i5) || contains(i2, i3, i4, i5) || contains(i4, i5, i2, i3);
    }

    @NotNull
    public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle, @NotNull Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, defaultParagraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i2);
            arrayList.add(block.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        ArrayList arrayList = new ArrayList();
        int size = paragraphStyles.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStyles.get(i3);
            ParagraphStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            if (component2 != i2) {
                arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i2, component2));
            }
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle.merge(component1), component2, component3));
            i2 = component3;
        }
        if (i2 != length) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        String str;
        if (i2 != i3) {
            str = annotatedString.getText().substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new AnnotatedString(str, getLocalStyles(annotatedString, i2, i3), null, 4, null);
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toLowerCase$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i2, int i3) {
                Intrinsics.checkNotNullParameter(str, "str");
                String substring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(substring, LocaleList.this);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i2, int i3) {
                Intrinsics.checkNotNullParameter(str, "str");
                String substring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(substring, LocaleList.this);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull TtsAnnotation ttsAnnotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            R invoke = block.invoke(builder);
            InlineMarker.finallyStart(1);
            builder.pop(pushTtsAnnotation);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            builder.pop(pushTtsAnnotation);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull String tag, @NotNull String annotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushStringAnnotation = builder.pushStringAnnotation(tag, annotation);
        try {
            R invoke = block.invoke(builder);
            InlineMarker.finallyStart(1);
            builder.pop(pushStringAnnotation);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            builder.pop(pushStringAnnotation);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull ParagraphStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushStyle = builder.pushStyle(style);
        try {
            R invoke = block.invoke(builder);
            InlineMarker.finallyStart(1);
            builder.pop(pushStyle);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            builder.pop(pushStyle);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull SpanStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushStyle = builder.pushStyle(style);
        try {
            R invoke = block.invoke(builder);
            InlineMarker.finallyStart(1);
            builder.pop(pushStyle);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            builder.pop(pushStyle);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
