package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\u001a\f\u0010\t\u001a\u00020\u0006*\u00020\u0006H\u0007\u001a\n\u0010\n\u001a\u00020\u0006*\u00020\u0006\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u000bH��\"\u001a\u0010��\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"ModifierLocalHasFocusEventListener", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "getModifierLocalHasFocusEventListener", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ResetFocusModifierLocals", "Landroidx/compose/ui/Modifier;", "getResetFocusModifierLocals", "()Landroidx/compose/ui/Modifier;", "focusModifier", "focusTarget", "Landroidx/compose/ui/focus/FocusModifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/FocusModifierKt.class */
public final class FocusModifierKt {
    @NotNull
    private static final ProvidableModifierLocal<Boolean> ModifierLocalHasFocusEventListener = ModifierLocalKt.modifierLocalOf(new Function0<Boolean>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ModifierLocalHasFocusEventListener$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });
    @NotNull
    private static final Modifier ResetFocusModifierLocals = Modifier.Companion.then(new ModifierLocalProvider<FocusProperties>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ResetFocusModifierLocals$1
        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ModifierLocalProvider.DefaultImpls.all(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ModifierLocalProvider.DefaultImpls.any(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) ModifierLocalProvider.DefaultImpls.foldIn(this, r2, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) ModifierLocalProvider.DefaultImpls.foldOut(this, r2, function2);
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public ProvidableModifierLocal<FocusProperties> getKey() {
            return FocusPropertiesKt.getModifierLocalFocusProperties();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public FocusProperties getValue() {
            return DefaultFocusProperties.INSTANCE;
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier modifier) {
            return ModifierLocalProvider.DefaultImpls.then(this, modifier);
        }
    }).then(new ModifierLocalProvider<Boolean>() { // from class: androidx.compose.ui.focus.FocusModifierKt$ResetFocusModifierLocals$2
        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ModifierLocalProvider.DefaultImpls.all(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ModifierLocalProvider.DefaultImpls.any(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) ModifierLocalProvider.DefaultImpls.foldIn(this, r2, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) ModifierLocalProvider.DefaultImpls.foldOut(this, r2, function2);
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public ProvidableModifierLocal<Boolean> getKey() {
            return FocusModifierKt.getModifierLocalHasFocusEventListener();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public Boolean getValue() {
            return Boolean.FALSE;
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier modifier) {
            return ModifierLocalProvider.DefaultImpls.then(this, modifier);
        }
    });

    @Deprecated(message = "Replaced by focusTarget", replaceWith = @ReplaceWith(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    @NotNull
    public static final Modifier focusModifier(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusModifier$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusModifier");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusModifier$2
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1014929315);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                FocusModifier focusModifier = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    focusModifier = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    composer.updateRememberedValue(focusModifier);
                }
                composer.endReplaceableGroup();
                Modifier focusTarget = FocusModifierKt.focusTarget(composed, (FocusModifier) focusModifier);
                composer.endReplaceableGroup();
                return focusTarget;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier focusTarget(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusTarget");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1906540397);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                FocusModifier focusModifier = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    focusModifier = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
                    composer.updateRememberedValue(focusModifier);
                }
                composer.endReplaceableGroup();
                Modifier focusTarget = FocusModifierKt.focusTarget(composed, (FocusModifier) focusModifier);
                composer.endReplaceableGroup();
                return focusTarget;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @NotNull
    public static final Modifier focusTarget(@NotNull Modifier modifier, @NotNull FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        return modifier.then(focusModifier).then(ResetFocusModifierLocals);
    }

    @NotNull
    public static final ProvidableModifierLocal<Boolean> getModifierLocalHasFocusEventListener() {
        return ModifierLocalHasFocusEventListener;
    }

    @NotNull
    public static final Modifier getResetFocusModifierLocals() {
        return ResetFocusModifierLocals;
    }
}
