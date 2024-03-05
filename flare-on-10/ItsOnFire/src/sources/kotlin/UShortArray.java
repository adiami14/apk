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
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010��\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001��¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002ø\u0001��¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002ø\u0001��¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002ø\u0001��¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\bø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "size", "", "constructor-impl", "(I)[S", "storage", "", "([S)[S", "getSize-impl", "([S)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-xj2QHRw", "([SS)Z", "containsAll", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([SLjava/lang/Object;)Z", "get", FirebaseAnalytics.Param.INDEX, "get-Mh2AYeg", "([SI)S", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([S)Z", "iterator", "", "iterator-impl", "([S)Ljava/util/Iterator;", "set", "", "value", "set-01HTLdE", "([SIS)V", "toString", "", "toString-impl", "([S)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: ItsOnFire.jar:kotlin/UShortArray.class */
public final class UShortArray implements Collection<UShort>, KMappedMarker {
    @NotNull
    private final short[] storage;

    @Metadata(d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n��ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "array", "", "([S)V", FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "next-Mh2AYeg", "()S", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/UShortArray$Iterator.class */
    public static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {
        @NotNull
        private final short[] array;
        private int index;

        public Iterator(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.m6127boximpl(m6200nextMh2AYeg());
        }

        /* renamed from: next-Mh2AYeg  reason: not valid java name */
        public short m6200nextMh2AYeg() {
            int i2 = this.index;
            short[] sArr = this.array;
            if (i2 < sArr.length) {
                this.index = i2 + 1;
                return UShort.m6133constructorimpl(sArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.index));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    private /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UShortArray m6183boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static short[] m6184constructorimpl(int i2) {
        return m6185constructorimpl(new short[i2]);
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static short[] m6185constructorimpl(@NotNull short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: contains-xj2QHRw  reason: not valid java name */
    public static boolean m6186containsxj2QHRw(short[] sArr, short s2) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(sArr, s2);
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[EDGE_INSN: B:18:0x0055->B:16:0x0055 ?: BREAK  , SYNTHETIC] */
    /* renamed from: containsAll-impl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6187containsAllimpl(short[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.UShort> r4) {
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
            boolean r0 = r0 instanceof kotlin.UShort
            if (r0 == 0) goto L4d
            r0 = r3
            r1 = r7
            kotlin.UShort r1 = (kotlin.UShort) r1
            short r1 = r1.m6182unboximpl()
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UShortArray.m6187containsAllimpl(short[], java.util.Collection):boolean");
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m6188equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual(sArr, ((UShortArray) obj).m6199unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m6189equalsimpl0(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual(sArr, sArr2);
    }

    /* renamed from: get-Mh2AYeg  reason: not valid java name */
    public static final short m6190getMh2AYeg(short[] sArr, int i2) {
        return UShort.m6133constructorimpl(sArr[i2]);
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static int m6191getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m6192hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static boolean m6193isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    @NotNull
    /* renamed from: iterator-impl  reason: not valid java name */
    public static java.util.Iterator<UShort> m6194iteratorimpl(short[] sArr) {
        return new Iterator(sArr);
    }

    /* renamed from: set-01HTLdE  reason: not valid java name */
    public static final void m6195set01HTLdE(short[] sArr, int i2, short s2) {
        sArr[i2] = s2;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m6196toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-xj2QHRw  reason: not valid java name */
    public boolean m6197addxj2QHRw(short s2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m6198containsxj2QHRw(((UShort) obj).m6182unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw  reason: not valid java name */
    public boolean m6198containsxj2QHRw(short s2) {
        return m6186containsxj2QHRw(this.storage, s2);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m6187containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m6188equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize */
    public int size() {
        return m6191getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m6192hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m6193isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public java.util.Iterator<UShort> iterator() {
        return m6194iteratorimpl(this.storage);
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
        return m6196toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short[] m6199unboximpl() {
        return this.storage;
    }
}
