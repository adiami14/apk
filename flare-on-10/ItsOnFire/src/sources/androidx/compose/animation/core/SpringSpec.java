package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��8\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\b\u0007\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018��¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0015\"\b\b\u0001\u0010\u0016*\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u0002H\u00160\u0019H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018��¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)V", "getDampingRatio", "()F", "getStiffness", "getVisibilityThreshold", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "vectorize", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/SpringSpec.class */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    private final float dampingRatio;
    private final float stiffness;
    @Nullable
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public SpringSpec(float f2, float f3, @Nullable T t2) {
        this.dampingRatio = f2;
        this.stiffness = f3;
        this.visibilityThreshold = t2;
    }

    public /* synthetic */ SpringSpec(float f2, float f3, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1500.0f : f3, (i2 & 4) != 0 ? null : obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.visibilityThreshold, r3.visibilityThreshold) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof androidx.compose.animation.core.SpringSpec
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L55
            r0 = r4
            androidx.compose.animation.core.SpringSpec r0 = (androidx.compose.animation.core.SpringSpec) r0
            r4 = r0
            r0 = r4
            float r0 = r0.dampingRatio
            r1 = r3
            float r1 = r1.dampingRatio
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            r0 = 1
            r7 = r0
            goto L25
        L22:
            r0 = 0
            r7 = r0
        L25:
            r0 = r7
            if (r0 == 0) goto L55
            r0 = r4
            float r0 = r0.stiffness
            r1 = r3
            float r1 = r1.stiffness
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            r0 = 1
            r7 = r0
            goto L3f
        L3c:
            r0 = 0
            r7 = r0
        L3f:
            r0 = r7
            if (r0 == 0) goto L55
            r0 = r4
            T r0 = r0.visibilityThreshold
            r1 = r3
            T r1 = r1.visibilityThreshold
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L55
            goto L57
        L55:
            r0 = 0
            r6 = r0
        L57:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringSpec.equals(java.lang.Object):boolean");
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Nullable
    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t2 = this.visibilityThreshold;
        return ((((t2 == null ? 0 : t2.hashCode()) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        AnimationVector convert;
        Intrinsics.checkNotNullParameter(converter, "converter");
        float f2 = this.dampingRatio;
        float f3 = this.stiffness;
        convert = AnimationSpecKt.convert(converter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f2, f3, convert);
    }
}
