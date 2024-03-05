package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0002\u0010\u0004J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "value", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue-0d7_KjU", "()J", "J", "applyTo", "", "size", "Landroidx/compose/ui/geometry/Size;", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/SolidColor.class */
public final class SolidColor extends Brush {
    private final long value;

    private SolidColor(long j2) {
        super(null);
        this.value = j2;
    }

    public /* synthetic */ SolidColor(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo2363applyToPq9zytI(long j2, @NotNull Paint p2, float f2) {
        Intrinsics.checkNotNullParameter(p2, "p");
        p2.setAlpha(1.0f);
        p2.mo2294setColor8_81llA(!((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) == 0) ? Color.m2413copywmQWz5c$default(m2691getValue0d7_KjU(), Color.m2416getAlphaimpl(m2691getValue0d7_KjU()) * f2, 0.0f, 0.0f, 0.0f, 14, null) : m2691getValue0d7_KjU());
        if (p2.getShader() != null) {
            p2.setShader(null);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m2415equalsimpl0(m2691getValue0d7_KjU(), ((SolidColor) obj).m2691getValue0d7_KjU());
    }

    /* renamed from: getValue-0d7_KjU  reason: not valid java name */
    public final long m2691getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m2421hashCodeimpl(m2691getValue0d7_KjU());
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m2422toStringimpl(m2691getValue0d7_KjU())) + ')';
    }
}
