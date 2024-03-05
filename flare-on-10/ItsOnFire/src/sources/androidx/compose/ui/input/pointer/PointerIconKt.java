package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0014\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\u001a\u001c\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerIconKt.class */
public final class PointerIconKt {
    @NotNull
    public static final Modifier pointerHoverIcon(@NotNull Modifier modifier, @NotNull final PointerIcon icon, final boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("pointerHoverIcon");
                inspectorInfo.getProperties().set("icon", PointerIcon.this);
                inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", i = {}, l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1  reason: invalid class name */
            /* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ PointerIcon $icon;
                public final /* synthetic */ boolean $overrideDescendants;
                public final /* synthetic */ PointerIconService $pointerIconService;
                private /* synthetic */ Object L$0;
                public int label;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", i = {0}, l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
                /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2$1$1.class */
                public static final class C00431 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ PointerIcon $icon;
                    public final /* synthetic */ boolean $overrideDescendants;
                    public final /* synthetic */ PointerIconService $pointerIconService;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00431(boolean z, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation<? super C00431> continuation) {
                        super(2, continuation);
                        this.$overrideDescendants = z;
                        this.$pointerIconService = pointerIconService;
                        this.$icon = pointerIcon;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C00431 c00431 = new C00431(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                        c00431.L$0 = obj;
                        return c00431;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C00431) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006a -> B:18:0x006f). Please submit an issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                        /*
                            r4 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r6 = r0
                            r0 = r4
                            int r0 = r0.label
                            r7 = r0
                            r0 = r7
                            if (r0 == 0) goto L2c
                            r0 = r7
                            r1 = 1
                            if (r0 != r1) goto L22
                            r0 = r4
                            java.lang.Object r0 = r0.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                            r8 = r0
                            r0 = r5
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L6f
                        L22:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L2c:
                            r0 = r5
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r4
                            java.lang.Object r0 = r0.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                            r5 = r0
                        L38:
                            r0 = r4
                            boolean r0 = r0.$overrideDescendants
                            if (r0 == 0) goto L47
                            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r8 = r0
                            goto L4c
                        L47:
                            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r8 = r0
                        L4c:
                            r0 = r4
                            r1 = r5
                            r0.L$0 = r1
                            r0 = r4
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            r1 = r8
                            r2 = r4
                            java.lang.Object r0 = r0.awaitPointerEvent(r1, r2)
                            r9 = r0
                            r0 = r5
                            r8 = r0
                            r0 = r9
                            r5 = r0
                            r0 = r9
                            r1 = r6
                            if (r0 != r1) goto L6f
                            r0 = r6
                            return r0
                        L6f:
                            r0 = r5
                            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
                            int r0 = r0.m3736getType7fucELk()
                            r7 = r0
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r0 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                            r5 = r0
                            r0 = r7
                            r1 = r5
                            int r1 = r1.m3751getEnter7fucELk()
                            boolean r0 = androidx.compose.ui.input.pointer.PointerEventType.m3746equalsimpl0(r0, r1)
                            if (r0 == 0) goto L8c
                            r0 = 1
                            r10 = r0
                            goto L96
                        L8c:
                            r0 = r7
                            r1 = r5
                            int r1 = r1.m3753getMove7fucELk()
                            boolean r0 = androidx.compose.ui.input.pointer.PointerEventType.m3746equalsimpl0(r0, r1)
                            r10 = r0
                        L96:
                            r0 = r8
                            r5 = r0
                            r0 = r10
                            if (r0 == 0) goto L38
                            r0 = r4
                            androidx.compose.ui.input.pointer.PointerIconService r0 = r0.$pointerIconService
                            r1 = r4
                            androidx.compose.ui.input.pointer.PointerIcon r1 = r1.$icon
                            r0.setCurrent(r1)
                            r0 = r8
                            r5 = r0
                            goto L38
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2.AnonymousClass1.C00431.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$overrideDescendants = z;
                    this.$pointerIconService = pointerIconService;
                    this.$icon = pointerIcon;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00431 c00431 = new C00431(this.$overrideDescendants, this.$pointerIconService, this.$icon, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c00431, this) == coroutine_suspended) {
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

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-270919819);
                PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
                Modifier.Companion pointerInput = pointerIconService == null ? Modifier.Companion : SuspendingPointerInputFilterKt.pointerInput(composed, PointerIcon.this, Boolean.valueOf(z), new AnonymousClass1(z, pointerIconService, PointerIcon.this, null));
                composer.endReplaceableGroup();
                return pointerInput;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z);
    }
}
