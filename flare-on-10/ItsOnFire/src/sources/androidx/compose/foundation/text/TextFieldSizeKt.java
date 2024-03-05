package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H��¨\u0006\u0004"}, d2 = {"textFieldMinSize", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldSizeKt.class */
public final class TextFieldSizeKt {
    @NotNull
    public static final Modifier textFieldMinSize(@NotNull Modifier modifier, @NotNull final TextStyle style) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(31601380);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Font.ResourceLoader resourceLoader = (Font.ResourceLoader) composer.consume(CompositionLocalsKt.getLocalFontLoader());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle = TextStyle.this;
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                TextFieldSize textFieldSize = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    textFieldSize = new TextFieldSize(layoutDirection, density, resourceLoader, textStyle);
                    composer.updateRememberedValue(textFieldSize);
                }
                composer.endReplaceableGroup();
                final TextFieldSize textFieldSize2 = (TextFieldSize) textFieldSize;
                textFieldSize2.update(layoutDirection, density, resourceLoader, TextStyle.this);
                Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.1
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1019invoke3p2s80s(measureScope, measurable, constraints.m4758unboximpl());
                    }

                    @NotNull
                    /* renamed from: invoke-3p2s80s  reason: not valid java name */
                    public final MeasureResult m1019invoke3p2s80s(@NotNull MeasureScope layout2, @NotNull Measurable measurable, long j2) {
                        int coerceIn;
                        int coerceIn2;
                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        SizeKt.m711defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 0.0f, 3, null);
                        long m1018getMinSizeYbymL2g = TextFieldSize.this.m1018getMinSizeYbymL2g();
                        coerceIn = RangesKt___RangesKt.coerceIn(IntSize.m4951getWidthimpl(m1018getMinSizeYbymL2g), Constraints.m4754getMinWidthimpl(j2), Constraints.m4752getMaxWidthimpl(j2));
                        coerceIn2 = RangesKt___RangesKt.coerceIn(IntSize.m4950getHeightimpl(m1018getMinSizeYbymL2g), Constraints.m4753getMinHeightimpl(j2), Constraints.m4751getMaxHeightimpl(j2));
                        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(Constraints.m4743copyZbe2FdA$default(j2, coerceIn, 0, coerceIn2, 0, 10, null));
                        return MeasureScope.DefaultImpls.layout$default(layout2, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout3) {
                                Intrinsics.checkNotNullParameter(layout3, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout3, Placeable.this, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                });
                composer.endReplaceableGroup();
                return layout;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }
}
