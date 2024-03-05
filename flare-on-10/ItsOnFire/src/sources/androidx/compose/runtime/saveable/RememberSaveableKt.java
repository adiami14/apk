package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��<\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0004\b��\u0010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u0003H\u0002\u001aa\u0010\b\u001a\u0002H\u0005\"\b\b��\u0010\u0005*\u00020\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ag\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b��\u0010\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002\"\u000e\u0010��\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n��¨\u0006\u0017"}, d2 = {"MaxSupportedRadix", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "", "inner", "rememberSaveable", "inputs", "", "saver", "key", "", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "runtime-saveable_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/saveable/RememberSaveableKt.class */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        return SaverKt.Saver(new Function2<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Nullable
            public final MutableState<Object> invoke(@NotNull SaverScope Saver, @NotNull MutableState<T> state) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof SnapshotMutableState) {
                    return SnapshotStateKt.mutableStateOf(saver.save(Saver, state.getValue()), ((SnapshotMutableState) state).getPolicy());
                }
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ MutableState<Object> invoke(SaverScope saverScope, Object obj) {
                return invoke(saverScope, (MutableState) ((MutableState) obj));
            }
        }, new Function1<MutableState<Object>, MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final MutableState<T> invoke(@NotNull MutableState<Object> it) {
                T t2;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof SnapshotMutableState) {
                    if (it.getValue() != null) {
                        Saver<T, Object> saver2 = saver;
                        Object value = it.getValue();
                        Intrinsics.checkNotNull(value);
                        t2 = saver2.restore(value);
                    } else {
                        t2 = null;
                    }
                    return SnapshotStateKt.mutableStateOf(t2, ((SnapshotMutableState) it).getPolicy());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        });
    }

    @Composable
    @NotNull
    public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] inputs, @NotNull Saver<T, ? extends Object> stateSaver, @Nullable String str, @NotNull Function0<? extends MutableState<T>> init, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        composer.startReplaceableGroup(1059368946);
        if ((i3 & 4) != 0) {
            str = null;
        }
        MutableState<T> mutableState = (MutableState) m2016rememberSaveable(Arrays.copyOf(inputs, inputs.length), (Saver<Object, ? extends Object>) mutableStateSaver(stateSaver), str, (Function0<? extends Object>) init, composer, (i2 & 896) | 8 | (i2 & 7168), 0);
        composer.endReplaceableGroup();
        return mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L35;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: rememberSaveable  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T m2016rememberSaveable(@org.jetbrains.annotations.NotNull java.lang.Object[] r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.RememberSaveableKt.m2016rememberSaveable(java.lang.Object[], androidx.compose.runtime.saveable.Saver, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        StringBuilder sb;
        String sb2;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                sb2 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                throw new IllegalArgumentException(sb2);
            }
            sb = new StringBuilder();
            sb.append("MutableState containing ");
            sb.append(snapshotMutableState.getValue());
            str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            sb = sb3;
        }
        sb.append(str);
        sb2 = sb.toString();
        throw new IllegalArgumentException(sb2);
    }
}
