package androidx.compose.ui.text;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��Z\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000f\n\u0002\b\u0003\u001a9\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\t\u001aG\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a&\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H��\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00130\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00130\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aM\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000b\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00170\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ac\u0010\u0018\u001a\u0002H\u0016\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010\u0019\u001a\u0002H\u00162'\u0010\u001a\u001a#\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u001bH\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u001f\u001a}\u0010 \u001a\u0002H!\"\u0004\b��\u0010\u0002\"\f\b\u0001\u0010!*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0006\u0010\"\u001a\u0002H!2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010(\u001ab\u0010)\u001a\u00020*\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H��\u001aR\u0010+\u001a\u0004\u0018\u0001H\u0002\"\u0004\b��\u0010\u0002\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160,*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-\u001aA\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00130\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastDistinctBy", "", "K", "selector", "fastDrop", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "", "fastFilter", "predicate", "", "fastFilterNot", "fastFlatMap", "R", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastMinByOrNull", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastTakeWhile", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/TempListUtilsKt.class */
public final class TempListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t2, Function1<? super T, ? extends CharSequence> function1) {
        String valueOf;
        CharSequence charSequence;
        if (function1 != null) {
            charSequence = (T) function1.invoke(t2);
        } else {
            boolean z = t2 == 0 ? true : t2 instanceof CharSequence;
            charSequence = t2;
            if (!z) {
                if (t2 instanceof Character) {
                    appendable.append(((Character) t2).charValue());
                    return;
                }
                valueOf = String.valueOf(t2);
                appendable.append(valueOf);
            }
        }
        valueOf = charSequence;
        appendable.append(valueOf);
    }

    @NotNull
    public static final <T, K> List<T> fastDistinctBy(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = (T) list.get(i2);
            if (hashSet.add(selector.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> fastDrop(@NotNull List<? extends T> list, int i2) {
        Object last;
        List<T> listOf;
        List<T> emptyList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return list;
        } else {
            int size = list.size() - i2;
            if (size <= 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            } else if (size == 1) {
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(last);
                return listOf;
            } else {
                ArrayList arrayList = new ArrayList(size);
                int size2 = list.size();
                while (i2 < size2) {
                    arrayList.add(list.get(i2));
                    i2++;
                }
                return arrayList;
            }
        }
    }

    @NotNull
    public static final <T> List<T> fastFilter(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = (T) list.get(i2);
            if (predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilterNot(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = (T) list.get(i2);
            if (!predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastFlatMap(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke((T) list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@NotNull List<? extends T> list, R r2, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r2 = operation.invoke(r2, (T) list.get(i2));
        }
        return r2;
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        int i3;
        a2.append(charSequence2);
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = i5;
            if (i4 >= size) {
                break;
            }
            T t2 = list.get(i4);
            i5++;
            if (i5 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0) {
                i3 = i5;
                if (i5 > i2) {
                    break;
                }
            }
            appendElement(a2, t2, function1);
            i4++;
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 4) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 8) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        if ((i3 & 32) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 64) != 0) {
            function1 = null;
        }
        return fastJoinTo(list, appendable, charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i2, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) fastJoinTo(list, new StringBuilder(), separator, prefix, postfix, i2, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> selector) {
        int lastIndex;
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        Object obj2 = (Object) list.get(0);
        R invoke = selector.invoke(obj2);
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i2 = 1;
        Object obj3 = obj2;
        Object obj4 = obj2;
        if (1 <= lastIndex) {
            while (true) {
                R r2 = invoke;
                Object obj5 = (T) list.get(i2);
                R invoke2 = selector.invoke(obj5);
                invoke = r2;
                obj = obj4;
                if (r2.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    obj = (Object) obj5;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
                obj4 = obj;
            }
            obj3 = obj;
        }
        return obj3;
    }

    @NotNull
    public static final <T> List<T> fastTakeWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = (T) list.get(i2);
            if (!predicate.invoke(obj).booleanValue()) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
