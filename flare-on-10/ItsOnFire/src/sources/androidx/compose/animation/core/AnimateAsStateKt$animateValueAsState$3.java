package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {368}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3.class */
public final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    public final /* synthetic */ Animatable<T, V> $animatable;
    public final /* synthetic */ n<T> $channel;
    public final /* synthetic */ State<Function1<T, Unit>> $listener$delegate;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        public final /* synthetic */ Animatable<T, V> $animatable;
        public final /* synthetic */ State<Function1<T, Unit>> $listener$delegate;
        public final /* synthetic */ T $newTarget;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(T t2, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1<? super T, Unit>> state2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newTarget = t2;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, continuation);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            AnimationSpec m228animateValueAsState$lambda4;
            Function1 m227animateValueAsState$lambda3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(this.$newTarget, this.$animatable.getTargetValue())) {
                    Animatable<T, V> animatable = this.$animatable;
                    T t2 = this.$newTarget;
                    m228animateValueAsState$lambda4 = AnimateAsStateKt.m228animateValueAsState$lambda4(this.$animSpec$delegate);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t2, m228animateValueAsState$lambda4, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            m227animateValueAsState$lambda3 = AnimateAsStateKt.m227animateValueAsState$lambda3(this.$listener$delegate);
            if (m227animateValueAsState$lambda3 != null) {
                m227animateValueAsState$lambda3.invoke(this.$animatable.getValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3(n<T> nVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1<? super T, Unit>> state2, Continuation<? super AnimateAsStateKt$animateValueAsState$3> continuation) {
        super(2, continuation);
        this.$channel = nVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, continuation);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
        return invoke2(u0Var, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0072 -> B:14:0x0077). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r11
            int r0 = r0.label
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L3b
            r0 = r14
            r1 = 1
            if (r0 != r1) goto L31
            r0 = r11
            java.lang.Object r0 = r0.L$1
            l.p r0 = (l.p) r0
            r15 = r0
            r0 = r11
            java.lang.Object r0 = r0.L$0
            j.u0 r0 = (j.u0) r0
            r16 = r0
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r12
            r17 = r0
            r0 = r15
            r12 = r0
            goto L77
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L3b:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r11
            java.lang.Object r0 = r0.L$0
            j.u0 r0 = (j.u0) r0
            r16 = r0
            r0 = r11
            l.n<T> r0 = r0.$channel
            l.p r0 = r0.iterator()
            r12 = r0
        L52:
            r0 = r11
            r1 = r16
            r0.L$0 = r1
            r0 = r11
            r1 = r12
            r0.L$1 = r1
            r0 = r11
            r1 = 1
            r0.label = r1
            r0 = r12
            r1 = r11
            java.lang.Object r0 = r0.a(r1)
            r15 = r0
            r0 = r15
            r17 = r0
            r0 = r15
            r1 = r13
            if (r0 != r1) goto L77
            r0 = r13
            return r0
        L77:
            r0 = r17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc7
            r0 = r12
            java.lang.Object r0 = r0.next()
            r17 = r0
            r0 = r11
            l.n<T> r0 = r0.$channel
            java.lang.Object r0 = r0.v()
            java.lang.Object r0 = l.r.h(r0)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto La0
            goto La4
        La0:
            r0 = r15
            r17 = r0
        La4:
            r0 = r16
            r1 = 0
            r2 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r3 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            r4 = r3
            r5 = r17
            r6 = r11
            androidx.compose.animation.core.Animatable<T, V> r6 = r6.$animatable
            r7 = r11
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r7 = r7.$animSpec$delegate
            r8 = r11
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<T, kotlin.Unit>> r8 = r8.$listener$delegate
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = 3
            r5 = 0
            j.n2 r0 = j.j.e(r0, r1, r2, r3, r4, r5)
            goto L52
        Lc7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
