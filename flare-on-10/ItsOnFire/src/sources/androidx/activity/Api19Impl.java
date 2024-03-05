package androidx.activity;

import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\bÁ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/Api19Impl;", "", "()V", "isAttachedToWindow", "", "view", "Landroid/view/View;", "activity-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(19)
/* loaded from: ItsOnFire.jar:androidx/activity/Api19Impl.class */
public final class Api19Impl {
    @NotNull
    public static final Api19Impl INSTANCE = new Api19Impl();

    private Api19Impl() {
    }

    public final boolean isAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.isAttachedToWindow();
    }
}
