package androidx.compose.ui.platform;

import android.content.Context;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b��\u0018�� \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "calculateRecommendedTimeoutMillis", "", "originalTimeoutMillis", "containsIcons", "", "containsText", "containsControls", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidAccessibilityManager.class */
public final class AndroidAccessibilityManager implements AccessibilityManager {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int FlagContentControls = 4;
    @Deprecated
    public static final int FlagContentIcons = 1;
    @Deprecated
    public static final int FlagContentText = 2;
    @NotNull
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n��¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager$Companion;", "", "()V", "FlagContentControls", "", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidAccessibilityManager$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AndroidAccessibilityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
    }

    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j2, boolean z, boolean z2, boolean z3) {
        if (j2 >= 2147483647L) {
            return j2;
        }
        boolean z4 = z;
        if (z2) {
            z4 = z | true;
        }
        boolean z5 = z4;
        if (z3) {
            z5 = z4 | true;
        }
        int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j2, z5 ? 1 : 0);
        return recommendedTimeoutMillis == Integer.MAX_VALUE ? Long.MAX_VALUE : recommendedTimeoutMillis;
    }
}
