package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��x\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¢\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u008a\u0001\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u00102\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a!\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u0014H\u0007¢\u0006\u0002\u00106\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ScaffoldKt.class */
public final class ScaffoldKt {
    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m4785constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0281  */
    @androidx.compose.runtime.Composable
    /* renamed from: Scaffold-27mzLpw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1493Scaffold27mzLpw(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r30, @org.jetbrains.annotations.Nullable androidx.compose.material.ScaffoldState r31, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, int r36, boolean r37, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, boolean r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r40, float r41, long r42, long r44, long r46, long r48, long r50, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1493Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: ScaffoldLayout-MDYNRJg  reason: not valid java name */
    public static final void m1494ScaffoldLayoutMDYNRJg(final boolean z, final int i2, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i3) {
        int i4;
        boolean z2;
        Composer startRestartGroup = composer.startRestartGroup(-2103106784);
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4;
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 = i4 | (startRestartGroup.changed(i2) ? 32 : 16);
        }
        int i6 = i5;
        if ((i3 & 896) == 0) {
            i6 = i5 | (startRestartGroup.changed(function2) ? 256 : 128);
        }
        int i7 = i6;
        if ((i3 & 7168) == 0) {
            i7 = i6 | (startRestartGroup.changed(function3) ? 2048 : 1024);
        }
        int i8 = i7;
        if ((57344 & i3) == 0) {
            i8 = i7 | (startRestartGroup.changed(function22) ? 16384 : 8192);
        }
        int i9 = i8;
        if ((458752 & i3) == 0) {
            i9 = i8 | (startRestartGroup.changed(function23) ? 131072 : 65536);
        }
        int i10 = i9;
        if ((3670016 & i3) == 0) {
            i10 = i9 | (startRestartGroup.changed(function24) ? 1048576 : 524288);
        }
        if (((i10 & 2995931) ^ 599186) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            FabPosition m1358boximpl = FabPosition.m1358boximpl(i2);
            startRestartGroup.startReplaceableGroup(-3685570);
            int i11 = 0;
            boolean z3 = false;
            while (true) {
                z2 = z3;
                if (i11 >= 7) {
                    break;
                }
                i11++;
                z3 = z2 | startRestartGroup.changed(new Object[]{function2, function22, function23, m1358boximpl, Boolean.valueOf(z), function24, function3}[i11]);
            }
            Function2<SubcomposeMeasureScope, Constraints, MeasureResult> rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                final int i12 = i10;
                rememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1497invoke0kLqBqw(subcomposeMeasureScope, constraints.m4758unboximpl());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                    public final MeasureResult m1497invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, long j2) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int m4752getMaxWidthimpl = Constraints.m4752getMaxWidthimpl(j2);
                        final int m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(j2);
                        final long m4743copyZbe2FdA$default = Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        final Function2<Composer, Integer, Unit> function26 = function22;
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        final int i13 = i2;
                        final boolean z4 = z;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        final int i14 = i12;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.DefaultImpls.layout$default(SubcomposeLayout, m4752getMaxWidthimpl, m4751getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
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
                                int lastIndex;
                                Object obj;
                                int lastIndex2;
                                Object obj2;
                                FabPlacement fabPlacement;
                                int lastIndex3;
                                Object obj3;
                                int height;
                                int height2;
                                Integer valueOf;
                                float f2;
                                int lastIndex4;
                                Object obj4;
                                int lastIndex5;
                                Object obj5;
                                int i15;
                                float f3;
                                float f4;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Measurable> subcompose = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.TopBar, function25);
                                long j3 = m4743copyZbe2FdA$default;
                                ArrayList arrayList = new ArrayList(subcompose.size());
                                int size = subcompose.size();
                                for (int i16 = 0; i16 < size; i16++) {
                                    arrayList.add(subcompose.get(i16).mo3910measureBRTryo0(j3));
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    Object obj6 = arrayList.get(0);
                                    int height3 = ((Placeable) obj6).getHeight();
                                    lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                    obj = obj6;
                                    if (1 <= lastIndex) {
                                        int i17 = 1;
                                        obj = obj6;
                                        while (true) {
                                            Object obj7 = arrayList.get(i17);
                                            int height4 = ((Placeable) obj7).getHeight();
                                            int i18 = height3;
                                            if (height3 < height4) {
                                                obj = obj7;
                                                i18 = height4;
                                            }
                                            if (i17 == lastIndex) {
                                                break;
                                            }
                                            i17++;
                                            height3 = i18;
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height5 = placeable == null ? 0 : placeable.getHeight();
                                List<Measurable> subcompose2 = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.Snackbar, function26);
                                long j4 = m4743copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(subcompose2.size());
                                int size2 = subcompose2.size();
                                for (int i19 = 0; i19 < size2; i19++) {
                                    arrayList2.add(subcompose2.get(i19).mo3910measureBRTryo0(j4));
                                }
                                if (arrayList2.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    Object obj8 = arrayList2.get(0);
                                    int height6 = ((Placeable) obj8).getHeight();
                                    lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                    obj2 = obj8;
                                    if (1 <= lastIndex2) {
                                        int i20 = 1;
                                        obj2 = obj8;
                                        while (true) {
                                            Object obj9 = arrayList2.get(i20);
                                            int height7 = ((Placeable) obj9).getHeight();
                                            int i21 = height6;
                                            if (height6 < height7) {
                                                obj2 = obj9;
                                                i21 = height7;
                                            }
                                            if (i20 == lastIndex2) {
                                                break;
                                            }
                                            i20++;
                                            height6 = i21;
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height8 = placeable2 == null ? 0 : placeable2.getHeight();
                                List<Measurable> subcompose3 = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.Fab, function27);
                                long j5 = m4743copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList();
                                for (Measurable measurable : subcompose3) {
                                    Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(j5);
                                    if (!((mo3910measureBRTryo0.getHeight() == 0 || mo3910measureBRTryo0.getWidth() == 0) ? false : true)) {
                                        mo3910measureBRTryo0 = null;
                                    }
                                    if (mo3910measureBRTryo0 != null) {
                                        arrayList3.add(mo3910measureBRTryo0);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    if (arrayList3.isEmpty()) {
                                        obj4 = null;
                                    } else {
                                        Object obj10 = arrayList3.get(0);
                                        int width = ((Placeable) obj10).getWidth();
                                        lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        obj4 = obj10;
                                        if (1 <= lastIndex4) {
                                            int i22 = 1;
                                            obj4 = obj10;
                                            while (true) {
                                                Object obj11 = arrayList3.get(i22);
                                                int width2 = ((Placeable) obj11).getWidth();
                                                int i23 = width;
                                                if (width < width2) {
                                                    i23 = width2;
                                                    obj4 = obj11;
                                                }
                                                if (i22 == lastIndex4) {
                                                    break;
                                                }
                                                i22++;
                                                width = i23;
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj4);
                                    int width3 = ((Placeable) obj4).getWidth();
                                    if (arrayList3.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        Object obj12 = arrayList3.get(0);
                                        int height9 = ((Placeable) obj12).getHeight();
                                        lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        obj5 = obj12;
                                        if (1 <= lastIndex5) {
                                            int i24 = 1;
                                            obj5 = obj12;
                                            while (true) {
                                                Object obj13 = arrayList3.get(i24);
                                                int height10 = ((Placeable) obj13).getHeight();
                                                int i25 = height9;
                                                if (height9 < height10) {
                                                    i25 = height10;
                                                    obj5 = obj13;
                                                }
                                                if (i24 == lastIndex5) {
                                                    break;
                                                }
                                                i24++;
                                                height9 = i25;
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj5);
                                    int height11 = ((Placeable) obj5).getHeight();
                                    if (!FabPosition.m1361equalsimpl0(i13, FabPosition.Companion.m1366getEnd5ygKITE())) {
                                        i15 = (m4752getMaxWidthimpl - width3) / 2;
                                    } else if (SubcomposeMeasureScope.this.getLayoutDirection() == LayoutDirection.Ltr) {
                                        int i26 = m4752getMaxWidthimpl;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeMeasureScope.this;
                                        f4 = ScaffoldKt.FabSpacing;
                                        i15 = (i26 - subcomposeMeasureScope.mo518roundToPx0680j_4(f4)) - width3;
                                    } else {
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeMeasureScope.this;
                                        f3 = ScaffoldKt.FabSpacing;
                                        i15 = subcomposeMeasureScope2.mo518roundToPx0680j_4(f3);
                                    }
                                    fabPlacement = new FabPlacement(z4, i15, width3, height11);
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope3 = SubcomposeMeasureScope.this;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final FabPlacement fabPlacement2 = fabPlacement;
                                final Function2<Composer, Integer, Unit> function29 = function28;
                                final int i27 = i14;
                                List<Measurable> subcompose4 = subcomposeMeasureScope3.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-985538854, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
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
                                    public final void invoke(@Nullable Composer composer2, int i28) {
                                        if (((i28 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(FabPlacement.this)}, function29, composer2, ((i27 >> 15) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                                    }
                                }));
                                long j6 = m4743copyZbe2FdA$default;
                                ArrayList arrayList4 = new ArrayList(subcompose4.size());
                                int size3 = subcompose4.size();
                                for (int i28 = 0; i28 < size3; i28++) {
                                    arrayList4.add(subcompose4.get(i28).mo3910measureBRTryo0(j6));
                                }
                                if (arrayList4.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    Object obj14 = arrayList4.get(0);
                                    int height12 = ((Placeable) obj14).getHeight();
                                    lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                                    obj3 = obj14;
                                    if (1 <= lastIndex3) {
                                        int i29 = 1;
                                        obj3 = obj14;
                                        while (true) {
                                            Object obj15 = arrayList4.get(i29);
                                            int height13 = ((Placeable) obj15).getHeight();
                                            int i30 = height12;
                                            if (height12 < height13) {
                                                i30 = height13;
                                                obj3 = obj15;
                                            }
                                            if (i29 == lastIndex3) {
                                                break;
                                            }
                                            i29++;
                                            height12 = i30;
                                        }
                                    }
                                }
                                Placeable placeable3 = (Placeable) obj3;
                                int height14 = placeable3 == null ? 0 : placeable3.getHeight();
                                if (fabPlacement == null) {
                                    valueOf = null;
                                } else {
                                    SubcomposeMeasureScope subcomposeMeasureScope4 = SubcomposeMeasureScope.this;
                                    boolean z5 = z4;
                                    if (height14 == 0) {
                                        height = fabPlacement.getHeight();
                                    } else if (z5) {
                                        height2 = height14 + (fabPlacement.getHeight() / 2);
                                        valueOf = Integer.valueOf(height2);
                                    } else {
                                        height = fabPlacement.getHeight() + height14;
                                    }
                                    f2 = ScaffoldKt.FabSpacing;
                                    height2 = height + subcomposeMeasureScope4.mo518roundToPx0680j_4(f2);
                                    valueOf = Integer.valueOf(height2);
                                }
                                int intValue = height8 != 0 ? height8 + (valueOf == null ? height14 : valueOf.intValue()) : 0;
                                int i31 = m4751getMaxHeightimpl - height5;
                                final SubcomposeMeasureScope subcomposeMeasureScope5 = SubcomposeMeasureScope.this;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final int i32 = height14;
                                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                                final int i33 = i14;
                                List<Measurable> subcompose5 = subcomposeMeasureScope5.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-985545322, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
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
                                    public final void invoke(@Nullable Composer composer2, int i34) {
                                        if (((i34 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        function33.invoke(PaddingKt.m673PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, SubcomposeMeasureScope.this.mo521toDpu2uoSUM(i32), 7, null), composer2, Integer.valueOf((i33 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                    }
                                }));
                                long j7 = m4743copyZbe2FdA$default;
                                ArrayList arrayList5 = new ArrayList(subcompose5.size());
                                int size4 = subcompose5.size();
                                for (int i34 = 0; i34 < size4; i34++) {
                                    arrayList5.add(subcompose5.get(i34).mo3910measureBRTryo0(Constraints.m4743copyZbe2FdA$default(j7, 0, 0, 0, i31, 7, null)));
                                }
                                int size5 = arrayList5.size();
                                for (int i35 = 0; i35 < size5; i35++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList5.get(i35), 0, height5, 0.0f, 4, null);
                                }
                                int size6 = arrayList.size();
                                for (int i36 = 0; i36 < size6; i36++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList.get(i36), 0, 0, 0.0f, 4, null);
                                }
                                int i37 = m4751getMaxHeightimpl;
                                int size7 = arrayList2.size();
                                for (int i38 = 0; i38 < size7; i38++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList2.get(i38), 0, i37 - intValue, 0.0f, 4, null);
                                }
                                int i39 = m4751getMaxHeightimpl;
                                int size8 = arrayList4.size();
                                for (int i40 = 0; i40 < size8; i40++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList4.get(i40), 0, i39 - height14, 0.0f, 4, null);
                                }
                                if (fabPlacement == null) {
                                    return;
                                }
                                int i41 = m4751getMaxHeightimpl;
                                int size9 = arrayList3.size();
                                for (int i42 = 0; i42 < size9; i42++) {
                                    Placeable placeable4 = (Placeable) arrayList3.get(i42);
                                    int left = fabPlacement.getLeft();
                                    Intrinsics.checkNotNull(valueOf);
                                    Placeable.PlacementScope.place$default(layout, placeable4, left, i41 - valueOf.intValue(), 0.0f, 4, null);
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, 0, 1);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(@Nullable Composer composer2, int i13) {
                ScaffoldKt.m1494ScaffoldLayoutMDYNRJg(z, i2, function2, function3, function22, function23, function24, composer2, i3 | 1);
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1962071859);
        if ((i3 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        SnackbarHostState snackbarHostState2 = snackbarHostState;
        if ((i3 & 2) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            SnackbarHostState snackbarHostState3 = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                snackbarHostState3 = new SnackbarHostState();
                composer.updateRememberedValue(snackbarHostState3);
            }
            composer.endReplaceableGroup();
            snackbarHostState2 = (SnackbarHostState) snackbarHostState3;
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        ScaffoldState scaffoldState = rememberedValue2;
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            scaffoldState = new ScaffoldState(drawerState, snackbarHostState2);
            composer.updateRememberedValue(scaffoldState);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState2 = (ScaffoldState) scaffoldState;
        composer.endReplaceableGroup();
        return scaffoldState2;
    }
}
