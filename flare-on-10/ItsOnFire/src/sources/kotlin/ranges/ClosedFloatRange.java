package kotlin.ranges;

import androidx.appcompat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n��\b\u0002\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(FF)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Float;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/ranges/ClosedFloatRange.class */
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {
    private final float _endInclusive;
    private final float _start;

    public ClosedFloatRange(float f2, float f3) {
        this._start = f2;
        this._endInclusive = f3;
    }

    public boolean contains(float f2) {
        return f2 >= this._start && f2 <= this._endInclusive;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (((kotlin.ranges.ClosedFloatRange) r4).isEmpty() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof kotlin.ranges.ClosedFloatRange
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L60
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            r0 = r6
            r5 = r0
            r0 = r4
            kotlin.ranges.ClosedFloatRange r0 = (kotlin.ranges.ClosedFloatRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L62
        L1e:
            r0 = r3
            float r0 = r0._start
            r7 = r0
            r0 = r4
            kotlin.ranges.ClosedFloatRange r0 = (kotlin.ranges.ClosedFloatRange) r0
            r4 = r0
            r0 = r7
            r1 = r4
            float r1 = r1._start
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L39
            r0 = 1
            r8 = r0
            goto L3c
        L39:
            r0 = 0
            r8 = r0
        L3c:
            r0 = r8
            if (r0 == 0) goto L60
            r0 = r3
            float r0 = r0._endInclusive
            r1 = r4
            float r1 = r1._endInclusive
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            r0 = 1
            r8 = r0
            goto L56
        L53:
            r0 = 0
            r8 = r0
        L56:
            r0 = r8
            if (r0 == 0) goto L60
            r0 = r6
            r5 = r0
            goto L62
        L60:
            r0 = 0
            r5 = r0
        L62:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.ClosedFloatRange.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Float getEndInclusive() {
        return Float.valueOf(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    public int hashCode() {
        int hashCode;
        if (isEmpty()) {
            hashCode = -1;
        } else {
            hashCode = Float.valueOf(this._endInclusive).hashCode() + (Float.valueOf(this._start).hashCode() * 31);
        }
        return hashCode;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(float f2, float f3) {
        return f2 <= f3;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Float f2, Float f3) {
        return lessThanOrEquals(f2.floatValue(), f3.floatValue());
    }

    @NotNull
    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
