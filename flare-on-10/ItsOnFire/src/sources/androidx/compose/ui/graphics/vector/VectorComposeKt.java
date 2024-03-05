package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��H\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0080\u0001\u0010��\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a©\u0001\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Group", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/VectorComposeKt.class */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Group(@org.jetbrains.annotations.Nullable java.lang.String r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> r24, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    /* renamed from: Path-9cdaXJ4  reason: not valid java name */
    public static final void m2984Path9cdaXJ4(@NotNull final List<? extends PathNode> pathData, int i2, @Nullable String str, @Nullable Brush brush, float f2, @Nullable Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, @Nullable Composer composer, final int i5, final int i6, final int i7) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Composer startRestartGroup = composer.startRestartGroup(435826864);
        if ((i7 & 2) != 0) {
            i2 = VectorKt.getDefaultFillType();
        }
        if ((i7 & 4) != 0) {
            str = "";
        }
        if ((i7 & 8) != 0) {
            brush = null;
        }
        if ((i7 & 16) != 0) {
            f2 = 1.0f;
        }
        if ((i7 & 32) != 0) {
            brush2 = null;
        }
        if ((i7 & 64) != 0) {
            f3 = 1.0f;
        }
        if ((i7 & 128) != 0) {
            f4 = 0.0f;
        }
        if ((i7 & 256) != 0) {
            i3 = VectorKt.getDefaultStrokeLineCap();
        }
        if ((i7 & 512) != 0) {
            i4 = VectorKt.getDefaultStrokeLineJoin();
        }
        if ((i7 & 1024) != 0) {
            f5 = 4.0f;
        }
        if ((i7 & 2048) != 0) {
            f6 = 0.0f;
        }
        if ((i7 & 4096) != 0) {
            f7 = 1.0f;
        }
        if ((i7 & 8192) != 0) {
            f8 = 0.0f;
        }
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        startRestartGroup.startReplaceableGroup(-2103250935);
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path_9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.compose.ui.graphics.vector.PathComponent] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PathComponent invoke() {
                    return Function0.this.invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        Composer m1989constructorimpl = Updater.m1989constructorimpl(startRestartGroup);
        Updater.m1996setimpl(m1989constructorimpl, str, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str2) {
                invoke2(pathComponent, str2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @NotNull String it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setName(it);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, pathData, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list) {
                invoke2(pathComponent, list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @NotNull List<? extends PathNode> it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setPathData(it);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, PathFillType.m2636boximpl(i2), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m3005invokepweu1eQ(pathComponent, pathFillType.m2642unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-pweu1eQ  reason: not valid java name */
            public final void m3005invokepweu1eQ(@NotNull PathComponent set, int i8) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2961setPathFillTypeoQ8Xj4U(i8);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, brush, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush3) {
                invoke2(pathComponent, brush3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @Nullable Brush brush3) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFill(brush3);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f2), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFillAlpha(f9);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, brush2, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush3) {
                invoke2(pathComponent, brush3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @Nullable Brush brush3) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStroke(brush3);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f3), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeAlpha(f9);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f4), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineWidth(f9);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, StrokeJoin.m2715boximpl(i4), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m3012invokekLtJ_vA(pathComponent, strokeJoin.m2721unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-kLtJ_vA  reason: not valid java name */
            public final void m3012invokekLtJ_vA(@NotNull PathComponent set, int i8) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2963setStrokeLineJoinWw9F2mQ(i8);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, StrokeCap.m2704boximpl(i3), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m2998invokeCSYIeUk(pathComponent, strokeCap.m2710unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-CSYIeUk  reason: not valid java name */
            public final void m2998invokeCSYIeUk(@NotNull PathComponent set, int i8) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2962setStrokeLineCapBeK7IIE(i8);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f5), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineMiter(f9);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f6), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathStart(f9);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f7), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathEnd(f9);
            }
        });
        Updater.m1996setimpl(m1989constructorimpl, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f9) {
                invoke(pathComponent, f9.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f9) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathOffset(f9);
            }
        });
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final int i8 = i2;
        final String str2 = str;
        final Brush brush3 = brush;
        final float f9 = f2;
        final Brush brush4 = brush2;
        final float f10 = f3;
        final float f11 = f4;
        final int i9 = i3;
        final int i10 = i4;
        final float f12 = f5;
        final float f13 = f6;
        final float f14 = f7;
        final float f15 = f8;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
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

            public final void invoke(@Nullable Composer composer2, int i11) {
                VectorComposeKt.m2984Path9cdaXJ4(pathData, i8, str2, brush3, f9, brush4, f10, f11, i9, i10, f12, f13, f14, f15, composer2, i5 | 1, i6, i7);
            }
        });
    }
}
