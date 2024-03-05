package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatingLayoutNodeWrapper;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\b��\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020��0\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "semanticsModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V", "useMinimumTouchTarget", "", "getUseMinimumTouchTarget", "()Z", "collapsedSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "detach", "", "hitTestSemantics", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitSemanticsWrappers", "Landroidx/compose/ui/node/HitTestResult;", "isInLayer", "hitTestSemantics-9KIMszo", "(JLandroidx/compose/ui/node/HitTestResult;Z)V", "onModifierChanged", "toString", "", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/semantics/SemanticsWrapper.class */
public final class SemanticsWrapper extends DelegatingLayoutNodeWrapper<SemanticsModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull SemanticsModifier semanticsModifier) {
        super(wrapped, semanticsModifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(semanticsModifier, "semanticsModifier");
    }

    private final boolean getUseMinimumTouchTarget() {
        return SemanticsConfigurationKt.getOrNull(getModifier().getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    @NotNull
    public final SemanticsConfiguration collapsedSemanticsConfiguration() {
        SemanticsWrapper semanticsWrapper;
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper = wrapped$ui_release;
            if (layoutNodeWrapper == null) {
                semanticsWrapper = null;
                break;
            } else if (layoutNodeWrapper instanceof SemanticsWrapper) {
                semanticsWrapper = (SemanticsWrapper) layoutNodeWrapper;
                break;
            } else {
                wrapped$ui_release = layoutNodeWrapper.getWrapped$ui_release();
            }
        }
        if (semanticsWrapper == null || getModifier().getSemanticsConfiguration().isClearingSemantics()) {
            return getModifier().getSemanticsConfiguration();
        }
        SemanticsConfiguration copy = getModifier().getSemanticsConfiguration().copy();
        copy.collapsePeer$ui_release(semanticsWrapper.collapsedSemanticsConfiguration());
        return copy;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        super.detach();
        Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
        if (owner$ui_release == null) {
            return;
        }
        owner$ui_release.onSemanticsChange();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTestSemantics-9KIMszo */
    public void mo4031hitTestSemantics9KIMszo(final long j2, @NotNull final HitTestResult<SemanticsWrapper> hitSemanticsWrappers, boolean z) {
        Intrinsics.checkNotNullParameter(hitSemanticsWrappers, "hitSemanticsWrappers");
        m4030hitTestInMinimumTouchTarget7362WCg(j2, hitSemanticsWrappers, false, true, z, this, new Function1<Boolean, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsWrapper$hitTestSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                SemanticsWrapper.this.getWrapped$ui_release().mo4031hitTestSemantics9KIMszo(SemanticsWrapper.this.getWrapped$ui_release().m4077fromParentPositionMKHz9U(j2), hitSemanticsWrappers, z2);
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
        if (owner$ui_release == null) {
            return;
        }
        owner$ui_release.onSemanticsChange();
    }

    @NotNull
    public String toString() {
        return super.toString() + " id: " + getModifier().getId() + " config: " + getModifier().getSemanticsConfiguration();
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (isAttached()) {
            if (getUseMinimumTouchTarget()) {
                LayoutCoordinates findRoot = LayoutCoordinatesKt.findRoot(this);
                MutableRect rectCache = getRectCache();
                long m4075calculateMinimumTouchTargetPaddingE7KxVPU = m4075calculateMinimumTouchTargetPaddingE7KxVPU(m4078getMinimumTouchTargetSizeNHjbRc());
                rectCache.setLeft(-Size.m2239getWidthimpl(m4075calculateMinimumTouchTargetPaddingE7KxVPU));
                rectCache.setTop(-Size.m2236getHeightimpl(m4075calculateMinimumTouchTargetPaddingE7KxVPU));
                rectCache.setRight(getMeasuredWidth() + Size.m2239getWidthimpl(m4075calculateMinimumTouchTargetPaddingE7KxVPU));
                rectCache.setBottom(getMeasuredHeight() + Size.m2236getHeightimpl(m4075calculateMinimumTouchTargetPaddingE7KxVPU));
                LayoutNodeWrapper layoutNodeWrapper = this;
                while (layoutNodeWrapper != findRoot) {
                    layoutNodeWrapper.rectInParent$ui_release(rectCache, false, true);
                    if (!rectCache.isEmpty()) {
                        layoutNodeWrapper = layoutNodeWrapper.getWrappedBy$ui_release();
                        Intrinsics.checkNotNull(layoutNodeWrapper);
                    }
                }
                return MutableRectKt.toRect(rectCache);
            }
            return LayoutCoordinatesKt.boundsInRoot(this);
        }
        return Rect.Companion.getZero();
    }
}
