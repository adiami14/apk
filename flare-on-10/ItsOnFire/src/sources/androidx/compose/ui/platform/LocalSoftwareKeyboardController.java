package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\tJ\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "()V", "LocalSoftwareKeyboardController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "current", "getCurrent$annotations", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/platform/SoftwareKeyboardController;", "delegatingController", "provides", "Landroidx/compose/runtime/ProvidedValue;", "softwareKeyboardController", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/LocalSoftwareKeyboardController.class */
public final class LocalSoftwareKeyboardController {
    public static final int $stable = 0;
    @NotNull
    public static final LocalSoftwareKeyboardController INSTANCE = new LocalSoftwareKeyboardController();
    @NotNull
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.compositionLocalOf$default(null, new Function0<SoftwareKeyboardController>() { // from class: androidx.compose.ui.platform.LocalSoftwareKeyboardController$LocalSoftwareKeyboardController$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final SoftwareKeyboardController invoke() {
            return null;
        }
    }, 1, null);

    private LocalSoftwareKeyboardController() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L12;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.platform.SoftwareKeyboardController delegatingController(androidx.compose.runtime.Composer r5, int r6) {
        /*
            r4 = this;
            r0 = r5
            r1 = 1255403937(0x4ad3f1a1, float:6944976.5)
            r0.startReplaceableGroup(r1)
            r0 = r5
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService()
            java.lang.Object r0 = r0.consume(r1)
            androidx.compose.ui.text.input.TextInputService r0 = (androidx.compose.ui.text.input.TextInputService) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L21
            r0 = r5
            r0.endReplaceableGroup()
            r0 = 0
            return r0
        L21:
            r0 = r5
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r5
            r1 = r7
            boolean r0 = r0.changed(r1)
            r8 = r0
            r0 = r5
            java.lang.Object r0 = r0.rememberedValue()
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L4e
            r0 = r9
            r10 = r0
            r0 = r9
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L60
        L4e:
            androidx.compose.ui.platform.DelegatingSoftwareKeyboardController r0 = new androidx.compose.ui.platform.DelegatingSoftwareKeyboardController
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
            r0 = r5
            r1 = r10
            r0.updateRememberedValue(r1)
        L60:
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r10
            androidx.compose.ui.platform.DelegatingSoftwareKeyboardController r0 = (androidx.compose.ui.platform.DelegatingSoftwareKeyboardController) r0
            r10 = r0
            r0 = r5
            r0.endReplaceableGroup()
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController(androidx.compose.runtime.Composer, int):androidx.compose.ui.platform.SoftwareKeyboardController");
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCurrent$annotations() {
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final SoftwareKeyboardController getCurrent(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(1850767929);
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(LocalSoftwareKeyboardController);
        SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
        if (softwareKeyboardController == null) {
            softwareKeyboardController2 = delegatingController(composer, i2 & 14);
        }
        composer.endReplaceableGroup();
        return softwareKeyboardController2;
    }

    @NotNull
    public final ProvidedValue<SoftwareKeyboardController> provides(@NotNull SoftwareKeyboardController softwareKeyboardController) {
        Intrinsics.checkNotNullParameter(softwareKeyboardController, "softwareKeyboardController");
        return LocalSoftwareKeyboardController.provides(softwareKeyboardController);
    }
}
