package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��<\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aO\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u000eø\u0001��¢\u0006\u0002\u0010\u000f\u001aE\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u000eø\u0001��¢\u0006\u0002\u0010\u0010\u001aS\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0012\"\u0004\u0018\u00010\u00072'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u000eø\u0001��¢\u0006\u0002\u0010\u0013\u001a=\u0010\u0004\u001a\u00020\u0005*\u00020\u00052'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u000eH\u0007ø\u0001��¢\u0006\u0002\u0010\u0014\"\u000e\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"EmptyPointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "PointerInputModifierNoParamError", "", "pointerInput", "Landroidx/compose/ui/Modifier;", "key1", "", "key2", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "keys", "", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt.class */
public final class SuspendingPointerInputFilterKt {
    @NotNull
    private static final PointerEvent EmptyPointerEvent;
    @NotNull
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    static {
        List emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        EmptyPointerEvent = new PointerEvent(emptyList);
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable final Object obj, @Nullable final Object obj2, @NotNull final Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2
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
                inspectorInfo.setName("pointerInput");
                inspectorInfo.getProperties().set("key1", obj);
                inspectorInfo.getProperties().set("key2", obj2);
                inspectorInfo.getProperties().set("block", block);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
             */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
                /*
                    r9 = this;
                    r0 = r10
                    java.lang.String r1 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0 = r11
                    r1 = 674422863(0x2832e04f, float:9.929624E-15)
                    r0.startReplaceableGroup(r1)
                    r0 = r11
                    androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
                    java.lang.Object r0 = r0.consume(r1)
                    androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
                    r13 = r0
                    r0 = r11
                    androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
                    java.lang.Object r0 = r0.consume(r1)
                    androidx.compose.ui.platform.ViewConfiguration r0 = (androidx.compose.ui.platform.ViewConfiguration) r0
                    r14 = r0
                    r0 = r11
                    r1 = -3686930(0xffffffffffc7bdee, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r11
                    r1 = r13
                    boolean r0 = r0.changed(r1)
                    r15 = r0
                    r0 = r11
                    java.lang.Object r0 = r0.rememberedValue()
                    r16 = r0
                    r0 = r15
                    if (r0 != 0) goto L58
                    r0 = r16
                    r17 = r0
                    r0 = r16
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L6d
                L58:
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter
                    r1 = r0
                    r2 = r14
                    r3 = r13
                    r1.<init>(r2, r3)
                    r17 = r0
                    r0 = r11
                    r1 = r17
                    r0.updateRememberedValue(r1)
                L6d:
                    r0 = r11
                    r0.endReplaceableGroup()
                    r0 = r9
                    java.lang.Object r0 = r4
                    r14 = r0
                    r0 = r9
                    java.lang.Object r0 = r5
                    r16 = r0
                    r0 = r9
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r6
                    r13 = r0
                    r0 = r17
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter) r0
                    r17 = r0
                    r0 = r10
                    r1 = r14
                    r2 = r16
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1 r3 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1
                    r4 = r3
                    r5 = r17
                    r6 = r13
                    r7 = 0
                    r4.<init>(r5, r6, r7)
                    r4 = r11
                    r5 = r12
                    r6 = 14
                    r5 = r5 & r6
                    r6 = 576(0x240, float:8.07E-43)
                    r5 = r5 | r6
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(r0, r1, r2, r3, r4, r5)
                    r0 = r11
                    r0.endReplaceableGroup()
                    r0 = r17
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable final Object obj, @NotNull final Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("pointerInput");
                inspectorInfo.getProperties().set("key1", obj);
                inspectorInfo.getProperties().set("block", block);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
             */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
                /*
                    r9 = this;
                    r0 = r10
                    java.lang.String r1 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0 = r11
                    r1 = 674421615(0x2832db6f, float:9.928567E-15)
                    r0.startReplaceableGroup(r1)
                    r0 = r11
                    androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
                    java.lang.Object r0 = r0.consume(r1)
                    androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
                    r13 = r0
                    r0 = r11
                    androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
                    java.lang.Object r0 = r0.consume(r1)
                    androidx.compose.ui.platform.ViewConfiguration r0 = (androidx.compose.ui.platform.ViewConfiguration) r0
                    r14 = r0
                    r0 = r11
                    r1 = -3686930(0xffffffffffc7bdee, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r11
                    r1 = r13
                    boolean r0 = r0.changed(r1)
                    r15 = r0
                    r0 = r11
                    java.lang.Object r0 = r0.rememberedValue()
                    r16 = r0
                    r0 = r15
                    if (r0 != 0) goto L57
                    r0 = r16
                    r10 = r0
                    r0 = r16
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L6a
                L57:
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter
                    r1 = r0
                    r2 = r14
                    r3 = r13
                    r1.<init>(r2, r3)
                    r10 = r0
                    r0 = r11
                    r1 = r10
                    r0.updateRememberedValue(r1)
                L6a:
                    r0 = r11
                    r0.endReplaceableGroup()
                    r0 = r9
                    java.lang.Object r0 = r4
                    r13 = r0
                    r0 = r9
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r5
                    r16 = r0
                    r0 = r10
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter) r0
                    r10 = r0
                    r0 = r10
                    r1 = r13
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1
                    r3 = r2
                    r4 = r10
                    r5 = r16
                    r6 = r10
                    r7 = 0
                    r3.<init>(r4, r5, r6, r7)
                    r3 = r11
                    r4 = 64
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(r0, r1, r2, r3, r4)
                    r0 = r11
                    r0.endReplaceableGroup()
                    r0 = r10
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = PointerInputModifierNoParamError)
    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull final Object[] keys, @NotNull final Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3
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
                inspectorInfo.setName("pointerInput");
                inspectorInfo.getProperties().set("keys", keys);
                inspectorInfo.getProperties().set("block", block);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
                if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
             */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11) {
                /*
                    r8 = this;
                    r0 = r9
                    java.lang.String r1 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0 = r10
                    r1 = 674424053(0x2832e4f5, float:9.930632E-15)
                    r0.startReplaceableGroup(r1)
                    r0 = r10
                    androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
                    java.lang.Object r0 = r0.consume(r1)
                    androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
                    r12 = r0
                    r0 = r10
                    androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
                    java.lang.Object r0 = r0.consume(r1)
                    androidx.compose.ui.platform.ViewConfiguration r0 = (androidx.compose.ui.platform.ViewConfiguration) r0
                    r13 = r0
                    r0 = r10
                    r1 = -3686930(0xffffffffffc7bdee, float:NaN)
                    r0.startReplaceableGroup(r1)
                    r0 = r10
                    r1 = r12
                    boolean r0 = r0.changed(r1)
                    r14 = r0
                    r0 = r10
                    java.lang.Object r0 = r0.rememberedValue()
                    r15 = r0
                    r0 = r14
                    if (r0 != 0) goto L57
                    r0 = r15
                    r9 = r0
                    r0 = r15
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L6a
                L57:
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter
                    r1 = r0
                    r2 = r13
                    r3 = r12
                    r1.<init>(r2, r3)
                    r9 = r0
                    r0 = r10
                    r1 = r9
                    r0.updateRememberedValue(r1)
                L6a:
                    r0 = r10
                    r0.endReplaceableGroup()
                    r0 = r8
                    java.lang.Object[] r0 = r4
                    r15 = r0
                    r0 = r8
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r5
                    r12 = r0
                    r0 = r9
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter) r0
                    r13 = r0
                    kotlin.jvm.internal.SpreadBuilder r0 = new kotlin.jvm.internal.SpreadBuilder
                    r1 = r0
                    r2 = 2
                    r1.<init>(r2)
                    r9 = r0
                    r0 = r9
                    r1 = r13
                    r0.add(r1)
                    r0 = r9
                    r1 = r15
                    r0.addSpread(r1)
                    r0 = r9
                    r1 = r9
                    int r1 = r1.size()
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    java.lang.Object[] r0 = r0.toArray(r1)
                    androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1 r1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1
                    r2 = r1
                    r3 = r13
                    r4 = r12
                    r5 = r13
                    r6 = 0
                    r2.<init>(r3, r4, r5, r6)
                    r2 = r10
                    r3 = 8
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(r0, r1, r2, r3)
                    r0 = r10
                    r0.endReplaceableGroup()
                    r0 = r13
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
