package androidx.compose.ui.text.font;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n��\u001a\u0010\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a!\u0010��\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010��\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¨\u0006\t"}, d2 = {"FontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "typeface", "Landroidx/compose/ui/text/font/Typeface;", "fonts", "", "Landroidx/compose/ui/text/font/Font;", "([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/font/FontFamilyKt.class */
public final class FontFamilyKt {
    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new LoadedFontFamily(typeface);
    }

    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull List<? extends Font> fonts) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        return new FontListFontFamily(fonts);
    }

    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull Font... fonts) {
        List asList;
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        asList = ArraysKt___ArraysJvmKt.asList(fonts);
        return new FontListFontFamily(asList);
    }
}