package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.messaging.ServiceStarter;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��:\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\u001a4\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H��\"\u0019\u0010��\u001a\u00020\u0001X\u0080\u0004ø\u0001��¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getCursorAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldCursorKt.class */
public final class TextFieldCursorKt {
    private static final float DefaultCursorThickness = Dp.m4785constructorimpl(2);

    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull final TextFieldState state, @NotNull final TextFieldValue value, @NotNull final OffsetMapping offsetMapping, @NotNull final Brush cursorBrush, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(cursorBrush, "cursorBrush");
        Modifier modifier2 = modifier;
        if (z) {
            modifier2 = ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1  reason: invalid class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldCursorKt$cursor$1$1.class */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$cursorAlpha = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$cursorAlpha, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended;
                        AnimationSpec cursorAnimationSpec;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                            Float boxFloat = Boxing.boxFloat(0.0f);
                            cursorAnimationSpec = TextFieldCursorKt.getCursorAnimationSpec();
                            this.label = 1;
                            if (Animatable.animateTo$default(animatable, boxFloat, cursorAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
                    if ((((androidx.compose.ui.graphics.SolidColor) r0).m2691getValue0d7_KjU() == androidx.compose.ui.graphics.Color.Companion.m2450getUnspecified0d7_KjU()) == false) goto L23;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v31, types: [androidx.compose.ui.Modifier] */
                @androidx.compose.runtime.Composable
                @org.jetbrains.annotations.NotNull
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
                    /*
                        Method dump skipped, instructions count: 237
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier3, Composer composer, Integer num) {
                    return invoke(modifier3, composer, num.intValue());
                }
            }, 1, null);
        }
        return modifier2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> getCursorAnimationSpec() {
        return AnimationSpecKt.m236infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1000);
                Float valueOf = Float.valueOf(1.0f);
                keyframes.at(valueOf, 0);
                keyframes.at(valueOf, 499);
                Float valueOf2 = Float.valueOf(0.0f);
                keyframes.at(valueOf2, ServiceStarter.ERROR_UNKNOWN);
                keyframes.at(valueOf2, 999);
            }
        }), null, 0L, 6, null);
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
