package androidx.core.location;

import android.location.Location;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010��\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n¨\u0006\u0004"}, d2 = {"component1", "", "Landroid/location/Location;", "component2", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/core/location/LocationKt.class */
public final class LocationKt {
    public static final double component1(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLongitude();
    }
}
