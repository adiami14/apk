package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
@Metadata(d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001��¢\u0006\u0002\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()V", "bringIntoViewUsages", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewData;", "getBringIntoViewUsages", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/relocation/BringIntoViewRequesterImpl.class */
public final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    @NotNull
    private final MutableVector<BringIntoViewData> bringIntoViewUsages = new MutableVector<>(new BringIntoViewData[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0192, code lost:
        if (r17 < r18) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00bc -> B:35:0x017a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c9 -> B:35:0x017a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0117 -> B:35:0x017a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0163 -> B:34:0x0169). Please submit an issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bringIntoView(@org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Rect r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final MutableVector<BringIntoViewData> getBringIntoViewUsages() {
        return this.bringIntoViewUsages;
    }
}
