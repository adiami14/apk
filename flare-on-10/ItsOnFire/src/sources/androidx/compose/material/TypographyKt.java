package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001a\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u001a\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "Landroidx/compose/ui/text/TextStyle;", "default", "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TypographyKt.class */
public final class TypographyKt {
    @NotNull
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    });

    public static final /* synthetic */ TextStyle access$withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return withDefaultFontFamily(textStyle, fontFamily);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        if (textStyle.getFontFamily() == null) {
            textStyle = TextStyle.m4484copyHL5avdY$default(textStyle, 0L, 0L, null, null, null, fontFamily, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262111, null);
        }
        return textStyle;
    }
}
