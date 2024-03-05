package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(d1 = {"��\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010��\u001a\u0004\u0018\u0001H\u0001\"\u0006\b��\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"findOwner", "T", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "activity-compose_release"}, k = 2, mv = {1, 5, 1}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/activity/compose/ActivityComposeUtilsKt.class */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        while (context instanceof ContextWrapper) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (context instanceof Object) {
                return (T) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "innerContext.baseContext");
        }
        return null;
    }
}
