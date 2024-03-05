package androidx.compose.animation.core;

import kotlin.Metadata;
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n\u0002\b\u0003\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH��ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n��R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/SpringSimulation.class */
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f2) {
        this.finalPosition = f2;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f2 = this.dampingRatio;
        double d2 = f2 * f2;
        if (f2 > 1.0f) {
            double d3 = -f2;
            double d4 = this.naturalFreq;
            double d5 = d2 - 1;
            this.gammaPlus = (d3 * d4) + (d4 * Math.sqrt(d5));
            double d6 = -this.dampingRatio;
            double d7 = this.naturalFreq;
            this.gammaMinus = (d6 * d7) - (d7 * Math.sqrt(d5));
        } else if (f2 >= 0.0f && f2 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d2);
        }
        this.initialized = true;
    }

    public final float getAcceleration(float f2, float f3) {
        float f4 = this.finalPosition;
        double d2 = this.naturalFreq;
        return (float) (((-(d2 * d2)) * (f2 - f4)) - (((d2 * 2.0d) * this.dampingRatio) * f3));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d2 = this.naturalFreq;
        return (float) (d2 * d2);
    }

    public final void setDampingRatio(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f2;
        this.initialized = false;
    }

    public final void setFinalPosition(float f2) {
        this.finalPosition = f2;
    }

    public final void setStiffness(float f2) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f2);
        this.initialized = false;
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release  reason: not valid java name */
    public final long m273updateValuesIJZedt4$animation_core_release(float f2, float f3, long j2) {
        double exp;
        float f4;
        double cos;
        init();
        float f5 = f2 - this.finalPosition;
        double d2 = j2 / 1000.0d;
        float f6 = this.dampingRatio;
        if (f6 > 1.0f) {
            double d3 = f5;
            double d4 = this.gammaMinus;
            double d5 = f3;
            double d6 = this.gammaPlus;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            exp = (Math.exp(d4 * d2) * d7) + (Math.exp(this.gammaPlus * d2) * d8);
            double d9 = this.gammaMinus;
            double exp2 = Math.exp(d9 * d2);
            double d10 = this.gammaPlus;
            cos = (d7 * d9 * exp2) + (d8 * d10 * Math.exp(d10 * d2));
        } else {
            if (f6 == 1.0f) {
                double d11 = this.naturalFreq;
                double d12 = f5;
                double d13 = f3 + (d11 * d12);
                double d14 = d12 + (d13 * d2);
                double exp3 = Math.exp((-d11) * d2);
                double exp4 = Math.exp((-this.naturalFreq) * d2);
                double d15 = this.naturalFreq;
                cos = (d14 * exp4 * (-d15)) + (d13 * Math.exp((-d15) * d2));
                exp = exp3 * d14;
            } else {
                double d16 = 1 / this.dampedFreq;
                double d17 = f6;
                double d18 = this.naturalFreq;
                double d19 = f5;
                double d20 = d16 * ((d17 * d18 * d19) + f3);
                exp = Math.exp((-f6) * d18 * d2) * ((Math.cos(this.dampedFreq * d2) * d19) + (Math.sin(this.dampedFreq * d2) * d20));
                double d21 = this.naturalFreq;
                double d22 = -d21;
                double d23 = this.dampingRatio;
                double exp5 = Math.exp((-f4) * d21 * d2);
                double d24 = this.dampedFreq;
                double d25 = -d24;
                double sin = Math.sin(d24 * d2);
                double d26 = this.dampedFreq;
                cos = (d22 * exp * d23) + (exp5 * ((d25 * d19 * sin) + (d20 * d26 * Math.cos(d26 * d2))));
            }
        }
        return SpringSimulationKt.Motion((float) (exp + this.finalPosition), (float) cos);
    }
}
