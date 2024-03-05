package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010��\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"setFrom", "", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidMatrixConversions_androidKt.class */
public final class AndroidMatrixConversions_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* renamed from: setFrom-EL8BTi8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2285setFromEL8BTi8(@org.jetbrains.annotations.NotNull android.graphics.Matrix r4, @org.jetbrains.annotations.NotNull float[] r5) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m2285setFromEL8BTi8(android.graphics.Matrix, float[]):void");
    }

    /* renamed from: setFrom-tU-YjHk  reason: not valid java name */
    public static final void m2286setFromtUYjHk(@NotNull float[] setFrom, @NotNull android.graphics.Matrix matrix) {
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(setFrom);
        float f2 = setFrom[0];
        float f3 = setFrom[1];
        float f4 = setFrom[2];
        float f5 = setFrom[3];
        float f6 = setFrom[4];
        float f7 = setFrom[5];
        float f8 = setFrom[6];
        float f9 = setFrom[7];
        float f10 = setFrom[8];
        setFrom[0] = f2;
        setFrom[1] = f5;
        setFrom[2] = 0.0f;
        setFrom[3] = f8;
        setFrom[4] = f3;
        setFrom[5] = f6;
        setFrom[6] = 0.0f;
        setFrom[7] = f9;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f4;
        setFrom[13] = f7;
        setFrom[14] = 0.0f;
        setFrom[15] = f10;
    }
}
