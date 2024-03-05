package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Immutable
@Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n��\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010��\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018�� &2\b\u0012\u0004\u0012\u00020��0\u0001:\u0001&B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001��¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020��H\u0097\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\r\u001a\u00020��2\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\r\u001a\u00020��2\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020��2\u0006\u0010\n\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ\u001e\u0010\u001c\u001a\u00020��2\u0006\u0010\n\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u000fJ!\u0010\u001e\u001a\u00020��2\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u000fJ!\u0010\u001e\u001a\u00020��2\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020��H\u0087\nø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/Dp.class */
public final class Dp implements Comparable<Dp> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m4785constructorimpl(0.0f);
    private static final float Infinity = m4785constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m4785constructorimpl(Float.NaN);
    private final float value;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/unit/Dp$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m4800getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m4801getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations  reason: not valid java name */
        public static /* synthetic */ void m4802getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM  reason: not valid java name */
        public final float m4803getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM  reason: not valid java name */
        public final float m4804getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM  reason: not valid java name */
        public final float m4805getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }
    }

    private /* synthetic */ Dp(float f2) {
        this.value = f2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Dp m4783boximpl(float f2) {
        return new Dp(f2);
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public static int m4784compareTo0680j_4(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m4785constructorimpl(float f2) {
        return f2;
    }

    @Stable
    /* renamed from: div-0680j_4  reason: not valid java name */
    public static final float m4786div0680j_4(float f2, float f3) {
        return f2 / f3;
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m4787divu2uoSUM(float f2, float f3) {
        return m4785constructorimpl(f2 / f3);
    }

    @Stable
    /* renamed from: div-u2uoSUM  reason: not valid java name */
    public static final float m4788divu2uoSUM(float f2, int i2) {
        return m4785constructorimpl(f2 / i2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4789equalsimpl(float f2, Object obj) {
        return (obj instanceof Dp) && Intrinsics.areEqual((Object) Float.valueOf(f2), (Object) Float.valueOf(((Dp) obj).m4799unboximpl()));
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4790equalsimpl0(float f2, float f3) {
        return Intrinsics.areEqual((Object) Float.valueOf(f2), (Object) Float.valueOf(f3));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4791hashCodeimpl(float f2) {
        return Float.hashCode(f2);
    }

    @Stable
    /* renamed from: minus-5rwHm24  reason: not valid java name */
    public static final float m4792minus5rwHm24(float f2, float f3) {
        return m4785constructorimpl(f2 - f3);
    }

    @Stable
    /* renamed from: plus-5rwHm24  reason: not valid java name */
    public static final float m4793plus5rwHm24(float f2, float f3) {
        return m4785constructorimpl(f2 + f3);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m4794timesu2uoSUM(float f2, float f3) {
        return m4785constructorimpl(f2 * f3);
    }

    @Stable
    /* renamed from: times-u2uoSUM  reason: not valid java name */
    public static final float m4795timesu2uoSUM(float f2, int i2) {
        return m4785constructorimpl(f2 * i2);
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4796toStringimpl(float f2) {
        String str;
        if (Float.isNaN(f2)) {
            str = "Dp.Unspecified";
        } else {
            str = f2 + ".dp";
        }
        return str;
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM  reason: not valid java name */
    public static final float m4797unaryMinusD9Ej5fM(float f2) {
        return m4785constructorimpl(-f2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m4798compareTo0680j_4(dp.m4799unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public int m4798compareTo0680j_4(float f2) {
        return m4784compareTo0680j_4(this.value, f2);
    }

    public boolean equals(Object obj) {
        return m4789equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4791hashCodeimpl(this.value);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4796toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m4799unboximpl() {
        return this.value;
    }
}
