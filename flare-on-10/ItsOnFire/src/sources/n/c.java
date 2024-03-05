package n;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.r0;
@Metadata(bv = {}, d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b��\u0018��*\b\b��\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u0004:\u0003()\u0014B\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028��H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028��2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028��H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028��2\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001b\u0010\u0014\u001a\u00020\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028��\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028��0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\"0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u0006*"}, d2 = {"Ln/c;", "", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "clear", "()V", "f", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "Ln/l;", "w", "c", "(Ln/l;)V", "Ljava/lang/ref/ReferenceQueue;", "j", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getEntries", "entries", "", "<init>", "(Z)V", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:n/c.class */
public final class c<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1004k = AtomicIntegerFieldUpdater.newUpdater(c.class, "_size");
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    public volatile /* synthetic */ Object core;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final ReferenceQueue<K> f1005j;

    @Metadata(bv = {}, d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\u0004\u0018��2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028��¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00028��2\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028��\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00120��R\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\u0004\b\u0002\u0010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006%"}, d2 = {"Ln/c$a;", "", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Ln/l;", "weakKey0", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ln/l;)Ljava/lang/Object;", "Ln/c;", "h", "()Ln/c$a;", "weakRef", "", "b", "(Ln/l;)V", "E", "Lkotlin/Function2;", "factory", "", "e", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "hash", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(I)I", FirebaseAnalytics.Param.INDEX, "i", "(I)V", "a", "I", "allocated", "shift", "threshold", "<init>", "(Ln/c;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/c$a.class */
    public final class a {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f1006g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");

        /* renamed from: a  reason: collision with root package name */
        public final int f1007a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1008b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1009c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f1010d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f1011e;
        @NotNull
        private volatile /* synthetic */ int load = 0;

        @Metadata(bv = {}, d1 = {"��.\n\u0002\u0018\u0002\n��\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0004\u0018��*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00028��8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Ln/c$a$a;", "E", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "", "a", "Lkotlin/Function2;", "j", "Lkotlin/jvm/functions/Function2;", "factory", "", "k", "I", FirebaseAnalytics.Param.INDEX, "l", "Ljava/lang/Object;", "key", "m", "value", "<init>", "(Ln/c$a;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: n.c$a$a  reason: collision with other inner class name */
        /* loaded from: ItsOnFire.jar:n/c$a$a.class */
        public final class C0058a<E> implements Iterator<E>, KMutableIterator {
            @NotNull

            /* renamed from: j  reason: collision with root package name */
            public final Function2<K, V, E> f1013j;

            /* renamed from: k  reason: collision with root package name */
            public int f1014k = -1;

            /* renamed from: l  reason: collision with root package name */
            public K f1015l;

            /* renamed from: m  reason: collision with root package name */
            public V f1016m;

            /* JADX WARN: Multi-variable type inference failed */
            public C0058a(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
                this.f1013j = function2;
                a();
            }

            public final void a() {
                K k2;
                while (true) {
                    int i2 = this.f1014k + 1;
                    this.f1014k = i2;
                    if (i2 >= a.this.f1007a) {
                        return;
                    }
                    l lVar = (l) a.this.f1010d.get(this.f1014k);
                    if (lVar != null && (k2 = (K) lVar.get()) != null) {
                        this.f1015l = k2;
                        Object obj = a.this.f1011e.get(this.f1014k);
                        Object obj2 = obj;
                        if (obj instanceof m) {
                            obj2 = ((m) obj).f1083a;
                        }
                        if (obj2 != null) {
                            this.f1016m = (V) obj2;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* renamed from: b */
            public Void remove() {
                n.d.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1014k < a.this.f1007a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.Unit] */
            /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.Unit] */
            @Override // java.util.Iterator
            public E next() {
                if (this.f1014k < a.this.f1007a) {
                    Function2<K, V, E> function2 = this.f1013j;
                    K k2 = this.f1015l;
                    K k3 = k2;
                    if (k2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("key");
                        k3 = Unit.INSTANCE;
                    }
                    V v2 = this.f1016m;
                    V v3 = v2;
                    if (v2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("value");
                        v3 = Unit.INSTANCE;
                    }
                    E invoke = function2.invoke(k3, v3);
                    a();
                    return invoke;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i2) {
            this.f1007a = i2;
            this.f1008b = Integer.numberOfLeadingZeros(i2) + 1;
            this.f1009c = (i2 * 2) / 3;
            this.f1010d = new AtomicReferenceArray(i2);
            this.f1011e = new AtomicReferenceArray(i2);
        }

        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, l lVar, int i2, Object obj3) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            return aVar.f(obj, obj2, lVar);
        }

        public final void b(@NotNull l<?> lVar) {
            int d2 = d(lVar.f1082a);
            while (true) {
                int i2 = d2;
                l<?> lVar2 = (l) this.f1010d.get(i2);
                if (lVar2 == null) {
                    return;
                }
                if (lVar2 == lVar) {
                    i(i2);
                    return;
                }
                int i3 = i2;
                if (i2 == 0) {
                    i3 = this.f1007a;
                }
                d2 = i3 - 1;
            }
        }

        @Nullable
        public final V c(@NotNull K k2) {
            int d2 = d(k2.hashCode());
            while (true) {
                int i2 = d2;
                l lVar = (l) this.f1010d.get(i2);
                if (lVar == null) {
                    return null;
                }
                T t2 = lVar.get();
                if (Intrinsics.areEqual(k2, t2)) {
                    Object obj = this.f1011e.get(i2);
                    Object obj2 = obj;
                    if (obj instanceof m) {
                        obj2 = ((m) obj).f1083a;
                    }
                    return (V) obj2;
                }
                if (t2 == 0) {
                    i(i2);
                }
                int i3 = i2;
                if (i2 == 0) {
                    i3 = this.f1007a;
                }
                d2 = i3 - 1;
            }
        }

        public final int d(int i2) {
            return (i2 * n.d.f1024a) >>> this.f1008b;
        }

        @NotNull
        public final <E> Iterator<E> e(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            return new C0058a(function2);
        }

        @Nullable
        public final Object f(@NotNull K k2, @Nullable V v2, @Nullable l<K> lVar) {
            int i2;
            r0 r0Var;
            Object obj;
            r0 r0Var2;
            int d2 = d(k2.hashCode());
            boolean z = false;
            while (true) {
                l lVar2 = (l) this.f1010d.get(d2);
                if (lVar2 != null) {
                    T t2 = lVar2.get();
                    if (!Intrinsics.areEqual(k2, t2)) {
                        if (t2 == 0) {
                            i(d2);
                        }
                        int i3 = d2;
                        if (d2 == 0) {
                            i3 = this.f1007a;
                        }
                        d2 = i3 - 1;
                    } else if (z) {
                        f1006g.decrementAndGet(this);
                    }
                } else if (v2 != null) {
                    boolean z2 = z;
                    if (!z) {
                        do {
                            i2 = this.load;
                            if (i2 >= this.f1009c) {
                                r0Var = n.d.f1026c;
                                return r0Var;
                            }
                        } while (!f1006g.compareAndSet(this, i2, i2 + 1));
                        z2 = true;
                    }
                    l<K> lVar3 = lVar;
                    if (lVar == null) {
                        lVar3 = new l<>(k2, c.this.f1005j);
                    }
                    if (n.b.a(this.f1010d, d2, null, lVar3)) {
                        break;
                    }
                    z = z2;
                    lVar = lVar3;
                } else {
                    return null;
                }
            }
            do {
                obj = this.f1011e.get(d2);
                if (obj instanceof m) {
                    r0Var2 = n.d.f1026c;
                    return r0Var2;
                }
            } while (!n.b.a(this.f1011e, d2, obj, v2));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final c<K, V>.a h() {
            int coerceAtLeast;
            m mVar;
            r0 r0Var;
            m d2;
            while (true) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(c.this.size(), 4);
                c<K, V>.a aVar = new a(Integer.highestOneBit(coerceAtLeast) * 4);
                int i2 = this.f1007a;
                for (int i3 = 0; i3 < i2; i3++) {
                    l<K> lVar = (l) this.f1010d.get(i3);
                    K k2 = lVar != null ? lVar.get() : null;
                    if (lVar != null && k2 == null) {
                        i(i3);
                    }
                    while (true) {
                        mVar = this.f1011e.get(i3);
                        if (mVar instanceof m) {
                            mVar = mVar.f1083a;
                            break;
                        }
                        d2 = n.d.d(mVar);
                        if (n.b.a(this.f1011e, i3, mVar, d2)) {
                            break;
                        }
                    }
                    if (k2 != null && mVar != null) {
                        Object f2 = aVar.f(k2, mVar, lVar);
                        r0Var = n.d.f1026c;
                        if (f2 != r0Var) {
                        }
                    }
                }
                return aVar;
            }
        }

        public final void i(int i2) {
            Object obj;
            do {
                obj = this.f1011e.get(i2);
                if (obj == null || (obj instanceof m)) {
                    return;
                }
            } while (!n.b.a(this.f1011e, i2, obj, null));
            c.this.d();
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018��*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Ln/c$b;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "k", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/c$b.class */
    public static final class b<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: j  reason: collision with root package name */
        public final K f1018j;

        /* renamed from: k  reason: collision with root package name */
        public final V f1019k;

        public b(K k2, V v2) {
            this.f1018j = k2;
            this.f1019k = v2;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1018j;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1019k;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            n.d.e();
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(bv = {}, d1 = {"��*\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018��*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ln/c$c;", "E", "Lkotlin/collections/AbstractMutableSet;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "Lkotlin/Function2;", "j", "Lkotlin/jvm/functions/Function2;", "factory", "", "getSize", "()I", "size", "<init>", "(Ln/c;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: n.c$c  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:n/c$c.class */
    public final class C0059c<E> extends AbstractMutableSet<E> {
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final Function2<K, V, E> f1020j;

        /* JADX WARN: Multi-variable type inference failed */
        public C0059c(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            this.f1020j = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e2) {
            n.d.e();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return c.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            return ((a) c.this.core).e(this.f1020j);
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b��\u0010\u0001*\u00020��\"\b\b\u0001\u0010\u0002*\u00020��2\u0006\u0010\u0003\u001a\u00028��2\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "K", "V", "k", "v", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/c$d.class */
    public static final class d extends Lambda implements Function2<K, V, Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        public static final d f1022j = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final Map.Entry<K, V> invoke(@NotNull K k2, @NotNull V v2) {
            return new b(k2, v2);
        }
    }

    @Metadata(d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010��\n\u0002\b\u0005\u0010��\u001a\u0002H\u0001\"\b\b��\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", "V", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:n/c$e.class */
    public static final class e extends Lambda implements Function2<K, V, K> {

        /* renamed from: j  reason: collision with root package name */
        public static final e f1023j = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final K invoke(@NotNull K k2, @NotNull V v2) {
            return k2;
        }
    }

    public c() {
        this(false, 1, null);
    }

    public c(boolean z) {
        this._size = 0;
        this.core = new a(16);
        this.f1005j = z ? new ReferenceQueue<>() : null;
    }

    public /* synthetic */ c(boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z);
    }

    public final void c(l<?> lVar) {
        ((a) this.core).b(lVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k2 : keySet()) {
            remove(k2);
        }
    }

    public final void d() {
        f1004k.decrementAndGet(this);
    }

    public final V e(K k2, V v2) {
        V v3;
        r0 r0Var;
        synchronized (this) {
            a aVar = (a) this.core;
            while (true) {
                v3 = (V) a.g(aVar, k2, v2, null, 4, null);
                r0Var = n.d.f1026c;
                if (v3 == r0Var) {
                    aVar = aVar.h();
                    this.core = aVar;
                }
            }
        }
        return v3;
    }

    public final void f() {
        if (!(this.f1005j != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.f1005j.remove();
                if (remove == null) {
                    break;
                }
                c((l) remove);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) this.core).c(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new C0059c(d.f1022j);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new C0059c(e.f1023j);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k2, @NotNull V v2) {
        r0 r0Var;
        Object g2 = a.g((a) this.core, k2, v2, null, 4, null);
        V v3 = g2;
        r0Var = n.d.f1026c;
        if (g2 == r0Var) {
            v3 = e(k2, v2);
        }
        if (v3 == null) {
            f1004k.incrementAndGet(this);
        }
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        r0 r0Var;
        if (obj == 0) {
            return null;
        }
        Object g2 = a.g((a) this.core, obj, null, null, 4, null);
        V v2 = g2;
        r0Var = n.d.f1026c;
        if (g2 == r0Var) {
            v2 = e(obj, null);
        }
        if (v2 != null) {
            f1004k.decrementAndGet(this);
        }
        return v2;
    }
}
