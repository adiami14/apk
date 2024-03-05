package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u001a4\u0010��\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b��\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001��\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "activity-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/activity/ActivityViewModelLazyKt.class */
public final class ActivityViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity componentActivity, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ActivityViewModelLazyKt$viewModels$factoryPromise$1 activityViewModelLazyKt$viewModels$factoryPromise$1 = function0;
        if (function0 == null) {
            activityViewModelLazyKt$viewModels$factoryPromise$1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), activityViewModelLazyKt$viewModels$factoryPromise$1);
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity componentActivity, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ActivityViewModelLazyKt$viewModels$factoryPromise$1 activityViewModelLazyKt$viewModels$factoryPromise$1 = function0;
        if (function0 == null) {
            activityViewModelLazyKt$viewModels$factoryPromise$1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), activityViewModelLazyKt$viewModels$factoryPromise$1);
    }
}
