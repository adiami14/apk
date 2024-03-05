package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpRect;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018��2\u00020\u0001J0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/SubcomposeMeasureScope.class */
public interface SubcomposeMeasureScope extends MeasureScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/SubcomposeMeasureScope$DefaultImpls.class */
    public static final class DefaultImpls {
        @NotNull
        public static MeasureResult layout(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, int i2, int i3, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return MeasureScope.DefaultImpls.layout(subcomposeMeasureScope, i2, i3, alignmentLines, placementBlock);
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m4005roundToPxR2X_6o(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3935roundToPxR2X_6o(subcomposeMeasureScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m4006roundToPx0680j_4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3936roundToPx0680j_4(subcomposeMeasureScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m4007toDpGaN1DYA(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3937toDpGaN1DYA(subcomposeMeasureScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m4008toDpu2uoSUM(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3938toDpu2uoSUM(subcomposeMeasureScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m4009toDpu2uoSUM(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, int i2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3939toDpu2uoSUM((MeasureScope) subcomposeMeasureScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m4010toDpSizekrfVVM(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3940toDpSizekrfVVM(subcomposeMeasureScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m4011toPxR2X_6o(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3941toPxR2X_6o(subcomposeMeasureScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m4012toPx0680j_4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3942toPx0680j_4(subcomposeMeasureScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return MeasureScope.DefaultImpls.toRect(subcomposeMeasureScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m4013toSizeXkaWNTQ(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3943toSizeXkaWNTQ(subcomposeMeasureScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m4014toSp0xMU5do(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3944toSp0xMU5do(subcomposeMeasureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m4015toSpkPz2Gy4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3945toSpkPz2Gy4(subcomposeMeasureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m4016toSpkPz2Gy4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, int i2) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "this");
            return MeasureScope.DefaultImpls.m3946toSpkPz2Gy4((MeasureScope) subcomposeMeasureScope, i2);
        }
    }

    @NotNull
    List<Measurable> subcompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> function2);
}
