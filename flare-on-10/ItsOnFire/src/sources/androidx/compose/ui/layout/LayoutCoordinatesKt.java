package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010��\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H��\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001��¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001��¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001��¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRoot", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/LayoutCoordinatesKt.class */
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        Rect rect = null;
        if (parentLayoutCoordinates != null) {
            rect = LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null);
        }
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect(0.0f, 0.0f, IntSize.m4951getWidthimpl(layoutCoordinates.mo3927getSizeYbymL2g()), IntSize.m4950getHeightimpl(layoutCoordinates.mo3927getSizeYbymL2g()));
        }
        return rect2;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(findRoot(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        float minOf;
        float minOf2;
        float maxOf;
        float maxOf2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        long mo3930localToWindowMKHz9U = findRoot.mo3930localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getTop()));
        long mo3930localToWindowMKHz9U2 = findRoot.mo3930localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getTop()));
        long mo3930localToWindowMKHz9U3 = findRoot.mo3930localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getBottom()));
        long mo3930localToWindowMKHz9U4 = findRoot.mo3930localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getBottom()));
        minOf = ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m2167getXimpl(mo3930localToWindowMKHz9U), Offset.m2167getXimpl(mo3930localToWindowMKHz9U2), Offset.m2167getXimpl(mo3930localToWindowMKHz9U4), Offset.m2167getXimpl(mo3930localToWindowMKHz9U3));
        minOf2 = ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m2168getYimpl(mo3930localToWindowMKHz9U), Offset.m2168getYimpl(mo3930localToWindowMKHz9U2), Offset.m2168getYimpl(mo3930localToWindowMKHz9U4), Offset.m2168getYimpl(mo3930localToWindowMKHz9U3));
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m2167getXimpl(mo3930localToWindowMKHz9U), Offset.m2167getXimpl(mo3930localToWindowMKHz9U2), Offset.m2167getXimpl(mo3930localToWindowMKHz9U4), Offset.m2167getXimpl(mo3930localToWindowMKHz9U3));
        maxOf2 = ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m2168getYimpl(mo3930localToWindowMKHz9U), Offset.m2168getYimpl(mo3930localToWindowMKHz9U2), Offset.m2168getYimpl(mo3930localToWindowMKHz9U4), Offset.m2168getYimpl(mo3930localToWindowMKHz9U3));
        return new Rect(minOf, minOf2, maxOf, maxOf2);
    }

    @NotNull
    public static final LayoutCoordinates findRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        do {
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2.getParentLayoutCoordinates();
        } while (layoutCoordinates != null);
        LayoutNodeWrapper layoutNodeWrapper = layoutCoordinates2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) layoutCoordinates2 : null;
        LayoutNodeWrapper layoutNodeWrapper2 = layoutNodeWrapper;
        if (layoutNodeWrapper == null) {
            return layoutCoordinates2;
        }
        while (true) {
            LayoutNodeWrapper wrappedBy$ui_release = layoutNodeWrapper2.getWrappedBy$ui_release();
            if (wrappedBy$ui_release == null) {
                return layoutNodeWrapper2;
            }
            layoutNodeWrapper2 = wrappedBy$ui_release;
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        Offset m2156boximpl = parentLayoutCoordinates == null ? null : Offset.m2156boximpl(parentLayoutCoordinates.mo3928localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2183getZeroF1C5BW0()));
        return m2156boximpl == null ? Offset.Companion.m2183getZeroF1C5BW0() : m2156boximpl.m2177unboximpl();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3929localToRootMKHz9U(Offset.Companion.m2183getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3930localToWindowMKHz9U(Offset.Companion.m2183getZeroF1C5BW0());
    }
}
