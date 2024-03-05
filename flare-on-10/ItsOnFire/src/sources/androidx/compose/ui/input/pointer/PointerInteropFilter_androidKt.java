package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��2\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\u001a/\u0010��\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0007\u001a,\u0010\t\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0003H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¨\u0006\u0010"}, d2 = {"motionEventSpy", "Landroidx/compose/ui/Modifier;", "watcher", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "motionEvent", "", "pointerInteropFilter", "requestDisallowInterceptTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "onTouchEvent", "", "view", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerInteropFilter_androidKt.class */
public final class PointerInteropFilter_androidKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier motionEventSpy(@NotNull Modifier modifier, @NotNull Function1<? super MotionEvent, Unit> watcher) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        return SuspendingPointerInputFilterKt.pointerInput(modifier, watcher, new PointerInteropFilter_androidKt$motionEventSpy$1(watcher, null));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier pointerInteropFilter(@NotNull Modifier modifier, @Nullable final RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, @NotNull final Function1<? super MotionEvent, Boolean> onTouchEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onTouchEvent, "onTouchEvent");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("pointerInteropFilter");
                inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", RequestDisallowInterceptTouchEvent.this);
                inspectorInfo.getProperties().set("onTouchEvent", onTouchEvent);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(599596819);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                PointerInteropFilter pointerInteropFilter = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    pointerInteropFilter = new PointerInteropFilter();
                    composer.updateRememberedValue(pointerInteropFilter);
                }
                composer.endReplaceableGroup();
                PointerInteropFilter pointerInteropFilter2 = (PointerInteropFilter) pointerInteropFilter;
                pointerInteropFilter2.setOnTouchEvent(onTouchEvent);
                pointerInteropFilter2.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
                composer.endReplaceableGroup();
                return pointerInteropFilter2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier pointerInteropFilter(@NotNull Modifier modifier, @NotNull final AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new Function1<MotionEvent, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull MotionEvent motionEvent) {
                boolean dispatchTouchEvent;
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int actionMasked = motionEvent.getActionMasked();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            }
        });
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        view.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }
}
