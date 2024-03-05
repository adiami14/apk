package kotlin.time;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018��2\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H&ø\u0001��ø\u0001\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u0007\u001a\u00020��2\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001J\u0014\u0010\t\u001a\u00020��2\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "plus", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalTime
/* loaded from: ItsOnFire.jar:kotlin/time/TimeMark.class */
public interface TimeMark {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/time/TimeMark$DefaultImpls.class */
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(@NotNull TimeMark timeMark) {
            return Duration.m7332isNegativeimpl(timeMark.mo7290elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(@NotNull TimeMark timeMark) {
            return !Duration.m7332isNegativeimpl(timeMark.mo7290elapsedNowUwyO8pc());
        }

        @NotNull
        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public static TimeMark m7439minusLRDsOJo(@NotNull TimeMark timeMark, long j2) {
            return timeMark.mo7292plusLRDsOJo(Duration.m7351unaryMinusUwyO8pc(j2));
        }

        @NotNull
        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public static TimeMark m7440plusLRDsOJo(@NotNull TimeMark timeMark, long j2) {
            return new AdjustedTimeMark(timeMark, j2, null);
        }
    }

    /* renamed from: elapsedNow-UwyO8pc */
    long mo7290elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @NotNull
    /* renamed from: minus-LRDsOJo */
    TimeMark mo7291minusLRDsOJo(long j2);

    @NotNull
    /* renamed from: plus-LRDsOJo */
    TimeMark mo7292plusLRDsOJo(long j2);
}
