package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��0\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010��\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0082@ø\u0001��¢\u0006\u0002\u0010\u0005\u001a1\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0082@ø\u0001��¢\u0006\u0002\u0010\f\u001a&\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"awaitTwoDowns", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "requireUnconsumed", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectZoom", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "Landroidx/compose/runtime/State;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/TransformableKt.class */
public final class TransformableKt {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.ui.input.pointer.PointerId, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d7 -> B:20:0x00dd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitTwoDowns(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, boolean r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitTwoDowns(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object awaitTwoDowns$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return awaitTwoDowns(awaitPointerEventScope, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(2:9|(2:11|(4:13|14|15|16)(2:19|20))(1:21))(2:27|(2:29|30)(1:31))|22|23|(2:25|26)|14|15|16))|33|6|7|(0)(0)|22|23|(0)|14|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.PointerInputScope r11, androidx.compose.runtime.State<java.lang.Boolean> r12, androidx.compose.runtime.State<? extends androidx.compose.foundation.gestures.TransformableState> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.PointerInputScope, androidx.compose.runtime.State, androidx.compose.runtime.State, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull final TransformableState state, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("transformable");
                inspectorInfo.getProperties().set("state", TransformableState.this);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.ui.Modifier] */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-2015617763);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(TransformableState.this, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer, 0);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$12 = new TransformableKt$transformable$2$block$1$1(rememberUpdatedState2, rememberUpdatedState, null);
                    composer.updateRememberedValue(transformableKt$transformable$2$block$1$12);
                    transformableKt$transformable$2$block$1$1 = transformableKt$transformable$2$block$1$12;
                }
                composer.endReplaceableGroup();
                Modifier.Companion pointerInput = z2 ? SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, Unit.INSTANCE, (Function2) transformableKt$transformable$2$block$1$1) : Modifier.Companion;
                composer.endReplaceableGroup();
                return pointerInput;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }
}
