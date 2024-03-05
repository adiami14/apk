package kotlin.ranges;

import androidx.appcompat.R;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018�� \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\"\b��\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001��¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0086\u0002ø\u0001��J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\b\u001a\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\n\u001a\u00020\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "J", "last", "getStep", "()J", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: ItsOnFire.jar:kotlin/ranges/ULongProgression.class */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    @Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001��¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/ranges/ULongProgression$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: fromClosedRange-7ftBX0g  reason: not valid java name */
        public final ULongProgression m7183fromClosedRange7ftBX0g(long j2, long j3, long j4) {
            return new ULongProgression(j2, j3, j4, null);
        }
    }

    private ULongProgression(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j2;
        this.last = UProgressionUtilKt.m7116getProgressionLastElement7ftBX0g(j2, j3, j4);
        this.step = j4;
    }

    public /* synthetic */ ULongProgression(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r5.step == r0.step) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof kotlin.ranges.ULongProgression
            if (r0 == 0) goto L49
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r6
            kotlin.ranges.ULongProgression r0 = (kotlin.ranges.ULongProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
        L18:
            r0 = r5
            long r0 = r0.first
            r7 = r0
            r0 = r6
            kotlin.ranges.ULongProgression r0 = (kotlin.ranges.ULongProgression) r0
            r6 = r0
            r0 = r7
            r1 = r6
            long r1 = r1.first
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r5
            long r0 = r0.last
            r1 = r6
            long r1 = r1.last
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r5
            long r0 = r0.step
            r1 = r6
            long r1 = r1.step
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
        L43:
            r0 = 1
            r9 = r0
            goto L4c
        L49:
            r0 = 0
            r9 = r0
        L4c:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.ULongProgression.equals(java.lang.Object):boolean");
    }

    /* renamed from: getFirst-s-VKNKU  reason: not valid java name */
    public final long m7181getFirstsVKNKU() {
        return this.first;
    }

    /* renamed from: getLast-s-VKNKU  reason: not valid java name */
    public final long m7182getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        int i2;
        if (isEmpty()) {
            i2 = -1;
        } else {
            long j2 = this.first;
            int m6025constructorimpl = (int) ULong.m6025constructorimpl(j2 ^ ULong.m6025constructorimpl(j2 >>> 32));
            long j3 = this.last;
            int m6025constructorimpl2 = (int) ULong.m6025constructorimpl(j3 ^ ULong.m6025constructorimpl(j3 >>> 32));
            long j4 = this.step;
            i2 = ((int) ((j4 >>> 32) ^ j4)) + (((m6025constructorimpl * 31) + m6025constructorimpl2) * 31);
        }
        return i2;
    }

    public boolean isEmpty() {
        long j2 = this.step;
        boolean z = true;
        int ulongCompare = UnsignedKt.ulongCompare(this.first, this.last);
        if (j2 <= 0 ? ulongCompare >= 0 : ulongCompare <= 0) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m6070toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) ULong.m6070toStringimpl(this.last));
            sb.append(" step ");
            j2 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m6070toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) ULong.m6070toStringimpl(this.last));
            sb.append(" step ");
            j2 = -this.step;
        }
        sb.append(j2);
        return sb.toString();
    }
}
