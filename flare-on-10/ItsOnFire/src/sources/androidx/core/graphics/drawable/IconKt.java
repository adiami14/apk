package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n��\u001a\r\u0010��\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: ItsOnFire.jar:androidx/core/graphics/drawable/IconKt.class */
public final class IconKt {
    @RequiresApi(26)
    @NotNull
    public static final Icon toAdaptiveIcon(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @RequiresApi(26)
    @NotNull
    public static final Icon toIcon(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @RequiresApi(26)
    @NotNull
    public static final Icon toIcon(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        Intrinsics.checkNotNullExpressionValue(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @RequiresApi(26)
    @NotNull
    public static final Icon toIcon(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        Intrinsics.checkNotNullExpressionValue(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}