package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018�� \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001��¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0012H\u0086@ø\u0001��¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u0012H\u0086@ø\u0001��¢\u0006\u0002\u0010\u0013R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BottomDrawerValue;", "initialValue", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;)V", "isClosed", "()Z", "isExpanded", "isOpen", "isOpenEnabled", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "open", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalMaterialApi
/* loaded from: ItsOnFire.jar:androidx/compose/material/BottomDrawerState.class */
public final class BottomDrawerState extends SwipeableState<BottomDrawerValue> {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final NestedScrollConnection nestedScrollConnection;

    @Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n��\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/material/BottomDrawerState$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull final Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(new Function2<SaverScope, BottomDrawerState, BottomDrawerValue>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final BottomDrawerValue invoke(@NotNull SaverScope Saver, @NotNull BottomDrawerState it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new Function1<BottomDrawerValue, BottomDrawerState>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final BottomDrawerState invoke(@NotNull BottomDrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new BottomDrawerState(it, confirmStateChange);
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomDrawerState(@org.jetbrains.annotations.NotNull androidx.compose.material.BottomDrawerValue r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomDrawerValue, java.lang.Boolean> r7) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "initialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            java.lang.String r1 = "confirmStateChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            r1 = r6
            androidx.compose.animation.core.TweenSpec r2 = androidx.compose.material.DrawerKt.access$getAnimationSpec$p()
            r3 = r7
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = r5
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = androidx.compose.material.SwipeableKt.getPreUpPostDownNestedScrollConnection(r1)
            r0.nestedScrollConnection = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomDrawerState.<init>(androidx.compose.material.BottomDrawerValue, kotlin.jvm.functions.Function1):void");
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i2 & 2) != 0 ? new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.BottomDrawerState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull BottomDrawerValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        } : function1);
    }

    private final boolean isOpenEnabled() {
        return getAnchors$material_release().values().contains(BottomDrawerValue.Open);
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Closed, null, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animateTo$default == coroutine_suspended ? animateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Expanded, null, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animateTo$default == coroutine_suspended ? animateTo$default : Unit.INSTANCE;
    }

    @NotNull
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final boolean isClosed() {
        return getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return getCurrentValue() != BottomDrawerValue.Closed;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object animateTo$default = SwipeableState.animateTo$default(this, isOpenEnabled() ? BottomDrawerValue.Open : BottomDrawerValue.Expanded, null, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animateTo$default == coroutine_suspended ? animateTo$default : Unit.INSTANCE;
    }
}
