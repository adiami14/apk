package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018��*\b\b��\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028��2\u0006\u0010\u0014\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00028��2\u0006\u0010\u0013\u001a\u00028��2\u0006\u0010\u0014\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00028��2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028��2\u0006\u0010\u0014\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u00028��2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028��2\u0006\u0010\u0014\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00028��X\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00028��X\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0010\u001a\u00028��X\u0082.¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "floatDecaySpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getFloatDecaySpec", "()Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "targetVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/VectorizedFloatDecaySpec.class */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    @NotNull
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
        this.absVelocityThreshold = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v2 = this.velocityVector;
        V v3 = v2;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        long j2 = 0;
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            j2 = Math.max(j2, this.floatDecaySpec.getDurationNanos(initialValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        return j2;
    }

    @NotNull
    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public V getTargetValue(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v2 = this.targetVector;
        V v3 = v2;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v4 = this.targetVector;
            V v5 = v4;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.floatDecaySpec.getTargetValue(initialValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v6 = this.targetVector;
        if (v6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v6 = null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public V getValueFromNanos(long j2, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v2 = this.valueVector;
        V v3 = v2;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v4 = this.valueVector;
            V v5 = v4;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.floatDecaySpec.getValueFromNanos(j2, initialValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v6 = this.valueVector;
        if (v6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v6 = null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long j2, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v2 = this.velocityVector;
        V v3 = v2;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v4 = this.velocityVector;
            V v5 = v4;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.floatDecaySpec.getVelocityFromNanos(j2, initialValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v6 = this.velocityVector;
        if (v6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v6 = null;
        }
        return v6;
    }
}
