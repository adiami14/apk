package q;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��0\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018��\"\b\b��\u0010\u0001*\u00020��2\u0006\u0010\u0002\u001a\u00028��H��¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020��\u0012\u0006\u0012\u0004\u0018\u00010��0\u0007j\u0002`\b\"\b\b��\u0010\u0001*\u00020��2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028��0\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020��\u0012\u0006\u0012\u0004\u0018\u00010��\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020��\u0012\u0006\u0012\u0004\u0018\u00010��0\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020��\u0012\u0004\u0012\u00020��0\u0007H\u0082\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0082\u0010\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020��\u0012\u0006\u0012\u0004\u0018\u00010��0\u00072\u0010\u0012\u0004\u0012\u00020��\u0012\u0006\u0012\u0004\u0018\u00010��0\u0007¨\u0006\u001b"}, d2 = {"", "E", "exception", "h", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "Ljava/lang/reflect/Constructor;", "constructor", "c", "block", "g", "", "defaultValue", "f", "accumulator", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "a", "I", "throwableFields", "Lq/k;", "Lq/k;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/n.class */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2073a = f(Throwable.class, -1);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final k f2074b;

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\b\n\u0002\b\u0007\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:q/n$a.class */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Constructor) t3).getParameterTypes().length), Integer.valueOf(((Constructor) t2).getParameterTypes().length));
            return compareValues;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b��\u0010\u0001*\u00020��2\u0006\u0010\u0002\u001a\u00020��H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/n$b.class */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: j  reason: collision with root package name */
        public static final b f2075j = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Void invoke(@NotNull Throwable th) {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010��2\u0006\u0010\u0001\u001a\u00020��H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/n$c.class */
    public static final class c extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2076j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f2076j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m5849constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2076j.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                m5849constructorimpl = Result.m5849constructorimpl((Throwable) newInstance);
                Object obj = m5849constructorimpl;
                if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010��2\u0006\u0010\u0001\u001a\u00020��H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/n$d.class */
    public static final class d extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2077j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f2077j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m5849constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2077j.newInstance(th);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                m5849constructorimpl = Result.m5849constructorimpl((Throwable) newInstance);
                Object obj = m5849constructorimpl;
                if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010��2\u0006\u0010\u0001\u001a\u00020��H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/n$e.class */
    public static final class e extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2078j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f2078j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m5849constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2078j.newInstance(th.getMessage());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                m5849constructorimpl = Result.m5849constructorimpl(th3);
                Object obj = m5849constructorimpl;
                if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010��2\u0006\u0010\u0001\u001a\u00020��H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/n$f.class */
    public static final class f extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2079j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f2079j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m5849constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2079j.newInstance(new Object[0]);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                m5849constructorimpl = Result.m5849constructorimpl(th3);
                Object obj = m5849constructorimpl;
                if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"��\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010��2\u0006\u0010\u0001\u001a\u00020��H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:q/n$g.class */
    public static final class g extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function1<Throwable, Throwable> f2080j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Throwable, ? extends Throwable> function1) {
            super(1);
            this.f2080j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m5849constructorimpl;
            Function1<Throwable, Throwable> function1 = this.f2080j;
            try {
                Result.Companion companion = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(function1.invoke(th));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th2));
            }
            Object obj = m5849constructorimpl;
            if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                obj = null;
            }
            return (Throwable) obj;
        }
    }

    static {
        k kVar;
        try {
            kVar = p.a() ? e1.f2048a : q.e.f2043a;
        } catch (Throwable th) {
            kVar = e1.f2048a;
        }
        f2074b = kVar;
    }

    public static final <E extends Throwable> Function1<Throwable, Throwable> b(Class<E> cls) {
        List<Constructor> sortedWith;
        b bVar = b.f2075j;
        if (f2073a != f(cls, 0)) {
            return bVar;
        }
        sortedWith = ArraysKt___ArraysKt.sortedWith(cls.getConstructors(), new a());
        for (Constructor constructor : sortedWith) {
            Function1<Throwable, Throwable> c2 = c(constructor);
            if (c2 != null) {
                return c2;
            }
        }
        return bVar;
    }

    public static final Function1<Throwable, Throwable> c(Constructor<?> constructor) {
        Function1 fVar;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            fVar = new f(constructor);
        } else if (length == 1) {
            Class<?> cls = parameterTypes[0];
            if (Intrinsics.areEqual(cls, Throwable.class)) {
                fVar = new d(constructor);
            } else {
                fVar = null;
                if (Intrinsics.areEqual(cls, String.class)) {
                    fVar = new e(constructor);
                }
            }
        } else if (length != 2) {
            fVar = null;
        } else {
            fVar = null;
            if (Intrinsics.areEqual(parameterTypes[0], String.class)) {
                fVar = null;
                if (Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                    fVar = new c(constructor);
                }
            }
        }
        return fVar;
    }

    public static final int d(Class<?> cls, int i2) {
        Field[] declaredFields;
        int i3;
        Class<? super Object> superclass;
        do {
            int length = cls.getDeclaredFields().length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i4 < length) {
                    int i7 = i6;
                    if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                        i7 = i6 + 1;
                    }
                    i4++;
                    i5 = i7;
                } else {
                    i3 = i2 + i6;
                    superclass = cls.getSuperclass();
                    cls = superclass;
                    i2 = i3;
                }
            }
        } while (superclass != null);
        return i3;
    }

    public static /* synthetic */ int e(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return d(cls, i2);
    }

    public static final int f(Class<?> cls, int i2) {
        Object m5849constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
        }
        Integer num = m5849constructorimpl;
        if (Result.m5855isFailureimpl(m5849constructorimpl)) {
            num = Integer.valueOf(i2);
        }
        return ((Number) num).intValue();
    }

    public static final Function1<Throwable, Throwable> g(Function1<? super Throwable, ? extends Throwable> function1) {
        return new g(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E h(@NotNull E e2) {
        Object m5849constructorimpl;
        if (e2 instanceof j.m0) {
            try {
                Result.Companion companion = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(((j.m0) e2).a());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
            }
            Object obj = m5849constructorimpl;
            if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                obj = null;
            }
            return (E) obj;
        }
        return (E) f2074b.a(e2.getClass()).invoke(e2);
    }
}
