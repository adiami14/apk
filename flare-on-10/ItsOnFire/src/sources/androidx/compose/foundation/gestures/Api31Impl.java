package androidx.compose.foundation.gestures;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0005\bÃ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J \u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/Api31Impl;", "", "()V", "create", "Landroid/widget/EdgeEffect;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "getDistance", "", "edgeEffect", "onPullDistance", "deltaDistance", "displacement", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(31)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/Api31Impl.class */
final class Api31Impl {
    @NotNull
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    @DoNotInline
    @NotNull
    public final EdgeEffect create(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        EdgeEffect edgeEffect;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            edgeEffect = new EdgeEffect(context, attributeSet);
        } catch (Throwable th) {
            edgeEffect = new EdgeEffect(context);
        }
        return edgeEffect;
    }

    @DoNotInline
    public final float getDistance(@NotNull EdgeEffect edgeEffect) {
        float f2;
        float distance;
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            distance = edgeEffect.getDistance();
            f2 = distance;
        } catch (Throwable th) {
            f2 = 0.0f;
        }
        return f2;
    }

    @DoNotInline
    public final float onPullDistance(@NotNull EdgeEffect edgeEffect, float f2, float f3) {
        float f4;
        float onPullDistance;
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            onPullDistance = edgeEffect.onPullDistance(f2, f3);
            f4 = onPullDistance;
        } catch (Throwable th) {
            edgeEffect.onPull(f2, f3);
            f4 = 0.0f;
        }
        return f4;
    }
}
