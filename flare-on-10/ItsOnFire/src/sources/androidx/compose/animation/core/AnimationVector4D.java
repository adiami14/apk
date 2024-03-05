package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\tH\u0090\u0002¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\tH\u0016J\r\u0010\u001f\u001a\u00020��H\u0010¢\u0006\u0002\b J\r\u0010!\u001a\u00020\"H\u0010¢\u0006\u0002\b#J\u001e\u0010$\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0003H\u0090\u0002¢\u0006\u0002\b&J\b\u0010'\u001a\u00020(H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0090D¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "v1", "", "v2", "v3", "v4", "(FFFF)V", "size", "", "getSize$animation_core_release", "()I", "<set-?>", "getV1", "()F", "setV1$animation_core_release", "(F)V", "getV2", "setV2$animation_core_release", "getV3", "setV3$animation_core_release", "getV4", "setV4$animation_core_release", "equals", "", "other", "", "get", FirebaseAnalytics.Param.INDEX, "get$animation_core_release", "hashCode", "newVector", "newVector$animation_core_release", "reset", "", "reset$animation_core_release", "set", "value", "set$animation_core_release", "toString", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/AnimationVector4D.class */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;
    private float v3;
    private float v4;

    public AnimationVector4D(float f2, float f3, float f4, float f5) {
        super(null);
        this.v1 = f2;
        this.v2 = f3;
        this.v3 = f4;
        this.v4 = f5;
        this.size = 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if ((r0.v4 == r3.v4) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof androidx.compose.animation.core.AnimationVector4D
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L7b
            r0 = r4
            androidx.compose.animation.core.AnimationVector4D r0 = (androidx.compose.animation.core.AnimationVector4D) r0
            r4 = r0
            r0 = r4
            float r0 = r0.v1
            r1 = r3
            float r1 = r1.v1
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
            if (r0 == 0) goto L7b
            r0 = r4
            float r0 = r0.v2
            r1 = r3
            float r1 = r1.v2
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
            if (r0 == 0) goto L7b
            r0 = r4
            float r0 = r0.v3
            r1 = r3
            float r1 = r1.v3
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L56
            r0 = 1
            r7 = r0
            goto L59
        L56:
            r0 = 0
            r7 = r0
        L59:
            r0 = r7
            if (r0 == 0) goto L7b
            r0 = r4
            float r0 = r0.v4
            r1 = r3
            float r1 = r1.v4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L70
            r0 = 1
            r7 = r0
            goto L73
        L70:
            r0 = 0
            r7 = r0
        L73:
            r0 = r7
            if (r0 == 0) goto L7b
            goto L7d
        L7b:
            r0 = 0
            r6 = r0
        L7d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimationVector4D.equals(java.lang.Object):boolean");
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0.0f : this.v4 : this.v3 : this.v2 : this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.v1;
    }

    public final float getV2() {
        return this.v2;
    }

    public final float getV3() {
        return this.v3;
    }

    public final float getV4() {
        return this.v4;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3)) * 31) + Float.hashCode(this.v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @NotNull
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i2, float f2) {
        if (i2 == 0) {
            this.v1 = f2;
        } else if (i2 == 1) {
            this.v2 = f2;
        } else if (i2 == 2) {
            this.v3 = f2;
        } else if (i2 != 3) {
        } else {
            this.v4 = f2;
        }
    }

    public final void setV1$animation_core_release(float f2) {
        this.v1 = f2;
    }

    public final void setV2$animation_core_release(float f2) {
        this.v2 = f2;
    }

    public final void setV3$animation_core_release(float f2) {
        this.v3 = f2;
    }

    public final void setV4$animation_core_release(float f2) {
        this.v4 = f2;
    }

    @NotNull
    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
