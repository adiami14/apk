package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0082\b\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "(FF)V", "getDensity", "()F", "getFontScale", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/DensityImpl.class */
public final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f2, float f3) {
        this.density = f2;
        this.fontScale = f3;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = densityImpl.getDensity();
        }
        if ((i2 & 2) != 0) {
            f3 = densityImpl.getFontScale();
        }
        return densityImpl.copy(f2, f3);
    }

    public final float component1() {
        return getDensity();
    }

    public final float component2() {
        return getFontScale();
    }

    @NotNull
    public final DensityImpl copy(float f2, float f3) {
        return new DensityImpl(f2, f3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DensityImpl) {
            DensityImpl densityImpl = (DensityImpl) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(getDensity()), (Object) Float.valueOf(densityImpl.getDensity())) && Intrinsics.areEqual((Object) Float.valueOf(getFontScale()), (Object) Float.valueOf(densityImpl.getFontScale()));
        }
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo517roundToPxR2X_6o(long j2) {
        return Density.DefaultImpls.m4770roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo518roundToPx0680j_4(float f2) {
        return Density.DefaultImpls.m4771roundToPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo519toDpGaN1DYA(long j2) {
        return Density.DefaultImpls.m4772toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo520toDpu2uoSUM(float f2) {
        return Density.DefaultImpls.m4773toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo521toDpu2uoSUM(int i2) {
        return Density.DefaultImpls.m4774toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo522toDpSizekrfVVM(long j2) {
        return Density.DefaultImpls.m4775toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo523toPxR2X_6o(long j2) {
        return Density.DefaultImpls.m4776toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo524toPx0680j_4(float f2) {
        return Density.DefaultImpls.m4777toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return Density.DefaultImpls.toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo525toSizeXkaWNTQ(long j2) {
        return Density.DefaultImpls.m4778toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo526toSp0xMU5do(float f2) {
        return Density.DefaultImpls.m4779toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo527toSpkPz2Gy4(float f2) {
        return Density.DefaultImpls.m4780toSpkPz2Gy4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo528toSpkPz2Gy4(int i2) {
        return Density.DefaultImpls.m4781toSpkPz2Gy4((Density) this, i2);
    }

    @NotNull
    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + getFontScale() + ')';
    }
}
