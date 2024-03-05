package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��t\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0091\u0001\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u001d2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0010H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a=\u0010*\u001a\u00020\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\u0006\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010,\u001aU\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a)\u00105\u001a\u000206*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a9\u0010>\u001a\u000206*\u0002072\u0006\u0010?\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010+\u001a\u00020\u0007H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b@\u0010A\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", FirebaseAnalytics.Param.CONTENT, "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", Constants.ScionAnalytics.PARAM_LABEL, "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/NavigationRailKt.class */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;
    @NotNull
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m4785constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m4785constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m4785constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m4785constructorimpl(14);

    static {
        float f2 = 8;
        NavigationRailPadding = Dp.m4785constructorimpl(f2);
        HeaderPadding = Dp.m4785constructorimpl(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d  */
    @androidx.compose.runtime.Composable
    /* renamed from: NavigationRail-HsRjFd4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1421NavigationRailHsRjFd4(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r14, long r15, long r17, float r19, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1421NavigationRailHsRjFd4(androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0271  */
    @androidx.compose.runtime.Composable
    /* renamed from: NavigationRailItem-0S3VyRs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1422NavigationRailItem0S3VyRs(final boolean r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r21, boolean r22, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, boolean r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r25, long r26, long r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1422NavigationRailItem0S3VyRs(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void NavigationRailItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f2, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(286683577);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(function22) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(f2) ? 256 : 128);
        }
        if (((i5 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i6) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i6) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo89measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
                    Placeable mo3910measureBRTryo0;
                    MeasureResult m1430placeLabelAndIconDIyivk0;
                    MeasureResult measureResult;
                    MeasureResult m1429placeIcon3p2s80s;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                            Placeable mo3910measureBRTryo02 = measurable.mo3910measureBRTryo0(j2);
                            if (function22 != null) {
                                for (Measurable measurable2 : measurables) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), Constants.ScionAnalytics.PARAM_LABEL)) {
                                        mo3910measureBRTryo0 = measurable2.mo3910measureBRTryo0(Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            mo3910measureBRTryo0 = null;
                            if (function22 == null) {
                                m1429placeIcon3p2s80s = NavigationRailKt.m1429placeIcon3p2s80s(Layout, mo3910measureBRTryo02, j2);
                                measureResult = m1429placeIcon3p2s80s;
                            } else {
                                Intrinsics.checkNotNull(mo3910measureBRTryo0);
                                m1430placeLabelAndIconDIyivk0 = NavigationRailKt.m1430placeLabelAndIconDIyivk0(Layout, mo3910measureBRTryo0, mo3910measureBRTryo02, j2, f2);
                                measureResult = m1430placeLabelAndIconDIyivk0;
                            }
                            return measureResult;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i6) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i6) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i6);
                }
            };
            startRestartGroup.startReplaceableGroup(1376089394);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1989constructorimpl = Updater.m1989constructorimpl(startRestartGroup);
            Updater.m1996setimpl(m1989constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl, density, companion2.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(116750785);
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(-1990474327);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1989constructorimpl2 = Updater.m1989constructorimpl(startRestartGroup);
            Updater.m1996setimpl(m1989constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl2, density2, companion2.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(2053494659);
            function2.invoke(startRestartGroup, Integer.valueOf(i5 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, Constants.ScionAnalytics.PARAM_LABEL), f2);
                startRestartGroup.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1376089394);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(alpha);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1989constructorimpl3 = Updater.m1989constructorimpl(startRestartGroup);
                Updater.m1996setimpl(m1989constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1996setimpl(m1989constructorimpl3, density3, companion2.getSetDensity());
                Updater.m1996setimpl(m1989constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m1996setimpl(m1989constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-1253629305);
                startRestartGroup.startReplaceableGroup(2053494876);
                function22.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                NavigationRailKt.NavigationRailItemBaselineLayout(function2, function22, f2, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: NavigationRailTransition-Klgx-Pg  reason: not valid java name */
    public static final void m1423NavigationRailTransitionKlgxPg(final long j2, final long j3, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-255502736);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(j3) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(z) ? 256 : 128);
        }
        int i6 = i5;
        if ((i2 & 7168) == 0) {
            i6 = i5 | (startRestartGroup.changed(function3) ? 2048 : 1024);
        }
        if (((i6 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, startRestartGroup, 48, 12);
            long m2467lerpjxsXWHM = ColorKt.m2467lerpjxsXWHM(j3, j2, m1424NavigationRailTransition_Klgx_Pg$lambda3(animateFloatAsState));
            final int i7 = i6;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2404boximpl(Color.m2413copywmQWz5c$default(m2467lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2416getAlphaimpl(m2467lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(startRestartGroup, -819900793, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i8) {
                    float m1424NavigationRailTransition_Klgx_Pg$lambda3;
                    if (((i8 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function3<Float, Composer, Integer, Unit> function32 = function3;
                    m1424NavigationRailTransition_Klgx_Pg$lambda3 = NavigationRailKt.m1424NavigationRailTransition_Klgx_Pg$lambda3(animateFloatAsState);
                    function32.invoke(Float.valueOf(m1424NavigationRailTransition_Klgx_Pg$lambda3), composer2, Integer.valueOf((i7 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                }
            }), startRestartGroup, 56);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                NavigationRailKt.m1423NavigationRailTransitionKlgxPg(j2, j3, z, function3, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition_Klgx_Pg$lambda-3  reason: not valid java name */
    public static final float m1424NavigationRailTransition_Klgx_Pg$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s  reason: not valid java name */
    public static final MeasureResult m1429placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j2) {
        final int max = Math.max(0, (Constraints.m4752getMaxWidthimpl(j2) - placeable.getWidth()) / 2);
        final int max2 = Math.max(0, (Constraints.m4751getMaxHeightimpl(j2) - placeable.getHeight()) / 2);
        return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m4752getMaxWidthimpl(j2), Constraints.m4751getMaxHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, max, max2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0  reason: not valid java name */
    public static final MeasureResult m1430placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j2, final float f2) {
        final int roundToInt;
        int i2 = placeable.get(AlignmentLineKt.getLastBaseline());
        int mo518roundToPx0680j_4 = measureScope.mo518roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        int m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(j2);
        final int m4752getMaxWidthimpl = (Constraints.m4752getMaxWidthimpl(j2) - placeable.getWidth()) / 2;
        final int mo518roundToPx0680j_42 = measureScope.mo518roundToPx0680j_4(ItemIconTopOffset);
        int m4751getMaxHeightimpl2 = (Constraints.m4751getMaxHeightimpl(j2) - placeable2.getHeight()) / 2;
        final int m4752getMaxWidthimpl2 = (Constraints.m4752getMaxWidthimpl(j2) - placeable2.getWidth()) / 2;
        roundToInt = MathKt__MathJVMKt.roundToInt((m4751getMaxHeightimpl2 - mo518roundToPx0680j_42) * (1 - f2));
        final int i3 = (m4751getMaxHeightimpl - i2) - mo518roundToPx0680j_4;
        return MeasureScope.DefaultImpls.layout$default(measureScope, Constraints.m4752getMaxWidthimpl(j2), Constraints.m4751getMaxHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (!(f2 == 0.0f)) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, m4752getMaxWidthimpl, i3 + roundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, m4752getMaxWidthimpl2, mo518roundToPx0680j_42 + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
