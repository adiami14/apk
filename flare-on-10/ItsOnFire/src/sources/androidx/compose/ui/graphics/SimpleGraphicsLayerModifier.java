package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018��2\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001aø\u0001��¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J)\u0010&\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016ø\u0001��ø\u0001\u0001¢\u0006\u0004\b-\u0010.R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n��R\u001f\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001aX\u0082\u0004¢\u0006\u0002\n��R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\u000e\u001a\u00020\u000fX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "J", "equals", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/SimpleGraphicsLayerModifier.class */
final class SimpleGraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    private final float alpha;
    private final float cameraDistance;
    private final boolean clip;
    @NotNull
    private final Function1<GraphicsLayerScope, Unit> layerBlock;
    @Nullable
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    @NotNull
    private final Shape shape;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    private SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.scaleX = f2;
        this.scaleY = f3;
        this.alpha = f4;
        this.translationX = f5;
        this.translationY = f6;
        this.shadowElevation = f7;
        this.rotationX = f8;
        this.rotationY = f9;
        this.rotationZ = f10;
        this.cameraDistance = f11;
        this.transformOrigin = j2;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.layerBlock = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                float f12;
                float f13;
                float f14;
                float f15;
                float f16;
                float f17;
                float f18;
                float f19;
                float f20;
                float f21;
                long j3;
                Shape shape2;
                boolean z2;
                RenderEffect renderEffect2;
                Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
                f12 = SimpleGraphicsLayerModifier.this.scaleX;
                graphicsLayerScope.setScaleX(f12);
                f13 = SimpleGraphicsLayerModifier.this.scaleY;
                graphicsLayerScope.setScaleY(f13);
                f14 = SimpleGraphicsLayerModifier.this.alpha;
                graphicsLayerScope.setAlpha(f14);
                f15 = SimpleGraphicsLayerModifier.this.translationX;
                graphicsLayerScope.setTranslationX(f15);
                f16 = SimpleGraphicsLayerModifier.this.translationY;
                graphicsLayerScope.setTranslationY(f16);
                f17 = SimpleGraphicsLayerModifier.this.shadowElevation;
                graphicsLayerScope.setShadowElevation(f17);
                f18 = SimpleGraphicsLayerModifier.this.rotationX;
                graphicsLayerScope.setRotationX(f18);
                f19 = SimpleGraphicsLayerModifier.this.rotationY;
                graphicsLayerScope.setRotationY(f19);
                f20 = SimpleGraphicsLayerModifier.this.rotationZ;
                graphicsLayerScope.setRotationZ(f20);
                f21 = SimpleGraphicsLayerModifier.this.cameraDistance;
                graphicsLayerScope.setCameraDistance(f21);
                j3 = SimpleGraphicsLayerModifier.this.transformOrigin;
                graphicsLayerScope.mo2556setTransformOrigin__ExYCQ(j3);
                shape2 = SimpleGraphicsLayerModifier.this.shape;
                graphicsLayerScope.setShape(shape2);
                z2 = SimpleGraphicsLayerModifier.this.clip;
                graphicsLayerScope.setClip(z2);
                renderEffect2 = SimpleGraphicsLayerModifier.this.renderEffect;
                graphicsLayerScope.setRenderEffect(renderEffect2);
            }
        };
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    public boolean equals(@Nullable Object obj) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = obj instanceof SimpleGraphicsLayerModifier ? (SimpleGraphicsLayerModifier) obj : null;
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        boolean z = false;
        if (this.scaleX == simpleGraphicsLayerModifier.scaleX) {
            z = false;
            if (this.scaleY == simpleGraphicsLayerModifier.scaleY) {
                z = false;
                if (this.alpha == simpleGraphicsLayerModifier.alpha) {
                    z = false;
                    if (this.translationX == simpleGraphicsLayerModifier.translationX) {
                        z = false;
                        if (this.translationY == simpleGraphicsLayerModifier.translationY) {
                            z = false;
                            if (this.shadowElevation == simpleGraphicsLayerModifier.shadowElevation) {
                                z = false;
                                if (this.rotationX == simpleGraphicsLayerModifier.rotationX) {
                                    z = false;
                                    if (this.rotationY == simpleGraphicsLayerModifier.rotationY) {
                                        z = false;
                                        if (this.rotationZ == simpleGraphicsLayerModifier.rotationZ) {
                                            z = false;
                                            if (this.cameraDistance == simpleGraphicsLayerModifier.cameraDistance) {
                                                z = false;
                                                if (TransformOrigin.m2747equalsimpl0(this.transformOrigin, simpleGraphicsLayerModifier.transformOrigin)) {
                                                    z = false;
                                                    if (Intrinsics.areEqual(this.shape, simpleGraphicsLayerModifier.shape)) {
                                                        z = false;
                                                        if (this.clip == simpleGraphicsLayerModifier.clip) {
                                                            z = false;
                                                            if (Intrinsics.areEqual(this.renderEffect, simpleGraphicsLayerModifier.renderEffect)) {
                                                                z = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.scaleX);
        int hashCode2 = Float.hashCode(this.scaleY);
        int hashCode3 = Float.hashCode(this.alpha);
        int hashCode4 = Float.hashCode(this.translationX);
        int hashCode5 = Float.hashCode(this.translationY);
        int hashCode6 = Float.hashCode(this.shadowElevation);
        int hashCode7 = Float.hashCode(this.rotationX);
        int hashCode8 = Float.hashCode(this.rotationY);
        int hashCode9 = Float.hashCode(this.rotationZ);
        int hashCode10 = Float.hashCode(this.cameraDistance);
        int m2750hashCodeimpl = TransformOrigin.m2750hashCodeimpl(this.transformOrigin);
        int hashCode11 = this.shape.hashCode();
        int hashCode12 = Boolean.hashCode(this.clip);
        RenderEffect renderEffect = this.renderEffect;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + m2750hashCodeimpl) * 31) + hashCode11) * 31) + hashCode12) * 31) + (renderEffect == null ? 0 : renderEffect.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo3910measureBRTryo0 = measurable.mo3910measureBRTryo0(j2);
        return MeasureScope.DefaultImpls.layout$default(receiver, mo3910measureBRTryo0.getWidth(), mo3910measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable placeable = Placeable.this;
                function1 = this.layerBlock;
                Placeable.PlacementScope.placeWithLayer$default(layout, placeable, 0, 0, 0.0f, function1, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    @NotNull
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m2751toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ')';
    }
}
