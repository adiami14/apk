package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��t\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\u001aa\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b��\u0010\r\"\b\b\u0001\u0010\u000e*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u0001H\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\r0\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\u0097\u0001\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001e2'\u0010%\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010'\u001a\u00020(H��ø\u0001��\u001aJ\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u0006\u0010)\u001a\u00020*2'\u0010%\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00180\u001e2\b\b\u0002\u0010'\u001a\u00020(H��ø\u0001��\"\u0013\u0010��\u001a\u00020\u0001X\u0082\u0004ø\u0001��¢\u0006\u0004\n\u0002\u0010\u0002\"\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0080\u0004ø\u0001��¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004ø\u0001��¢\u0006\u0002\n��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"OffsetDisplacementThreshold", "Landroidx/compose/ui/geometry/Offset;", "J", "TextFieldMagnifierOffsetProperty", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTextFieldMagnifierOffsetProperty", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "rememberAnimatedDerivedStateOf", "Landroidx/compose/runtime/State;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "visibilityThreshold", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "targetCalculation", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "textFieldMagnifierAndroidImpl", "Landroidx/compose/ui/Modifier;", "draggingHandle", "Landroidx/compose/foundation/text/Handle;", "fieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "transformTextOffset", "Lkotlin/Function1;", "", "getCursorRect", "Lkotlin/ParameterName;", "name", "offset", "Landroidx/compose/ui/geometry/Rect;", "androidMagnifier", "center", "isTextMagnifierSemanticsEnabled", "", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldMagnifierKt.class */
public final class TextFieldMagnifierKt {
    @NotNull
    private static final SemanticsPropertyKey<Offset> TextFieldMagnifierOffsetProperty = new SemanticsPropertyKey<>("TextFieldMagnifier", null, 2, null);
    @NotNull
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    @NotNull
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<Offset, AnimationVector2D>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m998invokek4lQ0M(offset.m2177unboximpl());
        }

        @NotNull
        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final AnimationVector2D m998invokek4lQ0M(long j2) {
            AnimationVector2D animationVector2D;
            AnimationVector2D animationVector2D2;
            if (OffsetKt.m2186isSpecifiedk4lQ0M(j2)) {
                animationVector2D2 = new AnimationVector2D(Offset.m2167getXimpl(j2), Offset.m2168getYimpl(j2));
            } else {
                animationVector2D = TextFieldMagnifierKt.UnspecifiedAnimationVector2D;
                animationVector2D2 = animationVector2D;
            }
            return animationVector2D2;
        }
    }, new Function1<AnimationVector2D, Offset>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m2156boximpl(m1000invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
        public final long m1000invoketuRUvjQ(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OffsetKt.Offset(it.getV1(), it.getV2());
        }
    });
    private static final long OffsetDisplacementThreshold = OffsetKt.Offset(0.01f, 0.01f);

    @NotNull
    public static final SemanticsPropertyKey<Offset> getTextFieldMagnifierOffsetProperty() {
        return TextFieldMagnifierOffsetProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final <T, V extends AnimationVector> State<T> rememberAnimatedDerivedStateOf(TwoWayConverter<T, V> twoWayConverter, T t2, AnimationSpec<T> animationSpec, Function0<? extends T> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1513221697);
        if ((i3 & 2) != 0) {
            t2 = null;
        }
        if ((i3 & 4) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, t2, 3, null);
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        State state = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            state = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(state);
        }
        composer.endReplaceableGroup();
        State state2 = (State) state;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        Animatable animatable = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            animatable = new Animatable(state2.getValue(), twoWayConverter, t2);
            composer.updateRememberedValue(animatable);
        }
        composer.endReplaceableGroup();
        Animatable animatable2 = (Animatable) animatable;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1(state2, animatable2, animationSpec, null), composer, 0);
        State<T> asState = animatable2.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    @NotNull
    public static final Modifier textFieldMagnifierAndroidImpl(@NotNull Modifier modifier, @NotNull final TextFieldSelectionManager manager, @NotNull Function1<? super Function0<Offset>, ? extends Modifier> androidMagnifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(androidMagnifier, "androidMagnifier");
        final TextFieldState state$foundation_release = manager.getState$foundation_release();
        return state$foundation_release == null ? Modifier.Companion : textFieldMagnifierAndroidImpl(modifier, new Function0<Handle>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Handle invoke() {
                return TextFieldState.this.getDraggingHandle();
            }
        }, new Function0<TextFieldValue>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldValue invoke() {
                return TextFieldSelectionManager.this.getValue$foundation_release();
            }
        }, new Function1<Integer, Integer>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$3
            {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i2) {
                return Integer.valueOf(TextFieldSelectionManager.this.getOffsetMapping$foundation_release().originalToTransformed(i2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, new Function1<Integer, Rect>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$4
            {
                super(1);
            }

            @Nullable
            public final Rect invoke(int i2) {
                TextLayoutResult value;
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                Rect rect = null;
                if (layoutResult != null && (value = layoutResult.getValue()) != null) {
                    rect = value.getCursorRect(i2);
                }
                return rect;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Rect invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, androidMagnifier, z);
    }

    @NotNull
    public static final Modifier textFieldMagnifierAndroidImpl(@NotNull Modifier modifier, @NotNull final Function0<? extends Handle> draggingHandle, @NotNull final Function0<TextFieldValue> fieldValue, @NotNull final Function1<? super Integer, Integer> transformTextOffset, @NotNull final Function1<? super Integer, Rect> getCursorRect, @NotNull final Function1<? super Function0<Offset>, ? extends Modifier> androidMagnifier, final boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(draggingHandle, "draggingHandle");
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        Intrinsics.checkNotNullParameter(transformTextOffset, "transformTextOffset");
        Intrinsics.checkNotNullParameter(getCursorRect, "getCursorRect");
        Intrinsics.checkNotNullParameter(androidMagnifier, "androidMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-0  reason: not valid java name */
            public static final long m1002invoke$lambda0(State<Offset> state) {
                return state.getValue().m2177unboximpl();
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                TwoWayConverter twoWayConverter;
                long j2;
                final State rememberAnimatedDerivedStateOf;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(728603669);
                twoWayConverter = TextFieldMagnifierKt.UnspecifiedSafeOffsetVectorConverter;
                j2 = TextFieldMagnifierKt.OffsetDisplacementThreshold;
                Offset m2156boximpl = Offset.m2156boximpl(j2);
                final Function0<Handle> function0 = draggingHandle;
                final Function0<TextFieldValue> function02 = fieldValue;
                final Function1<Integer, Integer> function1 = transformTextOffset;
                final Function1<Integer, Rect> function12 = getCursorRect;
                rememberAnimatedDerivedStateOf = TextFieldMagnifierKt.rememberAnimatedDerivedStateOf(twoWayConverter, m2156boximpl, null, new Function0<Offset>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$animatedMagnifierOffset$2

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$animatedMagnifierOffset$2$WhenMappings.class */
                    public final /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Handle.values().length];
                            iArr[Handle.Cursor.ordinal()] = 1;
                            iArr[Handle.SelectionStart.ordinal()] = 2;
                            iArr[Handle.SelectionEnd.ordinal()] = 3;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m2156boximpl(m1004invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                    public final long m1004invokeF1C5BW0() {
                        int m4475getStartimpl;
                        Handle invoke = function0.invoke();
                        int i3 = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1 || i3 == 2) {
                                m4475getStartimpl = TextRange.m4475getStartimpl(function02.invoke().m4616getSelectiond9O1mEE());
                            } else if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                m4475getStartimpl = TextRange.m4470getEndimpl(function02.invoke().m4616getSelectiond9O1mEE());
                            }
                            Rect invoke2 = function12.invoke(Integer.valueOf(function1.invoke(Integer.valueOf(m4475getStartimpl)).intValue()));
                            Offset m2156boximpl2 = invoke2 == null ? null : Offset.m2156boximpl(invoke2.m2198getCenterF1C5BW0());
                            return m2156boximpl2 == null ? Offset.Companion.m2182getUnspecifiedF1C5BW0() : m2156boximpl2.m2177unboximpl();
                        }
                        return Offset.Companion.m2182getUnspecifiedF1C5BW0();
                    }
                }, composer, 56, 4);
                Modifier then = composed.then(androidMagnifier.invoke(new Function0<Offset>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m2156boximpl(m1003invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                    public final long m1003invokeF1C5BW0() {
                        return TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5.m1002invoke$lambda0(rememberAnimatedDerivedStateOf);
                    }
                })).then(z ? SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        semantics.set(TextFieldMagnifierKt.getTextFieldMagnifierOffsetProperty(), Offset.m2156boximpl(TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5.m1002invoke$lambda0(rememberAnimatedDerivedStateOf)));
                    }
                }, 1, null) : Modifier.Companion);
                composer.endReplaceableGroup();
                return then;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier textFieldMagnifierAndroidImpl$default(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function1 function1, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return textFieldMagnifierAndroidImpl(modifier, textFieldSelectionManager, function1, z);
    }
}
