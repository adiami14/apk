package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/RemeasureModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnRemeasuredModifier;)V", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/RemeasureModifierWrapper.class */
public final class RemeasureModifierWrapper extends DelegatingLayoutNodeWrapper<OnRemeasuredModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemeasureModifierWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull OnRemeasuredModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo3910measureBRTryo0(long j2) {
        OwnerSnapshotObserver snapshotObserver;
        Placeable mo3910measureBRTryo0 = super.mo3910measureBRTryo0(j2);
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long m3957getMeasuredSizeYbymL2g;
                m3957getMeasuredSizeYbymL2g = RemeasureModifierWrapper.this.m3957getMeasuredSizeYbymL2g();
                RemeasureModifierWrapper.this.getModifier().mo3951onRemeasuredozmzZPI(m3957getMeasuredSizeYbymL2g);
            }
        };
        Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
        Unit unit = null;
        if (owner$ui_release != null && (snapshotObserver = owner$ui_release.getSnapshotObserver()) != null) {
            snapshotObserver.withNoSnapshotReadObservation$ui_release(function0);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            function0.invoke();
        }
        return mo3910measureBRTryo0;
    }
}
