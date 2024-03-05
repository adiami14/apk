package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\b\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J;\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/PointerInputDelegatingWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/pointer/PointerInputModifier;)V", "hitTest", "", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "isTouchEvent", "", "isInLayer", "hitTest-M_7yMNQ", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "hitTestChild-M_7yMNQ", "onInitialize", "shouldSharePointerInputWithSiblings", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/PointerInputDelegatingWrapper.class */
public final class PointerInputDelegatingWrapper extends DelegatingLayoutNodeWrapper<PointerInputModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInputDelegatingWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull PointerInputModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hitTestChild-M_7yMNQ  reason: not valid java name */
    public final void m4116hitTestChildM_7yMNQ(long j2, HitTestResult<PointerInputFilter> hitTestResult, boolean z, boolean z2) {
        getWrapped$ui_release().mo4029hitTestM_7yMNQ(getWrapped$ui_release().m4077fromParentPositionMKHz9U(j2), hitTestResult, z, z2);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTest-M_7yMNQ */
    public void mo4029hitTestM_7yMNQ(final long j2, @NotNull final HitTestResult<PointerInputFilter> hitTestResult, final boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        m4030hitTestInMinimumTouchTarget7362WCg(j2, hitTestResult, getModifier().getPointerInputFilter().getInterceptOutOfBoundsChildEvents(), z, z2, getModifier().getPointerInputFilter(), new Function1<Boolean, Unit>() { // from class: androidx.compose.ui.node.PointerInputDelegatingWrapper$hitTest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z3) {
                PointerInputDelegatingWrapper.this.m4116hitTestChildM_7yMNQ(j2, hitTestResult, z, z3);
            }
        });
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    public void onInitialize() {
        super.onInitialize();
        getModifier().getPointerInputFilter().setLayoutCoordinates$ui_release(this);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    public boolean shouldSharePointerInputWithSiblings() {
        return getModifier().getPointerInputFilter().getShareWithSiblings() || getWrapped$ui_release().shouldSharePointerInputWithSiblings();
    }
}
