package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
@Metadata(d1 = {"��h\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0001ø\u0001��¢\u0006\u0002\u0010\u001e\u001aa\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u0010(\u001a \u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H��ø\u0001��¢\u0006\u0002\u0010-\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0006\u001a\u00020\u0001X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n��\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\f\u001a\u00020\u0001X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u000e\u0010\u000e\u001a\u00020\nX\u0080T¢\u0006\u0002\n��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"DropdownMenuItemDefaultMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "DropdownMenuItemDefaultMinHeight", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "()F", "InTransitionDuration", "", "MenuElevation", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", "onClick", "Lkotlin/Function0;", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/MenuKt.class */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m4785constructorimpl(16);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m4785constructorimpl((float) androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m4785constructorimpl(280);

    static {
        float f2 = 8;
        MenuElevation = Dp.m4785constructorimpl(f2);
        float f3 = 48;
        MenuVerticalMargin = Dp.m4785constructorimpl(f3);
        DropdownMenuVerticalPadding = Dp.m4785constructorimpl(f2);
        DropdownMenuItemDefaultMinHeight = Dp.m4785constructorimpl(f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0315, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuContent(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r13, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r14, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-1  reason: not valid java name */
    public static final float m1397DropdownMenuContent$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-3  reason: not valid java name */
    public static final float m1398DropdownMenuContent$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x040f  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuItemContent(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r12, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r13, boolean r14, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r15, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r16, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuItemContent(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long calculateTransformOrigin(@org.jetbrains.annotations.NotNull androidx.compose.ui.unit.IntRect r4, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.IntRect r5) {
        /*
            r0 = r4
            java.lang.String r1 = "parentBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            java.lang.String r1 = "menuBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            int r0 = r0.getLeft()
            r6 = r0
            r0 = r4
            int r0 = r0.getRight()
            r7 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = r0
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L26
        L20:
            r0 = 0
            r9 = r0
            goto L68
        L26:
            r0 = r5
            int r0 = r0.getRight()
            r1 = r4
            int r1 = r1.getLeft()
            if (r0 > r1) goto L37
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = r0
            goto L68
        L37:
            r0 = r5
            int r0 = r0.getWidth()
            if (r0 != 0) goto L41
            goto L20
        L41:
            r0 = r4
            int r0 = r0.getLeft()
            r1 = r5
            int r1 = r1.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            r1 = r4
            int r1 = r1.getRight()
            r2 = r5
            int r2 = r2.getRight()
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r1 = r5
            int r1 = r1.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r5
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            r9 = r0
        L68:
            r0 = r5
            int r0 = r0.getTop()
            r1 = r4
            int r1 = r1.getBottom()
            if (r0 < r1) goto L79
        L73:
            r0 = 0
            r8 = r0
            goto Lb8
        L79:
            r0 = r5
            int r0 = r0.getBottom()
            r1 = r4
            int r1 = r1.getTop()
            if (r0 > r1) goto L87
            goto Lb8
        L87:
            r0 = r5
            int r0 = r0.getHeight()
            if (r0 != 0) goto L91
            goto L73
        L91:
            r0 = r4
            int r0 = r0.getTop()
            r1 = r5
            int r1 = r1.getTop()
            int r0 = java.lang.Math.max(r0, r1)
            r1 = r4
            int r1 = r1.getBottom()
            r2 = r5
            int r2 = r2.getBottom()
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r1 = r5
            int r1 = r1.getTop()
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r5
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            r8 = r0
        Lb8:
            r0 = r9
            r1 = r8
            long r0 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
