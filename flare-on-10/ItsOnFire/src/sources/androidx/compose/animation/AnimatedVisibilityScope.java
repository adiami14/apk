package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\bf\u0018��2\u00020\u0001J*\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0017R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition$annotations", "()V", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", Constants.ScionAnalytics.PARAM_LABEL, "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedVisibilityScope.class */
public interface AnimatedVisibilityScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimatedVisibilityScope$DefaultImpls.class */
    public static final class DefaultImpls {
        @ExperimentalAnimationApi
        @NotNull
        public static Modifier animateEnterExit(@NotNull final AnimatedVisibilityScope animatedVisibilityScope, @NotNull Modifier receiver, @NotNull final EnterTransition enter, @NotNull final ExitTransition exit, @NotNull final String label) {
            Intrinsics.checkNotNullParameter(animatedVisibilityScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            Intrinsics.checkNotNullParameter(label, "label");
            return ComposedModifierKt.composed(receiver, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$DefaultImpls$animateEnterExit$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("animateEnterExit");
                    inspectorInfo.getProperties().set("enter", EnterTransition.this);
                    inspectorInfo.getProperties().set("exit", exit);
                    inspectorInfo.getProperties().set(Constants.ScionAnalytics.PARAM_LABEL, label);
                }
            } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Composable
                @NotNull
                public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(composed, "$this$composed");
                    composer.startReplaceableGroup(254972959);
                    Modifier then = composed.then(EnterExitTransitionKt.createModifier(AnimatedVisibilityScope.this.getTransition(), enter, exit, label, composer, 0));
                    composer.endReplaceableGroup();
                    return then;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                    return invoke(modifier, composer, num.intValue());
                }
            });
        }

        public static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                }
                if ((i2 & 2) != 0) {
                    exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                }
                if ((i2 & 4) != 0) {
                    str = "animateEnterExit";
                }
                return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }

        @ExperimentalAnimationApi
        public static /* synthetic */ void getTransition$annotations() {
        }
    }

    @ExperimentalAnimationApi
    @NotNull
    Modifier animateEnterExit(@NotNull Modifier modifier, @NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition, @NotNull String str);

    @ExperimentalAnimationApi
    @NotNull
    Transition<EnterExitState> getTransition();
}
