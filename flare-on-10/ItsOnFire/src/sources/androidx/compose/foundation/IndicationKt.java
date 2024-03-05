package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001a\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\"\u0017\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalIndication", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/Indication;", "getLocalIndication", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "indication", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/IndicationKt.class */
public final class IndicationKt {
    @NotNull
    private static final ProvidableCompositionLocal<Indication> LocalIndication = CompositionLocalKt.staticCompositionLocalOf(new Function0<Indication>() { // from class: androidx.compose.foundation.IndicationKt$LocalIndication$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Indication invoke() {
            return DefaultDebugIndication.INSTANCE;
        }
    });

    @NotNull
    public static final ProvidableCompositionLocal<Indication> getLocalIndication() {
        return LocalIndication;
    }

    @NotNull
    public static final Modifier indication(@NotNull Modifier modifier, @NotNull final InteractionSource interactionSource, @Nullable final Indication indication) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("indication");
                inspectorInfo.getProperties().set("indication", Indication.this);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.IndicationKt$indication$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L11;
             */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r7, int r8) {
                /*
                    r5 = this;
                    r0 = r6
                    java.lang.String r1 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0 = r7
                    r1 = -1051155076(0xffffffffc158a57c, float:-13.540401)
                    r0.startReplaceableGroup(r1)
                    r0 = r5
                    androidx.compose.foundation.Indication r0 = androidx.compose.foundation.Indication.this
                    r9 = r0
                    r0 = r9
                    r6 = r0
                    r0 = r9
                    if (r0 != 0) goto L20
                    androidx.compose.foundation.NoIndication r0 = androidx.compose.foundation.NoIndication.INSTANCE
                    r6 = r0
                L20:
                    r0 = r6
                    r1 = r5
                    androidx.compose.foundation.interaction.InteractionSource r1 = r5
                    r2 = r7
                    r3 = 0
                    androidx.compose.foundation.IndicationInstance r0 = r0.rememberUpdatedInstance(r1, r2, r3)
                    r10 = r0
                    r0 = r7
                    r1 = -3686930(0xffffffffffc7bdee, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r7
                    r1 = r10
                    boolean r0 = r0.changed(r1)
                    r11 = r0
                    r0 = r7
                    java.lang.Object r0 = r0.rememberedValue()
                    r9 = r0
                    r0 = r11
                    if (r0 != 0) goto L5b
                    r0 = r9
                    r6 = r0
                    r0 = r9
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L6c
                L5b:
                    androidx.compose.foundation.IndicationModifier r0 = new androidx.compose.foundation.IndicationModifier
                    r1 = r0
                    r2 = r10
                    r1.<init>(r2)
                    r6 = r0
                    r0 = r7
                    r1 = r6
                    r0.updateRememberedValue(r1)
                L6c:
                    r0 = r7
                    r0.endReplaceableGroup()
                    r0 = r6
                    androidx.compose.foundation.IndicationModifier r0 = (androidx.compose.foundation.IndicationModifier) r0
                    r6 = r0
                    r0 = r7
                    r0.endReplaceableGroup()
                    r0 = r6
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.IndicationKt$indication$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
