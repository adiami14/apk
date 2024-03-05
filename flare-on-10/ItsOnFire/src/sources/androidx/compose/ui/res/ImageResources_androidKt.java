package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001a\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001b\u0010��\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"imageResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "res", "Landroid/content/res/Resources;", "id", "", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/res/ImageResources_androidKt.class */
public final class ImageResources_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a6, code lost:
        if (r0 == r0.getEmpty()) goto L11;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.ImageBitmap imageResource(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.ImageBitmap.Companion r5, @androidx.annotation.DrawableRes int r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r7, int r8) {
        /*
            r0 = r5
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            r1 = 1264738352(0x4b626030, float:1.483576E7)
            r0.startReplaceableGroup(r1)
            r0 = r7
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r0 = r0.consume(r1)
            android.content.Context r0 = (android.content.Context) r0
            r9 = r0
            r0 = r7
            r1 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r7
            java.lang.Object r0 = r0.rememberedValue()
            r10 = r0
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            r11 = r0
            r0 = r10
            r12 = r0
            r0 = r10
            r1 = r11
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L50
            android.util.TypedValue r0 = new android.util.TypedValue
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r7
            r1 = r12
            r0.updateRememberedValue(r1)
        L50:
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r12
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            r12 = r0
            r0 = r9
            android.content.res.Resources r0 = r0.getResources()
            r1 = r6
            r2 = r12
            r3 = 1
            r0.getValue(r1, r2, r3)
            r0 = r12
            java.lang.CharSequence r0 = r0.string
            r12 = r0
            r0 = r12
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0 = r12
            java.lang.String r0 = r0.toString()
            r12 = r0
            r0 = r7
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r7
            r1 = r12
            boolean r0 = r0.changed(r1)
            r13 = r0
            r0 = r7
            java.lang.Object r0 = r0.rememberedValue()
            r10 = r0
            r0 = r13
            if (r0 != 0) goto La9
            r0 = r10
            r12 = r0
            r0 = r10
            r1 = r11
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto Lc8
        La9:
            r0 = r9
            android.content.res.Resources r0 = r0.getResources()
            r12 = r0
            r0 = r12
            java.lang.String r1 = "context.resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r5
            r1 = r12
            r2 = r6
            androidx.compose.ui.graphics.ImageBitmap r0 = imageResource(r0, r1, r2)
            r12 = r0
            r0 = r7
            r1 = r12
            r0.updateRememberedValue(r1)
        Lc8:
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r12
            androidx.compose.ui.graphics.ImageBitmap r0 = (androidx.compose.ui.graphics.ImageBitmap) r0
            r5 = r0
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.ImageResources_androidKt.imageResource(androidx.compose.ui.graphics.ImageBitmap$Companion, int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.ImageBitmap");
    }

    @NotNull
    public static final ImageBitmap imageResource(@NotNull ImageBitmap.Companion companion, @NotNull Resources res, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Drawable drawable = res.getDrawable(i2, null);
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
            return AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
    }
}
