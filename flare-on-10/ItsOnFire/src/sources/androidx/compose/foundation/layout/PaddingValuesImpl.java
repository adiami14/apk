package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0001\u0018��2\u00020\u0001B0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001��¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u0003H\u0016ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u0003H\u0016ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016R'\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR'\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR'\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM$annotations", "getEnd-D9Ej5fM", "getStart-D9Ej5fM$annotations", "getStart-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/layout/PaddingValuesImpl.class */
public final class PaddingValuesImpl implements PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    private PaddingValuesImpl(float f2, float f3, float f4, float f5) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
    }

    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.m4785constructorimpl(0) : f2, (i2 & 2) != 0 ? Dp.m4785constructorimpl(0) : f3, (i2 & 4) != 0 ? Dp.m4785constructorimpl(0) : f4, (i2 & 8) != 0 ? Dp.m4785constructorimpl(0) : f5, null);
    }

    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m693getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m694getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m695getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m696getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo685calculateBottomPaddingD9Ej5fM() {
        return m697getBottomD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo686calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? m699getStartD9Ej5fM() : m698getEndD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo687calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? m698getEndD9Ej5fM() : m699getStartD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo688calculateTopPaddingD9Ej5fM() {
        return m700getTopD9Ej5fM();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof PaddingValuesImpl) {
            PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
            boolean z = false;
            if (Dp.m4790equalsimpl0(m699getStartD9Ej5fM(), paddingValuesImpl.m699getStartD9Ej5fM())) {
                z = false;
                if (Dp.m4790equalsimpl0(m700getTopD9Ej5fM(), paddingValuesImpl.m700getTopD9Ej5fM())) {
                    z = false;
                    if (Dp.m4790equalsimpl0(m698getEndD9Ej5fM(), paddingValuesImpl.m698getEndD9Ej5fM())) {
                        z = false;
                        if (Dp.m4790equalsimpl0(m697getBottomD9Ej5fM(), paddingValuesImpl.m697getBottomD9Ej5fM())) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
        return false;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m697getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM  reason: not valid java name */
    public final float m698getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m699getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m700getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m4791hashCodeimpl(m699getStartD9Ej5fM()) * 31) + Dp.m4791hashCodeimpl(m700getTopD9Ej5fM())) * 31) + Dp.m4791hashCodeimpl(m698getEndD9Ej5fM())) * 31) + Dp.m4791hashCodeimpl(m697getBottomD9Ej5fM());
    }

    @NotNull
    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m4796toStringimpl(m699getStartD9Ej5fM())) + ", top=" + ((Object) Dp.m4796toStringimpl(m700getTopD9Ej5fM())) + ", end=" + ((Object) Dp.m4796toStringimpl(m698getEndD9Ej5fM())) + ", bottom=" + ((Object) Dp.m4796toStringimpl(m697getBottomD9Ej5fM())) + ')';
    }
}
