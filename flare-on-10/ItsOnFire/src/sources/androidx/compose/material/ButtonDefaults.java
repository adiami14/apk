package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010.JG\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b1\u00102J3\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b4\u00105J3\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b7\u00105R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n��R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ButtonDefaults.class */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    @NotNull
    private static final PaddingValues ContentPadding;
    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m4785constructorimpl = Dp.m4785constructorimpl(16);
        ButtonHorizontalPadding = m4785constructorimpl;
        float f2 = 8;
        float m4785constructorimpl2 = Dp.m4785constructorimpl(f2);
        ButtonVerticalPadding = m4785constructorimpl2;
        PaddingValues m672PaddingValuesa9UjIt4 = PaddingKt.m672PaddingValuesa9UjIt4(m4785constructorimpl, m4785constructorimpl2, m4785constructorimpl, m4785constructorimpl2);
        ContentPadding = m672PaddingValuesa9UjIt4;
        MinWidth = Dp.m4785constructorimpl(64);
        MinHeight = Dp.m4785constructorimpl(36);
        IconSize = Dp.m4785constructorimpl(18);
        IconSpacing = Dp.m4785constructorimpl(f2);
        OutlinedBorderSize = Dp.m4785constructorimpl(1);
        float m4785constructorimpl3 = Dp.m4785constructorimpl(f2);
        TextButtonHorizontalPadding = m4785constructorimpl3;
        TextButtonContentPadding = PaddingKt.m672PaddingValuesa9UjIt4(m4785constructorimpl3, m672PaddingValuesa9UjIt4.mo688calculateTopPaddingD9Ej5fM(), m4785constructorimpl3, m672PaddingValuesa9UjIt4.mo685calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m1185buttonColorsro_MJ88(long j2, long j3, long j4, long j5, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2063545420);
        if ((i3 & 1) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = ColorsKt.m1247contentColorForek8zF_U(j2, composer, i2 & 14);
        }
        if ((i3 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j4 = ColorKt.m2461compositeOverOWjLjI(Color.m2413copywmQWz5c$default(materialTheme.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1232getSurface0d7_KjU());
        }
        if ((i3 & 8) != 0) {
            j5 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j2, j3, j4, j5, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L28;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: elevation-R_JCAzs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.material.ButtonElevation m1186elevationR_JCAzs(float r10, float r11, float r12, float r13, float r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonDefaults.m1186elevationR_JCAzs(float, float, float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material.ButtonElevation");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* renamed from: elevation-yajeYGU  reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1187elevationyajeYGU(float f2, float f3, float f4, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(399129837);
        if ((i3 & 1) != 0) {
            f2 = Dp.m4785constructorimpl(2);
        }
        if ((i3 & 2) != 0) {
            f3 = Dp.m4785constructorimpl(8);
        }
        if ((i3 & 4) != 0) {
            f4 = Dp.m4785constructorimpl(0);
        }
        float f5 = 4;
        ButtonElevation m1186elevationR_JCAzs = m1186elevationR_JCAzs(f2, f3, f4, Dp.m4785constructorimpl(f5), Dp.m4785constructorimpl(f5), composer, (i2 & 14) | 27648 | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (458752 & (i2 << 6)), 0);
        composer.endReplaceableGroup();
        return m1186elevationR_JCAzs;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m1188getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m1189getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1190getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1191getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1546585730);
        BorderStroke m364BorderStrokecXLIe8U = BorderStrokeKt.m364BorderStrokecXLIe8U(m1192getOutlinedBorderSizeD9Ej5fM(), Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return m364BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m1192getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m1193outlinedButtonColorsRGew2ao(long j2, long j3, long j4, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(706919231);
        if ((i3 & 1) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, 6).m1232getSurface0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j2, j3, j2, j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: textButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m1194textButtonColorsRGew2ao(long j2, long j3, long j4, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1409305054);
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m2449getTransparent0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j2, j3, j2, j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}
