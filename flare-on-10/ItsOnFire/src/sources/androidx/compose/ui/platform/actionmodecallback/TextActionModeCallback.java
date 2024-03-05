package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b��\u0018��2\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u001a\u0010 \u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u001bR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "", "Landroidx/compose/ui/platform/ActionCallback;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnCopyRequested", "()Lkotlin/jvm/functions/Function0;", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnCutRequested", "setOnCutRequested", "getOnPasteRequested", "setOnPasteRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "onPrepareActionMode", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/actionmodecallback/TextActionModeCallback.class */
public final class TextActionModeCallback {
    @Nullable
    private Function0<Unit> onCopyRequested;
    @Nullable
    private Function0<Unit> onCutRequested;
    @Nullable
    private Function0<Unit> onPasteRequested;
    @Nullable
    private Function0<Unit> onSelectAllRequested;
    @NotNull
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, 31, null);
    }

    public TextActionModeCallback(@NotNull Rect rect, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.rect = rect;
        this.onCopyRequested = function0;
        this.onPasteRequested = function02;
        this.onCutRequested = function03;
        this.onSelectAllRequested = function04;
    }

    public /* synthetic */ TextActionModeCallback(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Rect.Companion.getZero() : rect, (i2 & 2) != 0 ? null : function0, (i2 & 4) != 0 ? null : function02, (i2 & 8) != 0 ? null : function03, (i2 & 16) != 0 ? null : function04);
    }

    @Nullable
    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        r5.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        r4.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActionItemClicked(@org.jetbrains.annotations.Nullable android.view.ActionMode r4, @org.jetbrains.annotations.Nullable android.view.MenuItem r5) {
        /*
            r3 = this;
            r0 = r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0 = r5
            int r0 = r0.getItemId()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L53
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L42
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L31
            r0 = r6
            r1 = 3
            if (r0 == r1) goto L20
            r0 = 0
            return r0
        L20:
            r0 = r3
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.onSelectAllRequested
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L64
            goto L6b
        L31:
            r0 = r3
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.onCutRequested
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L64
            goto L6b
        L42:
            r0 = r3
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.onPasteRequested
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L64
            goto L6b
        L53:
            r0 = r3
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.onCopyRequested
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L64
            goto L6b
        L64:
            r0 = r5
            java.lang.Object r0 = r0.invoke()
        L6b:
            r0 = r4
            if (r0 != 0) goto L72
            goto L76
        L72:
            r0 = r4
            r0.finish()
        L76:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public final boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.onCopyRequested != null) {
                    menu.add(0, 0, 0, 17039361).setShowAsAction(1);
                }
                if (this.onPasteRequested != null) {
                    menu.add(0, 1, 1, 17039371).setShowAsAction(1);
                }
                if (this.onCutRequested != null) {
                    menu.add(0, 2, 2, 17039363).setShowAsAction(1);
                }
                if (this.onSelectAllRequested == null) {
                    return true;
                }
                menu.add(0, 3, 3, 17039373).setShowAsAction(1);
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void onDestroyActionMode() {
    }

    public final boolean onPrepareActionMode() {
        return false;
    }

    public final void setOnCopyRequested(@Nullable Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void setOnCutRequested(@Nullable Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void setOnPasteRequested(@Nullable Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void setOnSelectAllRequested(@Nullable Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void setRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.rect = rect;
    }
}
