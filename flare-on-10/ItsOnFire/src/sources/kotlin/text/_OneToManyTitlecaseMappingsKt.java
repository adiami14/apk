package kotlin.text;

import androidx.appcompat.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\f\n��\n\u0002\u0010\u000e\n\u0002\u0010\f\n��\u001a\f\u0010��\u001a\u00020\u0001*\u00020\u0002H��¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/text/_OneToManyTitlecaseMappingsKt.class */
public final class _OneToManyTitlecaseMappingsKt {
    @NotNull
    public static final String titlecaseImpl(char c2) {
        String valueOf = String.valueOf(c2);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c2 != 329) {
                char charAt = upperCase.charAt(0);
                Intrinsics.checkNotNull(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                upperCase = charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c2));
    }
}
