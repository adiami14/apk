package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/vectordrawable/graphics/drawable/ArgbEvaluator.class */
public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f2, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f3 = ((intValue >> 24) & 255) / 255.0f;
        float f4 = ((intValue >> 16) & 255) / 255.0f;
        float f5 = ((intValue >> 8) & 255) / 255.0f;
        float f6 = (intValue & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f7 = ((intValue2 >> 24) & 255) / 255.0f;
        float f8 = ((intValue2 >> 16) & 255) / 255.0f;
        float f9 = ((intValue2 >> 8) & 255) / 255.0f;
        float f10 = (intValue2 & 255) / 255.0f;
        float pow = (float) Math.pow(f4, 2.2d);
        float pow2 = (float) Math.pow(f5, 2.2d);
        float pow3 = (float) Math.pow(f6, 2.2d);
        float pow4 = (float) Math.pow(f8, 2.2d);
        float pow5 = (float) Math.pow(f9, 2.2d);
        float pow6 = (float) Math.pow(f10, 2.2d);
        float pow7 = (float) Math.pow(pow + ((pow4 - pow) * f2), 0.45454545454545453d);
        float pow8 = (float) Math.pow(pow2 + ((pow5 - pow2) * f2), 0.45454545454545453d);
        float pow9 = (float) Math.pow(pow3 + (f2 * (pow6 - pow3)), 0.45454545454545453d);
        int round = Math.round((f3 + ((f7 - f3) * f2)) * 255.0f);
        return Integer.valueOf(Math.round(pow9 * 255.0f) | (Math.round(pow7 * 255.0f) << 16) | (round << 24) | (Math.round(pow8 * 255.0f) << 8));
    }
}
