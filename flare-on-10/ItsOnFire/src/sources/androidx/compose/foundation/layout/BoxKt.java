package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��d\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aM\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0087\bø\u0001��¢\u0006\u0002\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH��\u001a\u001d\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0001¢\u0006\u0002\u0010 \u001a<\u0010!\u001a\u00020\u0010*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002\"\u0014\u0010��\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0003\"\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "boxChildData", "Landroidx/compose/foundation/layout/BoxChildData;", "Landroidx/compose/ui/layout/Measurable;", "getBoxChildData", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildData;", "matchesParentSize", "", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "boxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/BoxKt.class */
public final class BoxKt {
    @NotNull
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.Companion.getTopStart(), false);
    @NotNull
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
            return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
            return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo89measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull List<? extends Measurable> noName_0, long j2) {
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            return MeasureScope.DefaultImpls.layout$default(MeasurePolicy, Constraints.m4754getMinWidthimpl(j2), Constraints.m4753getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$measure$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
            return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
            return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
        }
    };

    @Composable
    public static final void Box(@NotNull final Modifier modifier, @Nullable Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-1990469439);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 & 11) ^ 2) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i4 = (((((i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384) << 9) & 7168) | 6;
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
            Updater.m1996setimpl(m1989constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253624692);
            if (((((i4 >> 9) & 14) & 11) ^ 2) == 0 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$Box$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                BoxKt.Box(Modifier.this, composer2, i2 | 1);
            }
        });
    }

    @Composable
    public static final void Box(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1990474327);
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i4 = i2 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z, composer, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14));
        composer.startReplaceableGroup(1376089394);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
        int i5 = ((((i2 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1989constructorimpl = Updater.m1989constructorimpl(composer);
        Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer)), composer, Integer.valueOf((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1253629305);
        if (((((i5 >> 9) & 14) & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final MeasurePolicy boxMeasurePolicy(@NotNull final Alignment alignment, final boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo89measure3p2s80s(@NotNull final MeasureScope MeasurePolicy, @NotNull final List<? extends Measurable> measurables, long j2) {
                int i2;
                int i3;
                BoxKt$boxMeasurePolicy$1$measure$1 boxKt$boxMeasurePolicy$1$measure$1;
                boolean matchesParentSize;
                boolean matchesParentSize2;
                Map map;
                boolean matchesParentSize3;
                Placeable mo3910measureBRTryo0;
                Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    i2 = Constraints.m4754getMinWidthimpl(j2);
                    i3 = Constraints.m4753getMinHeightimpl(j2);
                    map = null;
                    boxKt$boxMeasurePolicy$1$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
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
                    long m4743copyZbe2FdA$default = z ? j2 : Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                    if (measurables.size() == 1) {
                        final Measurable measurable = measurables.get(0);
                        matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
                        if (matchesParentSize3) {
                            i2 = Constraints.m4754getMinWidthimpl(j2);
                            i3 = Constraints.m4753getMinHeightimpl(j2);
                            mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(Constraints.Companion.m4760fixedJhjzzOo(Constraints.m4754getMinWidthimpl(j2), Constraints.m4753getMinHeightimpl(j2)));
                        } else {
                            mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(m4743copyZbe2FdA$default);
                            i2 = Math.max(Constraints.m4754getMinWidthimpl(j2), mo3910measureBRTryo0.getWidth());
                            i3 = Math.max(Constraints.m4753getMinHeightimpl(j2), mo3910measureBRTryo0.getHeight());
                        }
                        final Placeable placeable = mo3910measureBRTryo0;
                        final int i4 = i2;
                        final int i5 = i3;
                        final Alignment alignment2 = alignment;
                        boxKt$boxMeasurePolicy$1$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
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
                                BoxKt.placeInBox(layout, Placeable.this, measurable, MeasurePolicy.getLayoutDirection(), i4, i5, alignment2);
                            }
                        };
                    } else {
                        final Placeable[] placeableArr = new Placeable[measurables.size()];
                        final Ref.IntRef intRef = new Ref.IntRef();
                        intRef.element = Constraints.m4754getMinWidthimpl(j2);
                        final Ref.IntRef intRef2 = new Ref.IntRef();
                        intRef2.element = Constraints.m4753getMinHeightimpl(j2);
                        int size = measurables.size();
                        boolean z2 = false;
                        for (int i6 = 0; i6 < size; i6++) {
                            Measurable measurable2 = measurables.get(i6);
                            matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
                            if (matchesParentSize2) {
                                z2 = true;
                            } else {
                                Placeable mo3910measureBRTryo02 = measurable2.mo3910measureBRTryo0(m4743copyZbe2FdA$default);
                                placeableArr[i6] = mo3910measureBRTryo02;
                                intRef.element = Math.max(intRef.element, mo3910measureBRTryo02.getWidth());
                                intRef2.element = Math.max(intRef2.element, mo3910measureBRTryo02.getHeight());
                            }
                        }
                        if (z2) {
                            int i7 = intRef.element;
                            int i8 = i7 != Integer.MAX_VALUE ? i7 : 0;
                            int i9 = intRef2.element;
                            long Constraints = ConstraintsKt.Constraints(i8, i7, i9 != Integer.MAX_VALUE ? i9 : 0, i9);
                            int size2 = measurables.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                Measurable measurable3 = measurables.get(i10);
                                matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                                if (matchesParentSize) {
                                    placeableArr[i10] = measurable3.mo3910measureBRTryo0(Constraints);
                                }
                            }
                        }
                        i2 = intRef.element;
                        i3 = intRef2.element;
                        final Alignment alignment3 = alignment;
                        boxKt$boxMeasurePolicy$1$measure$1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
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
                                Placeable[] placeableArr2 = placeableArr;
                                List<Measurable> list = measurables;
                                MeasureScope measureScope = MeasurePolicy;
                                Ref.IntRef intRef3 = intRef;
                                Ref.IntRef intRef4 = intRef2;
                                Alignment alignment4 = alignment3;
                                int length = placeableArr2.length;
                                int i11 = 0;
                                int i12 = 0;
                                while (i11 < length) {
                                    Placeable placeable2 = placeableArr2[i11];
                                    if (placeable2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                                    }
                                    BoxKt.placeInBox(layout, placeable2, list.get(i12), measureScope.getLayoutDirection(), intRef3.element, intRef4.element, alignment4);
                                    i11++;
                                    i12++;
                                }
                            }
                        };
                    }
                    map = null;
                }
                return MeasureScope.DefaultImpls.layout$default(MeasurePolicy, i2, i3, map, boxKt$boxMeasurePolicy$1$measure$1, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
                return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
                return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
            }
        };
    }

    private static final BoxChildData getBoxChildData(Measurable measurable) {
        Object parentData = measurable.getParentData();
        return parentData instanceof BoxChildData ? (BoxChildData) parentData : null;
    }

    @NotNull
    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return DefaultBoxMeasurePolicy;
    }

    @NotNull
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildData boxChildData = getBoxChildData(measurable);
        return boxChildData == null ? false : boxChildData.getMatchParentSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i2, int i3, Alignment alignment) {
        Alignment alignment2;
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData != null && (alignment2 = boxChildData.getAlignment()) != null) {
            alignment = alignment2;
        }
        Placeable.PlacementScope.m3962place70tqf50$default(placementScope, placeable, alignment.mo2047alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i2, i3), layoutDirection), 0.0f, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy(@org.jetbrains.annotations.NotNull androidx.compose.ui.Alignment r3, boolean r4, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r5, int r6) {
        /*
            r0 = r3
            java.lang.String r1 = "alignment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            r1 = 2076429144(0x7bc3cb58, float:2.0332444E36)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = r3
            boolean r0 = r0.changed(r1)
            r7 = r0
            r0 = r5
            java.lang.Object r0 = r0.rememberedValue()
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L3e
            r0 = r8
            r9 = r0
            r0 = r8
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L66
        L3e:
            r0 = r3
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L56
            r0 = r4
            if (r0 != 0) goto L56
            androidx.compose.ui.layout.MeasurePolicy r0 = getDefaultBoxMeasurePolicy()
            r3 = r0
            goto L5c
        L56:
            r0 = r3
            r1 = r4
            androidx.compose.ui.layout.MeasurePolicy r0 = boxMeasurePolicy(r0, r1)
            r3 = r0
        L5c:
            r0 = r5
            r1 = r3
            r0.updateRememberedValue(r1)
            r0 = r3
            r9 = r0
        L66:
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r9
            androidx.compose.ui.layout.MeasurePolicy r0 = (androidx.compose.ui.layout.MeasurePolicy) r0
            r3 = r0
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment, boolean, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }
}
