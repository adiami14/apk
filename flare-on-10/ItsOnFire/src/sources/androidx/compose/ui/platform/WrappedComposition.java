package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.u0;
import java.util.Set;
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
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018��2\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00112\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0016¢\u0006\u0002\u0010 R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "original", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "addedToLifecycle", "Landroidx/lifecycle/Lifecycle;", "disposed", "", "hasInvalidations", "getHasInvalidations", "()Z", "isDisposed", "lastContent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "getOriginal", "()Landroidx/compose/runtime/Composition;", "getOwner", "()Landroidx/compose/ui/platform/AndroidComposeView;", "dispose", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "setContent", FirebaseAnalytics.Param.CONTENT, "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/WrappedComposition.class */
public final class WrappedComposition implements Composition, LifecycleEventObserver {
    @Nullable
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> lastContent;
    @NotNull
    private final Composition original;
    @NotNull
    private final AndroidComposeView owner;

    public WrappedComposition(@NotNull AndroidComposeView owner, @NotNull Composition original) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(original, "original");
        this.owner = owner;
        this.original = original;
        this.lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m4183getLambda1$ui_release();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(androidx.compose.ui.R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @NotNull
    public final Composition getOriginal() {
        return this.original;
    }

    @NotNull
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
        } else {
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull final Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.owner.setOnViewTreeOwnersAvailable(new Function1<AndroidComposeView.ViewTreeOwners, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                invoke2(viewTreeOwners);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AndroidComposeView.ViewTreeOwners it) {
                boolean z;
                Lifecycle lifecycle;
                Intrinsics.checkNotNullParameter(it, "it");
                z = WrappedComposition.this.disposed;
                if (z) {
                    return;
                }
                Lifecycle lifecycle2 = it.getLifecycleOwner().getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle2, "it.lifecycleOwner.lifecycle");
                WrappedComposition.this.lastContent = content;
                lifecycle = WrappedComposition.this.addedToLifecycle;
                if (lifecycle == null) {
                    WrappedComposition.this.addedToLifecycle = lifecycle2;
                    lifecycle2.addObserver(WrappedComposition.this);
                } else if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    Composition original = WrappedComposition.this.getOriginal();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final Function2<Composer, Integer, Unit> function2 = content;
                    original.setContent(ComposableLambdaKt.composableLambdaInstance(-985537467, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/WrappedComposition$setContent$1$1$1.class */
                        public static final class C00441 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public int label;
                            public final /* synthetic */ WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00441(WrappedComposition wrappedComposition, Continuation<? super C00441> continuation) {
                                super(2, continuation);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C00441(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((C00441) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    AndroidComposeView owner = this.this$0.getOwner();
                                    this.label = 1;
                                    if (owner.keyboardVisibilityEventLoop(this) == coroutine_suspended) {
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

                        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                        @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2  reason: invalid class name */
                        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/WrappedComposition$setContent$1$1$2.class */
                        public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                            public int label;
                            public final /* synthetic */ WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(WrappedComposition wrappedComposition, Continuation<? super AnonymousClass2> continuation) {
                                super(2, continuation);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass2(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    AndroidComposeView owner = this.this$0.getOwner();
                                    this.label = 1;
                                    if (owner.boundsUpdatesEventLoop(this) == coroutine_suspended) {
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
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer, int i2) {
                            if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            AndroidComposeView owner = WrappedComposition.this.getOwner();
                            int i3 = androidx.compose.ui.R.id.inspection_slot_table_set;
                            Object tag = owner.getTag(i3);
                            Set<CompositionData> set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                            Set<CompositionData> set2 = set;
                            if (set == null) {
                                ViewParent parent = WrappedComposition.this.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Set<CompositionData> tag2 = view == null ? null : view.getTag(i3);
                                set2 = TypeIntrinsics.isMutableSet(tag2) ? tag2 : null;
                            }
                            if (set2 != null) {
                                set2.add(composer.getCompositionData());
                                composer.collectParameterInformation();
                            }
                            EffectsKt.LaunchedEffect(WrappedComposition.this.getOwner(), new C00441(WrappedComposition.this, null), composer, 8);
                            EffectsKt.LaunchedEffect(WrappedComposition.this.getOwner(), new AnonymousClass2(WrappedComposition.this, null), composer, 8);
                            ProvidedValue<Set<CompositionData>> provides = InspectionTablesKt.getLocalInspectionTables().provides(set2);
                            final WrappedComposition wrappedComposition2 = WrappedComposition.this;
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{provides}, ComposableLambdaKt.composableLambda(composer, -819888609, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
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
                                public final void invoke(@Nullable Composer composer2, int i4) {
                                    if (((i4 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(WrappedComposition.this.getOwner(), function22, composer2, 8);
                                    }
                                }
                            }), composer, 56);
                        }
                    }));
                }
            }
        });
    }
}
