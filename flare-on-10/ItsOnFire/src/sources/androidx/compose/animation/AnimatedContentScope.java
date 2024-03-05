package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\u0084\u0001\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003UVWB%\b��\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0004\b>\u0010?JP\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u0002002\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2#\b\u0002\u0010E\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0Fø\u0001��ø\u0001\u0001¢\u0006\u0004\bK\u0010LJP\u0010M\u001a\u00020N2\u0006\u0010B\u001a\u0002002\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2#\b\u0002\u0010O\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0Fø\u0001��ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020=*\u00020=2\b\u0010S\u001a\u0004\u0018\u00010TH\u0087\u0004R%\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0080\u000eø\u0001��¢\u0006\u000e\n��\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\f8BX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028��8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8@@@X\u0080\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R)\u0010&\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0'X\u0080\u0004ø\u0001��¢\u0006\b\n��\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00028��8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0004X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/*\u0002008BX\u0082\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b1\u00102R\u001b\u00103\u001a\u00020/*\u0002008BX\u0082\u0004ø\u0001��¢\u0006\u0006\u001a\u0004\b4\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "animatedSize", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntSize;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "currentSize", "getCurrentSize-YbymL2g", "()J", "initialState", "getInitialState", "()Ljava/lang/Object;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation_release", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "targetState", "getTargetState", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "isLeft", "", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "isLeft-9jb1Dl8", "(I)Z", "isRight", "isRight-9jb1Dl8", "calculateOffset", "Landroidx/compose/ui/unit/IntOffset;", "fullSize", "calculateOffset-emnUabE", "(JJ)J", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "Landroidx/compose/animation/ContentTransform;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-HTTW7Ok", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "ChildData", "SizeModifier", "SlideDirection", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalAnimationApi
/* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentScope.class */
public final class AnimatedContentScope<S> implements Transition.Segment<S> {
    public static final int $stable = 8;
    @Nullable
    private State<IntSize> animatedSize;
    @NotNull
    private Alignment contentAlignment;
    @NotNull
    private LayoutDirection layoutDirection;
    @NotNull
    private final MutableState measuredSize$delegate;
    @NotNull
    private final Map<S, State<IntSize>> targetSizeMap;
    @NotNull
    private final Transition<S> transition;

    @Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentScope$ChildData.class */
    public static final class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public ChildData(boolean z) {
            this.isTarget = z;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = childData.isTarget;
            }
            return childData.copy(z);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ParentDataModifier.DefaultImpls.all(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ParentDataModifier.DefaultImpls.any(this, function1);
        }

        public final boolean component1() {
            return this.isTarget;
        }

