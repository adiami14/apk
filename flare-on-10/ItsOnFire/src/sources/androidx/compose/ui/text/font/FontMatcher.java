package androidx.compose.ui.text.font;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0010\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ3\u0010\u0003\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "fontList", "", "(Ljava/lang/Iterable;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/font/FontMatcher.class */
public class FontMatcher {
    @NotNull
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public Font m4523matchFontRetOiIg(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int i2) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return m4524matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i2);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @NotNull
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public Font m4524matchFontRetOiIg(@NotNull FontListFontFamily fontFamily, @NotNull FontWeight fontWeight, int i2) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m4525matchFontRetOiIg(fontFamily.getFonts(), fontWeight, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06cc  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.text.font.Font m4525matchFontRetOiIg(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends androidx.compose.ui.text.font.Font> r5, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.FontWeight r6, int r7) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontMatcher.m4525matchFontRetOiIg(java.lang.Iterable, androidx.compose.ui.text.font.FontWeight, int):androidx.compose.ui.text.font.Font");
    }
}
