package androidx.compose.ui.platform;

import androidx.appcompat.R;
import kotlin.Metadata;
@Metadata(d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018��2\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityManager;", "", "calculateRecommendedTimeoutMillis", "", "originalTimeoutMillis", "containsIcons", "", "containsText", "containsControls", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityManager.class */
public interface AccessibilityManager {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AccessibilityManager$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    z3 = false;
                }
                return accessibilityManager.calculateRecommendedTimeoutMillis(j2, z, z2, z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
        }
    }

    long calculateRecommendedTimeoutMillis(long j2, boolean z, boolean z2, boolean z3);
}
