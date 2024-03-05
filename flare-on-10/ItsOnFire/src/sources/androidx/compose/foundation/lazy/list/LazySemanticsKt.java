package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import j.l;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a:\u0010\u000b\u001a\u00020��*\u00020��2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH��¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "stateOfItemsProvider", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lj/u0;", "coroutineScope", "", "isVertical", "reverseScrolling", "lazyListSemantics", "foundation_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazySemanticsKt.class */
public final class LazySemanticsKt {
    @NotNull
    public static final Modifier lazyListSemantics(@NotNull Modifier modifier, @NotNull final State<? extends LazyListItemsProvider> stateOfItemsProvider, @NotNull final LazyListState state, @NotNull final u0 coroutineScope, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(stateOfItemsProvider, "stateOfItemsProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                final State<LazyListItemsProvider> state2 = stateOfItemsProvider;
                SemanticsPropertiesKt.indexForKey(semantics, new Function1<Object, Integer>() { // from class: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Integer invoke(@NotNull Object needle) {
                        Intrinsics.checkNotNullParameter(needle, "needle");
                        LazySemanticsKt$lazyListSemantics$1$1$key$1 lazySemanticsKt$lazyListSemantics$1$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$1$key$1(state2.getValue());
                        int itemsCount = state2.getValue().getItemsCount();
                        for (int i2 = 0; i2 < itemsCount; i2++) {
                            if (Intrinsics.areEqual(lazySemanticsKt$lazyListSemantics$1$1$key$1.invoke((LazySemanticsKt$lazyListSemantics$1$1$key$1) Integer.valueOf(i2)), needle)) {
                                return Integer.valueOf(i2);
                            }
                        }
                        return -1;
                    }
                });
                final LazyListState lazyListState = state;
                Function0<Float> function0 = new Function0<Float>() { // from class: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(LazyListState.this.getFirstVisibleItemIndex() + (LazyListState.this.getFirstVisibleItemScrollOffset() / 100000.0f));
                    }
                };
                final LazyListState lazyListState2 = state;
                final State<LazyListItemsProvider> state3 = stateOfItemsProvider;
                ScrollAxisRange scrollAxisRange = new ScrollAxisRange(function0, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        float firstVisibleItemScrollOffset;
                        if (LazyListState.this.getCanScrollForward$foundation_release()) {
                            firstVisibleItemScrollOffset = state3.getValue().getItemsCount() + 1.0f;
                        } else {
                            firstVisibleItemScrollOffset = (LazyListState.this.getFirstVisibleItemScrollOffset() / 100000.0f) + LazyListState.this.getFirstVisibleItemIndex();
                        }
                        return Float.valueOf(firstVisibleItemScrollOffset);
                    }
                }, z2);
                if (z) {
                    SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                } else {
                    SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                }
                final boolean z3 = z;
                final u0 u0Var = coroutineScope;
                final LazyListState lazyListState3 = state;
                int i2 = 1;
                SemanticsPropertiesKt.scrollBy$default(semantics, null, new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1.2

                    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2$1", f = "LazySemantics.kt", i = {}, l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2$1  reason: invalid class name */
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$2$1.class */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ float $delta;
                        public final /* synthetic */ LazyListState $state;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(LazyListState lazyListState, float f2, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$state = lazyListState;
                            this.$delta = f2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$state, this.$delta, continuation);
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
                                LazyListState lazyListState = this.$state;
                                float f2 = this.$delta;
                                this.label = 1;
                                if (ScrollExtensionsKt.animateScrollBy$default(lazyListState, f2, null, this, 2, null) == coroutine_suspended) {
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
                        super(2);
                    }

                    @NotNull
                    public final Boolean invoke(float f2, float f3) {
                        if (z3) {
                            f2 = f3;
                        }
                        l.f(u0Var, null, null, new AnonymousClass1(lazyListState3, f2, null), 3, null);
                        return Boolean.TRUE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f2, Float f3) {
                        return invoke(f2.floatValue(), f3.floatValue());
                    }
                }, 1, null);
                final LazyListState lazyListState4 = state;
                final u0 u0Var2 = coroutineScope;
                SemanticsPropertiesKt.scrollToIndex$default(semantics, null, new Function1<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1.3

                    @Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3$2", f = "LazySemantics.kt", i = {}, l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3$2  reason: invalid class name */
                    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/list/LazySemanticsKt$lazyListSemantics$1$3$2.class */
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ int $index;
                        public final /* synthetic */ LazyListState $state;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(LazyListState lazyListState, int i2, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$state = lazyListState;
                            this.$index = i2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass2(this.$state, this.$index, continuation);
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
                                LazyListState lazyListState = this.$state;
                                int i3 = this.$index;
                                this.label = 1;
                                if (LazyListState.scrollToItem$default(lazyListState, i3, 0, this, 2, null) == coroutine_suspended) {
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
                        super(1);
                    }

                    @NotNull
                    public final Boolean invoke(int i3) {
                        boolean z4 = i3 >= 0 && i3 < LazyListState.this.getLayoutInfo().getTotalItemsCount();
                        LazyListState lazyListState5 = LazyListState.this;
                        if (z4) {
                            l.f(u0Var2, null, null, new AnonymousClass2(lazyListState5, i3, null), 3, null);
                            return Boolean.TRUE;
                        }
                        throw new IllegalArgumentException(("Can't scroll to index " + i3 + ", it is out of bounds [0, " + lazyListState5.getLayoutInfo().getTotalItemsCount() + ')').toString());
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null);
                boolean z4 = z;
                int i3 = z4 ? -1 : 1;
                if (!z4) {
                    i2 = -1;
                }
                SemanticsPropertiesKt.setCollectionInfo(semantics, new CollectionInfo(i3, i2));
            }
        }, 1, null);
    }
}
