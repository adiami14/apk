package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shape;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/DrawerKt$BottomDrawer$1.class */
public final class DrawerKt$BottomDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ BottomDrawerState $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ long $scrimColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$BottomDrawer$1(boolean z, BottomDrawerState bottomDrawerState, Function2<? super Composer, ? super Integer, Unit> function2, int i2, long j2, Shape shape, long j3, long j4, float f2, u0 u0Var, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$$dirty = i2;
        this.$scrimColor = j2;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j3;
        this.$drawerContentColor = j4;
        this.$drawerElevation = f2;
        this.$scope = u0Var;
        this.$drawerContent = function3;
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final float m1316invoke$lambda1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m1317invoke$lambda2(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x037e, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03cd, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L49;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.BoxWithConstraintsScope r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, int r17) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$BottomDrawer$1.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
