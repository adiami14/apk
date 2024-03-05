package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0080\b\u0018��2\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001��¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u0005HÆ\u0003ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\bJ*\u0010\u0013\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u001d\u0010\u001e\u001a\u00020\u001f*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0017ø\u0001��J\u0014\u0010#\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010'\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0019\u0010\u000f\u001a\u00020\rX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "density", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "maxHeight", "Landroidx/compose/ui/unit/Dp;", "F", "maxWidth", "component1", "component2", "component2-msEJaDk", "copy", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "equals", "", "other", "", "hashCode", "", "toString", "", "animateItemPlacement", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "fillParentMaxHeight", "fraction", "", "fillParentMaxSize", "fillParentMaxWidth", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazyItemScopeImpl.class */
public final class LazyItemScopeImpl implements LazyItemScope {
    private final long constraints;
    @NotNull
    private final Density density;
    private final float maxHeight;
    private final float maxWidth;

    private LazyItemScopeImpl(Density density, long j2) {
        this.density = density;
        this.constraints = j2;
        this.maxWidth = density.mo521toDpu2uoSUM(Constraints.m4752getMaxWidthimpl(m799getConstraintsmsEJaDk()));
        this.maxHeight = density.mo521toDpu2uoSUM(Constraints.m4751getMaxHeightimpl(m799getConstraintsmsEJaDk()));
    }

    public /* synthetic */ LazyItemScopeImpl(Density density, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j2);
    }

    /* renamed from: copy-0kLqBqw$default  reason: not valid java name */
    public static /* synthetic */ LazyItemScopeImpl m796copy0kLqBqw$default(LazyItemScopeImpl lazyItemScopeImpl, Density density, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            density = lazyItemScopeImpl.density;
        }
        if ((i2 & 2) != 0) {
            j2 = lazyItemScopeImpl.constraints;
        }
        return lazyItemScopeImpl.m798copy0kLqBqw(density, j2);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @ExperimentalFoundationApi
    @NotNull
    public Modifier animateItemPlacement(@NotNull Modifier modifier, @NotNull final FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return modifier.then(new AnimateItemPlacementModifier(animationSpec, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.lazy.list.LazyItemScopeImpl$animateItemPlacement$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("animateItemPlacement");
                inspectorInfo.setValue(FiniteAnimationSpec.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @NotNull
    public final Density component1() {
        return this.density;
    }

    /* renamed from: component2-msEJaDk  reason: not valid java name */
    public final long m797component2msEJaDk() {
        return this.constraints;
    }

    @NotNull
    /* renamed from: copy-0kLqBqw  reason: not valid java name */
    public final LazyItemScopeImpl m798copy0kLqBqw(@NotNull Density density, long j2) {
        Intrinsics.checkNotNullParameter(density, "density");
        return new LazyItemScopeImpl(density, j2, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyItemScopeImpl) {
            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
            return Intrinsics.areEqual(this.density, lazyItemScopeImpl.density) && Constraints.m4745equalsimpl0(this.constraints, lazyItemScopeImpl.constraints);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxHeight(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SizeKt.m712height3ABfNKs(modifier, Dp.m4785constructorimpl(this.maxHeight * f2));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxSize(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SizeKt.m728sizeVpY3zN4(modifier, Dp.m4785constructorimpl(this.maxWidth * f2), Dp.m4785constructorimpl(this.maxHeight * f2));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxWidth(@NotNull Modifier modifier, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SizeKt.m731width3ABfNKs(modifier, Dp.m4785constructorimpl(this.maxWidth * f2));
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m799getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m4755hashCodeimpl(this.constraints);
    }

    @NotNull
    public String toString() {
        return "LazyItemScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m4757toStringimpl(this.constraints)) + ')';
    }
}
