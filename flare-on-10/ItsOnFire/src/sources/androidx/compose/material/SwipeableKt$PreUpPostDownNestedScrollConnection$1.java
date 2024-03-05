package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
@Metadata(d1 = {"��)\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001��\b\n\u0018��2\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001��ø\u0001\u0002ø\u0001\u0001¢\u0006\u0002\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "(J)F", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1.class */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ SwipeableState<T> $this_PreUpPostDownNestedScrollConnection;

    public SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState<T> swipeableState) {
        this.$this_PreUpPostDownNestedScrollConnection = swipeableState;
    }

    private final float toFloat(long j2) {
        return Offset.m2168getYimpl(j2);
    }

    private final long toOffset(float f2) {
        return OffsetKt.Offset(0.0f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo532onPostFlingRZ2iAVY(long r6, long r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r10) {
        /*
            r5 = this;
            r0 = r10
            boolean r0 = r0 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L2f
            r0 = r10
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r0
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
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r1 = r0
            r2 = r5
            r3 = r10
            r1.<init>(r2, r3)
            r10 = r0
        L3b:
            r0 = r10
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r10
            int r0 = r0.label
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L71
            r0 = r12
            r1 = 1
            if (r0 != r1) goto L67
            r0 = r10
            long r0 = r0.J$0
            r8 = r0
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            goto Laa
        L67:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L71:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            androidx.compose.material.SwipeableState<T> r0 = r0.$this_PreUpPostDownNestedScrollConnection
            r13 = r0
            r0 = r5
            r1 = r8
            float r1 = androidx.compose.ui.unit.Velocity.m5020getXimpl(r1)
            r2 = r8
            float r2 = androidx.compose.ui.unit.Velocity.m5021getYimpl(r2)
            long r1 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r2)
            float r0 = r0.toFloat(r1)
            r14 = r0
            r0 = r10
            r1 = r8
            r0.J$0 = r1
            r0 = r10
            r1 = 1
            r0.label = r1
            r0 = r13
            r1 = r14
            r2 = r10
            java.lang.Object r0 = r0.performFling(r1, r2)
            r1 = r11
            if (r0 != r1) goto Laa
            r0 = r11
            return r0
        Laa:
            r0 = r8
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5011boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo532onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo533onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return NestedScrollSource.m3695equalsimpl0(i2, NestedScrollSource.Companion.m3700getDragWNlRxjI()) ? toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(toFloat(j3))) : Offset.Companion.m2183getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo534onPreFlingQWom1Mo(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L2c
            r0 = r8
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r9
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r8 = r0
            goto L36
        L2c:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r8
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L69
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r8
            long r0 = r0.J$0
            r6 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lca
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            float r1 = androidx.compose.ui.unit.Velocity.m5020getXimpl(r1)
            r2 = r6
            float r2 = androidx.compose.ui.unit.Velocity.m5021getYimpl(r2)
            long r1 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r2)
            float r0 = r0.toFloat(r1)
            r12 = r0
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lc3
            r0 = r5
            androidx.compose.material.SwipeableState<T> r0 = r0.$this_PreUpPostDownNestedScrollConnection
            androidx.compose.runtime.State r0 = r0.getOffset()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = r5
            androidx.compose.material.SwipeableState<T> r1 = r1.$this_PreUpPostDownNestedScrollConnection
            float r1 = r1.getMinBound$material_release()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc3
            r0 = r5
            androidx.compose.material.SwipeableState<T> r0 = r0.$this_PreUpPostDownNestedScrollConnection
            r11 = r0
            r0 = r8
            r1 = r6
            r0.J$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r12
            r2 = r8
            java.lang.Object r0 = r0.performFling(r1, r2)
            r1 = r9
            if (r0 != r1) goto Lca
            r0 = r9
            return r0
        Lc3:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m5031getZero9UxMQ8M()
            r6 = r0
        Lca:
            r0 = r6
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5011boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo534onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo535onPreScrollOzD1aCk(long j2, int i2) {
        float f2 = toFloat(j2);
        return (f2 >= 0.0f || !NestedScrollSource.m3695equalsimpl0(i2, NestedScrollSource.Companion.m3700getDragWNlRxjI())) ? Offset.Companion.m2183getZeroF1C5BW0() : toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(f2));
    }
}
