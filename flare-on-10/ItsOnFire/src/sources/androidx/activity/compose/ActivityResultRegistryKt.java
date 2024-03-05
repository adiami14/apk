package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aM\u0010��\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberLauncherForActivityResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "onResult", "Lkotlin/Function1;", "", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 5, 1}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/activity/compose/ActivityResultRegistryKt.class */
public final class ActivityResultRegistryKt {
    @Composable
    @NotNull
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(@NotNull final ActivityResultContract<I, O> contract, @NotNull Function1<? super O, Unit> onResult, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        composer.startReplaceableGroup(-1672766734);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contract, composer, 8);
        final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onResult, composer, (i2 >> 3) & 14);
        Object m2016rememberSaveable = RememberSaveableKt.m2016rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) new Function0<String>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }, composer, 8, 6);
        Intrinsics.checkNotNullExpressionValue(m2016rememberSaveable, "rememberSaveable { UUID.randomUUID().toString() }");
        final String str = (String) m2016rememberSaveable;
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 0);
        if (current != null) {
            final ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "checkNotNull(LocalActivityResultRegistryOwner.current) {\n        \"No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner\"\n    }.activityResultRegistry");
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            ActivityResultLauncherHolder activityResultLauncherHolder = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                activityResultLauncherHolder = new ActivityResultLauncherHolder();
                composer.updateRememberedValue(activityResultLauncherHolder);
            }
            composer.endReplaceableGroup();
            final ActivityResultLauncherHolder activityResultLauncherHolder2 = (ActivityResultLauncherHolder) activityResultLauncherHolder;
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue2 = composer.rememberedValue();
            ManagedActivityResultLauncher managedActivityResultLauncher = rememberedValue2;
            if (rememberedValue2 == companion.getEmpty()) {
                managedActivityResultLauncher = new ManagedActivityResultLauncher(activityResultLauncherHolder2, rememberUpdatedState);
                composer.updateRememberedValue(managedActivityResultLauncher);
            }
            composer.endReplaceableGroup();
            ManagedActivityResultLauncher<I, O> managedActivityResultLauncher2 = (ManagedActivityResultLauncher) managedActivityResultLauncher;
            EffectsKt.DisposableEffect(activityResultRegistry, str, contract, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    ActivityResultLauncherHolder<I> activityResultLauncherHolder3 = activityResultLauncherHolder2;
                    ActivityResultRegistry activityResultRegistry2 = activityResultRegistry;
                    String str2 = str;
                    Object obj = contract;
                    final State<Function1<O, Unit>> state = rememberUpdatedState2;
                    activityResultLauncherHolder3.setLauncher(activityResultRegistry2.register(str2, obj, new ActivityResultCallback() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1.1
                        @Override // androidx.activity.result.ActivityResultCallback
                        public final void onActivityResult(O o2) {
                            state.getValue().invoke(o2);
                        }
                    }));
                    final ActivityResultLauncherHolder<I> activityResultLauncherHolder4 = activityResultLauncherHolder2;
                    return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            ActivityResultLauncherHolder.this.unregister();
                        }
                    };
                }
            }, composer, 520);
            composer.endReplaceableGroup();
            return managedActivityResultLauncher2;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}
