package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\bÁ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WrapperVerificationHelperMethods;", "", "()V", "attributeSourceResourceMap", "", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(29)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/WrapperVerificationHelperMethods.class */
public final class WrapperVerificationHelperMethods {
    @NotNull
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(29)
    @NotNull
    public final Map<Integer, Integer> attributeSourceResourceMap(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        Intrinsics.checkNotNullExpressionValue(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
