package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureBlocks;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0080\u0001\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010��\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087\bø\u0001��¢\u0006\u0002\u0010\t\u001a\u0098\u0002\u0010��\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042-\u0010\n\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0012\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0013\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0014\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062-\u0010\u0015\u001a)\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000bj\u0002`\u001a¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0001¢\u0006\u0002\u0010\u001b\u001a \u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087\b¢\u0006\u0002\u0010\u001c\u001a:\u0010\u001d\u001a\u00020\u001e2-\u0010\u0015\u001a)\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000bj\u0002`\u001a¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0001\u001a2\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010 \u001a4\u0010!\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0001ø\u0001\u0001¢\u0006\u0002\u0010%\u001aö\u0001\u0010&\u001a\u00020\u001e2-\u0010\n\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0012\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0013\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0014\u001a)\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010¢\u0006\u0002\b\u00112-\u0010\u0015\u001a)\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000bj\u0002`\u001a¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0001\u001aX\u0010'\u001a\u00020\u000f*\u00020(2)\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\u0002\b\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001\u001aX\u0010-\u001a\u00020\u000f*\u00020(2)\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\u0002\b\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001\u001aX\u0010/\u001a\u00020\u000f*\u00020(2)\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\u0002\b\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001\u001aX\u00100\u001a\u00020\u000f*\u00020(2)\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\u0002\b\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Layout", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "minIntrinsicWidthMeasureBlock", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Landroidx/compose/ui/layout/IntrinsicMeasureBlock;", "Lkotlin/ExtensionFunctionType;", "minIntrinsicHeightMeasureBlock", "maxIntrinsicWidthMeasureBlock", "maxIntrinsicHeightMeasureBlock", "measureBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureBlock;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MeasuringIntrinsicsMeasureBlocks", "Landroidx/compose/ui/node/MeasureBlocks;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "measureBlocksOf", "MeasuringMaxIntrinsicHeight", "Landroidx/compose/ui/unit/Density;", "measurables", "w", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "MeasuringMaxIntrinsicWidth", "h", "MeasuringMinIntrinsicHeight", "MeasuringMinIntrinsicWidth", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/LayoutKt.class */
public final class LayoutKt {
    @Composable
    public static final void Layout(@Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(1376091099);
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier materialize = ComposedModifierKt.materialize(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        final Function0<ComposeUiNode> constructor = companion.getConstructor();
        composer.startReplaceableGroup(1546164872);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ComposeUiNode invoke() {
                    return Function0.this.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1989constructorimpl = Updater.m1989constructorimpl(composer);
        Updater.m1996setimpl(m1989constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1996setimpl(m1989constructorimpl, materialize, companion.getSetModifier());
        composer.enableReusing();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void Layout(@NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(1376089394);
        if ((i3 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = materializerOf(modifier);
        int i4 = ((i2 << 9) & 7168) | 6;
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
        Updater.m1996setimpl(m1989constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i4 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "This composable was deprecated. Please use the alternative Layout overloads instead.")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Layout(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r13, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r15, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r16, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, ? super java.lang.Integer, java.lang.Integer> r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.MeasureScope, ? super java.util.List<? extends androidx.compose.ui.layout.Measurable>, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutKt.Layout(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(message = "MeasuringIntrinsicsMeasureBlocks was deprecated. Please use MeasurePolicy instead.")
    @NotNull
    public static final MeasureBlocks MeasuringIntrinsicsMeasureBlocks(@NotNull final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt$MeasuringIntrinsicsMeasureBlocks$1
            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                int MeasuringMaxIntrinsicHeight;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMaxIntrinsicHeight = LayoutKt.MeasuringMaxIntrinsicHeight(intrinsicMeasureScope, measureBlock, measurables, i2, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMaxIntrinsicHeight;
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                int MeasuringMaxIntrinsicWidth;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMaxIntrinsicWidth = LayoutKt.MeasuringMaxIntrinsicWidth(intrinsicMeasureScope, measureBlock, measurables, i2, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMaxIntrinsicWidth;
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            @NotNull
            /* renamed from: measure-3p2s80s  reason: not valid java name */
            public MeasureResult mo3932measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long j2) {
                Intrinsics.checkNotNullParameter(measureScope, "measureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measureBlock.invoke(measureScope, measurables, Constraints.m4740boximpl(j2));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                int MeasuringMinIntrinsicHeight;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMinIntrinsicHeight = LayoutKt.MeasuringMinIntrinsicHeight(intrinsicMeasureScope, measureBlock, measurables, i2, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMinIntrinsicHeight;
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                int MeasuringMinIntrinsicWidth;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMinIntrinsicWidth = LayoutKt.MeasuringMinIntrinsicWidth(intrinsicMeasureScope, measureBlock, measurables, i2, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMinIntrinsicWidth;
            }

            @NotNull
            public String toString() {
                return JvmActuals_jvmKt.simpleIdentityToString(this, "MeasuringIntrinsicsMeasureBlocks") + "{ measureBlock=" + JvmActuals_jvmKt.simpleIdentityToString(measureBlock, null) + " }";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicHeight(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i2, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m4740boximpl(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null))).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicWidth(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i2, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m4740boximpl(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null))).getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicHeight(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i2, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m4740boximpl(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null))).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicWidth(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i2, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m4740boximpl(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null))).getWidth();
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @Composable
    public static final void MultiMeasureLayout(@Nullable Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @NotNull final MeasurePolicy measurePolicy, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(-850547527);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4;
            if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i5 = i4 | (startRestartGroup.changed(content) ? 32 : 16);
            }
        }
        if ((i3 & 4) != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5;
            if ((i2 & 896) == 0) {
                i6 = i5 | (startRestartGroup.changed(measurePolicy) ? 256 : 128);
            }
        }
        if (((i6 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            startRestartGroup.startReplaceableGroup(1546167803);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1989constructorimpl = Updater.m1989constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m1996setimpl(m1989constructorimpl, materialize, companion.getSetModifier());
            Updater.m1996setimpl(m1989constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m1993initimpl(m1989constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode init) {
                    Intrinsics.checkNotNullParameter(init, "$this$init");
                    init.setCanMultiMeasure$ui_release(true);
                }
            });
            startRestartGroup.enableReusing();
            content.invoke(startRestartGroup, Integer.valueOf(((((i6 << 3) & 896) | 6) >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier2 = modifier;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
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
                LayoutKt.MultiMeasureLayout(Modifier.this, content, measurePolicy, composer2, i2 | 1, i3);
            }
        });
    }

    @PublishedApi
    @NotNull
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(@NotNull final Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-985542424, true, new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m3934invokeDeg8D_g(skippableUpdater.m1984unboximpl(), composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            /* renamed from: invoke-Deg8D_g  reason: not valid java name */
            public final void m3934invokeDeg8D_g(@NotNull Composer composer, @Nullable Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(composer, "$this$null");
                Modifier materialize = ComposedModifierKt.materialize(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Updater.m1996setimpl(Updater.m1989constructorimpl(composer), materialize, ComposeUiNode.Companion.getSetModifier());
                composer.endReplaceableGroup();
            }
        });
    }

    @Deprecated(message = "MeasureBlocks was deprecated. Please use MeasurePolicy and the Layout overloads using it instead.")
    @NotNull
    public static final MeasureBlocks measureBlocksOf(@NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> minIntrinsicWidthMeasureBlock, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> minIntrinsicHeightMeasureBlock, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> maxIntrinsicWidthMeasureBlock, @NotNull final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> maxIntrinsicHeightMeasureBlock, @NotNull final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(minIntrinsicWidthMeasureBlock, "minIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(minIntrinsicHeightMeasureBlock, "minIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicWidthMeasureBlock, "maxIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicHeightMeasureBlock, "maxIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt$measureBlocksOf$1
            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i2)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i2)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo3932measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long j2) {
                Intrinsics.checkNotNullParameter(measureScope, "measureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measureBlock.invoke(measureScope, measurables, Constraints.m4740boximpl(j2));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i2)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i2)).intValue();
            }
        };
    }
}
