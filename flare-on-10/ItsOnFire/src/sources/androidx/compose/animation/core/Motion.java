package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018��2\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000e\u001a\u00020��2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "value", "", "getValue-impl", "(J)F", "velocity", "getVelocity-impl", "copy", "copy-XB9eQnU", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/animation/core/Motion.class */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Motion m256boximpl(long j2) {
        return new Motion(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m257constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-XB9eQnU  reason: not valid java name */
    public static final long m258copyXB9eQnU(long j2, float f2, float f3) {
        return SpringSimulationKt.Motion(f2, f3);
    }

    /* renamed from: copy-XB9eQnU$default  reason: not valid java name */
    public static /* synthetic */ long m259copyXB9eQnU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m262getValueimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m263getVelocityimpl(j2);
        }
        return m258copyXB9eQnU(j2, f2, f3);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m260equalsimpl(long j2, Object obj) {
        return (obj instanceof Motion) && j2 == ((Motion) obj).m266unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m261equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m262getValueimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getVelocity-impl  reason: not valid java name */
    public static final float m263getVelocityimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m264hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m265toStringimpl(long j2) {
        return "Motion(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m260equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m264hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m265toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m266unboximpl() {
        return this.packedValue;
    }
}
