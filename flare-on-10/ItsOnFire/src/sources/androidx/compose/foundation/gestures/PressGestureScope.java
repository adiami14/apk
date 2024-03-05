package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\bf\u0018��2\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001��¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001��¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/PressGestureScope.class */
public interface PressGestureScope extends Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/PressGestureScope$DefaultImpls.class */
    public static final class DefaultImpls {
        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m505roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4770roundToPxR2X_6o(pressGestureScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m506roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4771roundToPx0680j_4(pressGestureScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m507toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4772toDpGaN1DYA(pressGestureScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m508toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4773toDpu2uoSUM(pressGestureScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m509toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4774toDpu2uoSUM((Density) pressGestureScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m510toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4775toDpSizekrfVVM(pressGestureScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m511toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4776toPxR2X_6o(pressGestureScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m512toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4777toPx0680j_4(pressGestureScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(pressGestureScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m513toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4778toSizeXkaWNTQ(pressGestureScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m514toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4779toSp0xMU5do(pressGestureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m515toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4780toSpkPz2Gy4(pressGestureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m516toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i2) {
            Intrinsics.checkNotNullParameter(pressGestureScope, "this");
            return Density.DefaultImpls.m4781toSpkPz2Gy4((Density) pressGestureScope, i2);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
