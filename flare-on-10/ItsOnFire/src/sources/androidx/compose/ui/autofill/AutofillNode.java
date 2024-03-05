package androidx.compose.ui.autofill;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018�� \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "autofillTypes", "", "Landroidx/compose/ui/autofill/AutofillType;", "boundingBox", "Landroidx/compose/ui/geometry/Rect;", "onFill", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "getAutofillTypes", "()Ljava/util/List;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "id", "", "getId", "()I", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "hashCode", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/autofill/AutofillNode.class */
public final class AutofillNode {
    private static int previousId;
    @NotNull
    private final List<AutofillType> autofillTypes;
    @Nullable
    private Rect boundingBox;
    private final int id;
    @Nullable
    private final Function1<String, Unit> onFill;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "()V", "previousId", "", "generateId", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/autofill/AutofillNode$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i2;
            synchronized (this) {
                Companion companion = AutofillNode.Companion;
                AutofillNode.previousId++;
                i2 = AutofillNode.previousId;
            }
            return i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(@NotNull List<? extends AutofillType> autofillTypes, @Nullable Rect rect, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(autofillTypes, "autofillTypes");
        this.autofillTypes = autofillTypes;
        this.boundingBox = rect;
        this.onFill = function1;
        this.id = Companion.generateId();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AutofillNode(java.util.List r6, androidx.compose.ui.geometry.Rect r7, kotlin.jvm.functions.Function1 r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r5 = this;
            r0 = r9
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r6 = r0
        Lb:
            r0 = r9
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L14
            r0 = 0
            r7 = r0
        L14:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.AutofillNode.<init>(java.util.List, androidx.compose.ui.geometry.Rect, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutofillNode) {
            AutofillNode autofillNode = (AutofillNode) obj;
            return Intrinsics.areEqual(this.autofillTypes, autofillNode.autofillTypes) && Intrinsics.areEqual(this.boundingBox, autofillNode.boundingBox) && Intrinsics.areEqual(this.onFill, autofillNode.onFill);
        }
        return false;
    }

    @NotNull
    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    @Nullable
    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Function1<String, Unit> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode();
        Rect rect = this.boundingBox;
        int i2 = 0;
        int hashCode2 = rect == null ? 0 : rect.hashCode();
        Function1<String, Unit> function1 = this.onFill;
        if (function1 != null) {
            i2 = function1.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i2;
    }

    public final void setBoundingBox(@Nullable Rect rect) {
        this.boundingBox = rect;
    }
}
