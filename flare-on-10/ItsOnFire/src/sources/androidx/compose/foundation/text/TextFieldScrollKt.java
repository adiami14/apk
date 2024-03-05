package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��R\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010��\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a4\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H��\u001a*\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\nH��¨\u0006\u001b"}, d2 = {"getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "", "textFieldWidth", "textFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldScrollKt.class */
public final class TextFieldScrollKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldScrollKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ Rect access$getCursorRectInScroller(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i3) {
        return getCursorRectInScroller(density, i2, transformedText, textLayoutResult, z, i3);
    }

    public static final Rect getCursorRectInScroller(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i3) {
        Rect cursorRect = textLayoutResult == null ? null : textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i2));
        Rect rect = cursorRect;
        if (cursorRect == null) {
            rect = Rect.Companion.getZero();
        }
        int mo518roundToPx0680j_4 = density.mo518roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z ? (i3 - rect.getLeft()) - mo518roundToPx0680j_4 : rect.getLeft(), 0.0f, z ? i3 - rect.getLeft() : rect.getLeft() + mo518roundToPx0680j_4, 0.0f, 10, null);
    }

    @NotNull
    public static final Modifier textFieldScroll(@NotNull Modifier modifier, @NotNull TextFieldScrollerPosition scrollerPosition, @NotNull TextFieldValue textFieldValue, @NotNull VisualTransformation visualTransformation, @NotNull Function0<TextLayoutResultProxy> textLayoutResultProvider) {
        Modifier.Element verticalScrollLayoutModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        Orientation orientation = scrollerPosition.getOrientation();
        int m1012getOffsetToFollow5zctL8 = scrollerPosition.m1012getOffsetToFollow5zctL8(textFieldValue.m4616getSelectiond9O1mEE());
        scrollerPosition.m1014setPreviousSelection5zctL8(textFieldValue.m4616getSelectiond9O1mEE());
        TransformedText filter = visualTransformation.filter(textFieldValue.getAnnotatedString());
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(scrollerPosition, m1012getOffsetToFollow5zctL8, filter, textLayoutResultProvider);
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(scrollerPosition, m1012getOffsetToFollow5zctL8, filter, textLayoutResultProvider);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    @NotNull
    public static final Modifier textFieldScrollable(@NotNull Modifier modifier, @NotNull final TextFieldScrollerPosition scrollerPosition, @Nullable final MutableInteractionSource mutableInteractionSource, final boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", TextFieldScrollerPosition.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                boolean z2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(994171470);
                boolean z3 = TextFieldScrollerPosition.this.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
                final TextFieldScrollerPosition textFieldScrollerPosition = TextFieldScrollerPosition.this;
                ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$controller$1
                    {
                        super(1);
                    }

                    @NotNull
                    public final Float invoke(float f2) {
                        float offset = TextFieldScrollerPosition.this.getOffset() + f2;
                        if (offset > TextFieldScrollerPosition.this.getMaximum()) {
                            f2 = TextFieldScrollerPosition.this.getMaximum() - TextFieldScrollerPosition.this.getOffset();
                        } else if (offset < 0.0f) {
                            f2 = -TextFieldScrollerPosition.this.getOffset();
                        }
                        TextFieldScrollerPosition textFieldScrollerPosition2 = TextFieldScrollerPosition.this;
                        textFieldScrollerPosition2.setOffset(textFieldScrollerPosition2.getOffset() + f2);
                        return Float.valueOf(f2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }
                }, composer, 0);
                Modifier.Companion companion = Modifier.Companion;
                Orientation orientation = TextFieldScrollerPosition.this.getOrientation();
                if (z) {
                    if (!(TextFieldScrollerPosition.this.getMaximum() == 0.0f)) {
                        z2 = true;
                        Modifier scrollable$default = ScrollableKt.scrollable$default(companion, rememberScrollableState, orientation, z2, z3, null, mutableInteractionSource, 16, null);
                        composer.endReplaceableGroup();
                        return scrollable$default;
                    }
                }
                z2 = false;
                Modifier scrollable$default2 = ScrollableKt.scrollable$default(companion, rememberScrollableState, orientation, z2, z3, null, mutableInteractionSource, 16, null);
                composer.endReplaceableGroup();
                return scrollable$default2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z);
    }
}
