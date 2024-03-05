package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.messaging.Constants;
import j.l;
import j.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0086\u0001\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\"\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0002\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b��\u0010\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00182#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001aH\u0007¢\u0006\u0002\u0010\u001f\u001aI\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b��\u0010\u0002*\u00020\u00152\u0006\u0010!\u001a\u0002H\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020#0\u001a2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0001¢\u0006\u0002\u0010$\u001a-\u0010%\u001a\u0004\u0018\u00010\t\"\u0004\b��\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00020&2\u0006\u0010'\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010(\u001a¹\u0001\u0010)\u001a\u00020*\"\u0004\b��\u0010\u0002*\u00020*2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00020&2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u001e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010028\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(1\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002030\u000f2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u0010\u0011\u001a\u000206H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b7\u00108\"*\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "T", "Landroidx/compose/material/SwipeableState;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "computeTarget", "", "offset", "lastValue", "anchors", "", "thresholds", "Lkotlin/Function2;", "velocity", "velocityThreshold", "findBounds", "", "rememberSwipeableState", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "rememberSwipeableStateFor", "value", "onValueChange", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "getOffset", "", "state", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "swipeable", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", Constants.MessagePayloadKeys.FROM, "to", "Landroidx/compose/material/ThresholdConfig;", "resistance", "Landroidx/compose/material/ResistanceConfig;", "Landroidx/compose/ui/unit/Dp;", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableKt.class */
public final class SwipeableKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
        if (r5 < r8.invoke(java.lang.Float.valueOf(r12), java.lang.Float.valueOf(r0)).floatValue()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r5 > r8.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r12)).floatValue()) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float computeTarget(float r5, float r6, java.util.Set<java.lang.Float> r7, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r8, float r9, float r10) {
        /*
            r0 = r5
            r1 = r7
            java.util.List r0 = findBounds(r0, r1)
            r7 = r0
            r0 = r7
            int r0 = r0.size()
            r11 = r0
            r0 = r6
            r12 = r0
            r0 = r11
            if (r0 == 0) goto La9
            r0 = r11
            r1 = 1
            if (r0 == r1) goto L9a
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r12 = r0
            r0 = r7
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r13 = r0
            r0 = r6
            r1 = r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L69
            r0 = r9
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L4b
            r0 = r13
            return r0
        L4b:
            r0 = r5
            r1 = r8
            r2 = r12
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = r13
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r1 = r1.invoke(r2, r3)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L90
            goto L97
        L69:
            r0 = r9
            r1 = r10
            float r1 = -r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L75
            r0 = r12
            return r0
        L75:
            r0 = r5
            r1 = r8
            r2 = r13
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = r12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r1 = r1.invoke(r2, r3)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L97
        L90:
            r0 = r13
            r12 = r0
            goto La9
        L97:
            goto La9
        L9a:
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r12 = r0
        La9:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.computeTarget(float, float, java.util.Set, kotlin.jvm.functions.Function2, float, float):float");
    }

    public static final List<Float> findBounds(float f2, Set<Float> set) {
        Float m6298maxOrNull;
        Float m6306minOrNull;
        List<Float> listOf;
        List<Float> list;
        List<Float> listOf2;
        List<Float> listOfNotNull;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).floatValue() <= f2 + 0.001d) {
                arrayList.add(next);
            }
        }
        m6298maxOrNull = CollectionsKt___CollectionsKt.m6298maxOrNull((Iterable<Float>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (((double) ((Number) obj).floatValue()) >= ((double) f2) - 0.001d) {
                arrayList2.add(obj);
            }
        }
        m6306minOrNull = CollectionsKt___CollectionsKt.m6306minOrNull((Iterable<Float>) arrayList2);
        if (m6298maxOrNull == null) {
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m6306minOrNull);
            list = listOfNotNull;
        } else if (m6306minOrNull == null || Intrinsics.areEqual(m6298maxOrNull, m6306minOrNull)) {
            listOf2 = CollectionsKt__CollectionsJVMKt.listOf(m6298maxOrNull);
            list = listOf2;
        } else {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{m6298maxOrNull, m6306minOrNull});
            list = listOf;
        }
        return list;
    }

    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t2) {
        T t3;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t3 = null;
                break;
            }
            t3 = it.next();
            if (Intrinsics.areEqual(((Map.Entry) t3).getValue(), t2)) {
                break;
            }
        }
        Map.Entry entry = t3;
        return entry == null ? null : (Float) entry.getKey();
    }

    @NotNull
    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(@NotNull SwipeableState<T> swipeableState) {
        Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableState(@NotNull final T initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super T, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1095461734);
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((SwipeableKt$rememberSwipeableState$1<T>) obj);
                }
            };
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        final Function1<? super T, Boolean> function12 = function1;
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) SwipeableState.Companion.Saver(animationSpec, function1), (String) null, (Function0<? extends Object>) new Function0<SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SwipeableState<T> invoke() {
                return new SwipeableState<>(initialValue, animationSpec2, function12);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return invoke();
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(@NotNull final T value, @NotNull final Function1<? super T, Unit> onValueChange, @Nullable AnimationSpec<Float> animationSpec, @Nullable Composer composer, int i2, int i3) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1177155487);
        SpringSpec<Float> springSpec = animationSpec;
        if ((i3 & 4) != 0) {
            springSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        SwipeableState swipeableState = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            swipeableState = new SwipeableState(value, springSpec, new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1<T>) obj);
                }
            });
            composer.updateRememberedValue(swipeableState);
        }
        composer.endReplaceableGroup();
        final SwipeableState<T> swipeableState2 = (SwipeableState) swipeableState;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        MutableState mutableState = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            mutableState = mutableStateOf$default;
            composer.updateRememberedValue(mutableState);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) mutableState;
        Object value2 = mutableState2.getValue();
        SwipeableKt$rememberSwipeableStateFor$1 swipeableKt$rememberSwipeableStateFor$1 = new SwipeableKt$rememberSwipeableStateFor$1(value, swipeableState2, null);
        int i4 = i2 & 8;
        EffectsKt.LaunchedEffect(value, value2, swipeableKt$rememberSwipeableStateFor$1, composer, (i2 & 14) | i4);
        EffectsKt.DisposableEffect(swipeableState2.getCurrentValue(), new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @NotNull
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final DisposableEffectResult invoke2(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!Intrinsics.areEqual(value, swipeableState2.getCurrentValue())) {
                    onValueChange.invoke(swipeableState2.getCurrentValue());
                    MutableState<Boolean> mutableState3 = mutableState2;
                    mutableState3.setValue(Boolean.valueOf(!mutableState3.getValue().booleanValue()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                return invoke2(disposableEffectScope);
            }
        }, composer, i4);
        composer.endReplaceableGroup();
        return swipeableState2;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: swipeable-pPrIpRY */
    public static final <T> Modifier m1542swipeablepPrIpRY(@NotNull Modifier swipeable, @NotNull final SwipeableState<T> state, @NotNull final Map<Float, ? extends T> anchors, @NotNull final Orientation orientation, final boolean z, final boolean z2, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super T, ? super T, ? extends ThresholdConfig> thresholds, @Nullable final ResistanceConfig resistanceConfig, final float f2) {
        Intrinsics.checkNotNullParameter(swipeable, "$this$swipeable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        return ComposedModifierKt.composed(swipeable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SwipeableKt$swipeable_pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", SwipeableState.this);
                inspectorInfo.getProperties().set("anchors", anchors);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", thresholds);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", Dp.m4783boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3

            @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {607}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableKt$swipeable$3$3.class */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Map<Float, T> $anchors;
                public final /* synthetic */ Density $density;
                public final /* synthetic */ ResistanceConfig $resistance;
                public final /* synthetic */ SwipeableState<T> $state;
                public final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
                public final /* synthetic */ float $velocityThreshold;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f2, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$state = swipeableState;
                    this.$anchors = map;
                    this.$resistance = resistanceConfig;
                    this.$density = density;
                    this.$thresholds = function2;
                    this.$velocityThreshold = f2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Map anchors$material_release = this.$state.getAnchors$material_release();
                        this.$state.setAnchors$material_release(this.$anchors);
                        this.$state.setResistance$material_release(this.$resistance);
                        SwipeableState<T> swipeableState = this.$state;
                        final Map<Float, T> map = this.$anchors;
                        final Function2<T, T, ThresholdConfig> function2 = this.$thresholds;
                        final Density density = this.$density;
                        swipeableState.setThresholds$material_release(new Function2<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableKt.swipeable.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @NotNull
                            public final Float invoke(float f2, float f3) {
                                Object value;
                                Object value2;
                                value = MapsKt__MapsKt.getValue(map, Float.valueOf(f2));
                                value2 = MapsKt__MapsKt.getValue(map, Float.valueOf(f3));
                                return Float.valueOf(function2.invoke(value, value2).computeThreshold(density, f2, f3));
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Float invoke(Float f2, Float f3) {
                                return invoke(f2.floatValue(), f3.floatValue());
                            }
                        });
                        this.$state.setVelocityThreshold$material_release(this.$density.mo524toPx0680j_4(this.$velocityThreshold));
                        SwipeableState<T> swipeableState2 = this.$state;
                        Object obj2 = this.$anchors;
                        this.label = 1;
                        if (swipeableState2.processNewAnchors$material_release(anchors$material_release, obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableKt$swipeable$3$4.class */
            public static final class AnonymousClass4 extends SuspendLambda implements Function3<u0, Float, Continuation<? super Unit>, Object> {
                public final /* synthetic */ SwipeableState<T> $state;
                public /* synthetic */ float F$0;
                private /* synthetic */ Object L$0;
                public int label;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1  reason: invalid class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableKt$swipeable$3$4$1.class */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ SwipeableState<T> $state;
                    public final /* synthetic */ float $velocity;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SwipeableState<T> swipeableState, float f2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$state = swipeableState;
                        this.$velocity = f2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$state, this.$velocity, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            SwipeableState<T> swipeableState = this.$state;
                            float f2 = this.$velocity;
                            this.label = 1;
                            if (swipeableState.performFling(f2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(SwipeableState<T> swipeableState, Continuation<? super AnonymousClass4> continuation) {
                    super(3, continuation);
                    this.$state = swipeableState;
                }

                @Nullable
                public final Object invoke(@NotNull u0 u0Var, float f2, @Nullable Continuation<? super Unit> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$state, continuation);
                    anonymousClass4.L$0 = u0Var;
                    anonymousClass4.F$0 = f2;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Float f2, Continuation<? super Unit> continuation) {
                    return invoke(u0Var, f2.floatValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        l.f((u0) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                List distinct;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1735465469);
                boolean z3 = true;
                if (!anchors.isEmpty()) {
                    distinct = CollectionsKt___CollectionsKt.distinct(anchors.values());
                    if (distinct.size() != anchors.size()) {
                        z3 = false;
                    }
                    if (z3) {
                        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                        state.ensureInit$material_release(anchors);
                        Map<Float, T> map = anchors;
                        SwipeableState<T> swipeableState = state;
                        EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3(swipeableState, map, resistanceConfig, density, thresholds, f2, null), composer, 8);
                        Modifier draggable$default = DraggableKt.draggable$default(Modifier.Companion, state.getDraggableState$material_release(), orientation, z, mutableInteractionSource, state.isAnimationRunning(), null, new AnonymousClass4(state, null), z2, 32, null);
                        composer.endReplaceableGroup();
                        return draggable$default;
                    }
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
                }
                throw new IllegalArgumentException("You must have at least one anchor.".toString());
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    /* renamed from: swipeable-pPrIpRY$default */
    public static /* synthetic */ Modifier m1543swipeablepPrIpRY$default(Modifier modifier, SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, Function2 function2, ResistanceConfig resistanceConfig, float f2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 64) != 0) {
            function2 = new Function2<Object, Object, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(Object obj2, Object obj3) {
                    return new FixedThreshold(Dp.m4785constructorimpl(56), null);
                }
            };
        }
        if ((i2 & 128) != 0) {
            resistanceConfig = SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, null);
        }
        if ((i2 & 256) != 0) {
            f2 = SwipeableDefaults.INSTANCE.m1541getVelocityThresholdD9Ej5fM();
        }
        return m1542swipeablepPrIpRY(modifier, swipeableState, map, orientation, z, z2, mutableInteractionSource, function2, resistanceConfig, f2);
    }
}
