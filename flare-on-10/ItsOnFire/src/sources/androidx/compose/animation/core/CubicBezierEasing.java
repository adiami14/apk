package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
@Immutable
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018��2\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "a", "", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(FFFF)V", "equals", "", "other", "", "evaluateCubic", "m", "hashCode", "", "transform", "fraction", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/CubicBezierEasing.class */
public final class CubicBezierEasing implements Easing {

    /* renamed from: a  reason: collision with root package name */
    private final float f30a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31b;

    /* renamed from: c  reason: collision with root package name */
    private final float f32c;

    /* renamed from: d  reason: collision with root package name */
    private final float f33d;

    public CubicBezierEasing(float f2, float f3, float f4, float f5) {
        this.f30a = f2;
        this.f31b = f3;
        this.f32c = f4;
        this.f33d = f5;
    }

    private final float evaluateCubic(float f2, float f3, float f4) {
        float f5 = 3;
        float f6 = 1 - f4;
        return (f2 * f5 * f6 * f6 * f4) + (f5 * f3 * f6 * f4 * f4) + (f4 * f4 * f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        if ((r3.f33d == r0.f33d) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof androidx.compose.animation.core.CubicBezierEasing
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L7f
            r0 = r3
            float r0 = r0.f30a
            r7 = r0
            r0 = r4
            androidx.compose.animation.core.CubicBezierEasing r0 = (androidx.compose.animation.core.CubicBezierEasing) r0
            r4 = r0
            r0 = r7
            r1 = r4
            float r1 = r1.f30a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L26
            r0 = 1
            r8 = r0
            goto L29
        L26:
            r0 = 0
            r8 = r0
        L29:
            r0 = r8
            if (r0 == 0) goto L7f
            r0 = r3
            float r0 = r0.f31b
            r1 = r4
            float r1 = r1.f31b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 1
            r8 = r0
            goto L43
        L40:
            r0 = 0
            r8 = r0
        L43:
            r0 = r8
            if (r0 == 0) goto L7f
            r0 = r3
            float r0 = r0.f32c
            r1 = r4
            float r1 = r1.f32c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = 1
            r8 = r0
            goto L5d
        L5a:
            r0 = 0
            r8 = r0
        L5d:
            r0 = r8
            if (r0 == 0) goto L7f
            r0 = r3
            float r0 = r0.f33d
            r1 = r4
            float r1 = r1.f33d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L74
            r0 = 1
            r8 = r0
            goto L77
        L74:
            r0 = 0
            r8 = r0
        L77:
            r0 = r8
            if (r0 == 0) goto L7f
            goto L81
        L7f:
            r0 = 0
            r6 = r0
        L81:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.CubicBezierEasing.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f30a) * 31) + Float.hashCode(this.f31b)) * 31) + Float.hashCode(this.f32c)) * 31) + Float.hashCode(this.f33d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f2) {
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            float f4 = 1.0f;
            if (f2 < 1.0f) {
                while (true) {
                    float f5 = (f3 + f4) / 2;
                    float evaluateCubic = evaluateCubic(this.f30a, this.f32c, f5);
                    if (Math.abs(f2 - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.f31b, this.f33d, f5);
                    }
                    if (evaluateCubic < f2) {
                        f3 = f5;
                    } else {
                        f4 = f5;
                    }
                }
            }
        }
        return f2;
    }
}
