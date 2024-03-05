package kotlin.ranges;

import androidx.appcompat.R;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018�� \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001��¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002ø\u0001��¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "start", "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-pVg5ArA", "()I", "getStart-pVg5ArA", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: ItsOnFire.jar:kotlin/ranges/UIntRange.class */
public final class UIntRange extends UIntProgression implements ClosedRange<UInt> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final UIntRange EMPTY = new UIntRange(-1, 0, null);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/ranges/UIntRange$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UIntRange getEMPTY() {
            return UIntRange.EMPTY;
        }
    }

    private UIntRange(int i2, int i3) {
        super(i2, i3, 1, null);
    }

    public /* synthetic */ UIntRange(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(UInt uInt) {
        return m7177containsWZ4Q5Ns(uInt.m5997unboximpl());
    }

    /* renamed from: contains-WZ4Q5Ns  reason: not valid java name */
    public boolean m7177containsWZ4Q5Ns(int i2) {
        return UnsignedKt.uintCompare(m7172getFirstpVg5ArA(), i2) <= 0 && UnsignedKt.uintCompare(i2, m7173getLastpVg5ArA()) <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (m7173getLastpVg5ArA() == r0.m7173getLastpVg5ArA()) goto L7;
     */
    @Override // kotlin.ranges.UIntProgression
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof kotlin.ranges.UIntRange
            if (r0 == 0) goto L3a
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            kotlin.ranges.UIntRange r0 = (kotlin.ranges.UIntRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
        L18:
            r0 = r3
            int r0 = r0.m7172getFirstpVg5ArA()
            r5 = r0
            r0 = r4
            kotlin.ranges.UIntRange r0 = (kotlin.ranges.UIntRange) r0
            r4 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.m7172getFirstpVg5ArA()
            if (r0 != r1) goto L3a
            r0 = r3
            int r0 = r0.m7173getLastpVg5ArA()
            r1 = r4
            int r1 = r1.m7173getLastpVg5ArA()
            if (r0 != r1) goto L3a
        L35:
            r0 = 1
            r6 = r0
            goto L3c
        L3a:
            r0 = 0
            r6 = r0
        L3c:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntRange.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ UInt getEndInclusive() {
        return UInt.m5940boximpl(m7178getEndInclusivepVg5ArA());
    }

    /* renamed from: getEndInclusive-pVg5ArA  reason: not valid java name */
    public int m7178getEndInclusivepVg5ArA() {
        return m7173getLastpVg5ArA();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ UInt getStart() {
        return UInt.m5940boximpl(m7179getStartpVg5ArA());
    }

    /* renamed from: getStart-pVg5ArA  reason: not valid java name */
    public int m7179getStartpVg5ArA() {
        return m7172getFirstpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression
    public int hashCode() {
        int m7173getLastpVg5ArA;
        if (isEmpty()) {
            m7173getLastpVg5ArA = -1;
        } else {
            m7173getLastpVg5ArA = m7173getLastpVg5ArA() + (m7172getFirstpVg5ArA() * 31);
        }
        return m7173getLastpVg5ArA;
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return UnsignedKt.uintCompare(m7172getFirstpVg5ArA(), m7173getLastpVg5ArA()) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    @NotNull
    public String toString() {
        return ((Object) UInt.m5991toStringimpl(m7172getFirstpVg5ArA())) + ".." + ((Object) UInt.m5991toStringimpl(m7173getLastpVg5ArA()));
    }
}
