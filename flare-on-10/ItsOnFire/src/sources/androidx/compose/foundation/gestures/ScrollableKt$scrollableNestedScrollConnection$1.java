package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��!\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1.class */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    public ScrollableKt$scrollableNestedScrollConnection$1(boolean z, State<ScrollingLogic> state) {
        this.$enabled = z;
        this.$scrollLogic = state;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo532onPostFlingRZ2iAVY(long r6, long r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r10) {
        /*
            r5 = this;
            r0 = r10
            boolean r0 = r0 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L2f
            r0 = r10
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r12 = r0
            r0 = r12
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r11
            r1 = r12
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r10 = r0
            goto L3b
        L2f:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r1 = r0
            r2 = r5
            r3 = r10
            r1.<init>(r2, r3)
            r10 = r0
        L3b:
            r0 = r10
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r10
            int r0 = r0.label
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L75
            r0 = r12
            r1 = 1
            if (r0 != r1) goto L6b
            r0 = r10
            long r0 = r0.J$0
            r8 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r11
            r10 = r0
            goto Lb3
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L75:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            boolean r0 = r0.$enabled
            if (r0 == 0) goto Lc3
            r0 = r5
            androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r0 = r0.$scrollLogic
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r0.J$0 = r1
            r0 = r10
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r8
            r2 = r10
            java.lang.Object r0 = r0.m538doFlingAnimationQWom1Mo(r1, r2)
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            r1 = r13
            if (r0 != r1) goto Lb3
            r0 = r13
            return r0
        Lb3:
            r0 = r8
            r1 = r10
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r1 = r1.m5029unboximpl()
            long r0 = androidx.compose.ui.unit.Velocity.m5023minusAH228Gc(r0, r1)
            r6 = r0
            goto Lca
        Lc3:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m5031getZero9UxMQ8M()
            r6 = r0
        Lca:
            r0 = r6
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5011boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.mo532onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long mo533onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return this.$enabled ? this.$scrollLogic.getValue().m539performRawScrollMKHz9U(j3) : Offset.Companion.m2183getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    public Object mo534onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
        return NestedScrollConnection.DefaultImpls.m3683onPreFlingQWom1Mo(this, j2, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long mo535onPreScrollOzD1aCk(long j2, int i2) {
        return NestedScrollConnection.DefaultImpls.m3684onPreScrollOzD1aCk(this, j2, i2);
    }
}
