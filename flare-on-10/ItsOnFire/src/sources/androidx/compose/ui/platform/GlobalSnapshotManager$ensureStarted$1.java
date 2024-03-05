package androidx.compose.ui.platform;

import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0002\u001a\u00020\u0001*\u00020��H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1.class */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ n<Unit> $channel;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(n<Unit> nVar, Continuation<? super GlobalSnapshotManager$ensureStarted$1> continuation) {
        super(2, continuation);
        this.$channel = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Type inference failed for: r0v44, types: [l.i0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:25:0x0086). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r4
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L39
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L2f
            r0 = r4
            java.lang.Object r0 = r0.L$1
            l.p r0 = (l.p) r0
            r8 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$0
            l.i0 r0 = (l.i0) r0
            r9 = r0
            r0 = r9
            r10 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Lba
            goto L86
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L39:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            l.n<kotlin.Unit> r0 = r0.$channel
            r9 = r0
            r0 = r9
            r10 = r0
            r0 = r9
            l.p r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lba
            r8 = r0
        L50:
            r0 = r9
            r10 = r0
            r0 = r4
            r1 = r9
            r0.L$0 = r1     // Catch: java.lang.Throwable -> Lba
            r0 = r9
            r10 = r0
            r0 = r4
            r1 = r8
            r0.L$1 = r1     // Catch: java.lang.Throwable -> Lba
            r0 = r9
            r10 = r0
            r0 = r4
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> Lba
            r0 = r9
            r10 = r0
            r0 = r8
            r1 = r4
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.Throwable -> Lba
            r11 = r0
            r0 = r11
            r5 = r0
            r0 = r11
            r1 = r6
            if (r0 != r1) goto L86
            r0 = r6
            return r0
        L86:
            r0 = r9
            r10 = r0
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lba
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto Lb0
            r0 = r9
            r10 = r0
            r0 = r8
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lba
            kotlin.Unit r0 = (kotlin.Unit) r0     // Catch: java.lang.Throwable -> Lba
            r5 = r0
            r0 = r9
            r10 = r0
            androidx.compose.runtime.snapshots.Snapshot$Companion r0 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch: java.lang.Throwable -> Lba
            r0.sendApplyNotifications()     // Catch: java.lang.Throwable -> Lba
            goto L50
        Lb0:
            r0 = r9
            r1 = 0
            l.s.b(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lba:
            r9 = move-exception
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r5 = move-exception
            r0 = r10
            r1 = r9
            l.s.b(r0, r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
