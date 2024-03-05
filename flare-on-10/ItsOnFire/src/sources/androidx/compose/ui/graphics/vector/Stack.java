package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��8\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018��*\u0004\b��\u0010\u00012\u00020\u0002B$\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028��0\u0004j\b\u0012\u0004\u0012\u00028��`\u0005ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00028��¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00028��¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00028��¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028��0\u0004j\b\u0012\u0004\u0012\u00028��`\u0005X\u0082\u0004¢\u0006\u0002\n��R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u0005ø\u0001��\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "size", "", "getSize-impl", "(Ljava/util/ArrayList;)I", "clear", "", "clear-impl", "(Ljava/util/ArrayList;)V", "equals", "", "other", "equals-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isNotEmpty", "isNotEmpty-impl", "peek", "peek-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "pop-impl", "push", "value", "push-impl", "toString", "", "toString-impl", "(Ljava/util/ArrayList;)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/Stack.class */
final class Stack<T> {
    @NotNull
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Stack m2966boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* renamed from: clear-impl  reason: not valid java name */
    public static final void m2967clearimpl(ArrayList<T> arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        arg0.clear();
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> ArrayList<T> m2968constructorimpl(@NotNull ArrayList<T> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        return backing;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ ArrayList m2969constructorimpl$default(ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m2968constructorimpl(arrayList);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2970equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && Intrinsics.areEqual(arrayList, ((Stack) obj).m2980unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2971equalsimpl0(ArrayList<?> arrayList, ArrayList<?> arrayList2) {
        return Intrinsics.areEqual(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static final int m2972getSizeimpl(ArrayList<T> arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0.size();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2973hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static final boolean m2974isEmptyimpl(ArrayList<T> arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0.isEmpty();
    }

    /* renamed from: isNotEmpty-impl  reason: not valid java name */
    public static final boolean m2975isNotEmptyimpl(ArrayList<T> arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return !m2974isEmptyimpl(arg0);
    }

    /* renamed from: peek-impl  reason: not valid java name */
    public static final T m2976peekimpl(ArrayList<T> arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0.get(m2972getSizeimpl(arg0) - 1);
    }

    /* renamed from: pop-impl  reason: not valid java name */
    public static final T m2977popimpl(ArrayList<T> arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0.remove(m2972getSizeimpl(arg0) - 1);
    }

    /* renamed from: push-impl  reason: not valid java name */
    public static final boolean m2978pushimpl(ArrayList<T> arg0, T t2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0.add(t2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2979toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m2970equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m2973hashCodeimpl(this.backing);
    }

    public String toString() {
        return m2979toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ ArrayList m2980unboximpl() {
        return this.backing;
    }
}
