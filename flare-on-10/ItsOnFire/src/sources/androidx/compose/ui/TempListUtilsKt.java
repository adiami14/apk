package androidx.compose.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��P\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a9\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\t\u001a_\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000f0\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a}\u0010\u0010\u001a\u0002H\u0011\"\u0004\b��\u0010\u0002\"\f\b\u0001\u0010\u0011*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u0012\u001a\u0002H\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0019\u001ab\u0010\u001a\u001a\u00020\u001b\"\u0004\b��\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H��\u001aI\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u000e\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u0007H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a_\u0010\u001e\u001a\u0002H\u001f\"\u0004\b��\u0010\u001f\"\b\b\u0001\u0010\u0002*\u0002H\u001f*\b\u0012\u0004\u0012\u0002H\u00020\u000e2'\u0010 \u001a#\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001f0!H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010%\u001a\u007f\u0010&\u001a\b\u0012\u0004\u0012\u0002H\r0\u000e\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u001d\"\u0004\b\u0002\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u000e26\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b()\u0012\u0004\u0012\u0002H\r0!H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u000e\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001d0!H\u0080\bø\u0001��\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAssociate", "", "K", "V", "", "Lkotlin/Pair;", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastMapNotNull", "R", "fastReduce", "S", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastZip", "other", "a", "b", "fastZipWithNext", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/TempListUtilsKt.class */
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
    public static final <T, K, V> Map<K, V> fastAssociate(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair<? extends K, ? extends V> invoke = transform.invoke((T) list.get(i2));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
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

    @NotNull
    public static final <T, R> List<R> fastMapNotNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            R invoke = transform.invoke((T) list.get(i2));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(@NotNull List<? extends T> list, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Object first;
        int lastIndex;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i2 = 1;
        S s2 = first;
        if (1 <= lastIndex) {
            Object obj = first;
            while (true) {
                s2 = operation.invoke(obj, (T) list.get(i2));
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
                obj = s2;
            }
        }
        return (S) s2;
    }

    @NotNull
    public static final <T, R, V> List<V> fastZip(@NotNull List<? extends T> list, @NotNull List<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(list.size(), other.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(transform.invoke((T) list.get(i2), (R) other.get(i2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        List<R> emptyList;
        int lastIndex;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (list.size() == 0 || list.size() == 1) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Object obj = list.get(0);
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        while (i2 < lastIndex) {
            i2++;
            Object obj2 = (T) list.get(i2);
            arrayList.add(transform.invoke((Object) obj, obj2));
            obj = obj2;
        }
        return arrayList;
    }
}
