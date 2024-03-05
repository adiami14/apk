package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��B\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aS\u0010\u001e\u001a\u00020\u00112\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0002\u0010!\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\"\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\"\u0019\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\"\u0019\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\"\u0019\u0010\u000e\u001a\u00020\u0004X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"BadgeContentFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "BadgeHorizontalOffset", "Landroidx/compose/ui/unit/Dp;", "getBadgeHorizontalOffset", "()F", "F", "BadgeRadius", "getBadgeRadius", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Badge", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgedBox", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/BadgeKt.class */
public final class BadgeKt {
    private static final float BadgeHorizontalOffset;
    private static final float BadgeRadius;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentRadius = Dp.m4785constructorimpl(8);
    private static final long BadgeContentFontSize = TextUnitKt.getSp(10);
    private static final float BadgeWithContentHorizontalOffset = Dp.m4785constructorimpl(-Dp.m4785constructorimpl(6));

    static {
        float f2 = 4;
        BadgeRadius = Dp.m4785constructorimpl(f2);
        BadgeWithContentHorizontalPadding = Dp.m4785constructorimpl(f2);
        BadgeHorizontalOffset = Dp.m4785constructorimpl(-Dp.m4785constructorimpl(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: Badge-eopBjH0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1149BadgeeopBjH0(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r12, long r13, long r15, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BadgeKt.m1149BadgeeopBjH0(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final void BadgedBox(@NotNull final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> badge, @Nullable Modifier modifier, @NotNull final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1218142727);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(badge) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4;
            if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i5 = i4 | (startRestartGroup.changed(modifier) ? 32 : 16);
            }
        }
        if ((i3 & 4) != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5;
            if ((i2 & 896) == 0) {
                i6 = i5 | (startRestartGroup.changed(content) ? 256 : 128);
            }
        }
        if (((i6 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            BadgeKt$BadgedBox$2 badgeKt$BadgedBox$2 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo89measure3p2s80s(@NotNull final MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
                    Map<AlignmentLine, Integer> mapOf;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                            final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(Constraints.m4743copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                            for (Measurable measurable2 : measurables) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                    final Placeable mo3910measureBRTryo02 = measurable2.mo3910measureBRTryo0(j2);
                                    int i8 = mo3910measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                                    int i9 = mo3910measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                                    int width = mo3910measureBRTryo02.getWidth();
                                    int height = mo3910measureBRTryo02.getHeight();
                                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(i8)), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(i9)));
                                    return Layout.layout(width, height, mapOf, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                            float badgeWithContentHorizontalOffset = Placeable.this.getWidth() > Layout.mo518roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                                            Placeable.PlacementScope.placeRelative$default(layout, mo3910measureBRTryo02, 0, 0, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, mo3910measureBRTryo02.getWidth() + Layout.mo518roundToPx0680j_4(badgeWithContentHorizontalOffset), (-Placeable.this.getHeight()) / 2, 0.0f, 4, null);
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i8) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i8);
                }
            };
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i8 = (((i6 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
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
            Updater.m1996setimpl(m1989constructorimpl, badgeKt$BadgedBox$2, companion.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1649829580);
            if (((((i8 >> 9) & 14) & 11) ^ 2) == 0 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.Companion;
                Alignment center = companion3.getCenter();
                int i9 = ((i6 << 3) & 7168) | 54;
                startRestartGroup.startReplaceableGroup(-1990474327);
                int i10 = i9 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, (i10 & 14) | (i10 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                startRestartGroup.startReplaceableGroup(1376089394);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
                int i11 = ((((i9 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
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
                Updater.m1996setimpl(m1989constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1996setimpl(m1989constructorimpl2, density2, companion.getSetDensity());
                Updater.m1996setimpl(m1989constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
                Updater.m1996setimpl(m1989constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i11 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i11 >> 9) & 14) & 11) ^ 2) == 0 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    content.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i9 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier layoutId2 = LayoutIdKt.layoutId(companion2, "badge");
                int i12 = ((i6 << 9) & 7168) | 6;
                startRestartGroup.startReplaceableGroup(-1990474327);
                Alignment topStart = companion3.getTopStart();
                int i13 = i12 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topStart, false, startRestartGroup, (i13 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i13 & 14));
                startRestartGroup.startReplaceableGroup(1376089394);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId2);
                int i14 = ((((i12 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
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
                Updater.m1996setimpl(m1989constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1996setimpl(m1989constructorimpl3, density3, companion.getSetDensity());
                Updater.m1996setimpl(m1989constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m1996setimpl(m1989constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i14 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i14 >> 9) & 14) & 11) ^ 2) == 0 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    badge.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i12 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                }
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
        final Modifier modifier2 = modifier;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$3
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                BadgeKt.BadgedBox(badge, modifier2, content, composer2, i2 | 1, i3);
            }
        });
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeWithContentRadius;
    }
}
