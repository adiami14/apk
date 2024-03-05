package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��r\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010(\n��\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b��\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nJ\u0010\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\nJ\u000e\u00104\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0007J\u0006\u00105\u001a\u000200J\u0006\u00106\u001a\u000200J \u00107\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u00109\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0002J\u0010\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0002J(\u0010;\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010=\u001a\u00020\nJ\u0006\u0010>\u001a\u000200J\u000e\u0010?\u001a\u0002002\u0006\u00102\u001a\u00020\u0007J\u000e\u0010?\u001a\u0002002\u0006\u00103\u001a\u00020\nJ \u0010@\u001a\u0002002\u0006\u0010\"\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nH\u0002J\u0010\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\nJ\u0010\u0010C\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0002J\u000e\u0010D\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\nJ\u000e\u0010F\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010HJ\u0006\u0010I\u001a\u00020JJ\u0010\u0010K\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0010\u0010M\u001a\u0002002\u0006\u0010$\u001a\u00020\nH\u0002J\u0018\u0010N\u001a\u0002002\u0006\u0010$\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0002J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0QH\u0002J \u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0002J\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070Q2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u00020\nJ\u000e\u0010V\u001a\u0002002\u0006\u0010W\u001a\u00020\nJ\u0010\u0010X\u001a\u0002002\u0006\u00103\u001a\u00020\nH\u0002J\u0018\u0010Y\u001a\u0002002\u0006\u00103\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0002J\u0010\u0010Z\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0007J\u0010\u0010Z\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u0010\u0010[\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0002J\u0018\u0010\\\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nH\u0002J\u0018\u0010]\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0002J\u0006\u0010^\u001a\u00020\u000eJ\u0018\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\nH\u0002J \u0010b\u001a\u0002002\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0002J\b\u0010c\u001a\u00020\nH\u0002J\b\u0010d\u001a\u000200H\u0002J\u000e\u0010e\u001a\u0002002\u0006\u00102\u001a\u00020\u0007J\u0010\u0010f\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u001a\u0010f\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\n2\b\u0010L\u001a\u0004\u0018\u00010\u0001J\b\u0010g\u001a\u0004\u0018\u00010\u0001J\u0006\u0010h\u001a\u00020\nJ\u0006\u0010i\u001a\u000200J\u0018\u0010j\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010l\u001a\u0004\u0018\u00010\u0001J\"\u0010j\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010\u00012\b\u0010l\u001a\u0004\u0018\u00010\u0001J\u0006\u0010n\u001a\u000200J\u000e\u0010n\u001a\u0002002\u0006\u0010k\u001a\u00020\nJ\u0018\u0010n\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010o\u001a\u0004\u0018\u00010\u0001J,\u0010n\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010l\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010p\u001a\u0002002\b\u0010k\u001a\u0004\u0018\u00010\u0001J\u001a\u0010p\u001a\u0002002\b\u0010k\u001a\u0004\u0018\u00010\u00012\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\b\u0010q\u001a\u00020JH\u0016J\u0012\u0010r\u001a\u0004\u0018\u00010\u00012\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0018\u0010s\u001a\u0002002\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\nH\u0002J\u0010\u0010v\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0018\u0010w\u001a\u0002002\u0006\u00102\u001a\u00020\u00072\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0010\u0010w\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u001a\u0010x\u001a\u0002002\u0006\u00103\u001a\u00020\n2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010y\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\r\u0010z\u001a\u000200H��¢\u0006\u0002\b{J\r\u0010|\u001a\u000200H��¢\u0006\u0002\b}J\u0014\u0010~\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u0014\u00109\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u0013\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\n0Q*\u00020\u001cH\u0002J\u001b\u0010\u0081\u0001\u001a\u000200*\b0\u0082\u0001j\u0003`\u0083\u00012\u0006\u00103\u001a\u00020\nH\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u0014\u0010\"\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0015\u0010\u0085\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u001d\u0010\u0086\u0001\u001a\u000200*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010!\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n��R\u001e\u0010\"\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'X\u0082\u000e¢\u0006\u0004\n\u0002\u0010(R\u000e\u0010)\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010,\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b-\u0010.¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", FirebaseAnalytics.Param.INDEX, "anchorIndex", "beginInsert", "close", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupsAsString", "", "insertAux", "value", "insertGroups", "insertSlots", "group", "keys", "", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "moveGroup", "offset", "moveGroupGapTo", "moveSlotGapTo", "node", "parentAnchorToIndex", "parentIndexToAnchor", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "startData", "key", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/SlotWriter.class */
public final class SlotWriter {
    @NotNull
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    @NotNull
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    @NotNull
    private final IntStack nodeCountStack;
    private int parent;
    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    @NotNull
    private final IntStack startStack;
    @NotNull
    private final SlotTable table;

    public SlotWriter(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i2);
    }

    private final int auxIndex(int[] iArr, int i2) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i2);
        groupInfo = SlotTableKt.groupInfo(iArr, i2);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final int dataAnchorToDataIndex(int i2, int i3, int i4) {
        int i5 = i2;
        if (i2 < 0) {
            i5 = (i4 - i3) + i2 + 1;
        }
        return i5;
    }

    private final int dataIndex(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2));
    }

    private final int dataIndex(int[] iArr, int i2) {
        int dataAnchor;
        int dataAnchorToDataIndex;
        if (i2 >= getCapacity()) {
            dataAnchorToDataIndex = this.slots.length - this.slotsGapLen;
        } else {
            dataAnchor = SlotTableKt.dataAnchor(iArr, i2);
            dataAnchorToDataIndex = dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
        }
        return dataAnchorToDataIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i2) {
        if (i2 >= this.slotsGapStart) {
            i2 += this.slotsGapLen;
        }
        return i2;
    }

    private final int dataIndexToDataAnchor(int i2, int i3, int i4, int i5) {
        int i6 = i2;
        if (i2 > i3) {
            i6 = -(((i5 - i4) - i2) + 1);
        }
        return i6;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        IntRange until;
        List slice;
        IntRange until2;
        List slice2;
        List plus;
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        until = RangesKt___RangesKt.until(0, this.groupGapStart);
        slice = CollectionsKt___CollectionsKt.slice(dataAnchors$default, until);
        until2 = RangesKt___RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5);
        slice2 = CollectionsKt___CollectionsKt.slice(dataAnchors$default, until2);
        plus = CollectionsKt___CollectionsKt.plus((Collection) slice, (Iterable) slice2);
        ArrayList arrayList = new ArrayList(plus.size());
        int size = plus.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) plus.get(i2)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i2, int i3, int i4) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i2, this.groupGapStart);
        while (i4 < i3) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i4), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4));
            int i5 = groupSize + i4;
            fixParentAnchorsFor(i4, i5, i4 + 1);
            i4 = i5;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i2) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        int groupIndexToAddress = groupIndexToAddress(i2);
        sb.append("Group(");
        if (i2 < 10) {
            sb.append(' ');
        }
        if (i2 < 100) {
            sb.append(' ');
        }
        if (i2 < 1000) {
            sb.append(' ');
        }
        sb.append(i2);
        sb.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        sb.append('^');
        parentAnchor = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchorToIndex(parentAnchor));
        sb.append(": key=");
        key = SlotTableKt.key(this.groups, groupIndexToAddress);
        sb.append(key);
        sb.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb.append(nodeCount);
        sb.append(", dataAnchor=");
        dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb.append(dataAnchor);
        sb.append(", parentAnchor=");
        parentAnchor2 = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchor2);
        sb.append(")");
    }

    private final int groupIndexToAddress(int i2) {
        if (i2 >= this.groupGapStart) {
            i2 += this.groupGapLen;
        }
        return i2;
    }

    private final void insertGroups(int i2) {
        if (i2 > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = i5;
            if (i5 < i2) {
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[max * 5];
                i7 = max - i6;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i4 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i4 + i7) * 5, (i5 + i4) * 5, length * 5);
                this.groups = iArr2;
            }
            int i8 = this.currentGroupEnd;
            if (i8 >= i4) {
                this.currentGroupEnd = i8 + i2;
            }
            int i9 = i4 + i2;
            this.groupGapStart = i9;
            this.groupGapLen = i7 - i2;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i6 > 0 ? dataIndex(i3 + i2) : 0, this.slotsGapOwner >= i4 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i10 = i4; i10 < i9; i10++) {
                SlotTableKt.updateDataAnchor(this.groups, i10, dataIndexToDataAnchor);
            }
            int i11 = this.slotsGapOwner;
            if (i11 >= i4) {
                this.slotsGapOwner = i11 + i2;
            }
        }
    }

    private final void insertSlots(int i2, int i3) {
        if (i2 > 0) {
            moveSlotGapTo(this.currentSlot, i3);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            int i6 = i5;
            if (i5 < i2) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i7 = length - i5;
                int max = Math.max(Math.max(length * 2, i7 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i8 = 0; i8 < max; i8++) {
                    objArr2[i8] = null;
                }
                i6 = max - i7;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i4);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i4 + i6, i5 + i4, length);
                this.slots = objArr2;
            }
            int i9 = this.currentSlotEnd;
            if (i9 >= i4) {
                this.currentSlotEnd = i9 + i2;
            }
            this.slotsGapStart = i4 + i2;
            this.slotsGapLen = i6 - i2;
        }
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = keys$default.get(i2);
            ((Number) obj).intValue();
            int i3 = this.groupGapStart;
            if (i2 < i3 || i2 >= i3 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i2++;
        }
        return arrayList;
    }

    private final void moveAnchors(int i2, int i3, int i4) {
        int locationOf;
        int locationOf2;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i2, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(locationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int anchorIndex = anchorIndex(anchor2);
                if (anchorIndex < i2 || anchorIndex >= i4 + i2) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(locationOf);
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Anchor anchor3 = (Anchor) arrayList.get(i5);
            int anchorIndex2 = anchorIndex(anchor3) + (i3 - i2);
            if (anchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor3);
        }
    }

    private final void moveGroupGapTo(int i2) {
        int parentAnchor;
        int i3 = this.groupGapLen;
        int i4 = this.groupGapStart;
        if (i4 != i2) {
            boolean z = true;
            if (!this.anchors.isEmpty()) {
                updateAnchors(i4, i2);
            }
            if (i3 > 0) {
                int[] iArr = this.groups;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i2 < i4) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i6 + i5, i5, i7);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i7, i7 + i6, i5 + i6);
                }
            }
            int i8 = i4;
            if (i2 < i4) {
                i8 = i2 + i3;
            }
            int capacity = getCapacity();
            if (i8 >= capacity) {
                z = false;
            }
            ComposerKt.runtimeCheck(z);
            while (i8 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i8);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i2);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i8, parentIndexToAnchor);
                }
                int i9 = i8 + 1;
                i8 = i9;
                if (i9 == i2) {
                    i8 = i9 + i3;
                }
            }
        }
        this.groupGapStart = i2;
    }

    private final void moveSlotGapTo(int i2, int i3) {
        int dataAnchor;
        int dataAnchor2;
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != i2) {
            Object[] objArr = this.slots;
            if (i2 < i5) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2 + i4, i2, i5);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i5, i5 + i4, i2 + i4);
            }
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i2, i2 + i4);
        }
        int min = Math.min(i3 + 1, getSize$runtime_release());
        if (i6 != min) {
            int length = this.slots.length - i4;
            if (min < i6) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i6);
                int i7 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (!(dataAnchor2 >= 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                    int i8 = groupIndexToAddress + 1;
                    groupIndexToAddress = i8;
                    if (i8 == i7) {
                        groupIndexToAddress = i8 + this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i6);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (!(dataAnchor < 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                    int i9 = groupIndexToAddress3 + 1;
                    groupIndexToAddress3 = i9;
                    if (i9 == this.groupGapStart) {
                        groupIndexToAddress3 = i9 + this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i2;
    }

    private final int nodeIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2);
    }

    private final int parent(int[] iArr, int i2) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i2));
        return parentAnchorToIndex(parentAnchor);
    }

    private final int parentAnchorToIndex(int i2) {
        if (i2 <= -2) {
            i2 = getSize$runtime_release() + i2 + 2;
        }
        return i2;
    }

    private final int parentIndexToAnchor(int i2, int i3) {
        if (i2 >= i3) {
            i2 = -((getSize$runtime_release() - i2) + 2);
        }
        return i2;
    }

    private final boolean removeAnchors(int i2, int i3) {
        int locationOf;
        int i4;
        int i5 = i3 + i2;
        locationOf = SlotTableKt.locationOf(this.anchors, i5, getCapacity() - this.groupGapLen);
        int i6 = locationOf;
        if (locationOf >= this.anchors.size()) {
            i6 = locationOf - 1;
        }
        int i7 = i6 + 1;
        boolean z = false;
        int i8 = 0;
        while (true) {
            i4 = i8;
            if (i6 < 0) {
                break;
            }
            Anchor anchor = this.anchors.get(i6);
            Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int anchorIndex = anchorIndex(anchor2);
            if (anchorIndex < i2) {
                break;
            }
            int i9 = i4;
            if (anchorIndex < i5) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                i9 = i4;
                if (i4 == 0) {
                    i9 = i6 + 1;
                }
                i7 = i6;
            }
            i6--;
            i8 = i9;
        }
        if (i7 < i4) {
            z = true;
        }
        if (z) {
            this.anchors.subList(i7, i4).clear();
        }
        return z;
    }

    private final boolean removeGroups(int i2, int i3) {
        boolean z = false;
        boolean z2 = false;
        if (i3 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i2);
            if (!arrayList.isEmpty()) {
                z2 = removeAnchors(i2, i3);
            }
            this.groupGapStart = i2;
            this.groupGapLen += i3;
            int i4 = this.slotsGapOwner;
            if (i4 > i2) {
                this.slotsGapOwner = i4 - i3;
            }
            int i5 = this.currentGroupEnd;
            z = z2;
            if (i5 >= i2) {
                this.currentGroupEnd = i5 - i3;
                z = z2;
            }
        }
        return z;
    }

    private final void removeSlots(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.slotsGapLen;
            int i6 = i2 + i3;
            moveSlotGapTo(i6, i4);
            this.slotsGapStart = i2;
            this.slotsGapLen = i5 + i3;
            ArraysKt___ArraysJvmKt.fill(this.slots, (Object) null, i2, i6);
            int i7 = this.currentSlotEnd;
            if (i7 >= i2) {
                this.currentSlotEnd = i7 - i3;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i2) {
        int slotAnchor;
        int dataAnchorToDataIndex;
        if (i2 >= getCapacity()) {
            dataAnchorToDataIndex = this.slots.length - this.slotsGapLen;
        } else {
            slotAnchor = SlotTableKt.slotAnchor(iArr, i2);
            dataAnchorToDataIndex = dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
        }
        return dataAnchorToDataIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i2, Object obj, boolean z, Object obj2) {
        int nodeCount;
        int groupSize;
        int i3;
        Object[] objArr = this.insertCount > 0 ? 1 : null;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != null) {
            insertGroups(1);
            int i4 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i4);
            Composer.Companion companion = Composer.Companion;
            int i5 = obj != companion.getEmpty() ? 1 : 0;
            int i6 = (z || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i2, z, i5, i6, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i7 = (z ? 1 : 0) + i5 + i6;
            if (i7 > 0) {
                insertSlots(i7, i4);
                Object[] objArr2 = this.slots;
                int i8 = this.currentSlot;
                int i9 = i8;
                if (z) {
                    objArr2[i8] = obj2;
                    i9 = i8 + 1;
                }
                int i10 = i9;
                if (i5 != 0) {
                    objArr2[i9] = obj;
                    i10 = i9 + 1;
                }
                int i11 = i10;
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i11 = i10 + 1;
                }
                this.currentSlot = i11;
            }
            this.nodeCount = 0;
            i3 = i4 + 1;
            this.parent = i4;
            this.currentGroup = i3;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i12 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i12);
            if (!Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i12;
            this.currentGroup = i12 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i3 = i12 + groupSize;
        }
        this.currentGroupEnd = i3;
    }

    private final void updateAnchors(int i2, int i3) {
        int locationOf;
        int locationOf2;
        int i4;
        int capacity = getCapacity() - this.groupGapLen;
        if (i2 >= i3) {
            locationOf = SlotTableKt.locationOf(this.anchors, i3, capacity);
            for (int i5 = locationOf; i5 < this.anchors.size(); i5++) {
                Anchor anchor = this.anchors.get(i5);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location$runtime_release = anchor2.getLocation$runtime_release();
                if (location$runtime_release < 0) {
                    return;
                }
                anchor2.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        locationOf2 = SlotTableKt.locationOf(this.anchors, i2, capacity);
        for (int i6 = locationOf2; i6 < this.anchors.size(); i6++) {
            Anchor anchor3 = this.anchors.get(i6);
            Intrinsics.checkNotNullExpressionValue(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location$runtime_release2 = anchor4.getLocation$runtime_release();
            if (location$runtime_release2 >= 0 || (i4 = location$runtime_release2 + capacity) >= i3) {
                return;
            }
            anchor4.setLocation$runtime_release(i4);
        }
    }

    private final void updateDataIndex(int[] iArr, int i2, int i3) {
        SlotTableKt.updateDataAnchor(iArr, i2, dataIndexToDataAnchor(i3, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            int r0 = r0.groupIndexToAddress(r1)
            r9 = r0
            r0 = r6
            int[] r0 = r0.groups
            r10 = r0
            r0 = r9
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L22
            r0 = r10
            r1 = r9
            boolean r0 = androidx.compose.runtime.SlotTableKt.access$isNode(r0, r1)
            if (r0 == 0) goto L22
            r0 = 1
            r11 = r0
            goto L25
        L22:
            r0 = 0
            r11 = r0
        L25:
            r0 = r11
            if (r0 == 0) goto L3e
            r0 = r6
            java.lang.Object[] r0 = r0.slots
            r1 = r6
            r2 = r6
            r3 = r6
            int[] r3 = r3.groups
            r4 = r9
            int r2 = r2.nodeIndex(r3, r4)
            int r1 = r1.dataIndexToDataAddress(r2)
            r2 = r8
            r0[r1] = r2
            return
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "Updating the node of a group at "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = " that was not created with as a node group"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            java.lang.Void r0 = androidx.compose.runtime.ComposerKt.composeRuntimeError(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (!(this.insertCount <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        int i3 = this.currentGroup + i2;
        if (i3 >= this.parent && i3 <= this.currentGroupEnd) {
            this.currentGroup = i3;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i3));
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + getParent() + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Anchor anchor(int i2) {
        Anchor anchor;
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i2, getSize$runtime_release());
        if (search < 0) {
            if (i2 > this.groupGapStart) {
                i2 = -(getSize$runtime_release() - i2);
            }
            anchor = new Anchor(i2);
            arrayList.add(-(search + 1), anchor);
        } else {
            Anchor anchor2 = arrayList.get(search);
            Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
            anchor = anchor2;
        }
        return anchor;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location$runtime_release = anchor.getLocation$runtime_release();
        int i2 = location$runtime_release;
        if (location$runtime_release < 0) {
            i2 = location$runtime_release + getSize$runtime_release();
        }
        return i2;
    }

    public final void beginInsert() {
        int i2 = this.insertCount;
        this.insertCount = i2 + 1;
        if (i2 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        moveGroupGapTo(getSize$runtime_release());
        moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean isNode;
        int groupSize;
        int nodeCount;
        int i2;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        boolean z = this.insertCount > 0;
        int i3 = this.currentGroup;
        int i4 = this.currentGroupEnd;
        int i5 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i5);
        int i6 = this.nodeCount;
        int i7 = i3 - i5;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i7);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i6);
            this.nodeCount = this.nodeCountStack.pop() + (isNode ? 1 : i6);
            this.parent = parent(this.groups, i5);
        } else {
            if (!(i3 == i4)) {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i7);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i6);
            int pop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = pop;
            int parent = parent(this.groups, i5);
            int pop2 = this.nodeCountStack.pop();
            this.nodeCount = pop2;
            if (parent == pop) {
                this.nodeCount = pop2 + (isNode ? 0 : i6 - nodeCount);
            } else {
                int i8 = i7 - groupSize;
                int i9 = isNode ? 0 : i6 - nodeCount;
                int i10 = i9;
                int i11 = parent;
                if (i8 == 0) {
                    i2 = i9;
                    if (i9 != 0) {
                        i11 = parent;
                        i10 = i9;
                    }
                    this.nodeCount += i2;
                }
                while (true) {
                    i2 = i10;
                    if (i11 == 0) {
                        break;
                    }
                    i2 = i10;
                    if (i11 == pop) {
                        break;
                    }
                    if (i10 == 0) {
                        i2 = i10;
                        if (i8 == 0) {
                            break;
                        }
                    }
                    int groupIndexToAddress2 = groupIndexToAddress(i11);
                    if (i8 != 0) {
                        groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                        SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i8);
                    }
                    if (i10 != 0) {
                        int[] iArr = this.groups;
                        nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                        SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i10);
                    }
                    isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                    if (isNode2) {
                        i10 = 0;
                    }
                    i11 = parent(this.groups, i11);
                }
                this.nodeCount += i2;
            }
        }
        return i6;
    }

    public final void endInsert() {
        int i2 = this.insertCount;
        if (!(i2 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i3 = i2 - 1;
        this.insertCount = i3;
        if (i3 == 0) {
            if (this.nodeCountStack.getSize() == this.startStack.getSize()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void ensureStarted(int i2) {
        if (!(this.insertCount <= 0)) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
        }
        int i3 = this.parent;
        if (i3 != i2) {
            if (!(i2 >= i3 && i2 < this.currentGroupEnd)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Started group must be a subgroup of the group at ", Integer.valueOf(i3)).toString());
            }
            int i4 = this.currentGroup;
            int i5 = this.currentSlot;
            int i6 = this.currentSlotEnd;
            this.currentGroup = i2;
            startGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
        }
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int i2) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i2);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        return hasAux ? this.slots[auxIndex(this.groups, groupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i2) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i2));
        return key;
    }

    @Nullable
    public final Object groupObjectKey(int i2) {
        boolean hasObjectKey;
        Object obj;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i2);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            obj = objArr[objectKeyIndex];
        } else {
            obj = null;
        }
        return obj;
    }

    public final int groupSize(int i2) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i2));
        return groupSize;
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i2 + groupSize(i2))), this);
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            groupAsString(sb, i2);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void insertAux(@Nullable Object obj) {
        boolean hasAux;
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i2 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i2);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (!(!hasAux)) {
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        insertSlots(1, i2);
        int auxIndex = auxIndex(this.groups, groupIndexToAddress);
        int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
        int i3 = this.currentSlot;
        if (i3 > auxIndex) {
            int i4 = i3 - auxIndex;
            boolean z = false;
            if (i4 < 3) {
                z = true;
            }
            if (!z) {
                throw new IllegalStateException("Moving more than two slot not supported".toString());
            }
            if (i4 > 1) {
                Object[] objArr = this.slots;
                objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, groupIndexToAddress);
        this.slots[dataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        boolean z;
        boolean isNode;
        int i2 = this.currentGroup;
        if (i2 < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i2));
            if (isNode) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int i2) {
        int locationOf;
        int locationOf2;
        List<Anchor> emptyList;
        ArrayList arrayList;
        boolean isNode;
        int nodeCount;
        int i3;
        int locationOf3;
        int parentAnchor;
        Intrinsics.checkNotNullParameter(table, "table");
        if (this.insertCount > 0) {
            if (i2 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList2 = this.anchors;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList2);
                return this.anchors;
            }
            SlotWriter openWriter = table.openWriter();
            try {
                int groupSize = openWriter.groupSize(i2);
                int i4 = i2 + groupSize;
                int dataIndex = openWriter.dataIndex(i2);
                int dataIndex2 = openWriter.dataIndex(i4);
                int i5 = dataIndex2 - dataIndex;
                insertGroups(groupSize);
                insertSlots(i5, getCurrentGroup());
                int[] iArr2 = this.groups;
                int currentGroup = getCurrentGroup();
                ArraysKt___ArraysJvmKt.copyInto(openWriter.groups, iArr2, currentGroup * 5, i2 * 5, i4 * 5);
                Object[] objArr2 = this.slots;
                int i6 = this.currentSlot;
                ArraysKt___ArraysJvmKt.copyInto(openWriter.slots, objArr2, i6, dataIndex, dataIndex2);
                SlotTableKt.updateParentAnchor(iArr2, currentGroup, getParent());
                int i7 = currentGroup - i2;
                int i8 = groupSize + currentGroup;
                int dataIndex3 = i6 - dataIndex(iArr2, currentGroup);
                int i9 = this.slotsGapOwner;
                int i10 = this.slotsGapLen;
                int length = objArr2.length;
                int i11 = currentGroup;
                while (i11 < i8) {
                    if (i11 != currentGroup) {
                        parentAnchor = SlotTableKt.parentAnchor(iArr2, i11);
                        SlotTableKt.updateParentAnchor(iArr2, i11, parentAnchor + i7);
                    }
                    SlotTableKt.updateDataAnchor(iArr2, i11, dataIndexToDataAnchor(dataIndex(iArr2, i11) + dataIndex3, i9 < i11 ? 0 : this.slotsGapStart, i10, length));
                    int i12 = i9;
                    if (i11 == i9) {
                        i12 = i9 + 1;
                    }
                    i11++;
                    i9 = i12;
                }
                this.slotsGapOwner = i9;
                locationOf = SlotTableKt.locationOf(table.getAnchors$runtime_release(), i2, table.getGroupsSize());
                locationOf2 = SlotTableKt.locationOf(table.getAnchors$runtime_release(), i4, table.getGroupsSize());
                if (locationOf < locationOf2) {
                    ArrayList<Anchor> anchors$runtime_release = table.getAnchors$runtime_release();
                    ArrayList arrayList3 = new ArrayList(locationOf2 - locationOf);
                    for (int i13 = locationOf; i13 < locationOf2; i13++) {
                        Anchor anchor = anchors$runtime_release.get(i13);
                        Intrinsics.checkNotNullExpressionValue(anchor, "sourceAnchors[anchorIndex]");
                        Anchor anchor2 = anchor;
                        anchor2.setLocation$runtime_release(anchor2.getLocation$runtime_release() + i7);
                        arrayList3.add(anchor2);
                    }
                    locationOf3 = SlotTableKt.locationOf(this.anchors, getCurrentGroup(), getSize$runtime_release());
                    getTable$runtime_release().getAnchors$runtime_release().addAll(locationOf3, arrayList3);
                    anchors$runtime_release.subList(locationOf, locationOf2).clear();
                    arrayList = arrayList3;
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    arrayList = emptyList;
                }
                int parent = openWriter.parent(i2);
                if (parent >= 0) {
                    openWriter.startGroup();
                    openWriter.advanceBy(parent - openWriter.getCurrentGroup());
                    openWriter.startGroup();
                }
                openWriter.advanceBy(i2 - openWriter.getCurrentGroup());
                boolean removeGroup = openWriter.removeGroup();
                if (parent >= 0) {
                    openWriter.skipToGroupEnd();
                    openWriter.endGroup();
                    openWriter.skipToGroupEnd();
                    openWriter.endGroup();
                }
                if (!(!removeGroup)) {
                    ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                    throw new KotlinNothingValueException();
                }
                int i14 = this.nodeCount;
                isNode = SlotTableKt.isNode(iArr2, currentGroup);
                if (isNode) {
                    i3 = 1;
                } else {
                    nodeCount = SlotTableKt.nodeCount(iArr2, currentGroup);
                    i3 = nodeCount;
                }
                this.nodeCount = i14 + i3;
                this.currentGroup = i8;
                this.currentSlot = i6 + i5;
                openWriter.close();
                return arrayList;
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void moveGroup(int i2) {
        int groupSize;
        int groupSize2;
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.currentGroup;
        int i4 = this.parent;
        int i5 = this.currentGroupEnd;
        int i6 = i3;
        while (true) {
            int i7 = i6;
            if (i2 <= 0) {
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i7));
                int i8 = this.currentSlot;
                int dataIndex = dataIndex(this.groups, groupIndexToAddress(i7));
                int i9 = i7 + groupSize;
                int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i9));
                int i10 = dataIndex2 - dataIndex;
                insertSlots(i10, Math.max(this.currentGroup - 1, 0));
                insertGroups(groupSize);
                int[] iArr = this.groups;
                int groupIndexToAddress = groupIndexToAddress(i9) * 5;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, groupIndexToAddress(i3) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
                if (i10 > 0) {
                    Object[] objArr = this.slots;
                    ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i8, dataIndexToDataAddress(dataIndex + i10), dataIndexToDataAddress(dataIndex2 + i10));
                }
                int i11 = dataIndex + i10;
                int i12 = i11 - i8;
                int i13 = this.slotsGapStart;
                int i14 = this.slotsGapLen;
                int length = this.slots.length;
                int i15 = this.slotsGapOwner;
                for (int i16 = i3; i16 < i3 + groupSize; i16++) {
                    int groupIndexToAddress2 = groupIndexToAddress(i16);
                    updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i12, i15 < groupIndexToAddress2 ? 0 : i13, i14, length));
                }
                moveAnchors(i9, i3, groupSize);
                if (!(!removeGroups(i9, groupSize))) {
                    ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                    throw new KotlinNothingValueException();
                }
                fixParentAnchorsFor(i4, this.currentGroupEnd, i3);
                if (i10 > 0) {
                    removeSlots(i11, i10, i9 - 1);
                    return;
                }
                return;
            }
            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i7));
            int i17 = i7 + groupSize2;
            if (!(i17 <= i5)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
            i2--;
            i6 = i17;
        }
    }

    @Nullable
    public final Object node(int i2) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i2);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        return isNode ? this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] : null;
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    public final int parent(int i2) {
        return parent(this.groups, i2);
    }

    public final int parent(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return anchor.getValid() ? parent(this.groups, anchorIndex(anchor)) : -1;
    }

    public final boolean removeGroup() {
        if (this.insertCount == 0) {
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int skipGroup = skipGroup();
            boolean removeGroups = removeGroups(i2, this.currentGroup - i2);
            removeSlots(i3, this.currentSlot - i3, i2 - 1);
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final void seek(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    @Nullable
    public final Object set(int i2, @Nullable Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        boolean z = true;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
        int i3 = slotIndex + i2;
        if (i3 < slotIndex || i3 >= dataIndex) {
            z = false;
        }
        if (z) {
            int dataIndexToDataAddress = dataIndexToDataAddress(i3);
            Object[] objArr = this.slots;
            Object obj2 = objArr[dataIndexToDataAddress];
            objArr[dataIndexToDataAddress] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i2 + " for group " + getCurrentGroup()).toString());
        throw new KotlinNothingValueException();
    }

    public final void set(@Nullable Object obj) {
        int i2 = this.currentSlot;
        if (i2 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i2 - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i2 = this.currentSlot;
        this.currentSlot = i2 + 1;
        return objArr[dataIndexToDataAddress(i2)];
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int i2;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i3 = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i4 = i3 + groupSize;
        this.currentGroup = i4;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i4));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            i2 = 1;
        } else {
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
            i2 = nodeCount;
        }
        return i2;
    }

    public final void skipToGroupEnd() {
        int i2 = this.currentGroupEnd;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final void startData(int i2, @Nullable Object obj) {
        startGroup(i2, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startData(int i2, @Nullable Object obj, @Nullable Object obj2) {
        startGroup(i2, obj, false, obj2);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Key must be supplied when inserting".toString());
        }
        Composer.Companion companion = Composer.Companion;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i2) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i2, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i2, @Nullable Object obj) {
        startGroup(i2, obj, false, Composer.Companion.getEmpty());
    }

    public final void startNode(@Nullable Object obj) {
        startGroup(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, obj, true, Composer.Companion.getEmpty());
    }

    public final void startNode(@Nullable Object obj, @Nullable Object obj2) {
        startGroup(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, obj, true, obj2);
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    @Nullable
    public final Object update(@Nullable Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(@Nullable Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    public final void updateNode(@Nullable Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(@Nullable Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        int i2 = this.slotsGapOwner;
        int length = this.slots.length;
        int i3 = this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i5);
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (!(dataIndex >= i4)) {
                throw new IllegalStateException(("Data index out of order at " + i5 + ", previous = " + i4 + ", current = " + dataIndex).toString());
            }
            if (!(dataIndex <= length - i3)) {
                throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i5).toString());
            }
            boolean z2 = z;
            if (dataAnchor < 0) {
                z2 = z;
                if (z) {
                    continue;
                } else {
                    if (!(i2 == i5)) {
                        throw new IllegalStateException(("Expected the slot gap owner to be " + i2 + " found gap at " + i5).toString());
                    }
                    z2 = true;
                }
            }
            i5++;
            i4 = dataIndex;
            z = z2;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        int parentAnchor2;
        int i2 = this.groupGapStart;
        int i3 = this.groupGapLen;
        int capacity = getCapacity();
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                for (int i5 = i3 + i2; i5 < capacity; i5++) {
                    parentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
                    if (parentAnchorToIndex(parentAnchor) < i2) {
                        if (!(parentAnchor > -2)) {
                            throw new IllegalStateException(Intrinsics.stringPlus("Expected a start relative anchor at ", Integer.valueOf(i5)).toString());
                        }
                    } else {
                        if (!(parentAnchor <= -2)) {
                            throw new IllegalStateException(Intrinsics.stringPlus("Expected an end relative anchor at ", Integer.valueOf(i5)).toString());
                        }
                    }
                }
                return;
            }
            parentAnchor2 = SlotTableKt.parentAnchor(this.groups, i4);
            if (!(parentAnchor2 > -2)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Expected a start relative anchor at ", Integer.valueOf(i4)).toString());
            }
            i4++;
        }
    }
}
