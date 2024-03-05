package androidx.compose.ui.platform.accessibility;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��<\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH��\u001a\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH��\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0007H��\u001a\u0014\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u0002H\u0002\u001a\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002\"\u0018\u0010��\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b��\u0010\u0003¨\u0006\u0016"}, d2 = {"isLazyCollection", "", "Landroidx/compose/ui/semantics/CollectionInfo;", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "calculateIfHorizontallyStacked", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/ui/semantics/SemanticsNode;", "setCollectionInfo", "", "node", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "setCollectionItemInfo", "hasCollectionInfo", "toAccessibilityCollectionInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionItemInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/accessibility/CollectionInfoKt.class */
public final class CollectionInfoKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List emptyList;
        ArrayList arrayList;
        Object first;
        int lastIndex;
        Offset offset;
        Object first2;
        int lastIndex2;
        boolean z = true;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            ArrayList arrayList2 = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
            int i2 = 0;
            while (true) {
                arrayList = arrayList2;
                if (i2 >= lastIndex2) {
                    break;
                }
                i2++;
                SemanticsNode semanticsNode2 = list.get(i2);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayList2.add(Offset.m2156boximpl(OffsetKt.Offset(Math.abs(Offset.m2167getXimpl(semanticsNode4.getBoundsInRoot().m2198getCenterF1C5BW0()) - Offset.m2167getXimpl(semanticsNode3.getBoundsInRoot().m2198getCenterF1C5BW0())), Math.abs(Offset.m2168getYimpl(semanticsNode4.getBoundsInRoot().m2198getCenterF1C5BW0()) - Offset.m2168getYimpl(semanticsNode3.getBoundsInRoot().m2198getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            arrayList = emptyList;
        }
        if (arrayList.size() == 1) {
            first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList);
            offset = first2;
        } else if (arrayList.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        } else {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList);
            Object obj = first;
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            offset = obj;
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    offset = Offset.m2156boximpl(Offset.m2172plusMKHz9U(((Offset) obj).m2177unboximpl(), ((Offset) arrayList.get(i3)).m2177unboximpl()));
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                    obj = offset;
                }
            }
        }
        long m2177unboximpl = ((Offset) offset).m2177unboximpl();
        if (Offset.m2158component2impl(m2177unboximpl) >= Offset.m2157component1impl(m2177unboximpl)) {
            z = false;
        }
        return z;
    }

    public static final boolean hasCollectionInfo(@NotNull SemanticsNode semanticsNode) {
        Intrinsics.checkNotNullParameter(semanticsNode, "<this>");
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(@NotNull SemanticsNode node, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        SemanticsConfiguration config = node.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            info.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(node.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode = replacedChildren$ui_release.get(i2);
                if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            info.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(calculateIfHorizontallyStacked ? 1 : arrayList.size(), calculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsNode node, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        SemanticsConfiguration config = node.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            info.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, node));
        }
        SemanticsNode parent = node.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && node.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode = replacedChildren$ui_release.get(i2);
                if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode);
                }
            }
            if (!arrayList.isEmpty()) {
                boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) arrayList.get(i3);
                    if (semanticsNode2.getId() == node.getId()) {
                        AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(calculateIfHorizontallyStacked ? 0 : i3, 1, calculateIfHorizontallyStacked ? i3 : 0, 1, false, ((Boolean) semanticsNode2.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfoKt$setCollectionItemInfo$2$itemInfo$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Boolean invoke() {
                                return Boolean.FALSE;
                            }
                        })).booleanValue());
                        if (obtain != null) {
                            info.setCollectionItemInfo(obtain);
                        }
                    }
                }
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfoKt$toAccessibilityCollectionItemInfo$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}
