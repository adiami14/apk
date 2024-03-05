package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��2\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018��*\u0004\b��\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001��¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u0003\u001a\u00028��H\u0086\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lq/q;", "E", "", "element", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "action", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "holder", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@JvmInline
/* loaded from: ItsOnFire.jar:q/q.class */
public final class q<E> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Object f2088a;

    public /* synthetic */ q(Object obj) {
        this.f2088a = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    @NotNull
    public static <E> Object b(@Nullable Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof q) && Intrinsics.areEqual(obj, ((q) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final void f(Object obj, @NotNull Function1<? super E, Unit> function1) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            function1.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            function1.invoke((Object) arrayList.get(size));
        }
    }

    public static int g(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    @NotNull
    public static final Object h(Object obj, E e2) {
        Object b2;
        if (obj == null) {
            b2 = b(e2);
        } else if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e2);
            b2 = b(obj);
        } else {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e2);
            b2 = b(arrayList);
        }
        return b2;
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f2088a, obj);
    }

    public int hashCode() {
        return g(this.f2088a);
    }

    public final /* synthetic */ Object j() {
        return this.f2088a;
    }

    public String toString() {
        return i(this.f2088a);
    }
}
