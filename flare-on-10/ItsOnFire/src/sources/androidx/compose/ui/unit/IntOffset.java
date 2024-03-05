package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018�� 32\u00020\u0001:\u00013B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020��2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\fJ\u001e\u0010#\u001a\u00020��2\u0006\u0010\u001e\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0002¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020��2\u0006\u0010\u001e\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0002¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020��2\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020��2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)I", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-iSbpLlY", "(JII)J", "div", "operand", "", "div-Bjo55l4", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "minus", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "rem", "rem-Bjo55l4", "(JI)J", "times", "times-Bjo55l4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-nOcc-ac", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/IntOffset.class */
public final class IntOffset {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/IntOffset$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-nOcc-ac  reason: not valid java name */
        public final long m4917getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntOffset m4898boximpl(long j2) {
        return new IntOffset(j2);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m4899component1impl(long j2) {
        return m4907getXimpl(j2);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m4900component2impl(long j2) {
        return m4908getYimpl(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m4901constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-iSbpLlY  reason: not valid java name */
    public static final long m4902copyiSbpLlY(long j2, int i2, int i3) {
        return IntOffsetKt.IntOffset(i2, i3);
    }

    /* renamed from: copy-iSbpLlY$default  reason: not valid java name */
    public static /* synthetic */ long m4903copyiSbpLlY$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = m4907getXimpl(j2);
        }
        if ((i4 & 2) != 0) {
            i3 = m4908getYimpl(j2);
        }
        return m4902copyiSbpLlY(j2, i2, i3);
    }

    @Stable
    /* renamed from: div-Bjo55l4  reason: not valid java name */
    public static final long m4904divBjo55l4(long j2, float f2) {
        int roundToInt;
        int roundToInt2;
        roundToInt = MathKt__MathJVMKt.roundToInt(m4907getXimpl(j2) / f2);
        roundToInt2 = MathKt__MathJVMKt.roundToInt(m4908getYimpl(j2) / f2);
        return IntOffsetKt.IntOffset(roundToInt, roundToInt2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4905equalsimpl(long j2, Object obj) {
        return (obj instanceof IntOffset) && j2 == ((IntOffset) obj).m4916unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4906equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final int m4907getXimpl(long j2) {
        return (int) (j2 >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final int m4908getYimpl(long j2) {
        return (int) (j2 & 4294967295L);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4909hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* renamed from: minus-qkQi6aY  reason: not valid java name */
    public static final long m4910minusqkQi6aY(long j2, long j3) {
        return IntOffsetKt.IntOffset(m4907getXimpl(j2) - m4907getXimpl(j3), m4908getYimpl(j2) - m4908getYimpl(j3));
    }

    @Stable
    /* renamed from: plus-qkQi6aY  reason: not valid java name */
    public static final long m4911plusqkQi6aY(long j2, long j3) {
        return IntOffsetKt.IntOffset(m4907getXimpl(j2) + m4907getXimpl(j3), m4908getYimpl(j2) + m4908getYimpl(j3));
    }

    @Stable
    /* renamed from: rem-Bjo55l4  reason: not valid java name */
    public static final long m4912remBjo55l4(long j2, int i2) {
        return IntOffsetKt.IntOffset(m4907getXimpl(j2) % i2, m4908getYimpl(j2) % i2);
    }

    @Stable
    /* renamed from: times-Bjo55l4  reason: not valid java name */
    public static final long m4913timesBjo55l4(long j2, float f2) {
        int roundToInt;
        int roundToInt2;
        roundToInt = MathKt__MathJVMKt.roundToInt(m4907getXimpl(j2) * f2);
        roundToInt2 = MathKt__MathJVMKt.roundToInt(m4908getYimpl(j2) * f2);
        return IntOffsetKt.IntOffset(roundToInt, roundToInt2);
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4914toStringimpl(long j2) {
        return '(' + m4907getXimpl(j2) + ", " + m4908getYimpl(j2) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac  reason: not valid java name */
    public static final long m4915unaryMinusnOccac(long j2) {
        return IntOffsetKt.IntOffset(-m4907getXimpl(j2), -m4908getYimpl(j2));
    }

    public boolean equals(Object obj) {
        return m4905equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4909hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4914toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m4916unboximpl() {
        return this.packedValue;
    }
}
