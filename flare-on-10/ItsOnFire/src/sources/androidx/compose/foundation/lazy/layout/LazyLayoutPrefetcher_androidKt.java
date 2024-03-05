package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\"\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"LazyLayoutPrefetcher", "", "prefetchPolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutState;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt.class */
public final class LazyLayoutPrefetcher_androidKt {
    @Composable
    public static final void LazyLayoutPrefetcher(@NotNull final LazyLayoutPrefetchPolicy prefetchPolicy, @NotNull final LazyLayoutState state, @NotNull final LazyLayoutItemContentFactory itemContentFactory, @NotNull final SubcomposeLayoutState subcomposeLayoutState, @Nullable Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(prefetchPolicy, "prefetchPolicy");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Composer startRestartGroup = composer.startRestartGroup(-649386156);
        View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        int i3 = SubcomposeLayoutState.$stable;
        startRestartGroup.startReplaceableGroup(-3686095);
        boolean changed = startRestartGroup.changed(subcomposeLayoutState);
        boolean changed2 = startRestartGroup.changed(prefetchPolicy);
        boolean changed3 = startRestartGroup.changed(view);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            startRestartGroup.updateRememberedValue(new LazyLayoutPrefetcher(prefetchPolicy, state, subcomposeLayoutState, itemContentFactory, view));
        }
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(LazyLayoutPrefetchPolicy.this, state, itemContentFactory, subcomposeLayoutState, composer2, i2 | 1);
            }
        });
    }
}
