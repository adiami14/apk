package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture.class */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {
    public static final AtomicHelper ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    @Nullable
    public volatile Listener listeners;
    @Nullable
    public volatile Object value;
    @Nullable
    public volatile Waiter waiters;
    public static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$AtomicHelper.class */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        public abstract boolean casListeners(AbstractResolvableFuture<?> abstractResolvableFuture, Listener listener, Listener listener2);

        public abstract boolean casValue(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean casWaiters(AbstractResolvableFuture<?> abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        public abstract void putNext(Waiter waiter, Waiter waiter2);

        public abstract void putThread(Waiter waiter, Thread thread);
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$Cancellation.class */
    public static final class Cancellation {
        public static final Cancellation CAUSELESS_CANCELLED;
        public static final Cancellation CAUSELESS_INTERRUPTED;
        @Nullable
        public final Throwable cause;
        public final boolean wasInterrupted;

        static {
            if (AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
                return;
            }
            CAUSELESS_CANCELLED = new Cancellation(false, null);
            CAUSELESS_INTERRUPTED = new Cancellation(true, null);
        }

        public Cancellation(boolean z, @Nullable Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$Failure.class */
    public static final class Failure {
        public static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        public final Throwable exception;

        public Failure(Throwable th) {
            this.exception = (Throwable) AbstractResolvableFuture.checkNotNull(th);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$Listener.class */
    public static final class Listener {
        public static final Listener TOMBSTONE = new Listener(null, null);
        public final Executor executor;
        @Nullable
        public Listener next;
        public final Runnable task;

        public Listener(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$SafeAtomicHelper.class */
    public static final class SafeAtomicHelper extends AtomicHelper {
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> listenersUpdater;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> valueUpdater;
        public final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        public final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> waitersUpdater;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public boolean casListeners(AbstractResolvableFuture<?> abstractResolvableFuture, Listener listener, Listener listener2) {
            return a.a(this.listenersUpdater, abstractResolvableFuture, listener, listener2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public boolean casValue(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            return a.a(this.valueUpdater, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public boolean casWaiters(AbstractResolvableFuture<?> abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            return a.a(this.waitersUpdater, abstractResolvableFuture, waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public void putNext(Waiter waiter, Waiter waiter2) {
            this.waiterNextUpdater.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public void putThread(Waiter waiter, Thread thread) {
            this.waiterThreadUpdater.lazySet(waiter, thread);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$SetFuture.class */
    public static final class SetFuture<V> implements Runnable {
        public final ListenableFuture<? extends V> future;
        public final AbstractResolvableFuture<V> owner;

        public SetFuture(AbstractResolvableFuture<V> abstractResolvableFuture, ListenableFuture<? extends V> listenableFuture) {
            this.owner = abstractResolvableFuture;
            this.future = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.owner.value != this) {
                return;
            }
            if (AbstractResolvableFuture.ATOMIC_HELPER.casValue(this.owner, this, AbstractResolvableFuture.getFutureValue(this.future))) {
                AbstractResolvableFuture.complete(this.owner);
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$SynchronizedHelper.class */
    public static final class SynchronizedHelper extends AtomicHelper {
        public SynchronizedHelper() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public boolean casListeners(AbstractResolvableFuture<?> abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.listeners == listener) {
                    abstractResolvableFuture.listeners = listener2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public boolean casValue(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.value == obj) {
                    abstractResolvableFuture.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public boolean casWaiters(AbstractResolvableFuture<?> abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.waiters == waiter) {
                    abstractResolvableFuture.waiters = waiter2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public void putNext(Waiter waiter, Waiter waiter2) {
            waiter.next = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public void putThread(Waiter waiter, Thread thread) {
            waiter.thread = thread;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/concurrent/futures/AbstractResolvableFuture$Waiter.class */
    public static final class Waiter {
        public static final Waiter TOMBSTONE = new Waiter(false);
        @Nullable
        public volatile Waiter next;
        @Nullable
        public volatile Thread thread;

        public Waiter() {
            AbstractResolvableFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }

        public Waiter(boolean z) {
        }

        public void setNext(Waiter waiter) {
            AbstractResolvableFuture.ATOMIC_HELPER.putNext(this, waiter);
        }

        public void unpark() {
            Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        ATOMIC_HELPER = synchronizedHelper;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        String str;
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
            sb.append("]");
        } catch (CancellationException e2) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    private static CancellationException cancellationExceptionWithCause(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t2) {
        t2.getClass();
        return t2;
    }

    private Listener clearListeners(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.listeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener2, Listener.TOMBSTONE));
        Listener listener3 = listener;
        Listener listener4 = listener2;
        while (true) {
            Listener listener5 = listener3;
            listener3 = listener4;
            if (listener3 == null) {
                return listener5;
            }
            listener4 = listener3.next;
            listener3.next = listener5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture<V>] */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper] */
    public static void complete(AbstractResolvableFuture<?> abstractResolvableFuture) {
        Listener listener;
        AbstractResolvableFuture<V> abstractResolvableFuture2;
        Listener listener2 = null;
        while (true) {
            abstractResolvableFuture.releaseWaiters();
            abstractResolvableFuture.afterDone();
            Listener clearListeners = abstractResolvableFuture.clearListeners(listener2);
            while (true) {
                Listener listener3 = clearListeners;
                if (listener3 == null) {
                    return;
                }
                listener = listener3.next;
                Runnable runnable = listener3.task;
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractResolvableFuture2 = setFuture.owner;
                    if (abstractResolvableFuture2.value == setFuture) {
                        if (ATOMIC_HELPER.casValue(abstractResolvableFuture2, setFuture, getFutureValue(setFuture.future))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, listener3.executor);
                }
                clearListeners = listener;
            }
            listener2 = listener;
            abstractResolvableFuture = abstractResolvableFuture2;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = log;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) obj).cause);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).exception);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) listenableFuture).value;
            Cancellation cancellation = obj;
            if (obj instanceof Cancellation) {
                Cancellation cancellation2 = (Cancellation) obj;
                cancellation = obj;
                if (cancellation2.wasInterrupted) {
                    cancellation = cancellation2.cause != null ? new Cancellation(false, cancellation2.cause) : Cancellation.CAUSELESS_CANCELLED;
                }
            }
            return cancellation;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return Cancellation.CAUSELESS_CANCELLED;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            Object obj2 = uninterruptibly;
            if (uninterruptibly == null) {
                obj2 = NULL;
            }
            return obj2;
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new Cancellation(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
        } catch (ExecutionException e3) {
            return new Failure(e3.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        boolean z;
        V v2;
        boolean z2 = false;
        while (true) {
            try {
                z = z2;
                v2 = future.get();
                break;
            } catch (InterruptedException e2) {
                z2 = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    private void releaseWaiters() {
        Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.next;
        }
    }

    private void removeWaiter(Waiter waiter) {
        Waiter waiter2;
        waiter.thread = null;
        while (true) {
            Waiter waiter3 = this.waiters;
            if (waiter3 == Waiter.TOMBSTONE) {
                return;
            }
            Waiter waiter4 = null;
            while (true) {
                Waiter waiter5 = waiter4;
                if (waiter3 == null) {
                    return;
                }
                Waiter waiter6 = waiter3.next;
                if (waiter3.thread != null) {
                    waiter2 = waiter3;
                } else if (waiter5 != null) {
                    waiter5.next = waiter6;
                    waiter2 = waiter5;
                    if (waiter5.thread == null) {
                        break;
                    }
                } else {
                    waiter2 = waiter5;
                    if (!ATOMIC_HELPER.casWaiters(this, waiter3, waiter6)) {
                        break;
                    }
                }
                waiter3 = waiter6;
                waiter4 = waiter2;
            }
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        checkNotNull(runnable);
        checkNotNull(executor);
        Listener listener2 = this.listeners;
        if (listener2 == Listener.TOMBSTONE) {
            executeListener(runnable, executor);
        }
        Listener listener3 = new Listener(runnable, executor);
        do {
            listener3.next = listener2;
            if (ATOMIC_HELPER.casListeners(this, listener2, listener3)) {
                return;
            }
            listener = this.listeners;
            listener2 = listener;
        } while (listener != Listener.TOMBSTONE);
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof SetFuture)) {
            Cancellation cancellation = GENERATE_CANCELLATION_CAUSES ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.CAUSELESS_INTERRUPTED : Cancellation.CAUSELESS_CANCELLED;
            z2 = false;
            AbstractResolvableFuture<V> abstractResolvableFuture = this;
            while (true) {
                if (ATOMIC_HELPER.casValue(abstractResolvableFuture, obj, cancellation)) {
                    if (z) {
                        abstractResolvableFuture.interruptTask();
                    }
                    complete(abstractResolvableFuture);
                    z2 = true;
                    if (!(obj instanceof SetFuture)) {
                        break;
                    }
                    ListenableFuture<? extends V> listenableFuture = ((SetFuture) obj).future;
                    if (!(listenableFuture instanceof AbstractResolvableFuture)) {
                        listenableFuture.cancel(z);
                        z2 = true;
                        break;
                    }
                    abstractResolvableFuture = (AbstractResolvableFuture) listenableFuture;
                    obj = abstractResolvableFuture.value;
                    z2 = true;
                    if (!(obj == null) && !(obj instanceof SetFuture)) {
                        break;
                    }
                    z2 = true;
                } else {
                    Object obj2 = abstractResolvableFuture.value;
                    obj = obj2;
                    if (!(obj2 instanceof SetFuture)) {
                        break;
                    }
                }
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        Waiter waiter;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
            return getDoneValue(obj2);
        }
        Waiter waiter2 = this.waiters;
        if (waiter2 != Waiter.TOMBSTONE) {
            Waiter waiter3 = new Waiter();
            do {
                waiter3.setNext(waiter2);
                if (ATOMIC_HELPER.casWaiters(this, waiter2, waiter3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            removeWaiter(waiter3);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof SetFuture))));
                    return getDoneValue(obj);
                }
                waiter = this.waiters;
                waiter2 = waiter;
            } while (waiter != Waiter.TOMBSTONE);
            return getDoneValue(this.value);
        }
        return getDoneValue(this.value);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        Waiter waiter;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return getDoneValue(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j3 = nanos;
        if (nanos >= 1000) {
            Waiter waiter2 = this.waiters;
            if (waiter2 != Waiter.TOMBSTONE) {
                Waiter waiter3 = new Waiter();
                do {
                    waiter3.setNext(waiter2);
                    if (ATOMIC_HELPER.casWaiters(this, waiter2, waiter3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return getDoneValue(obj2);
                            }
                            j3 = nanoTime - System.nanoTime();
                            nanos = j3;
                        } while (j3 >= 1000);
                        removeWaiter(waiter3);
                    } else {
                        waiter = this.waiters;
                        waiter2 = waiter;
                    }
                } while (waiter != Waiter.TOMBSTONE);
                return getDoneValue(this.value);
            }
            return getDoneValue(this.value);
        }
        while (j3 > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j3 = nanoTime - System.nanoTime();
        }
        String abstractResolvableFuture = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        String str2 = str;
        if (j3 + 1000 < 0) {
            String str3 = str + " (plus ";
            long j4 = -j3;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z = i2 == 0 || nanos2 > 1000;
            String str4 = str3;
            if (i2 > 0) {
                String str5 = str3 + convert + " " + lowerCase;
                String str6 = str5;
                if (z) {
                    str6 = str5 + ",";
                }
                str4 = str6 + " ";
            }
            String str7 = str4;
            if (z) {
                str7 = str4 + nanos2 + " nanoseconds ";
            }
            str2 = str7 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str2 + " but future completed as timeout expired");
        }
        throw new TimeoutException(str2 + " for " + abstractResolvableFuture);
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof SetFuture) {
            return "setFuture=[" + userObjectToString(((SetFuture) obj).future) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean set(@Nullable V v2) {
        V v3 = v2;
        if (v2 == null) {
            v3 = NULL;
        }
        if (ATOMIC_HELPER.casValue(this, null, v3)) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th) {
        if (ATOMIC_HELPER.casValue(this, null, new Failure((Throwable) checkNotNull(th)))) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        Object obj2 = obj;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (ATOMIC_HELPER.casValue(this, null, getFutureValue(listenableFuture))) {
                    complete(this);
                    return true;
                }
                return false;
            }
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (ATOMIC_HELPER.casValue(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable th2) {
                        failure = Failure.FALLBACK_INSTANCE;
                    }
                    ATOMIC_HELPER.casValue(this, setFuture, failure);
                    return true;
                }
            }
            obj2 = this.value;
        }
        if (obj2 instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj2).wasInterrupted);
            return false;
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = pendingToString();
                } catch (RuntimeException e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            addDoneString(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof Cancellation) && ((Cancellation) obj).wasInterrupted;
    }
}
