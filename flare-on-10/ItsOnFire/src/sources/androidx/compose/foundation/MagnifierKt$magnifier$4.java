package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l.m;
import o.d0;
import o.i;
import o.k;
import o.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010��\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/MagnifierKt$magnifier$4.class */
public final class MagnifierKt$magnifier$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
    public final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
    public final /* synthetic */ Function1<Density, Offset> $sourceCenter;
    public final /* synthetic */ MagnifierStyle $style;
    public final /* synthetic */ float $zoom;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {320}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/MagnifierKt$magnifier$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
        public final /* synthetic */ Density $density;
        public final /* synthetic */ d0<Unit> $onNeedsUpdate;
        public final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        public final /* synthetic */ MagnifierStyle $style;
        public final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
        public final /* synthetic */ State<Function1<Density, Offset>> $updatedSourceCenter$delegate;
        public final /* synthetic */ State<Float> $updatedZoom$delegate;
        public final /* synthetic */ View $view;
        public final /* synthetic */ float $zoom;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: ItsOnFire.jar:androidx/compose/foundation/MagnifierKt$magnifier$4$1$1.class */
        public static final class C00041 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PlatformMagnifier $magnifier;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(PlatformMagnifier platformMagnifier, Continuation<? super C00041> continuation) {
                super(2, continuation);
                this.$magnifier = platformMagnifier;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C00041(this.$magnifier, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((C00041) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$magnifier.updateContent();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f2, d0<Unit> d0Var, State<? extends Function1<? super Density, Offset>> state, MutableState<Offset> mutableState, State<? extends Function1<? super Density, Offset>> state2, State<Float> state3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
            this.$view = view;
            this.$density = density;
            this.$zoom = f2;
            this.$onNeedsUpdate = d0Var;
            this.$updatedSourceCenter$delegate = state;
            this.$anchorPositionInRoot$delegate = mutableState;
            this.$updatedMagnifierCenter$delegate = state2;
            this.$updatedZoom$delegate = state3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedSourceCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$updatedZoom$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            final PlatformMagnifier create;
            PlatformMagnifier platformMagnifier;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                u0 u0Var = (u0) this.L$0;
                create = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                k.U0(k.e1(this.$onNeedsUpdate, new C00041(create, null)), u0Var);
                try {
                    final Density density = this.$density;
                    final State<Function1<Density, Offset>> state = this.$updatedSourceCenter$delegate;
                    final MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    final State<Function1<Density, Offset>> state2 = this.$updatedMagnifierCenter$delegate;
                    final State<Float> state3 = this.$updatedZoom$delegate;
                    i snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            long m2177unboximpl = ((Offset) MagnifierKt$magnifier$4.m406invoke$lambda3(state).invoke(Density.this)).m2177unboximpl();
                            if (!OffsetKt.m2186isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.m404invoke$lambda1(mutableState)) || !OffsetKt.m2186isSpecifiedk4lQ0M(m2177unboximpl)) {
                                create.dismiss();
                                return;
                            }
                            PlatformMagnifier platformMagnifier2 = create;
                            long m2172plusMKHz9U = Offset.m2172plusMKHz9U(MagnifierKt$magnifier$4.m404invoke$lambda1(mutableState), m2177unboximpl);
                            Object invoke = MagnifierKt$magnifier$4.m407invoke$lambda4(state2).invoke(Density.this);
                            MutableState<Offset> mutableState2 = mutableState;
                            long m2177unboximpl2 = ((Offset) invoke).m2177unboximpl();
                            platformMagnifier2.mo416updateWko1d7g(m2172plusMKHz9U, OffsetKt.m2186isSpecifiedk4lQ0M(m2177unboximpl2) ? Offset.m2172plusMKHz9U(MagnifierKt$magnifier$4.m404invoke$lambda1(mutableState2), m2177unboximpl2) : Offset.Companion.m2182getUnspecifiedF1C5BW0(), MagnifierKt$magnifier$4.m408invoke$lambda5(state3));
                        }
                    });
                    this.L$0 = create;
                    this.label = 1;
                    if (k.x(snapshotFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    platformMagnifier = create;
                    platformMagnifier.dismiss();
                    throw th;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                PlatformMagnifier platformMagnifier2 = (PlatformMagnifier) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    create = platformMagnifier2;
                } catch (Throwable th2) {
                    platformMagnifier = platformMagnifier2;
                    th = th2;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }
            create.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierKt$magnifier$4(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f2, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
        super(3);
        this.$sourceCenter = function1;
        this.$magnifierCenter = function12;
        this.$zoom = f2;
        this.$platformMagnifierFactory = platformMagnifierFactory;
        this.$style = magnifierStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final long m404invoke$lambda1(MutableState<Offset> mutableState) {
        return mutableState.getValue().m2177unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m405invoke$lambda2(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(Offset.m2156boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3  reason: not valid java name */
    public static final Function1<Density, Offset> m406invoke$lambda3(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-4  reason: not valid java name */
    public static final Function1<Density, Offset> m407invoke$lambda4(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-5  reason: not valid java name */
    public static final float m408invoke$lambda5(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1676523321);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        MutableState mutableState = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2156boximpl(Offset.Companion.m2182getUnspecifiedF1C5BW0()), null, 2, null);
            mutableState = mutableStateOf$default;
            composer.updateRememberedValue(mutableState);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) mutableState;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
        State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        d0 d0Var = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            d0Var = k0.b(1, 0, m.DROP_OLDEST, 2, null);
            composer.updateRememberedValue(d0Var);
        }
        composer.endReplaceableGroup();
        final d0 d0Var2 = (d0) d0Var;
        float f2 = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
        MagnifierStyle magnifierStyle = this.$style;
        EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f2), magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.Companion.getTextDefault()))}, (Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, d0Var2, rememberUpdatedState, mutableState2, rememberUpdatedState2, rememberUpdatedState3, null), composer, 8);
        Modifier drawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MagnifierKt$magnifier$4.m405invoke$lambda2(mutableState2, LayoutCoordinatesKt.positionInRoot(it));
            }
        }), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawBehind2) {
                Intrinsics.checkNotNullParameter(drawBehind2, "$this$drawBehind");
                d0Var2.g(Unit.INSTANCE);
            }
        });
        composer.endReplaceableGroup();
        return drawBehind;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
