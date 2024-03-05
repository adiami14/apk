package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b��\u0018��*\b\b��\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR@\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028��\u0018\u00010\u000b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028��\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00018��X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00170\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00170\u000b@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "T", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;)V", "value", "Lkotlin/Function1;", "factory", "getFactory", "()Lkotlin/jvm/functions/Function1;", "setFactory", "(Lkotlin/jvm/functions/Function1;)V", "typedView", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "Landroid/view/View;", "", "updateBlock", "getUpdateBlock", "setUpdateBlock", "viewRoot", "getViewRoot", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/viewinterop/ViewFactoryHolder.class */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    @Nullable
    private Function1<? super Context, ? extends T> factory;
    @Nullable
    private T typedView;
    @NotNull
    private Function1<? super T, Unit> updateBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@NotNull Context context, @Nullable CompositionContext compositionContext) {
        super(context, compositionContext);
        Intrinsics.checkNotNullParameter(context, "context");
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : compositionContext);
    }

    @Nullable
    public final Function1<Context, T> getFactory() {
        return (Function1<? super Context, ? extends T>) this.factory;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @Nullable
    public AbstractComposeView getSubCompositionView() {
        return ViewRootForInspector.DefaultImpls.getSubCompositionView(this);
    }

    @Nullable
    public final T getTypedView$ui_release() {
        return this.typedView;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return (Function1<? super T, Unit>) this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setFactory(@Nullable Function1<? super Context, ? extends T> function1) {
        this.factory = function1;
        if (function1 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            T invoke = function1.invoke(context);
            this.typedView = invoke;
            setView$ui_release(invoke);
        }
    }

    public final void setTypedView$ui_release(@Nullable T t2) {
        this.typedView = t2;
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.updateBlock = value;
        setUpdate(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            public final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View typedView$ui_release = this.this$0.getTypedView$ui_release();
                if (typedView$ui_release == null) {
                    return;
                }
                this.this$0.getUpdateBlock().invoke(typedView$ui_release);
            }
        });
    }
}
