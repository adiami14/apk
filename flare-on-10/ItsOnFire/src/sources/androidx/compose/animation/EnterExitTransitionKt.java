package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0098\u0001\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001aT\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001��\u001aT\u0010\u001f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001a\"\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007\u001a\"\u0010%\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0002H\u0007\u001a9\u0010(\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aT\u00101\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001aT\u00104\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001��\u001aT\u00106\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001a>\u00108\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001��\u001a@\u0010:\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001a@\u0010<\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001a>\u0010>\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001��\u001a@\u0010@\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001a@\u0010B\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001��\u001a/\u0010D\u001a\u00020E*\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\u0010L\u001aB\u0010M\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u0006\u0010S\u001a\u00020KH\u0002\u001aB\u0010T\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u0006\u0010S\u001a\u00020KH\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020\u0012H\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020 H\u0002\"\u0014\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004ø\u0001��¢\u0006\u0002\n��\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004ø\u0001��¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"DefaultAlpha", "Landroidx/compose/runtime/MutableState;", "", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "expandHorizontally", "Landroidx/compose/animation/EnterTransition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "Landroidx/compose/animation/ExitTransition;", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", Constants.ScionAnalytics.PARAM_LABEL, "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "shrinkExpand", "transition", "expand", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "shrink", "labelPrefix", "slideInOut", "Landroidx/compose/animation/Slide;", "toAlignment", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/EnterExitTransitionKt.class */
public final class EnterExitTransitionKt {
    @NotNull
    private static final MutableState<Float> DefaultAlpha;
    @NotNull
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring;
    @NotNull
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec;
    @NotNull
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec;
    @NotNull
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m158invoke__ExYCQ(transformOrigin.m2752unboximpl());
        }

        @NotNull
        /* renamed from: invoke-__ExYCQ  reason: not valid java name */
        public final AnimationVector2D m158invoke__ExYCQ(long j2) {
            return new AnimationVector2D(TransformOrigin.m2748getPivotFractionXimpl(j2), TransformOrigin.m2749getPivotFractionYimpl(j2));
        }
    }, new Function1<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m2740boximpl(m160invokeLIALnN8(animationVector2D));
        }

        /* renamed from: invoke-LIALnN8  reason: not valid java name */
        public final long m160invokeLIALnN8(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
        }
    });

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/EnterExitTransitionKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutableState<Float> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        DefaultAlpha = mutableStateOf$default;
        DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    }

    public static final /* synthetic */ SpringSpec access$getDefaultOffsetAnimationSpec$p() {
        return DefaultOffsetAnimationSpec;
    }

    public static final /* synthetic */ SpringSpec access$getDefaultSizeAnimationSpec$p() {
        return DefaultSizeAnimationSpec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x009e, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00f1, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x025a, code lost:
        if (r0 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0277, code lost:
        if (r0 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x027d, code lost:
        r30 = r20.getAlpha();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02cf, code lost:
        if (r0 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02ec, code lost:
        if (r0 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02f2, code lost:
        r31 = r20.getAlpha();
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0447, code lost:
        if (r0 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0463, code lost:
        if (r0 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0469, code lost:
        r30 = r14.getScale();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0584, code lost:
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05bb, code lost:
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05be, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05c3, code lost:
        r14 = androidx.compose.ui.graphics.TransformOrigin.m2740boximpl(r14.m199getTransformOriginSzJe1aQ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x064c, code lost:
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0690, code lost:
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0693, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0699, code lost:
        r20 = androidx.compose.ui.graphics.TransformOrigin.m2740boximpl(r20.m199getTransformOriginSzJe1aQ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0727, code lost:
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x075f, code lost:
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0762, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0767, code lost:
        r14 = androidx.compose.ui.graphics.TransformOrigin.m2740boximpl(r12.m199getTransformOriginSzJe1aQ());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x077e  */
    /* JADX WARN: Type inference failed for: r0v333, types: [androidx.compose.runtime.State] */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier createModifier(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r11, @org.jetbrains.annotations.NotNull final androidx.compose.animation.EnterTransition r12, @org.jetbrains.annotations.NotNull final androidx.compose.animation.ExitTransition r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, int r16) {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    /* renamed from: createModifier$lambda-1 */
    private static final boolean m145createModifier$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: createModifier$lambda-11 */
    public static final float m146createModifier$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: createModifier$lambda-13 */
    public static final long m147createModifier$lambda13(State<TransformOrigin> state) {
        return state.getValue().m2752unboximpl();
    }

    /* renamed from: createModifier$lambda-2 */
    private static final void m148createModifier$lambda2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: createModifier$lambda-4 */
    private static final boolean m149createModifier$lambda4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: createModifier$lambda-5 */
    private static final void m150createModifier$lambda5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: createModifier$lambda-8 */
    public static final float m151createModifier$lambda8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal expandFrom, boolean z, @NotNull final Function1<? super Integer, Integer> initialWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4943boximpl(m163invokemzRDjE0(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m163invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(initialWidth.invoke(Integer.valueOf(IntSize.m4951getWidthimpl(j2))).intValue(), IntSize.m4950getHeightimpl(j2));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                @NotNull
                public final Integer invoke(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment expandFrom, boolean z, @NotNull Function1<? super IntSize, IntSize> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m4943boximpl(m165invokemzRDjE0(intSize.m4955unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0  reason: not valid java name */
                public final long m165invokemzRDjE0(long j2) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical expandFrom, boolean z, @NotNull final Function1<? super Integer, Integer> initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4943boximpl(m167invokemzRDjE0(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m167invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(IntSize.m4951getWidthimpl(j2), initialHeight.invoke(Integer.valueOf(IntSize.m4950getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                @NotNull
                public final Integer invoke(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> animationSpec, float f2) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f2, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f2);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> animationSpec, float f2) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f2, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f2);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    /* renamed from: scaleIn-L8ZKh-E */
    public static final EnterTransition m152scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f2, long j2) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, animationSpec, null), 7, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default */
    public static /* synthetic */ EnterTransition m153scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = TransformOrigin.Companion.m2753getCenterSzJe1aQ();
        }
        return m152scaleInL8ZKhE(finiteAnimationSpec, f2, j2);
    }

    @Stable
    @ExperimentalAnimationApi
    @NotNull
    /* renamed from: scaleOut-L8ZKh-E */
    public static final ExitTransition m154scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f2, long j2) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, animationSpec, null), 7, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default */
    public static /* synthetic */ ExitTransition m155scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = TransformOrigin.Companion.m2753getCenterSzJe1aQ();
        }
        return m154scaleOutL8ZKhE(finiteAnimationSpec, f2, j2);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition<EnterExitState> transition, final State<ChangeSize> state, final State<ChangeSize> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* renamed from: invoke$lambda-1  reason: not valid java name */
            private static final boolean m168invoke$lambda1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* renamed from: invoke$lambda-2  reason: not valid java name */
            private static final void m169invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
                if (r0 == null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0154, code lost:
                if (r0 == null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0157, code lost:
                r12 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x015d, code lost:
                r12 = r12.getAlignment();
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0293, code lost:
                if (r0 == r0.getEmpty()) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L86;
             */
            /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01df  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0227  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0288  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x02cf  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x02d8  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x032e  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x036b  */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11) {
                /*
                    Method dump skipped, instructions count: 909
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal shrinkTowards, boolean z, @NotNull final Function1<? super Integer, Integer> targetWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4943boximpl(m171invokemzRDjE0(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m171invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(targetWidth.invoke(Integer.valueOf(IntSize.m4951getWidthimpl(j2))).intValue(), IntSize.m4950getHeightimpl(j2));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                @NotNull
                public final Integer invoke(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment shrinkTowards, boolean z, @NotNull Function1<? super IntSize, IntSize> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m4943boximpl(m173invokemzRDjE0(intSize.m4955unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0  reason: not valid java name */
                public final long m173invokemzRDjE0(long j2) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical shrinkTowards, boolean z, @NotNull final Function1<? super Integer, Integer> targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m4943boximpl(m175invokemzRDjE0(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0  reason: not valid java name */
            public final long m175invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(IntSize.m4951getWidthimpl(j2), targetHeight.invoke(Integer.valueOf(IntSize.m4950getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4943boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                @NotNull
                public final Integer invoke(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4898boximpl(m177invokemHKZG7I(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m177invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(initialOffsetX.invoke(Integer.valueOf(IntSize.m4951getWidthimpl(j2))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                @NotNull
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition<EnterExitState> transition, final State<Slide> state, final State<Slide> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInOut$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* renamed from: invoke$lambda-1  reason: not valid java name */
            private static final boolean m178invoke$lambda1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* renamed from: invoke$lambda-2  reason: not valid java name */
            private static final void m179invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x014d, code lost:
                if (r0 == r0.getEmpty()) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r9, int r10) {
                /*
                    Method dump skipped, instructions count: 387
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$slideInOut$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4898boximpl(m181invokemHKZG7I(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m181invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(0, initialOffsetY.invoke(Integer.valueOf(IntSize.m4950getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                @NotNull
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4898boximpl(m183invokemHKZG7I(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m183invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(targetOffsetX.invoke(Integer.valueOf(IntSize.m4951getWidthimpl(j2))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                @NotNull
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m4898boximpl(m185invokemHKZG7I(intSize.m4955unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I  reason: not valid java name */
            public final long m185invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(0, targetOffsetY.invoke(Integer.valueOf(IntSize.m4950getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                @NotNull
                public final Integer invoke(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return Intrinsics.areEqual(horizontal, companion.getStart()) ? companion.getCenterStart() : Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return Intrinsics.areEqual(vertical, companion.getTop()) ? companion.getTopCenter() : Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
