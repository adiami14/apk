package androidx.compose.material.ripple;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Stable
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018��2\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001��¢\u0006\u0002\u0010\tJI\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0017ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ripple/CommonRipple;", "Landroidx/compose/material/ripple/Ripple;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/ripple/CommonRipple.class */
public final class CommonRipple extends Ripple {
    private CommonRipple(boolean z, float f2, State<Color> state) {
        super(z, f2, state, null);
    }

    public /* synthetic */ CommonRipple(boolean z, float f2, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f2, state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0056, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @Override // androidx.compose.material.ripple.Ripple
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: rememberUpdatedRippleInstance-942rkJo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.material.ripple.RippleIndicationInstance mo1911rememberUpdatedRippleInstance942rkJo(@org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r9, boolean r10, float r11, @org.jetbrains.annotations.NotNull androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> r12, @org.jetbrains.annotations.NotNull androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15) {
        /*
            r8 = this;
            r0 = r9
            java.lang.String r1 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            java.lang.String r1 = "color"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r13
            java.lang.String r1 = "rippleAlpha"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r14
            r1 = -1999846261(0xffffffff88ccc48b, float:-1.232401E-33)
            r0.startReplaceableGroup(r1)
            r0 = r14
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r14
            r1 = r9
            boolean r0 = r0.changed(r1)
            r16 = r0
            r0 = r14
            r1 = r8
            boolean r0 = r0.changed(r1)
            r17 = r0
            r0 = r14
            java.lang.Object r0 = r0.rememberedValue()
            r18 = r0
            r0 = r17
            r1 = r16
            r0 = r0 | r1
            if (r0 != 0) goto L59
            r0 = r18
            r9 = r0
            r0 = r18
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L70
        L59:
            androidx.compose.material.ripple.CommonRippleIndicationInstance r0 = new androidx.compose.material.ripple.CommonRippleIndicationInstance
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r0
            r0 = r14
            r1 = r9
            r0.updateRememberedValue(r1)
        L70:
            r0 = r14
            r0.endReplaceableGroup()
            r0 = r9
            androidx.compose.material.ripple.CommonRippleIndicationInstance r0 = (androidx.compose.material.ripple.CommonRippleIndicationInstance) r0
            r9 = r0
            r0 = r14
            r0.endReplaceableGroup()
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.CommonRipple.mo1911rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource, boolean, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):androidx.compose.material.ripple.RippleIndicationInstance");
    }
}
