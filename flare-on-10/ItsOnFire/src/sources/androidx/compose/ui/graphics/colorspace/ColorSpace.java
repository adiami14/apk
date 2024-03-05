package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0014\n��\n\u0002\u0010\u0007\n\u0002\b\u000e\b&\u0018�� )2\u00020\u0001:\u0001)B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001��¢\u0006\u0002\u0010\u0006B\"\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001��¢\u0006\u0002\u0010\tJ\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH&J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bH&J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bH&J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u001e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001cJ\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH&R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "model", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "id", "", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "componentCount", "getComponentCount", "()I", "getId$ui_graphics_release", "isSrgb", "", "()Z", "isWideGamut", "getModel-xdoWZVw", "()J", "J", "getName", "()Ljava/lang/String;", "equals", "other", "fromXyz", "", "x", "", "y", "z", "v", "getMaxValue", "component", "getMinValue", "hashCode", "toString", "toXyz", "r", "g", "b", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/ColorSpace.class */
public abstract class ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    @NotNull
    private final String name;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n��¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "()V", "MaxId", "", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/colorspace/ColorSpace$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ColorSpace(String str, long j2) {
        this(str, j2, -1, null);
    }

    private ColorSpace(String str, long j2, int i2) {
        this.name = str;
        this.model = j2;
        this.id = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ ColorSpace(String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, i2);
    }

    public /* synthetic */ ColorSpace(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj != null) {
            if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(getClass()), Reflection.getOrCreateKotlinClass(obj.getClass()))) {
                ColorSpace colorSpace = (ColorSpace) obj;
                if (this.id != colorSpace.id) {
                    return false;
                }
                z = !Intrinsics.areEqual(this.name, colorSpace.name) ? false : ColorModel.m2773equalsimpl0(m2783getModelxdoWZVw(), colorSpace.m2783getModelxdoWZVw());
            } else {
                z = false;
            }
        }
        return z;
    }

    @NotNull
    public final float[] fromXyz(float f2, float f3, float f4) {
        float[] fArr = new float[ColorModel.m2774getComponentCountimpl(m2783getModelxdoWZVw())];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        return fromXyz(fArr);
    }

    @NotNull
    public abstract float[] fromXyz(@NotNull float[] fArr);

    public final int getComponentCount() {
        return ColorModel.m2774getComponentCountimpl(m2783getModelxdoWZVw());
    }

    public final int getId$ui_graphics_release() {
        return this.id;
    }

    public abstract float getMaxValue(int i2);

    public abstract float getMinValue(int i2);

    /* renamed from: getModel-xdoWZVw  reason: not valid java name */
    public final long m2783getModelxdoWZVw() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m2775hashCodeimpl(m2783getModelxdoWZVw())) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m2776toStringimpl(m2783getModelxdoWZVw())) + ')';
    }

    @NotNull
    public final float[] toXyz(float f2, float f3, float f4) {
        return toXyz(new float[]{f2, f3, f4});
    }

    @NotNull
    public abstract float[] toXyz(@NotNull float[] fArr);
}
