package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n��\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0010(\n��\b\u0007\u0018��2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002Bw\b��\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\u0010\u0011J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0011\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001dH\u0086\u0002J\b\u0010(\u001a\u00020\u001dH\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010*H\u0096\u0002R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n��R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b \u0010\u0017R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b!\u0010\u0017¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getClipPathData", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPivotX", "()F", "getPivotY", "getRotation", "getScaleX", "getScaleY", "size", "", "getSize", "()I", "getTranslationX", "getTranslationY", "equals", "", "other", "", "get", FirebaseAnalytics.Param.INDEX, "hashCode", "iterator", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/VectorGroup.class */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {
    @NotNull
    private final List<VectorNode> children;
    @NotNull
    private final List<PathNode> clipPathData;
    @NotNull
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(@NotNull String name, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull List<? extends PathNode> clipPathData, @NotNull List<? extends VectorNode> children) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.rotation = f2;
        this.pivotX = f3;
        this.pivotY = f4;
        this.scaleX = f5;
        this.scaleY = f6;
        this.translationX = f7;
        this.translationY = f8;
        this.clipPathData = clipPathData;
        this.children = children;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VectorGroup(java.lang.String r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, java.util.List r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r23
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Ld
            java.lang.String r0 = ""
            r13 = r0
            goto Ld
        Ld:
            r0 = 0
            r25 = r0
            r0 = r23
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L1c
            r0 = 0
            r14 = r0
            goto L1c
        L1c:
            r0 = r23
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = 0
            r15 = r0
            goto L28
        L28:
            r0 = r23
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L36
            r0 = 0
            r16 = r0
            goto L36
        L36:
            r0 = 1065353216(0x3f800000, float:1.0)
            r26 = r0
            r0 = r23
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L47
            r0 = 1065353216(0x3f800000, float:1.0)
            r17 = r0
            goto L47
        L47:
            r0 = r23
            r1 = 32
            r0 = r0 & r1
            if (r0 == 0) goto L56
            r0 = r26
            r18 = r0
            goto L56
        L56:
            r0 = r23
            r1 = 64
            r0 = r0 & r1
            if (r0 == 0) goto L64
            r0 = 0
            r19 = r0
            goto L64
        L64:
            r0 = r23
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L74
            r0 = r25
            r20 = r0
            goto L74
        L74:
            r0 = r23
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L85
            java.util.List r0 = androidx.compose.ui.graphics.vector.VectorKt.getEmptyPath()
            r21 = r0
            goto L85
        L85:
            r0 = r23
            r1 = 512(0x200, float:7.175E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L96
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r22 = r0
            goto L96
        L96:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorGroup.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VectorGroup)) {
            return false;
        }
        VectorGroup vectorGroup = (VectorGroup) obj;
        if (Intrinsics.areEqual(this.name, vectorGroup.name)) {
            if (this.rotation == vectorGroup.rotation) {
                if (this.pivotX == vectorGroup.pivotX) {
                    if (this.pivotY == vectorGroup.pivotY) {
                        if (this.scaleX == vectorGroup.scaleX) {
                            if (this.scaleY == vectorGroup.scaleY) {
                                if (this.translationX == vectorGroup.translationX) {
                                    return ((this.translationY > vectorGroup.translationY ? 1 : (this.translationY == vectorGroup.translationY ? 0 : -1)) == 0) && Intrinsics.areEqual(this.clipPathData, vectorGroup.clipPathData) && Intrinsics.areEqual(this.children, vectorGroup.children);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final VectorNode get(int i2) {
        return this.children.get(i2);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }
}
