package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\n\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010��\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberLazyLayoutPrefetchPolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicyKt.class */
public final class LazyLayoutPrefetchPolicyKt {
    @Composable
    @NotNull
    public static final LazyLayoutPrefetchPolicy rememberLazyLayoutPrefetchPolicy(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(1707618476);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        LazyLayoutPrefetchPolicy lazyLayoutPrefetchPolicy = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            lazyLayoutPrefetchPolicy = new LazyLayoutPrefetchPolicy();
            composer.updateRememberedValue(lazyLayoutPrefetchPolicy);
        }
        composer.endReplaceableGroup();
        LazyLayoutPrefetchPolicy lazyLayoutPrefetchPolicy2 = (LazyLayoutPrefetchPolicy) lazyLayoutPrefetchPolicy;
        composer.endReplaceableGroup();
        return lazyLayoutPrefetchPolicy2;
    }
}
