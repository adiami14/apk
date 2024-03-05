package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import j.c0;
import j.j;
import j.n2;
import j.q;
import j.r;
import j.r2;
import j.u0;
import j.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import o.e0;
import o.i;
import o.k;
import o.t0;
import o.v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"��ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018�� \u0097\u00012\u00020\u0001:\b\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001B\u0011\u0012\u0006\u0010Y\u001a\u00020.¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001d\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0082\bJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J#\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001��¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0003H\u0082@ø\u0001��¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u001c\u001a\u00020\u00032<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0014¢\u0006\u0002\b\u001aH\u0082@ø\u0001��¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001fH\u0002J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J,\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u001e\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001fH\u0002J<\u0010&\u001a\u00028��\"\u0004\b��\u0010$2\u0006\u0010\u001e\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028��0%H\u0082\b¢\u0006\u0004\b&\u0010'J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0002J\u0006\u0010,\u001a\u00020+J\u0013\u0010-\u001a\u00020\u0003H\u0086@ø\u0001��¢\u0006\u0004\b-\u0010\u0013J\u001b\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.H\u0087@ø\u0001��¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u0003J\u0013\u00104\u001a\u00020\u0003H\u0086@ø\u0001��¢\u0006\u0004\b4\u0010\u0013J*\u00109\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00030%¢\u0006\u0002\b5H\u0010¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0003H\u0086@ø\u0001��¢\u0006\u0004\b:\u0010\u0013J\u001d\u0010@\u001a\u00020\u00032\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0010¢\u0006\u0004\b>\u0010?J\u0017\u0010C\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\bD\u0010BJ\u0017\u0010G\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\bF\u0010BJ\u0017\u0010L\u001a\u00020\u00032\u0006\u0010I\u001a\u00020HH\u0010¢\u0006\u0004\bJ\u0010KR$\u0010O\u001a\u00020M2\u0006\u0010N\u001a\u00020M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020.8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR \u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190g0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010fR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010fR\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020t0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u00060wR\u00020��8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010{R\u0016\u0010\u0082\u0001\u001a\u00020p8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010{R\u0015\u0010/\u001a\u00020.8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\\R&\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020t0\u0084\u00018FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020t0\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0013\u0010\u008f\u0001\u001a\u00020p8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010{R\u0017\u0010\u0092\u0001\u001a\u00020m8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u0094\u0001\u001a\u00020p8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010{\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lj/q;", "", "deriveStateLocked", "recordComposerModificationsLocked", "Lkotlin/Function1;", "Landroidx/compose/runtime/ControlledComposition;", "onEachInvalidComposition", "Lj/n2;", "callingJob", "registerRunnerJob", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lj/u0;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "Landroidx/compose/runtime/collection/IdentityArraySet;", "modifiedValues", "performRecompose", "readObserverOf", "writeObserverOf", "T", "Lkotlin/Function0;", "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "runRecomposeAndApplyChanges", "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "close", "join", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "awaitIdle", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "Lj/c0;", "effectJob", "Lj/c0;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lj/n2;", "", "closeCause", "Ljava/lang/Throwable;", "", "knownCompositions", "Ljava/util/List;", "", "snapshotInvalidations", "compositionInvalidations", "compositionsAwaitingApply", "workContinuation", "Lj/q;", "", "concurrentCompositionsOutstanding", "I", "", "isClosed", "Z", "Lo/e0;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lo/e0;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getShouldKeepRecomposing", "()Z", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "getRecomposeCoroutineContext$runtime_release", "Lo/i;", "getState", "()Lo/i;", "getState$annotations", "()V", "state", "Lo/t0;", "getCurrentState", "()Lo/t0;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Companion", "HotReloadable", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/Recomposer.class */
public final class Recomposer extends CompositionContext {
    @NotNull
    private final e0<State> _state;
    @NotNull
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    @Nullable
    private Throwable closeCause;
    @NotNull
    private final List<ControlledComposition> compositionInvalidations;
    @NotNull
    private final List<ControlledComposition> compositionsAwaitingApply;
    private int concurrentCompositionsOutstanding;
    @NotNull
    private final CoroutineContext effectCoroutineContext;
    @NotNull
    private final c0 effectJob;
    private boolean isClosed;
    @NotNull
    private final List<ControlledComposition> knownCompositions;
    @NotNull
    private final RecomposerInfoImpl recomposerInfo;
    @Nullable
    private n2 runnerJob;
    @NotNull
    private final List<Set<Object>> snapshotInvalidations;
    @NotNull
    private final Object stateLock;
    @Nullable
    private q<? super Unit> workContinuation;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @NotNull
    private static final e0<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = v0.a(ExtensionsKt.persistentSetOf());

