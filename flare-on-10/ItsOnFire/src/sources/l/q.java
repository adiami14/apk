package l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��4\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\b\u001a\u00028��\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028��0\u0002H\u0086\bø\u0001��ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 ��¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001��ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 ��¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001��ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 ��¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u0001\"\u0004\b��\u0010��*\b\u0012\u0004\u0012\u00028��0\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001��ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 ��¢\u0006\u0004\b\u000f\u0010\t\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028��0\u0016\"\u0004\b��\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028��0\u0016\"\u0004\b��\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Ll/r;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "value", "", "action", "h", "g", "f", "E", "", "capacity", "Ll/m;", "onBufferOverflow", "onUndeliveredElement", "Ll/n;", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:l/q.class */
public final class q {
    @NotNull
    public static final <E> n<E> b(int i2, @NotNull m mVar, @Nullable Function1<? super E, Unit> function1) {
        n hVar;
        if (i2 == -2) {
            int i3 = 1;
            if (mVar == m.SUSPEND) {
                i3 = n.f727c.a();
            }
            hVar = new h(i3, mVar, function1);
        } else if (i2 != -1) {
            hVar = i2 != 0 ? i2 != Integer.MAX_VALUE ? (i2 == 1 && mVar == m.DROP_OLDEST) ? new a0(function1) : new h(i2, mVar, function1) : new d0(function1) : mVar == m.SUSPEND ? new k0(function1) : new h(1, mVar, function1);
        } else {
            if (!(mVar == m.SUSPEND)) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            hVar = new a0(function1);
        }
        return hVar;
    }

    public static /* synthetic */ n c(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return d(i2, null, null, 6, null);
    }

    public static /* synthetic */ n d(int i2, m mVar, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            mVar = m.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        return b(i2, mVar, function1);
    }

    public static final <T> T e(@NotNull Object obj, @NotNull Function1<? super Throwable, ? extends T> function1) {
        T t2 = obj;
        if (obj instanceof r.c) {
            t2 = function1.invoke(r.f(obj));
        }
        return (T) t2;
    }

    @NotNull
    public static final <T> Object f(@NotNull Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        if (obj instanceof r.a) {
            function1.invoke(r.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object g(@NotNull Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        if (obj instanceof r.c) {
            function1.invoke(r.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object h(@NotNull Object obj, @NotNull Function1<? super T, Unit> function1) {
        if (!(obj instanceof r.c)) {
            function1.invoke(obj);
        }
        return obj;
    }
}
