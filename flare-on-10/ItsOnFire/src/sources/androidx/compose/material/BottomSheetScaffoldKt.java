package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0088\u0001\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aá\u0002\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012 \b\u0002\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\bH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aw\u0010+\u001a\u00020\u00042\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a+\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0002\u00109\u001a;\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u0002000>2\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0002\u0010@\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"FabEndSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffoldStack", "body", "bottomSheet", "bottomSheetOffset", "Landroidx/compose/runtime/State;", "", "BottomSheetScaffoldStack-SlNgfk0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;ILandroidx/compose/runtime/Composer;I)V", "rememberBottomSheetScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "Landroidx/compose/material/BottomSheetState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/BottomSheetScaffoldKt.class */
public final class BottomSheetScaffoldKt {
    private static final float FabEndSpacing = Dp.m4785constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:387:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:721:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1172BottomSheetScaffoldbGncdBI(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r39, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomSheetScaffoldState r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, int r44, boolean r45, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r46, float r47, long r48, long r50, float r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, boolean r54, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r55, float r56, long r57, long r59, long r61, long r63, long r65, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r67, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 2868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1172BottomSheetScaffoldbGncdBI(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    /* renamed from: BottomSheetScaffoldStack-SlNgfk0 */
    public static final void m1173BottomSheetScaffoldStackSlNgfk0(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final State<Float> state, final int i2, Composer composer, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1491542599);
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(function2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4;
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 = i4 | (startRestartGroup.changed(function22) ? 32 : 16);
        }
        int i6 = i5;
        if ((i3 & 896) == 0) {
            i6 = i5 | (startRestartGroup.changed(function23) ? 256 : 128);
        }
        int i7 = i6;
        if ((i3 & 7168) == 0) {
            i7 = i6 | (startRestartGroup.changed(function24) ? 2048 : 1024);
        }
        int i8 = i7;
        if ((57344 & i3) == 0) {
            i8 = i7 | (startRestartGroup.changed(state) ? 16384 : 8192);
        }
        int i9 = i8;
        if ((458752 & i3) == 0) {
            i9 = i8 | (startRestartGroup.changed(i2) ? 131072 : 65536);
        }
        if (((374491 & i9) ^ 74898) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldStack$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i10);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i10);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo89measure3p2s80s(@NotNull final MeasureScope Layout, @NotNull final List<? extends Measurable> measurables, final long j2) {
                    Object first;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) measurables);
                    final Placeable mo3910measureBRTryo0 = ((Measurable) first).mo3910measureBRTryo0(j2);
                    int width = mo3910measureBRTryo0.getWidth();
                    int height = mo3910measureBRTryo0.getHeight();
                    final State<Float> state2 = state;
                    final int i10 = i2;
                    return MeasureScope.DefaultImpls.layout$default(Layout, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldStack$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            List<Measurable> drop;
                            int collectionSizeOrDefault;
                            int roundToInt;
                            float f2;
                            int mo518roundToPx0680j_4;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
                            drop = CollectionsKt___CollectionsKt.drop(measurables, 1);
                            long j3 = j2;
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(drop, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            for (Measurable measurable : drop) {
                                arrayList.add(measurable.mo3910measureBRTryo0(Constraints.m4743copyZbe2FdA$default(j3, 0, 0, 0, 0, 10, null)));
                            }
                            Placeable placeable = (Placeable) arrayList.get(0);
                            Placeable placeable2 = (Placeable) arrayList.get(1);
                            Placeable placeable3 = (Placeable) arrayList.get(2);
                            roundToInt = MathKt__MathJVMKt.roundToInt(state2.getValue().floatValue());
                            Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, roundToInt, 0.0f, 4, null);
                            if (FabPosition.m1361equalsimpl0(i10, FabPosition.Companion.m1365getCenter5ygKITE())) {
                                mo518roundToPx0680j_4 = (Placeable.this.getWidth() - placeable2.getWidth()) / 2;
                            } else {
                                int width2 = Placeable.this.getWidth() - placeable2.getWidth();
                                MeasureScope measureScope = Layout;
                                f2 = BottomSheetScaffoldKt.FabEndSpacing;
                                mo518roundToPx0680j_4 = width2 - measureScope.mo518roundToPx0680j_4(f2);
                            }
                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, mo518roundToPx0680j_4, roundToInt - (placeable2.getHeight() / 2), 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(layout, placeable3, (Placeable.this.getWidth() - placeable3.getWidth()) / 2, Placeable.this.getHeight() - placeable3.getHeight(), 0.0f, 4, null);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i10);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i10);
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
            startRestartGroup.startReplaceableGroup(-526644304);
            function2.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            function22.invoke(startRestartGroup, Integer.valueOf((i9 >> 3) & 14));
            function23.invoke(startRestartGroup, Integer.valueOf((i9 >> 6) & 14));
            function24.invoke(startRestartGroup, Integer.valueOf((i9 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldStack$3
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

            public final void invoke(@Nullable Composer composer2, int i10) {
                BottomSheetScaffoldKt.m1173BottomSheetScaffoldStackSlNgfk0(function2, function22, function23, function24, state, i2, composer2, i3 | 1);
            }
        });
    }

    /* renamed from: access$BottomSheetScaffoldStack-SlNgfk0 */
    public static final /* synthetic */ void m1174access$BottomSheetScaffoldStackSlNgfk0(Function2 function2, Function2 function22, Function2 function23, Function2 function24, State state, int i2, Composer composer, int i3) {
        m1173BottomSheetScaffoldStackSlNgfk0(function2, function22, function23, function24, state, i2, composer, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L20;
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.material.BottomSheetScaffoldState rememberBottomSheetScaffoldState(@org.jetbrains.annotations.Nullable androidx.compose.material.DrawerState r7, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomSheetState r8, @org.jetbrains.annotations.Nullable androidx.compose.material.SnackbarHostState r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(androidx.compose.material.DrawerState, androidx.compose.material.BottomSheetState, androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, int, int):androidx.compose.material.BottomSheetScaffoldState");
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull final BottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super BottomSheetValue, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1877845424);
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        final Function1<? super BottomSheetValue, Boolean> function12 = function1;
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m2016rememberSaveable(new Object[]{animationSpec}, (Saver<Object, ? extends Object>) BottomSheetState.Companion.Saver(animationSpec, function1), (String) null, (Function0<? extends Object>) new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BottomSheetState invoke() {
                return new BottomSheetState(BottomSheetValue.this, animationSpec2, function12);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }
}
