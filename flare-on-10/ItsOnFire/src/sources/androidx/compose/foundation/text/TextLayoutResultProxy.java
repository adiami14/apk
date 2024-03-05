package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J%\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0014ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aø\u0001��ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "value", "Landroidx/compose/ui/text/TextLayoutResult;", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "decorationBoxCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getDecorationBoxCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setDecorationBoxCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "innerTextFieldCoordinates", "getInnerTextFieldCoordinates", "setInnerTextFieldCoordinates", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "getLineEnd", "", "lineIndex", "visibleEnd", "", "getLineForVerticalPosition", "vertical", "", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "coerceInVisibleBounds", "getOffsetForPosition-3MmeM6k", "(JZ)I", "isPositionOnText", "offset", "isPositionOnText-k-4lQ0M", "(J)Z", "coercedInVisibleBoundsOfInputText", "coercedInVisibleBoundsOfInputText-MK-Hz9U", "(J)J", "relativeToInputText", "relativeToInputText-MK-Hz9U", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextLayoutResultProxy.class */
public final class TextLayoutResultProxy {
    @Nullable
    private LayoutCoordinates decorationBoxCoordinates;
    @Nullable
    private LayoutCoordinates innerTextFieldCoordinates;
    @NotNull
    private final TextLayoutResult value;

    public TextLayoutResultProxy(@NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U  reason: not valid java name */
    private final long m1023coercedInVisibleBoundsOfInputTextMKHz9U(long j2) {
        long m1029coerceIn3MmeM6k;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        Rect rect = null;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                LayoutCoordinates decorationBoxCoordinates = getDecorationBoxCoordinates();
                if (decorationBoxCoordinates != null) {
                    rect = LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(decorationBoxCoordinates, layoutCoordinates, false, 2, null);
                }
            } else {
                rect = Rect.Companion.getZero();
            }
        }
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = Rect.Companion.getZero();
        }
        m1029coerceIn3MmeM6k = TextLayoutResultProxyKt.m1029coerceIn3MmeM6k(j2, rect2);
        return m1029coerceIn3MmeM6k;
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy.getLineEnd(i2, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default  reason: not valid java name */
    public static /* synthetic */ int m1024getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m1026getOffsetForPosition3MmeM6k(j2, z);
    }

    /* renamed from: relativeToInputText-MK-Hz9U  reason: not valid java name */
    private final long m1025relativeToInputTextMKHz9U(long j2) {
        Offset m2156boximpl;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates != null) {
            LayoutCoordinates decorationBoxCoordinates = getDecorationBoxCoordinates();
            if (decorationBoxCoordinates == null) {
                m2156boximpl = null;
            } else {
                m2156boximpl = Offset.m2156boximpl((layoutCoordinates.isAttached() && decorationBoxCoordinates.isAttached()) ? layoutCoordinates.mo3928localPositionOfR5De75A(decorationBoxCoordinates, j2) : j2);
            }
            if (m2156boximpl != null) {
                j2 = m2156boximpl.m2177unboximpl();
            }
        }
        return j2;
    }

    @Nullable
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @Nullable
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i2, boolean z) {
        return this.value.getLineEnd(i2, z);
    }

    public final int getLineForVerticalPosition(float f2) {
        return this.value.getLineForVerticalPosition(Offset.m2168getYimpl(m1025relativeToInputTextMKHz9U(m1023coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, f2)))));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k  reason: not valid java name */
    public final int m1026getOffsetForPosition3MmeM6k(long j2, boolean z) {
        long j3 = j2;
        if (z) {
            j3 = m1023coercedInVisibleBoundsOfInputTextMKHz9U(j2);
        }
        return this.value.m4456getOffsetForPositionk4lQ0M(m1025relativeToInputTextMKHz9U(j3));
    }

    @NotNull
    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M  reason: not valid java name */
    public final boolean m1027isPositionOnTextk4lQ0M(long j2) {
        long m1025relativeToInputTextMKHz9U = m1025relativeToInputTextMKHz9U(m1023coercedInVisibleBoundsOfInputTextMKHz9U(j2));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m2168getYimpl(m1025relativeToInputTextMKHz9U));
        return Offset.m2167getXimpl(m1025relativeToInputTextMKHz9U) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m2167getXimpl(m1025relativeToInputTextMKHz9U) <= this.value.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }
}
