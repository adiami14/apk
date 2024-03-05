package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
@ComposeCompilerApi
@Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\bg\u0018��2\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/ScopeUpdateScope;", "", "updateScope", "", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/ScopeUpdateScope.class */
public interface ScopeUpdateScope {
    void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> function2);
}
