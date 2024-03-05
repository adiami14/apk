package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018�� '2\u00020\u0001:\u0002&'BJ\b��\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000fø\u0001��¢\u0006\u0002\u0010\u0010J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016R\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u00020\u000fø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u00020\rø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u001f\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b \u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "name", "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "root", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDefaultHeight-D9Ej5fM", "()F", "F", "getDefaultWidth-D9Ej5fM", "getName", "()Ljava/lang/String;", "getRoot", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", "getTintBlendMode-0nO6VwU", "()I", "I", "getTintColor-0d7_KjU", "()J", "J", "getViewportHeight", "getViewportWidth", "equals", "", "other", "hashCode", "", "Builder", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/ImageVector.class */
public final class ImageVector {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final float defaultHeight;
    private final float defaultWidth;
    @NotNull
    private final String name;
    @NotNull
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"��\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\u00020\u0001:\u0001BBF\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\rø\u0001��¢\u0006\u0002\u0010\u000eJf\u0010\u001c\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%J§\u0001\u0010'\u001a\u00020��2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\bø\u0001��ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020��J\b\u0010>\u001a\u00020?H\u0002J\f\u0010@\u001a\u00020A*\u00020\u0010H\u0002R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017X\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n��R\u0019\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001aR\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "currentGroup", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "getCurrentGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "F", "isConsumed", "", "nodes", "Landroidx/compose/ui/graphics/vector/Stack;", "Ljava/util/ArrayList;", "root", "I", "J", "addGroup", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "addPath", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "clearGroup", "ensureNotConsumed", "", "asVectorGroup", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "GroupParams", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/ImageVector$Builder.class */
    public static final class Builder {
        public static final int $stable = 8;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        @NotNull
        private final String name;
        @NotNull
        private final ArrayList<GroupParams> nodes;
        @NotNull
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        @Metadata(d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0002\u0018��2\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 ¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getClipPathData", "setClipPathData", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPivotX", "()F", "setPivotX", "(F)V", "getPivotY", "setPivotY", "getRotate", "setRotate", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams.class */
        public static final class GroupParams {
            @NotNull
            private List<VectorNode> children;
            @NotNull
            private List<? extends PathNode> clipPathData;
            @NotNull
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public GroupParams(@NotNull String name, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull List<? extends PathNode> clipPathData, @NotNull List<VectorNode> children) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
                Intrinsics.checkNotNullParameter(children, "children");
                this.name = name;
                this.rotate = f2;
                this.pivotX = f3;
                this.pivotY = f4;
                this.scaleX = f5;
                this.scaleY = f6;
                this.translationX = f7;
                this.translationY = f8;
                this.clipPathData = clipPathData;
                this.children = children;
            }

            public /* synthetic */ GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<PathNode> list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 1.0f : f5, (i2 & 32) != 0 ? 1.0f : f6, (i2 & 64) != 0 ? 0.0f : f7, (i2 & 128) != 0 ? 0.0f : f8, (i2 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i2 & 512) != 0 ? new ArrayList() : list2);
            }

