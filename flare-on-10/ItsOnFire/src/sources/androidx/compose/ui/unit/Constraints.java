package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018�� 02\u00020\u0001:\u00010B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010#\u001a\u00020��2\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\tJ\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038��X\u0081\u0004¢\u0006\b\n��\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/Constraints.class */
public final class Constraints {
    private static final long FocusMask = 3;
    public static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxFocusBits = 18;
    private static final long MaxFocusHeight = 3;
    private static final long MaxFocusWidth = 1;
    private static final int MaxNonFocusBits = 13;
    private static final int MinFocusBits = 16;
    private static final long MinFocusHeight = 2;
    private static final int MinFocusMask = 65535;
    private static final long MinFocusWidth = 0;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;
    private final long value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusMask = 8191;
    @NotNull
    private static final int[] WidthMask = {65535, MaxFocusMask, 32767, MaxNonFocusMask};
    @NotNull
    private static final int[] HeightMask = {32767, MaxNonFocusMask, 65535, MaxFocusMask};

    @Metadata(d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH��ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\bH\u0007ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n��R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "FocusMask", "", "HeightMask", "", "Infinity", "", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "bitsNeedForSize", "size", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/Constraints$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int bitsNeedForSize(int i2) {
            int i3;
            if (i2 < Constraints.MaxNonFocusMask) {
                i3 = 13;
            } else if (i2 < 32767) {
                i3 = 15;
            } else if (i2 < 65535) {
                i3 = 16;
            } else if (i2 >= Constraints.MaxFocusMask) {
                throw new IllegalArgumentException("Can't represent a size of " + i2 + " in Constraints");
            } else {
                i3 = 18;
            }
            return i3;
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release  reason: not valid java name */
        public final long m4759createConstraintsZbe2FdA$ui_unit_release(int i2, int i3, int i4, int i5) {
            long j2;
            int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
            int bitsNeedForSize = bitsNeedForSize(i6);
            int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
            int bitsNeedForSize2 = bitsNeedForSize(i7);
            if (bitsNeedForSize + bitsNeedForSize2 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i7 + " and height of " + i6 + " in Constraints");
            }
            if (bitsNeedForSize2 == 13) {
                j2 = 3;
            } else if (bitsNeedForSize2 == 18) {
                j2 = 1;
            } else if (bitsNeedForSize2 == 15) {
                j2 = 2;
            } else if (bitsNeedForSize2 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            } else {
                j2 = 0;
            }
            int i8 = i3 == Integer.MAX_VALUE ? 0 : i3 + 1;
            int i9 = i5 == Integer.MAX_VALUE ? 0 : i5 + 1;
            int i10 = Constraints.MinHeightOffsets[(int) j2];
            return Constraints.m4741constructorimpl((i8 << 33) | j2 | (i2 << Constraints.MinFocusHeight) | (i4 << i10) | (i9 << (i10 + 31)));
        }

        @Stable
        /* renamed from: fixed-JhjzzOo  reason: not valid java name */
        public final long m4760fixedJhjzzOo(int i2, int i3) {
            if (i2 >= 0 && i3 >= 0) {
                return m4759createConstraintsZbe2FdA$ui_unit_release(i2, i2, i3, i3);
            }
            throw new IllegalArgumentException(("width(" + i2 + ") and height(" + i3 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s  reason: not valid java name */
        public final long m4761fixedHeightOenEA2s(int i2) {
            if (i2 >= 0) {
                return m4759createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i2, i2);
            }
            throw new IllegalArgumentException(("height(" + i2 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s  reason: not valid java name */
        public final long m4762fixedWidthOenEA2s(int i2) {
            if (i2 >= 0) {
                return m4759createConstraintsZbe2FdA$ui_unit_release(i2, i2, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i2 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ Constraints(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Constraints m4740boximpl(long j2) {
        return new Constraints(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m4741constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-Zbe2FdA  reason: not valid java name */
    public static final long m4742copyZbe2FdA(long j2, int i2, int i3, int i4, int i5) {
        if (!(i4 >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(("minHeight(" + i4 + ") and minWidth(" + i2 + ") must be >= 0").toString());
        }
        if (!(i3 >= i2 || i3 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i3 + ") must be >= minWidth(" + i2 + ')').toString());
        }
        boolean z = true;
        if (i5 < i4) {
            z = i5 == Integer.MAX_VALUE;
        }
        if (z) {
            return Companion.m4759createConstraintsZbe2FdA$ui_unit_release(i2, i3, i4, i5);
        }
        throw new IllegalArgumentException(("maxHeight(" + i5 + ") must be >= minHeight(" + i4 + ')').toString());
    }

    /* renamed from: copy-Zbe2FdA$default  reason: not valid java name */
    public static /* synthetic */ long m4743copyZbe2FdA$default(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = m4754getMinWidthimpl(j2);
        }
        if ((i6 & 2) != 0) {
            i3 = m4752getMaxWidthimpl(j2);
        }
        if ((i6 & 4) != 0) {
            i4 = m4753getMinHeightimpl(j2);
        }
        if ((i6 & 8) != 0) {
            i5 = m4751getMaxHeightimpl(j2);
        }
        return m4742copyZbe2FdA(j2, i2, i3, i4, i5);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4744equalsimpl(long j2, Object obj) {
        return (obj instanceof Constraints) && j2 == ((Constraints) obj).m4758unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4745equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getFocusIndex-impl  reason: not valid java name */
    private static final int m4746getFocusIndeximpl(long j2) {
        return (int) (j2 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl  reason: not valid java name */
    public static final boolean m4747getHasBoundedHeightimpl(long j2) {
        int m4746getFocusIndeximpl = m4746getFocusIndeximpl(j2);
        return (((int) (j2 >> (MinHeightOffsets[m4746getFocusIndeximpl] + 31))) & HeightMask[m4746getFocusIndeximpl]) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl  reason: not valid java name */
    public static final boolean m4748getHasBoundedWidthimpl(long j2) {
        return (((int) (j2 >> 33)) & WidthMask[m4746getFocusIndeximpl(j2)]) != 0;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl  reason: not valid java name */
    public static final boolean m4749getHasFixedHeightimpl(long j2) {
        return m4751getMaxHeightimpl(j2) == m4753getMinHeightimpl(j2);
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl  reason: not valid java name */
    public static final boolean m4750getHasFixedWidthimpl(long j2) {
        return m4752getMaxWidthimpl(j2) == m4754getMinWidthimpl(j2);
    }

    /* renamed from: getMaxHeight-impl  reason: not valid java name */
    public static final int m4751getMaxHeightimpl(long j2) {
        int m4746getFocusIndeximpl = m4746getFocusIndeximpl(j2);
        int i2 = ((int) (j2 >> (MinHeightOffsets[m4746getFocusIndeximpl] + 31))) & HeightMask[m4746getFocusIndeximpl];
        return i2 == 0 ? Integer.MAX_VALUE : i2 - 1;
    }

    /* renamed from: getMaxWidth-impl  reason: not valid java name */
    public static final int m4752getMaxWidthimpl(long j2) {
        int i2 = ((int) (j2 >> 33)) & WidthMask[m4746getFocusIndeximpl(j2)];
        return i2 == 0 ? Integer.MAX_VALUE : i2 - 1;
    }

    /* renamed from: getMinHeight-impl  reason: not valid java name */
    public static final int m4753getMinHeightimpl(long j2) {
        int m4746getFocusIndeximpl = m4746getFocusIndeximpl(j2);
        return ((int) (j2 >> MinHeightOffsets[m4746getFocusIndeximpl])) & HeightMask[m4746getFocusIndeximpl];
    }

    /* renamed from: getMinWidth-impl  reason: not valid java name */
    public static final int m4754getMinWidthimpl(long j2) {
        return ((int) (j2 >> MinFocusHeight)) & WidthMask[m4746getFocusIndeximpl(j2)];
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4755hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl  reason: not valid java name */
    public static final boolean m4756isZeroimpl(long j2) {
        return m4752getMaxWidthimpl(j2) == 0 || m4751getMaxHeightimpl(j2) == 0;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4757toStringimpl(long j2) {
        int m4752getMaxWidthimpl = m4752getMaxWidthimpl(j2);
        String valueOf = m4752getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m4752getMaxWidthimpl);
        int m4751getMaxHeightimpl = m4751getMaxHeightimpl(j2);
        String valueOf2 = m4751getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m4751getMaxHeightimpl) : "Infinity";
        return "Constraints(minWidth = " + m4754getMinWidthimpl(j2) + ", maxWidth = " + valueOf + ", minHeight = " + m4753getMinHeightimpl(j2) + ", maxHeight = " + valueOf2 + ')';
    }

    public boolean equals(Object obj) {
        return m4744equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4755hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m4757toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m4758unboximpl() {
        return this.value;
    }
}
