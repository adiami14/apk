package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H��¨\u0006\u0004"}, d2 = {"textFieldMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldMagnifier_androidKt.class */
public final class TextFieldMagnifier_androidKt {
    @NotNull
    public static final Modifier textFieldMagnifier(@NotNull Modifier modifier, @NotNull TextFieldSelectionManager manager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return !MagnifierStyle.Companion.getTextDefault().isSupported() ? Modifier.Companion : TextFieldMagnifierKt.textFieldMagnifierAndroidImpl$default(modifier, manager, new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldMagnifier_androidKt$textFieldMagnifier$1
            @NotNull
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Modifier invoke2(@NotNull final Function0<Offset> center) {
                Intrinsics.checkNotNullParameter(center, "center");
                return MagnifierKt.magnifier$default(Modifier.Companion, new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.TextFieldMagnifier_androidKt$textFieldMagnifier$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Offset invoke(Density density) {
                        return Offset.m2156boximpl(m1007invoketuRUvjQ(density));
                    }

                    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
                    public final long m1007invoketuRUvjQ(@NotNull Density magnifier) {
                        Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
                        return center.invoke().m2177unboximpl();
                    }
                }, null, 0.0f, MagnifierStyle.Companion.getTextDefault(), 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function0) {
                return invoke2((Function0<Offset>) function0);
            }
        }, false, 4, null);
    }
}
