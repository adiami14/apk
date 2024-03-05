package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;
import o.i;
import o.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1", f = "TextFieldMagnifier.kt", i = {}, l = {Typography.plusMinus}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1.class */
public final class TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Animatable<T, V> $animatable;
    public final /* synthetic */ AnimationSpec<T> $animationSpec;
    public final /* synthetic */ State<T> $targetValue$delegate;
    public int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1$2", f = "TextFieldMagnifier.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1$2  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1$2.class */
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<T, V> $animatable;
        public final /* synthetic */ AnimationSpec<T> $animationSpec;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Animatable<T, V> animatable, AnimationSpec<T> animationSpec, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$animatable = animatable;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$animatable, this.$animationSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke2((AnonymousClass2<T>) obj, continuation);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(T t2, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(t2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.L$0;
                Animatable<T, V> animatable = this.$animatable;
                AnimationSpec<T> animationSpec = this.$animationSpec;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, obj2, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1(State<? extends T> state, Animatable<T, V> animatable, AnimationSpec<T> animationSpec, Continuation<? super TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1> continuation) {
        super(2, continuation);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1(this.$targetValue$delegate, this.$animatable, this.$animationSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final State<T> state = this.$targetValue$delegate;
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<T>() { // from class: androidx.compose.foundation.text.TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    Object value;
                    value = state.getValue();
                    return (T) value;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$animatable, this.$animationSpec, null);
            this.label = 1;
            if (k.A(snapshotFlow, anonymousClass2, this) == coroutine_suspended) {
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
