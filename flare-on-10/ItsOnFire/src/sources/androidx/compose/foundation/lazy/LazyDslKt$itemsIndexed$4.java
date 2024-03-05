package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0016\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 6, 0}, xi = Typography.degree)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4.class */
public final class LazyDslKt$itemsIndexed$4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
    public final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$itemsIndexed$4(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
        super(4);
        this.$itemContent = function5;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope items, int i2, @Nullable Composer composer, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i3 & 14) == 0) {
            i4 = (composer.changed(items) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4;
        if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 = i4 | (composer.changed(i2) ? 32 : 16);
        }
        if (((i5 & 731) ^ 146) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$itemContent.invoke(items, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((i5 & 14) | (i5 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
        }
    }
}
