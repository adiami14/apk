package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "()V", "BlendModeColorFilter", "Landroid/graphics/BlendModeColorFilter;", "color", "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "BlendModeColorFilter-xETnrds", "(JI)Landroid/graphics/BlendModeColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@RequiresApi(29)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/BlendModeColorFilterHelper.class */
public final class BlendModeColorFilterHelper {
    @NotNull
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    @DoNotInline
    @NotNull
    /* renamed from: BlendModeColorFilter-xETnrds  reason: not valid java name */
    public final BlendModeColorFilter m2361BlendModeColorFilterxETnrds(long j2, int i2) {
        return new BlendModeColorFilter(ColorKt.m2470toArgb8_81llA(j2), AndroidBlendMode_androidKt.m2262toAndroidBlendModes9anfk8(i2));
    }
}
