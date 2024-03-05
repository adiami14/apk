package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/BlurKt.class */
public final class BlurKt {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r14 != false) goto L8;
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    /* renamed from: blur-1fqS-gw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier m2061blur1fqSgw(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r9, final float r10, final float r11, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.Shape r12) {
        /*
            r0 = r9
            java.lang.String r1 = "$this$blur"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            if (r0 == 0) goto L18
            androidx.compose.ui.graphics.TileMode$Companion r0 = androidx.compose.ui.graphics.TileMode.Companion
            int r0 = r0.m2733getClamp3opZhB0()
            r13 = r0
            r0 = 1
            r14 = r0
            goto L23
        L18:
            androidx.compose.ui.graphics.TileMode$Companion r0 = androidx.compose.ui.graphics.TileMode.Companion
            int r0 = r0.m2734getDecal3opZhB0()
            r13 = r0
            r0 = 0
            r14 = r0
        L23:
            r0 = 0
            float r0 = (float) r0
            r15 = r0
            r0 = r10
            r1 = r15
            float r1 = androidx.compose.ui.unit.Dp.m4785constructorimpl(r1)
            int r0 = androidx.compose.ui.unit.Dp.m4784compareTo0680j_4(r0, r1)
            if (r0 <= 0) goto L3f
            r0 = r11
            r1 = r15
            float r1 = androidx.compose.ui.unit.Dp.m4785constructorimpl(r1)
            int r0 = androidx.compose.ui.unit.Dp.m4784compareTo0680j_4(r0, r1)
            if (r0 > 0) goto L47
        L3f:
            r0 = r9
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L5b
        L47:
            r0 = r9
            androidx.compose.ui.draw.BlurKt$blur$1 r1 = new androidx.compose.ui.draw.BlurKt$blur$1
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r13
            r6 = r12
            r7 = r14
            r2.<init>()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r0, r1)
            r16 = r0
        L5b:
            r0 = r16
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.BlurKt.m2061blur1fqSgw(androidx.compose.ui.Modifier, float, float, androidx.compose.ui.graphics.Shape):androidx.compose.ui.Modifier");
    }

    /* renamed from: blur-1fqS-gw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m2062blur1fqSgw$default(Modifier modifier, float f2, float f3, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2066boximpl(BlurredEdgeTreatment.Companion.m2073getRectangleGoahg());
        }
        return m2061blur1fqSgw(modifier, f2, f3, blurredEdgeTreatment.m2072unboximpl());
    }

    @Stable
    @NotNull
    /* renamed from: blur-F8QBwvs  reason: not valid java name */
    public static final Modifier m2063blurF8QBwvs(@NotNull Modifier blur, float f2, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        return m2061blur1fqSgw(blur, f2, f2, shape);
    }

    /* renamed from: blur-F8QBwvs$default  reason: not valid java name */
    public static /* synthetic */ Modifier m2064blurF8QBwvs$default(Modifier modifier, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2066boximpl(BlurredEdgeTreatment.Companion.m2073getRectangleGoahg());
        }
        return m2063blurF8QBwvs(modifier, f2, blurredEdgeTreatment.m2072unboximpl());
    }
}
