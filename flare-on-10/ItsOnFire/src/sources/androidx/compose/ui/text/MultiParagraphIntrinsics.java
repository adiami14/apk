package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u0014¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "infoList", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "getInfoList$ui_text_release", "()Ljava/util/List;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth$delegate", "Lkotlin/Lazy;", "minIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth$delegate", "getPlaceholders", "resolveTextDirection", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultStyle", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/MultiParagraphIntrinsics.class */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    @NotNull
    private final AnnotatedString annotatedString;
    @NotNull
    private final List<ParagraphIntrinsicInfo> infoList;
    @NotNull
    private final Lazy maxIntrinsicWidth$delegate;
    @NotNull
    private final Lazy minIntrinsicWidth$delegate;
    @NotNull
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        Lazy lazy;
        Lazy lazy2;
        List localPlaceholders;
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        this.annotatedString = annotatedString;
        this.placeholders = placeholders;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                int lastIndex;
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                    float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
                    lastIndex = CollectionsKt__CollectionsKt.getLastIndex(infoList$ui_text_release);
                    int i2 = 1;
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                    if (1 <= lastIndex) {
                        paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i2);
                            float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                            float f2 = minIntrinsicWidth;
                            if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo = paragraphIntrinsicInfo3;
                                f2 = minIntrinsicWidth2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            }
                            i2++;
                            minIntrinsicWidth = f2;
                        }
                    }
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                float f3 = 0.0f;
                if (paragraphIntrinsicInfo4 != null && (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) != null) {
                    f3 = intrinsics.getMinIntrinsicWidth();
                }
                return Float.valueOf(f3);
            }
        });
        this.minIntrinsicWidth$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                int lastIndex;
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = MultiParagraphIntrinsics.this.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                    float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
                    lastIndex = CollectionsKt__CollectionsKt.getLastIndex(infoList$ui_text_release);
                    int i2 = 1;
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                    if (1 <= lastIndex) {
                        paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i2);
                            float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                            float f2 = maxIntrinsicWidth;
                            if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo = paragraphIntrinsicInfo3;
                                f2 = maxIntrinsicWidth2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            }
                            i2++;
                            maxIntrinsicWidth = f2;
                        }
                    }
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                float f3 = 0.0f;
                if (paragraphIntrinsicInfo4 != null && (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) != null) {
                    f3 = intrinsics.getMaxIntrinsicWidth();
                }
                return Float.valueOf(f3);
            }
        });
        this.maxIntrinsicWidth$delegate = lazy2;
        ParagraphStyle paragraphStyle = style.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i2);
            AnnotatedString substringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle resolveTextDirection = resolveTextDirection(range.getItem(), paragraphStyle);
            String text = substringWithoutParagraphStyles.getText();
            TextStyle merge = style.merge(resolveTextDirection);
            List<AnnotatedString.Range<SpanStyle>> spanStyles = substringWithoutParagraphStyles.getSpanStyles();
            localPlaceholders = MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, merge, spanStyles, localPlaceholders, density, resourceLoader), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        ParagraphStyle paragraphStyle3;
        TextDirection m4369getTextDirectionmmuk1to = paragraphStyle.m4369getTextDirectionmmuk1to();
        if (m4369getTextDirectionmmuk1to == null) {
            paragraphStyle3 = null;
        } else {
            m4369getTextDirectionmmuk1to.m4711unboximpl();
            paragraphStyle3 = paragraphStyle;
        }
        ParagraphStyle paragraphStyle4 = paragraphStyle3;
        if (paragraphStyle3 == null) {
            paragraphStyle4 = ParagraphStyle.m4365copyElsmlbk$default(paragraphStyle, null, paragraphStyle2.m4369getTextDirectionmmuk1to(), 0L, null, 13, null);
        }
        return paragraphStyle4;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @NotNull
    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }
}
