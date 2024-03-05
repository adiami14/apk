package kotlin.time;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018�� \u00042\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalTime
/* loaded from: ItsOnFire.jar:kotlin/time/TimeSource.class */
public interface TimeSource {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/time/TimeSource$Companion.class */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018��2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/time/TimeSource$Monotonic.class */
    public static final class Monotonic implements TimeSource {
        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.7")
        @Metadata(d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018��2\u00020\u0001B\u0018\b��\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001��¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020��2\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002ø\u0001��¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020��2\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002ø\u0001��¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n��\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001��\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006#"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/TimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "", "hashCode-impl", "(J)I", "minus", "duration", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @JvmInline
        @ExperimentalTime
        /* loaded from: ItsOnFire.jar:kotlin/time/TimeSource$Monotonic$ValueTimeMark.class */
        public static final class ValueTimeMark implements TimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j2) {
                this.reading = j2;
            }

            /* renamed from: box-impl  reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m7445boximpl(long j2) {
                return new ValueTimeMark(j2);
            }

            /* renamed from: constructor-impl  reason: not valid java name */
            public static long m7446constructorimpl(long j2) {
                return j2;
            }

            /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
            public static long m7447elapsedNowUwyO8pc(long j2) {
                return MonotonicTimeSource.INSTANCE.m7435elapsedFrom6eNON_k(j2);
            }

            /* renamed from: equals-impl  reason: not valid java name */
            public static boolean m7448equalsimpl(long j2, Object obj) {
                return (obj instanceof ValueTimeMark) && j2 == ((ValueTimeMark) obj).m7458unboximpl();
            }

            /* renamed from: equals-impl0  reason: not valid java name */
            public static final boolean m7449equalsimpl0(long j2, long j3) {
                return j2 == j3;
            }

            /* renamed from: hasNotPassedNow-impl  reason: not valid java name */
            public static boolean m7450hasNotPassedNowimpl(long j2) {
                return Duration.m7332isNegativeimpl(m7447elapsedNowUwyO8pc(j2));
            }

            /* renamed from: hasPassedNow-impl  reason: not valid java name */
            public static boolean m7451hasPassedNowimpl(long j2) {
                return !Duration.m7332isNegativeimpl(m7447elapsedNowUwyO8pc(j2));
            }

            /* renamed from: hashCode-impl  reason: not valid java name */
            public static int m7452hashCodeimpl(long j2) {
                return (int) (j2 ^ (j2 >>> 32));
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public static long m7453minusLRDsOJo(long j2, long j3) {
                return MonotonicTimeSource.INSTANCE.m7434adjustReading6QKq23U(j2, Duration.m7351unaryMinusUwyO8pc(j3));
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public static long m7454plusLRDsOJo(long j2, long j3) {
                return MonotonicTimeSource.INSTANCE.m7434adjustReading6QKq23U(j2, j3);
            }

            /* renamed from: toString-impl  reason: not valid java name */
            public static String m7455toStringimpl(long j2) {
                return "ValueTimeMark(reading=" + j2 + ')';
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo7290elapsedNowUwyO8pc() {
                return m7447elapsedNowUwyO8pc(this.reading);
            }

            public boolean equals(Object obj) {
                return m7448equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m7450hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m7451hasPassedNowimpl(this.reading);
            }

            public int hashCode() {
                return m7452hashCodeimpl(this.reading);
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public long m7456minusLRDsOJo(long j2) {
                return m7453minusLRDsOJo(this.reading, j2);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo7291minusLRDsOJo(long j2) {
                return m7445boximpl(m7456minusLRDsOJo(j2));
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public long m7457plusLRDsOJo(long j2) {
                return m7454plusLRDsOJo(this.reading, j2);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo7292plusLRDsOJo(long j2) {
                return m7445boximpl(m7457plusLRDsOJo(j2));
            }

            public String toString() {
                return m7455toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl  reason: not valid java name */
            public final /* synthetic */ long m7458unboximpl() {
                return this.reading;
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m7445boximpl(m7444markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto  reason: not valid java name */
        public long m7444markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m7436markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }
    }

    @NotNull
    TimeMark markNow();
}
