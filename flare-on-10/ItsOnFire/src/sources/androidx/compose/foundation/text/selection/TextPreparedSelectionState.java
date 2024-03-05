package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n��\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "", "()V", "cachedX", "", "getCachedX", "()Ljava/lang/Float;", "setCachedX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "resetCachedX", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/TextPreparedSelectionState.class */
public final class TextPreparedSelectionState {
    @Nullable
    private Float cachedX;

    @Nullable
    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(@Nullable Float f2) {
        this.cachedX = f2;
    }
}
