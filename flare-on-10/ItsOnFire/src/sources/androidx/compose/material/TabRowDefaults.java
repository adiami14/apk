package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u00020\u0006ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u0006ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "()V", "DividerOpacity", "", "DividerThickness", "Landroidx/compose/ui/unit/Dp;", "getDividerThickness-D9Ej5fM", "()F", "F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "height", "Indicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material/TabPosition;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/TabRowDefaults.class */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    @NotNull
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m4785constructorimpl(1);
    private static final float IndicatorHeight = Dp.m4785constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m4785constructorimpl(52);

    private TabRowDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* renamed from: Divider-9IZ8Weo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1574Divider9IZ8Weo(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r12, float r13, long r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.m1574Divider9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    /* renamed from: Indicator-9IZ8Weo  reason: not valid java name */
    public final void m1575Indicator9IZ8Weo(@Nullable Modifier modifier, float f2, long j2, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        float f3;
        Composer startRestartGroup = composer.startRestartGroup(500351718);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(f2)) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 = i4 | 3072;
        } else {
            i5 = i4;
            if ((i2 & 7168) == 0) {
                i5 = i4 | (startRestartGroup.changed(this) ? 2048 : 1024);
            }
        }
        if (((i5 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    modifier = Modifier.Companion;
                }
                if ((i3 & 2) != 0) {
                    f2 = m1577getIndicatorHeightD9Ej5fM();
                }
                modifier2 = modifier;
                f3 = f2;
                if ((i3 & 4) != 0) {
                    j2 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2424unboximpl();
                    startRestartGroup.endDefaults();
                    BoxKt.Box(BackgroundKt.m349backgroundbw27NRU$default(SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f2), j2, null, 2, null), startRestartGroup, 0);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                f3 = f2;
            }
            f2 = f3;
            modifier = modifier2;
            startRestartGroup.endDefaults();
            BoxKt.Box(BackgroundKt.m349backgroundbw27NRU$default(SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f2), j2, null, 2, null), startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier;
        final float f4 = f2;
        final long j3 = j2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
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
                TabRowDefaults.this.m1575Indicator9IZ8Weo(modifier3, f4, j3, composer2, i2 | 1, i3);
            }
        });
    }

    /* renamed from: getDividerThickness-D9Ej5fM  reason: not valid java name */
    public final float m1576getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m1577getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM  reason: not valid java name */
    public final float m1578getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    @NotNull
    public final Modifier tabIndicatorOffset(@NotNull Modifier modifier, @NotNull final TabPosition currentTabPosition) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(TabPosition.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            /* renamed from: invoke$lambda-0  reason: not valid java name */
            private static final float m1579invoke$lambda0(State<Dp> state) {
                return state.getValue().m4799unboximpl();
            }

            /* renamed from: invoke$lambda-1  reason: not valid java name */
            private static final float m1580invoke$lambda1(State<Dp> state) {
                return state.getValue().m4799unboximpl();
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(321936383);
                State<Dp> m222animateDpAsStateKz89ssw = AnimateAsStateKt.m222animateDpAsStateKz89ssw(TabPosition.this.m1572getWidthD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4);
                Modifier m731width3ABfNKs = SizeKt.m731width3ABfNKs(OffsetKt.m665offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null), m1580invoke$lambda1(AnimateAsStateKt.m222animateDpAsStateKz89ssw(TabPosition.this.m1570getLeftD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4)), 0.0f, 2, null), m1579invoke$lambda0(m222animateDpAsStateKz89ssw));
                composer.endReplaceableGroup();
                return m731width3ABfNKs;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
