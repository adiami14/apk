package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0080\u0001\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a/\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a:\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001aA\u0010#\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aW\u0010+\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0012\u0010/\u001a\u00020 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0002\u001a!\u00100\u001a\u000201*\u0002012\u0006\u00102\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b3\u00104\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", "border", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawGenericBorder", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "obtain", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/BorderKt.class */
public final class BorderKt {
    @NotNull
    public static final Modifier border(@NotNull Modifier modifier, @NotNull BorderStroke border, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m356borderziNgDLE(modifier, border.m363getWidthD9Ej5fM(), border.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @NotNull
    /* renamed from: border-xT4_qwU  reason: not valid java name */
    public static final Modifier m354borderxT4_qwU(@NotNull Modifier border, float f2, long j2, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m356borderziNgDLE(border, f2, new SolidColor(j2, null), shape);
    }

    /* renamed from: border-xT4_qwU$default  reason: not valid java name */
    public static /* synthetic */ Modifier m355borderxT4_qwU$default(Modifier modifier, float f2, long j2, Shape shape, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m354borderxT4_qwU(modifier, f2, j2, shape);
    }

    @NotNull
    /* renamed from: border-ziNgDLE  reason: not valid java name */
    public static final Modifier m356borderziNgDLE(@NotNull Modifier border, final float f2, @NotNull final Brush brush, @NotNull final Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifierKt.composed(border, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BorderKt$border_ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("border");
                inspectorInfo.getProperties().set("width", Dp.m4783boximpl(f2));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set("color", Color.m2404boximpl(((SolidColor) brush).m2691getValue0d7_KjU()));
                    inspectorInfo.setValue(Color.m2404boximpl(((SolidColor) brush).m2691getValue0d7_KjU()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BorderKt$border$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1369505793);
                composer.startReplaceableGroup(-3687241);
                Object rememberedValue = composer.rememberedValue();
                Ref ref = rememberedValue;
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    ref = new Ref();
                    composer.updateRememberedValue(ref);
                }
                composer.endReplaceableGroup();
                final Ref ref2 = (Ref) ref;
                Modifier.Companion companion = Modifier.Companion;
                final float f3 = f2;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderKt$border$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        DrawResult m357drawRectBorderNsqcLGU;
                        DrawResult drawResult;
                        DrawResult m358drawRoundRectBorderSYlcjDY;
                        DrawResult drawGenericBorder;
                        DrawResult drawContentWithoutBorder;
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        if (drawWithCache.mo524toPx0680j_4(f3) >= 0.0f && Size.m2238getMinDimensionimpl(drawWithCache.m2077getSizeNHjbRc()) > 0.0f) {
                            float f4 = 2;
                            float min = Math.min(Dp.m4790equalsimpl0(f3, Dp.Companion.m4803getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo524toPx0680j_4(f3)), (float) Math.ceil(Size.m2238getMinDimensionimpl(drawWithCache.m2077getSizeNHjbRc()) / f4));
                            float f5 = min / f4;
                            long Offset = OffsetKt.Offset(f5, f5);
                            long Size = SizeKt.Size(Size.m2239getWidthimpl(drawWithCache.m2077getSizeNHjbRc()) - min, Size.m2236getHeightimpl(drawWithCache.m2077getSizeNHjbRc()) - min);
                            boolean z = f4 * min > Size.m2238getMinDimensionimpl(drawWithCache.m2077getSizeNHjbRc());
                            Outline mo426createOutlinePq9zytI = shape2.mo426createOutlinePq9zytI(drawWithCache.m2077getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
                            if (mo426createOutlinePq9zytI instanceof Outline.Generic) {
                                drawGenericBorder = BorderKt.drawGenericBorder(drawWithCache, ref2, brush2, (Outline.Generic) mo426createOutlinePq9zytI, z, min);
                                drawResult = drawGenericBorder;
                            } else if (mo426createOutlinePq9zytI instanceof Outline.Rounded) {
                                m358drawRoundRectBorderSYlcjDY = BorderKt.m358drawRoundRectBorderSYlcjDY(drawWithCache, ref2, brush2, (Outline.Rounded) mo426createOutlinePq9zytI, Offset, Size, z, min);
                                drawResult = m358drawRoundRectBorderSYlcjDY;
                            } else if (!(mo426createOutlinePq9zytI instanceof Outline.Rectangle)) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                m357drawRectBorderNsqcLGU = BorderKt.m357drawRectBorderNsqcLGU(drawWithCache, brush2, Offset, Size, z, min);
                                drawResult = m357drawRectBorderNsqcLGU;
                            }
                        } else {
                            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(drawWithCache);
                            drawResult = drawContentWithoutBorder;
                        }
                        return drawResult;
                    }
                }));
                composer.endReplaceableGroup();
                return then;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }
        });
    }

    private static final RoundRect createInsetRoundedRect(float f2, RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return new RoundRect(f2, f2, width - f2, height - f2, m359shrinkKibmq7A(roundRect.m2219getTopLeftCornerRadiuskKHJgLs(), f2), m359shrinkKibmq7A(roundRect.m2220getTopRightCornerRadiuskKHJgLs(), f2), m359shrinkKibmq7A(roundRect.m2218getBottomRightCornerRadiuskKHJgLs(), f2), m359shrinkKibmq7A(roundRect.m2217getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f2, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f2, roundRect));
            path.mo2308opN5in7k0(path, Path, PathOperation.Companion.m2653getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m2574equalsimpl(r21, r0 == null ? null : androidx.compose.ui.graphics.ImageBitmapConfig.m2572boximpl(r0.mo2282getConfig_sVssgQ())) != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r14, androidx.compose.ui.node.Ref<androidx.compose.foundation.BorderCache> r15, final androidx.compose.ui.graphics.Brush r16, final androidx.compose.ui.graphics.Outline.Generic r17, boolean r18, float r19) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.node.Ref, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU  reason: not valid java name */
    public static final DrawResult m357drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j2, long j3, boolean z, float f2) {
        if (z) {
            j2 = Offset.Companion.m2183getZeroF1C5BW0();
        }
        if (z) {
            j3 = cacheDrawScope.m2077getSizeNHjbRc();
        }
        final long j4 = j2;
        final long j5 = j3;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                DrawScope.DefaultImpls.m2892drawRectAsUm42w$default(onDrawWithContent, Brush.this, j4, j5, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-SYlcjDY  reason: not valid java name */
    public static final DrawResult m358drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, Outline.Rounded rounded, final long j2, final long j3, final boolean z, final float f2) {
        DrawResult onDrawWithContent;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m2219getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m2219getTopLeftCornerRadiuskKHJgLs();
            final float f3 = f2 / 2;
            final Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
            onDrawWithContent = cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent2) {
                    Brush brush2;
                    long j4;
                    long j5;
                    long m359shrinkKibmq7A;
                    long j6;
                    Stroke stroke2;
                    int i2;
                    Intrinsics.checkNotNullParameter(onDrawWithContent2, "$this$onDrawWithContent");
                    onDrawWithContent2.drawContent();
                    if (z) {
                        brush2 = brush;
                        j4 = 0;
                        j5 = 0;
                        j6 = m2219getTopLeftCornerRadiuskKHJgLs;
                        stroke2 = null;
                        i2 = 246;
                    } else {
                        float m2141getXimpl = CornerRadius.m2141getXimpl(m2219getTopLeftCornerRadiuskKHJgLs);
                        float f4 = f3;
                        if (m2141getXimpl < f4) {
                            float f5 = f2;
                            float m2239getWidthimpl = Size.m2239getWidthimpl(onDrawWithContent2.mo2841getSizeNHjbRc());
                            float f6 = f2;
                            float m2236getHeightimpl = Size.m2236getHeightimpl(onDrawWithContent2.mo2841getSizeNHjbRc());
                            float f7 = f2;
                            int m2401getDifferencertfAjoo = ClipOp.Companion.m2401getDifferencertfAjoo();
                            Brush brush3 = brush;
                            long j7 = m2219getTopLeftCornerRadiuskKHJgLs;
                            DrawContext drawContext = onDrawWithContent2.getDrawContext();
                            long mo2847getSizeNHjbRc = drawContext.mo2847getSizeNHjbRc();
                            drawContext.getCanvas().save();
                            drawContext.getTransform().mo2851clipRectN_I0leg(f5, f5, m2239getWidthimpl - f6, m2236getHeightimpl - f7, m2401getDifferencertfAjoo);
                            DrawScope.DefaultImpls.m2894drawRoundRectZuiqVtQ$default(onDrawWithContent2, brush3, 0L, 0L, j7, 0.0f, null, null, 0, 246, null);
                            drawContext.getCanvas().restore();
                            drawContext.mo2848setSizeuvyYCjk(mo2847getSizeNHjbRc);
                            return;
                        }
                        brush2 = brush;
                        j4 = j2;
                        j5 = j3;
                        m359shrinkKibmq7A = BorderKt.m359shrinkKibmq7A(m2219getTopLeftCornerRadiuskKHJgLs, f4);
                        j6 = m359shrinkKibmq7A;
                        stroke2 = stroke;
                        i2 = 208;
                    }
                    DrawScope.DefaultImpls.m2894drawRoundRectZuiqVtQ$default(onDrawWithContent2, brush2, j4, j5, j6, 0.0f, stroke2, null, 0, i2, null);
                }
            });
        } else {
            final Path createRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f2, z);
            onDrawWithContent = cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent2) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent2, "$this$onDrawWithContent");
                    onDrawWithContent2.drawContent();
                    DrawScope.DefaultImpls.m2888drawPathGBMwjPU$default(onDrawWithContent2, Path.this, brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        return onDrawWithContent;
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        BorderCache borderCache = value;
        if (value == null) {
            borderCache = new BorderCache(null, null, null, null, 15, null);
            ref.setValue(borderCache);
        }
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A  reason: not valid java name */
    public static final long m359shrinkKibmq7A(long j2, float f2) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m2141getXimpl(j2) - f2), Math.max(0.0f, CornerRadius.m2142getYimpl(j2) - f2));
    }
}
