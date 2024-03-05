package androidx.compose.ui.window;

import androidx.appcompat.R;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {297}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: ItsOnFire.jar:androidx/compose/ui/window/AndroidPopup_androidKt$Popup$5.class */
public final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, Continuation<? super AndroidPopup_androidKt$Popup$5> continuation) {
        super(2, continuation);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, continuation);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((AndroidPopup_androidKt$Popup$5) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:16:0x0056). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r4
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2f
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L25
            r0 = r4
            java.lang.Object r0 = r0.L$0
            j.u0 r0 = (j.u0) r0
            r8 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r5 = r0
            goto L56
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L2f:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            j.u0 r0 = (j.u0) r0
            r5 = r0
        L3b:
            r0 = r5
            boolean r0 = j.v0.k(r0)
            if (r0 == 0) goto L60
            r0 = r4
            r1 = r5
            r0.L$0 = r1
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r4
            java.lang.Object r0 = k.g.e(r0)
            r1 = r6
            if (r0 != r1) goto L56
            r0 = r6
            return r0
        L56:
            r0 = r4
            androidx.compose.ui.window.PopupLayout r0 = r0.$popupLayout
            r0.pollForLocationOnScreenChange()
            goto L3b
        L60:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
