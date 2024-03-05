package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"��\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n��\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0004¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u0007R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004ø\u0001��¢\u0006\b\n��\u001a\u0004\b!\u0010\u0007R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$0#0\u0004¢\u0006\b\n��\u001a\u0004\b%\u0010\u0007R\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006X\u0087\u0004¢\u0006\u000e\n��\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n��\u001a\u0004\b*\u0010\u0007R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n��\u001a\u0004\b,\u0010\u0007R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004ø\u0001��¢\u0006\b\n��\u001a\u0004\b/\u0010\u0007R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n��\u001a\u0004\b1\u0010\u0007R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n��\u001a\u0004\b3\u0010\u0007R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\b\n��\u001a\u0004\b6\u0010\u0007R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004ø\u0001��¢\u0006\b\n��\u001a\u0004\b9\u0010\u0007R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n��\u001a\u0004\b;\u0010\u0007R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n��\u001a\u0004\b=\u0010\u0007R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n��\u001a\u0004\b?\u0010\u0007R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n��\u001a\u0004\bA\u0010\u0007R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0004¢\u0006\b\n��\u001a\u0004\bC\u0010\u0007R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0004ø\u0001��¢\u0006\b\n��\u001a\u0004\bF\u0010\u0007R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u0004¢\u0006\b\n��\u001a\u0004\bI\u0010\u0007R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n��\u001a\u0004\bK\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "()V", "CollectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "CollectionItemInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "ContentDescription", "", "", "getContentDescription", "Disabled", "", "getDisabled", "EditableText", "Landroidx/compose/ui/text/AnnotatedString;", "getEditableText", "Error", "getError", "Focused", "", "getFocused", "Heading", "getHeading", "HorizontalScrollAxisRange", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "ImeAction", "Landroidx/compose/ui/text/input/ImeAction;", "getImeAction", "IndexForKey", "Lkotlin/Function1;", "", "getIndexForKey", "InvisibleToUser", "getInvisibleToUser$annotations", "getInvisibleToUser", "IsDialog", "getIsDialog", "IsPopup", "getIsPopup", "LiveRegion", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "PaneTitle", "getPaneTitle", "Password", "getPassword", "ProgressBarRangeInfo", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "Role", "Landroidx/compose/ui/semantics/Role;", "getRole", "SelectableGroup", "getSelectableGroup", "Selected", "getSelected", "StateDescription", "getStateDescription", "TestTag", "getTestTag", "Text", "getText", "TextSelectionRange", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "ToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/semantics/SemanticsProperties.class */
public final class SemanticsProperties {
    public static final int $stable = 0;
    @NotNull
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    @NotNull
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", new Function2<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            return invoke2((List<String>) list, (List<String>) list2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
            r0 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList((java.util.Collection) r4);
         */
        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<java.lang.String> invoke2(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r4, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5) {
            /*
                r3 = this;
                r0 = r5
                java.lang.String r1 = "childValue"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                r0 = r4
                if (r0 != 0) goto Ld
                goto L23
            Ld:
                r0 = r4
                java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
                r4 = r0
                r0 = r4
                if (r0 != 0) goto L19
                goto L23
            L19:
                r0 = r4
                r1 = r5
                boolean r0 = r0.addAll(r1)
                r0 = r4
                r5 = r0
            L23:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1.invoke2(java.util.List, java.util.List):java.util.List");
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final String invoke(@Nullable String str, @NotNull String noName_1) {
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<Unit> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Unit> Heading = new SemanticsPropertyKey<>("Heading", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Unit> Disabled = new SemanticsPropertyKey<>("Disabled", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Unit invoke(@Nullable Unit unit, @NotNull Unit noName_1) {
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            return unit;
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Unit> IsPopup = new SemanticsPropertyKey<>("IsPopup", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Unit invoke(@Nullable Unit unit, @NotNull Unit noName_1) {
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<Unit> IsDialog = new SemanticsPropertyKey<>("IsDialog", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Unit invoke(@Nullable Unit unit, @NotNull Unit noName_1) {
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", new Function2<Role, Role, Role>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Role invoke(Role role, Role role2) {
            return m4340invokeqtAw6s(role, role2.m4313unboximpl());
        }

        @Nullable
        /* renamed from: invoke-qtA-w6s  reason: not valid java name */
        public final Role m4340invokeqtAw6s(@Nullable Role role, int i2) {
            return role;
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final String invoke(@Nullable String str, @NotNull String noName_1) {
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            return str;
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", new Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
            return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<AnnotatedString> invoke2(@Nullable List<AnnotatedString> list, @NotNull List<AnnotatedString> childValue) {
            List<AnnotatedString> mutableList;
            List<AnnotatedString> list2;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list == null) {
                list2 = childValue;
            } else {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                list2 = mutableList;
                if (list2 == null) {
                    list2 = childValue;
                } else {
                    list2.addAll(childValue);
                }
            }
            return list2;
        }
    });
    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Unit> Password = new SemanticsPropertyKey<>("Password", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", null, 2, null);
    @NotNull
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    private SemanticsProperties() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getDisabled() {
        return Disabled;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getHeading() {
        return Heading;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    @NotNull
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getInvisibleToUser() {
        return InvisibleToUser;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsDialog() {
        return IsDialog;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsPopup() {
        return IsPopup;
    }

    @NotNull
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getPassword() {
        return Password;
    }

    @NotNull
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getSelectableGroup() {
        return SelectableGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    @NotNull
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    @NotNull
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    @NotNull
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }
}