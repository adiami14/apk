package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0084\u0001\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aX\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001aB\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2#\u0010\u0014\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00030\u00160\u0015H\u0003¢\u0006\u0002\u0010\u0019\u001a`\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0093\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b��\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 20\b\n\u0010!\u001a*\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\"¢\u0006\u0002\b\u001123\b\u0004\u0010(\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010*\u001a\u0093\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b��\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u001520\b\n\u0010!\u001a*\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\"¢\u0006\u0002\b\u001123\b\u0004\u0010(\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010+\u001a½\u0001\u0010,\u001a\u00020\u0001\"\u0004\b��\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2E\b\n\u0010!\u001a?\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010-¢\u0006\u0002\b\u00112H\b\u0004\u0010(\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010-¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010/\u001a½\u0001\u0010,\u001a\u00020\u0001\"\u0004\b��\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u00152E\b\n\u0010!\u001a?\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010-¢\u0006\u0002\b\u00112H\b\u0004\u0010(\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010-¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001��ø\u0001\u0001¢\u0006\u0002\u00100\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"FixedLazyGrid", "", "nColumns", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ItemRow", "rowContent", "", "Lkotlin/Pair;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ILandroidx/compose/foundation/layout/Arrangement$Horizontal;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "LazyVerticalGrid", "cells", "Landroidx/compose/foundation/lazy/GridCells;", "(Landroidx/compose/foundation/lazy/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, "T", "", "spans", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "Lkotlin/ParameterName;", "name", "item", "Landroidx/compose/foundation/lazy/GridItemSpan;", "itemContent", "Landroidx/compose/foundation/lazy/LazyItemScope;", "(Landroidx/compose/foundation/lazy/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "Lkotlin/Function3;", FirebaseAnalytics.Param.INDEX, "(Landroidx/compose/foundation/lazy/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/LazyGridKt.class */
public final class LazyGridKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0240, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FixedLazyGrid(final int r14, androidx.compose.ui.Modifier r15, final androidx.compose.foundation.lazy.LazyListState r16, final androidx.compose.foundation.layout.PaddingValues r17, final androidx.compose.foundation.layout.Arrangement.Vertical r18, final androidx.compose.foundation.layout.Arrangement.Horizontal r19, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyGridScope, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyGridKt.FixedLazyGrid(int, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ItemRow(final int i2, final Arrangement.Horizontal horizontal, final List<? extends Pair<? extends Function2<? super Composer, ? super Integer, Unit>, Integer>> list, Composer composer, final int i3) {
        Composer startRestartGroup = composer.startRestartGroup(-506699774);
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.lazy.LazyGridKt$ItemRow$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i4);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i4);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo89measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
                int lastIndex;
                Integer num;
                LazyGridKt$ItemRow$2$measure$1 lazyGridKt$ItemRow$2$measure$1;
                int i4;
                int i5;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.size() == list.size()) {
                    if (measurables.isEmpty()) {
                        i4 = Constraints.m4754getMinWidthimpl(j2);
                        i5 = Constraints.m4753getMinHeightimpl(j2);
                        lazyGridKt$ItemRow$2$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt$ItemRow$2$measure$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            }
                        };
                    } else {
                        final int mo518roundToPx0680j_4 = Layout.mo518roundToPx0680j_4(horizontal.mo588getSpacingD9Ej5fM());
                        int max = Math.max(Constraints.m4752getMaxWidthimpl(j2) - ((i2 - 1) * mo518roundToPx0680j_4), 0) / i2;
                        int m4752getMaxWidthimpl = Constraints.m4752getMaxWidthimpl(j2);
                        int i6 = i2;
                        int max2 = Math.max((m4752getMaxWidthimpl - (max * i6)) - ((i6 - 1) * mo518roundToPx0680j_4), 0);
                        List<Pair<Function2<Composer, Integer, Unit>, Integer>> list2 = list;
                        final ArrayList arrayList = new ArrayList(measurables.size());
                        int size = measurables.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable = measurables.get(i7);
                            int intValue = list2.get(i7).getSecond().intValue();
                            int min = Math.min(max2, intValue);
                            max2 -= min;
                            Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(Constraints.Companion.m4762fixedWidthOenEA2s((intValue * max) + min + ((intValue - 1) * mo518roundToPx0680j_4)));
                            if (mo3910measureBRTryo0 != null) {
                                arrayList.add(mo3910measureBRTryo0);
                            }
                        }
                        int m4752getMaxWidthimpl2 = Constraints.m4752getMaxWidthimpl(j2);
                        if (arrayList.isEmpty()) {
                            num = null;
                        } else {
                            Integer valueOf = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
                            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                            num = valueOf;
                            if (1 <= lastIndex) {
                                int i8 = 1;
                                while (true) {
                                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList.get(i8)).getHeight());
                                    num = valueOf;
                                    if (valueOf2.compareTo(valueOf) > 0) {
                                        num = valueOf2;
                                    }
                                    if (i8 == lastIndex) {
                                        break;
                                    }
                                    i8++;
                                    valueOf = num;
                                }
                            }
                        }
                        Intrinsics.checkNotNull(num);
                        int intValue2 = num.intValue();
                        lazyGridKt$ItemRow$2$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt$ItemRow$2$measure$3
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
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Placeable> list3 = arrayList;
                                int i9 = mo518roundToPx0680j_4;
                                int size2 = list3.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size2; i11++) {
                                    Placeable placeable = list3.get(i11);
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable, i10, 0, 0.0f, 4, null);
                                    i10 += placeable.getWidth() + i9;
                                }
                            }
                        };
                        i4 = m4752getMaxWidthimpl2;
                        i5 = intValue2;
                    }
                    return MeasureScope.DefaultImpls.layout$default(Layout, i4, i5, null, lazyGridKt$ItemRow$2$measure$1, 4, null);
                }
                throw new IllegalStateException("Check failed.".toString());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list2, i4);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list2, i4);
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
        startRestartGroup.startReplaceableGroup(-97970863);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).getFirst().invoke(startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyGridKt$ItemRow$3
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

            public final void invoke(@Nullable Composer composer2, int i5) {
                LazyGridKt.ItemRow(i2, horizontal, list, composer2, i3 | 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.GridCells r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListState r18, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r19, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r20, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyGridScope, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid(androidx.compose.foundation.lazy.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalFoundationApi
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 == null ? null : new LazyGridKt$items$1$1(function2, items), ComposableLambdaKt.composableLambdaInstance(-985536268, true, new LazyGridKt$items$2(itemContent, items)));
    }

    @ExperimentalFoundationApi
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 == null ? null : new LazyGridKt$items$3$1(function2, items), ComposableLambdaKt.composableLambdaInstance(-985534956, true, new LazyGridKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function4 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 == null ? null : new LazyGridKt$items$1$1(function2, items), ComposableLambdaKt.composableLambdaInstance(-985536268, true, new LazyGridKt$items$2(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function4 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 == null ? null : new LazyGridKt$items$3$1(function2, items), ComposableLambdaKt.composableLambdaInstance(-985534956, true, new LazyGridKt$items$4(itemContent, items)));
    }

    @ExperimentalFoundationApi
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function3 == null ? null : new LazyGridKt$itemsIndexed$1$1(function3, items), ComposableLambdaKt.composableLambdaInstance(-985534995, true, new LazyGridKt$itemsIndexed$2(itemContent, items)));
    }

    @ExperimentalFoundationApi
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function3 == null ? null : new LazyGridKt$itemsIndexed$3$1(function3, items), ComposableLambdaKt.composableLambdaInstance(-985541871, true, new LazyGridKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function3 function3, Function5 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function3 == null ? null : new LazyGridKt$itemsIndexed$1$1(function3, items), ComposableLambdaKt.composableLambdaInstance(-985534995, true, new LazyGridKt$itemsIndexed$2(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function3 function3, Function5 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function3 == null ? null : new LazyGridKt$itemsIndexed$3$1(function3, items), ComposableLambdaKt.composableLambdaInstance(-985541871, true, new LazyGridKt$itemsIndexed$4(itemContent, items)));
    }
}
