package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.vector.VectorConfig;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��Z\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0094\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192;\u0010\u001a\u001a7\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u0015\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u0015\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001dH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u000e\u0010��\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"RootGroupName", "", "RenderVectorGroup", "", "group", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "configs", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "rememberVectorPainter", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "image", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "name", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/runtime/Composable;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/VectorPainterKt.class */
public final class VectorPainterKt {
    @NotNull
    public static final String RootGroupName = "VectorRootGroup";

    @Composable
    public static final void RenderVectorGroup(@NotNull final VectorGroup group, @Nullable Map<String, ? extends VectorConfig> map, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Map<String, ? extends VectorConfig> emptyMap;
        Intrinsics.checkNotNullParameter(group, "group");
        Composer startRestartGroup = composer.startRestartGroup(-326288533);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(group) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        int i6 = i4;
        if (i5 != 0) {
            i6 = i4 | 16;
        }
        if ((2 & i3) == 0 && ((i6 & 91) ^ 18) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else if (i5 != 0) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                map = emptyMap;
            }
            startRestartGroup.endDefaults();
            Iterator<VectorNode> it = group.iterator();
            while (it.hasNext()) {
                final VectorNode next = it.next();
                if (next instanceof VectorPath) {
                    startRestartGroup.startReplaceableGroup(-326288360);
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = map.get(vectorPath.getName());
                    VectorConfig vectorConfig2 = vectorConfig;
                    if (vectorConfig == null) {
                        vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            @Override // androidx.compose.ui.graphics.vector.VectorConfig
                            public <T> T getOrDefault(@NotNull VectorProperty<T> vectorProperty, T t2) {
                                return (T) VectorConfig.DefaultImpls.getOrDefault(this, vectorProperty, t2);
                            }
                        };
                    }
                    VectorComposeKt.m2984Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m3019getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m3020getStrokeLineCapKaPHkGw(), vectorPath.m3021getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), startRestartGroup, 8, 0, 0);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    if (next instanceof VectorGroup) {
                        startRestartGroup.startReplaceableGroup(-326286502);
                        VectorGroup vectorGroup = (VectorGroup) next;
                        String name = vectorGroup.getName();
                        final Map<String, ? extends VectorConfig> map2 = map;
                        VectorConfig vectorConfig3 = map2.get(name);
                        VectorConfig vectorConfig4 = vectorConfig3;
                        if (vectorConfig3 == null) {
                            vectorConfig4 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                @Override // androidx.compose.ui.graphics.vector.VectorConfig
                                public <T> T getOrDefault(@NotNull VectorProperty<T> vectorProperty, T t2) {
                                    return (T) VectorConfig.DefaultImpls.getOrDefault(this, vectorProperty, t2);
                                }
                            };
                        }
                        VectorComposeKt.Group(vectorGroup.getName(), ((Number) vectorConfig4.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup.getRotation()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup.getPivotX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup.getPivotY()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup.getScaleX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup.getScaleY()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup.getTranslationX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup.getTranslationY()))).floatValue(), (List) vectorConfig4.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup.getClipPathData()), ComposableLambdaKt.composableLambda(startRestartGroup, -819898379, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
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
                            public final void invoke(@Nullable Composer composer2, int i7) {
                                if (((i7 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    VectorPainterKt.RenderVectorGroup((VectorGroup) VectorNode.this, map2, composer2, 64, 0);
                                }
                            }
                        }), startRestartGroup, 939524096, 0);
                    } else {
                        startRestartGroup.startReplaceableGroup(-326285032);
                    }
                    startRestartGroup.endReplaceableGroup();
                }
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Map<String, ? extends VectorConfig> map3 = map;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
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

            public final void invoke(@Nullable Composer composer2, int i7) {
                VectorPainterKt.RenderVectorGroup(VectorGroup.this, map3, composer2, i2 | 1, i3);
            }
        });
    }

    @Composable
    @NotNull
    public static final VectorPainter rememberVectorPainter(@NotNull final ImageVector image, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        composer.startReplaceableGroup(-1998939043);
        VectorPainter m3018rememberVectorPaintermlNsNFs = m3018rememberVectorPaintermlNsNFs(image.m2950getDefaultWidthD9Ej5fM(), image.m2949getDefaultHeightD9Ej5fM(), image.getViewportWidth(), image.getViewportHeight(), image.getName(), image.m2952getTintColor0d7_KjU(), image.m2951getTintBlendMode0nO6VwU(), ComposableLambdaKt.composableLambda(composer, -819890981, true, new Function4<Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3, Composer composer2, Integer num) {
                invoke(f2.floatValue(), f3.floatValue(), composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(float f2, float f3, @Nullable Composer composer2, int i3) {
                if (((i3 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    VectorPainterKt.RenderVectorGroup(ImageVector.this.getRoot(), null, composer2, 0, 2);
                }
            }
        }), composer, 12582912, 0);
        composer.endReplaceableGroup();
        return m3018rememberVectorPaintermlNsNFs;
    }

    @Composable
    @NotNull
    /* renamed from: rememberVectorPainter-mlNsNFs  reason: not valid java name */
    public static final VectorPainter m3018rememberVectorPaintermlNsNFs(float f2, float f3, float f4, float f5, @Nullable String str, long j2, int i2, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i3, int i4) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1998940692);
        if ((i4 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i4 & 8) != 0) {
            f5 = Float.NaN;
        }
        if ((i4 & 16) != 0) {
            str = RootGroupName;
        }
        if ((i4 & 32) != 0) {
            j2 = Color.Companion.m2450getUnspecified0d7_KjU();
        }
        if ((i4 & 64) != 0) {
            i2 = BlendMode.Companion.m2356getSrcIn0nO6VwU();
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float mo524toPx0680j_4 = density.mo524toPx0680j_4(f2);
        float mo524toPx0680j_42 = density.mo524toPx0680j_4(f3);
        float f6 = f4;
        if (Float.isNaN(f4)) {
            f6 = mo524toPx0680j_4;
        }
        float f7 = f5;
        if (Float.isNaN(f5)) {
            f7 = mo524toPx0680j_42;
        }
        composer.startReplaceableGroup(-1998939971);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        VectorPainter vectorPainter = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            vectorPainter = new VectorPainter();
            composer.updateRememberedValue(vectorPainter);
        }
        composer.endReplaceableGroup();
        final VectorPainter vectorPainter2 = (VectorPainter) vectorPainter;
        vectorPainter2.m3017setSizeuvyYCjk$ui_release(SizeKt.Size(mo524toPx0680j_4, mo524toPx0680j_42));
        int i5 = i3 >> 12;
        vectorPainter2.RenderVector$ui_release(str, f6, f7, content, composer, 32768 | (i5 & 14) | (i5 & 7168));
        composer.endReplaceableGroup();
        final long j3 = j2;
        final int i6 = i2;
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                VectorPainter.this.setIntrinsicColorFilter$ui_release(!Color.m2415equalsimpl0(j3, Color.Companion.m2450getUnspecified0d7_KjU()) ? ColorFilter.Companion.m2459tintxETnrds(j3, i6) : null);
            }
        }, composer, 0);
        composer.endReplaceableGroup();
        return vectorPainter2;
    }
}
