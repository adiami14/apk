package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.VertexMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010��\u001a\u00020\u0001*\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"toAndroidVertexMode", "Landroid/graphics/Canvas$VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidVertexMode_androidKt.class */
public final class AndroidVertexMode_androidKt {
    @NotNull
    /* renamed from: toAndroidVertexMode-JOOmi9M  reason: not valid java name */
    public static final Canvas.VertexMode m2320toAndroidVertexModeJOOmi9M(int i2) {
        Canvas.VertexMode vertexMode;
        VertexMode.Companion companion = VertexMode.Companion;
        if (!VertexMode.m2758equalsimpl0(i2, companion.m2764getTrianglesc2xauaI())) {
            if (VertexMode.m2758equalsimpl0(i2, companion.m2763getTriangleStripc2xauaI())) {
                vertexMode = Canvas.VertexMode.TRIANGLE_STRIP;
            } else if (VertexMode.m2758equalsimpl0(i2, companion.m2762getTriangleFanc2xauaI())) {
                vertexMode = Canvas.VertexMode.TRIANGLE_FAN;
            }
            return vertexMode;
        }
        vertexMode = Canvas.VertexMode.TRIANGLES;
        return vertexMode;
    }
}
