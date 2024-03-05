package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��>\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010��\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u001a\u009b\u0001\u0010��\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a§\u0001\u0010��\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\f\u0010\u001e\u001a\u00020\u0001*\u00020\u0001H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"graphicsLayer", "Landroidx/compose/ui/Modifier;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "graphicsLayer-sKFY_QE", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "graphicsLayer-2Xn7asI", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/GraphicsLayerModifierKt.class */
public final class GraphicsLayerModifierKt {
    @Stable
    @NotNull
    public static final Modifier graphicsLayer(@NotNull Modifier modifier, @NotNull final Function1<? super GraphicsLayerScope, Unit> block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return modifier.then(new BlockGraphicsLayerModifier(block, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("graphicsLayer");
                inspectorInfo.getProperties().set("block", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* renamed from: graphicsLayer-2Xn7asI  reason: not valid java name */
    public static final Modifier m2551graphicsLayer2Xn7asI(@NotNull Modifier graphicsLayer, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, final float f9, final float f10, final float f11, final long j2, @NotNull final Shape shape, final boolean z, @Nullable final RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return graphicsLayer.then(new SimpleGraphicsLayerModifier(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer_2Xn7asI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("graphicsLayer");
                inspectorInfo.getProperties().set("scaleX", Float.valueOf(f2));
                inspectorInfo.getProperties().set("scaleY", Float.valueOf(f3));
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f4));
                inspectorInfo.getProperties().set("translationX", Float.valueOf(f5));
                inspectorInfo.getProperties().set("translationY", Float.valueOf(f6));
                inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(f7));
                inspectorInfo.getProperties().set("rotationX", Float.valueOf(f8));
                inspectorInfo.getProperties().set("rotationY", Float.valueOf(f9));
                inspectorInfo.getProperties().set("rotationZ", Float.valueOf(f10));
                inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(f11));
                inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m2740boximpl(j2));
                inspectorInfo.getProperties().set("shape", shape);
                inspectorInfo.getProperties().set("clip", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("renderEffect", renderEffect);
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: graphicsLayer-2Xn7asI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m2552graphicsLayer2Xn7asI$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f6 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f7 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f8 = 0.0f;
        }
        if ((i2 & 128) != 0) {
            f9 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f10 = 0.0f;
        }
        if ((i2 & 512) != 0) {
            f11 = 8.0f;
        }
        if ((i2 & 1024) != 0) {
            j2 = TransformOrigin.Companion.m2753getCenterSzJe1aQ();
        }
        if ((i2 & 2048) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4096) != 0) {
            z = false;
        }
        if ((i2 & 8192) != 0) {
            renderEffect = null;
        }
        return m2551graphicsLayer2Xn7asI(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null)", imports = {"androidx.compose.ui.graphics"}))
    @Stable
    /* renamed from: graphicsLayer-sKFY_QE  reason: not valid java name */
    public static final /* synthetic */ Modifier m2553graphicsLayersKFY_QE(Modifier graphicsLayer, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m2551graphicsLayer2Xn7asI(graphicsLayer, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default  reason: not valid java name */
    public static /* synthetic */ Modifier m2554graphicsLayersKFY_QE$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f6 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f7 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f8 = 0.0f;
        }
        if ((i2 & 128) != 0) {
            f9 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f10 = 0.0f;
        }
        if ((i2 & 512) != 0) {
            f11 = 8.0f;
        }
        if ((i2 & 1024) != 0) {
            j2 = TransformOrigin.Companion.m2753getCenterSzJe1aQ();
        }
        if ((i2 & 2048) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4096) != 0) {
            z = false;
        }
        return m2553graphicsLayersKFY_QE(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z);
    }

    @Stable
    @NotNull
    public static final Modifier toolingGraphicsLayer(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Modifier modifier2 = modifier;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            modifier2 = modifier.then(m2552graphicsLayer2Xn7asI$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16383, null));
        }
        return modifier2;
    }
}
