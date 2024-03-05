package androidx.compose.foundation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018��2\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/Indication;", "()V", "rememberUpdatedInstance", "Landroidx/compose/foundation/IndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/DefaultDebugIndication.class */
public final class DefaultDebugIndication implements Indication {
    @NotNull
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    @Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\b\u0002\u0018��2\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "isPressed", "Landroidx/compose/runtime/State;", "", "isHovered", "isFocused", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "drawIndication", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance.class */
    public static final class DefaultDebugIndicationInstance implements IndicationInstance {
        @NotNull
        private final State<Boolean> isFocused;
        @NotNull
        private final State<Boolean> isHovered;
        @NotNull
        private final State<Boolean> isPressed;

        public DefaultDebugIndicationInstance(@NotNull State<Boolean> isPressed, @NotNull State<Boolean> isHovered, @NotNull State<Boolean> isFocused) {
            Intrinsics.checkNotNullParameter(isPressed, "isPressed");
            Intrinsics.checkNotNullParameter(isHovered, "isHovered");
            Intrinsics.checkNotNullParameter(isFocused, "isFocused");
            this.isPressed = isPressed;
            this.isHovered = isHovered;
            this.isFocused = isFocused;
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
            long m2440getBlack0d7_KjU;
            float f2;
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.isPressed.getValue().booleanValue()) {
                m2440getBlack0d7_KjU = Color.Companion.m2440getBlack0d7_KjU();
                f2 = 0.3f;
            } else if (!this.isHovered.getValue().booleanValue() && !this.isFocused.getValue().booleanValue()) {
                return;
            } else {
                m2440getBlack0d7_KjU = Color.Companion.m2440getBlack0d7_KjU();
                f2 = 0.1f;
            }
            DrawScope.DefaultImpls.m2893drawRectnJ9OG0$default(contentDrawScope, Color.m2413copywmQWz5c$default(m2440getBlack0d7_KjU, f2, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo2841getSizeNHjbRc(), 0.0f, null, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, null);
        }
    }

    private DefaultDebugIndication() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @Override // androidx.compose.foundation.Indication
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.foundation.IndicationInstance rememberUpdatedInstance(@org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r7, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r8, int r9) {
        /*
            r6 = this;
            r0 = r7
            java.lang.String r1 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r8
            r1 = 1543446324(0x5bff1f34, float:1.43620855E17)
            r0.startReplaceableGroup(r1)
            r0 = r9
            r1 = 14
            r0 = r0 & r1
            r9 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            androidx.compose.runtime.State r0 = androidx.compose.foundation.interaction.PressInteractionKt.collectIsPressedAsState(r0, r1, r2)
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            androidx.compose.runtime.State r0 = androidx.compose.foundation.interaction.HoverInteractionKt.collectIsHoveredAsState(r0, r1, r2)
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            androidx.compose.runtime.State r0 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(r0, r1, r2)
            r12 = r0
            r0 = r8
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r8
            r1 = r7
            boolean r0 = r0.changed(r1)
            r13 = r0
            r0 = r8
            java.lang.Object r0 = r0.rememberedValue()
            r14 = r0
            r0 = r13
            if (r0 != 0) goto L57
            r0 = r14
            r7 = r0
            r0 = r14
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L6c
        L57:
            androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r0 = new androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r8
            r1 = r7
            r0.updateRememberedValue(r1)
        L6c:
            r0 = r8
            r0.endReplaceableGroup()
            r0 = r7
            androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r0 = (androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance) r0
            r7 = r0
            r0 = r8
            r0.endReplaceableGroup()
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance(androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.foundation.IndicationInstance");
    }
}
