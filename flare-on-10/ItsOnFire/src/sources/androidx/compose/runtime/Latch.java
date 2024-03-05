package androidx.compose.runtime;

import j.q;
import j.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\u00020\bH\u0086@ø\u0001��¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ%\u0010\u0011\u001a\u0002H\u0012\"\u0004\b��\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\bø\u0001\u0001¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n��R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "()V", "_isOpen", "", "awaiters", "", "Lkotlin/coroutines/Continuation;", "", "isOpen", "()Z", "lock", "spareList", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeLatch", "openLatch", "withClosed", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/Latch.class */
public final class Latch {
    @NotNull
    private final Object lock = new Object();
    @NotNull
    private List<Continuation<Unit>> awaiters = new ArrayList();
    @NotNull
    private List<Continuation<Unit>> spareList = new ArrayList();
    private boolean _isOpen = true;

    @Nullable
    public final Object await(@NotNull Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (isOpen()) {
            return Unit.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        final r rVar = new r(intercepted, 1);
        rVar.E();
        synchronized (this.lock) {
            this.awaiters.add(rVar);
        }
        rVar.A(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                Object obj = Latch.this.lock;
                Latch latch = Latch.this;
                q<Unit> qVar = rVar;
                synchronized (obj) {
                    latch.awaiters.remove(qVar);
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (isOpen()) {
                return;
            }
            List<Continuation<Unit>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Continuation<Unit> continuation = list.get(i2);
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m5849constructorimpl(Unit.INSTANCE));
            }
            list.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final <R> R withClosed(@NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        closeLatch();
        try {
            R invoke = block.invoke();
            InlineMarker.finallyStart(1);
            openLatch();
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            openLatch();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
