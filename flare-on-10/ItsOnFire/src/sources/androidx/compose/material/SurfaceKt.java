package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��T\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010��\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001af\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ab\u0010��\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00052\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0003ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "border", "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "clickAndSemanticsModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/SurfaceKt.class */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: Surface-9VG74zQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1532Surface9VG74zQ(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r24, long r25, long r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r29, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r31, @org.jetbrains.annotations.Nullable androidx.compose.foundation.Indication r32, boolean r33, @org.jetbrains.annotations.Nullable java.lang.String r34, @org.jetbrains.annotations.Nullable androidx.compose.ui.semantics.Role r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1532Surface9VG74zQ(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: Surface-F-jzlyU  reason: not valid java name */
    public static final void m1533SurfaceFjzlyU(final Modifier modifier, final Shape shape, final long j2, final long j3, final BorderStroke borderStroke, final float f2, final Modifier modifier2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-750961828);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 = i3 | (startRestartGroup.changed(shape) ? 32 : 16);
        }
        int i5 = i4;
        if ((i2 & 896) == 0) {
            i5 = i4 | (startRestartGroup.changed(j2) ? 256 : 128);
        }
        int i6 = i5;
        if ((i2 & 7168) == 0) {
            i6 = i5 | (startRestartGroup.changed(j3) ? 2048 : 1024);
        }
        int i7 = i6;
        if ((57344 & i2) == 0) {
            i7 = i6 | (startRestartGroup.changed(borderStroke) ? 16384 : 8192);
        }
        int i8 = i7;
        if ((458752 & i2) == 0) {
            i8 = i7 | (startRestartGroup.changed(f2) ? 131072 : 65536);
        }
        int i9 = i8;
        if ((3670016 & i2) == 0) {
            i9 = i8 | (startRestartGroup.changed(modifier2) ? 1048576 : 524288);
        }
        int i10 = i9;
        if ((29360128 & i2) == 0) {
            i10 = i9 | (startRestartGroup.changed(function2) ? 8388608 : 4194304);
        }
        if (((i10 & 23967451) ^ 4793490) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float m4785constructorimpl = Dp.m4785constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4799unboximpl() + f2);
            startRestartGroup.startReplaceableGroup(-750961449);
            long mo1287apply7g2Lkgo = (!Color.m2415equalsimpl0(j2, MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1232getSurface0d7_KjU()) || elevationOverlay == null) ? j2 : elevationOverlay.mo1287apply7g2Lkgo(j2, m4785constructorimpl, startRestartGroup, (i10 >> 6) & 14);
            startRestartGroup.endReplaceableGroup();
            final long j4 = mo1287apply7g2Lkgo;
            final int i11 = i10;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2404boximpl(j3)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4783boximpl(m4785constructorimpl))}, ComposableLambdaKt.composableLambda(startRestartGroup, -819902018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i12) {
                    if (((i12 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier m2084shadowziNgDLE = ShadowKt.m2084shadowziNgDLE(Modifier.this, f2, shape, false);
                    BorderStroke borderStroke2 = borderStroke;
                    Modifier then = ClipKt.clip(BackgroundKt.m348backgroundbw27NRU(m2084shadowziNgDLE.then(borderStroke2 != null ? BorderKt.border(Modifier.Companion, borderStroke2, shape) : Modifier.Companion), j4, shape), shape).then(modifier2);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i13 = i11;
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(1376089394);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1989constructorimpl = Updater.m1989constructorimpl(composer2);
                    Updater.m1996setimpl(m1989constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1996setimpl(m1989constructorimpl, density, companion.getSetDensity());
                    Updater.m1996setimpl(m1989constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1996setimpl(m1989constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1977boximpl(SkippableUpdater.m1978constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1505976207);
                    function22.invoke(composer2, Integer.valueOf((i13 >> 21) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), startRestartGroup, 56);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                SurfaceKt.m1533SurfaceFjzlyU(Modifier.this, shape, j2, j3, borderStroke, f2, modifier2, function2, composer2, i2 | 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0258  */
    @androidx.compose.runtime.Composable
    /* renamed from: Surface-F-jzlyU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1534SurfaceFjzlyU(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r17, long r18, long r20, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r22, float r23, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1534SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
