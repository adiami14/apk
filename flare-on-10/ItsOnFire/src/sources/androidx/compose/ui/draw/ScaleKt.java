package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010��\u001a\u00020\u0002H\u0007\u001a\u001c\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, d2 = {"scale", "Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/draw/ScaleKt.class */
public final class ScaleKt {
    @Stable
    @NotNull
    public static final Modifier scale(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return scale(modifier, f2, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r21 == 1.0f) == false) goto L15;
     */
    @androidx.compose.runtime.Stable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier scale(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r19, float r20, float r21) {
        /*
            r0 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = 1
            r22 = r0
            r0 = r20
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            r0 = 1
            r23 = r0
            goto L17
        L14:
            r0 = 0
            r23 = r0
        L17:
            r0 = r23
            if (r0 == 0) goto L36
            r0 = r21
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            r0 = r22
            r23 = r0
            goto L2b
        L28:
            r0 = 0
            r23 = r0
        L2b:
            r0 = r23
            if (r0 != 0) goto L33
            goto L36
        L33:
            goto L4d
        L36:
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 16380(0x3ffc, float:2.2953E-41)
            r16 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2552graphicsLayer2Xn7asI$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19 = r0
        L4d:
            r0 = r19
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.ScaleKt.scale(androidx.compose.ui.Modifier, float, float):androidx.compose.ui.Modifier");
    }
}
