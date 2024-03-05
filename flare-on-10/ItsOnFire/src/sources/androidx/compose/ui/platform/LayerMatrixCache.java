package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b��\u0018��*\u0004\b��\u0010\u00012\u00020\u0002B=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\u0010\u000bJ \u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00028��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00028��ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u0006\u0010\u001b\u001a\u00020\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n��R>\u0010\u0003\u001a2\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n��R\u001b\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000eø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "getMatrix", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "Landroid/graphics/Matrix;", "matrix", "", "(Lkotlin/jvm/functions/Function2;)V", "androidMatrixCache", "inverseMatrixCache", "Landroidx/compose/ui/graphics/Matrix;", "[F", "isDirty", "", "isInverseDirty", "isInverseValid", "matrixCache", "previousAndroidMatrix", "calculateInverseMatrix", "calculateInverseMatrix-bWbORWo", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateMatrix-GrdbGEg", "invalidate", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/LayerMatrixCache.class */
public final class LayerMatrixCache<T> {
    @Nullable
    private Matrix androidMatrixCache;
    @NotNull
    private final Function2<T, Matrix, Unit> getMatrix;
    @Nullable
    private float[] inverseMatrixCache;
    private boolean isDirty;
    private boolean isInverseDirty;
    private boolean isInverseValid;
    @Nullable
    private float[] matrixCache;
    @Nullable
    private Matrix previousAndroidMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(@NotNull Function2<? super T, ? super Matrix, Unit> getMatrix) {
        Intrinsics.checkNotNullParameter(getMatrix, "getMatrix");
        this.getMatrix = getMatrix;
        this.isDirty = true;
        this.isInverseDirty = true;
        this.isInverseValid = true;
    }

    @Nullable
    /* renamed from: calculateInverseMatrix-bWbORWo  reason: not valid java name */
    public final float[] m4230calculateInverseMatrixbWbORWo(T t2) {
        float[] fArr = this.inverseMatrixCache;
        float[] fArr2 = fArr;
        if (fArr == null) {
            fArr2 = androidx.compose.ui.graphics.Matrix.m2589constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr2;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m4228invertToJiSxe2E(m4231calculateMatrixGrdbGEg(t2), fArr2);
            this.isInverseDirty = false;
        }
        float[] fArr3 = null;
        if (this.isInverseValid) {
            fArr3 = fArr2;
        }
        return fArr3;
    }

    @NotNull
    /* renamed from: calculateMatrix-GrdbGEg  reason: not valid java name */
    public final float[] m4231calculateMatrixGrdbGEg(T t2) {
        float[] fArr = this.matrixCache;
        float[] fArr2 = fArr;
        if (fArr == null) {
            fArr2 = androidx.compose.ui.graphics.Matrix.m2589constructorimpl$default(null, 1, null);
            this.matrixCache = fArr2;
        }
        if (this.isDirty) {
            Matrix matrix = this.androidMatrixCache;
            Matrix matrix2 = matrix;
            if (matrix == null) {
                matrix2 = new Matrix();
                this.androidMatrixCache = matrix2;
            }
            this.getMatrix.invoke(t2, matrix2);
            Matrix matrix3 = this.previousAndroidMatrix;
            if (matrix3 == null || !Intrinsics.areEqual(matrix2, matrix3)) {
                AndroidMatrixConversions_androidKt.m2286setFromtUYjHk(fArr2, matrix2);
                this.androidMatrixCache = matrix3;
                this.previousAndroidMatrix = matrix2;
            }
            this.isDirty = false;
            return fArr2;
        }
        return fArr2;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
