package androidx.compose.runtime.tooling;

import androidx.appcompat.R;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010��\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LocalInspectionTables", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/tooling/CompositionData;", "getLocalInspectionTables", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/tooling/InspectionTablesKt.class */
public final class InspectionTablesKt {
    @NotNull
    private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(new Function0<Set<CompositionData>>() { // from class: androidx.compose.runtime.tooling.InspectionTablesKt$LocalInspectionTables$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Set<CompositionData> invoke() {
            return null;
        }
    });

    @NotNull
    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return LocalInspectionTables;
    }
}