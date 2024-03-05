package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��h\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H��\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��*b\b\u0002\u0010%\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f¨\u0006("}, d2 = {"SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutWithScale", "", "current", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SnackbarHost", "hostState", "Landroidx/compose/material/SnackbarHostState;", "snackbar", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "toMillis", "", "Landroidx/compose/material/SnackbarDuration;", "hasAction", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutTransition", "Lkotlin/ParameterName;", "name", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SnackbarHostKt.class */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SnackbarHostKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void FadeInFadeOutWithScale(final SnackbarData snackbarData, Modifier modifier, final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int collectionSizeOrDefault;
        final List mutableList;
        List<SnackbarData> filterNotNull;
        Composer startRestartGroup = composer.startRestartGroup(-1656515806);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i2;
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
                i6 = i5 | (startRestartGroup.changed(function3) ? 256 : 128);
            }
        }
        if (((i6 & 731) ^ 146) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            FadeInFadeOutState fadeInFadeOutState = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                fadeInFadeOutState = new FadeInFadeOutState();
                startRestartGroup.updateRememberedValue(fadeInFadeOutState);
            }
            startRestartGroup.endReplaceableGroup();
            final FadeInFadeOutState fadeInFadeOutState2 = (FadeInFadeOutState) fadeInFadeOutState;
            if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState2.getCurrent())) {
                fadeInFadeOutState2.setCurrent(snackbarData);
                List<FadeInFadeOutAnimationItem> items = fadeInFadeOutState2.getItems();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem : items) {
                    arrayList.add((SnackbarData) fadeInFadeOutAnimationItem.getKey());
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                fadeInFadeOutState2.getItems().clear();
                filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(mutableList);
                List items2 = fadeInFadeOutState2.getItems();
                for (final SnackbarData snackbarData2 : filterNotNull) {
                    items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambdaInstance(-985541570, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x018d  */
                        @androidx.compose.runtime.Composable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void invoke(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, int r22) {
                            /*
                                Method dump skipped, instructions count: 573
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke(kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
                        }
                    })));
                }
            }
            int i8 = (i6 >> 3) & 14;
            startRestartGroup.startReplaceableGroup(-1990474327);
            int i9 = i8 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i9 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i9 & 14));
            startRestartGroup.startReplaceableGroup(1376089394);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i10 = ((((i8 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) << 9) & 7168) | 6;
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
            Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
            Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i10 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253629305);
            if (((((i10 >> 9) & 14) & 11) ^ 2) == 0 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1050268607);
                if ((((((i8 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6) & 81) ^ 16) == 0 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    int i11 = 0;
                    fadeInFadeOutState2.setScope(ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
                    List items3 = fadeInFadeOutState2.getItems();
                    int size = items3.size();
                    while (true) {
                        int i12 = i11;
                        if (i12 >= size) {
                            break;
                        }
                        i11 = i12 + 1;
                        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) items3.get(i12);
                        final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem2.component1();
                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> component2 = fadeInFadeOutAnimationItem2.component2();
                        startRestartGroup.startMovableGroup(-208579897, snackbarData3);
                        final int i13 = i6;
                        component2.invoke(ComposableLambdaKt.composableLambda(startRestartGroup, -819901460, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                            public final void invoke(@Nullable Composer composer2, int i14) {
                                if (((i14 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Function3<SnackbarData, Composer, Integer, Unit> function32 = function3;
                                SnackbarData snackbarData4 = snackbarData3;
                                Intrinsics.checkNotNull(snackbarData4);
                                function32.invoke(snackbarData4, composer2, Integer.valueOf((i13 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            }
                        }), startRestartGroup, 6);
                        startRestartGroup.endMovableGroup();
                    }
                }
                startRestartGroup.endReplaceableGroup();
            }
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
        final Modifier modifier2 = modifier;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
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

            public final void invoke(@Nullable Composer composer2, int i14) {
                SnackbarHostKt.FadeInFadeOutWithScale(SnackbarData.this, modifier2, function3, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SnackbarHost(@org.jetbrains.annotations.NotNull final androidx.compose.material.SnackbarHostState r9, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r10, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.SnackbarHost(androidx.compose.material.SnackbarHostState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, Function0<Unit> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-731820156);
        if ((i3 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Animatable animatable = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            animatable = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(animatable);
        }
        composer.endReplaceableGroup();
        Animatable animatable2 = (Animatable) animatable;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SnackbarHostKt$animatedOpacity$2(animatable2, z, animationSpec, function0, null), composer, (i2 >> 3) & 14);
        State<Float> asState = animatable2.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i2) {
        composer.startReplaceableGroup(-684820976);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Animatable animatable = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            animatable = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(animatable);
        }
        composer.endReplaceableGroup();
        Animatable animatable2 = (Animatable) animatable;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SnackbarHostKt$animatedScale$1(animatable2, z, animationSpec, null), composer, (i2 >> 3) & 14);
        State<Float> asState = animatable2.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    public static final long toMillis(@NotNull SnackbarDuration snackbarDuration, boolean z, @Nullable AccessibilityManager accessibilityManager) {
        long j2;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i2 == 1) {
            j2 = Long.MAX_VALUE;
        } else if (i2 == 2) {
            j2 = 10000;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            j2 = 4000;
        }
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }
}
