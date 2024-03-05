package androidx.compose.ui.text.platform;

import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��H\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH��\u001a+\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H��ø\u0001��ø\u0001\u0001¢\u0006\u0002\b\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/platform/AndroidParagraphIntrinsics_androidKt.class */
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, new TypefaceAdapter(null, resourceLoader, 1, null), density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r0 == 1) goto L12;
     */
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m4638resolveTextDirectionHeuristics9GRLPo0(@org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDirection r4, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.intl.LocaleList r5) {
        /*
            r0 = r4
            if (r0 != 0) goto Le
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r0 = r0.m4712getContents_7Xco()
            r6 = r0
            goto L13
        Le:
            r0 = r4
            int r0 = r0.m4711unboximpl()
            r6 = r0
        L13:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            r4 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.m4713getContentOrLtrs_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m4708equalsimpl0(r0, r1)
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L2c
        L27:
            r0 = 2
            r6 = r0
            goto L9b
        L2c:
            r0 = r6
            r1 = r4
            int r1 = r1.m4714getContentOrRtls_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m4708equalsimpl0(r0, r1)
            if (r0 == 0) goto L3c
        L37:
            r0 = 3
            r6 = r0
            goto L9b
        L3c:
            r0 = r6
            r1 = r4
            int r1 = r1.m4715getLtrs_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m4708equalsimpl0(r0, r1)
            if (r0 == 0) goto L4c
            r0 = 0
            r6 = r0
            goto L9b
        L4c:
            r0 = r6
            r1 = r4
            int r1 = r1.m4716getRtls_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m4708equalsimpl0(r0, r1)
            if (r0 == 0) goto L5d
            r0 = r8
            r6 = r0
            goto L9b
        L5d:
            r0 = r6
            r1 = r4
            int r1 = r1.m4712getContents_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m4708equalsimpl0(r0, r1)
            if (r0 == 0) goto L9d
            r0 = r5
            if (r0 != 0) goto L71
            r0 = 0
            r4 = r0
            goto L80
        L71:
            r0 = r5
            r1 = 0
            androidx.compose.ui.text.intl.Locale r0 = r0.get(r1)
            androidx.compose.ui.text.intl.PlatformLocale r0 = r0.getPlatformLocale$ui_text_release()
            androidx.compose.ui.text.intl.AndroidLocale r0 = (androidx.compose.ui.text.intl.AndroidLocale) r0
            java.util.Locale r0 = r0.getJavaLocale()
            r4 = r0
        L80:
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L8a
            java.util.Locale r0 = java.util.Locale.getDefault()
            r5 = r0
        L8a:
            r0 = r5
            int r0 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L27
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L37
            goto L27
        L9b:
            r0 = r6
            return r0
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Invalid TextDirection."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m4638resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0$default  reason: not valid java name */
    public static /* synthetic */ int m4639resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textDirection = null;
        }
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m4638resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
