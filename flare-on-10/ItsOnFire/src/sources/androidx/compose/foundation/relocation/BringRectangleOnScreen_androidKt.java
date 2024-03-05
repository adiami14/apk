package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u001a\u0014\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010��\u001a\u00020\u0002H��\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"bringRectangleOnScreenRequester", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;", "toRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/relocation/BringRectangleOnScreen_androidKt.class */
public final class BringRectangleOnScreen_androidKt {
    @NotNull
    public static final Modifier bringRectangleOnScreenRequester(@NotNull Modifier modifier, @NotNull final BringRectangleOnScreenRequester bringRectangleOnScreenRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(bringRectangleOnScreenRequester, "bringRectangleOnScreenRequester");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.relocation.BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("bringRectangleOnScreenRequester");
                inspectorInfo.getProperties().set("bringRectangleOnScreenRequester", BringRectangleOnScreenRequester.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.relocation.BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-711358161);
                final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                final BringRectangleOnScreenRequester bringRectangleOnScreenRequester2 = BringRectangleOnScreenRequester.this;
                EffectsKt.DisposableEffect(view, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.relocation.BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        BringRectangleOnScreenRequester.this.setView$foundation_release(view);
                        final BringRectangleOnScreenRequester bringRectangleOnScreenRequester3 = BringRectangleOnScreenRequester.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.relocation.BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                BringRectangleOnScreenRequester.this.setView$foundation_release(null);
                            }
                        };
                    }
                }, composer, 8);
                Modifier.Companion companion = Modifier.Companion;
                composer.endReplaceableGroup();
                return companion;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect toRect(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