    @Metadata(bv = {}, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u000f\u0010\n\u001a\u00020\u0001H��¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0001H��¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "", "addRunning", "removeRunning", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", FirebaseMessagingService.EXTRA_TOKEN, "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "Lo/t0;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lo/t0;", "runningRecomposers", "Lo/e0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lo/e0;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/Recomposer$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.c(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.c(persistentSet, remove));
        }

        @NotNull
        public final t0<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            Intrinsics.checkNotNullParameter(token, "token");
            List list = (List) token;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((HotReloadable) list.get(i2)).resetContent();
            }
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((HotReloadable) list.get(i3)).recompose();
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Iterable<RecomposerInfoImpl> iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            for (RecomposerInfoImpl recomposerInfoImpl : iterable) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, recomposerInfoImpl.saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/Recomposer$HotReloadable.class */
    public static final class HotReloadable {
        @NotNull
        private Function2<? super Composer, ? super Integer, Unit> composable;
        @NotNull
        private final CompositionImpl composition;

        public HotReloadable(@NotNull CompositionImpl composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.composition = composition;
            this.composable = composition.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m1947getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    @Metadata(bv = {}, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0004\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "saveStateAndDisposeForHotReload", "Lo/i;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lo/i;", "state", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getChangeCount", "()J", "changeCount", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/Recomposer$RecomposerInfoImpl.class */
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public final /* synthetic */ Recomposer this$0;

        public RecomposerInfoImpl(Recomposer this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return this.this$0.getChangeCount();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return this.this$0.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @NotNull
        public i<State> getState() {
            return this.this$0.getCurrentState();
        }

        @NotNull
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List mutableList;
            Object obj = this.this$0.stateLock;
            Recomposer recomposer = this.this$0;
            synchronized (obj) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i3));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018��2\b\u0012\u0004\u0012\u00020��0\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/Recomposer$State.class */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public Recomposer(@NotNull CoroutineContext effectCoroutineContext) {
        Intrinsics.checkNotNullParameter(effectCoroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                q deriveStateLocked;
                e0 e0Var;
                Throwable th;
                Object obj = Recomposer.this.stateLock;
                Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    deriveStateLocked = recomposer.deriveStateLocked();
                    e0Var = recomposer._state;
                    if (((Recomposer.State) e0Var.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        th = recomposer.closeCause;
                        throw y1.a("Recomposer shutdown; frame clock awaiter will never resume", th);
                    }
                }
                if (deriveStateLocked == null) {
                    return;
                }
                Result.Companion companion = Result.Companion;
                deriveStateLocked.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        c0 a2 = r2.a((n2) effectCoroutineContext.get(n2.f531b));
        a2.H(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable final Throwable th) {
                n2 n2Var;
                e0 e0Var;
                q qVar;
                e0 e0Var2;
                boolean z;
                q qVar2;
                q qVar3;
                q qVar4;
                CancellationException a3 = y1.a("Recomposer effect job completed", th);
                Object obj = Recomposer.this.stateLock;
                final Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    n2Var = recomposer.runnerJob;
                    if (n2Var != null) {
                        e0Var2 = recomposer._state;
                        e0Var2.setValue(Recomposer.State.ShuttingDown);
                        z = recomposer.isClosed;
                        if (z) {
                            qVar2 = recomposer.workContinuation;
                            if (qVar2 != null) {
                                qVar3 = recomposer.workContinuation;
                                qVar4 = qVar3;
                                recomposer.workContinuation = null;
                                n2Var.H(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                        invoke2(th2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Throwable th2) {
                                        Throwable th3;
                                        e0 e0Var3;
                                        Object obj2 = Recomposer.this.stateLock;
                                        Recomposer recomposer2 = Recomposer.this;
                                        Throwable th4 = th;
                                        synchronized (obj2) {
                                            if (th4 == null) {
                                                th3 = null;
                                            } else if (th2 == null) {
                                                th3 = th4;
                                            } else {
                                                if (!(!(th2 instanceof CancellationException))) {
                                                    th2 = null;
                                                }
                                                if (th2 == null) {
                                                    th3 = th4;
                                                } else {
                                                    ExceptionsKt__ExceptionsKt.addSuppressed(th4, th2);
                                                    th3 = th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            e0Var3 = recomposer2._state;
                                            e0Var3.setValue(Recomposer.State.ShutDown);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    }
                                });
                                qVar = qVar4;
                            }
                        } else {
                            n2Var.cancel(a3);
                        }
                        qVar4 = null;
                        recomposer.workContinuation = null;
                        n2Var.H(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                invoke2(th2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Throwable th2) {
                                Throwable th3;
                                e0 e0Var3;
                                Object obj2 = Recomposer.this.stateLock;
                                Recomposer recomposer2 = Recomposer.this;
                                Throwable th4 = th;
                                synchronized (obj2) {
                                    if (th4 == null) {
                                        th3 = null;
                                    } else if (th2 == null) {
                                        th3 = th4;
                                    } else {
                                        if (!(!(th2 instanceof CancellationException))) {
                                            th2 = null;
                                        }
                                        if (th2 == null) {
                                            th3 = th4;
                                        } else {
                                            ExceptionsKt__ExceptionsKt.addSuppressed(th4, th2);
                                            th3 = th4;
                                        }
                                    }
                                    recomposer2.closeCause = th3;
                                    e0Var3 = recomposer2._state;
                                    e0Var3.setValue(Recomposer.State.ShutDown);
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        });
                        qVar = qVar4;
                    } else {
                        recomposer.closeCause = a3;
                        e0Var = recomposer._state;
                        e0Var.setValue(Recomposer.State.ShutDown);
                        Unit unit = Unit.INSTANCE;
                        qVar = null;
                    }
                }
                if (qVar == null) {
                    return;
                }
                Result.Companion companion = Result.Companion;
                qVar.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
        });
        this.effectJob = a2;
        this.effectCoroutineContext = effectCoroutineContext.plus(broadcastFrameClock).plus(a2);
        this.stateLock = new Object();
        this.knownCompositions = new ArrayList();
        this.snapshotInvalidations = new ArrayList();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this._state = v0.a(State.Inactive);
        this.recomposerInfo = new RecomposerInfoImpl(this);
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Unit unit;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r rVar = new r(intercepted, 1);
        rVar.E();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            } else {
                this.workContinuation = rVar;
            }
            unit = Unit.INSTANCE;
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : unit;
    }

    private final <T> T composing(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet, Function0<? extends T> function0) {
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            InlineMarker.finallyEnd(1);
            InlineMarker.finallyStart(1);
            applyAndCheck(takeMutableSnapshot);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            applyAndCheck(takeMutableSnapshot);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final q<Unit> deriveStateLocked() {
        State state;
        q qVar = null;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            q<? super Unit> qVar2 = this.workContinuation;
            if (qVar2 != null) {
                q.a.a(qVar2, null, 1, null);
            }
            this.workContinuation = null;
            return null;
        }
        if (this.runnerJob == null) {
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            state = this.broadcastFrameClock.getHasAwaiters() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = ((this.compositionInvalidations.isEmpty() ^ true) || (this.snapshotInvalidations.isEmpty() ^ true) || (this.compositionsAwaitingApply.isEmpty() ^ true) || this.concurrentCompositionsOutstanding > 0 || this.broadcastFrameClock.getHasAwaiters()) ? State.PendingWork : State.Idle;
        }
        this._state.setValue(state);
        if (state == State.PendingWork) {
            qVar = this.workContinuation;
            this.workContinuation = null;
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        boolean z = true;
        if (!(!this.compositionsAwaitingApply.isEmpty())) {
            z = this.broadcastFrameClock.getHasAwaiters();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasFrameWorkLocked() {
        boolean z = true;
        if (!(!this.compositionInvalidations.isEmpty())) {
            z = this.broadcastFrameClock.getHasAwaiters();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!(!this.snapshotInvalidations.isEmpty())) {
                z = true;
                if (!(!this.compositionInvalidations.isEmpty())) {
                    z = this.broadcastFrameClock.getHasAwaiters();
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        boolean z2;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        boolean z3 = true;
        if (!(!z)) {
            Iterator<n2> it = this.effectJob.k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (it.next().b()) {
                    z2 = true;
                    break;
                }
            }
            z3 = z2;
        }
        return z3;
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition controlledComposition, final IdentityArraySet<Object> identityArraySet) {
        if (controlledComposition.isComposing() || controlledComposition.isDisposed()) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            boolean z = true;
            if (identityArraySet == null || !identityArraySet.isNotEmpty()) {
                z = false;
            }
            if (z) {
                controlledComposition.prepareCompose(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IdentityArraySet<Object> identityArraySet2 = identityArraySet;
                        ControlledComposition controlledComposition2 = controlledComposition;
                        for (Object obj : identityArraySet2) {
                            controlledComposition2.recordWriteOf(obj);
                        }
                    }
                });
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (!recompose) {
                controlledComposition = null;
            }
            return controlledComposition;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition controlledComposition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ControlledComposition.this.recordReadOf(value);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(Function3<? super u0, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object h2 = j.h(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return h2 == coroutine_suspended ? h2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordComposerModificationsLocked() {
        if (!this.snapshotInvalidations.isEmpty()) {
            List<Set<Object>> list = this.snapshotInvalidations;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Set<? extends Object> set = list.get(i2);
                List<ControlledComposition> list2 = this.knownCompositions;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    list2.get(i3).recordModificationsOf(set);
                }
            }
            this.snapshotInvalidations.clear();
            if (deriveStateLocked() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    private final void recordComposerModificationsLocked(Function1<? super ControlledComposition, Unit> function1) {
        if (!this.snapshotInvalidations.isEmpty()) {
            List list = this.snapshotInvalidations;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Set<? extends Object> set = (Set) list.get(i2);
                List list2 = this.knownCompositions;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((ControlledComposition) list2.get(i3)).recordModificationsOf(set);
                }
            }
            this.snapshotInvalidations.clear();
        }
        List list3 = this.compositionInvalidations;
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            function1.invoke(list3.get(i4));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(n2 n2Var) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = n2Var;
            deriveStateLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019b  */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0198 -> B:15:0x008e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition controlledComposition, final IdentityArraySet<Object> identityArraySet) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ControlledComposition.this.recordWriteOf(value);
                IdentityArraySet<Object> identityArraySet2 = identityArraySet;
                if (identityArraySet2 == null) {
                    return;
                }
                identityArraySet2.add(value);
            }
        };
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    @Nullable
    public final Object awaitIdle(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object x = k.x(k.U1(getCurrentState(), new Recomposer$awaitIdle$2(null)), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended ? x : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            Unit unit = Unit.INSTANCE;
        }
        n2.a.b(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(content, "content");
        boolean isComposing = composition.isComposing();
        Snapshot.Companion companion = Snapshot.Companion;
        MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            composition.composeContent(content);
            Unit unit = Unit.INSTANCE;
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (!isComposing) {
                companion.notifyObjectsInitialized();
            }
            synchronized (this.stateLock) {
                if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !this.knownCompositions.contains(composition)) {
                    this.knownCompositions.add(composition);
                }
            }
            composition.applyChanges();
            if (isComposing) {
                return;
            }
            companion.notifyObjectsInitialized();
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @NotNull
    public final t0<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getEffectCoroutineContext$runtime_release() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!(!this.snapshotInvalidations.isEmpty())) {
                z = true;
                if (!(!this.compositionInvalidations.isEmpty())) {
                    z = true;
                    if (this.concurrentCompositionsOutstanding <= 0) {
                        z = true;
                        if (!(!this.compositionsAwaitingApply.isEmpty())) {
                            z = this.broadcastFrameClock.getHasAwaiters();
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @NotNull
    public final i<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        q<Unit> qVar;
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                qVar = null;
            } else {
                this.compositionInvalidations.add(composition);
                qVar = deriveStateLocked();
            }
        }
        if (qVar == null) {
            return;
        }
        Result.Companion companion = Result.Companion;
        qVar.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        Set<Object> of;
        q<Unit> deriveStateLocked;
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.stateLock) {
            List<Set<Object>> list = this.snapshotInvalidations;
            of = SetsKt__SetsJVMKt.setOf(scope);
            list.add(of);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked == null) {
            return;
        }
        Result.Companion companion = Result.Companion;
        deriveStateLocked.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
    }

    @Nullable
    public final Object join(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object u0 = k.u0(getCurrentState(), new Recomposer$join$2(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return u0 == coroutine_suspended ? u0 : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
        Intrinsics.checkNotNullParameter(table, "table");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return recompositionRunner == coroutine_suspended ? recompositionRunner : Unit.INSTANCE;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return recompositionRunner == coroutine_suspended ? recompositionRunner : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            this.knownCompositions.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }
}
