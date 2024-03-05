package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n��\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018�� \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020��2\u0006\u0010\u000b\u001a\u00020��J\u000e\u0010\f\u001a\u00020��2\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020��2\u0006\u0010\u000b\u001a\u00020��J\u000e\u0010\u0015\u001a\u00020��2\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "andNot", "bits", "clear", "bit", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/SnapshotIdSet.class */
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    @Nullable
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/snapshots/SnapshotIdSet$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    private SnapshotIdSet(long j2, long j3, int i2, int[] iArr) {
        this.upperSet = j2;
        this.lowerSet = j3;
        this.lowerBound = i2;
        this.belowBound = iArr;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i2 = bits.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                snapshotIdSet = new SnapshotIdSet(this.upperSet & bits.upperSet, this.lowerSet & bits.lowerSet, i3, iArr2);
                return snapshotIdSet;
            }
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (true) {
            snapshotIdSet = snapshotIdSet3;
            if (!it.hasNext()) {
                break;
            }
            snapshotIdSet3 = snapshotIdSet.clear(it.next().intValue());
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet clear(int i2) {
        int[] iArr;
        int binarySearch;
        int i3 = this.lowerBound;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.lowerSet;
            if ((j3 & j2) != 0) {
                return new SnapshotIdSet(this.upperSet, j3 & j2, i3, this.belowBound);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.upperSet;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet(j4 & j5, this.lowerSet, i3, this.belowBound);
            }
        } else if (i4 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i2)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[length];
            if (binarySearch > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < length) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, binarySearch, binarySearch + 1, length + 1);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final boolean get(int i2) {
        int i3 = i2 - this.lowerBound;
        boolean z = true;
        if (i3 >= 0 && i3 < 64) {
            if ((this.lowerSet & (1 << i3)) == 0) {
                z = false;
            }
            return z;
        } else if (i3 >= 64 && i3 < 128) {
            return (this.upperSet & (1 << (i3 - 64))) != 0;
        } else if (i3 > 0) {
            return false;
        } else {
            int[] iArr = this.belowBound;
            return iArr == null ? false : SnapshotIdSetKt.binarySearch(iArr, i2) >= 0;
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        Sequence sequence;
        sequence = SequencesKt__SequenceBuilderKt.sequence(new SnapshotIdSet$iterator$1(this, null));
        return sequence.iterator();
    }

    public final int lowest(int i2) {
        int lowestBitOf;
        int lowestBitOf2;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j2 = this.lowerSet;
        if (j2 != 0) {
            int i3 = this.lowerBound;
            lowestBitOf2 = SnapshotIdSetKt.lowestBitOf(j2);
            return i3 + lowestBitOf2;
        }
        long j3 = this.upperSet;
        if (j3 != 0) {
            lowestBitOf = SnapshotIdSetKt.lowestBitOf(j3);
            return this.lowerBound + 64 + lowestBitOf;
        }
        return i2;
    }

    @NotNull
    public final SnapshotIdSet or(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        int i2 = bits.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                bits = new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i3, iArr2);
                return bits;
            }
        }
        if (this.belowBound != null) {
            Iterator<Integer> it = bits.iterator();
            SnapshotIdSet snapshotIdSet2 = this;
            while (true) {
                bits = snapshotIdSet2;
                if (!it.hasNext()) {
                    break;
                }
                snapshotIdSet2 = bits.set(it.next().intValue());
            }
        } else {
            Iterator<Integer> it2 = iterator();
            while (it2.hasNext()) {
                bits = bits.set(it2.next().intValue());
            }
        }
        return bits;
    }

    @NotNull
    public final SnapshotIdSet set(int i2) {
        int i3;
        ArrayList arrayList;
        long j2;
        int[] intArray;
        int[] iArr;
        int i4 = this.lowerBound;
        int i5 = i2 - i4;
        long j3 = 0;
        if (i5 >= 0 && i5 < 64) {
            long j4 = 1 << i5;
            long j5 = this.lowerSet;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(this.upperSet, j5 | j4, i4, this.belowBound);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j6 = 1 << (i5 - 64);
            long j7 = this.upperSet;
            if ((j7 & j6) == 0) {
                return new SnapshotIdSet(j6 | j7, this.lowerSet, i4, this.belowBound);
            }
        } else if (i5 < 128) {
            int[] iArr2 = this.belowBound;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i4, new int[]{i2});
            }
            int binarySearch = SnapshotIdSetKt.binarySearch(iArr2, i2);
            if (binarySearch < 0) {
                int i6 = -(binarySearch + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr3, 0, 0, i6);
                ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr3, i6 + 1, i6, length - 1);
                iArr3[i6] = i2;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr3);
            }
        } else if (!get(i2)) {
            long j8 = this.upperSet;
            long j9 = this.lowerSet;
            int i7 = this.lowerBound;
            int i8 = ((i2 + 1) / 64) * 64;
            ArrayList arrayList2 = null;
            while (true) {
                i3 = i7;
                arrayList = arrayList2;
                j2 = j9;
                if (i7 >= i8) {
                    break;
                }
                if (j9 != j3) {
                    ArrayList arrayList3 = arrayList2;
                    if (arrayList2 == null) {
                        ArrayList arrayList4 = new ArrayList();
                        int[] iArr4 = this.belowBound;
                        if (iArr4 != null) {
                            int length2 = iArr4.length;
                            int i9 = 0;
                            while (true) {
                                arrayList3 = arrayList4;
                                if (i9 >= length2) {
                                    break;
                                }
                                i9++;
                                arrayList4.add(Integer.valueOf(iArr4[i9]));
                            }
                        } else {
                            arrayList3 = arrayList4;
                        }
                    }
                    for (int i10 = 0; i10 < 64; i10++) {
                        if (((1 << i10) & j9) != 0) {
                            arrayList3.add(Integer.valueOf(i10 + i7));
                        }
                    }
                    j3 = 0;
                    arrayList2 = arrayList3;
                }
                if (j8 == j3) {
                    i3 = i8;
                    arrayList = arrayList2;
                    j2 = j3;
                    break;
                }
                i7 += 64;
                j9 = j8;
                j8 = j3;
            }
            if (arrayList == null) {
                iArr = null;
            } else {
                intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
                iArr = intArray;
            }
            if (iArr == null) {
                iArr = this.belowBound;
            }
            return new SnapshotIdSet(j8, j2, i3, iArr).set(i2);
        }
        return this;
    }

    @NotNull
    public String toString() {
        int collectionSizeOrDefault;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
