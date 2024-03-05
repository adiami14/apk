package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018��2\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\fH&¢\u0006\u0002\u0010\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Composition;", "", "hasInvalidations", "", "getHasInvalidations", "()Z", "isDisposed", "dispose", "", "setContent", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/Composition.class */
public interface Composition {
    void dispose();

    boolean getHasInvalidations();

    boolean isDisposed();

    void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2);
}