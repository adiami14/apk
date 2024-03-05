package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;
/* loaded from: ItsOnFire.jar:androidx/core/graphics/BlendModeColorFilterCompat.class */
public class BlendModeColorFilterCompat {

    @RequiresApi(29)
    /* loaded from: ItsOnFire.jar:androidx/core/graphics/BlendModeColorFilterCompat$Api29Impl.class */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static ColorFilter createBlendModeColorFilter(int i2, Object obj) {
            return new BlendModeColorFilter(i2, (BlendMode) obj);
        }
    }

    private BlendModeColorFilterCompat() {
    }

    @Nullable
    public static ColorFilter createBlendModeColorFilterCompat(int i2, @NonNull BlendModeCompat blendModeCompat) {
        Object obtainBlendModeFromCompat = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(blendModeCompat);
        return obtainBlendModeFromCompat != null ? Api29Impl.createBlendModeColorFilter(i2, obtainBlendModeFromCompat) : null;
    }
}
