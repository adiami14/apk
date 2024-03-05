package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��l\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aõ\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a^\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0#2\u001d\u0010+\u001a\u0019\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00040,¢\u0006\u0002\b\tH\u0003ø\u0001��¢\u0006\u0002\u0010.\u001a3\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u001a2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00102\u001a\u00020\u0014H\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001aE\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00062\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020-082\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010:\u001a\u00020$H\u0007¢\u0006\u0002\u0010;\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", "target", "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/BackdropScaffoldKt.class */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m4785constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        float coerceIn;
        float coerceIn2;
        Composer startRestartGroup = composer.startRestartGroup(-1142038671);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(backdropValue) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(function2) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(function22) ? 256 : 128);
        }
        if (((i5 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            float mo524toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo524toPx0680j_4(AnimationSlideOffset);
            float m1132BackLayerTransition$lambda7 = m1132BackLayerTransition$lambda7(animateFloatAsState);
            float f2 = 1;
            coerceIn = RangesKt___RangesKt.coerceIn(m1132BackLayerTransition$lambda7 - f2, 0.0f, 1.0f);
            coerceIn2 = RangesKt___RangesKt.coerceIn(f2 - m1132BackLayerTransition$lambda7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(-1990474327);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl, density, companion3.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1538629202);
            Modifier m2552graphicsLayer2Xn7asI$default = GraphicsLayerModifierKt.m2552graphicsLayer2Xn7asI$default(ZIndexModifierKt.zIndex(companion, coerceIn), 0.0f, 0.0f, coerceIn, 0.0f, (f2 - coerceIn) * mo524toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16363, null);
            startRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m2552graphicsLayer2Xn7asI$default);
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
            Updater.m1996setimpl(m1989constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl2, density2, companion3.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253629305);
            startRestartGroup.startReplaceableGroup(-481855329);
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m2552graphicsLayer2Xn7asI$default2 = GraphicsLayerModifierKt.m2552graphicsLayer2Xn7asI$default(ZIndexModifierKt.zIndex(companion, coerceIn2), 0.0f, 0.0f, coerceIn2, 0.0f, (f2 - coerceIn2) * (-mo524toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16363, null);
            startRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m2552graphicsLayer2Xn7asI$default2);
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
            Updater.m1996setimpl(m1989constructorimpl3, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl3, density3, companion3.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253629305);
            startRestartGroup.startReplaceableGroup(-481855090);
            function22.invoke(startRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$2
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
                BackdropScaffoldKt.BackLayerTransition(BackdropValue.this, function2, function22, composer2, i2 | 1);
            }
        });
    }

    /* renamed from: BackLayerTransition$lambda-7  reason: not valid java name */
    private static final float m1132BackLayerTransition$lambda7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x080a, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BackdropScaffold-BZszfkY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1133BackdropScaffoldBZszfkY(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r33, @org.jetbrains.annotations.Nullable androidx.compose.material.BackdropScaffoldState r34, boolean r35, float r36, float r37, boolean r38, boolean r39, long r40, long r42, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r44, float r45, long r46, long r48, long r50, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m1133BackdropScaffoldBZszfkY(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L44;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BackdropStack(final androidx.compose.ui.Modifier r9, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r10, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> r11, final kotlin.jvm.functions.Function4<? super androidx.compose.ui.unit.Constraints, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.BackdropStack(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1134Scrim3JVO9M(final long r9, final kotlin.jvm.functions.Function0<kotlin.Unit> r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m1134Scrim3JVO9M(long, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-4  reason: not valid java name */
    public static final float m1135Scrim_3J_VO9M$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@NotNull final BackdropValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super BackdropValue, Boolean> function1, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(380713820);
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BackdropValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i3 & 8) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            SnackbarHostState snackbarHostState2 = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                snackbarHostState2 = new SnackbarHostState();
                composer.updateRememberedValue(snackbarHostState2);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) snackbarHostState2;
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        final Function1<? super BackdropValue, Boolean> function12 = function1;
        final SnackbarHostState snackbarHostState3 = snackbarHostState;
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m2016rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver<Object, ? extends Object>) BackdropScaffoldState.Companion.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0<? extends Object>) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BackdropScaffoldState invoke() {
                return new BackdropScaffoldState(BackdropValue.this, animationSpec2, function12, snackbarHostState3);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}