        @NotNull
        public final ChildData copy(boolean z) {
            return new ChildData(z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildData) && this.isTarget == ((ChildData) obj).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) ParentDataModifier.DefaultImpls.foldIn(this, r2, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) ParentDataModifier.DefaultImpls.foldOut(this, r2, function2);
        }

        public int hashCode() {
            boolean z = this.isTarget;
            boolean z2 = z;
            if (z) {
                z2 = true;
            }
            return z2 ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier modifier) {
            return ParentDataModifier.DefaultImpls.then(this, modifier);
        }

        @NotNull
        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }
    }

    @Metadata(d1 = {"��@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018��2\u00020\u0001B6\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028��0\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001��¢\u0006\u0002\u0010\nJ)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028��0\u0006ø\u0001��¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ExperimentalAnimationApi
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentScope$SizeModifier.class */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        @NotNull
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        @NotNull
        private final State<SizeTransform> sizeTransform;
        public final /* synthetic */ AnimatedContentScope<S> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(@NotNull AnimatedContentScope this$0, @NotNull Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<? extends SizeTransform> sizeTransform) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.this$0 = this$0;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        @NotNull
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @NotNull
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        @NotNull
        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(j2);
            final AnimatedContentScope<S> animatedContentScope = this.this$0;
            Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> function1 = new Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<S> animate) {
                    Intrinsics.checkNotNullParameter(animate, "$this$animate");
                    State<IntSize> state = animatedContentScope.getTargetSizeMap$animation_release().get(animate.getInitialState());
                    IntSize value = state == null ? null : state.getValue();
                    long m4956getZeroYbymL2g = value == null ? IntSize.Companion.m4956getZeroYbymL2g() : value.m4955unboximpl();
                    State<IntSize> state2 = animatedContentScope.getTargetSizeMap$animation_release().get(animate.getTargetState());
                    IntSize value2 = state2 == null ? null : state2.getValue();
                    long m4956getZeroYbymL2g2 = value2 == null ? IntSize.Companion.m4956getZeroYbymL2g() : value2.m4955unboximpl();
                    SizeTransform value3 = this.getSizeTransform().getValue();
                    FiniteAnimationSpec<IntSize> mo210createAnimationSpecTemP2vQ = value3 == null ? null : value3.mo210createAnimationSpecTemP2vQ(m4956getZeroYbymL2g, m4956getZeroYbymL2g2);
                    SpringSpec springSpec = mo210createAnimationSpecTemP2vQ;
                    if (mo210createAnimationSpecTemP2vQ == null) {
                        springSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    return springSpec;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<IntSize> invoke(Object obj) {
                    return invoke((Transition.Segment) ((Transition.Segment) obj));
                }
            };
            final AnimatedContentScope<S> animatedContentScope2 = this.this$0;
            State<IntSize> animate = this.sizeAnimation.animate(function1, new Function1<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                    return IntSize.m4943boximpl(m106invokeYEO4UFw(obj));
                }

                /* renamed from: invoke-YEO4UFw  reason: not valid java name */
                public final long m106invokeYEO4UFw(S s2) {
                    State<IntSize> state = animatedContentScope2.getTargetSizeMap$animation_release().get(s2);
                    IntSize value = state == null ? null : state.getValue();
                    return value == null ? IntSize.Companion.m4956getZeroYbymL2g() : value.m4955unboximpl();
                }
            });
            this.this$0.setAnimatedSize$animation_release(animate);
            final long mo2047alignKFBX0sM = this.this$0.getContentAlignment$animation_release().mo2047alignKFBX0sM(IntSizeKt.IntSize(mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight()), animate.getValue().m4955unboximpl(), LayoutDirection.Ltr);
            return MeasureScope.DefaultImpls.layout$default(receiver, IntSize.m4951getWidthimpl(animate.getValue().m4955unboximpl()), IntSize.m4950getHeightimpl(animate.getValue().m4955unboximpl()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$1
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
                    Placeable.PlacementScope.m3962place70tqf50$default(layout, Placeable.this, mo2047alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    @Immutable
    @Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @JvmInline
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentScope$SlideDirection.class */
    public static final class SlideDirection {
        private final int value;
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int Left = m109constructorimpl(0);
        private static final int Right = m109constructorimpl(1);
        private static final int Up = m109constructorimpl(2);
        private static final int Down = m109constructorimpl(3);
        private static final int Start = m109constructorimpl(4);
        private static final int End = m109constructorimpl(5);

        @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "getDown-aUPqQNE", "()I", "I", "End", "getEnd-aUPqQNE", "Left", "getLeft-aUPqQNE", "Right", "getRight-aUPqQNE", "Start", "getStart-aUPqQNE", "Up", "getUp-aUPqQNE", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedContentScope$SlideDirection$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDown-aUPqQNE  reason: not valid java name */
            public final int m115getDownaUPqQNE() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-aUPqQNE  reason: not valid java name */
            public final int m116getEndaUPqQNE() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-aUPqQNE  reason: not valid java name */
            public final int m117getLeftaUPqQNE() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-aUPqQNE  reason: not valid java name */
            public final int m118getRightaUPqQNE() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-aUPqQNE  reason: not valid java name */
            public final int m119getStartaUPqQNE() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-aUPqQNE  reason: not valid java name */
            public final int m120getUpaUPqQNE() {
                return SlideDirection.Up;
            }
        }

        private /* synthetic */ SlideDirection(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ SlideDirection m108boximpl(int i2) {
            return new SlideDirection(i2);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m109constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m110equalsimpl(int i2, Object obj) {
            return (obj instanceof SlideDirection) && i2 == ((SlideDirection) obj).m114unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m111equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m112hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m113toStringimpl(int i2) {
            return m111equalsimpl0(i2, Left) ? "Left" : m111equalsimpl0(i2, Right) ? "Right" : m111equalsimpl0(i2, Up) ? "Up" : m111equalsimpl0(i2, Down) ? "Down" : m111equalsimpl0(i2, Start) ? "Start" : m111equalsimpl0(i2, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m110equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m112hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m113toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m114unboximpl() {
            return this.value;
        }
    }

    public AnimatedContentScope(@NotNull Transition<S> transition, @NotNull Alignment contentAlignment, @NotNull LayoutDirection layoutDirection) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m4943boximpl(IntSize.Companion.m4956getZeroYbymL2g()), null, 2, null);
        this.measuredSize$delegate = mutableStateOf$default;
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE  reason: not valid java name */
    public final long m93calculateOffsetemnUabE(long j2, long j3) {
        return this.contentAlignment.mo2047alignKFBX0sM(j2, j3, LayoutDirection.Ltr);
    }

    /* renamed from: createSizeAnimationModifier$lambda-2  reason: not valid java name */
    private static final boolean m94createSizeAnimationModifier$lambda2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: createSizeAnimationModifier$lambda-3  reason: not valid java name */
    private static final void m95createSizeAnimationModifier$lambda3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g  reason: not valid java name */
    public final long m96getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        IntSize value = state == null ? null : state.getValue();
        return value == null ? m101getMeasuredSizeYbymL2g$animation_release() : value.m4955unboximpl();
    }

    /* renamed from: isLeft-9jb1Dl8  reason: not valid java name */
    private final boolean m97isLeft9jb1Dl8(int i2) {
        SlideDirection.Companion companion = SlideDirection.Companion;
        return SlideDirection.m111equalsimpl0(i2, companion.m117getLeftaUPqQNE()) || (SlideDirection.m111equalsimpl0(i2, companion.m119getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr) || (SlideDirection.m111equalsimpl0(i2, companion.m116getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    /* renamed from: isRight-9jb1Dl8  reason: not valid java name */
    private final boolean m98isRight9jb1Dl8(int i2) {
        SlideDirection.Companion companion = SlideDirection.Companion;
        return SlideDirection.m111equalsimpl0(i2, companion.m118getRightaUPqQNE()) || (SlideDirection.m111equalsimpl0(i2, companion.m119getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl) || (SlideDirection.m111equalsimpl0(i2, companion.m116getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* renamed from: slideIntoContainer-HTTW7Ok$default  reason: not valid java name */
    public static /* synthetic */ EnterTransition m99slideIntoContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i2, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$1
                @NotNull
                public final Integer invoke(int i4) {
                    return Integer.valueOf(i4);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentScope.m103slideIntoContainerHTTW7Ok(i2, finiteAnimationSpec, function1);
    }

    /* renamed from: slideOutOfContainer-HTTW7Ok$default  reason: not valid java name */
    public static /* synthetic */ ExitTransition m100slideOutOfContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i2, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4898boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$1
                @NotNull
                public final Integer invoke(int i4) {
                    return Integer.valueOf(i4);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentScope.m104slideOutOfContainerHTTW7Ok(i2, finiteAnimationSpec, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e1, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r0v57, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.Composer] */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.Modifier createSizeAnimationModifier$animation_release(@org.jetbrains.annotations.NotNull androidx.compose.animation.ContentTransform r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r9, int r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier$animation_release(androidx.compose.animation.ContentTransform, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    @Nullable
    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    @NotNull
    public final Alignment getContentAlignment$animation_release() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    /* renamed from: getMeasuredSize-YbymL2g$animation_release  reason: not valid java name */
    public final long m101getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m4955unboximpl();
    }

    @NotNull
    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @NotNull
    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public boolean isTransitioningTo(S s2, S s3) {
        return Transition.Segment.DefaultImpls.isTransitioningTo(this, s2, s3);
    }

    public final void setAnimatedSize$animation_release(@Nullable State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release  reason: not valid java name */
    public final void m102setMeasuredSizeozmzZPI$animation_release(long j2) {
        this.measuredSize$delegate.setValue(IntSize.m4943boximpl(j2));
    }

    @NotNull
    /* renamed from: slideIntoContainer-HTTW7Ok  reason: not valid java name */
    public final EnterTransition m103slideIntoContainerHTTW7Ok(int i2, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffset) {
        EnterTransition none;
        Function1<Integer, Integer> function1;
        Function1<Integer, Integer> function12;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        if (m97isLeft9jb1Dl8(i2)) {
            function12 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @NotNull
                public final Integer invoke(int i3) {
                    long m96getCurrentSizeYbymL2g;
                    long m96getCurrentSizeYbymL2g2;
                    long m93calculateOffsetemnUabE;
                    Function1<Integer, Integer> function13 = initialOffset;
                    m96getCurrentSizeYbymL2g = this.m96getCurrentSizeYbymL2g();
                    int m4951getWidthimpl = IntSize.m4951getWidthimpl(m96getCurrentSizeYbymL2g);
                    AnimatedContentScope<S> animatedContentScope = this;
                    long IntSize = IntSizeKt.IntSize(i3, i3);
                    m96getCurrentSizeYbymL2g2 = this.m96getCurrentSizeYbymL2g();
                    m93calculateOffsetemnUabE = animatedContentScope.m93calculateOffsetemnUabE(IntSize, m96getCurrentSizeYbymL2g2);
                    return function13.invoke(Integer.valueOf(m4951getWidthimpl - IntOffset.m4907getXimpl(m93calculateOffsetemnUabE)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        } else if (!m98isRight9jb1Dl8(i2)) {
            SlideDirection.Companion companion = SlideDirection.Companion;
            if (SlideDirection.m111equalsimpl0(i2, companion.m120getUpaUPqQNE())) {
                function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Integer invoke(int i3) {
                        long m96getCurrentSizeYbymL2g;
                        long m96getCurrentSizeYbymL2g2;
                        long m93calculateOffsetemnUabE;
                        Function1<Integer, Integer> function13 = initialOffset;
                        m96getCurrentSizeYbymL2g = this.m96getCurrentSizeYbymL2g();
                        int m4950getHeightimpl = IntSize.m4950getHeightimpl(m96getCurrentSizeYbymL2g);
                        AnimatedContentScope<S> animatedContentScope = this;
                        long IntSize = IntSizeKt.IntSize(i3, i3);
                        m96getCurrentSizeYbymL2g2 = this.m96getCurrentSizeYbymL2g();
                        m93calculateOffsetemnUabE = animatedContentScope.m93calculateOffsetemnUabE(IntSize, m96getCurrentSizeYbymL2g2);
                        return function13.invoke(Integer.valueOf(m4950getHeightimpl - IntOffset.m4908getYimpl(m93calculateOffsetemnUabE)));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
            } else if (!SlideDirection.m111equalsimpl0(i2, companion.m115getDownaUPqQNE())) {
                none = EnterTransition.Companion.getNone();
                return none;
            } else {
                function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Integer invoke(int i3) {
                        long m96getCurrentSizeYbymL2g;
                        long m93calculateOffsetemnUabE;
                        Function1<Integer, Integer> function13 = initialOffset;
                        AnimatedContentScope<S> animatedContentScope = this;
                        long IntSize = IntSizeKt.IntSize(i3, i3);
                        m96getCurrentSizeYbymL2g = this.m96getCurrentSizeYbymL2g();
                        m93calculateOffsetemnUabE = animatedContentScope.m93calculateOffsetemnUabE(IntSize, m96getCurrentSizeYbymL2g);
                        return function13.invoke(Integer.valueOf((-IntOffset.m4908getYimpl(m93calculateOffsetemnUabE)) - i3));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
            }
            none = EnterExitTransitionKt.slideInVertically(animationSpec, function1);
            return none;
        } else {
            function12 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @NotNull
                public final Integer invoke(int i3) {
                    long m96getCurrentSizeYbymL2g;
                    long m93calculateOffsetemnUabE;
                    Function1<Integer, Integer> function13 = initialOffset;
                    AnimatedContentScope<S> animatedContentScope = this;
                    long IntSize = IntSizeKt.IntSize(i3, i3);
                    m96getCurrentSizeYbymL2g = this.m96getCurrentSizeYbymL2g();
                    m93calculateOffsetemnUabE = animatedContentScope.m93calculateOffsetemnUabE(IntSize, m96getCurrentSizeYbymL2g);
                    return function13.invoke(Integer.valueOf((-IntOffset.m4907getXimpl(m93calculateOffsetemnUabE)) - i3));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        none = EnterExitTransitionKt.slideInHorizontally(animationSpec, function12);
        return none;
    }

    @NotNull
    /* renamed from: slideOutOfContainer-HTTW7Ok  reason: not valid java name */
    public final ExitTransition m104slideOutOfContainerHTTW7Ok(int i2, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffset) {
        ExitTransition none;
        Function1<Integer, Integer> function1;
        Function1<Integer, Integer> function12;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        if (m97isLeft9jb1Dl8(i2)) {
            function12 = new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$2
                public final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @NotNull
                public final Integer invoke(int i3) {
                    long m93calculateOffsetemnUabE;
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    IntSize intSize = state == null ? null : (IntSize) state.getValue();
                    long m4956getZeroYbymL2g = intSize == null ? IntSize.Companion.m4956getZeroYbymL2g() : intSize.m4955unboximpl();
                    Function1<Integer, Integer> function13 = targetOffset;
                    m93calculateOffsetemnUabE = this.this$0.m93calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), m4956getZeroYbymL2g);
                    return function13.invoke(Integer.valueOf((-IntOffset.m4907getXimpl(m93calculateOffsetemnUabE)) - i3));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        } else if (!m98isRight9jb1Dl8(i2)) {
            SlideDirection.Companion companion = SlideDirection.Companion;
            if (SlideDirection.m111equalsimpl0(i2, companion.m120getUpaUPqQNE())) {
                function1 = new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$4
                    public final /* synthetic */ AnimatedContentScope<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @NotNull
                    public final Integer invoke(int i3) {
                        long m93calculateOffsetemnUabE;
                        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                        IntSize intSize = state == null ? null : (IntSize) state.getValue();
                        long m4956getZeroYbymL2g = intSize == null ? IntSize.Companion.m4956getZeroYbymL2g() : intSize.m4955unboximpl();
                        Function1<Integer, Integer> function13 = targetOffset;
                        m93calculateOffsetemnUabE = this.this$0.m93calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), m4956getZeroYbymL2g);
                        return function13.invoke(Integer.valueOf((-IntOffset.m4908getYimpl(m93calculateOffsetemnUabE)) - i3));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
            } else if (!SlideDirection.m111equalsimpl0(i2, companion.m115getDownaUPqQNE())) {
                none = ExitTransition.Companion.getNone();
                return none;
            } else {
                function1 = new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$5
                    public final /* synthetic */ AnimatedContentScope<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @NotNull
                    public final Integer invoke(int i3) {
                        long m93calculateOffsetemnUabE;
                        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                        IntSize intSize = state == null ? null : (IntSize) state.getValue();
                        long m4956getZeroYbymL2g = intSize == null ? IntSize.Companion.m4956getZeroYbymL2g() : intSize.m4955unboximpl();
                        Function1<Integer, Integer> function13 = targetOffset;
                        m93calculateOffsetemnUabE = this.this$0.m93calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), m4956getZeroYbymL2g);
                        return function13.invoke(Integer.valueOf((-IntOffset.m4908getYimpl(m93calculateOffsetemnUabE)) + IntSize.m4950getHeightimpl(m4956getZeroYbymL2g)));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
            }
            none = EnterExitTransitionKt.slideOutVertically(animationSpec, function1);
            return none;
        } else {
            function12 = new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$3
                public final /* synthetic */ AnimatedContentScope<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @NotNull
                public final Integer invoke(int i3) {
                    long m93calculateOffsetemnUabE;
                    State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                    IntSize intSize = state == null ? null : (IntSize) state.getValue();
                    long m4956getZeroYbymL2g = intSize == null ? IntSize.Companion.m4956getZeroYbymL2g() : intSize.m4955unboximpl();
                    Function1<Integer, Integer> function13 = targetOffset;
                    m93calculateOffsetemnUabE = this.this$0.m93calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), m4956getZeroYbymL2g);
                    return function13.invoke(Integer.valueOf((-IntOffset.m4907getXimpl(m93calculateOffsetemnUabE)) + IntSize.m4951getWidthimpl(m4956getZeroYbymL2g)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        none = EnterExitTransitionKt.slideOutHorizontally(animationSpec, function12);
        return none;
    }

    @ExperimentalAnimationApi
    @NotNull
    public final ContentTransform using(@NotNull ContentTransform contentTransform, @Nullable SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
