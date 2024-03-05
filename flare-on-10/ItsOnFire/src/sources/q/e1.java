package q;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lq/e1;", "Lq/k;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "b", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/e1.class */
public final class e1 extends k {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f2048a = new e1();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f2049b = new ReentrantReadWriteLock();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f2050c = new WeakHashMap<>();

    @Override // q.k
    @NotNull
    public Function1<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        Function1<Throwable, Throwable> b2;
        ReentrantReadWriteLock reentrantReadWriteLock = f2049b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1<Throwable, Throwable> function1 = f2050c.get(cls);
            if (function1 != null) {
                return function1;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = f2050c;
                Function1<Throwable, Throwable> function12 = weakHashMap.get(cls);
                if (function12 != null) {
                    for (int i3 = 0; i3 < readHoldCount; i3++) {
                        readLock2.lock();
                    }
                    writeLock.unlock();
                    return function12;
                }
                b2 = n.b(cls);
                weakHashMap.put(cls, b2);
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    readLock2.lock();
                }
                writeLock.unlock();
                return b2;
            } catch (Throwable th) {
                for (int i5 = 0; i5 < readHoldCount; i5++) {
                    readLock2.lock();
                }
                writeLock.unlock();
                throw th;
            }
        } finally {
            readLock.unlock();
        }
    }
}
