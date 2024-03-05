package androidx.compose.runtime;

import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.i;
import o.k;
import o.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"��2\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028��0\u0004\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b��\u0010��*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028��0\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\b\"\u0004\b��\u0010��2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028��0\u000b\u001a-\u0010\u0013\u001a\u00020\u0010\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"T", "Lo/t0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/State;", "collectAsState", "(Lo/t0;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "Lo/i;", "initial", "(Lo/i;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "block", "snapshotFlow", "", "other", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "(Ljava/util/Set;Ljava/util/Set;)Z", "intersects", "runtime_release"}, k = 5, mv = {1, 6, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt.class */
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull i<? extends T> iVar, R r2, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        composer.startReplaceableGroup(2062127072);
        if ((i3 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        int i4 = i2 >> 3;
        State<R> produceState = SnapshotStateKt.produceState(r2, iVar, coroutineContext, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(coroutineContext, iVar, null), composer, (i4 & 8) | 576 | (i4 & 14));
        composer.endReplaceableGroup();
        return produceState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull t0<? extends T> t0Var, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        composer.startReplaceableGroup(2062126548);
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(t0Var, t0Var.getValue(), coroutineContext, composer, 520, 0);
        composer.endReplaceableGroup();
        return collectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(Set<? extends T> set, Set<? extends T> set2) {
        boolean z = true;
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (T t2 : set) {
                    if (set2.contains(t2)) {
                        break;
                    }
                }
            }
            z = false;
        } else {
            if (!set2.isEmpty()) {
                for (T t3 : set2) {
                    if (set.contains(t3)) {
                        break;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @NotNull
    public static final <T> i<T> snapshotFlow(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return k.I0(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(block, null));
    }
}
