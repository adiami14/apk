package kotlin.ranges;

import androidx.appcompat.R;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018�� \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001��¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002ø\u0001��¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004ø\u0001��ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-s-VKNKU", "()J", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: ItsOnFire.jar:kotlin/ranges/ULongRange.class */
public final class ULongRange extends ULongProgression implements ClosedRange<ULong> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ULongRange EMPTY = new ULongRange(-1, 0, null);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/ranges/ULongRange$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ULongRange getEMPTY() {
            return ULongRange.EMPTY;
        }
    }

    private ULongRange(long j2, long j3) {
        super(j2, j3, 1L, null);
    }

    public /* synthetic */ ULongRange(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(ULong uLong) {
        return m7186containsVKZWuLQ(uLong.m6076unboximpl());
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public boolean m7186containsVKZWuLQ(long j2) {
        return UnsignedKt.ulongCompare(m7181getFirstsVKNKU(), j2) <= 0 && UnsignedKt.ulongCompare(j2, m7182getLastsVKNKU()) <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (m7182getLastsVKNKU() == r0.m7182getLastsVKNKU()) goto L7;
     */
    @Override // kotlin.ranges.ULongProgression
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof kotlin.ranges.ULongRange
            if (r0 == 0) goto L3d
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r6
            kotlin.ranges.ULongRange r0 = (kotlin.ranges.ULongRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
        L18:
            r0 = r5
            long r0 = r0.m7181getFirstsVKNKU()
            r7 = r0
            r0 = r6
            kotlin.ranges.ULongRange r0 = (kotlin.ranges.ULongRange) r0
            r6 = r0
            r0 = r7
            r1 = r6
            long r1 = r1.m7181getFirstsVKNKU()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            r0 = r5
            long r0 = r0.m7182getLastsVKNKU()
            r1 = r6
            long r1 = r1.m7182getLastsVKNKU()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
        L37:
            r0 = 1
            r9 = r0
            goto L40
        L3d:
            r0 = 0
            r9 = r0
        L40:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.ULongRange.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ ULong getEndInclusive() {
        return ULong.m6019boximpl(m7187getEndInclusivesVKNKU());
    }

    /* renamed from: getEndInclusive-s-VKNKU  reason: not valid java name */
    public long m7187getEndInclusivesVKNKU() {
        return m7182getLastsVKNKU();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ ULong getStart() {
        return ULong.m6019boximpl(m7188getStartsVKNKU());
    }

    /* renamed from: getStart-s-VKNKU  reason: not valid java name */
    public long m7188getStartsVKNKU() {
        return m7181getFirstsVKNKU();
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        int m6025constructorimpl;
        if (isEmpty()) {
            m6025constructorimpl = -1;
        } else {
            m6025constructorimpl = ((int) ULong.m6025constructorimpl(m7182getLastsVKNKU() ^ ULong.m6025constructorimpl(m7182getLastsVKNKU() >>> 32))) + (((int) ULong.m6025constructorimpl(m7181getFirstsVKNKU() ^ ULong.m6025constructorimpl(m7181getFirstsVKNKU() >>> 32))) * 31);
        }
        return m6025constructorimpl;
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return UnsignedKt.ulongCompare(m7181getFirstsVKNKU(), m7182getLastsVKNKU()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    @NotNull
    public String toString() {
        return ((Object) ULong.m6070toStringimpl(m7181getFirstsVKNKU())) + ".." + ((Object) ULong.m6070toStringimpl(m7182getLastsVKNKU()));
    }
}
