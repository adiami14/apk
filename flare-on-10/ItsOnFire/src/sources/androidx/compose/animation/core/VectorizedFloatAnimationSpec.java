package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018��*\b\b��\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b��\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028��2\u0006\u0010\u0011\u001a\u00028��2\u0006\u0010\u0012\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00028��2\u0006\u0010\u0010\u001a\u00028��2\u0006\u0010\u0011\u001a\u00028��2\u0006\u0010\u0012\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00028��2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028��2\u0006\u0010\u0011\u001a\u00028��2\u0006\u0010\u0012\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028��2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028��2\u0006\u0010\u0011\u001a\u00028��2\u0006\u0010\u0012\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\n\u001a\u00028��X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00028��X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u00028��X\u0082.¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "anim", "Landroidx/compose/animation/core/FloatAnimationSpec;", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "anims", "Landroidx/compose/animation/core/Animations;", "(Landroidx/compose/animation/core/Animations;)V", "endVelocityVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/VectorizedFloatAnimationSpec.class */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    @NotNull
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(@NotNull Animations anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.anims = anims;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(@NotNull final FloatAnimationSpec anim) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            @NotNull
            public FloatAnimationSpec get(int i2) {
                return FloatAnimationSpec.this;
            }
        });
        Intrinsics.checkNotNullParameter(anim, "anim");
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Iterator<Integer> it = RangesKt.until(0, initialValue.getSize$animation_core_release()).iterator();
        long j2 = 0;
        while (true) {
            long j3 = j2;
            if (!it.hasNext()) {
                return j3;
            }
            int nextInt = ((IntIterator) it).nextInt();
            j2 = Math.max(j3, this.anims.get(nextInt).getDurationNanos(initialValue.get$animation_core_release(nextInt), targetValue.get$animation_core_release(nextInt), initialVelocity.get$animation_core_release(nextInt)));
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getEndVelocity(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v2 = this.endVelocityVector;
        V v3 = v2;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v4 = this.endVelocityVector;
            V v5 = v4;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.anims.get(i2).getEndVelocity(initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v6 = this.endVelocityVector;
        if (v6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v6 = null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long j2, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
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
            v5.set$animation_core_release(i2, this.anims.get(i2).getValueFromNanos(j2, initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v6 = this.valueVector;
        if (v6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v6 = null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long j2, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
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
            v5.set$animation_core_release(i2, this.anims.get(i2).getVelocityFromNanos(j2, initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v6 = this.velocityVector;
        if (v6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v6 = null;
        }
        return v6;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return VectorizedFiniteAnimationSpec.DefaultImpls.isInfinite(this);
    }
}
