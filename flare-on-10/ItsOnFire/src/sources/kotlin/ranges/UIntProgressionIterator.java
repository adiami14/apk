package kotlin.ranges;

import androidx.appcompat.R;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001��¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0016\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001ø\u0001��¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n��R\u0016\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/ranges/UIntProgressionIterator.class */
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    private UIntProgressionIterator(int i2, int i3, int i4) {
        this.finalElement = i3;
        boolean z = true;
        int uintCompare = UnsignedKt.uintCompare(i2, i3);
        if (i4 <= 0 ? uintCompare < 0 : uintCompare > 0) {
            z = false;
        }
        this.hasNext = z;
        this.step = UInt.m5946constructorimpl(i4);
        this.next = this.hasNext ? i2 : i3;
    }

    public /* synthetic */ UIntProgressionIterator(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m5940boximpl(m7175nextpVg5ArA());
    }

    /* renamed from: next-pVg5ArA  reason: not valid java name */
    public int m7175nextpVg5ArA() {
        int i2 = this.next;
        if (i2 != this.finalElement) {
            this.next = UInt.m5946constructorimpl(this.step + i2);
        } else if (!this.hasNext) {
            throw new NoSuchElementException();
        } else {
            this.hasNext = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
