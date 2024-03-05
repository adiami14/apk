package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
@Metadata(d1 = {"��,\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\u001a(\u0010��\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H��\u001a*\u0010\b\u001a\u00020\t*\u00020\n2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a\u001b\u0010\b\u001a\u00020\t*\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/res/VectorResources_androidKt.class */
public final class VectorResources_androidKt {
    @NotNull
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(@Nullable Resources.Theme theme, @NotNull Resources res, @NotNull XmlResourceParser parser) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(parser, 0, 2, null);
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        ImageVector.Builder createVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, res, theme, attrs);
        int i2 = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(parser)) {
            i2 = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, res, attrs, theme, createVectorImageBuilder, i2);
            parser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), androidVectorParser.getConfig());
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0057, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L8;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.ImageVector vectorResource(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.vector.ImageVector.Companion r5, @androidx.annotation.DrawableRes int r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r7, int r8) {
        /*
            r0 = r5
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            r1 = 1466937771(0x576fb1ab, float:2.63546357E14)
            r0.startReplaceableGroup(r1)
            r0 = r7
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r0 = r0.consume(r1)
            android.content.Context r0 = (android.content.Context) r0
            r9 = r0
            r0 = r9
            android.content.res.Resources r0 = r0.getResources()
            r10 = r0
            r0 = r9
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r11 = r0
            r0 = r7
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.startReplaceableGroup(r1)
            r0 = r7
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.changed(r1)
            r12 = r0
            r0 = r7
            java.lang.Object r0 = r0.rememberedValue()
            r13 = r0
            r0 = r12
            if (r0 != 0) goto L5a
            r0 = r13
            r9 = r0
            r0 = r13
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L74
        L5a:
            r0 = r10
            java.lang.String r1 = "res"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r5
            r1 = r11
            r2 = r10
            r3 = r6
            androidx.compose.ui.graphics.vector.ImageVector r0 = vectorResource(r0, r1, r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.updateRememberedValue(r1)
        L74:
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r9
            androidx.compose.ui.graphics.vector.ImageVector r0 = (androidx.compose.ui.graphics.vector.ImageVector) r0
            r5 = r0
            r0 = r7
            r0.endReplaceableGroup()
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.VectorResources_androidKt.vectorResource(androidx.compose.ui.graphics.vector.ImageVector$Companion, int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.vector.ImageVector");
    }

    @NotNull
    public static final ImageVector vectorResource(@NotNull ImageVector.Companion companion, @Nullable Resources.Theme theme, @NotNull Resources res, int i2) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        XmlResourceParser xml = res.getXml(i2);
        Intrinsics.checkNotNullExpressionValue(xml, "");
        XmlVectorParser_androidKt.seekToStartTag(xml);
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(resId).apply { seekToStartTag() }");
        return loadVectorResourceInner(theme, res, xml).getImageVector();
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i2, int i3, Object obj) throws XmlPullParserException {
        if ((i3 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i2);
    }
}
