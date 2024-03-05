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
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010��\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001��¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002ø\u0001��¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002ø\u0001��¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\bø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "size", "", "constructor-impl", "(I)[I", "storage", "", "([I)[I", "getSize-impl", "([I)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-WZ4Q5Ns", "([II)Z", "containsAll", "elements", "containsAll-impl", "([ILjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "get", FirebaseAnalytics.Param.INDEX, "get-pVg5ArA", "([II)I", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([I)Z", "iterator", "", "iterator-impl", "([I)Ljava/util/Iterator;", "set", "", "value", "set-VXSXFK8", "([III)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: ItsOnFire.jar:kotlin/UIntArray.class */
public final class UIntArray implements Collection<UInt>, KMappedMarker {
    @NotNull
    private final int[] storage;

    @Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n��ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/UIntArray$Iterator;", "", "Lkotlin/UInt;", "array", "", "([I)V", FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/UIntArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator<UInt>, KMappedMarker {
        @NotNull
        private final int[] array;
        private int index;

        public Iterator(@NotNull int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UInt next() {
            return UInt.m5940boximpl(m6015nextpVg5ArA());
        }

        /* renamed from: next-pVg5ArA  reason: not valid java name */
        public int m6015nextpVg5ArA() {
            int i2 = this.index;
            int[] iArr = this.array;
            if (i2 < iArr.length) {
                this.index = i2 + 1;
                return UInt.m5946constructorimpl(iArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.index));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    private /* synthetic */ UIntArray(int[] iArr) {
        this.storage = iArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UIntArray m5998boximpl(int[] iArr) {
        return new UIntArray(iArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m5999constructorimpl(int i2) {
        return m6000constructorimpl(new int[i2]);
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m6000constructorimpl(@NotNull int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-WZ4Q5Ns  reason: not valid java name */
    public static boolean m6001containsWZ4Q5Ns(int[] iArr, int i2) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(iArr, i2);
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[EDGE_INSN: B:18:0x0055->B:16:0x0055 ?: BREAK  , SYNTHETIC] */
    /* renamed from: containsAll-impl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6002containsAllimpl(int[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.UInt> r4) {
        /*
            r0 = r4
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            boolean r0 = r0.isEmpty()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L18
        L13:
            r0 = 1
            r6 = r0
            goto L55
        L18:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        L1f:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L13
            r0 = r4
            java.lang.Object r0 = r0.next()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof kotlin.UInt
            if (r0 == 0) goto L4d
            r0 = r3
            r1 = r7
            kotlin.UInt r1 = (kotlin.UInt) r1
            int r1 = r1.m5997unboximpl()
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 == 0) goto L4d
            r0 = 1
            r8 = r0
            goto L50
        L4d:
            r0 = 0
            r8 = r0
        L50:
            r0 = r8
            if (r0 != 0) goto L1f
        L55:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UIntArray.m6002containsAllimpl(int[], java.util.Collection):boolean");
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m6003equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.areEqual(iArr, ((UIntArray) obj).m6014unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m6004equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: get-pVg5ArA  reason: not valid java name */
    public static final int m6005getpVg5ArA(int[] iArr, int i2) {
        return UInt.m5946constructorimpl(iArr[i2]);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static int m6006getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m6007hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static boolean m6008isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    @NotNull
    /* renamed from: iterator-impl  reason: not valid java name */
    public static java.util.Iterator<UInt> m6009iteratorimpl(int[] iArr) {
        return new Iterator(iArr);
    }

    /* renamed from: set-VXSXFK8  reason: not valid java name */
    public static final void m6010setVXSXFK8(int[] iArr, int i2, int i3) {
        iArr[i2] = i3;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m6011toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-WZ4Q5Ns  reason: not valid java name */
    public boolean m6012addWZ4Q5Ns(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m6013containsWZ4Q5Ns(((UInt) obj).m5997unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns  reason: not valid java name */
    public boolean m6013containsWZ4Q5Ns(int i2) {
        return m6001containsWZ4Q5Ns(this.storage, i2);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m6002containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m6003equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize */
    public int size() {
        return m6006getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m6007hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m6008isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public java.util.Iterator<UInt> iterator() {
        return m6009iteratorimpl(this.storage);
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
        return m6011toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int[] m6014unboximpl() {
        return this.storage;
    }
}
