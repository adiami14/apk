package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\u001a\u0012\u0010��\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"ShaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "shader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/BrushKt.class */
public final class BrushKt {
    @NotNull
    public static final ShaderBrush ShaderBrush(@NotNull final Shader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt$ShaderBrush$1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            @NotNull
            /* renamed from: createShader-uvyYCjk  reason: not valid java name */
            public Shader mo2385createShaderuvyYCjk(long j2) {
                return shader;
            }
        };
    }
}
