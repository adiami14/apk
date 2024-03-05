package kotlin;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010��\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001��¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002ø\u0001��¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002ø\u0001��¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\bø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "size", "", "constructor-impl", "(I)[J", "storage", "", "([J)[J", "getSize-impl", "([J)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-VKZWuLQ", "([JJ)Z", "containsAll", "elements", "containsAll-impl", "([JLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([JLjava/lang/Object;)Z", "get", FirebaseAnalytics.Param.INDEX, "get-s-VKNKU", "([JI)J", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([J)Z", "iterator", "", "iterator-impl", "([J)Ljava/util/Iterator;", "set", "", "value", "set-k8EXiF4", "([JIJ)V", "toString", "", "toString-impl", "([J)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: ItsOnFire.jar:kotlin/ULongArray.class */
public final class ULongArray implements Collection<ULong>, KMappedMarker {
    @NotNull
    private final long[] storage;

    @Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n��ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/ULongArray$Iterator;", "", "Lkotlin/ULong;", "array", "", "([J)V", FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/ULongArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator<ULong>, KMappedMarker {
        @NotNull
        private final long[] array;
        private int index;

        public Iterator(@NotNull long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ULong next() {
            return ULong.m6019boximpl(m6094nextsVKNKU());
        }

        /* renamed from: next-s-VKNKU  reason: not valid java name */
        public long m6094nextsVKNKU() {
            int i2 = this.index;
            long[] jArr = this.array;
            if (i2 < jArr.length) {
                this.index = i2 + 1;
                return ULong.m6025constructorimpl(jArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.index));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    private /* synthetic */ ULongArray(long[] jArr) {
        this.storage = jArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ULongArray m6077boximpl(long[] jArr) {
        return new ULongArray(jArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static long[] m6078constructorimpl(int i2) {
        return m6079constructorimpl(new long[i2]);
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static long[] m6079constructorimpl(@NotNull long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public static boolean m6080containsVKZWuLQ(long[] jArr, long j2) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(jArr, j2);
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[EDGE_INSN: B:18:0x0055->B:16:0x0055 ?: BREAK  , SYNTHETIC] */
    /* renamed from: containsAll-impl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6081containsAllimpl(long[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.ULong> r5) {
        /*
            r0 = r5
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            boolean r0 = r0.isEmpty()
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L18
        L13:
            r0 = 1
            r7 = r0
            goto L55
        L18:
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L20:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L13
            r0 = r8
            java.lang.Object r0 = r0.next()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof kotlin.ULong
            if (r0 == 0) goto L4d
            r0 = r4
            r1 = r5
            kotlin.ULong r1 = (kotlin.ULong) r1
            long r1 = r1.m6076unboximpl()
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 == 0) goto L4d
            r0 = 1
            r9 = r0
            goto L50
        L4d:
            r0 = 0
            r9 = r0
        L50:
            r0 = r9
            if (r0 != 0) goto L20
        L55:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULongArray.m6081containsAllimpl(long[], java.util.Collection):boolean");
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m6082equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual(jArr, ((ULongArray) obj).m6093unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m6083equalsimpl0(long[] jArr, long[] jArr2) {
        return Intrinsics.areEqual(jArr, jArr2);
    }

    /* renamed from: get-s-VKNKU  reason: not valid java name */
    public static final long m6084getsVKNKU(long[] jArr, int i2) {
        return ULong.m6025constructorimpl(jArr[i2]);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static int m6085getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m6086hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static boolean m6087isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    @NotNull
    /* renamed from: iterator-impl  reason: not valid java name */
    public static java.util.Iterator<ULong> m6088iteratorimpl(long[] jArr) {
        return new Iterator(jArr);
    }

    /* renamed from: set-k8EXiF4  reason: not valid java name */
    public static final void m6089setk8EXiF4(long[] jArr, int i2, long j2) {
        jArr[i2] = j2;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m6090toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ  reason: not valid java name */
    public boolean m6091addVKZWuLQ(long j2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m6092containsVKZWuLQ(((ULong) obj).m6076unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public boolean m6092containsVKZWuLQ(long j2) {
        return m6080containsVKZWuLQ(this.storage, j2);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m6081containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m6082equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize */
    public int size() {
        return m6085getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m6086hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m6087isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public java.util.Iterator<ULong> iterator() {
        return m6088iteratorimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public String toString() {
        return m6090toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long[] m6093unboximpl() {
        return this.storage;
    }
}
