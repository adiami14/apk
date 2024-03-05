package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��&\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001��¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002\u001a+\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0086\bø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0019\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0087\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0019\"\"\u0010��\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001��¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/ScaleFactorKt.class */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f2, float f3) {
        return ScaleFactor.m3981constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w  reason: not valid java name */
    public static final long m3995divUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m2239getWidthimpl(j2) / ScaleFactor.m3987getScaleXimpl(j3), Size.m2236getHeightimpl(j2) / ScaleFactor.m3988getScaleYimpl(j3));
    }

    /* renamed from: isSpecified-FK8aYYs  reason: not valid java name */
    public static final boolean m3996isSpecifiedFK8aYYs(long j2) {
        return j2 != ScaleFactor.Companion.m3994getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m3997isSpecifiedFK8aYYs$annotations(long j2) {
    }

    /* renamed from: isUnspecified-FK8aYYs  reason: not valid java name */
    public static final boolean m3998isUnspecifiedFK8aYYs(long j2) {
        return j2 == ScaleFactor.Companion.m3994getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m3999isUnspecifiedFK8aYYs$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp--bDIf60  reason: not valid java name */
    public static final long m4000lerpbDIf60(long j2, long j3, float f2) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m3987getScaleXimpl(j2), ScaleFactor.m3987getScaleXimpl(j3), f2), MathHelpersKt.lerp(ScaleFactor.m3988getScaleYimpl(j2), ScaleFactor.m3988getScaleYimpl(j3), f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f2) {
        float f3 = 10;
        float f4 = f2 * f3;
        int i2 = (int) f4;
        int i3 = i2;
        if (f4 - i2 >= 0.5f) {
            i3 = i2 + 1;
        }
        return i3 / f3;
    }

    /* renamed from: takeOrElse-oyDd2qo  reason: not valid java name */
    public static final long m4001takeOrElseoyDd2qo(long j2, @NotNull Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(j2 != ScaleFactor.Companion.m3994getUnspecified_hLwfpc())) {
            j2 = block.invoke().m3992unboximpl();
        }
        return j2;
    }

    @Stable
    /* renamed from: times-UQTWf7w  reason: not valid java name */
    public static final long m4002timesUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m2239getWidthimpl(j2) * ScaleFactor.m3987getScaleXimpl(j3), Size.m2236getHeightimpl(j2) * ScaleFactor.m3988getScaleYimpl(j3));
    }

    @Stable
    /* renamed from: times-m-w2e94  reason: not valid java name */
    public static final long m4003timesmw2e94(long j2, long j3) {
        return m4002timesUQTWf7w(j3, j2);
    }
}
