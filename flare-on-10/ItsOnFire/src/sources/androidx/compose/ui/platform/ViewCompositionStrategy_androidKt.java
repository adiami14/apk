package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(d1 = {"��\u0018\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u001e\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"installForLifecycle", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/ViewCompositionStrategy_androidKt.class */
public final class ViewCompositionStrategy_androidKt {
    public static final /* synthetic */ Function0 access$installForLifecycle(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        return installForLifecycle(abstractComposeView, lifecycle);
    }

    public static final Function0<Unit> installForLifecycle(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.i
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.m4266installForLifecycle$lambda1(AbstractComposeView.this, lifecycleOwner, event);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Lifecycle.this.removeObserver(lifecycleEventObserver);
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    /* renamed from: installForLifecycle$lambda-1 */
    public static final void m4266installForLifecycle$lambda1(AbstractComposeView view, LifecycleOwner noName_0, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            view.disposeComposition();
        }
    }
}