            @NotNull
            public final List<VectorNode> getChildren() {
                return this.children;
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

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(@NotNull List<VectorNode> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.children = list;
            }

            public final void setClipPathData(@NotNull List<? extends PathNode> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.clipPathData = list;
            }

            public final void setName(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.name = str;
            }

            public final void setPivotX(float f2) {
                this.pivotX = f2;
            }

            public final void setPivotY(float f2) {
                this.pivotY = f2;
            }

            public final void setRotate(float f2) {
                this.rotate = f2;
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
        }

        private Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2) {
            this.name = str;
            this.defaultWidth = f2;
            this.defaultHeight = f3;
            this.viewportWidth = f4;
            this.viewportHeight = f5;
            this.tintColor = j2;
            this.tintBlendMode = i2;
            ArrayList<GroupParams> m2969constructorimpl$default = Stack.m2969constructorimpl$default(null, 1, null);
            this.nodes = m2969constructorimpl$default;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            Stack.m2978pushimpl(m2969constructorimpl$default, groupParams);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, f2, f3, f4, f5, (i3 & 32) != 0 ? Color.Companion.m2450getUnspecified0d7_KjU() : j2, (i3 & 64) != 0 ? BlendMode.Companion.m2356getSrcIn0nO6VwU() : i2, null);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f2, f3, f4, f5, j2, i2);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            if ((i2 & 8) != 0) {
                f4 = 0.0f;
            }
            if ((i2 & 16) != 0) {
                f5 = 1.0f;
            }
            if ((i2 & 32) != 0) {
                f6 = 1.0f;
            }
            if ((i2 & 64) != 0) {
                f7 = 0.0f;
            }
            if ((i2 & 128) != 0) {
                f8 = 0.0f;
            }
            if ((i2 & 256) != 0) {
                list = VectorKt.getEmptyPath();
            }
            return builder.addGroup(str, f2, f3, f4, f5, f6, f7, f8, list);
        }

        /* renamed from: addPath-oIyEayM$default  reason: not valid java name */
        public static /* synthetic */ Builder m2954addPathoIyEayM$default(Builder builder, List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i2 = VectorKt.getDefaultFillType();
            }
            if ((i5 & 4) != 0) {
                str = "";
            }
            if ((i5 & 8) != 0) {
                brush = null;
            }
            if ((i5 & 16) != 0) {
                f2 = 1.0f;
            }
            if ((i5 & 32) != 0) {
                brush2 = null;
            }
            if ((i5 & 64) != 0) {
                f3 = 1.0f;
            }
            if ((i5 & 128) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 256) != 0) {
                i3 = VectorKt.getDefaultStrokeLineCap();
            }
            if ((i5 & 512) != 0) {
                i4 = VectorKt.getDefaultStrokeLineJoin();
            }
            if ((i5 & 1024) != 0) {
                f5 = 4.0f;
            }
            if ((i5 & 2048) != 0) {
                f6 = 0.0f;
            }
            if ((i5 & 4096) != 0) {
                f7 = 1.0f;
            }
            if ((i5 & 8192) != 0) {
                f8 = 0.0f;
            }
            return builder.m2955addPathoIyEayM(list, i2, str, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (!(!this.isConsumed)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) Stack.m2976peekimpl(this.nodes);
        }

        @NotNull
        public final Builder addGroup(@NotNull String name, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull List<? extends PathNode> clipPathData) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
            ensureNotConsumed();
            Stack.m2978pushimpl(this.nodes, new GroupParams(name, f2, f3, f4, f5, f6, f7, f8, clipPathData, null, 512, null));
            return this;
        }

        @NotNull
        /* renamed from: addPath-oIyEayM  reason: not valid java name */
        public final Builder m2955addPathoIyEayM(@NotNull List<? extends PathNode> pathData, int i2, @NotNull String name, @Nullable Brush brush, float f2, @Nullable Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
            Intrinsics.checkNotNullParameter(pathData, "pathData");
            Intrinsics.checkNotNullParameter(name, "name");
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(name, pathData, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8, null));
            return this;
        }

        @NotNull
        public final ImageVector build() {
            ensureNotConsumed();
            while (Stack.m2972getSizeimpl(this.nodes) > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, null);
            this.isConsumed = true;
            return imageVector;
        }

        @NotNull
        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) Stack.m2977popimpl(this.nodes)));
            return this;
        }
    }

    @Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "()V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/ImageVector$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2) {
        this.name = str;
        this.defaultWidth = f2;
        this.defaultHeight = f3;
        this.viewportWidth = f4;
        this.viewportHeight = f5;
        this.root = vectorGroup;
        this.tintColor = j2;
        this.tintBlendMode = i2;
    }

    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageVector) {
            ImageVector imageVector = (ImageVector) obj;
            if (Intrinsics.areEqual(this.name, imageVector.name) && Dp.m4790equalsimpl0(m2950getDefaultWidthD9Ej5fM(), imageVector.m2950getDefaultWidthD9Ej5fM()) && Dp.m4790equalsimpl0(m2949getDefaultHeightD9Ej5fM(), imageVector.m2949getDefaultHeightD9Ej5fM())) {
                if (this.viewportWidth == imageVector.viewportWidth) {
                    return ((this.viewportHeight > imageVector.viewportHeight ? 1 : (this.viewportHeight == imageVector.viewportHeight ? 0 : -1)) == 0) && Intrinsics.areEqual(this.root, imageVector.root) && Color.m2415equalsimpl0(m2952getTintColor0d7_KjU(), imageVector.m2952getTintColor0d7_KjU()) && BlendMode.m2327equalsimpl0(m2951getTintBlendMode0nO6VwU(), imageVector.m2951getTintBlendMode0nO6VwU());
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM  reason: not valid java name */
    public final float m2949getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM  reason: not valid java name */
    public final float m2950getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU  reason: not valid java name */
    public final int m2951getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU  reason: not valid java name */
    public final long m2952getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + Dp.m4791hashCodeimpl(m2950getDefaultWidthD9Ej5fM())) * 31) + Dp.m4791hashCodeimpl(m2949getDefaultHeightD9Ej5fM())) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m2421hashCodeimpl(m2952getTintColor0d7_KjU())) * 31) + BlendMode.m2328hashCodeimpl(m2951getTintBlendMode0nO6VwU());
    }
}
