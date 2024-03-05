package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
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
@Metadata(d1 = {"��p\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a[\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u0017\u001a\u00020\t2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0002\b\u00132\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b\u00132\u0006\u0010\u001b\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010\u001c\u001aU\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2&\u0010\u0010\u001a\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0013H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u0095\u0001\u0010'\u001a\u00020\t*\u00020\u00122\u0006\u0010 \u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0002\b\u00132\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020!2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b\u00132\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010.\u001a\u00020\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a)\u00101\u001a\u000202*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u000202*\u0002032\u0006\u0010;\u001a\u0002052\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010\u001b\u001a\u00020\u0002H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b<\u0010=\"\u0014\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"BottomNavigationAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomNavigationHeight", "Landroidx/compose/ui/unit/Dp;", "F", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "BottomNavigation", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigationItemBaselineLayout", "icon", "Lkotlin/Function0;", Constants.ScionAnalytics.PARAM_LABEL, "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "BottomNavigationTransition", "activeColor", "inactiveColor", "selected", "", "Lkotlin/ParameterName;", "name", "animationProgress", "BottomNavigationTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "BottomNavigationItem", "onClick", "enabled", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/BottomNavigationKt.class */
public final class BottomNavigationKt {
    @NotNull
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec<>(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m4785constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    static {
        float f2 = 12;
        BottomNavigationItemHorizontalPadding = Dp.m4785constructorimpl(f2);
        CombinedItemTextBaseline = Dp.m4785constructorimpl(f2);
    }

    @Composable
    /* renamed from: BottomNavigation-PEIptTM  reason: not valid java name */
    public static final void m1158BottomNavigationPEIptTM(@Nullable Modifier modifier, long j2, long j3, float f2, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        long j4;
        long j5;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1878899128);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 = i4 | 3072;
        } else {
            i5 = i4;
            if ((i2 & 7168) == 0) {
                i5 = i4 | (startRestartGroup.changed(f2) ? 2048 : 1024);
            }
        }
        if ((i3 & 16) != 0) {
            i6 = i5 | 24576;
        } else {
            i6 = i5;
            if ((57344 & i2) == 0) {
                i6 = i5 | (startRestartGroup.changed(content) ? 16384 : 8192);
            }
        }
        if (((46811 & i6) ^ 9362) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    modifier = Modifier.Companion;
                }
                int i11 = i6;
                if ((i3 & 2) != 0) {
                    j2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                    i11 = i6 & (-113);
                }
                i7 = i11;
                if ((i3 & 4) != 0) {
                    j3 = ColorsKt.m1247contentColorForek8zF_U(j2, startRestartGroup, (i11 >> 3) & 14);
                    i7 = i11 & (-897);
                }
                modifier2 = modifier;
                i8 = i7;
                j4 = j2;
                j5 = j3;
                if (i10 != 0) {
                    f2 = BottomNavigationDefaults.INSTANCE.m1156getElevationD9Ej5fM();
                    startRestartGroup.endDefaults();
                    final int i12 = i7;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -819890209, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
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
                        public final void invoke(@Nullable Composer composer2, int i13) {
                            float f3;
                            if (((i13 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                            f3 = BottomNavigationKt.BottomNavigationHeight;
                            Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m712height3ABfNKs(fillMaxWidth$default, f3));
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Function3<RowScope, Composer, Integer, Unit> function3 = content;
                            int i14 = ((i12 >> 3) & 7168) | 48;
                            composer2.startReplaceableGroup(-1989997165);
                            int i15 = i14 >> 3;
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.Companion.getTop(), composer2, (i15 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i15 & 14));
                            composer2.startReplaceableGroup(1376089394);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(selectableGroup);
                            int i16 = ((((i14 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1989constructorimpl = Updater.m1989constructorimpl(composer2);
                            Updater.m1996setimpl(m1989constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
                            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer2)), composer2, Integer.valueOf((i16 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682362);
                            if (((((i16 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i14 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i13 = i7 << 3;
                    SurfaceKt.m1534SurfaceFjzlyU(modifier, (Shape) null, j2, j3, (BorderStroke) null, f2, composableLambda, startRestartGroup, 1572864 | (i7 & 14) | (i13 & 896) | (i13 & 7168) | ((i7 << 6) & 458752), 18);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                int i14 = i6;
                if ((i3 & 2) != 0) {
                    i14 = i6 & (-113);
                }
                int i15 = i14;
                if ((i3 & 4) != 0) {
                    i15 = i14 & (-897);
                }
                j5 = j3;
                j4 = j2;
                i8 = i15;
                modifier2 = modifier;
            }
            j3 = j5;
            j2 = j4;
            i7 = i8;
            modifier = modifier2;
            startRestartGroup.endDefaults();
            final int i122 = i7;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -819890209, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
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
                public final void invoke(@Nullable Composer composer2, int i132) {
                    float f3;
                    if (((i132 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    f3 = BottomNavigationKt.BottomNavigationHeight;
                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m712height3ABfNKs(fillMaxWidth$default, f3));
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Function3<RowScope, Composer, Integer, Unit> function3 = content;
                    int i142 = ((i122 >> 3) & 7168) | 48;
                    composer2.startReplaceableGroup(-1989997165);
                    int i152 = i142 >> 3;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.Companion.getTop(), composer2, (i152 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i152 & 14));
                    composer2.startReplaceableGroup(1376089394);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(selectableGroup);
                    int i16 = ((((i142 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1989constructorimpl = Updater.m1989constructorimpl(composer2);
                    Updater.m1996setimpl(m1989constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
                    Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer2)), composer2, Integer.valueOf((i16 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682362);
                    if (((((i16 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i142 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i132 = i7 << 3;
            SurfaceKt.m1534SurfaceFjzlyU(modifier, (Shape) null, j2, j3, (BorderStroke) null, f2, composableLambda2, startRestartGroup, 1572864 | (i7 & 14) | (i132 & 896) | (i132 & 7168) | ((i7 << 6) & 458752), 18);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier;
        final long j6 = j2;
        final long j7 = j3;
        final float f3 = f2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$2
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

            public final void invoke(@Nullable Composer composer2, int i16) {
                BottomNavigationKt.m1158BottomNavigationPEIptTM(Modifier.this, j6, j7, f3, content, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027f  */
    @androidx.compose.runtime.Composable
    /* renamed from: BottomNavigationItem-jY6E1Zs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1159BottomNavigationItemjY6E1Zs(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.RowScope r20, final boolean r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, boolean r25, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, boolean r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r28, long r29, long r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1159BottomNavigationItemjY6E1Zs(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void BottomNavigationItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f2, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1198312724);
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
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2
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
                    MeasureResult m1167placeLabelAndIconDIyivk0;
                    MeasureResult measureResult;
                    MeasureResult m1166placeIcon3p2s80s;
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
                                m1166placeIcon3p2s80s = BottomNavigationKt.m1166placeIcon3p2s80s(Layout, mo3910measureBRTryo02, j2);
                                measureResult = m1166placeIcon3p2s80s;
                            } else {
                                Intrinsics.checkNotNull(mo3910measureBRTryo0);
                                m1167placeLabelAndIconDIyivk0 = BottomNavigationKt.m1167placeLabelAndIconDIyivk0(Layout, mo3910measureBRTryo0, mo3910measureBRTryo02, j2, f2);
                                measureResult = m1167placeLabelAndIconDIyivk0;
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
            startRestartGroup.startReplaceableGroup(619997302);
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
            startRestartGroup.startReplaceableGroup(-1517374536);
            function2.invoke(startRestartGroup, Integer.valueOf(i5 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier m678paddingVpY3zN4$default = PaddingKt.m678paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, Constants.ScionAnalytics.PARAM_LABEL), f2), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1376089394);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m678paddingVpY3zN4$default);
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
                startRestartGroup.startReplaceableGroup(-1517374234);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$3
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
                BottomNavigationKt.BottomNavigationItemBaselineLayout(function2, function22, f2, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: BottomNavigationTransition-Klgx-Pg  reason: not valid java name */
    public static final void m1160BottomNavigationTransitionKlgxPg(final long j2, final long j3, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-601092451);
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
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, BottomNavigationAnimationSpec, 0.0f, null, startRestartGroup, 48, 12);
            long m2467lerpjxsXWHM = ColorKt.m2467lerpjxsXWHM(j3, j2, m1161BottomNavigationTransition_Klgx_Pg$lambda3(animateFloatAsState));
            final int i7 = i6;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2404boximpl(Color.m2413copywmQWz5c$default(m2467lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2416getAlphaimpl(m2467lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(startRestartGroup, -819904067, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
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
                    float m1161BottomNavigationTransition_Klgx_Pg$lambda3;
                    if (((i8 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function3<Float, Composer, Integer, Unit> function32 = function3;
                    m1161BottomNavigationTransition_Klgx_Pg$lambda3 = BottomNavigationKt.m1161BottomNavigationTransition_Klgx_Pg$lambda3(animateFloatAsState);
                    function32.invoke(Float.valueOf(m1161BottomNavigationTransition_Klgx_Pg$lambda3), composer2, Integer.valueOf((i7 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                }
            }), startRestartGroup, 56);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$2
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
                BottomNavigationKt.m1160BottomNavigationTransitionKlgxPg(j2, j3, z, function3, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomNavigationTransition_Klgx_Pg$lambda-3  reason: not valid java name */
    public static final float m1161BottomNavigationTransition_Klgx_Pg$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s  reason: not valid java name */
    public static final MeasureResult m1166placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j2) {
        int m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(j2);
        final int height = (m4751getMaxHeightimpl - placeable.getHeight()) / 2;
        return MeasureScope.DefaultImpls.layout$default(measureScope, placeable.getWidth(), m4751getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, height, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0  reason: not valid java name */
    public static final MeasureResult m1167placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j2, final float f2) {
        final int roundToInt;
        int m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(j2);
        int i2 = placeable.get(AlignmentLineKt.getLastBaseline());
        int mo518roundToPx0680j_4 = measureScope.mo518roundToPx0680j_4(CombinedItemTextBaseline);
        int height = (m4751getMaxHeightimpl - placeable2.getHeight()) / 2;
        final int height2 = (m4751getMaxHeightimpl - (mo518roundToPx0680j_4 * 2)) - placeable2.getHeight();
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        final int width = (max - placeable.getWidth()) / 2;
        final int width2 = (max - placeable2.getWidth()) / 2;
        final int i3 = (m4751getMaxHeightimpl - i2) - mo518roundToPx0680j_4;
        roundToInt = MathKt__MathJVMKt.roundToInt((height - height2) * (1 - f2));
        return MeasureScope.DefaultImpls.layout$default(measureScope, max, m4751getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$placeLabelAndIcon$1
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
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, width, i3 + roundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width2, height2 + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
