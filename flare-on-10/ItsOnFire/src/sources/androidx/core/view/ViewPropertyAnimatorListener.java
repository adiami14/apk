package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/view/ViewPropertyAnimatorListener.class */
public interface ViewPropertyAnimatorListener {
    void onAnimationCancel(@NonNull View view);

    void onAnimationEnd(@NonNull View view);

    void onAnimationStart(@NonNull View view);
}
