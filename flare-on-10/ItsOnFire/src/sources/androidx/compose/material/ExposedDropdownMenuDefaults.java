package androidx.compose.material;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJñ\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010$Jñ\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b*\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalMaterialApi
/* loaded from: ItsOnFire.jar:androidx/compose/material/ExposedDropdownMenuDefaults.class */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @Composable
    @ExperimentalMaterialApi
    public final void TrailingIcon(final boolean z, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-572921624);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4;
            if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i5 = i4 | (startRestartGroup.changed(function0) ? 32 : 16);
            }
        }
        if (((i5 & 91) ^ 18) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                function0 = new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }
                };
            }
            IconButtonKt.IconButton(function0, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver clearAndSetSemantics) {
                    Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                }
            }), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -819901756, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i7) {
                    if (((i7 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        IconKt.m1381Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.Companion, z ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                    }
                }
            }), startRestartGroup, ((i5 >> 3) & 14) | 24576, 12);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Function0<Unit> function02 = function0;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                ExposedDropdownMenuDefaults.this.TrailingIcon(z, function02, composer2, i2 | 1, i3);
            }
        });
    }

    @Composable
    @NotNull
    /* renamed from: outlinedTextFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m1345outlinedTextFieldColorsDlUQjxs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, @Nullable Composer composer, int i2, int i3, int i4, int i5) {
        composer.startReplaceableGroup(-371518423);
        long m2413copywmQWz5c$default = (i5 & 1) != 0 ? Color.m2413copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2424unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        if ((i5 & 2) != 0) {
            j3 = Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 4) != 0) {
            j4 = Color.Companion.m2449getTransparent0d7_KjU();
        }
        if ((i5 & 8) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i5 & 16) != 0) {
            j6 = MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU();
        }
        if ((i5 & 32) != 0) {
            j7 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 64) != 0) {
            j8 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 128) != 0) {
            j9 = Color.m2413copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 256) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU();
        }
        long m2413copywmQWz5c$default2 = (i5 & 512) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2413copywmQWz5c$default3 = (i5 & 1024) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j24 = (i5 & 2048) != 0 ? m2413copywmQWz5c$default2 : j13;
        long m2413copywmQWz5c$default4 = (i5 & 4096) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m2413copywmQWz5c$default5 = (i5 & 8192) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m2413copywmQWz5c$default6 = (i5 & 16384) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m1222getError0d7_KjU = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU() : j17;
        long m2413copywmQWz5c$default7 = (65536 & i5) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m2413copywmQWz5c$default8 = (131072 & i5) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m2413copywmQWz5c$default9 = (262144 & i5) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m1222getError0d7_KjU2 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU() : j21;
        long m2413copywmQWz5c$default10 = (1048576 & i5) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i5 & 2097152) != 0) {
            j23 = Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m2413copywmQWz5c$default, j3, j5, j6, j7, j8, j10, j9, m2413copywmQWz5c$default2, m2413copywmQWz5c$default3, j24, m2413copywmQWz5c$default4, m2413copywmQWz5c$default5, m2413copywmQWz5c$default6, m1222getError0d7_KjU, j4, m2413copywmQWz5c$default7, m2413copywmQWz5c$default8, m2413copywmQWz5c$default9, m1222getError0d7_KjU2, m2413copywmQWz5c$default10, j23, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    @NotNull
    /* renamed from: textFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m1346textFieldColorsDlUQjxs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, @Nullable Composer composer, int i2, int i3, int i4, int i5) {
        composer.startReplaceableGroup(-1389007282);
        long m2413copywmQWz5c$default = (i5 & 1) != 0 ? Color.m2413copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2424unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        if ((i5 & 2) != 0) {
            j3 = Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 4) != 0) {
            j4 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 8) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU();
        }
        if ((i5 & 16) != 0) {
            j6 = MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU();
        }
        if ((i5 & 32) != 0) {
            j7 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 64) != 0) {
            j8 = Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 128) != 0) {
            j9 = Color.m2413copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 256) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU();
        }
        long m2413copywmQWz5c$default2 = (i5 & 512) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2413copywmQWz5c$default3 = (i5 & 1024) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j24 = (i5 & 2048) != 0 ? m2413copywmQWz5c$default2 : j13;
        long m2413copywmQWz5c$default4 = (i5 & 4096) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m2413copywmQWz5c$default5 = (i5 & 8192) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m2413copywmQWz5c$default6 = (i5 & 16384) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m1222getError0d7_KjU = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU() : j17;
        long m2413copywmQWz5c$default7 = (65536 & i5) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1228getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m2413copywmQWz5c$default8 = (131072 & i5) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m2413copywmQWz5c$default9 = (262144 & i5) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m1222getError0d7_KjU2 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1222getError0d7_KjU() : j21;
        long m2413copywmQWz5c$default10 = (1048576 & i5) != 0 ? Color.m2413copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1227getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m2413copywmQWz5c$default, j3, j5, j6, j7, j8, j10, j9, m2413copywmQWz5c$default2, m2413copywmQWz5c$default3, j24, m2413copywmQWz5c$default4, m2413copywmQWz5c$default5, m2413copywmQWz5c$default6, m1222getError0d7_KjU, j4, m2413copywmQWz5c$default7, m2413copywmQWz5c$default8, m2413copywmQWz5c$default9, m1222getError0d7_KjU2, m2413copywmQWz5c$default10, (i5 & 2097152) != 0 ? Color.m2413copywmQWz5c$default(m2413copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
