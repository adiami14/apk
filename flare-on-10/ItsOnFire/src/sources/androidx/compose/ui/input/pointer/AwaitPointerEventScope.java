package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@RestrictsSuspension
@Metadata(d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018��2\u00020\u0001J\u001b\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001��¢\u0006\u0002\u0010\u0014JH\u0010\u0015\u001a\u0002H\u0016\"\u0004\b��\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020��\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@ø\u0001��¢\u0006\u0002\u0010\u001eJJ\u0010\u001f\u001a\u0004\u0018\u0001H\u0016\"\u0004\b��\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020��\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@ø\u0001��¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000bX¦\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/AwaitPointerEventScope.class */
public interface AwaitPointerEventScope extends Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/input/pointer/AwaitPointerEventScope$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    pointerEventPass = PointerEventPass.Main;
                }
                return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }

        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m3705getExtendedTouchPaddingNHjbRc(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Size.Companion.m2248getZeroNHjbRc();
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m3706roundToPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4770roundToPxR2X_6o(awaitPointerEventScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m3707roundToPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4771roundToPx0680j_4(awaitPointerEventScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m3708toDpGaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4772toDpGaN1DYA(awaitPointerEventScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m3709toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4773toDpu2uoSUM(awaitPointerEventScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m3710toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4774toDpu2uoSUM((Density) awaitPointerEventScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m3711toDpSizekrfVVM(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4775toDpSizekrfVVM(awaitPointerEventScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m3712toPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4776toPxR2X_6o(awaitPointerEventScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m3713toPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4777toPx0680j_4(awaitPointerEventScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(awaitPointerEventScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m3714toSizeXkaWNTQ(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4778toSizeXkaWNTQ(awaitPointerEventScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m3715toSp0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4779toSp0xMU5do(awaitPointerEventScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m3716toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4780toSpkPz2Gy4(awaitPointerEventScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m3717toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i2) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope, "this");
            return Density.DefaultImpls.m4781toSpkPz2Gy4((Density) awaitPointerEventScope, i2);
        }

        @Nullable
        public static <T> Object withTimeout(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            return function2.invoke(awaitPointerEventScope, continuation);
        }

        @Nullable
        public static <T> Object withTimeoutOrNull(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j2, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            return function2.invoke(awaitPointerEventScope, continuation);
        }
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super PointerEvent> continuation);

    @NotNull
    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    long mo3703getExtendedTouchPaddingNHjbRc();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo3704getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @Nullable
    <T> Object withTimeout(long j2, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);

    @Nullable
    <T> Object withTimeoutOrNull(long j2, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);
}
