package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.i;
import o.j;
import o.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Stable
@Metadata(bv = {}, d1 = {"��t\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018�� z*\u0004\b��\u0010\u00012\u00020\u0002:\u0001zBD\u0012\u0006\u0010w\u001a\u00028��\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012#\b\u0002\u0010(\u001a\u001d\u0012\u0013\u0012\u00118��¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0#¢\u0006\u0004\bx\u0010yJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0082@ø\u0001��¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028��0\fH��¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028��0\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028��0\fH\u0080@ø\u0001��¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028��H\u0087@ø\u0001��¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028��2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0087@ø\u0001��¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0003H\u0086@ø\u0001��¢\u0006\u0004\b\u001c\u0010\u0007J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b8��X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R5\u0010(\u001a\u001d\u0012\u0013\u0012\u00118��¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0#8��X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00103\u001a\u00028��2\u0006\u0010,\u001a\u00028��8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020'2\u0006\u0010,\u001a\u00020'8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010.R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0003098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010.RC\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028��0\f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028��0\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010.\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u000fR&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028��0\f0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00038��@��X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\u00038��@��X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KRO\u0010U\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030O2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030O8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010.\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR+\u0010Y\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010.\u001a\u0004\bW\u0010I\"\u0004\bX\u0010KR/\u0010`\u001a\u0004\u0018\u00010Z2\b\u0010,\u001a\u0004\u0018\u00010Z8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010.\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010b\u001a\u00020a8��X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00030f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030f8F¢\u0006\u0006\u001a\u0004\bj\u0010hR\u001a\u0010\u0015\u001a\u00028��8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010n\u001a\u0004\bl\u00100R \u0010s\u001a\b\u0012\u0004\u0012\u00028��0o8FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010n\u001a\u0004\bp\u0010qR\u001a\u0010v\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010n\u001a\u0004\bt\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006{"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "", "target", "", "snapInternalToOffset", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "spec", "animateInternalToOffset", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "performFling", "delta", "performDrag", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning$delegate", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "Landroidx/compose/runtime/MutableState;", "offsetState", "overflowState", "absoluteOffset", "animationTarget", "anchors$delegate", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "Lo/i;", "latestNonEmptyAnchorsFlow", "Lo/i;", "minBound", "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "maxBound", "getMaxBound$material_release", "setMaxBound$material_release", "Lkotlin/Function2;", "thresholds$delegate", "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "velocityThreshold$delegate", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "resistance$delegate", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offset", "getOverflow", "overflow", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", NotificationCompat.CATEGORY_PROGRESS, "getDirection", "getDirection$annotations", "direction", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalMaterialApi
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState.class */
public class SwipeableState<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final MutableState<Float> absoluteOffset;
    @NotNull
    private final MutableState anchors$delegate;
    @NotNull
    private final AnimationSpec<Float> animationSpec;
    @NotNull
    private final MutableState<Float> animationTarget;
    @NotNull
    private final Function1<T, Boolean> confirmStateChange;
    @NotNull
    private final MutableState currentValue$delegate;
    @NotNull
    private final DraggableState draggableState;
    @NotNull
    private final MutableState isAnimationRunning$delegate;
    @NotNull
    private final i<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    @NotNull
    private final MutableState<Float> offsetState;
    @NotNull
    private final MutableState<Float> overflowState;
    @NotNull
    private final MutableState resistance$delegate;
    @NotNull
    private final MutableState thresholds$delegate;
    @NotNull
    private final MutableState velocityThreshold$delegate;

    @Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Saver<SwipeableState<T>, T> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super T, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(new Function2<SaverScope, SwipeableState<T>, T>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$1
                @Nullable
                public final T invoke(@NotNull SaverScope Saver, @NotNull SwipeableState<T> it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Object obj) {
                    return invoke(saverScope, (SwipeableState) ((SwipeableState) obj));
                }
            }, new Function1<T, SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final SwipeableState<T> invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new SwipeableState<>(it, animationSpec, confirmStateChange);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((SwipeableState$Companion$Saver$2<T>) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t2, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmStateChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        MutableState<Float> mutableStateOf$default4;
        MutableState<Float> mutableStateOf$default5;
        MutableState<Float> mutableStateOf$default6;
        Map emptyMap;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        MutableState mutableStateOf$default10;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isAnimationRunning$delegate = mutableStateOf$default2;
        Float valueOf = Float.valueOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.offsetState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.overflowState = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.absoluteOffset = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget = mutableStateOf$default6;
        emptyMap = MapsKt__MapsKt.emptyMap();
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyMap, null, 2, null);
        this.anchors$delegate = mutableStateOf$default7;
        final i snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            public final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Float, T> invoke() {
                return this.this$0.getAnchors$material_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = k.T1(new i<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            @Metadata(bv = {}, d1 = {"��\u0013\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028��H\u0096@ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$a$b"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$special$$inlined$filter$1$2.class */
            public static final class AnonymousClass2 implements j<Map<Float, ? extends T>> {
                public final /* synthetic */ j $this_unsafeFlow$inlined;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableState$special$$inlined$filter$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow$inlined = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L28
                        r0 = r7
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        r8 = r0
                        r0 = r8
                        int r0 = r0.label
                        r9 = r0
                        r0 = r9
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L28
                        r0 = r8
                        r1 = r9
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r8
                        r7 = r0
                        goto L32
                    L28:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r3)
                        r7 = r0
                    L32:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r8 = r0
                        r0 = r7
                        int r0 = r0.label
                        r9 = r0
                        r0 = r9
                        if (r0 == 0) goto L5f
                        r0 = r9
                        r1 = 1
                        if (r0 != r1) goto L55
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L8c
                    L55:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5f:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r5
                        o.j r0 = r0.$this_unsafeFlow$inlined
                        r10 = r0
                        r0 = r6
                        java.util.Map r0 = (java.util.Map) r0
                        boolean r0 = r0.isEmpty()
                        r1 = 1
                        r0 = r0 ^ r1
                        if (r0 == 0) goto L8c
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r10
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r8
                        if (r0 != r1) goto L8c
                        r0 = r8
                        return r0
                    L8c:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // o.i
            @Nullable
            public Object collect(@NotNull j jVar, @NotNull Continuation continuation) {
                Object coroutine_suspended;
                Object collect = i.this.collect(new AnonymousClass2(jVar), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return collect == coroutine_suspended ? collect : Unit.INSTANCE;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function2<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableState$thresholds$2
            @NotNull
            public final Float invoke(float f2, float f3) {
                return Float.valueOf(0.0f);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Float f2, Float f3) {
                return invoke(f2.floatValue(), f3.floatValue());
            }
        }, null, 2, null);
        this.thresholds$delegate = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.velocityThreshold$delegate = mutableStateOf$default9;
        mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.resistance$delegate = mutableStateOf$default10;
        this.draggableState = DraggableKt.DraggableState(new Function1<Float, Unit>(this) { // from class: androidx.compose.material.SwipeableState$draggableState$1
            public final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                invoke(f2.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2) {
                MutableState mutableState;
                float coerceIn;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                mutableState = ((SwipeableState) this.this$0).absoluteOffset;
                float floatValue = ((Number) mutableState.getValue()).floatValue() + f2;
                coerceIn = RangesKt___RangesKt.coerceIn(floatValue, this.this$0.getMinBound$material_release(), this.this$0.getMaxBound$material_release());
                float f3 = floatValue - coerceIn;
                ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
                float computeResistance = resistance$material_release == null ? 0.0f : resistance$material_release.computeResistance(f3);
                mutableState2 = ((SwipeableState) this.this$0).offsetState;
                mutableState2.setValue(Float.valueOf(coerceIn + computeResistance));
                mutableState3 = ((SwipeableState) this.this$0).overflowState;
                mutableState3.setValue(Float.valueOf(f3));
                mutableState4 = ((SwipeableState) this.this$0).absoluteOffset;
                mutableState4.setValue(Float.valueOf(floatValue));
            }
        });
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i2 & 4) != 0 ? new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(T t2) {
                return Boolean.TRUE;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((AnonymousClass1) obj2);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f2, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object drag$default = DraggableState.DefaultImpls.drag$default(getDraggableState$material_release(), null, new SwipeableState$animateInternalToOffset$2(this, f2, animationSpec, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return drag$default == coroutine_suspended ? drag$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                animationSpec = swipeableState.getAnimationSpec$material_release();
            }
            return swipeableState.animateTo(obj, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t2) {
        this.currentValue$delegate.setValue(t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object drag$default = DraggableState.DefaultImpls.drag$default(getDraggableState$material_release(), null, new SwipeableState$snapInternalToOffset$2(f2, this, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return drag$default == coroutine_suspended ? drag$default : Unit.INSTANCE;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(T t2, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$$inlined$collect$1(t2, this, animationSpec), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    public final void ensureInit$material_release(@NotNull Map<Float, ? extends T> newAnchors) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            Float access$getOffset = SwipeableKt.access$getOffset(newAnchors, getCurrentValue());
            if (access$getOffset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setValue(access$getOffset);
            this.absoluteOffset.setValue(access$getOffset);
        }
    }

    @NotNull
    public final Map<Float, T> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection() {
        float signum;
        Float access$getOffset = SwipeableKt.access$getOffset(getAnchors$material_release(), getCurrentValue());
        if (access$getOffset == null) {
            signum = 0.0f;
        } else {
            signum = Math.signum(getOffset().getValue().floatValue() - access$getOffset.floatValue());
        }
        return signum;
    }

    @NotNull
    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final float getMaxBound$material_release() {
        return this.maxBound;
    }

    public final float getMinBound$material_release() {
        return this.minBound;
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.offsetState;
    }

    @NotNull
    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    @NotNull
    public final SwipeProgress<T> getProgress() {
        Object currentValue;
        Object currentValue2;
        float f2;
        Object value;
        Object value2;
        Object obj;
        Object obj2;
        Object value3;
        Object value4;
        List access$findBounds = SwipeableKt.access$findBounds(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = access$findBounds.size();
        if (size == 0) {
            currentValue = getCurrentValue();
            currentValue2 = getCurrentValue();
            f2 = 1.0f;
        } else if (size != 1) {
            if (getDirection() > 0.0f) {
                obj = access$findBounds.get(0);
                obj2 = access$findBounds.get(1);
            } else {
                obj = access$findBounds.get(1);
                obj2 = access$findBounds.get(0);
            }
            Pair pair = TuplesKt.to(obj, obj2);
            float floatValue = ((Number) pair.component1()).floatValue();
            float floatValue2 = ((Number) pair.component2()).floatValue();
            value3 = MapsKt__MapsKt.getValue(getAnchors$material_release(), Float.valueOf(floatValue));
            currentValue = value3;
            value4 = MapsKt__MapsKt.getValue(getAnchors$material_release(), Float.valueOf(floatValue2));
            currentValue2 = value4;
            f2 = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            value = MapsKt__MapsKt.getValue(getAnchors$material_release(), access$findBounds.get(0));
            currentValue = value;
            value2 = MapsKt__MapsKt.getValue(getAnchors$material_release(), access$findBounds.get(0));
            currentValue2 = value2;
            f2 = 1.0f;
        }
        return new SwipeProgress<>(currentValue, currentValue2, f2);
    }

    @Nullable
    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue() {
        float floatValue;
        Float value = this.animationTarget.getValue();
        if (value == null) {
            float floatValue2 = getOffset().getValue().floatValue();
            Float access$getOffset = SwipeableKt.access$getOffset(getAnchors$material_release(), getCurrentValue());
            floatValue = SwipeableKt.access$computeTarget(floatValue2, access$getOffset == null ? getOffset().getValue().floatValue() : access$getOffset.floatValue(), getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        } else {
            floatValue = value.floatValue();
        }
        T t2 = getAnchors$material_release().get(Float.valueOf(floatValue));
        T t3 = t2;
        if (t2 == null) {
            t3 = getCurrentValue();
        }
        return t3;
    }

    @NotNull
    public final Function2<Float, Float, Float> getThresholds$material_release() {
        return (Function2) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return ((Number) this.velocityThreshold$delegate.getValue()).floatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag(float f2) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(this.absoluteOffset.getValue().floatValue() + f2, this.minBound, this.maxBound);
        float floatValue = coerceIn - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(floatValue) > 0.0f) {
            this.draggableState.dispatchRawDelta(floatValue);
        }
        return floatValue;
    }

    @Nullable
    public final Object performFling(final float f2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new j<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$performFling$$inlined$collect$1
            @Override // o.j
            @Nullable
            public Object emit(Map<Float, ? extends T> map, @NotNull Continuation<? super Unit> continuation2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                Object coroutine_suspended2;
                Object coroutine_suspended3;
                Map<Float, ? extends T> map2 = map;
                offset = SwipeableKt.getOffset(map2, SwipeableState.this.getCurrentValue());
                Intrinsics.checkNotNull(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(SwipeableState.this.getOffset().getValue().floatValue(), floatValue, map2.keySet(), SwipeableState.this.getThresholds$material_release(), f2, SwipeableState.this.getVelocityThreshold$material_release());
                T t2 = map2.get(Boxing.boxFloat(computeTarget));
                if (t2 == null || !SwipeableState.this.getConfirmStateChange$material_release().invoke(t2).booleanValue()) {
                    SwipeableState swipeableState = SwipeableState.this;
                    animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material_release(), continuation2);
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (animateInternalToOffset == coroutine_suspended2) {
                        return animateInternalToOffset;
                    }
                } else {
                    Object animateTo$default = SwipeableState.animateTo$default(SwipeableState.this, t2, null, continuation2, 2, null);
                    coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (animateTo$default == coroutine_suspended3) {
                        return animateTo$default;
                    }
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00d0: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r15 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:25:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processNewAnchors$material_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r6, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material_release(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setAnchors$material_release(@NotNull Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$material_release(float f2) {
        this.maxBound = f2;
    }

    public final void setMinBound$material_release(float f2) {
        this.minBound = f2;
    }

    public final void setResistance$material_release(@Nullable ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$material_release(@NotNull Function2<? super Float, ? super Float, Float> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.thresholds$delegate.setValue(function2);
    }

    public final void setVelocityThreshold$material_release(float f2) {
        this.velocityThreshold$delegate.setValue(Float.valueOf(f2));
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(T t2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$$inlined$collect$1(t2, this), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }
}
