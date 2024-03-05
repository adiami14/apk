package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import j.l;
import j.u0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1.class */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ boolean $drawerGesturesEnabled;
    public final /* synthetic */ long $drawerScrimColor;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ boolean $sheetGesturesEnabled;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ Shape $sheetShape;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, boolean z2, Shape shape, float f2, long j2, long j3, long j4, int i2, float f3, u0 u0Var, int i3, int i4, long j5, long j6, int i5, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32, Shape shape2, long j7, long j8, float f4, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34) {
        super(3);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$sheetGesturesEnabled = z;
        this.$drawerContent = function3;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = shape;
        this.$drawerElevation = f2;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerScrimColor = j4;
        this.$$dirty1 = i2;
        this.$sheetPeekHeight = f3;
        this.$scope = u0Var;
        this.$floatingActionButtonPosition = i3;
        this.$$dirty = i4;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$$dirty2 = i5;
        this.$topBar = function2;
        this.$content = function32;
        this.$sheetShape = shape2;
        this.$sheetBackgroundColor = j7;
        this.$sheetContentColor = j8;
        this.$sheetElevation = f4;
        this.$sheetContent = function33;
        this.$floatingActionButton = function22;
        this.$snackbarHost = function34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final float m1177invoke$lambda2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3  reason: not valid java name */
    public static final void m1178invoke$lambda3(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        Map mapOf;
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float m4751getMaxHeightimpl = Constraints.m4751getMaxHeightimpl(BoxWithConstraints.mo612getConstraintsmsEJaDk());
        final float mo524toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo524toPx0680j_4(this.$sheetPeekHeight);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        MutableState mutableState = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(m4751getMaxHeightimpl), null, 2, null);
            mutableState = mutableStateOf$default;
            composer.updateRememberedValue(mutableState);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) mutableState;
        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$scaffoldState.getBottomSheetState().getNestedScrollConnection$material_release(), null, 2, null);
        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(m4751getMaxHeightimpl - mo524toPx0680j_4), BottomSheetValue.Collapsed), TuplesKt.to(Float.valueOf(m4751getMaxHeightimpl - m1177invoke$lambda2(mutableState2)), BottomSheetValue.Expanded));
        Modifier m1543swipeablepPrIpRY$default = SwipeableKt.m1543swipeablepPrIpRY$default(nestedScroll$default, bottomSheetState, mapOf, Orientation.Vertical, this.$sheetGesturesEnabled, false, null, null, null, 0.0f, 368, null);
        final BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        final u0 u0Var = this.$scope;
        final Modifier semantics$default = SemanticsModifierKt.semantics$default(m1543swipeablepPrIpRY$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1
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
                float m1177invoke$lambda2;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                float f2 = mo524toPx0680j_4;
                m1177invoke$lambda2 = BottomSheetScaffoldKt$BottomSheetScaffold$1.m1177invoke$lambda2(mutableState2);
                if (f2 == m1177invoke$lambda2) {
                    return;
                }
                if (bottomSheetScaffoldState.getBottomSheetState().isCollapsed()) {
                    final BottomSheetScaffoldState bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    final u0 u0Var2 = u0Var;
                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1.1

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$1$1.class */
                        public static final class C00281 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00281(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super C00281> continuation) {
                                super(2, continuation);
                                this.$scaffoldState = bottomSheetScaffoldState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C00281(this.$scaffoldState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00281) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                                    this.label = 1;
                                    if (bottomSheetState.expand(this) == coroutine_suspended) {
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
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            if (BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                l.f(u0Var2, null, null, new C00281(BottomSheetScaffoldState.this, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                    return;
                }
                final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                final u0 u0Var3 = u0Var;
                SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1.2

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$2$1  reason: invalid class name */
                    /* loaded from: ItsOnFire.jar:androidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1$2$1.class */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$scaffoldState = bottomSheetScaffoldState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$scaffoldState, continuation);
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
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                                this.label = 1;
                                if (bottomSheetState.collapse(this) == coroutine_suspended) {
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
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        if (BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                            l.f(u0Var3, null, null, new AnonymousClass1(BottomSheetScaffoldState.this, null), 3, null);
                        }
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
        final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.$scaffoldState;
        final int i3 = this.$floatingActionButtonPosition;
        final int i4 = this.$$dirty;
        final long j2 = this.$backgroundColor;
        final long j3 = this.$contentColor;
        final int i5 = this.$$dirty2;
        final Function2<Composer, Integer, Unit> function2 = this.$topBar;
        final Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
        final float f2 = this.$sheetPeekHeight;
        final Shape shape = this.$sheetShape;
        final long j4 = this.$sheetBackgroundColor;
        final long j5 = this.$sheetContentColor;
        final float f3 = this.$sheetElevation;
        final int i6 = this.$$dirty1;
        final Function3<ColumnScope, Composer, Integer, Unit> function32 = this.$sheetContent;
        final Function2<Composer, Integer, Unit> function22 = this.$floatingActionButton;
        final Function3<SnackbarHostState, Composer, Integer, Unit> function33 = this.$snackbarHost;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819899396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i7) {
                if (((i7 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                final long j6 = j2;
                final long j7 = j3;
                final int i8 = i5;
                final Function2<Composer, Integer, Unit> function23 = function2;
                final int i9 = i4;
                final Function3<PaddingValues, Composer, Integer, Unit> function34 = function3;
                final float f4 = f2;
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -819899585, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i10) {
                        if (((i10 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        long j8 = j6;
                        long j9 = j7;
                        final Function2<Composer, Integer, Unit> function24 = function23;
                        final int i11 = i9;
                        final Function3<PaddingValues, Composer, Integer, Unit> function35 = function34;
                        final float f5 = f4;
                        final int i12 = i8;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -819900219, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.1.child.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i13) {
                                if (((i13 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function25 = function24;
                                int i14 = i11;
                                Function3<PaddingValues, Composer, Integer, Unit> function36 = function35;
                                float f6 = f5;
                                int i15 = i12;
                                composer4.startReplaceableGroup(-1113030915);
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(1376089394);
                                Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer m1989constructorimpl = Updater.m1989constructorimpl(composer4);
                                Updater.m1996setimpl(m1989constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
                                Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(276693625);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(-1579943837);
                                composer4.startReplaceableGroup(-1579943829);
                                if (function25 != null) {
                                    function25.invoke(composer4, Integer.valueOf((i14 >> 9) & 14));
                                }
                                composer4.endReplaceableGroup();
                                function36.invoke(PaddingKt.m673PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f6, 7, null), composer4, Integer.valueOf((i15 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                            }
                        });
                        int i13 = i8;
                        SurfaceKt.m1534SurfaceFjzlyU((Modifier) null, (Shape) null, j8, j9, (BorderStroke) null, 0.0f, composableLambda3, composer3, 1572864 | ((i13 << 6) & 896) | ((i13 << 6) & 7168), 51);
                    }
                });
                final Modifier modifier = semantics$default;
                final float f5 = f2;
                final MutableState<Float> mutableState3 = mutableState2;
                final Shape shape2 = shape;
                final long j8 = j4;
                final long j9 = j5;
                final float f6 = f3;
                final int i10 = i4;
                final int i11 = i6;
                final Function3<ColumnScope, Composer, Integer, Unit> function35 = function32;
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -819899921, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
                        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
                     */
                    @androidx.compose.runtime.Composable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, int r17) {
                        /*
                            Method dump skipped, instructions count: 254
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.AnonymousClass2.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                });
                final Function2<Composer, Integer, Unit> function24 = function22;
                final int i12 = i4;
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, -819897194, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i13) {
                        if (((i13 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        Function2<Composer, Integer, Unit> function25 = function24;
                        int i14 = i12;
                        composer3.startReplaceableGroup(-1990474327);
                        Modifier.Companion companion = Modifier.Companion;
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(1376089394);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1989constructorimpl = Updater.m1989constructorimpl(composer3);
                        Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1996setimpl(m1989constructorimpl, density, companion2.getSetDensity());
                        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(2068277740);
                        if (function25 != null) {
                            function25.invoke(composer3, Integer.valueOf((i14 >> 15) & 14));
                        }
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                });
                final Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function33;
                final BottomSheetScaffoldState bottomSheetScaffoldState3 = BottomSheetScaffoldState.this;
                final int i13 = i4;
                BottomSheetScaffoldKt.m1174access$BottomSheetScaffoldStackSlNgfk0(composableLambda2, composableLambda3, composableLambda4, ComposableLambdaKt.composableLambda(composer2, -819897283, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if (((i14 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                        BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                        int i15 = i13;
                        composer3.startReplaceableGroup(-1990474327);
                        Modifier.Companion companion = Modifier.Companion;
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(1376089394);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1989constructorimpl = Updater.m1989constructorimpl(composer3);
                        Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1996setimpl(m1989constructorimpl, density, companion2.getSetDensity());
                        Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(2068277895);
                        function37.invoke(bottomSheetScaffoldState4.getSnackbarHostState(), composer3, Integer.valueOf((i15 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                }), BottomSheetScaffoldState.this.getBottomSheetState().getOffset(), i3, composer2, ((i4 >> 3) & 458752) | 3510);
            }
        });
        if (this.$drawerContent == null) {
            composer.startReplaceableGroup(-249545651);
            composableLambda.invoke(composer, 6);
            composer.endReplaceableGroup();
            return;
        }
        composer.startReplaceableGroup(-249545614);
        Function3<ColumnScope, Composer, Integer, Unit> function34 = this.$drawerContent;
        DrawerState drawerState = this.$scaffoldState.getDrawerState();
        boolean z = this.$drawerGesturesEnabled;
        Shape shape2 = this.$drawerShape;
        float f4 = this.$drawerElevation;
        long j6 = this.$drawerBackgroundColor;
        long j7 = this.$drawerContentColor;
        long j8 = this.$drawerScrimColor;
        int i7 = this.$$dirty1;
        DrawerKt.m1310ModalDrawerGs3lGvM(function34, null, drawerState, z, shape2, f4, j6, j7, j8, composableLambda, composer, ((i7 >> 3) & 7168) | ((i7 >> 9) & 14) | 805306368 | ((i7 >> 3) & 57344) | ((i7 >> 3) & 458752) | ((i7 >> 3) & 3670016) | ((i7 >> 3) & 29360128) | ((i7 >> 3) & 234881024), 2);
        composer.endReplaceableGroup();
    }
}
