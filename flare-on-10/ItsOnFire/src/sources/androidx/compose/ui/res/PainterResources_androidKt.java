package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��0\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a)\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bR\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��¨\u0006\u0010"}, d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/res/PainterResources_androidKt.class */
public final class PainterResources_androidKt {
    @NotNull
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    private static final ImageBitmap loadImageBitmapResource(Resources resources, int i2) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i2);
        } catch (Throwable th) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(-995791636);
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        ImageVectorCache.ImageVectorEntry imageVectorEntry2 = imageVectorEntry;
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i2);
            Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
            if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntry2 = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml);
            imageVectorCache.set(key, imageVectorEntry2);
        }
        ImageVector imageVector = imageVectorEntry2.getImageVector();
        composer.endReplaceableGroup();
        return imageVector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x010e, code lost:
        if (r0 == r0.getEmpty()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
        if (r0 == true) goto L7;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.painter.Painter painterResource(@androidx.annotation.DrawableRes int r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.PainterResources_androidKt.painterResource(int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.painter.Painter");
    }
}
