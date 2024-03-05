package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\b\u0010��\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"BringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/relocation/BringIntoViewRequesterKt.class */
public final class BringIntoViewRequesterKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequesterImpl();
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier bringIntoViewRequester(@NotNull Modifier modifier, @NotNull final BringIntoViewRequester bringIntoViewRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(bringIntoViewRequester, "bringIntoViewRequester");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("bringIntoViewRequester");
                inspectorInfo.getProperties().set("bringIntoViewRequester", BringIntoViewRequester.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1614341944);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                BringIntoViewData bringIntoViewData = rememberedValue;
                if (rememberedValue == companion.getEmpty()) {
                    bringIntoViewData = new BringIntoViewData(new BringRectangleOnScreenRequester(), null, null, 6, null);
                    composer.updateRememberedValue(bringIntoViewData);
                }
                composer.endReplaceableGroup();
                final BringIntoViewData bringIntoViewData2 = (BringIntoViewData) bringIntoViewData;
                composer.startReplaceableGroup(-1614341844);
                final BringIntoViewRequester bringIntoViewRequester2 = BringIntoViewRequester.this;
                if (bringIntoViewRequester2 instanceof BringIntoViewRequesterImpl) {
                    EffectsKt.DisposableEffect(bringIntoViewRequester2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            ((BringIntoViewRequesterImpl) BringIntoViewRequester.this).getBringIntoViewUsages().add(bringIntoViewData2);
                            final BringIntoViewRequester bringIntoViewRequester3 = BringIntoViewRequester.this;
                            final BringIntoViewData bringIntoViewData3 = bringIntoViewData2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    ((BringIntoViewRequesterImpl) BringIntoViewRequester.this).getBringIntoViewUsages().remove(bringIntoViewData3);
                                }
                            };
                        }
                    }, composer, 0);
                }
                composer.endReplaceableGroup();
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(BringRectangleOnScreen_androidKt.bringRectangleOnScreenRequester(Modifier.Companion, bringIntoViewData2.getBringRectangleOnScreenRequester()), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2.2
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
                        BringIntoViewData.this.setLayoutCoordinates(it);
                    }
                });
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue2 = composer.rememberedValue();
                ModifierLocalConsumer modifierLocalConsumer = rememberedValue2;
                if (rememberedValue2 == companion.getEmpty()) {
                    modifierLocalConsumer = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$3$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                            return ModifierLocalConsumer.DefaultImpls.all(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                            return ModifierLocalConsumer.DefaultImpls.any(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
                            return (R) ModifierLocalConsumer.DefaultImpls.foldIn(this, r2, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
                            return (R) ModifierLocalConsumer.DefaultImpls.foldOut(this, r2, function2);
                        }

                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            BringIntoViewData.this.setParent((BringIntoViewResponder) scope.getCurrent(BringIntoViewResponder.Companion.getModifierLocalBringIntoViewResponder()));
                        }

                        @Override // androidx.compose.ui.Modifier
                        @NotNull
                        public Modifier then(@NotNull Modifier modifier2) {
                            return ModifierLocalConsumer.DefaultImpls.then(this, modifier2);
                        }
                    };
                    composer.updateRememberedValue(modifierLocalConsumer);
                }
                composer.endReplaceableGroup();
                Modifier then = onGloballyPositioned.then((Modifier) modifierLocalConsumer);
                composer.endReplaceableGroup();
                return then;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }
}
