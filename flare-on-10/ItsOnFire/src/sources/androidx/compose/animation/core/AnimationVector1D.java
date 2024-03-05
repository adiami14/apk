package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0090\u0002¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\r\u0010\u0016\u001a\u00020��H\u0010¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0019H\u0010¢\u0006\u0002\b\u001aJ\u001e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0090\u0002¢\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0090D¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "initVal", "", "(F)V", "size", "", "getSize$animation_core_release", "()I", "<set-?>", "value", "getValue", "()F", "setValue$animation_core_release", "equals", "", "other", "", "get", FirebaseAnalytics.Param.INDEX, "get$animation_core_release", "hashCode", "newVector", "newVector$animation_core_release", "reset", "", "reset$animation_core_release", "set", "set$animation_core_release", "toString", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/AnimationVector1D.class */
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f2) {
        super(null);
        this.value = f2;
        this.size = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if ((((androidx.compose.animation.core.AnimationVector1D) r4).value == r3.value) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof androidx.compose.animation.core.AnimationVector1D
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L2b
            r0 = r4
            androidx.compose.animation.core.AnimationVector1D r0 = (androidx.compose.animation.core.AnimationVector1D) r0
            float r0 = r0.value
            r1 = r3
            float r1 = r1.value
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            r0 = 1
            r7 = r0
            goto L23
        L20:
            r0 = 0
            r7 = r0
        L23:
            r0 = r7
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = 0
            r6 = r0
        L2d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimationVector1D.equals(java.lang.Object):boolean");
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i2) {
        if (i2 == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @NotNull
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i2, float f2) {
        if (i2 == 0) {
            this.value = f2;
        }
    }

    public final void setValue$animation_core_release(float f2) {
        this.value = f2;
    }

    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("AnimationVector1D: value = ", Float.valueOf(this.value));
    }
}
