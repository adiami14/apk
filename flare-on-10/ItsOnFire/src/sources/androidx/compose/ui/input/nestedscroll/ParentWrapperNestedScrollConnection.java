package androidx.compose.ui.input.nestedscroll;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018��2\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "self", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getParent", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParent", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getSelf", "setSelf", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection.class */
public final class ParentWrapperNestedScrollConnection implements NestedScrollConnection {
    @NotNull
    private NestedScrollConnection parent;
    @NotNull
    private NestedScrollConnection self;

    public ParentWrapperNestedScrollConnection(@NotNull NestedScrollConnection parent, @NotNull NestedScrollConnection self) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(self, "self");
        this.parent = parent;
        this.self = self;
    }

    @NotNull
    public final NestedScrollConnection getParent() {
        return this.parent;
    }

    @NotNull
    public final NestedScrollConnection getSelf() {
        return this.self;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo532onPostFlingRZ2iAVY(long r8, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.mo532onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo533onPostScrollDzOQY0M(long j2, long j3, int i2) {
        long mo533onPostScrollDzOQY0M = this.self.mo533onPostScrollDzOQY0M(j2, j3, i2);
        return Offset.m2172plusMKHz9U(mo533onPostScrollDzOQY0M, this.parent.mo533onPostScrollDzOQY0M(Offset.m2172plusMKHz9U(j2, mo533onPostScrollDzOQY0M), Offset.m2171minusMKHz9U(j3, mo533onPostScrollDzOQY0M), i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo534onPreFlingQWom1Mo(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection.mo534onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo535onPreScrollOzD1aCk(long j2, int i2) {
        long mo535onPreScrollOzD1aCk = this.parent.mo535onPreScrollOzD1aCk(j2, i2);
        return Offset.m2172plusMKHz9U(mo535onPreScrollOzD1aCk, this.self.mo535onPreScrollOzD1aCk(Offset.m2171minusMKHz9U(j2, mo535onPreScrollOzD1aCk), i2));
    }

    public final void setParent(@NotNull NestedScrollConnection nestedScrollConnection) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection, "<set-?>");
        this.parent = nestedScrollConnection;
    }

    public final void setSelf(@NotNull NestedScrollConnection nestedScrollConnection) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection, "<set-?>");
        this.self = nestedScrollConnection;
    }
}
