package f;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import f.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lf/c;", "", "Landroid/content/Context;", "context", "", "param", "Landroid/app/PendingIntent;", "a", "<init>", "()V", "app_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:f/c.class */
public final class c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final c f362a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final int f363b = 0;

    @Nullable
    public final PendingIntent a(@NotNull Context context, @NotNull String param) {
        String string;
        int i2;
        b bVar;
        int i3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(param, "param");
        Intent intent = new Intent();
        if (!Intrinsics.areEqual(param, context.getString(d.e.w))) {
            if (Intrinsics.areEqual(param, context.getString(d.e.K))) {
                bVar = b.f360a;
                i3 = 2131558402;
            } else if (Intrinsics.areEqual(param, context.getString(d.e.O))) {
                bVar = b.f360a;
                i3 = 2131558401;
            } else if (Intrinsics.areEqual(param, context.getString(d.e.L))) {
                intent.setAction(context.getString(d.e.f385f));
                i2 = 2131624035;
            } else if (!Intrinsics.areEqual(param, context.getString(d.e.f390k))) {
                if (Intrinsics.areEqual(param, context.getString(d.e.H)) || Intrinsics.areEqual(param, context.getString(d.e.I))) {
                    intent.setAction(context.getString(d.e.f385f));
                    string = context.getString(d.e.J);
                    intent.setData(Uri.parse(string));
                }
                return PendingIntent.getActivity(context, 100, intent, 201326592);
            } else {
                intent.setAction(context.getString(d.e.f385f));
                i2 = 2131623998;
            }
            return PendingIntent.getActivity(context, 100, bVar.f(context, i3), 201326592);
        }
        intent.setAction(context.getString(d.e.f380a));
        i2 = 2131624013;
        string = context.getString(i2);
        intent.setData(Uri.parse(string));
        return PendingIntent.getActivity(context, 100, intent, 201326592);
    }
}
