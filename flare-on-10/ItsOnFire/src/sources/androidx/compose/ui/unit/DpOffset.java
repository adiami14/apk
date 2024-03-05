package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� %2\u00020\u0001:\u0001%B\u0014\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0010\u001a\u00020��2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020��2\u0006\u0010\u0015\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020��2\u0006\u0010\u0015\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0001¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR#\u0010\r\u001a\u00020\t8FX\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/DpOffset.class */
public final class DpOffset {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/DpOffset$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M  reason: not valid java name */
        public final long m4856getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M  reason: not valid java name */
        public final long m4857getZeroRKDOV3M() {
            return DpOffset.Zero;
        }
    }

    static {
        float f2 = 0;
        Zero = DpKt.m4806DpOffsetYgX7TsA(Dp.m4785constructorimpl(f2), Dp.m4785constructorimpl(f2));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m4806DpOffsetYgX7TsA(companion.m4805getUnspecifiedD9Ej5fM(), companion.m4805getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpOffset m4841boximpl(long j2) {
        return new DpOffset(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m4842constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-tPigGR8  reason: not valid java name */
    public static final long m4843copytPigGR8(long j2, float f2, float f3) {
        return DpKt.m4806DpOffsetYgX7TsA(f2, f3);
    }

    /* renamed from: copy-tPigGR8$default  reason: not valid java name */
    public static /* synthetic */ long m4844copytPigGR8$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m4847getXD9Ej5fM(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m4849getYD9Ej5fM(j2);
        }
        return m4843copytPigGR8(j2, f2, f3);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4845equalsimpl(long j2, Object obj) {
        return (obj instanceof DpOffset) && j2 == ((DpOffset) obj).m4855unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4846equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getX-D9Ej5fM  reason: not valid java name */
    public static final float m4847getXD9Ej5fM(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m4785constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m4848getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM  reason: not valid java name */
    public static final float m4849getYD9Ej5fM(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m4785constructorimpl(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m4850getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4851hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4  reason: not valid java name */
    public static final long m4852minusCBMgk4(long j2, long j3) {
        return DpKt.m4806DpOffsetYgX7TsA(Dp.m4785constructorimpl(m4847getXD9Ej5fM(j2) - m4847getXD9Ej5fM(j3)), Dp.m4785constructorimpl(m4849getYD9Ej5fM(j2) - m4849getYD9Ej5fM(j3)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4  reason: not valid java name */
    public static final long m4853plusCBMgk4(long j2, long j3) {
        return DpKt.m4806DpOffsetYgX7TsA(Dp.m4785constructorimpl(m4847getXD9Ej5fM(j2) + m4847getXD9Ej5fM(j3)), Dp.m4785constructorimpl(m4849getYD9Ej5fM(j2) + m4849getYD9Ej5fM(j3)));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4854toStringimpl(long j2) {
        String str;
        if (j2 != Companion.m4856getUnspecifiedRKDOV3M()) {
            str = '(' + ((Object) Dp.m4796toStringimpl(m4847getXD9Ej5fM(j2))) + ", " + ((Object) Dp.m4796toStringimpl(m4849getYD9Ej5fM(j2))) + ')';
        } else {
            str = "DpOffset.Unspecified";
        }
        return str;
    }

    public boolean equals(Object obj) {
        return m4845equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4851hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4854toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m4855unboximpl() {
        return this.packedValue;
    }
}
