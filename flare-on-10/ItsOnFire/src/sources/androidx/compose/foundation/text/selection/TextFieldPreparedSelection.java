package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b��\u0018��2\b\u0012\u0004\u0012\u00020��0\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001f\u0010\u0011\u001a\u00020��2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020��\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020��J\u0006\u0010\u0017\u001a\u00020��J\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "currentValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "layoutResultProxy", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "value", "getValue", "deleteIfSelectedOr", "or", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "moveCursorDownByPage", "moveCursorUpByPage", "jumpByPagesOffset", "", "pagesAmount", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/TextFieldPreparedSelection.class */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    @NotNull
    private final TextFieldValue currentValue;
    @Nullable
    private final TextLayoutResultProxy layoutResultProxy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPreparedSelection(@NotNull TextFieldValue currentValue, @NotNull OffsetMapping offsetMapping, @Nullable TextLayoutResultProxy textLayoutResultProxy, @NotNull TextPreparedSelectionState state) {
        super(currentValue.getAnnotatedString(), currentValue.m4616getSelectiond9O1mEE(), textLayoutResultProxy == null ? null : textLayoutResultProxy.getValue(), offsetMapping, state, null);
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentValue = currentValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (i2 & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i2 & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    private final int jumpByPagesOffset(TextLayoutResultProxy textLayoutResultProxy, int i2) {
        LayoutCoordinates decorationBoxCoordinates;
        LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
        Rect rect = null;
        if (innerTextFieldCoordinates != null && (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) != null) {
            rect = LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null);
        }
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = Rect.Companion.getZero();
        }
        Rect cursorRect = textLayoutResultProxy.getValue().getCursorRect(getOffsetMapping().originalToTransformed(TextRange.m4470getEndimpl(this.currentValue.m4616getSelectiond9O1mEE())));
        return getOffsetMapping().transformedToOriginal(textLayoutResultProxy.getValue().m4456getOffsetForPositionk4lQ0M(OffsetKt.Offset(cursorRect.getLeft(), cursorRect.getTop() + (Size.m2236getHeightimpl(rect2.m2201getSizeNHjbRc()) * i2))));
    }

    @NotNull
    public final TextFieldPreparedSelection deleteIfSelectedOr(@NotNull Function1<? super TextFieldPreparedSelection, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4469getCollapsedimpl(m1041getSelectiond9O1mEE())) {
                or.invoke(this);
            } else {
                deleteSelected();
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return TextFieldValue.m4611copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m1041getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy layoutResultProxy;
        if ((getText$foundation_release().length() > 0) && (layoutResultProxy = getLayoutResultProxy()) != null) {
            setCursor(jumpByPagesOffset(layoutResultProxy, 1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy layoutResultProxy;
        if ((getText$foundation_release().length() > 0) && (layoutResultProxy = getLayoutResultProxy()) != null) {
            setCursor(jumpByPagesOffset(layoutResultProxy, -1));
        }
        return this;
    }
}
