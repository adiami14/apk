package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\u0010��\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "command", "Lkotlin/Function0;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeView$snapshotObserver$1.class */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m4145invoke$lambda0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
        invoke2((Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final Function0<Unit> command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Handler handler = this.this$0.getHandler();
        if ((handler == null ? null : handler.getLooper()) == Looper.myLooper()) {
            command.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 == null) {
            return;
        }
        handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.e
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView$snapshotObserver$1.m4145invoke$lambda0(Function0.this);
            }
        });
    }
}
