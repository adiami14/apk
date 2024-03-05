package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010��\u001a\u00020\u0001*\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0002*\u00020\u0006ø\u0001��¢\u0006\u0002\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidTileMode_androidKt.class */
public final class AndroidTileMode_androidKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/AndroidTileMode_androidKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0  reason: not valid java name */
    public static final boolean m2317isSupported0vamqd0(int i2) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m2729equalsimpl0(i2, TileMode.Companion.m2734getDecal3opZhB0());
    }

    @NotNull
    /* renamed from: toAndroidTileMode-0vamqd0  reason: not valid java name */
    public static final Shader.TileMode m2318toAndroidTileMode0vamqd0(int i2) {
        Shader.TileMode frameworkTileModeDecal;
        TileMode.Companion companion = TileMode.Companion;
        if (!TileMode.m2729equalsimpl0(i2, companion.m2733getClamp3opZhB0())) {
            if (TileMode.m2729equalsimpl0(i2, companion.m2736getRepeated3opZhB0())) {
                frameworkTileModeDecal = Shader.TileMode.REPEAT;
            } else if (TileMode.m2729equalsimpl0(i2, companion.m2735getMirror3opZhB0())) {
                frameworkTileModeDecal = Shader.TileMode.MIRROR;
            } else if (TileMode.m2729equalsimpl0(i2, companion.m2734getDecal3opZhB0()) && Build.VERSION.SDK_INT >= 31) {
                frameworkTileModeDecal = TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return frameworkTileModeDecal;
        }
        frameworkTileModeDecal = Shader.TileMode.CLAMP;
        return frameworkTileModeDecal;
    }

    public static final int toComposeTileMode(@NotNull Shader.TileMode tileMode) {
        int m2733getClamp3opZhB0;
        Intrinsics.checkNotNullParameter(tileMode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                m2733getClamp3opZhB0 = TileMode.Companion.m2735getMirror3opZhB0();
            } else if (i2 == 3) {
                m2733getClamp3opZhB0 = TileMode.Companion.m2736getRepeated3opZhB0();
            } else if (Build.VERSION.SDK_INT >= 31 && tileMode == Shader.TileMode.DECAL) {
                m2733getClamp3opZhB0 = TileModeVerificationHelper.INSTANCE.m2738getComposeTileModeDecal3opZhB0();
            }
            return m2733getClamp3opZhB0;
        }
        m2733getClamp3opZhB0 = TileMode.Companion.m2733getClamp3opZhB0();
        return m2733getClamp3opZhB0;
    }
}
