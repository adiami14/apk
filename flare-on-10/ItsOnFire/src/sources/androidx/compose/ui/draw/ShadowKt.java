package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/ShadowKt.class */
public final class ShadowKt {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r12 != false) goto L8;
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    /* renamed from: shadow-ziNgDLE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier m2084shadowziNgDLE(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r9, final float r10, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.Shape r11, final boolean r12) {
        /*
            r0 = r9
            java.lang.String r1 = "$this$shadow"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r11
            java.lang.String r1 = "shape"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r10
            r1 = 0
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m4785constructorimpl(r1)
            int r0 = androidx.compose.ui.unit.Dp.m4784compareTo0680j_4(r0, r1)
            if (r0 > 0) goto L1f
            r0 = r9
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L51
        L1f:
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L34
            androidx.compose.ui.draw.ShadowKt$shadow_ziNgDLE$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.ui.draw.ShadowKt$shadow_ziNgDLE$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>()
            r13 = r0
            goto L39
        L34:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()
            r13 = r0
        L39:
            r0 = r9
            r1 = r13
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.draw.ShadowKt$shadow$2$1 r3 = new androidx.compose.ui.draw.ShadowKt$shadow$2$1
            r4 = r3
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r2, r3)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.platform.InspectableValueKt.inspectableWrapper(r0, r1, r2)
            r13 = r0
        L51:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.ShadowKt.m2084shadowziNgDLE(androidx.compose.ui.Modifier, float, androidx.compose.ui.graphics.Shape, boolean):androidx.compose.ui.Modifier");
    }

    /* renamed from: shadow-ziNgDLE$default  reason: not valid java name */
    public static /* synthetic */ Modifier m2085shadowziNgDLE$default(Modifier modifier, float f2, Shape shape, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            z = false;
            if (Dp.m4784compareTo0680j_4(f2, Dp.m4785constructorimpl(0)) > 0) {
                z = true;
            }
        }
        return m2084shadowziNgDLE(modifier, f2, shape, z);
    }
}
