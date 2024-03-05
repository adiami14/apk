package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\bf\u0018��2\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/ui/Modifier$Element;", "onRemeasurementAvailable", "", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/RemeasurementModifier.class */
public interface RemeasurementModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/RemeasurementModifier$DefaultImpls.class */
    public static final class DefaultImpls {
        public static boolean all(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(remeasurementModifier, "this");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return Modifier.Element.DefaultImpls.all(remeasurementModifier, predicate);
        }

        public static boolean any(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(remeasurementModifier, "this");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return Modifier.Element.DefaultImpls.any(remeasurementModifier, predicate);
        }

        public static <R> R foldIn(@NotNull RemeasurementModifier remeasurementModifier, R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(remeasurementModifier, "this");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) Modifier.Element.DefaultImpls.foldIn(remeasurementModifier, r2, operation);
        }

        public static <R> R foldOut(@NotNull RemeasurementModifier remeasurementModifier, R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(remeasurementModifier, "this");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) Modifier.Element.DefaultImpls.foldOut(remeasurementModifier, r2, operation);
        }

        @NotNull
        public static Modifier then(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(remeasurementModifier, "this");
            Intrinsics.checkNotNullParameter(other, "other");
            return Modifier.Element.DefaultImpls.then(remeasurementModifier, other);
        }
    }

    void onRemeasurementAvailable(@NotNull Remeasurement remeasurement);
}
