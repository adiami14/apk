package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0081\b\u0018��2\u00020\u0001B4\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007ø\u0001��¢\u0006\u0002\u0010\nJ5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u0003HÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JF\u0010 \u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "copy", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/DropdownMenuPositionProvider.class */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    @NotNull
    private final Density density;
    @NotNull
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j2, Density density, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.contentOffset = j2;
        this.density = density;
        this.onPositionCalculated = function2;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, (i2 & 4) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.DropdownMenuPositionProvider.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IntRect noName_0, @NotNull IntRect noName_1) {
                Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            }
        } : function2, null);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, function2);
    }

    /* renamed from: copy-rOJDEFc$default  reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1329copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j2, Density density, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i2 & 4) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1331copyrOJDEFc(j2, density, function2);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1044calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j2, @NotNull LayoutDirection layoutDirection, long j3) {
        Sequence sequenceOf;
        Sequence sequence;
        Object obj;
        Sequence sequenceOf2;
        Object obj2;
        int intValue;
        Sequence sequenceOf3;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int mo518roundToPx0680j_4 = this.density.mo518roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo518roundToPx0680j_42 = this.density.mo518roundToPx0680j_4(DpOffset.m4847getXD9Ej5fM(m1332getContentOffsetRKDOV3M()));
        int mo518roundToPx0680j_43 = this.density.mo518roundToPx0680j_4(DpOffset.m4849getYD9Ej5fM(m1332getContentOffsetRKDOV3M()));
        int left = anchorBounds.getLeft() + mo518roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo518roundToPx0680j_42) - IntSize.m4951getWidthimpl(j3);
        int m4951getWidthimpl = IntSize.m4951getWidthimpl(j2) - IntSize.m4951getWidthimpl(j3);
        if (layoutDirection == LayoutDirection.Ltr) {
            if (anchorBounds.getLeft() < 0) {
                m4951getWidthimpl = 0;
            }
            sequenceOf3 = SequencesKt__SequencesKt.sequenceOf(Integer.valueOf(left), Integer.valueOf(right), Integer.valueOf(m4951getWidthimpl));
            sequence = sequenceOf3;
        } else {
            if (anchorBounds.getRight() <= IntSize.m4951getWidthimpl(j2)) {
                m4951getWidthimpl = 0;
            }
            sequenceOf = SequencesKt__SequencesKt.sequenceOf(Integer.valueOf(right), Integer.valueOf(left), Integer.valueOf(m4951getWidthimpl));
            sequence = sequenceOf;
        }
        Iterator it = sequence.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int intValue2 = ((Number) obj).intValue();
            if (intValue2 >= 0 && intValue2 + IntSize.m4951getWidthimpl(j3) <= IntSize.m4951getWidthimpl(j2)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        int intValue3 = num == null ? right : num.intValue();
        int max = Math.max(anchorBounds.getBottom() + mo518roundToPx0680j_43, mo518roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo518roundToPx0680j_43) - IntSize.m4950getHeightimpl(j3);
        sequenceOf2 = SequencesKt__SequencesKt.sequenceOf(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m4950getHeightimpl(j3) / 2)), Integer.valueOf((IntSize.m4950getHeightimpl(j2) - IntSize.m4950getHeightimpl(j3)) - mo518roundToPx0680j_4));
        Iterator it2 = sequenceOf2.iterator();
        do {
            obj2 = null;
            if (!it2.hasNext()) {
                break;
            }
            obj2 = it2.next();
            intValue = ((Number) obj2).intValue();
        } while (!(intValue >= mo518roundToPx0680j_4 && intValue + IntSize.m4950getHeightimpl(j3) <= IntSize.m4950getHeightimpl(j2) - mo518roundToPx0680j_4));
        Integer num2 = (Integer) obj2;
        int intValue4 = num2 == null ? top : num2.intValue();
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(intValue3, intValue4, IntSize.m4951getWidthimpl(j3) + intValue3, IntSize.m4950getHeightimpl(j3) + intValue4));
        return IntOffsetKt.IntOffset(intValue3, intValue4);
    }

    /* renamed from: component1-RKDOV3M  reason: not valid java name */
    public final long m1330component1RKDOV3M() {
        return this.contentOffset;
    }

    @NotNull
    public final Density component2() {
        return this.density;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> component3() {
        return this.onPositionCalculated;
    }

    @NotNull
    /* renamed from: copy-rOJDEFc  reason: not valid java name */
    public final DropdownMenuPositionProvider m1331copyrOJDEFc(long j2, @NotNull Density density, @NotNull Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j2, density, onPositionCalculated, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            return DpOffset.m4846equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
        }
        return false;
    }

    /* renamed from: getContentOffset-RKDOV3M  reason: not valid java name */
    public final long m1332getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m4851hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m4854toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }
}
