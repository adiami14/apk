package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��$\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\u001aY\u0010��\u001a\u00020\u0001*\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032:\b\u0002\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"animateContentSize", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "finishedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/animation/AnimationModifierKt.class */
public final class AnimationModifierKt {
    @NotNull
    public static final Modifier animateContentSize(@NotNull Modifier modifier, @NotNull final FiniteAnimationSpec<IntSize> animationSpec, @Nullable final Function2<? super IntSize, ? super IntSize, Unit> function2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("animateContentSize");
                inspectorInfo.getProperties().set("animationSpec", FiniteAnimationSpec.this);
                inspectorInfo.getProperties().set("finishedListener", function2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
                if (r0 == r0.getEmpty()) goto L11;
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
                    r1 = 996776706(0x3b699b02, float:0.003564537)
                    r0.startReplaceableGroup(r1)
                    r0 = r7
                    r1 = -723524056(0xffffffffd4dfe628, float:-7.6931127E12)
                    r0.startReplaceableGroup(r1)
                    r0 = r7
                    r1 = -3687241(0xffffffffffc7bcb7, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r7
                    java.lang.Object r0 = r0.rememberedValue()
                    r9 = r0
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
                    r10 = r0
                    r0 = r9
                    r11 = r0
                    r0 = r9
                    r1 = r10
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L51
                    androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
                    r1 = r0
                    kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                    r3 = r7
                    j.u0 r2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r2, r3)
                    r1.<init>(r2)
                    r11 = r0
                    r0 = r7
                    r1 = r11
                    r0.updateRememberedValue(r1)
                L51:
                    r0 = r7
                    r0.endReplaceableGroup()
                    r0 = r11
                    androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
                    j.u0 r0 = r0.getCoroutineScope()
                    r12 = r0
                    r0 = r7
                    r0.endReplaceableGroup()
                    r0 = r5
                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> r0 = r5
                    r13 = r0
                    r0 = r7
                    r1 = -3686930(0xffffffffffc7bdee, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r7
                    r1 = r12
                    boolean r0 = r0.changed(r1)
                    r14 = r0
                    r0 = r7
                    java.lang.Object r0 = r0.rememberedValue()
                    r9 = r0
                    r0 = r14
                    if (r0 != 0) goto L9a
                    r0 = r9
                    r11 = r0
                    r0 = r9
                    r1 = r10
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto Laf
                L9a:
                    androidx.compose.animation.SizeAnimationModifier r0 = new androidx.compose.animation.SizeAnimationModifier
                    r1 = r0
                    r2 = r13
                    r3 = r12
                    r1.<init>(r2, r3)
                    r11 = r0
                    r0 = r7
                    r1 = r11
                    r0.updateRememberedValue(r1)
                Laf:
                    r0 = r7
                    r0.endReplaceableGroup()
                    r0 = r11
                    androidx.compose.animation.SizeAnimationModifier r0 = (androidx.compose.animation.SizeAnimationModifier) r0
                    r11 = r0
                    r0 = r11
                    r1 = r5
                    kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, kotlin.Unit> r1 = r4
                    r0.setListener(r1)
                    r0 = r6
                    androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.ClipKt.clipToBounds(r0)
                    r1 = r11
                    androidx.compose.ui.Modifier r0 = r0.then(r1)
                    r6 = r0
                    r0 = r7
                    r0.endReplaceableGroup()
                    r0 = r6
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimationModifierKt$animateContentSize$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, function2);
    }
}
