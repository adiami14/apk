package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n��\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u000e\n��\b\u0080\b\u0018��2\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\fHÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003J\t\u0010S\u001a\u00020\fHÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\t\u0010U\u001a\u00020\u0018HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0018HÆ\u0003J\t\u0010X\u001a\u00020\fHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\t\u0010`\u001a\u00020\fHÆ\u0003Jç\u0001\u0010a\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\u0013\u0010b\u001a\u00020\u00182\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\u0005HÖ\u0001J\t\u0010e\u001a\u00020fHÖ\u0001R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\"\u0010#R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010\u0019\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b.\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b/\u0010#R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b8\u0010#R\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\bC\u0010#R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bH\u0010IR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\bJ\u0010#¨\u0006g"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "uniqueId", "", "left", "", "top", "right", "bottom", "width", "height", "scaleX", "", "scaleY", "translationX", "translationY", "elevation", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "clipToOutline", "", "clipToBounds", "alpha", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "(JIIIIIIFFFFFFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getBottom", "()I", "getCameraDistance", "setCameraDistance", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "getClipToOutline", "setClipToOutline", "getElevation", "setElevation", "getHeight", "getLeft", "getPivotX", "setPivotX", "getPivotY", "setPivotY", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getRight", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getRotationZ", "setRotationZ", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTop", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "getUniqueId", "()J", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/DeviceRenderNodeData.class */
public final class DeviceRenderNodeData {
    private float alpha;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    @Nullable
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public DeviceRenderNodeData(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, @Nullable RenderEffect renderEffect) {
        this.uniqueId = j2;
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
        this.width = i6;
        this.height = i7;
        this.scaleX = f2;
        this.scaleY = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.elevation = f6;
        this.rotationZ = f7;
        this.rotationX = f8;
        this.rotationY = f9;
        this.cameraDistance = f10;
        this.pivotX = f11;
        this.pivotY = f12;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f13;
        this.renderEffect = renderEffect;
    }

    public static /* synthetic */ DeviceRenderNodeData copy$default(DeviceRenderNodeData deviceRenderNodeData, long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, RenderEffect renderEffect, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j2 = deviceRenderNodeData.uniqueId;
        }
        if ((i8 & 2) != 0) {
            i2 = deviceRenderNodeData.left;
        }
        if ((i8 & 4) != 0) {
            i3 = deviceRenderNodeData.top;
        }
        if ((i8 & 8) != 0) {
            i4 = deviceRenderNodeData.right;
        }
        if ((i8 & 16) != 0) {
            i5 = deviceRenderNodeData.bottom;
        }
        if ((i8 & 32) != 0) {
            i6 = deviceRenderNodeData.width;
        }
        if ((i8 & 64) != 0) {
            i7 = deviceRenderNodeData.height;
        }
        if ((i8 & 128) != 0) {
            f2 = deviceRenderNodeData.scaleX;
        }
        if ((i8 & 256) != 0) {
            f3 = deviceRenderNodeData.scaleY;
        }
        if ((i8 & 512) != 0) {
            f4 = deviceRenderNodeData.translationX;
        }
        if ((i8 & 1024) != 0) {
            f5 = deviceRenderNodeData.translationY;
        }
        if ((i8 & 2048) != 0) {
            f6 = deviceRenderNodeData.elevation;
        }
        if ((i8 & 4096) != 0) {
            f7 = deviceRenderNodeData.rotationZ;
        }
        if ((i8 & 8192) != 0) {
            f8 = deviceRenderNodeData.rotationX;
        }
        if ((i8 & 16384) != 0) {
            f9 = deviceRenderNodeData.rotationY;
        }
        if ((i8 & 32768) != 0) {
            f10 = deviceRenderNodeData.cameraDistance;
        }
        if ((i8 & 65536) != 0) {
            f11 = deviceRenderNodeData.pivotX;
        }
        if ((i8 & 131072) != 0) {
            f12 = deviceRenderNodeData.pivotY;
        }
        if ((i8 & 262144) != 0) {
            z = deviceRenderNodeData.clipToOutline;
        }
        if ((i8 & 524288) != 0) {
            z2 = deviceRenderNodeData.clipToBounds;
        }
        if ((i8 & 1048576) != 0) {
            f13 = deviceRenderNodeData.alpha;
        }
        if ((i8 & 2097152) != 0) {
            renderEffect = deviceRenderNodeData.renderEffect;
        }
        return deviceRenderNodeData.copy(j2, i2, i3, i4, i5, i6, i7, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, z, z2, f13, renderEffect);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final float component13() {
        return this.rotationZ;
    }

    public final float component14() {
        return this.rotationX;
    }

    public final float component15() {
        return this.rotationY;
    }

    public final float component16() {
        return this.cameraDistance;
    }

    public final float component17() {
        return this.pivotX;
    }

    public final float component18() {
        return this.pivotY;
    }

    public final boolean component19() {
        return this.clipToOutline;
    }

    public final int component2() {
        return this.left;
    }

    public final boolean component20() {
        return this.clipToBounds;
    }

    public final float component21() {
        return this.alpha;
    }

    @Nullable
    public final RenderEffect component22() {
        return this.renderEffect;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    @NotNull
    public final DeviceRenderNodeData copy(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, @Nullable RenderEffect renderEffect) {
        return new DeviceRenderNodeData(j2, i2, i3, i4, i5, i6, i7, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, z, z2, f13, renderEffect);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceRenderNodeData) {
            DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
            return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Intrinsics.areEqual((Object) Float.valueOf(this.scaleX), (Object) Float.valueOf(deviceRenderNodeData.scaleX)) && Intrinsics.areEqual((Object) Float.valueOf(this.scaleY), (Object) Float.valueOf(deviceRenderNodeData.scaleY)) && Intrinsics.areEqual((Object) Float.valueOf(this.translationX), (Object) Float.valueOf(deviceRenderNodeData.translationX)) && Intrinsics.areEqual((Object) Float.valueOf(this.translationY), (Object) Float.valueOf(deviceRenderNodeData.translationY)) && Intrinsics.areEqual((Object) Float.valueOf(this.elevation), (Object) Float.valueOf(deviceRenderNodeData.elevation)) && Intrinsics.areEqual((Object) Float.valueOf(this.rotationZ), (Object) Float.valueOf(deviceRenderNodeData.rotationZ)) && Intrinsics.areEqual((Object) Float.valueOf(this.rotationX), (Object) Float.valueOf(deviceRenderNodeData.rotationX)) && Intrinsics.areEqual((Object) Float.valueOf(this.rotationY), (Object) Float.valueOf(deviceRenderNodeData.rotationY)) && Intrinsics.areEqual((Object) Float.valueOf(this.cameraDistance), (Object) Float.valueOf(deviceRenderNodeData.cameraDistance)) && Intrinsics.areEqual((Object) Float.valueOf(this.pivotX), (Object) Float.valueOf(deviceRenderNodeData.pivotX)) && Intrinsics.areEqual((Object) Float.valueOf(this.pivotY), (Object) Float.valueOf(deviceRenderNodeData.pivotY)) && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Intrinsics.areEqual((Object) Float.valueOf(this.alpha), (Object) Float.valueOf(deviceRenderNodeData.alpha)) && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.uniqueId);
        int hashCode2 = Integer.hashCode(this.left);
        int hashCode3 = Integer.hashCode(this.top);
        int hashCode4 = Integer.hashCode(this.right);
        int hashCode5 = Integer.hashCode(this.bottom);
        int hashCode6 = Integer.hashCode(this.width);
        int hashCode7 = Integer.hashCode(this.height);
        int hashCode8 = Float.hashCode(this.scaleX);
        int hashCode9 = Float.hashCode(this.scaleY);
        int hashCode10 = Float.hashCode(this.translationX);
        int hashCode11 = Float.hashCode(this.translationY);
        int hashCode12 = Float.hashCode(this.elevation);
        int hashCode13 = Float.hashCode(this.rotationZ);
        int hashCode14 = Float.hashCode(this.rotationX);
        int hashCode15 = Float.hashCode(this.rotationY);
        int hashCode16 = Float.hashCode(this.cameraDistance);
        int hashCode17 = Float.hashCode(this.pivotX);
        int hashCode18 = Float.hashCode(this.pivotY);
        boolean z = this.clipToOutline;
        int i2 = 1;
        int i3 = z ? 1 : 0;
        if (z) {
            i3 = 1;
        }
        boolean z2 = this.clipToBounds;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int hashCode19 = Float.hashCode(this.alpha);
        RenderEffect renderEffect = this.renderEffect;
        return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + i3) * 31) + i2) * 31) + hashCode19) * 31) + (renderEffect == null ? 0 : renderEffect.hashCode());
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final void setCameraDistance(float f2) {
        this.cameraDistance = f2;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final void setElevation(float f2) {
        this.elevation = f2;
    }

    public final void setPivotX(float f2) {
        this.pivotX = f2;
    }

    public final void setPivotY(float f2) {
        this.pivotY = f2;
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f2) {
        this.rotationX = f2;
    }

    public final void setRotationY(float f2) {
        this.rotationY = f2;
    }

    public final void setRotationZ(float f2) {
        this.rotationZ = f2;
    }

    public final void setScaleX(float f2) {
        this.scaleX = f2;
    }

    public final void setScaleY(float f2) {
        this.scaleY = f2;
    }

    public final void setTranslationX(float f2) {
        this.translationX = f2;
    }

    public final void setTranslationY(float f2) {
        this.translationY = f2;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ')';
    }
}
