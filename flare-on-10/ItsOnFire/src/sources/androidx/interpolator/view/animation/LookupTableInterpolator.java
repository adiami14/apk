package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
/* loaded from: ItsOnFire.jar:androidx/interpolator/view/animation/LookupTableInterpolator.class */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float[] fArr;
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((fArr.length - 1) * f2), this.mValues.length - 2);
        float f3 = min;
        float f4 = this.mStepSize;
        float f5 = (f2 - (f3 * f4)) / f4;
        float[] fArr2 = this.mValues;
        float f6 = fArr2[min];
        return f6 + (f5 * (fArr2[min + 1] - f6));
    }
}
