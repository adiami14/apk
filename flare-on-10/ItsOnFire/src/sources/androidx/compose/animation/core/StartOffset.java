package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018��2\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005ø\u0001��¢\u0006\u0004\b\u0006\u0010\u0007B\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\tø\u0001��¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00058Fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n��\u0088\u0001\b\u0092\u0001\u00020\tø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/StartOffset.class */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ StartOffset m275boximpl(long j2) {
        return new StartOffset(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m276constructorimpl(int i2, int i3) {
        return m277constructorimpl(i2 * i3);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m277constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ long m278constructorimpl$default(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 2) != 0) {
            i3 = StartOffsetType.Companion.m294getDelayEo1U57Q();
        }
        return m276constructorimpl(i2, i3);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m279equalsimpl(long j2, Object obj) {
        return (obj instanceof StartOffset) && j2 == ((StartOffset) obj).m285unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m280equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getOffsetMillis-impl  reason: not valid java name */
    public static final int m281getOffsetMillisimpl(long j2) {
        return Math.abs((int) j2);
    }

    /* renamed from: getOffsetType-Eo1U57Q  reason: not valid java name */
    public static final int m282getOffsetTypeEo1U57Q(long j2) {
        int m294getDelayEo1U57Q;
        boolean z = j2 > 0;
        if (z) {
            m294getDelayEo1U57Q = StartOffsetType.Companion.m295getFastForwardEo1U57Q();
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        } else {
            m294getDelayEo1U57Q = StartOffsetType.Companion.m294getDelayEo1U57Q();
        }
        return m294getDelayEo1U57Q;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m283hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m284toStringimpl(long j2) {
        return "StartOffset(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m279equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m283hashCodeimpl(this.value);
    }

    public String toString() {
        return m284toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m285unboximpl() {
        return this.value;
    }
}
