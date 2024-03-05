package kotlin.collections;

import androidx.appcompat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��H\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b��\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b��\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b��\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b��\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001��¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b��\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010��¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/collections/ArraysKt")
/* loaded from: ItsOnFire.jar:kotlin/collections/ArraysKt__ArraysKt.class */
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepEquals")
    public static final <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        boolean m6450contentEqualslec5QzE;
        boolean m6446contentEqualsKJPZfPQ;
        boolean m6445contentEqualsFGO6Aew;
        boolean m6448contentEqualskV0jMPg;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            T t2 = tArr[i2];
            T t3 = tArr2[i2];
            if (t2 != t3) {
                if (t2 == null || t3 == null) {
                    return false;
                }
                if ((t2 instanceof Object[]) && (t3 instanceof Object[])) {
                    if (!contentDeepEquals((Object[]) t2, (Object[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof byte[]) && (t3 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t2, (byte[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof short[]) && (t3 instanceof short[])) {
                    if (!Arrays.equals((short[]) t2, (short[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof int[]) && (t3 instanceof int[])) {
                    if (!Arrays.equals((int[]) t2, (int[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof long[]) && (t3 instanceof long[])) {
                    if (!Arrays.equals((long[]) t2, (long[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof float[]) && (t3 instanceof float[])) {
                    if (!Arrays.equals((float[]) t2, (float[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof double[]) && (t3 instanceof double[])) {
                    if (!Arrays.equals((double[]) t2, (double[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof char[]) && (t3 instanceof char[])) {
                    if (!Arrays.equals((char[]) t2, (char[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof boolean[]) && (t3 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t2, (boolean[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof UByteArray) && (t3 instanceof UByteArray)) {
                    m6448contentEqualskV0jMPg = UArraysKt___UArraysKt.m6448contentEqualskV0jMPg(((UByteArray) t2).m5935unboximpl(), ((UByteArray) t3).m5935unboximpl());
                    if (!m6448contentEqualskV0jMPg) {
                        return false;
                    }
                } else if ((t2 instanceof UShortArray) && (t3 instanceof UShortArray)) {
                    m6445contentEqualsFGO6Aew = UArraysKt___UArraysKt.m6445contentEqualsFGO6Aew(((UShortArray) t2).m6199unboximpl(), ((UShortArray) t3).m6199unboximpl());
                    if (!m6445contentEqualsFGO6Aew) {
                        return false;
                    }
                } else if ((t2 instanceof UIntArray) && (t3 instanceof UIntArray)) {
                    m6446contentEqualsKJPZfPQ = UArraysKt___UArraysKt.m6446contentEqualsKJPZfPQ(((UIntArray) t2).m6014unboximpl(), ((UIntArray) t3).m6014unboximpl());
                    if (!m6446contentEqualsKJPZfPQ) {
                        return false;
                    }
                } else if ((t2 instanceof ULongArray) && (t3 instanceof ULongArray)) {
                    m6450contentEqualslec5QzE = UArraysKt___UArraysKt.m6450contentEqualslec5QzE(((ULongArray) t2).m6093unboximpl(), ((ULongArray) t3).m6093unboximpl());
                    if (!m6450contentEqualslec5QzE) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(t2, t3)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] tArr) {
        int coerceAtMost;
        if (tArr == null) {
            return "null";
        }
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(tArr.length, 429496729);
        StringBuilder sb = new StringBuilder((coerceAtMost * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        int lastIndex;
        String obj;
        String m6468contentToStringuLth9ew;
        String m6465contentToStringXUkPCBk;
        String m6466contentToStringd6D3K8;
        String m6462contentToString2csIQuQ;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            T t2 = tArr[i2];
            if (t2 == null) {
                obj = "null";
            } else if (t2 instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt((Object[]) t2, sb, list);
            } else {
                if (t2 instanceof byte[]) {
                    obj = Arrays.toString((byte[]) t2);
                } else if (t2 instanceof short[]) {
                    obj = Arrays.toString((short[]) t2);
                } else if (t2 instanceof int[]) {
                    obj = Arrays.toString((int[]) t2);
                } else if (t2 instanceof long[]) {
                    obj = Arrays.toString((long[]) t2);
                } else if (t2 instanceof float[]) {
                    obj = Arrays.toString((float[]) t2);
                } else if (t2 instanceof double[]) {
                    obj = Arrays.toString((double[]) t2);
                } else if (t2 instanceof char[]) {
                    obj = Arrays.toString((char[]) t2);
                } else if (t2 instanceof boolean[]) {
                    obj = Arrays.toString((boolean[]) t2);
                } else if (t2 instanceof UByteArray) {
                    m6462contentToString2csIQuQ = UArraysKt___UArraysKt.m6462contentToString2csIQuQ(((UByteArray) t2).m5935unboximpl());
                    obj = m6462contentToString2csIQuQ;
                } else if (t2 instanceof UShortArray) {
                    m6466contentToStringd6D3K8 = UArraysKt___UArraysKt.m6466contentToStringd6D3K8(((UShortArray) t2).m6199unboximpl());
                    obj = m6466contentToStringd6D3K8;
                } else if (t2 instanceof UIntArray) {
                    m6465contentToStringXUkPCBk = UArraysKt___UArraysKt.m6465contentToStringXUkPCBk(((UIntArray) t2).m6014unboximpl());
                    obj = m6465contentToStringXUkPCBk;
                } else if (t2 instanceof ULongArray) {
                    m6468contentToStringuLth9ew = UArraysKt___UArraysKt.m6468contentToStringuLth9ew(((ULongArray) t2).m6093unboximpl());
                    obj = m6468contentToStringuLth9ew;
                } else {
                    obj = t2.toString();
                }
                Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
            }
            sb.append(obj);
        }
        sb.append(']');
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        list.remove(lastIndex);
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i2 = 0;
        for (T[] tArr2 : tArr) {
            i2 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (T[] tArr3 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Object[] objArr, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (objArr.length == 0) {
            objArr = defaultValue.invoke();
        }
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if ((r2.length == 0) != false) goto L12;
     */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean isNullOrEmpty(java.lang.Object[] r2) {
        /*
            r0 = 0
            r3 = r0
            r0 = r2
            if (r0 == 0) goto L16
            r0 = r2
            int r0 = r0.length
            if (r0 != 0) goto L10
            r0 = 1
            r4 = r0
            goto L12
        L10:
            r0 = 0
            r4 = r0
        L12:
            r0 = r4
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            r3 = r0
        L18:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArraysKt__ArraysKt.isNullOrEmpty(java.lang.Object[]):boolean");
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
