package kotlin.time;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u001c\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\f\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\u001a\u0018\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/time/DurationUnitKt")
/* loaded from: ItsOnFire.jar:kotlin/time/DurationUnitKt__DurationUnitKt.class */
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/time/DurationUnitKt__DurationUnitKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            iArr[DurationUnit.SECONDS.ordinal()] = 4;
            iArr[DurationUnit.MINUTES.ordinal()] = 5;
            iArr[DurationUnit.HOURS.ordinal()] = 6;
            iArr[DurationUnit.DAYS.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByIsoChar(char c2, boolean z) {
        DurationUnit durationUnit;
        if (z) {
            if (c2 == 'H') {
                durationUnit = DurationUnit.HOURS;
            } else if (c2 == 'M') {
                durationUnit = DurationUnit.MINUTES;
            } else if (c2 != 'S') {
                throw new IllegalArgumentException("Invalid duration ISO time unit: " + c2);
            } else {
                durationUnit = DurationUnit.SECONDS;
            }
        } else if (c2 != 'D') {
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c2);
        } else {
            durationUnit = DurationUnit.DAYS;
        }
        return durationUnit;
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByShortName(@NotNull String shortName) {
        DurationUnit durationUnit;
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode == 100) {
            if (shortName.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG)) {
                durationUnit = DurationUnit.DAYS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        } else if (hashCode == 104) {
            if (shortName.equals("h")) {
                durationUnit = DurationUnit.HOURS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        } else if (hashCode == 109) {
            if (shortName.equals("m")) {
                durationUnit = DurationUnit.MINUTES;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        } else if (hashCode == 115) {
            if (shortName.equals("s")) {
                durationUnit = DurationUnit.SECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        } else if (hashCode == 3494) {
            if (shortName.equals("ms")) {
                durationUnit = DurationUnit.MILLISECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        } else if (hashCode == 3525) {
            if (shortName.equals("ns")) {
                durationUnit = DurationUnit.NANOSECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        } else {
            if (hashCode == 3742 && shortName.equals("us")) {
                durationUnit = DurationUnit.MICROSECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final String shortName(@NotNull DurationUnit durationUnit) {
        String str;
        Intrinsics.checkNotNullParameter(durationUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "us";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "m";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
                break;
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
        return str;
    }
}
