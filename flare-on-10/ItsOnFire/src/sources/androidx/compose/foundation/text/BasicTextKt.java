package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��V\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n��\u001a{\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ae\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BasicText", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/BasicTextKt.class */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-4YKlhWE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m884BasicText4YKlhWE(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.AnnotatedString r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r18, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r19, int r20, boolean r21, int r22, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m884BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-BpD7jsM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m885BasicTextBpD7jsM(@org.jetbrains.annotations.NotNull final java.lang.String r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r18, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r19, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r20, int r21, boolean r22, int r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m885BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Nullable
            public final Long invoke(@NotNull SaverScope Saver, long j2) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                return SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j2) ? Long.valueOf(j2) : null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l2) {
                return invoke(saverScope, l2.longValue());
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Nullable
            public final Long invoke(long j2) {
                return Long.valueOf(j2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l2) {
                return invoke(l2.longValue());
            }
        });
    }
}
