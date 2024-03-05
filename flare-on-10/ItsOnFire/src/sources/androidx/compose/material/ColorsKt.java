package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u008b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H��\"\u001a\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001��¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ColorsKt.class */
public final class ColorsKt {
    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Colors invoke() {
            return ColorsKt.m1251lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    });

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m1246contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j2) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        return (Color.m2415equalsimpl0(j2, contentColorFor.m1228getPrimary0d7_KjU()) || Color.m2415equalsimpl0(j2, contentColorFor.m1229getPrimaryVariant0d7_KjU())) ? contentColorFor.m1225getOnPrimary0d7_KjU() : (Color.m2415equalsimpl0(j2, contentColorFor.m1230getSecondary0d7_KjU()) || Color.m2415equalsimpl0(j2, contentColorFor.m1231getSecondaryVariant0d7_KjU())) ? contentColorFor.m1226getOnSecondary0d7_KjU() : Color.m2415equalsimpl0(j2, contentColorFor.m1221getBackground0d7_KjU()) ? contentColorFor.m1223getOnBackground0d7_KjU() : Color.m2415equalsimpl0(j2, contentColorFor.m1232getSurface0d7_KjU()) ? contentColorFor.m1227getOnSurface0d7_KjU() : Color.m2415equalsimpl0(j2, contentColorFor.m1222getError0d7_KjU()) ? contentColorFor.m1224getOnError0d7_KjU() : Color.Companion.m2450getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m1247contentColorForek8zF_U(long j2, @Nullable Composer composer, int i2) {
        long m1246contentColorFor4WTKRHQ = m1246contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j2);
        if (!(m1246contentColorFor4WTKRHQ != Color.Companion.m2450getUnspecified0d7_KjU())) {
            m1246contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2424unboximpl();
        }
        return m1246contentColorFor4WTKRHQ;
    }

    @NotNull
    /* renamed from: darkColors-2qZNXz8  reason: not valid java name */
    public static final Colors m1248darkColors2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m1249darkColors2qZNXz8$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long Color = (i2 & 1) != 0 ? ColorKt.Color(4290479868L) : j2;
        if ((i2 & 2) != 0) {
            j3 = ColorKt.Color(4281794739L);
        }
        long Color2 = (i2 & 4) != 0 ? ColorKt.Color(4278442694L) : j4;
        return m1248darkColors2qZNXz8(Color, j3, Color2, (i2 & 8) != 0 ? Color2 : j5, (i2 & 16) != 0 ? ColorKt.Color(4279374354L) : j6, (i2 & 32) != 0 ? ColorKt.Color(4279374354L) : j7, (i2 & 64) != 0 ? ColorKt.Color(4291782265L) : j8, (i2 & 128) != 0 ? Color.Companion.m2440getBlack0d7_KjU() : j9, (i2 & 256) != 0 ? Color.Companion.m2440getBlack0d7_KjU() : j10, (i2 & 512) != 0 ? Color.Companion.m2451getWhite0d7_KjU() : j11, (i2 & 1024) != 0 ? Color.Companion.m2451getWhite0d7_KjU() : j12, (i2 & 2048) != 0 ? Color.Companion.m2440getBlack0d7_KjU() : j13);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m1228getPrimary0d7_KjU() : colors.m1232getSurface0d7_KjU();
    }

    @NotNull
    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m1250lightColors2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m1251lightColors2qZNXz8$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = ColorKt.Color(4284612846L);
        }
        if ((i2 & 2) != 0) {
            j3 = ColorKt.Color(4281794739L);
        }
        if ((i2 & 4) != 0) {
            j4 = ColorKt.Color(4278442694L);
        }
        if ((i2 & 8) != 0) {
            j5 = ColorKt.Color(4278290310L);
        }
        if ((i2 & 16) != 0) {
            j6 = Color.Companion.m2451getWhite0d7_KjU();
        }
        if ((i2 & 32) != 0) {
            j7 = Color.Companion.m2451getWhite0d7_KjU();
        }
        if ((i2 & 64) != 0) {
            j8 = ColorKt.Color(4289724448L);
        }
        if ((i2 & 128) != 0) {
            j9 = Color.Companion.m2451getWhite0d7_KjU();
        }
        if ((i2 & 256) != 0) {
            j10 = Color.Companion.m2440getBlack0d7_KjU();
        }
        if ((i2 & 512) != 0) {
            j11 = Color.Companion.m2440getBlack0d7_KjU();
        }
        if ((i2 & 1024) != 0) {
            j12 = Color.Companion.m2440getBlack0d7_KjU();
        }
        if ((i2 & 2048) != 0) {
            j13 = Color.Companion.m2451getWhite0d7_KjU();
        }
        return m1250lightColors2qZNXz8(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m1240setPrimary8_81llA$material_release(other.m1228getPrimary0d7_KjU());
        colors.m1241setPrimaryVariant8_81llA$material_release(other.m1229getPrimaryVariant0d7_KjU());
        colors.m1242setSecondary8_81llA$material_release(other.m1230getSecondary0d7_KjU());
        colors.m1243setSecondaryVariant8_81llA$material_release(other.m1231getSecondaryVariant0d7_KjU());
        colors.m1233setBackground8_81llA$material_release(other.m1221getBackground0d7_KjU());
        colors.m1244setSurface8_81llA$material_release(other.m1232getSurface0d7_KjU());
        colors.m1234setError8_81llA$material_release(other.m1222getError0d7_KjU());
        colors.m1237setOnPrimary8_81llA$material_release(other.m1225getOnPrimary0d7_KjU());
        colors.m1238setOnSecondary8_81llA$material_release(other.m1226getOnSecondary0d7_KjU());
        colors.m1235setOnBackground8_81llA$material_release(other.m1223getOnBackground0d7_KjU());
        colors.m1239setOnSurface8_81llA$material_release(other.m1227getOnSurface0d7_KjU());
        colors.m1236setOnError8_81llA$material_release(other.m1224getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
